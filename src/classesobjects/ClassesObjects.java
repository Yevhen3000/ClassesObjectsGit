/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesobjects;

/**
 *
 * @author User
 */
public class ClassesObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car oneCar = new Car();
        oneCar.setColor("blue");
        oneCar.drive();
        Car otherCar = new Car("Opel","ASTRA",4,"red");
        otherCar.drive();
    }
    
}
