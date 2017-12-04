/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author cvallejos
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        String drow="";
        int length;
        System.out.println("Enter a word to check");
        word = sc.nextLine();
        length = word.length();
        for (int i=length-1; i>=0;i--){
            drow += word.charAt(i);
            System.out.println(drow);
        }
        if(word.equals(drow)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }    
}

