/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursiveasal;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class RecursiveAsal {

    /**
     * @param args the command line arguments
     */

    
    
    static boolean asal(int sayi,int i){
        if(sayi<=2){
            return (sayi == 2) ? true : false;
        }
        if(sayi%i==0){
            return false;
        }
        if (i * i > sayi){
            return true;
        }
        return asal(sayi, i + 1);
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi Giriniz:");
        int sayi=input.nextInt();
        
        if(asal(sayi, 2)){
            System.out.println(sayi+" Sayisi Asal Sayidir");
        }else{
            System.out.println(sayi+" Sayisi Asal Sayi Degildir");
        }
    }
    
}
