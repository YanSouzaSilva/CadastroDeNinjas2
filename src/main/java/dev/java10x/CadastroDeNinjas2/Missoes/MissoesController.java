package dev.java10x.CadastroDeNinjas2.Missoes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_missoes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MissoesController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

}
