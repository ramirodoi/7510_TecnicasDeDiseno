package TP_0;

public class Cola implements Queue  
{	
	private final String ERROR_MSJ_TOP_COLA_VACIA = "No se puede mostrar el elemento porque la Cola se encuentra vacia. Por favor agregue un elemento e intentelo denuevo.";
	private final String ERROR_MSJ_REMOVER_COLA_VACIA = "No se puede remover el elemento porque la Cola se encuentra vacia. Por favor agregue un elemento e intentelo denuevo.";
	
	private Nodo primerElemento = null;
	private Nodo ultimoElemento = null;
	private int cantidadDeElementos;
	
	public Cola()
	{
		this.cantidadDeElementos = 0;
	}
	
	public boolean IsEmpty()
	{
		return(this.primerElemento == null); 
	}
	
	public int Size()
	{
		return(this.cantidadDeElementos);
	}
	
	public void Add(Object valor)
	{
		Nodo nuevoNodo = new Nodo(valor);
		
        if (IsEmpty()) 
        {
            this.primerElemento = nuevoNodo;
            this.ultimoElemento = nuevoNodo;
        } 
        else 
        {
        	this.ultimoElemento.SetSiguiente(nuevoNodo);
        	this.ultimoElemento = nuevoNodo;
        }
        
        this.cantidadDeElementos++;
	}
	
	public Object Top() throws AssertionError
	{
		try
		{
			return(primerElemento.GetInformacion());
		}		
		catch(Exception ex)
		{
			throw(new AssertionError(this.ERROR_MSJ_TOP_COLA_VACIA));
		}
	}

	public void Remove() throws AssertionError
	{	
		try
		{
            this.primerElemento = primerElemento.GetSiguiente();
            this.cantidadDeElementos--;
        } 
		catch(Exception ex)
		{
			throw(new AssertionError(this.ERROR_MSJ_REMOVER_COLA_VACIA));
		}
	}
}
