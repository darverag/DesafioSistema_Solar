package com.desafiolatam.model;

/*
Generar clase Luna con atributos y sus respectivos getters, setters y toString relacionados a cada
clase (Luna: nombre, diámetro y tiempo de órbita. 
 */

public class Luna implements ILuna{
	
	private String nombre;
	private int diametro;
	private float tiempoDeOrbita;
	
	
	public Luna() {
		super();
	}


	public Luna(String nombre, int diametro, float tiempoDeOrbita) {
		super();
		this.nombre = nombre;
		this.diametro = diametro;
		this.tiempoDeOrbita = tiempoDeOrbita;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDiametro() {
		return diametro;
	}


	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}


	public float getTiempoDeOrbita() {
		return tiempoDeOrbita;
	}


	public void setTiempoDeOrbita(float tiempoDeOrbita) {
		this.tiempoDeOrbita = tiempoDeOrbita;
	}


	@Override
	public String toString() {
		return "Luna de nombre " + nombre + " cuyo diámetro es de " + diametro + " km y tiene un  tiempo de órbita entorno del planeta de "+ tiempoDeOrbita + " dias.";
	}

	

}
