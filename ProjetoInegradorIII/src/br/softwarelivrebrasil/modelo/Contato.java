package br.softwarelivrebrasil.modelo;

import java.util.Objects;

/**
 * Classe para objetos do tipo Contato.
 * @author Grupo Software Livre Brasil
 * @version 1.0.0
 */
public class Contato {
 
    private String idContato;
    private String email;
    private String telCelular;
    private String telFixo;

     /**
     * Instancia um objeto Contato.
     * @param email o email de contato
     * @param telCelular o número de telefone celular
     */
    public Contato(String email, String telCelular) {
        this.email = email;
        this.telCelular = telCelular;
    }

     /**
     * Instancia um objeto Contato.
     * @param email o email de contato
     * @param telCelular o número de telefone celular
     * @param telFixo o número de telefone fixo
     */
    public Contato(String email, String telCelular, String telFixo) {
        this.email = email;
        this.telCelular = telCelular;
        this.telFixo = telFixo;
    } 
    
    /**
     * @return o id do contato
     */
    public String getIdContato() {
        return idContato;
    }

    /**
     * @param idContato o id do contato
     */
    public void setIdContato(String idContato) {
        this.idContato = idContato;
    }
    
    /**
     * @return o email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email o email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return o número de telefone celular
     */
    public String getTelCelular() {
        return telCelular;
    }

    /**
     * @param telCelular o número de telefone celular
     */
    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    /**
     * @return o número de telefone fixo
     */
    public String getTelFixo() {
        return telFixo;
    }

    /**
     * @param telFixo o número de telefone fixo
     */
    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    @Override
    public String toString() {
        return "\n email: " + email + "\n telCelular: " + telCelular + "\n telFixo: " + telFixo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.email);
        hash = 17 * hash + Objects.hashCode(this.telCelular);
        hash = 17 * hash + Objects.hashCode(this.telFixo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contato oor = (Contato) obj;
        if (!Objects.equals(this.email, oor.email)) {
            return false;
        }
        if (!Objects.equals(this.telCelular, oor.telCelular)) {
            return false;
        }
        if (!Objects.equals(this.telFixo, oor.telFixo)) {
            return false;
        }
        return true;
    }
    
}
