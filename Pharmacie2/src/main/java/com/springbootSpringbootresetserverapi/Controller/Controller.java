package com.springbootSpringbootresetserverapi.Controller;

import java.awt.PageAttributes.MediaType;
import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


import com.demo.entities.Product;
import com.springbootSpringbootresetserverapi.entity.Prescription;


@RestController

public class Controller {
	@Bean
	public RestTemplate getRestTempalte() {
		return new RestTemplate();

	}

	@Autowired
	private RestTemplate resttemplate;
	static final String Note_url = "http://localhost:8884/";

	@GetMapping("/")
	public String fetchNote() {
		return resttemplate.exchange(Note_url + "pharmacie", HttpMethod.GET, null, String.class).getBody();

	}
	@GetMapping("/patient")
	public String fetchNote1() {
		return resttemplate.exchange(Note_url + "patientpharmacie", HttpMethod.GET, null, String.class).getBody();

	}
	

		
	@PostMapping("/updaterad1")
	public RedirectView update2(@RequestParam("id") long id, @RequestParam("title") String etat, RedirectAttributes redirectAttributes) {
	    try {
	        String url = "http://localhost:8884/updaterad1?id=" + id + "&title=" + etat;
	        ResponseEntity<String> response = resttemplate.postForEntity(url, null, String.class);

	        if (response.getStatusCode() == HttpStatus.OK) {
	            redirectAttributes.addFlashAttribute("message", "Prescription updated successfully!");
	        } else {
	        	String viewUrl = "/";
	            return new RedirectView(viewUrl);
	        }
	    } catch (Exception e) {
	        return new RedirectView("error_page");
	    }
    	

	    return null;
	    }
	


	@GetMapping("/api/product/add-prescription")
	public String fetchNote3() {
		return resttemplate.exchange(Note_url + "add-prescription", HttpMethod.GET, null, String.class).getBody();

	}

	

	@PostMapping(value = "/api/product/process_register")
	public String addnote( Prescription prescription) {
		return resttemplate.postForObject(Note_url + "process_register", prescription, String.class);
		

	}
	@GetMapping("/register")
	public String addnot1e() {
		return resttemplate.exchange(Note_url + "register", HttpMethod.GET, null, String.class).getBody();

	}
}
