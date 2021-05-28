
package fibonacci_series;

import java.util.Scanner;

public class Fibonacci {
   
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
    
        int n1 = 0, n2 = 1 ; // first 2 numbers of fibonacci series
        int n3;
         
         // input
        System.out.println("Enter the number of digits you want in the series : ");
        int num = s.nextInt();
        
//      if number enterd by user is 0 or negative
        if(num < 0 || num == 0){
            System.out.println("PLEASE ENTER A POSITIVE OR NON-ZERO NUMBER !!");
        }
//      if only first digit is to be printed
        else if(num == 1){
            System.out.print("Fibocanni series : " + n1 + " ");
        }
//      if two digit is to be printed
        else if(num == 2){
            System.out.print("Fibocanni series : " + n1 + " " + n2 + " ");
        }
//      more than 2 digits
        else{
            System.out.print("Fibocanni series : " + n1 + " " + n2); // printing first 2 numbers
            
            int e = num - 2 ; // subtracting first 2 digits from total
            
            for (int i = 0; i < e; i++){
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
            System.out.print(" "); // for last space
        }
    }
}
