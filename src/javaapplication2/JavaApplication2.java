/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Moshe
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1
            Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String strRev="";
          for(int i=0 ; i < str.length();i++){
        strRev+=str.charAt(str.length()-1-i);
       }
        System.out.println(strRev);

          //2 
          
          /* String str = "BAR ILAN";
           int key = 3;
           String ans = "";
           final int ALPHABET_SIZE = 26;
           for (int i = 0; i < str.length(); i++) {
               char c = str.charAt(i);
               if (c >= 'A' && c <= 'Z') {
                   int num = c - 'A';
                   num = (num + key) % ALPHABET_SIZE;
                   c = (char) (num + 'A');    
               }
               ans = ans + c;
           }
           System.out.println(ans);*/
          
          
          
          
          
          //3
          
         /*int [][] a = {{1,2,3,4},{2,5,1},{7,7,7,7},{1}};
         int [][] b;
         b = new int[a.length][];
         for(int i=0 ; i < a.length ; i++){
             b[i]=new int [a[i].length];
             for(int j =0; j<a[i].length; j++){
                 b[i][j] = a[i][j];
                 
                         
             }
     
             
             
         }*/
         
             
             
        
    
      

     
         
         
        
    }        
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
          
          
          
          
          
          
           





 }
               
