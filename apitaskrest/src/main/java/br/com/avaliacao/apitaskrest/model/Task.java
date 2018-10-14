package br.com.avaliacao.apitaskrest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.boot.autoconfigure.web.ResourceProperties.Strategy;
import org.springframework.lang.Nullable;

@Entity
@Table(name="Task")
public class Task implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String titulo;

	@NotNull
	private String descricao;
	
	@Nullable
	private Date dataRegistro;
	
	@Nullable	
	private Date dataFim; 
	@Nullable
	private char status;
	
	private String responsavel; 


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", dataRegistro=" + dataRegistro
				+ ", dataFim=" + dataFim + ", status=" + status + ", responsavel=" + responsavel + "]";
	}

	
	
}
