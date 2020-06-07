package br.softwarelivrebrasil.modelo;

import java.util.Objects;

/**
 * Classe para objetos do tipo Software.
 * @author Grupo Software Livre Brasil
 * @version 1.0.0
 */
public class Software {
    
    private String idSoftware;
    private String titulo;
    private String versao;
    private String categoria;
    private String descricao;
    private String origem;

    /**
     * Instancia um objeto Software.
     * @param idSoftware o id do software
     * @param titulo o título do software
     * @param versao a versão do software
     * @param categoria a categoria do software
     * @param descricao a descrição do software
     * @param origem a origem do software
     */
    public Software(String idSoftware, String titulo, String versao, String categoria, String descricao, String origem) {
        this.idSoftware = idSoftware;
        this.titulo = titulo;
        this.versao = versao;
        this.categoria = categoria;
        this.descricao = descricao;
        this.origem = origem;
    }

    /**
     * @return o id do software
     */
    public String getIdSoftware() {
        return idSoftware;
    }

    /**
     * @param idSoftware o id do software
     */
    public void setIdSoftware(String idSoftware) {
        this.idSoftware = idSoftware;
    }

    /**
     * @return o titulo do software
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo o titulo do software
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return a versao do software
     */
    public String getVersao() {
        return versao;
    }

    /**
     * @param versao a versao do software
     */
    public void setVersao(String versao) {
        this.versao = versao;
    }

    /**
     * @return a categoria do software
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria a categoria do software
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return a descricao do software
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao a descricao do software
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return a origem do software
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * @param origem a origem do software
     */
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public String toString() {
        return "\n idSoftware: " + idSoftware + "\n titulo: " + titulo + "\n versao: " + versao + "\n categoria: " + categoria + "\n descricao: " + descricao + "\n origem: " + origem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.idSoftware);
        hash = 29 * hash + Objects.hashCode(this.titulo);
        hash = 29 * hash + Objects.hashCode(this.versao);
        hash = 29 * hash + Objects.hashCode(this.categoria);
        hash = 29 * hash + Objects.hashCode(this.descricao);
        hash = 29 * hash + Objects.hashCode(this.origem);
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
        final Software oor = (Software) obj;
        if (!Objects.equals(this.idSoftware, oor.idSoftware)) {
            return false;
        }
        if (!Objects.equals(this.titulo, oor.titulo)) {
            return false;
        }
        if (!Objects.equals(this.versao, oor.versao)) {
            return false;
        }
        if (!Objects.equals(this.categoria, oor.categoria)) {
            return false;
        }
        if (!Objects.equals(this.descricao, oor.descricao)) {
            return false;
        }
        if (!Objects.equals(this.origem, oor.origem)) {
            return false;
        }
        return true;
    }
    
    
}
