package TP_0;

public class Nodo 
{
	private Object informacion = null;
	private Nodo siguiente = null;
	
	public Nodo()
	{
	}
	
	public Nodo(Object valor)
	{
		this.informacion = valor;
	}
	
	public Object GetInformacion()
	{
		return(this.informacion);
	}
	
	public void SetInformation(Object valor)
	{
		this.informacion = valor;
	}
	
	public Nodo GetSiguiente()
	{
		return(this.siguiente);
	}
	
	public void SetSiguiente(Nodo sig)
	{
		this.siguiente = sig;
	}
}
