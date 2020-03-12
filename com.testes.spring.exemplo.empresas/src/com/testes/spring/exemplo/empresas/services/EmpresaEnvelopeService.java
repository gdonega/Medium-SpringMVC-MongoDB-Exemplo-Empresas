package com.testes.spring.exemplo.empresas.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mongodb.DBObject;

@Service
public class EmpresaEnvelopeService {

	public void buscarCnpj(String cnpj) {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "https://www.receitaws.com.br/v1/cnpj/" + cnpj;
		ResponseEntity<DBObject> response = restTemplate.getForEntity(fooResourceUrl + "/1", DBObject.class);
		
//		response.getBody()
	}
}
