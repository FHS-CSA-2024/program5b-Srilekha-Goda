import java.util.Scanner;

public class CarTester {

// add car
public static Car addCar() {
Scanner scanner = new Scanner(System.in);

System.out.print("Please enter the car's name: ");
String name = scanner.nextLine();

System.out.print("Please enter car's miles: ");
int miles = scanner.nextInt();

System.out.print("Please enter car's gallons: ");
int gallons = scanner.nextInt();

return new Car(name, miles, gallons);
}

// Main method
public static void main(String[] args) {
// Car 1's questions
Car car1 = addCar();
System.out.println(car1.toString());

System.out.println("------NEXT CAR-------------------------------------------");

// same for Car 2
Car car2 = addCar();
System.out.println(car2.toString());
}
}


// Output

/* 
Please enter the car's name: Honda Civic
Please enter car's miles: 234
Please enter car's gallons: 100
Honda Civic averaged 2.3 m/g
------NEXT CAR-------------------------------------------
Please enter the car's name: Toad Mobile
Please enter car's miles: 13
Please enter car's gallons: 7
Toad Mobile averaged 1.9 m/g
 */
