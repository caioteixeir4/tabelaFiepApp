package br.com.alura.tabelaFiepApp;

import br.com.alura.tabelaFiepApp.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TabelaFipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TabelaFipeApplication.class, args);
	}

	@Override
	public void run(String...args) {
		Principal principal = new Principal();
		principal.exibirMenu();
	}
}
