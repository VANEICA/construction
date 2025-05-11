/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author atuva
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
   static void validate(int age) throws JavaApplication5{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String arg[]){
    try{validate(13);
    }
    catch(Exception m){System.out.println("Exception occured: "+m);}
    System.out.println("rest of the code..........");
    }
}
