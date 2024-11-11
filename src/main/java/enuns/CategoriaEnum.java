package enuns;

import model.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public enum CategoriaEnum {
    //MASSAS
    PASTEL("PASTEL"),
    PIZZA("PIZZA"),
    LASANHA("LASANHA"),

    // BEBIDAS
    REFRIGERANTE("REFRIGERANTE"),
    VITAMINA("VITAMINA"),
    SUCO("SUCO"),

    // SOBREMESAS
    BROWNIE("BROWNIE"),
    PUDIM("PUDIM"),
    SORVETE("SORVETE");



    private String descricao;
    CategoriaEnum(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
