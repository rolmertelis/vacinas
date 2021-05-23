package br.com.telis.vacinas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Vacinacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    @ManyToOne //Um usuário pode tomar várias vacinas
    @JoinColumn(name = "usuario")
    private Usuario usuario;
    @Getter @Setter
    @ManyToOne //A mesma vacina pode ser aplicda infinitas vezes
    @JoinColumn(name = "vacina")
    private Vacina vacina;
    @Getter @Setter
    private Integer dose;
    @Getter @Setter
    private String dataaplicacao;

}
