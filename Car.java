public class Car {
// Private class vars
private String carName;
private int milesDriven;
private int gallonsUsed;

// Constructor with no parameters
//this. - same name
public Car() {
this.carName = "";
this.milesDriven = 0;
this.gallonsUsed = 0;
}

// Constructor with parameters identify the type of the var
public Car(String carName, int milesDriven, int gallonsUsed) {
this.carName = carName;
this.milesDriven = milesDriven;
this.gallonsUsed = gallonsUsed;
}

// methods
public String getCarName() {
return carName;
}

public void setCarName(String carName) {
this.carName = carName;
}

public int getMilesDriven() {
return milesDriven;
}

public void setMilesDriven(int milesDriven) {
this.milesDriven = milesDriven;
}

public int getGallonsUsed() {
return gallonsUsed;
}

public void setGallonsUsed(int gallonsUsed) {
this.gallonsUsed = gallonsUsed;
}

//calculate avg miles per gallon
public double calculateAverage() {
if (gallonsUsed == 0) {
return 0; 
}
double average = (double) milesDriven / gallonsUsed;
return Math.round(average * 10.0) / 10.0; // Round to nearest 10th
}

// return the outcome

public String toString() {
return carName + " averaged " + calculateAverage() + " m/g";
}
}


