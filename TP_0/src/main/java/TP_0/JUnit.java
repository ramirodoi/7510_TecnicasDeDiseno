package TP_0;

import org.junit.Test;
import junit.framework.TestCase; 

public class JUnit extends TestCase 
{
	// -*-*-*-*-*
	// Test Nodo.
	// -*-*-*-*-*
	@Test
	public void test_Nodo_NuevoNodo()
	{
		Nodo nodo = new Nodo();
		
		assertNotNull(nodo);
	}
	
	@Test
	public void test_Nodo_NuevoNodo_GetSiguiente()
	{
		Nodo nodo = new Nodo();
		
		assertEquals(null, nodo.GetSiguiente());
	}
	
	@Test
	public void test_Nodo_NuevoNodo_GetInformacion()
	{
		Nodo nodo = new Nodo();
		
		assertEquals(null, nodo.GetInformacion());
	}
	
	@Test
	public void test_Nodo_GetInformacion()
	{
		Nodo nodo = new Nodo(9);
		
		assertEquals(9, nodo.GetInformacion());
	}
	
	@Test
	public void test_Nodo_GetSiguiente()
	{
		Nodo nodo1 = new Nodo();
		Nodo nodo2 = new Nodo();
		nodo1.SetSiguiente(nodo2);
		
		assertNotSame(null, nodo1.GetSiguiente());
	}
	
	@Test
	public void test_Nodo_GetSiguiente2()
	{
		Nodo nodo1 = new Nodo();
		Nodo nodo2 = new Nodo(7);
		nodo1.SetSiguiente(nodo2);
		
		assertEquals(7, nodo1.GetSiguiente().GetInformacion());
	}
		
	// -*-*-*-*-*
	// Test Cola.
	// -*-*-*-*-*	
	@Test
	public void test_Cola_NuevaCola()
	{
		Cola cola = new Cola();
		
		assertNotNull(cola);
	}
	
	@Test
	public void test_Cola_Size_UnElemento() 
	{
		Cola cola = new Cola();
		cola.Add(1);
		
		assertEquals(1, cola.Size());
	}
	
	@Test
	public void test_Cola_Size_VariosElementos() 
	{
		Cola cola = new Cola();
		cola.Add(1);
		cola.Add(2);
		cola.Add(3);
		
		assertEquals(3, cola.Size());
	}
	
	@Test
	public void test_Cola_Size_NingunElemento() 
	{
		Cola cola = new Cola();
		
		assertEquals(0, cola.Size());
	}
	
	@Test
	public void test_Cola_IsEmpty_False()
	{
		Cola cola = new Cola();
		cola.Add(3);
		
		assertFalse(cola.IsEmpty());
	}
	
	@Test
	public void test_Cola_IsEmpty_True()
	{
		Cola cola = new Cola();
		
		assertTrue(cola.IsEmpty());
	}
	
	@Test
	public void test_Cola_Add_UnElemento()
	{
		Cola cola = new Cola();
		cola.Add(3);
		
		assertEquals(3, cola.Top());
	}
	
	@Test
	public void test_Cola_Add_VariosElementos()
	{
		Cola cola = new Cola();
		cola.Add(7);
		cola.Add(17);
		cola.Add(27);
		
		assertEquals(7, cola.Top());
	}
	
	@Test
	public void test_Cola_Remove_UnElemento()
	{
		Cola cola = new Cola();
		cola.Add(3);
		cola.Remove();
		
		assertTrue(cola.IsEmpty());
	}
	
	@Test
	public void test_Cola_Remove_VariosElementos()
	{
		Cola cola = new Cola();
		cola.Add(17);
		cola.Add(7);
		cola.Remove();
		
		assertEquals(7, cola.Top());
	}
	
	@Test(expected = AssertionError.class)
	public void test_Cola_Remove_NingunElemento()
	{
		Cola cola = new Cola();
		cola.Remove();
	}	
	
	@Test
	public void test_Cola_Top_UnElemento()
	{
		Cola cola = new Cola();
		cola.Add(3);
		Object numero = cola.Top();
		
		assertEquals(3, numero);
	}
	
	@Test
	public void test_Cola_Top_VariosElementos()
	{
		Cola cola = new Cola();
		cola.Add(3);
		cola.Add(5);
		Object numero = cola.Top();
		
		assertEquals(3, numero);
	}	
	
	@Test(expected = AssertionError.class)
	public void test_Cola_Top_NingunElemento()
	{
		Cola cola = new Cola();
		Object numero = cola.Top();
	}	
}
