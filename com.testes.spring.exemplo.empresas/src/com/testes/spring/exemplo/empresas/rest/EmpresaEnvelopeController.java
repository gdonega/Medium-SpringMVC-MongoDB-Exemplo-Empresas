package com.testes.spring.exemplo.empresas.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testes.spring.exemplo.empresas.services.EmpresaEnvelopeService;

@RestController
@RequestMapping("/rest/empresa-envelope")
public class EmpresaEnvelopeController {
	@Autowired
	private EmpresaEnvelopeService service;

	@GetMapping("/{cnpj}")
	public ResponseEntity<Object> uploadLoteCte(@PathVariable(name = "cnpj") String cnpj) {
		service.salvarCnpj(cnpj);
		return ResponseEntity.ok().build();
	}

}
