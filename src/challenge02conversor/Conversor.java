package challenge02conversor;
import javax.swing.JOptionPane;

/**
 * @author Iris Arias
 * Mi linkedin:  https://www.linkedin.com/in/iris628/
 *
 */
public class Conversor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 do {
		        String[] options = {"Conversor de Monedas", "Conversor de Temperatura"};
		        String selectedOption = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Menu Inicial", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		        if (selectedOption != null) {
		            if (selectedOption.equals("Conversor de Monedas")) {
		                ingresarCantidad();
		            } else if (selectedOption.equals("Conversor de Temperatura")) {
		                ingresarCantidadTemp();
		            }
		        }
		    } while (continuar());

	}
	//metodo para continuar o terminar 
	public static boolean continuar() {
	    int response = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Continuar", JOptionPane.YES_NO_OPTION);
	    return response == JOptionPane.YES_OPTION;
	}
	//ingresar cantidad de monedas
	public static double ingresarCantidad() {
	    double cantidad = 0;
	    String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir:", "Ingresar Cantidad", JOptionPane.PLAIN_MESSAGE);
	    if (input != null) {
	        try {
	            cantidad = Double.parseDouble(input);
	            convertirMoneda(cantidad);
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "Error: La cantidad ingresada no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	    return cantidad;
	}
	//ingresar grados de temperatura
	public static double ingresarCantidadTemp() {
	    double cantidad = 0;
	    String input = JOptionPane.showInputDialog(null, "Ingrese los Grados a convertir:", "Ingresar Cantidad", JOptionPane.PLAIN_MESSAGE);
	    if (input != null) {
	        try {
	            cantidad = Double.parseDouble(input);
	            convertirTemperatura(cantidad);
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "Error: La cantidad ingresada no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	    return cantidad;
	}
	//metodo para cada conversion de monedas
	public static void convertirMoneda(double cantidad) {
		String[] monedas = {"Dolar a Euros", "Dolar a Libras Esterlinas","Dolar a Yen Japones","Dolar a Won sul-coreano",
				"******","Euros a Dolar", "Libras Esterlinas a Dolar","Yen Japones a Dolar","Won sul-coreano a Dolar"};	
		String monedaDestino = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Monedas", JOptionPane.PLAIN_MESSAGE, null, monedas, monedas[0]);
	    
		if (monedaDestino != null) {
	                switch (monedaDestino) {
	                    case "Dolar a Euros":
	                        double conversionEuros = cantidad * 0.85;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + " USD son " + conversionEuros + " EUR", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Dolar a Libras Esterlinas":
	                        double conversionLibras = cantidad * 0.73;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + " USD son " + conversionLibras + " GBP", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Dolar a Yen Japones":
	                        double conversionYen = cantidad * 106.11;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + " USD son " + conversionYen + " JPY", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Dolar a Won sul-coreano":
	                        double conversionWon = cantidad * 1176.03;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + " USD son " + conversionWon + " KRW", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "******":
	                    	//sv,sflñsvfl
	                        break;
	                        
	                        /*****************/
	                    case "Euros a Dolar":
	                    	double resultado = cantidad * 1.22; // 1 Euro = 1.22 Dolares
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + " EUR son " + resultado + " USD", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Libras Esterlinas a Dolar":
	                        double conversionED = cantidad * 1.38;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + " GBP son " + conversionED + " USD", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Yen Japones a Dolar":
	                        double conversionJD = cantidad * 0.0094;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + " JPY son " + conversionJD + " USD", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Won sul-coreano a Dolar":
	                        double conversionWD = cantidad * 0.00089;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + " KRW son " + conversionWD + " USD", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    default:
	                        JOptionPane.showMessageDialog(null, "Error: Algo salio mal.", "Error", JOptionPane.ERROR_MESSAGE);
	              }
		}
	}
	//metodo para convertir a distintas escalas de temperatura
	public static void convertirTemperatura(double cantidad) {
		String[] temp = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine","De Celsius a Réaumur",
							"De Fahrenheit a Celsius","De Fahrenheit a Kelvin","De Fahrenheit a Rankine", "De Fahrenheit a Réaumur",
							"De Kelvin a Celsius","De Kelvin a Fahrenheit","De Kelvin a Rankine",
							"De Rankine a Celsius","De Rankine a Fahrenheit","De Rankine a Celsius",
							"De Réaumur a Celsius","De Réaumur a Fahrenheit"};	
		String tempSelec = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Monedas", JOptionPane.PLAIN_MESSAGE, null, temp, temp[0]);
	    
		if (tempSelec != null) {
           switch (tempSelec) {
               case "De Celsius a Fahrenheit":
                   double conversionCF = ( 9*cantidad )/5 + 32;
                   JOptionPane.showMessageDialog(null, cantidad + " C° son " + conversionCF + " F°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Celsius a Kelvin":
                   double conversionCK = cantidad + 273.15;
                   JOptionPane.showMessageDialog(null, cantidad + " C° son " + conversionCK + " K°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Celsius a Rankine":
                   double conversionCR = ( 9*cantidad )/5 + 491.67;
                   JOptionPane.showMessageDialog(null, cantidad + " C° son " + conversionCR + " Ra°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Celsius a Réaumur":
                   double conversionCRe = ( 4 * cantidad )/5 ;
                   JOptionPane.showMessageDialog(null, cantidad + " C° son " + conversionCRe + " Re°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Fahrenheit a Celsius":
                   double conversionFC = (5*( cantidad -32) )/9 ;
                   JOptionPane.showMessageDialog(null, cantidad + " F° son " + conversionFC + " C°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Fahrenheit a Kelvin":
                   double conversionFK =( (5*( cantidad -32) )/9 )+273.15;
                   JOptionPane.showMessageDialog(null, cantidad + " F° son " + conversionFK + " K°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Fahrenheit a Rankine":
                   double conversionRa = cantidad + 459.67;
                   JOptionPane.showMessageDialog(null, cantidad + " F° son " + conversionRa + " Ra°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Fahrenheit a Réaumur":
                   double conversionRe = (4 * (cantidad-32)) / 9;
                   JOptionPane.showMessageDialog(null, cantidad + " F° son " + conversionRe + " Re°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Kelvin a Celsius":
                   double conversionKC = cantidad - 273.15;
                   JOptionPane.showMessageDialog(null, cantidad + " K° son " + conversionKC + " C°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Kelvin a Fahrenheit":
                   double conversionKF = (9/5*(cantidad - 273.15)) +32;
                   JOptionPane.showMessageDialog(null, cantidad + " K° son " + conversionKF + " F°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Kelvin a Rankine":
                   double conversionKR = (9/5*(cantidad - 273.15)) +491.67;
                   JOptionPane.showMessageDialog(null, cantidad + " K° son " + conversionKR + " Ra°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Rankine a Celsius":
                   double conversionRC = (5/9*(cantidad - 491.67)) ;
                   JOptionPane.showMessageDialog(null, cantidad + " Ra° son " + conversionRC + " C°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Rankine a Fahrenheit":
                   double conversionRF = cantidad - 459.67 ;
                   JOptionPane.showMessageDialog(null, cantidad + " Ra° son " + conversionRF + " F°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Rankine a Kelvin":
                   double conversionRK = (5/9 * (cantidad - 491.67))+273.15 ;
                   JOptionPane.showMessageDialog(null, cantidad + " Ra° son " + conversionRK + " K°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Réaumur a Celsius":
                   double conversionReC = 5/4 * (cantidad)  ;
                   JOptionPane.showMessageDialog(null, cantidad + " Re° son " + conversionReC + " C°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Réaumur a Fahrenheit":
                   double conversionReF =( 9/4 * (cantidad) ) + 32 ;
                   JOptionPane.showMessageDialog(null, cantidad + " Re° son " + conversionReF + " F°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;      
           }
           
		}
	}

}
