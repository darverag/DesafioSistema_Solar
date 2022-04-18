package Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import com.desafiolatam.model.Luna;
import com.desafiolatam.model.Planeta;

/*
 * crear pruebas unitarias con la dependencia de Junit:
 * 1.-Probar: las cantidades de Lunas por planeta (utilice assertEquals)
 * 2.-Los nombre de planetas, sus lunas ingresadas correctamente (utilice assertTrue) 
 * 3.-Comprobar que las cantidades de lunas (utilice assertTrue). 
 * 
 */
public class PlanetaTest {
	
@Test
	public void QLunasTest() {//Cantidad de lunas por planeta
		
		ArrayList<Luna> lunasMarteTest = new ArrayList<Luna>();
		Luna lunaMarteTest = new Luna("Deinos", 8, 1.263F);
		lunasMarteTest.add(lunaMarteTest);
		Planeta planetaTest = new Planeta("MartePlaneta", 6794, 227940000l, lunasMarteTest);
		
		assertEquals(1,planetaTest.getListaLunas().size());
	}
	
	@Test
	public void AgregarLunasTest() {
		
		ArrayList<Luna> lunasMarteTest = new ArrayList<Luna>();
		Luna lunaMarteTest = new Luna("Deinos", 8, 1.263F);
		lunasMarteTest.add(lunaMarteTest);
		Planeta planetaTest = new Planeta("MartePlaneta", 6794, 227940000l, lunasMarteTest);
		
		assertTrue(planetaTest.getListaLunas().size()>0);
	
	}
	
	
	@Test
	public void ComprobarQLunasTest() { //Comprobar cantidad de lunas
		
		ArrayList<Luna> lunasMarteTest = new ArrayList<Luna>();
		Luna lunaMarteTest = new Luna("Deinos", 8, 1.263F);
		lunasMarteTest.add(lunaMarteTest);
		Planeta planetaTest = new Planeta("MartePlaneta", 6794, 227940000l, lunasMarteTest);
		
		assertTrue(planetaTest.getListaLunas().size()==1);
	
	}
	

}
