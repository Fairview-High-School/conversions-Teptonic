import java.util.Scanner;

public class Converters {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Select a conversion type:");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Kilometers to Miles");
        System.out.println("3: Grams to Ounces");
        System.out.println("4: Meters to Feet");
        System.out.println("5: Liters to Gallons");
        System.out.println("6: Kilograms to Pounds");
        System.out.println("7: Celsius to Kelvin");
        System.out.println("8: Hours to Minutes");
        System.out.println("9: Days to Hours");
        System.out.println("10: Meters to Inches");

        int selection = keyboard.nextInt();
        keyboard.nextLine();  // Consume the newline

        // Conversion for Celsius to Fahrenheit
        if (selection == 1) {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
        }

        // Conversion for Kilometers to Miles
        if (selection == 2) {
            System.out.println("Enter Kilometers: ");
            double kilometers = keyboard.nextDouble();
            keyboard.nextLine();
            double miles = kilometers * 0.621371;
            System.out.println(kilometers + " kilometers is " + miles + " miles");
        }

        // Conversion for Grams to Ounces
        if (selection == 3) {
            System.out.println("Enter Grams: ");
            double grams = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = grams * 0.035274;
            System.out.println(grams + " grams is " + ounces + " ounces");
        }

        // Conversion for Meters to Feet
        if (selection == 4) {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters * 3.28084;
            System.out.println(meters + " meters is " + feet + " feet");
        }

        // Conversion for Liters to Gallons
        if (selection == 5) {
            System.out.println("Enter Liters: ");
            double liters = keyboard.nextDouble();
            keyboard.nextLine();
            double gallons = liters * 0.264172;
            System.out.println(liters + " liters is " + gallons + " gallons");
        }

        // Conversion for Kilograms to Pounds
        if (selection == 6) {
            System.out.println("Enter Kilograms: ");
            double kilograms = keyboard.nextDouble();
            keyboard.nextLine();
            double pounds = kilograms * 2.20462;
            System.out.println(kilograms + " kilograms is " + pounds + " pounds");
        }

        // Conversion for Celsius to Kelvin
        if (selection == 7) {
            System.out.println("Enter Celsius: ");
            double celsiusToKelvin = keyboard.nextDouble();
            keyboard.nextLine();
            double kelvin = celsiusToKelvin + 273.15;
            System.out.println(celsiusToKelvin + " degrees Celsius is " + kelvin + " Kelvin");
        }

        // Conversion for Hours to Minutes
        if (selection == 8) {
            System.out.println("Enter Hours: ");
            double hours = keyboard.nextDouble();
            keyboard.nextLine();
            double minutes = hours * 60;
            System.out.println(hours + " hours is " + minutes + " minutes");
        }

        // Conversion for Days to Hours
        if (selection == 9) {
            System.out.println("Enter Days: ");
            double days = keyboard.nextDouble();
            keyboard.nextLine();
            double hoursFromDays = days * 24;
            System.out.println(days + " days is " + hoursFromDays + " hours");
        }

        // Conversion for Meters to Inches
        if (selection == 10) {
            System.out.println("Enter Meters: ");
            double metersToInches = keyboard.nextDouble();
            keyboard.nextLine();
            double inches = metersToInches * 39.3701;
            System.out.println(metersToInches + " meters is " + inches + " inches");
        }

        keyboard.close();
    }
}

