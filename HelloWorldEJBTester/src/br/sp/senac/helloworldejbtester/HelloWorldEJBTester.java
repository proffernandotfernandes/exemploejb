/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sp.senac.helloworldejbtester;

import br.sp.senac.ejb.HelloWorldEJBRemote;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author ftfer
 */
public class HelloWorldEJBTester {
    public static void main(String[] args){
    
        try {
            
            InitialContext ctx = new InitialContext();
            HelloWorldEJBRemote ejb =(HelloWorldEJBRemote) ctx.lookup("br.sp.senac.ejb.HelloWorldEJBRemote");
            System.out.println(ejb.ola());
            
            
        } catch (NamingException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    
    }
}
