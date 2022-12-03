/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tapshiriqlar;

/**
 *
 * @author Umman
 */
public class User1
{

    public static void foo() {
        System.out.println("foo");

    }

    static {//static block classa aiddir
        System.out.println("static block");
    }

    { // nonstatic block, instance block objecte aiddir
        System.out.println(" nonstatic block, instance block");
    }

    public User1() {
        System.out.println("User1");
    }

    public User1(int a) {
        System.out.println("User1 a");
    }
}
