package com.desafiolatam.model;

/*
 * Generar la clase Planeta con sus atributos y sus respectivos getters, setters y toString relacionados a cada
clase Planeta: Nombre, tamaño, distancia al sol y lunas). 
Debe inyectar la clase Luna en Planeta con ayuda de ArrayList <Luna>.
 *
 */


import java.util.ArrayList;

public class Planeta  implements IPlaneta{
	
	private String nombre;
	private int tamanio;
	private long distanciaAlSol;
	private ArrayList<Luna> listaLunas= new ArrayList<Luna>();
	
	public Planeta() {
		super();
	}

	public Planeta(String nombre, int tamanio, long distanciaAlSol, ArrayList<Luna> listaLunas) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.distanciaAlSol = distanciaAlSol;
		this.listaLunas = listaLunas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public long getDistanciaAlSol() {
		return distanciaAlSol;
	}

	public void setDistanciaAlSol(long distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}

	public ArrayList<Luna> getListaLunas() {
		return listaLunas;
	}

	public void setListaLunas(ArrayList<Luna> listaLunas) {
		this.listaLunas = listaLunas;
	}

	@Override
	public String toString() {
		return "Planeta de nombre " + nombre + ", cuyo tamaño es de " + tamanio + " km de diámetro y su distancia al sol es de " + distanciaAlSol
				+ " km y  tiene " + listaLunas.size() + " lunas.";
	}
	
	
}
