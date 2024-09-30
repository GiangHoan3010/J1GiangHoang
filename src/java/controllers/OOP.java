/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.Scanner;
import models.Coder;

/**
 *
 * @author Administrator
 */
public class OOP {

    public static void main(String[] args) {
        Coder coder = new Coder();
        Scanner sc = new Scanner(System.in);
        System.out.println("ten nd: ");
        String name = sc.next();
        coder.setName(name);
        
        System.out.println("do tuoi: ");
        int tuoi = sc.nextInt();
        coder.setAge(tuoi);
        
        System.out.println("sdt: ");
        String sdt = sc.next();
        coder.setPhone(sdt);
        
        System.out.println("ngon ngu: ");
        String Programming_Language = sc.next();
        coder.setProgramming_Language(Programming_Language);
        
        System.out.println("ngon ngu: " + coder.getProgramming_Language());
        System.out.println("ten: " + coder.getName());
        System.out.println("tuoi: " + coder.getAge());
        System.out.println("sdt: " + coder.getPhone());
    }
    
}

  
