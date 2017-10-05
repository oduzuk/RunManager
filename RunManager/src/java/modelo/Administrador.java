/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Nery
 */
public class Administrador {
 
    private String email;
    private String senha;
    private String usuarioCPF;

    public Administrador(String email, String senha, String usuarioCPF) {
        this.email = email;
        this.senha = senha;
        this.usuarioCPF = usuarioCPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuarioCPF() {
        return usuarioCPF;
    }

    public void setUsuarioCPF(String usuarioCPF) {
        this.usuarioCPF = usuarioCPF;
    }

    

    
    
}
