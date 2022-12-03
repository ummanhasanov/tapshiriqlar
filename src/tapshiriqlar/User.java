/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tapshiriqlar;

/**
 *
 * @author Umman
 */
public class User extends Person // initialize, (inheritance == toreme, irsiyyet)
{

    public double maash;// states

    public void foo() {// behavuior

    }
    
    public User(){
//        super();//extend olunan classin constructorunu cagirir (default cagirilan keyword)
        this(4);
    }
    
    public User(int a){
        this(5,7);
    }
    
    public User (int a, int b){
        super("");
    }
}
