/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.sp.senac.ejb;

import jakarta.ejb.Stateless;

@Stateless
public class HelloWorldEJB implements HelloWorldEJBRemote {

     @Override
     public String ola(){
         return "Olá mundo com EJB!";
     }
}
