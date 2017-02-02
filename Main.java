/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;
import java.util.Scanner;
/**
 *
 * @author Haran
 */
public class GIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        String operation;
        int answer;
        Scanner scan = new Scanner(System.in); // 'to make eacce comment'
        System.out.println("welcome to my calculator");
        System.out.println("Enter first number :");
        a = scan.nextInt();
        System.out.println("Enter Second number :");
        b = scan.nextInt();
        System.out.println("Enter operation :");
        operation = scan.next();
        
        if ("+".equals(operation)){
            answer = add(a,b);
            System.out.println("Answer is " + answer);
        }else if("-".equals(operation)){
	    answer = subtract(a,b);
            System.out.println(answer);
        }
        
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b){
	return a-b;
    }
}
