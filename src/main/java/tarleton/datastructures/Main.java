/*
 *  In method main, read integers until 0 and push them on the stack. 
 *  When you read 0, pop the numbers from the stack and print them. 
 */
package tarleton.datastructures;

import java.util.Scanner;

/**
 *
 * @author Joe Meier
 */
public class Main {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack size: ");
        String size = sc.nextLine();
        Stack s1 = new Stack(Integer.valueOf(size));
        while(true){
            System.out.println("Enter value: ");
            String input = sc.nextLine();
            int n = Integer.valueOf(input);
            if(n == 0){break;}            
            else{s1.push(n);}
        }
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }           
    }        
}
