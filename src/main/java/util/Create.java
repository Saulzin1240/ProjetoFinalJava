package util;

import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.PedidoDAO;
import dao.ProdutoDAO;
import enuns.CategoriaEnum;
import model.Cliente;
import model.Funcionario;
import model.Produto;

public class Create{
    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAO();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        PedidoDAO pedidoDAO = new PedidoDAO();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();


//        Cliente cliente = new Cliente();
//        cliente.setNome("Maria Fatima");
//        cliente.setTelefone("987654321");
//        clienteDAO.atualizar(cliente);
//        System.out.println("Cliente salvo: " + cliente.getNome());


//        Funcionario funcionario = new Funcionario();
//        funcionario.setNome("Pedro Lara");
//        funcionario.setSalario(2000);
//        funcionario.setTamanhonUniforme("G1");
//        funcionarioDAO.atualizar(funcionario);


        Produto produto = new Produto();
        produto.setNome("Refrigerante");
        produto.setPreco(5);
        produto.setCategoria(CategoriaEnum.REFRIGERANTE.toString());
        produtoDAO.atualizar(produto);

        HibernateUtil.shutdown();
    }
}
