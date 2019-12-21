/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
package helloworld;

/**
 *
 * @author kpsingh
 */
public class ifElse {
    public static void main(String []args){
        int mark,passingMark;
        passingMark=40;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter marks");
        mark=input.nextInt();
        if(mark>=passingMark){
            System.out.println("passed");
        }
        else{
                System.out.println("fail");
                    
                    }
        }
    }
    
}
