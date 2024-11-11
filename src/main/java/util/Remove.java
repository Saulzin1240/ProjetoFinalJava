package util;
import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.PedidoDAO;
import dao.ProdutoDAO;
import enuns.CategoriaEnum;
import model.Cliente;
import model.Funcionario;
import model.Produto;

public class Remove {
    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAO();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        PedidoDAO pedidoDAO = new PedidoDAO();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

       Cliente cliente = clienteDAO.buscarPorId(5l);
       clienteDAO.deletar(cliente);

       Produto produto = produtoDAO.buscarPorId(1l);
       produtoDAO.deletar(produto);

       Funcionario funcionario = funcionarioDAO.buscarPorId(7l);
       funcionarioDAO.deletar(funcionario);
    }
}
