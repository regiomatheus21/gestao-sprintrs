package br.com.gestaosprinter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class GestaoSprinterApplication {
	@GetMapping
	public String gethomeTeste(){
		return "sprinter - API HOME";
	}

	public static void main(String[] args) {
		SpringApplication.run(GestaoSprinterApplication.class, args);
	}

}
