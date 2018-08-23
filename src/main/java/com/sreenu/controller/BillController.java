package com.sreenu.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
public class BillController {
	
	@GetMapping(path = "/msg", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> msg(@RequestParam(value = "msg") String msg) {

		return ResponseEntity.status(200).body(msg);
	};

	// @RequestMapping(value="/healthCheck", produces=
	// {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},method={RequestMethod.GET})

	@GetMapping(path = "/healthCheck", produces = MediaType.APPLICATION_JSON_VALUE)
	public String healthCheck() {
		return "running...";

	}

	
}
