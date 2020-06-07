package br.softwarelivrebrasil.modelo;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Classe para objetos do tipo Servico.
 * @author Grupo Software Livre Brasil
 * @version 1.0.0
 */
public class Servico {
    
    private String idServico;
    private String categoria;
    private String descricao;
    private BigDecimal valor;
    private Software software;

    /**
     * Instancia um objeto Servico.
     * @param idServico o id do serviço 
     * @param categoria a categoria do serviço
     * @param descricao a descrição do serviço
     * @param valor o valor da prestação do serviço
     */
    public Servico(String idServico, String categoria, String descricao, BigDecimal valor) {
        this.idServico = idServico;
        this.categoria = categoria;
        this.descricao = descricao;
        this.valor = valor;
    }

    /**
     * @return  o id do serviço
     */
    public String getIdServico() {
        return idServico;
    }

    /**
     * @param idServico  o id do serviço
     */
    public void setIdServico(String idServico) {
        this.idServico = idServico;
    }

    /**
     * @return a categoria do serviço
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria a categoria do serviço
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return a descricao do serviço
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao a descricao do serviço
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return o valor da prestação de serviço
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * @param valor o valor da prestação de serviço
     */
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    /**
     * @return o software relacionado ao serviço
     */
    public Software getSoftware() {
        return software;
    }

    /**
     * @param software o software relacionado ao serviço
     */
    public void setSoftware(Software software) {
        this.software = software;
    }

    @Override
    public String toString() {
        return "Serviço: " + "\n idServico: " + idServico + "\n categoria: " + categoria + "\n descricao: " + descricao + "\n valor: " + valor + "\n software: " + software;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.idServico);
        hash = 59 * hash + Objects.hashCode(this.categoria);
        hash = 59 * hash + Objects.hashCode(this.descricao);
        hash = 59 * hash + Objects.hashCode(this.valor);
        hash = 59 * hash + Objects.hashCode(this.software);
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
        final Servico oor = (Servico) obj;
        if (!Objects.equals(this.idServico, oor.idServico)) {
            return false;
        }
        if (!Objects.equals(this.categoria, oor.categoria)) {
            return false;
        }
        if (!Objects.equals(this.descricao, oor.descricao)) {
            return false;
        }
        if (!Objects.equals(this.valor, oor.valor)) {
            return false;
        }
        if (!Objects.equals(this.software, oor.software)) {
            return false;
        }
        return true;
    }
    
    
}
