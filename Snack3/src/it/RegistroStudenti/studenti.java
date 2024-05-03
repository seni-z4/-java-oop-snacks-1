package it.RegistroStudenti;

import java.util.ArrayList;

public class studenti {

	/*
	 * Crea una classe RegistroStudenti che rappresenti un registro di studenti.
	 * Utilizza un array privato per memorizzare oggetti Studente. Implementa un
	 * costruttore senza parametri per inizializzare il registro vuoto e un metodo
	 * pubblico per aggiungere studenti al registro. Aggiungi un metodo che stampi
	 * la lista degli studenti.
	 * 
	 * 
	 */

	class Studente {
		String nome;
		String cognome;
		String matricola;

		public Studente(String nome, String cognome, String matricola) {
			this.nome = nome;
			this.cognome = cognome;
			this.matricola = matricola;
		}
	}

}
