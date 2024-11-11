package util;


import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.PedidoDAO;
import dao.ProdutoDAO;
import enuns.CategoriaEnum;
import model.Cliente;
import model.Funcionario;
import model.Produto;

public class Update {
    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAO();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        PedidoDAO pedidoDAO = new PedidoDAO();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

        Cliente cliente2 =  clienteDAO.buscarPorId(3L);
        cliente2.setNome("Joao");
        clienteDAO.atualizar(cliente2);
        
        Funcionario funcionario = funcionarioDAO.buscarPorId(7l);
        funcionario.setNome("Pedro Lara");
        funcionario.setSalario(2000);
        funcionario.setTamanhonUniforme("G1");
        funcionarioDAO.atualizar(funcionario);

        Produto produto = produtoDAO.buscarPorId(4l);
        produto.setNome("coca cola");
        produto.setPreco(4);
        produto.setCategoria(CategoriaEnum.REFRIGERANTE.toString());
        produtoDAO.atualizar(produto);

        HibernateUtil.shutdown();
    }
}
