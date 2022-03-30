package com.mysite.hello;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class HelloSpringApplicationTests {
	
	@Autowired
	private StudentController studentController;
	
	@Autowired
	private TestRestTemplate template;
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private StudentRepository studentRepository;
	
	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() {
		assertThat(studentController).isNotNull();
	}
	
	/*
	@Test
	void testHelloMessage() {
		assertThat(this.template.getForObject("http://localhost:8090/", String.class).contains("hello"));
	}*/
	
	@Test
	void testHelloUsingMock() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("hello")));
	}
	
	@Test
	void testGetStudent() throws Exception {
		Student st = new Student( 2L,"Tommy");
		Mockito.doReturn(Optional.of(st)).when(studentRepository).findById(2L);
		
		final String resultResponse = objectMapper.writeValueAsString(st);
		
		System.out.print(st);
		
		this.mockMvc.perform(get("http://localhost:8090/students/2"))
		.andExpect(status().isOk())
		.andExpect(content().json(resultResponse));
		
		verify(studentRepository).findById(2L);
		
	}

}
