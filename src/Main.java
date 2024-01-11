import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cadena1,cadena2,cadena3,concatenado ,salida;

        //Primeros inputs
        cadena1="break3ing news8:";
        cadena2="2A 1circle is round!";
        //Concatenando las cadenas para mandarlas a dar formato
        concatenado=cadena1.concat(" ").concat(cadena2);
        //Guardando en la variable salida el return recibido por parte de
        //la función para dar formato a la cadena concatenada
        salida=dividirYFormatear(concatenado);
        System.out.println(salida);

//******************************************************************************************

        //Segundos inputs
        cadena1="";
        cadena2="Fresh fried fish - fish fresh fried";
        //Concatenando las cadenas para mandarlas a dar formato
        concatenado=cadena1.concat(cadena2);
        //Guardando en la variable salida el return recibido por parte de
        //la función para dar formato a la cadena concatenada
        salida=dividirYFormatear(concatenado);
        System.out.println(salida);

//******************************************************************************************

        //Tercer input
        cadena1="2here2";
        cadena2="is";
        cadena3=" our STRING";
        //Concatenando las cadenas para mandarlas a dar formato
        concatenado=cadena1.concat(" ").concat(cadena2).concat(cadena3);
        //Guardando en la variable salida el return recibido por parte de
        //la función para dar formato a la cadena concatenada
        salida=dividirYFormatear(concatenado);
        System.out.println(salida);

//******************************************************************************************

        //Cuarto input
        cadena1="123";
        cadena2="eat;sleep;repeat";
        cadena3="321";
        //Concatenando las cadenas para mandarlas a dar formato
        concatenado=cadena1.concat(cadena2).concat(cadena3);
        //Guardando en la variable salida el return recibido por parte de
        //la función para dar formato a la cadena concatenada
        salida=dividirYFormatear(concatenado);
        System.out.println(salida);


    }

    public static String dividirYFormatear(String cadenaOriginal) {
        // Dividir la cadena en palabras usando el espacio como separador
        String[] palabras = cadenaOriginal.split("\\s+");

        // Filtrar y formatear las palabras eliminando los números
        String nuevaCadena = Arrays.stream(palabras)
                .map(Main::formatearPalabra)
                .collect(Collectors.joining(" "));

        return nuevaCadena;
    }

    public static String formatearPalabra(String palabra) {
        // Eliminar los números de la palabra y formatearla
        palabra = palabra.replaceAll("\\d", "");

        // Capitalizar la primera letra y la letra después de cada punto y coma
        StringBuilder resultado = new StringBuilder();
        boolean capitalizar = true;

        for (char c : palabra.toCharArray()) {
            if (Character.isLetter(c)) {
                resultado.append(capitalizar ? Character.toUpperCase(c) : Character.toLowerCase(c));
                capitalizar = false;
            } else if (c == ';') {
                capitalizar = true;
                resultado.append(c);
            } else {
                resultado.append(c);
            }
        }

        return resultado.toString();
    }
}