package com.desafiolatam;

import java.util.ArrayList;

import com.desafiolatam.model.Luna;
import com.desafiolatam.model.Planeta;
import com.desafiolatam.model.SistemaSolar;

public class Main {

	public static void main(String[] args) {

	ArrayList<Planeta>planetas= new ArrayList<Planeta>();
	
	Planeta planetaMercurio = new Planeta();
	planetaMercurio.setNombre("Mercurio");
	planetaMercurio.setTamanio(4480);
	planetaMercurio.setDistanciaAlSol(57910000l);
	planetas.add(planetaMercurio);
	
	Planeta planetaVenus = new Planeta();
	planetaVenus.setNombre("Venus");
	planetaVenus.setTamanio(12104);
	planetaVenus.setDistanciaAlSol(108200000l);
	planetas.add(planetaVenus);
	
	
	Planeta planetaTierra = new Planeta();
	planetaTierra.setNombre("Tierra");
	planetaTierra.setTamanio(12756);
	planetaTierra.setDistanciaAlSol(149600000l);
	planetas.add(planetaTierra);
	
	Planeta planetaMarte= new Planeta();
	planetaMarte.setNombre("Marte");
	planetaMarte.setTamanio(6794);
	planetaMarte.setDistanciaAlSol(227940000l);
	planetas.add(planetaMarte);
	
	
	Planeta planetaJupiter= new Planeta();
	planetaJupiter.setNombre("Jupiter");
	planetaJupiter.setTamanio(142984);
	planetaJupiter.setDistanciaAlSol(778330000l);
	planetas.add(planetaJupiter);
	
	Planeta planetaSaturno= new Planeta();
	planetaSaturno.setNombre("Saturno");
	planetaSaturno.setTamanio(108728);
	planetaSaturno.setDistanciaAlSol(1429400000l);
	planetas.add(planetaSaturno);
	
	Planeta planetaUrano= new Planeta();
	planetaUrano.setNombre("Urano");
	planetaUrano.setTamanio(51118);
	planetaUrano.setDistanciaAlSol(2870990000l);
	planetas.add(planetaUrano);
	
	Planeta planetaNeptuno= new Planeta();
	planetaNeptuno.setNombre("Neptuno");
	planetaNeptuno.setTamanio(49532);
	planetaNeptuno.setDistanciaAlSol(4504300000l);
	planetas.add(planetaNeptuno);
	
	Planeta planetaPluton= new Planeta();
	planetaPluton.setNombre("Pluton");
	planetaPluton.setTamanio(2320);
	planetaPluton.setDistanciaAlSol(5913520000l);
	planetas.add(planetaPluton);
	
	
	
	ArrayList<Luna> lunasTierra = new ArrayList<Luna>();
	Luna lunaTierra = new Luna();
	lunaTierra.setNombre("Luna");
	lunaTierra.setDiametro(3476);
	lunaTierra.setTiempoDeOrbita(27.322f);
	lunasTierra.add(lunaTierra);
	planetaTierra.setListaLunas(lunasTierra);
	
	ArrayList<Luna> lunasMarte = new ArrayList<Luna>();
	Luna lunaMarte1 = new Luna();
	lunaMarte1.setNombre("Deinos");
	lunaMarte1.setDiametro(8);
	lunaMarte1.setTiempoDeOrbita(1.263f);
	lunasMarte.add(lunaMarte1);
	
	Luna lunaMarte2 = new Luna();
	lunaMarte2.setNombre("Phobos");
	lunaMarte2.setDiametro(28);
	lunaMarte2.setTiempoDeOrbita(0.319f);
	lunasMarte.add(lunaMarte2);
	planetaMarte.setListaLunas(lunasMarte);
	
	
	ArrayList<Luna> lunasJupiter = new ArrayList<Luna>();
	Luna lunaJupiter1 = new Luna();
	lunaJupiter1.setNombre("Arche");
	lunaJupiter1.setDiametro(3);
	lunaJupiter1.setTiempoDeOrbita(715.6f);
	lunasJupiter.add(lunaJupiter1);
	
	Luna lunaJupiter2 = new Luna();
	lunaJupiter2.setNombre("Ananke");
	lunaJupiter2.setDiametro(20);
	lunaJupiter2.setTiempoDeOrbita(631f);
	lunasJupiter.add(lunaJupiter2);
	planetaJupiter.setListaLunas(lunasJupiter);
	
	
	ArrayList<Luna> lunasSaturno = new ArrayList<Luna>();
	Luna lunaSaturno1 = new Luna();
	lunaSaturno1.setNombre("Bestla");
	lunaSaturno1.setDiametro(7);
	lunaSaturno1.setTiempoDeOrbita(1083.6f);
	lunasSaturno.add(lunaSaturno1);
	
	Luna lunaSaturno2 = new Luna();
	lunaSaturno2.setNombre("Hati");
	lunaSaturno2.setDiametro(6);
	lunaSaturno2.setTiempoDeOrbita(1038.7f);
	lunasSaturno.add(lunaSaturno2);
	planetaSaturno.setListaLunas(lunasSaturno);
	
	
	ArrayList<Luna> lunasUrano = new ArrayList<Luna>();
	Luna lunaUrano1 = new Luna();
	lunaUrano1.setNombre("Margaret");
	lunaUrano1.setDiametro(11);
	lunaUrano1.setTiempoDeOrbita(1694.8f);
	lunasUrano.add(lunaUrano1);
	
	Luna lunaUrano2 = new Luna();
	lunaUrano2.setNombre("Miranda");
	lunaUrano2.setDiametro(472);
	lunaUrano2.setTiempoDeOrbita(1414f);
	lunasUrano.add(lunaUrano2 );
	planetaUrano.setListaLunas(lunasUrano);
	
	
	ArrayList<Luna> lunasNeptuno = new ArrayList<Luna>();
	Luna lunaNeptuno1 = new Luna();
	lunaNeptuno1.setNombre("Despina");
	lunaNeptuno1.setDiametro(160);
	lunaNeptuno1.setTiempoDeOrbita(0.40f);
	lunasNeptuno.add(lunaNeptuno1);
	
	Luna lunaNeptuno2 = new Luna();
	lunaNeptuno2.setNombre("Larissa");
	lunaNeptuno2.setDiametro(200);
	lunaNeptuno2.setTiempoDeOrbita(0.56f);
	lunasNeptuno.add(lunaNeptuno2);
	planetaNeptuno.setListaLunas(lunasNeptuno);
	
	
	ArrayList<Luna> lunasPluton = new ArrayList<Luna>();
	Luna lunaPluton1 = new Luna();
	lunaPluton1.setNombre("Charon");
	lunaPluton1.setDiametro(1207);
	lunaPluton1.setTiempoDeOrbita(6.387f);
	lunasPluton.add(lunaPluton1);
	
	Luna lunaPluton2 = new Luna();
	lunaPluton2.setNombre("Nix");
	lunaPluton2.setDiametro(44);
	lunaPluton2.setTiempoDeOrbita(24.856f);
	lunasPluton.add(lunaPluton2);
	
	
	
		//Se anexa planeta al sistema solar
	SistemaSolar sistemaSolar = new SistemaSolar();
	
	sistemaSolar.agregarPlaneta(planetaPluton);
	sistemaSolar.agregarPlaneta(planetaNeptuno);
	sistemaSolar.agregarPlaneta(planetaUrano);
	sistemaSolar.agregarPlaneta(planetaSaturno);
	sistemaSolar.agregarPlaneta(planetaJupiter);
	sistemaSolar.agregarPlaneta(planetaMarte);
	sistemaSolar.agregarPlaneta(planetaTierra);
	sistemaSolar.agregarPlaneta(planetaVenus);
	sistemaSolar.agregarPlaneta(planetaMercurio);
	
	
	//Se llama a los metodos para mostrar información solicitada
	sistemaSolar.mostrarPlanetas();
	sistemaSolar.mostrarPlanetasLunas();
	
	
	
	
	
	
	}
}
