package io.github.evertoncnsouza.rest.dto;

import io.github.evertoncnsouza.domain.entity.CaracteristicaProduto;
import io.github.evertoncnsouza.domain.entity.Produto;

import java.math.BigDecimal;

public class SiteProdutoResponse {

    private SiteCaracteristicaResponse caracteristica;
    private SiteCategoriaResponse categoria;
    private SiteOpiniaoResponse opiniao;
    private String nome;
    private int quantidade;
    private String descricao;
    private BigDecimal valor;

    public SiteProdutoResponse(Produto produto) {
        nome = produto.getNome();
        categoria = new SiteCategoriaResponse(produto.getCategoria());
      //  caracteristica = new SiteCaracteristicaResponse((CaracteristicaProduto) produto.getCaracteristicas());
      //  opiniao = new SiteOpiniaoResponse(produto.getOpiniao());
        quantidade = produto.getQuantidade();
        descricao = produto.getDescricao();
        valor = produto.getValor();


    }

    public SiteCaracteristicaResponse getCaracteristica() {
        return caracteristica;
    }

    public SiteCategoriaResponse getCategoria() {
        return categoria;
    }

    public SiteOpiniaoResponse getOpiniao() {
        return opiniao;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }
}