/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cuentabancaria;

/**
 *
 * @author StudioOne
 */
public class CuentaBancaria {

    public static void main(String[] args) {
  
        Cuenta cuenta1 = new Cuenta("app moviles");
        Cuenta cuenta2= new Cuenta ("Curso de la tarde");
        
        // ingresar dinero en las cuentas
       
        cuenta1.ingresar(400);
         cuenta2.ingresar(700);
         
         // retirar dinero
         cuenta1.retirar(300);
         cuenta2.retirar(500);
         // imprimir cuentas
         
         System.out.println(cuenta1);
          System.out.println(cuenta2);
    }
         
            
    
}
