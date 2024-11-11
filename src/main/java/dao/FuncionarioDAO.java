package dao;

import model.Funcionario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class FuncionarioDAO {

    public void gravar(Funcionario funcionario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(funcionario);
        transaction.commit();
        session.close();
    }

    public void atualizar(Funcionario funcionario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(funcionario);
        transaction.commit();
        session.close();
    }

    public void deletar(Funcionario funcionario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(funcionario);
        transaction.commit();
        session.close();
    }

    public Funcionario buscarPorId(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Funcionario funcionario = session.get(Funcionario.class, id);
        session.close();
        return funcionario;
    }
    public List<Funcionario> listarTodos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Funcionario> funcionarios = session.createQuery("from Funcionario").list();
        session.close();
        return funcionarios;
    }

}
