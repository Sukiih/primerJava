//Desafio temperatura
public class Temperaturas {
    public static void main (String[] args){
        double temperaturaCelsius = 25.6;
        int temperaturaFahrenheit = (int) ((temperaturaCelsius * 1.8) + 32);

        String mensaje = "La temperatura en Celsius es %.1f y al convertirla en Fahrenheit equivale a: %d".formatted(temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(mensaje);
    }
}
