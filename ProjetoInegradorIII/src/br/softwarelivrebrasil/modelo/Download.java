package br.softwarelivrebrasil.modelo;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Classe para objetos do tipo Download.
 * @author Grupo Software Livre Brasil
 * @version 1.0.0
 */
public class Download {
    
    private String idDownload;
    private Cliente cliente;
    private List <Software> software;
    private Date dataDownload;

    /**
     * Instancia um objeto Download.
     * @param idDownload o id do download
     * @param cliente o cliente que efetua o download
     * @param software a lista de softwares cujo download é realizado
     * @param dataDownload a data de download
     */
    public Download(String idDownload, Cliente cliente, List<Software> software, Date dataDownload) {
        this.idDownload = idDownload;
        this.cliente = cliente;
        this.software = software;
        this.dataDownload = dataDownload;
    }

    /**
     * @return o id do download
     */
    public String getIdDownload() {
        return idDownload;
    }

    /**
     * @param idDownload o id do download
     */
    public void setIdDownload(String idDownload) {
        this.idDownload = idDownload;
    }

    /**
     * @return o cliente que efetua o download
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente o cliente que efetua o download
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return a lista de softwares cujo download é realizado
     */
    public List <Software> getSoftware() {
        return software;
    }

    /**
     * @param software a lista de softwares cujo download é realizado
     */
    public void setSoftware(List <Software> software) {
        this.software = software;
    }

    /**
     * @return a data de download
     */
    public Date getDataDownload() {
        return dataDownload;
    }

    /**
     * @param dataDownload a data de download
     */
    public void setDataDownload(Date dataDownload) {
        this.dataDownload = dataDownload;
    }

    @Override
    public String toString() {
        return "\n idDownload: " + idDownload + "\n cliente: " + cliente + "\n software: " + software + "\n dataDownload: " + dataDownload;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idDownload);
        hash = 29 * hash + Objects.hashCode(this.cliente);
        hash = 29 * hash + Objects.hashCode(this.software);
        hash = 29 * hash + Objects.hashCode(this.dataDownload);
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
        final Download other = (Download) obj;
        if (!Objects.equals(this.idDownload, other.idDownload)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.software, other.software)) {
            return false;
        }
        if (!Objects.equals(this.dataDownload, other.dataDownload)) {
            return false;
        }
        return true;
    }
    
    
}
