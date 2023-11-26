package ar.com.codoacodo.herencia;

public class Libro extends Articulo {
	
	private String isbn;

	public Libro(
			String titulo, 
			Float precio, 
			String img
			) {
		
		//libro no puede nacer si primero no nace el articulo
	    //alt + shift + s - generate constructos from Superclass . Super hace referenica al PADRE
		
		super(titulo, precio, img); //nace Articulo Super parentesis es invocar al constructor del padre, super es como "New Articulo". 
		  // super.tituloes ir a un atributo o  un metodo del padre		
		// ahora puedo usar this		
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override // sobreescritura de Libro con respecto a Object 
	public String toString() {
		//String toStringPadre = super.toString(); 
		//String toStringHijo = ", Libro [isbn=" + isbn + "]";
		//return toStringPadre + toStringHijo;
		return super.toString() + ", Libro [isbn=" + isbn + "]";
	}
		
	
	
}
 