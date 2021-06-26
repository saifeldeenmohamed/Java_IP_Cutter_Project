package ipPkg;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SaiF El-deen
 */
public class MainClass {
    
    public static void main(String[] args){
        
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter your IP:");
        String ipInput = scan.nextLine();
//        String ipInput = "125.36.12.1";
        IpCutter ipcut = new IpCutter(ipInput);
        
        System.out.println("The output:\n"+ipcut.doCutting());
        

        
    }
}
