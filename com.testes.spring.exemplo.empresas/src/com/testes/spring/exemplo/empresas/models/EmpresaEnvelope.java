package com.testes.spring.exemplo.empresas.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.DBObject;

@Document(collection = "empresas")
public class EmpresaEnvelope {
	@Id
	private String id;

	private String cnpj;
	private String cep;
	private String municipio;
	private String bairro;
	private String logradouro;
	private Long numero;

	private DBObject jsonApi; // Objeto da lib do MongoDB que nos permite salvar um json no mongo (Ou seja, em
								// vez de converter o json para um objeto e depois o mongo converter esse objeto
								// novamente para json, nós passamos o json para esse Objeto e ele salva o json
								// direto no mongo)

	public EmpresaEnvelope() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public DBObject getJsonApi() {
		return jsonApi;
	}

	public void setJsonApi(DBObject jsonApi) {
		this.jsonApi = jsonApi;
	}

}
