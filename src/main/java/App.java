import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.PedidoDAO;
import dao.ProdutoDAO;
import model.*;
import util.HibernateUtil;

public class App {
    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAO();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        PedidoDAO pedidoDAO = new PedidoDAO();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();


       /* Cliente cliente = new Cliente();
        cliente.setId(3l);
        cliente.setNome("Maria Fatima");
        cliente.setTelefone("987654321");
        clienteDAO.salvar(cliente);
        System.out.println("Cliente salvo: " + cliente.getNome());

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();*/

        /*excluir*/
        //Funcionario funcionario = funcionarioDAO.buscarPorId(7l);
       // funcionarioDAO.excluir(funcionario);

        /*update*/
        //Funcionario funcionario = funcionarioDAO.buscarPorId(7l);
      //  funcionario.setNome("Pedro Lara");
     //   funcionario.setSalario(2000);
      //  funcionario.setTamanhonUniforme("G1");
        // funcionarioDAO.atualizar(funcionario);


//        //insert
//        Funcionario funcionario = new Funcionario();
//        funcionario.setNome("Pedro Lara");
//        funcionario.setSalario(2000);
//        funcionario.setTamanhonUniforme("G1");
//        funcionarioDAO.atualizar(funcionario);

        for (Produto produto : produtoDAO.listarTodos()){
            System.out.println("Nome do Produto :" +produto.getNome());
            System.out.println("Preço :" +produto.getPreco());
        }
        HibernateUtil.shutdown();
    }
}

