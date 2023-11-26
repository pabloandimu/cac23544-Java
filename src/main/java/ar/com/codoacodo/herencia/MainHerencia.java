package ar.com.codoacodo.herencia;

public class MainHerencia {

	/*public MainHerencia() {
		// TODO Auto-generated constructor stub
	}*/ // tiene un constructor por defecto que no usamos

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear un articulo
		Articulo a1 = new Articulo("titulo1", 150.5f, "http://url-com/bla1.jpg");
		
		//lamo al ster porque autor es null
		a1.setAutor("autor a1");
		
		//metodos disponibles
		//System.out.println(a1);
		
		
		//Pero también lo puedo crear siendo Hijo h = new Hijo() 
		
		Musica m1 = new Musica("musica1", 180f, "http://url-com/bla2.jpg");
		
		//lamo al set porque autor es null
		m1.setAutor("autor m1"); // esto es de articulo
		String[] temas = new String[] {"t1", "t2", "t3"}; // aunque es un vector (arreglo) se pone entre llaves los temas. 
		m1.setTemas(temas);// esto es de musica
		
		//System.out.println(m1);
		
		//ahora creamos una pelicula
		
		Articulo p1 = new Pelicula ("peli1", 858f, "http://rul-com/bla3.jpg)");
		p1.setAutor("autor de pelicula, Francis Ford Copolla");
		
		System.out.println(p1);
		System.out.println("--------------------");
		
		Pelicula peli = (Pelicula)p1;//down castin, me meto en la Mamuska, en la peli, que está  dentro del articulo, y completo/seteo lo que está adentro
		//lo propio de peli (pelicula)
		//Pelicula peli = (Pelicula)p1 sino voy a usar la instancia peli, también puede se .setFormato("DVD");
		System.out.println("Abro la muñeca Rusa Mamushka y le seteo lo que le falta, lo que le es propio a Pelicula - peli - ");
		peli.setProductora("Warner Brothers");
		// o asi ((Pelicula)p1).setProductora("Warner Brothers");
		peli.setFormato("DVD");

		System.out.println("Esto es peli: -- " + peli);
		System.out.println("Esto es p1 completo: --  " + p1);
		
		//vector para guardar las instancias
		
		Articulo[] resultados = new Articulo[3]; 
		resultados[0] = a1;
		resultados[1] = m1;
		resultados[2] = p1;
		
		
		for(Articulo aux : resultados) {
			System.out.println(aux);
		}
		
	}

}
