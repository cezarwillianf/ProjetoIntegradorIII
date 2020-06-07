package br.softwarelivrebrasil;

import br.softwarelivrebrasil.modelo.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Classe para teste das classes criadas no pacote br.softwarelivrebrasil.modelo.
 * @author Grupo Software Livre Brasil
 * @version 1.0.0
 */
public class TesteDeClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //testando classe Contato
        String email = "cezar@email.com";
        String celular = "(00)123456789";
        String telfixo = "(00)12345678";
        Contato contato = new Contato(email, celular, telfixo);
        System.out.println("\nTestando a classe Contato:" + contato.toString());
        
        //testando classe Endereco
        String logradouro = "Rua dos Bobos";
        String numEndereco = "0";
        String bairro = "Centro";
        String cidade = "BH";
        String estado = "MG";
        Date dataCadastroEndereco = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataCadastroEndereco);
        cal.add(Calendar.YEAR, 1); // considerando que a validade é de um ano 
        Date dataValidadeEndereco = cal.getTime(); 
        Endereco endereco = new Endereco(logradouro, numEndereco, bairro, cidade, estado, dataCadastroEndereco, dataValidadeEndereco);
        endereco.setIdEndereco("0001");
        endereco.setComplemento("Casa");
        System.out.println("\nTestando a classe Endereco:" + endereco.toString());
        
        //testando classe Cliente
        String idCliente = "00001";
        String nome = "Cézar W Ferreira";
        String cpf = "000.000.000-00";
        String razaoSocial = "Loja do Cézar";
        String cnpj = "00.000.000/0000-00";
        String senha = "1234";
        Date dataCadastro = new Date();
        //testando classe Cliente, enquanto pessoa física
        Cliente novoClientePF = new Cliente (idCliente, nome, cpf, senha, contato, endereco, dataCadastro);
        System.out.println("\nTestando a classe Cliente, enquanto pessoa física: \n" + novoClientePF.toString());
        //testando a classe Cliente, enquanto pessoa jurídica
        Cliente novoClientePJ = new Cliente (idCliente, razaoSocial, nome, cnpj, senha, contato, endereco, dataCadastro);
        System.out.println("\nTestando a classe Cliente, enquanto pessoa jurídica: \n" + novoClientePJ.toString());
        
        //testando a classe software
        String idSoftware = "0001";
        String titulo = "Linux";
        String versao = "1.0.0";
        String descricao = "Sistema operacional livre";
        String categoria = "SO";
        String origem = "url";
        Software software = new Software(idSoftware, titulo, versao, categoria, descricao, origem);
        System.out.println("\nTestando a classe Software: " + software.toString());

        //testando a classe Download
        String idDownload = "0001";
        ArrayList<Software> listaSoftwares = new ArrayList();
        listaSoftwares.add(software);
        Date dataDownload = new Date();
        Download download = new Download(idDownload, novoClientePJ, listaSoftwares, dataDownload);
        System.out.println("\nTestando a classe Download: " + download.toString());
        
        //testando a classe Servico
        String idServico = "0001";
        String categoriaServico = "Treinamento";
        String descricaoServico = "Treinamento para uso do software";
        BigDecimal valorServico = new BigDecimal("500.00");
        Servico servico = new Servico(idServico, categoriaServico, descricaoServico, valorServico);
        servico.setSoftware(software);
        System.out.println("\nTestando a classe Servico: " + servico.toString());
        
        //testando a classe Pedido
        String idPedido = "0001";
        Date dataPedido = new Date();
        ArrayList<Servico> listaServicos = new ArrayList();
        listaServicos.add(servico);
        BigDecimal valorPedido = new BigDecimal("500.00");
        Pedido pedido = new Pedido(idPedido, novoClientePF, dataPedido, listaServicos, valorPedido);
        System.out.println("\nTestando a classe Servico: " + pedido.toString());
    
    }
    
}
