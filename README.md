## Gestión de Biblioteca en Java

 Se trata de hacer un sencillo sistema de gestión de una biblioteca. Habrá tres clases: Libro, Revista y Autoría.
 
 La clase Librotendrá los siguientes atributos:
 
 -Título: de tipo String.  
 -Autoría: de tipo Autoria.  
 -Ejemplares: de tipo entero.Contiene el número total de ejemplares dedicho libroen la biblioteca, estén en préstamo o no.  
 -Prestados: de tipo entero.Contiene el número de ejemplares prestadosde dicho libro.  
 
 Tendrá dos métodos:
 
 -Prestar: Comprueba que efectivamentehay ejemplares disponibles para poder hacer el préstamo (que no estén todos prestados). 
 El método devuelve un número entero con el número de ejemplares disponibles en la biblioteca después de este préstamo, 
 o -1 encaso de que no se haya podido hacer (todos los ejemplares estaban prestados).  
 
 -Devolver: Comprueba que había ejemplares prestados y en caso afirmativo se devuelve. 
 Se actualizan los atributos necesarios.El métododevuelve un número entero con el número de ejemplares disponibles 
 en la biblioteca después de esta devolución, o -1 encaso de que no se haya podido hacer (no había ejemplares prestados).
 
 La clase Revistatendrá los siguientes atributos:
 
 -Título: de tipo String.  
 -Autoría: de tipo Autoria.  
 -Prestados: de tipo entero.
 
 Para las revistas suponemos que hay ejemplares ilimitados. Tiene los métodos prestary devolver, con el mismo funcionamiento que en la clase Libro. Se llevará la cuenta de los ejemplares prestados con el correspondiente atributo.  
 
 La clase Autoríatendrá tres atributos: el nombre, los apellidos (ambos de tipo String), y la fecha de nacimiento, de tipo LocalDate. Puedes leer aquí sobre el uso de esta librería.No tiene métodos.
 
## Programación de clases
 
 Programalas tres clases en Java, todas ellas dentro de un paquete que se llame “biblioteca”.  
 
 Todas lasclases tendrán todos los gettersy setters. Y los constructores que consideres necesarios (argumenta porqué has elegido eseo esos constructores enel javadocde los mismos).  
 
 Todas lasclases sobrescribirán el método toString(), imprimiendo la información de sus atributos.  
 
 Ninguna de las tres clases tendrá salidas ni entradas por pantalla (ningún System.out ni Scanner).
 
## Programación del main
 
 El main, que está dentro de la clase Biblioteca,tendrá el siguiente funcionamiento:  
 
 Mostrará por pantalla el siguiente menú:  
 
 1.Crea el libro  
 2.Crea la revista  
 3.Presta el libro  
 4.Devuelve el libro  
 5.Presta la revista  
 6.Devuelve la revista  
 0.Salir
 
 En caso de elegir la opción 1, se creará un objeto de la clase Libro y se pedirá por pantallalos siguientes campos: 
 título, número de ejemplares, nombre, apellidos, día, mes y año de nacimiento.Con estos cinco últimos datos se creará 
 el objeto Autoria.  
 
 Con la opción 2 será semejante al caso anterior, se pedirán todos los datos necesarios por pantalla. 
 
 Con las opciones 3, 4, 5 y6 se prestará o devolverá respectivamente cada libro. Cada una de estas opciones mostrará 
 por pantalla si se ha realizado con éxito o no el préstamo/devolución, y la cantidad de ejemplares disponiblesy en 
 préstamotras dicha operación.  
 
 Con la opción 0 se termina el programa.  
 
 El menú se repetirá constantemente hasta que se elija la opción 0. Con cualquier otro número que no exista en el menú, se repetirá por pantalla. 
 
 Importante recordar que cada opción del menú llevará a una funcióndentro de la clase Bibliotecaque ejecutará la lógica de dicha opción(pedir datos por
 pantalla, crear objetos, imprimir información...dependiendo de la opción)  
 
 Nota: En nuestra biblioteca solo habrá un libro y una revista, y trabajaremos con ellos. Si volvemos a elegir 
 “crealibro/revista”cuando ya había uno creado, se pisa el ejemplar creado anteriormente.Por tanto, si ya hay un objeto Libro o Revista construidos, antes de crear 
 el siguiente preguntaremos por pantalla si quiere borrar el anterior para construir uno nuevoborrando el anterior, es 
 decir, en la misma variable.
 
