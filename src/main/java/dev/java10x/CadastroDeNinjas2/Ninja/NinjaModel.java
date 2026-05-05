package dev.java10x.CadastroDeNinjas2.Ninja;
import dev.java10x.CadastroDeNinjas2.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cadastro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "missoes")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int idade;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(unique = true)
    private String email;

    @Column(name = "rank")
    private String rank;

    @ManyToOne
    @JoinColumn(name = "missao_id") //chave estrangeira
    private MissoesModel missao;
}
