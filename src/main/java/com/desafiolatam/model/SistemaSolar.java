package com.desafiolatam.model;

import java.util.ArrayList;

/*
 * Generar la clase del sistema solar donde inyecte los planetas apoyándose por un
ArrayList<Planeta>, desde aquí genere dos métodos, el primero debe mostrar la
información de los planetas y el segundo deber mostrar la información de los planetas y
de sus respectivas lunas. Apóyese del método toString en ambos casos.
 * 
 */

public class SistemaSolar {

	//Aqui solo va un atributo ArrayList de Planetas
	private ArrayList<Planeta> planetas = new ArrayList<Planeta>();
	
	
	//Metodo para agregar planeta al arreglo
	public void agregarPlaneta(Planeta planeta) {
		this.planetas.add(planeta);//Aqui se agrega un planeta
	}
	
	//Metodo para mostrar todos los planetas
	public void mostrarPlanetas() {
		System.out.println("SE MUESTRA INFORMACIÓN DE LOS PLANETAS DEL SISTEMA SOLAR \n");
		//Se debe recorrer arreglo planetas e imprimir to strung por planeta
		
		for(int i=0; i<planetas.size(); i ++) {
			System.out.println(planetas.get(i));
		}
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------\n");
	}
	
	
	public void mostrarPlanetasLunas() {
		System.out.println("SE MUESTRA INFORMACIÓN DE LOS PLANETAS DEL SISTEMA SOLAR Y SUS RESPECTIVAS LUNAS\n");
		//recorrer arreglo para buscar lunas con for anidado (for de for) e imprimir 
		
				for(int i = 0; i < planetas.size(); i++) {
					System.out.println(planetas.get(i).toString());
					for(int j = 0; j < planetas.get(i).getListaLunas().size(); j++) {
						System.out.println(planetas.get(i).getListaLunas().get(j).toString());
					}
					System.out.println();
				}
	}
	
}
