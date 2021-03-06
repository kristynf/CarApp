public class Car extends Vehicle {
    private String make;
    private String color;
    private String acceleration;

    public Car() {

    }

    public Car(String make, String color, String acceleration) {
        this.make = make;
        this.color = color;
        this.acceleration = acceleration;
    }





    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(String acceleration) {
        this.acceleration = acceleration;
    }

    public void carStart(){
        System.out.println("The " +color +" " +make+" is starting.");
    }

    public void accelerate() {
        System.out.println("The " +color +" " +make+ " is accelerating.");
    }

    public String setSpeed(String acceleration) {
        return "The Speed of the " +color+" " +make+" is: " + acceleration +" mph.";
    }

    public void carStop(){
        System.out.println("The "+color+" " +make +" has stopped.");
    }

    /*public void carEmissionTest2(){
        if(true){
            System.out.println("The "
        }*/
    }








    /*Create a class called Car. The Car class should inherit from the Vehicle class. Car should contain the following:

private member variables
        a default constructor
        an overloaded constructor
        methods which return a string indicating each task the car is performing.
        For example, the accelerate method will return a string that says
        "The car is accelerating" and the setSpeed(90) method will return a string that
        says "The Speed is 90 mph". The application will also contain getters and setters for each private member variable.

        Create another class called CarApp which contains the main method. In the main method create an instance of a Car.

        Then print the output of the different methods as the car object is "operated".

        Your output should look something like this:

        The red Porsche is starting
        The red Porsche is accelerating
        The red Porsche is going 50 mph
        The red Porsche is stopped

        Be creative and make up your own methods if you like.

        Create a second instance of the car once your first car is working. Set its private member variables in the main method.
        Now you can call the methods of the second car in between the calls to the methods of the first car.
        Your program will keep the two separate. Here's an example. Your mileage may vary.

        The red Porsche is starting
        The blue Jetta is starting
        The red Porsche is accelerating
        The blue Jetta is accelerating
        The blue Jetta has stopped to have its emissions checked
        The blue Jetta passes its emission test
        The red Porsche is going 50 mph
        The red Porsche is stopped
        The blue Jetta just passed the red Porsche*/
