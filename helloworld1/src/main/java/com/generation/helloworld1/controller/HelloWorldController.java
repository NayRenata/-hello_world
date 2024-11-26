package com.generation.helloworld1.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	//O primeiro endpoint deverá exibir a mensagem: Hello World!
    @GetMapping
    public String helloWorld() {
        return "Hello World!!!";
    }
    
    //sub-endpoint: O segundo endpoint deverá exibir a lista de BSM’s da Generation Brasil.
    @GetMapping("/BSM")
    public String bsm() {
        return "# Mentalidades:\r\n"
        		+ " \r\n"
        		+ "- Orientação ao futuro\r\n"
        		+ "- Persistência\r\n"
        		+ "- Responsabilidade Pessoal\r\n"
        		+ "- Mentabilidade de Crescimento\r\n"
        		+ " \r\n"
        		+ "# Competências comportamentais:\r\n"
        		+ " \r\n"
        		+ "- Comunicação\r\n"
        		+ "- Proatividade\r\n"
        		+ "- Orientação ao Detalhe\r\n"
        		+ "- Trabalho em equipe!";
    }
    
    //O terceiro endpoint deverá exibir uma lista contendo os seus objetivos de aprendizagem desta semana.
    @GetMapping("/List") 
    public String list() { 
        return "# Objetivos de aprendizagem desta semana:\r\n"
                + "\r\n"
                + "- Aprender mais sobre a arquitetura de aplicações em Java.\r\n"
                + "- Melhorar a prática com Spring Boot e suas anotações.\r\n"
                + "- Entender como criar APIs RESTful e integrá-las com banco de dados.\r\n"
                + "- Empregabilidade:Melhoria no pitch/ Enviar o meu CV para 5 empresas.";
    }
}