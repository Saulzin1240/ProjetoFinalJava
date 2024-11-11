package dao;

import model.Produto;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProdutoDAO {
    public void salvar(Produto produto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(produto);
        transaction.commit();
        session.close();
    }

    public Produto buscarPorId(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Produto produto = session.get(Produto.class, id);
        session.close();
        return produto;
    }

    public void atualizar(Produto produto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(produto);
        transaction.commit();
        session.close();
    }

    public void deletar(Produto produto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(produto);
        transaction.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    public List<Produto> listarTodos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Produto> produtos = session.createQuery("from Produto").list();
        session.close();
        return produtos;
    }
}
