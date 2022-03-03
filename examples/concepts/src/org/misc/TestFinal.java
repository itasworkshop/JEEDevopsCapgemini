package org.misc;

//final with class --> means no inheritance -- no child
//final class User{
class User{

    final int aadharNo = 111;

    final void printMe(){
        //aadharNo = 222;
        System.out.println("from final method.");
    }

}
public class TestFinal extends User {

    //can not over ride
    //void printMe(){

    //}
}
