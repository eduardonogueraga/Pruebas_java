package pruebas_etiquetas;

public class EtiquetasSd {

	
	static String cadena = ("VAR1<v>45</v>;"
			+ "VAR2<v>23</v>;"
			+"VAR3<v>456</v>;"
			+ "VAR4<v>1000</v>;"); 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.print("ahhh java otra vez noooo");
		
		
		//StringBuilder cadena = new StringBuilder(); 

		//String mayusIn = "<mayus>";
		//String mayusOut = "</mayus>";

		//cadena.append("Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer."); 
		
		/*
		String cadena = ("<i>VAR1<v>45</v></i>"
					+ "<i>VAR2<v>23</v></i>"); 
*/
	
		int casa = getValorPropiedad2("VAR2");
		
		System.out.println(casa);

		
		setPropiedad("VAR2", "67");
		
		
		casa = getValorPropiedad2("VAR2");
		
		System.out.println(casa);
		
		//getValorPropiedad(cadena);
		//System.out.println( textoMayus(cadena, mayusIn, mayusOut ));
		
	}
	
	public static void getValorPropiedad(String cadena) {

		String VALOR_IN = "<v>";
		String VALOR_OUT = "</v>";
		
		//System.out.println(cadena.substring(0, 4));
		//System.out.println(cadena.indexOf("<i>"));
		
		int puntero_instruccion = 0;
		String [] instrucciones = cadena.split(";");
		
		
		for (int i = 0; i < instrucciones.length; i++) {
			
			//System.out.println(instrucciones[i]);
			if(instrucciones[i].contains("VAR4")) {
				puntero_instruccion = i;
			}
		}
		
		
		System.out.println("EL nombre se encuentre en la instruccion numero: "+puntero_instruccion);
		
		System.out.println(instrucciones[0].indexOf(VALOR_IN)+VALOR_IN.length());
		System.out.println(instrucciones[0].indexOf(VALOR_OUT));
		System.out.println(instrucciones[0].substring(4, 9));
		System.out.println(instrucciones[0].substring(instrucciones[0].indexOf(VALOR_IN)+VALOR_IN.length(), instrucciones[0].indexOf(VALOR_OUT)));
	
	}
	
	

	
	public static int getValorPropiedad2(String nombreVar) {
		
		
		String VALOR_IN = "<v>";
		String VALOR_OUT = "</v>";
		/*
		String cadena = ("VAR1<v>45</v>;"
				+ "VAR2<v>23</v>;"
				+"VAR3<v>456</v>;"
				+ "VAR4<v>1000</v>;"); 
		*/
		
		int puntero_propiedad = 0;
		String valorPropiedead="";
		
		String [] instrucciones = cadena.split(";");
		
		for (int i = 0; i < instrucciones.length; i++) {
			
			if(instrucciones[i].contains(nombreVar)) {
				puntero_propiedad = i;
			}
		}
		
		valorPropiedead = instrucciones[puntero_propiedad].substring(instrucciones[puntero_propiedad].indexOf(VALOR_IN)+VALOR_IN.length(), instrucciones[puntero_propiedad].indexOf(VALOR_OUT));
		
		
		return Integer.parseInt(valorPropiedead);
		
	}
	
	
	
	public static void setPropiedad(String nombreVar, String nuevoValor) {
		
		String VALOR_IN = "<v>";
		String VALOR_OUT = "</v>";
		/*
		String cadena = ("VAR1<v>45</v>;"
				+ "VAR2<v>23</v>;"
				+"VAR3<v>456</v>;"
				+ "VAR4<v>1000</v>;"); 
	*/	
		
		int puntero_propiedad = 0;
		String valorAnterior="";
		
		String [] instrucciones = cadena.split(";");
		
		for (int i = 0; i < instrucciones.length; i++) {
			
			if(instrucciones[i].contains(nombreVar)) {
				puntero_propiedad = i;
			}
		}
		
		valorAnterior = instrucciones[puntero_propiedad].substring(instrucciones[puntero_propiedad].indexOf(VALOR_IN)+VALOR_IN.length(), instrucciones[puntero_propiedad].indexOf(VALOR_OUT));
		instrucciones[puntero_propiedad] = instrucciones[puntero_propiedad].replaceAll(valorAnterior, nuevoValor);
		//instrucciones[puntero_propiedad].replaceAll(valorAnterior, nuevoValor);
		
		
		String aux = "";
		for (int i = 0; i < instrucciones.length; i++) {

			aux += instrucciones[i];
		}
		
	//Borrar contenido prop
	//Acutalizar este contenido

		System.out.println(aux);
	}
	
	
	/*
	public static String textoMayus(StringBuilder cadena, String in, String out) {


		String texto ="";
		String mayus ="";
		

		int dimension = pedirDimension(cadena, in);  //Se pide la dimension para los arrays que guardan las posiciones de las etiquetas

		int[] open = new int[dimension]; 
		int[] close = new int[dimension];


		open[dimension-1]=cadena.length();  //Ultima posicion del array para el fin de cadena
		close[dimension-1]=cadena.length();



		rellenarArray(cadena, in, open);
		rellenarArray(cadena, out, close);



		for (int i = 0; i < dimension-1; i++) {

			if(i==0) {
				texto= cadena.substring(i, open[i]);       //Desde el comienzo hacia la primera posicion de open
			}

			mayus= cadena.substring(open[i]+in.length(),close[i] );   //Desde open hasta close saltando open

			texto=texto + mayus.toUpperCase();  //Mayus

			mayus= cadena.substring(close[i]+out.length(),open[i+1] );  //Desde close hasta open saltando close

			texto=texto + mayus;  //Minuscula


		}



		return texto;
	}


	public static void rellenarArray(StringBuilder cadena, String in, int[] a) {
		int cont =0;
		for (int index = cadena.indexOf(in); index >= 0; index = cadena.indexOf(in, index + 1)) {

			a[cont]=index;
			cont++;

		}


	}

	public static int pedirDimension(StringBuilder cadena, String in) {

		int dimension=0;

		for (int index = cadena.indexOf(in); index >= 0; index = cadena.indexOf(in, index + 1)) {

			dimension++;
		}

		dimension++; //Suma una posicion extra para alojar la posicion final del string cadena
		return dimension;
	}

*/	

}



