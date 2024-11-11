package dao;

import model.Pedido;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PedidoDAO {
    public void salvar(Pedido pedido) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(pedido);
        transaction.commit();
        session.close();
    }

    public Pedido buscarPorId(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Pedido pedido = session.get(Pedido.class, id);
        session.close();
        return pedido;
    }

    public void atualizar(Pedido pedido) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(pedido);
        transaction.commit();
        session.close();
    }

    public void deletar(Pedido pedido) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(pedido);
        transaction.commit();
        session.close();
    }
}
