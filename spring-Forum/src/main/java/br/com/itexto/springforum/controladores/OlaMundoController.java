package br.com.itexto.springforum.controladores;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class OlaMundoController {
  
	@RequestMapping("/ola")
	public ModelAndView olamundo(){
		ModelAndView resultado = new ModelAndView("mundo");
		resultado.addObject("data", new Date());
		return resultado;
		
	}
	
	@RequestMapping("/java")
	public ModelAndView javamundo(){
		ModelAndView resultado = new  ModelAndView("java");
		resultado.addObject("java_man", "RUBY AND JAVA COMBINATE");
		return resultado;
	}
	
	
}
