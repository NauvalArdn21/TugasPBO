/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    
   
    


 public static void main(String[] args){
Scanner myObj =new Scanner (System.in);
String A = myObj.nextLine();
String B = myObj.nextLine();

String Depan = A.substring(0,1).toUpperCase()+ A.substring(1);
String belakang =B.substring(0,1).toUpperCase()+ B.substring(1);

if (A.charAt(0)<B.charAt(0)){
System.out.println("no");
}else{
 System.out.println("yes");
 }
    
System.out.println(A.length()+B.length());
System.out.println(Depan);
System.out.println(belakang);











 
 }

}

    
    
    

