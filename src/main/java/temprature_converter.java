/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafly Farhandika
 */

public class temprature_converter {
    
     // Celcius to Fahrenheit
    static double Celcius_to_Fahrenheit(double Celcius){
        double Fahrenheit = (Celcius * 9/5) + 32;
        double Fahrenheit = (Celcius * 9/5) + 32;
        return Fahrenheit;
    }
    // Celcius to Kelvin
    static double Celcius_to_Kelvin(double Celcius){
        double Kelvin = Celcius + 273.15;
        return Kelvin;
    }

    // Fahrenheit to Celcius
    static double Fahrenheit_to_Celcius(double Fahrenheit){
        double Celcius = (Fahrenheit - 32) * 5/9;
        return Celcius;
    }
    // Fahrenheit to Kelvin
    static double Fahrenheit_to_Kelvin(double Fahrenheit){
        double Kelvin = (Fahrenheit - 32) * 5/9 + 273.15;
        return Kelvin;
    }

    // Kelvin to Celcius
    static double Kelvin_to_Celcius(double Kelvin){
        double Celcius = Kelvin - 273.15;
        return Celcius;
    }
    // Kelvin to Fahrenheit
    static double Kelvin_to_Fahrenheit(double Kelvin){
        double Fahrenheit = (Kelvin - 273.15) * 9/5 + 32;
        return Fahrenheit;
    }

}
