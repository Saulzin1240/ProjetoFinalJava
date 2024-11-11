package util;

import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.PedidoDAO;
import dao.ProdutoDAO;
import model.Cliente;
import model.Funcionario;
import model.Produto;

public class List {
    public static void main(String[] args) {


        ClienteDAO clienteDAO = new ClienteDAO();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        PedidoDAO pedidoDAO = new PedidoDAO();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();


        for (Cliente cliente : clienteDAO.listarTodos()) {
            System.out.println("Nome do cliente :" + cliente.getNome());
            System.out.println("Telefone :" + cliente.getTelefone());
        }


        for (Funcionario funcionario : funcionarioDAO.listarTodos()) {
            System.out.println("Nome do funcionario:" + funcionario.getNome());
            System.out.println("Salario :" + funcionario.getSalario());
        }

        for (Produto produto : produtoDAO.listarTodos()) {
            System.out.println("Nome do Produto :" + produto.getNome());
            System.out.println("Preço :" + produto.getPreco());
        }
    }
}

