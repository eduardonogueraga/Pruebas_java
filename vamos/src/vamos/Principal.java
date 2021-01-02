package vamos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Principal {

	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//datos_prueba1();
		//datos_prueba3();
		//Math.round(num/10.0) * 10
	
		for (int i = 0; i < 24; i++) {
		
			for (int j = 0; j < 60; j++) {
				
				
				System.out.print(i + ":" + j + ":");
				System.out.println(RangoHora(21, 23, i, j, 0, 0));
				
			}
			
			
			
			
		}
		
		
		
	}
	
	static void notToShow() {
		//No mostrar aun se construye el chiste
	}


	static void nuevoMetodoCommit() {
		//Hola buenos dias;
		//Listo para production
	}

	static void nuevoMetodoCommit2() {
		//Segundo metodo ;
	}
	
	static void notToShow2() {
		//Sigue bajando no mostrar
	}
	
	static void nuevoMetodoCommit3() {
		//Tercer metodo ;
	}
	
	static void nuevoMetodoCommit4() {
		//Nueva implementacion desde develop
	}
	
	static void notToShow3() {
		//No mostrar este metodo en master
	}
	
	
	
	
	
	
	static void nuevoMetodoCommit5() {
		//Nueva implementacion desde develop
		//2021
	}
	
	
	
	
	static void notToShow4() {
		//No mostrar este metodo en master
	}
	
	
	
	static void datos_prueba1() {
		
		for (int i = 0; i < 5; i++) {
			int id = 146;
			int codigo_edificio = 110;
			int ramd1 = (int) (Math.random()*3+0);
			int ramd2= (int) (Math.random()*9+0);
			int aforo= (int) (Math.random()*90+30);
			String base ="INSERT INTO `salas` (`cod_sala`, `descripcion`, `aforo`, `cod_edificio`, `disponibilidad`, `cod_vigencia`, `capacidad_m2`) ";
			String hola = base;
			System.out.println(hola +"VALUES ('"+ (id+i) + "', 'Aula"+" 0"+ramd1+ramd2+"', '"+Math.round(aforo/10.0) * 10+"', '"+codigo_edificio+"', 'disponible', '100', '"+Math.round((aforo+20)/10.0) * 10+"');");
			
		}
		
	}
	
	
	static void datos_prueba2() {
		
		for (int j = 0; j < 11; j++) {
			
			for (int i = 0; i < 9; i++) {
				int id = 100+j;
				int codigo_recurso = 100 +i;
				int cantidad= (int) (Math.random()*60+10);
				String base ="INSERT INTO `coches_fun`.`recursos_por_edificio` (`cod_edificio`, `id_recursos`, `cantidad_sin_asignar`) ";
				String hola = base;
				System.out.println(hola +"VALUES ('"+id+"', '"+codigo_recurso+"', '"+Math.round(cantidad/10.0) * 10+"');");
				
			}
			
			
		}
		
		
	
		
	}
	
	
	static void datos_prueba3() {
		
		String[] apellidos = {"Peréz", "Goméz", "García", "Navarro", "Ayala", "Amador", "Suárez", "Soler", "Otero", "Torre",
								"Jiménez", "Hernández", "Huerta", "Fernández", "Flores", "De la Cruz", "Calleja", "Bernal", "Bautista", "Alarcón",
		                          "Ortiz", "Ripoll", "Buendia", "Fernan", "Amor", "Perea", "Ibarra", "Gonzalez", "Rojas", "Molina"};
		
		String[] nombres = {"Antonio", "Manuel", "Jose", "Francisco", "David", "Daniel", "Daniel", "Miguel", "Pedro", "Pablo",
				"Carlos", "Anders", "Andre", "Irene", "Nuria", "Hector", "Felipe", "Jaime", "Paula", "Fausto",
				"María", "Carmen", "Isabel", "Laura", "Cristina", "Marta", "Lucía", "Dolores", "Eustasia", "Alicia"};
	
			for (int i = 5; i < 301; i++) {
				int size = 	apellidos.length;
				int ramdom= (int) (Math.random()*(size-1)+0);
				int ramdom2= (int) (Math.random()*(size-1)+0);
				int ramdom3= (int) (Math.random()*(size-1)+0);
				int ramdom4= (int) (Math.random()*(size-1)+0);
				int numero= (int) (Math.random()*6000000+1000000);
				String base ="INSERT INTO usuario_2 (id, nombre, apellido1, apellido2, tipo, sol_correo, telefono) ";
				String hola = base;
				System.out.println(hola +"VALUES ('"+i+"', '"+nombres[ramdom2]+"', '"+apellidos[ramdom]+"',  '"+apellidos[ramdom3]+"','solicitante', '"+nombres[ramdom2].toLowerCase()+"@"+apellidos[ramdom].toLowerCase().replace(' ', '_')+apellidos[ramdom3].toLowerCase().replace(' ', '_')+ramdom4+"', '98"+numero+"');");
				
			}
			
			
	
		
	}
	
	
	public static void pruebasArray() {
		
		



		String asuntoMensaje = "";
		int[] mapSensor= {0,2,2,1};
		
		
		int[] MAX_SALTO= {1,3,2,2};
		String[] zonas = {"PUERTA","COCHERA","PORCHE","ALMACEN"};
		byte cont = 0;
		
		for (int i = 0; i < mapSensor.length; i++) {

			if(mapSensor[i] == MAX_SALTO[i]) {
				//Salto principal 
				if(zonas[i] == ("PUERTA")) {
					asuntoMensaje = "PUERTA DE LA COCHERA ABIERTA";
				}else {
					asuntoMensaje = "MOVIMIENTO DETECTADO EN "+zonas[i];
				}


				for (int j= 0; j < mapSensor.length; j++) {
					if((mapSensor[j] != 0)&&(mapSensor[j] != MAX_SALTO[j])) {
						//Saltos secundarios
				
						if(cont == 0) {
							asuntoMensaje += " JUNTO CON MOVIMIENTO EN: "+zonas[j];
							cont++;
							
						}else {
							asuntoMensaje += " Y "+zonas[j];
						}

					}
				}
			}
		}
		
		System.out.println(asuntoMensaje);
		
		
	
		
		
		
		
	}
	
	public static boolean RangoHora(int hora_inicio, int hora_fin, int HORA_NOW, int MIN_NOW, int min_inicio, int min_fin) {

		int aux=0;
		
		if(hora_inicio > hora_fin) { //Si hay diferencia entre dias entrara aqui

			if(HORA_NOW >= hora_inicio) {

				hora_fin = hora_fin +24; //Hasta las 12 contempla horas posteriores como mayores(+24 horas)

			}

			if(HORA_NOW <= 23){ //Cuando son menos de las 12 contempla la hora de inicio como inferior (-24 horas)

				hora_inicio = hora_inicio - 24;

			}

			aux = 24; //Ajusta el tiempo las primeras horas del ultimo dia
		}else {
			aux = 0;
		}

		
		if(HORA_NOW == hora_inicio+aux) {

			if((HORA_NOW >= hora_inicio && MIN_NOW >= min_inicio) && (hora_fin > HORA_NOW)) { 

				return true;
			}else {
				return false;
			}


		}else if(HORA_NOW == hora_fin) {

			if((HORA_NOW >= hora_inicio) && (hora_fin >= HORA_NOW && MIN_NOW < min_fin )) { 

				return true;
			}else {
				return false;
			}

		}else if (HORA_NOW != hora_inicio && HORA_NOW != hora_fin){

			if((HORA_NOW >= hora_inicio ) && (hora_fin > HORA_NOW)) { 

				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}


	}	
}
