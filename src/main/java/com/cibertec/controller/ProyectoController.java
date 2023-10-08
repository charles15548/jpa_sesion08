package com.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProyectoController {

	@GetMapping("/login")
	public String CargarLogin() {
		return ("login.html");
	}
	
	
   @PostMapping("/ingreso")
   public String LeerLogin(@RequestParam(name="txtUsuario")String Usuario,@RequestParam(name="txtClave")String Clave,
		   Model  model) {
	   
	   
	   System.out.println("Ingreso al sistema");
	System.out.println(Usuario+" "+Clave);
	
	if(Usuario.equals("admin@mail.com") && Clave.equals("123")) 
	{
		model.addAttribute("mensaje","Bienvenido");
	model.addAttribute("cssmensaje","alert alert-success");
	}else
	{
		model.addAttribute("mensaje","Error");
		model.addAttribute("cssmensaje","alert alert-danger");
	}
	
	
	
	   return ("login");
	   
	   
   }
	
}
