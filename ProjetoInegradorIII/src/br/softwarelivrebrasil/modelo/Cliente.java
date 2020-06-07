package br.softwarelivrebrasil.modelo;

import java.util.Date;
import java.util.Objects;

/**
 * Classe para objetos do tipo Cliente.
 * @author Grupo Software Livre Brasil
 * @version 1.0.0
 */
public class Cliente {
    
    private String idCliente;
    private String nome;
    private String cpf;
    private String razaoSocial;
    private String nomeContatoResponsavel;
    private String cnpj;
    private String senha;
    private Contato contato;
    private Endereco endereco;
    private Date dataCadastro;
 
    /**
     * Instancia um objeto Cliente do tipo pessoa física.
     * @param idCliente o id do cliente, cujo valor deve ser único dentre todos os objeto do tipo Cliente
     * @param nome o nome do cliente, enquanto pessoa física
     * @param cpf o cpf do cliente
     * @param senha a senha do cliente
     * @param contato as informações de contato do cliente
     * @param endereco o endereço do cliente
     * @param dataCadastro a data de cadastro do cliente
     */
    public Cliente(String idCliente, String nome, String cpf, String senha, Contato contato, Endereco endereco, Date dataCadastro) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.contato = contato;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    /**
     * Instancia um objeto Cliente do tipo pessoa jurídica.
     * @param idCliente o id do cliente, cujo valor deve ser único dentre todos os objeto do tipo Cliente
     * @param razaoSocial  a razão social do cliente
     * @param cnpj o cnpj do cliente
     * @param nomeContatoResponsavel o nome da pessoa responsável pela empresa, para contato
     * @param senha a senha do cliente
     * @param contato as informações de contato do cliente
     * @param endereco o endereço do cliente
     * @param dataCadastro a data de cadastro do cliente
     */
    public Cliente(String idCliente, String razaoSocial, String nomeContatoResponsavel, String cnpj, String senha, Contato contato, Endereco endereco, Date dataCadastro) {
        this.idCliente = idCliente;
        this.razaoSocial = razaoSocial;
        this.nomeContatoResponsavel = nomeContatoResponsavel;
        this.cnpj = cnpj;
        this.senha = senha;
        this.contato = contato;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return o id do cliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente o id do cliente
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return o nome do cliente, enquanto pessoa física
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome o nome do cliente, enquanto pessoa física
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return o cpf do cliente
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf o cpf do cliente
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return a razão social do cliente
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial a razão social do cliente
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return o nome da pessoa responsável pela empresa, para contato
     */
    public String getNomeContatoResponsavel() {
        return nomeContatoResponsavel;
    }

    /**
     * @param nomeContatoResponsavel o nome da pessoa responsável pela empresa, para contato
     */
    public void setNomeContatoResponsavel(String nomeContatoResponsavel) {
        this.nomeContatoResponsavel = nomeContatoResponsavel;
    }

    /**
     * @return o cnpj do cliente
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj o cnpj do cliente
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return a senha do cliente
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha a senha do cliente
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return as informações de contato do cliente
     */
    public Contato getContato() {
        return contato;
    }

    /**
     * @param contato as informações de contato do cliente
     */
    public void setContato(Contato contato) {
        this.contato = contato;
    }

    /**
     * @return o endereço do cliente
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco o endereço do cliente
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return a data de cadastro do cliente
     */
    public Date getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro a data de cadastro do cliente
     */
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "idCliente: " + idCliente + "\nnome: " + nome + "\ncpf: " + cpf + "\nrazaoSocial: " + razaoSocial + "\nnomeContatoResponsavel: " + nomeContatoResponsavel + "\ncnpj: " + cnpj + "\nsenha: " + senha + "\ncontato: " + contato + "\nendereco: " + endereco + "\ndataCadastro: " + dataCadastro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.idCliente);
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.cpf);
        hash = 83 * hash + Objects.hashCode(this.razaoSocial);
        hash = 83 * hash + Objects.hashCode(this.nomeContatoResponsavel);
        hash = 83 * hash + Objects.hashCode(this.cnpj);
        hash = 83 * hash + Objects.hashCode(this.senha);
        hash = 83 * hash + Objects.hashCode(this.contato);
        hash = 83 * hash + Objects.hashCode(this.endereco);
        hash = 83 * hash + Objects.hashCode(this.dataCadastro);
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
        final Cliente oor = (Cliente) obj;
        if (!Objects.equals(this.idCliente, oor.idCliente)) {
            return false;
        }
        return true;
    }
        
}
