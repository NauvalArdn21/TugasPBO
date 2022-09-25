/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg2;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input=new Scanner(System.in);
        long bil;
        System.out.println("PROGRAM MENENTUKAN BILANGAN INTEGER ,SHORT,LONG ");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Bilangan = ");
        bil=input.nextLong();
        
        if (bil<127 && bil>-128){
            System.out.println(" "+bil+" termasuk bilangan byte");
        } if(bil<= Short.MAX_VALUE && bil>= Short.MIN_VALUE){
             System.out.println(" "+bil+" termasuk bilangan short"); 
        } if(bil<= Integer.MAX_VALUE && bil>= Integer.MIN_VALUE){
             System.out.println(" "+bil+" termasuk bilangan integer");
        }if(bil<= Long.MAX_VALUE && bil>= Long.MIN_VALUE){
             System.out.println(" "+bil+" termasuk bilangan long");
        }else{
             System.out.println(" error");
        }
    
}
}
