package br.softwarelivrebrasil.modelo;

import java.util.Date;
import java.util.Objects;

/**
 * Classe para objetos do tipo Endereco.
 * @author Grupo Software Livre Brasil
 * @version 1.0.0
 */
public class Endereco {
    
    private String idEndereco;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
    private Date dataCadastroEndereco;
    private Date dataValidadeEndereco;

    /**
     * Instancia um objeto Endereco.
     * @param logradouro o logradouro
     * @param numero o número
     * @param bairro o bairro
     * @param cidade a cidade
     * @param estado o estado
     * @param dataCadastroEndereco a data de cadastro do endereço
     * @param dataValidadeEndereco a data de validade do endereço
     */
    public Endereco(String logradouro, String numero, String bairro, String cidade, String estado, Date dataCadastroEndereco, Date dataValidadeEndereco) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.dataCadastroEndereco = dataCadastroEndereco;
        this.dataValidadeEndereco = dataValidadeEndereco;
    }

     /**
     * Instancia um objeto Endereco.
     * @param logradouro o logradouro
     * @param numero o número
     * @param bairro o bairro
     * @param cidade a cidade
     * @param estado o estado
     * @param complemento o complemento do endereço
     * @param dataCadastroEndereco a data de cadastro do endereço
     * @param dataValidadeEndereco a data de validade do endereço
     */
    public Endereco(String logradouro, String numero, String bairro, String cidade, String estado, String complemento, Date dataCadastroEndereco, Date dataValidadeEndereco) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
        this.dataCadastroEndereco = dataCadastroEndereco;
        this.dataValidadeEndereco = dataValidadeEndereco;
    }

    /**
     * @return o id do endereço
     */
    public String getIdEndereco() {
        return idEndereco;
    }

    /**
     * @param idEndereco o id do endereço
     */
    public void setIdEndereco(String idEndereco) {
        this.idEndereco = idEndereco;
    }

    /**
     * @return o logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro o logradouro
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return o numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero o numero 
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return o bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro o bairro 
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return a cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade a cidade 
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return o estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado o estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return o complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento o complemento 
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return a data de cadastro do endereco
     */
    public Date getDataCadastroEndereco() {
        return dataCadastroEndereco;
    }

    /**
     * @param dataCadastroEndereco a data de cadastro do endereco
     */
    public void setDataCadastroEndereco(Date dataCadastroEndereco) {
        this.dataCadastroEndereco = dataCadastroEndereco;
    }

    /**
     * @return a data de validade do endereco
     */
    public Date getDataValidadeEndereco() {
        return dataValidadeEndereco;
    }

    /**
     * @param dataValidadeEndereco a data de validade do endereco
     */
    public void setDataValidadeEndereco(Date dataValidadeEndereco) {
        this.dataValidadeEndereco = dataValidadeEndereco;
    }

    @Override
    public String toString() {
        return "\n IdEndereco: " + idEndereco + "\n logradouro: " + logradouro + "\n numero: " + numero + "\n bairro: " + bairro + "\n cidade: " + cidade + "\n estado: " + estado + "\n complemento: " + complemento + "\n dataCadastroEndereco: " + dataCadastroEndereco + "\n dataValidadeEndereco: " + dataValidadeEndereco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idEndereco);
        hash = 47 * hash + Objects.hashCode(this.logradouro);
        hash = 47 * hash + Objects.hashCode(this.numero);
        hash = 47 * hash + Objects.hashCode(this.bairro);
        hash = 47 * hash + Objects.hashCode(this.cidade);
        hash = 47 * hash + Objects.hashCode(this.estado);
        hash = 47 * hash + Objects.hashCode(this.complemento);
        hash = 47 * hash + Objects.hashCode(this.dataCadastroEndereco);
        hash = 47 * hash + Objects.hashCode(this.dataValidadeEndereco);
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
        final Endereco oor = (Endereco) obj;
        if (!Objects.equals(this.idEndereco, oor.idEndereco)) {
            return false;
        }
        if (!Objects.equals(this.logradouro, oor.logradouro)) {
            return false;
        }
        if (!Objects.equals(this.numero, oor.numero)) {
            return false;
        }
        if (!Objects.equals(this.bairro, oor.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, oor.cidade)) {
            return false;
        }
        if (!Objects.equals(this.estado, oor.estado)) {
            return false;
        }
        if (!Objects.equals(this.complemento, oor.complemento)) {
            return false;
        }
        if (!Objects.equals(this.dataCadastroEndereco, oor.dataCadastroEndereco)) {
            return false;
        }
        if (!Objects.equals(this.dataValidadeEndereco, oor.dataValidadeEndereco)) {
            return false;
        }
        return true;
    }
    
    
    
}
