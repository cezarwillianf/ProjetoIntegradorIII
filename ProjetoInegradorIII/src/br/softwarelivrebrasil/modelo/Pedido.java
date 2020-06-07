package br.softwarelivrebrasil.modelo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Classe para objetos do tipo Pedido.
 * @author Grupo Software Livre Brasil
 * @version 1.0.0
 */
public class Pedido {
    
    private String idPedido;
    private Cliente cliente;
    private Date dataPedido;
    private List <Servico> servico;
    private BigDecimal valorPedido;

     /**
     * Instancia um objeto Pedido.
     * @param idPedido o id do pedido
     * @param cliente o cliente solicitante
     * @param dataPedido a data de realização do pedido
     * @param servico a lista de serviços solicitados
     * @param valorPedido valor total do pedido
     */
    public Pedido(String idPedido, Cliente cliente, Date dataPedido, List<Servico> servico, BigDecimal valorPedido) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.servico = servico;
        this.valorPedido = valorPedido;
    }

    /**
     * @return o id do pedido
     */
    public String getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido o id do pedido
     */
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return o cliente solicitante do pedido
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente o cliente solicitante do pedido
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return a data de realização do pedido
     */
    public Date getDataPedido() {
        return dataPedido;
    }

    /**
     * @param dataPedido a data de realização do pedido
     */
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    /**
     * @return a lista de serviços solicitados
     */
    public List <Servico> getServico() {
        return servico;
    }

    /**
     * @param servico a lista de serviços solicitados
     */
    public void setServico(List <Servico> servico) {
        this.servico = servico;
    }

    /**
     * @return o valor total do pedido
     */
    public BigDecimal getValorPedido() {
        return valorPedido;
    }

    /**
     * @param valorPedido o valor total do pedido
     */
    public void setValorPedido(BigDecimal valorPedido) {
        this.valorPedido = valorPedido;
    }

    @Override
    public String toString() {
        return "Pedido: " + "\n idPedido: " + idPedido + "\n cliente: " + cliente + "\n dataPedido: " + dataPedido + "\n servico: " + servico + "\n valorPedido: " + valorPedido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idPedido);
        hash = 89 * hash + Objects.hashCode(this.cliente);
        hash = 89 * hash + Objects.hashCode(this.dataPedido);
        hash = 89 * hash + Objects.hashCode(this.servico);
        hash = 89 * hash + Objects.hashCode(this.valorPedido);
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
        final Pedido oor = (Pedido) obj;
        if (!Objects.equals(this.idPedido, oor.idPedido)) {
            return false;
        }
        if (!Objects.equals(this.dataPedido, oor.dataPedido)) {
            return false;
        }
        if (!Objects.equals(this.cliente, oor.cliente)) {
            return false;
        }
        if (!Objects.equals(this.servico, oor.servico)) {
            return false;
        }
        if (!Objects.equals(this.valorPedido, oor.valorPedido)) {
            return false;
        }
        return true;
    }
    
    
}
