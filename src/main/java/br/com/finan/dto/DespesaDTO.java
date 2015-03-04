package br.com.finan.dto;

import br.com.finan.entidade.annotation.ColunaTabela;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Wesley Luiz
 */
public class DespesaDTO {
    
    private Long id;
    
    @ColunaTabela
    private String descricao;
    
    @ColunaTabela
    private String categoria;
    
    @ColunaTabela
    private BigDecimal valor;
    
    @ColunaTabela
    private Date vencimento;
    
    @ColunaTabela
    private boolean selecionado;
    
    private Integer parcela;
    
    private Integer totalParcela;
    
    private boolean editado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public boolean isSelecionado() {
        return selecionado;
    }

    public void setSelecionado(boolean selecionado) {
        this.selecionado = selecionado;
    }

    public boolean isEditado() {
        return editado;
    }

    public void setEditado(boolean editado) {
        this.editado = editado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getParcela() {
        return parcela;
    }

    public void setParcela(Integer parcela) {
        this.parcela = parcela;
    }

    public Integer getTotalParcela() {
        return totalParcela;
    }

    public void setTotalParcela(Integer totalParcela) {
        this.totalParcela = totalParcela;
    }
}