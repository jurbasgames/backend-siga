package br.ufrj.backendsiga.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "inscricao_ic")
public class InscricaoIC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private Usuario aluno;

    @ManyToOne
    @JoinColumn(name = "ic_id", nullable = false)
    private IniciacaoCientifica iniciacaoCientifica;

    @ManyToOne
    @JoinColumn(name = "professor_avaliador_id")
    private Usuario professor;

    @ManyToOne
    @JoinColumn(name = "situacao_id", nullable = false)
    private SituacaoInscricao situacaoInscricao;
}