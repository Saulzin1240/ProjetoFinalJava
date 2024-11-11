package model;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "C")
public class Cliente extends Pessoa {

    private String email;
    private String telefone;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
