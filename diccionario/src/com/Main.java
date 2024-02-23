package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Main {

public static void main(String[] args) {
		
		/*
		 * Crear un programa en Java que realice lo siguiente:
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utilizar un objeto HashMap para almacenar los pares de palabras.
Escoger al azar 5 palabras en español del mini diccionario.
Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario.
Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub.
Colócalo en un repositorio llamado “logica-programacion-10”
		 */
		/*Scanner scanner = new Scanner (System.in);*/
		
		Map <String, String> animalsTranslate = new HashMap<>();
		
		animalsTranslate.put("gato", "cat");
		animalsTranslate.put("carpincho", "capybara");
		animalsTranslate.put("tortuga", "turtle");
		animalsTranslate.put("perro", "dog");
		animalsTranslate.put("delfin", "dolphin");
		animalsTranslate.put("mariposa", "butterfly");
		animalsTranslate.put("puercoespin", "porcupine");
		animalsTranslate.put("vaca", "cow");
		animalsTranslate.put("caballo", "horse");
		animalsTranslate.put("nutria", "otter");
		animalsTranslate.put("ballena", "whale");
		animalsTranslate.put("conejo", "rabbit");
		animalsTranslate.put("mapache", "raccoon");
		animalsTranslate.put("manatí", "manatee");
		animalsTranslate.put("perico", "parakeet");
		animalsTranslate.put("pulpo", "octopus");
		animalsTranslate.put("perezoso", "sloth");
		animalsTranslate.put("buho", "owl");
		animalsTranslate.put("pingüino", "penguin");
		animalsTranslate.put("ardilla", "squirrel");
		animalsTranslate.put("erizo", "hedgehog");
		
		
		/*System.out.println("Ingrese el nombre del animal que desee traducir: ");
		String requestedAnimal = scanner.nextLine().toLowerCase();
		
		//Validar que el animal solicitado se encuentre en la colección
		String animal = animalsTranslate.get(requestedAnimal);
		if (animal == null) {
			System.out.println("El animal solicitado no se encuentra en el diccionario");
		} else { System.out.println("La traducción es: " + animal);
		}*/
		Random random = new Random();

		int correctTranslation = 0;
		int wrongTranslation = 0;
		String rightAnswer = "";
		String wrongAnswer = "";
		
		for (int i = 0; i < 5 ; i++) {
		List <String> animalName =  new ArrayList<> (animalsTranslate.keySet()); //Array con todas las llaves de HashMap
		String animal = animalName.get(random.nextInt(animalName.size())); // Tomar un animal al azar
		
		//solicitud al usuario por cada iteración 
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Cual es la traducción al inglés de '" + animal + "' ?");
		String Input = scanner.nextLine();
		
		if( Input.equalsIgnoreCase(animalsTranslate.get(animal))){
			correctTranslation++;
		} else {
			wrongTranslation++;
		}
		// Eliminar el animal seleccionado al azar para evitar que se repita en las 5 iteraciones
		animalName.remove(animal);
		
		}
		
		if(wrongTranslation > 1) {
			wrongAnswer = "respuestas incorrectas";
		}else { wrongAnswer = "respuesta incorrecta";
		
		}
		
		if(correctTranslation > 1) {
			rightAnswer = "respuestas correctas";
		}else { rightAnswer = "respuesta correcta";
		
		}
		
		System.out.println("Obtuviste " + correctTranslation + " " + rightAnswer);
		System.out.println("y " + wrongTranslation + " " + wrongAnswer);
		
	}
}

