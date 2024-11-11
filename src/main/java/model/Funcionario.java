package model;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "F")
public class Funcionario extends Pessoa {

    private String tamanhonUniforme;
    private double salario;


    public String getTamanhonUniforme() {
        return tamanhonUniforme;
    }

    public void setTamanhonUniforme(String tamanhonUniforme) {
        this.tamanhonUniforme = tamanhonUniforme;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return " Nome: "+getNome();
    }
}



