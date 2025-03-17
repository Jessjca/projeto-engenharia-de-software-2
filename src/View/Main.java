/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Usuario;

/**
 *
 * @author Jessica
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        String nome = "Jessica";
        
        System.out.println(nome);
        
        Usuario usuario = new Usuario(2, "admin", "123");
        System.out.println(usuario.getNome());
    }
    
    
}
