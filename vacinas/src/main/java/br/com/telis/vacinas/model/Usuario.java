package br.com.telis.vacinas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(uniqueConstraints ={
        @UniqueConstraint(columnNames = "email", name = "email_UNIQUE"),
        @UniqueConstraint(columnNames = "cpf", name = "cpf_UNIQUE")
}
)

public class Usuario {
    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String nascimento;
    @Getter @Setter
    private String cpf;

    @Getter @Setter
    @OneToMany(mappedBy = "usuario")
    private List<Vacinacao> vacinacoes;

}
