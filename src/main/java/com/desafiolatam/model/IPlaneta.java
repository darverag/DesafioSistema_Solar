package com.desafiolatam.model;

import java.util.ArrayList;

/*
 *Generar interfaz IPlaneta,
 * 
 */
public interface IPlaneta {
	
	
	public String getNombre();
	public void setNombre(String nombre); 
	public int getTamanio();
	public void setTamanio(int tamanio);
	public long getDistanciaAlSol();
	public void setDistanciaAlSol(long distanciaAlSol); 
	public ArrayList<Luna> getListaLunas();
	public void setListaLunas(ArrayList<Luna> listaLunas);
	
}
