
public class IMCCalculadora {
  // Vamos a crear una función para calcular el IMC de una persona

  // Función que calcula el IMC y devuelve la clasificación
  public static String calcularIMC(double peso, double altura) {
    // Calcular el IMC (altura en metros)
    double imc = peso / (altura * altura);
    
    // Clasificar según el valor del IMC
    if (imc <= 18.5) {
        return "Infrapeso";
    } else if (imc <= 25.0) {
        return "Normal";
    } else if (imc <= 30.0) {
        return "Sobrepeso";
    } else {
        return "Obeso";
    }
}

public static void main(String[] args) {
    double peso = 65.5;    // Peso en kilogramos
    double altura = 1.60;  // Altura en metros
    //si fuera en cm seria -> double altura = 1.60 / 100;
    
    // Llamamos a la función y mostramos el resultado
    String tipoImc = calcularIMC(peso, altura);
    System.out.println("Clasificación del IMC: " + tipoImc);
}
}

