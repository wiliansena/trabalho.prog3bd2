/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.progIII.vraptor.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Wilian
 */

public class Venda {
    private Integer id;
    private String descricao;
    private Date data;
    @ManyToOne
    @JoinColumn
    private FormPagamento formpagamento;

    public FormPagamento getFormpagamento() {
        return formpagamento;
    }

    public void setFormpagamento(FormPagamento formpagamento) {
        this.formpagamento = formpagamento;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
