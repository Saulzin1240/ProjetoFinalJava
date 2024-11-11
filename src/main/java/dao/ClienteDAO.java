package dao;

import model.Cliente;
import model.Produto;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ClienteDAO {

    public void gravar(Cliente cliente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(cliente);
        transaction.commit();
        session.close();
    }
    public void atualizar(Cliente cliente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(cliente);
        transaction.commit();
        session.close();
    }

    public void deletar(Cliente cliente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(cliente);
        transaction.commit();
        session.close();
    }

    public Cliente buscarPorId(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Cliente cliente = session.get(Cliente.class, id);
        session.close();
        return cliente;
    }

    public List<Cliente> listarTodos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Cliente> clientes = session.createQuery("from Cliente").list();
        session.close();
        return clientes;
    }
}
