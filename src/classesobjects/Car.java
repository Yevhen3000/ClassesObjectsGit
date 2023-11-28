/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesobjects;

import java.util.Scanner;

/**
 *
 * @author JK
 *  OUTPUT EXAMPLE:
 *  Enter car's direction:
    Dublin
    The silver Volvo S60 is driving Dublin
    Enter car's direction:
    Cork
    The red Opel ASTRA is driving Cork
 */
public class Car {
    
    private String make;
    private String model = "S60";
    private Integer numWheels = 4;
    private String color = "silver";

    public Car(){
        make = "Volvo";
    }

    public Car(String make, String model, int numWheels, String color) {
        this.make = make;
        this.model = model;
        this.numWheels = numWheels;
        this.color = color;
    }    
    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Integer numWheels) {
        this.numWheels = numWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getUserInput(){
        String sDirection ="";
        Scanner sc  = new Scanner(System.in);
        boolean bInputOk = false;
        while (!bInputOk) {
            System.out.println("Enter car's direction:");
            try {
                sDirection = sc.nextLine();
                bInputOk = true;
            } catch (Exception e){
                System.out.println("Ops, something went wrong!");
            }
        }
        return sDirection;
    }
    
    public void drive(){
        String dir = getUserInput();
        //System.out.println("The " + color + " " + make +  " " + model + " is driving " + dir); //Step1
        System.out.printf("The %s %s %s is driving %s \n", color,make,  model, dir );
    }
}
