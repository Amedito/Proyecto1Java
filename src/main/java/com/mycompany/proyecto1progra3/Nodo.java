public class Nodos {
	private String informacion;
	private Nodos padre;
	private Nodos nodoIzquierdo;
	private Nodos nodoDerecho;
	
	public Nodos(){
		this.informacion = "";
		this.nodoIzquierdo = null;
		this.nodoDerecho = null;
		this.padre = null;
	}
	
	public Nodos(String informacion) {
		this.informacion = informacion;
		this.nodoIzquierdo = null;
		this.nodoDerecho = null;
		this.padre = null;
	}
	
	public Nodos (Nodos op1, String pop, Nodos op2){
		this.informacion = pop;
		this.nodoIzquierdo = op2;
		this.nodoDerecho = op1;
		this.padre = null;
	}
	
	public Nodos getPadre() {
		return padre;
	}
	
	public void setPadre(Nodos padre){
		this.padre = padre;
	}
	
	public String getInformacion(){
		return informacion;
	}
	
	public void setInformacion(String informacion){
		this.informacion = informacion;
	}
	
	public Nodos getNodoIzquierdo() {
		return nodoIzquierdo;
	}
	
	public void setNodoIzquierdo(Nodos nodoIzquierdo){
		this.nodoIzquierdo = nodoIzquierdo;
	}
	
	public Nodos getNodoDerecho(){
		return nodoDerecho;
	}
	
	public void setNodoDerecho(Nodos nodoDerecho){
		this.nodoDerecho = nodoDerecho;
	}
}
