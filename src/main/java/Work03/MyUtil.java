/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Work03;

public class MyUtil {
    
    /*
    private double weight;
    private double height;
    private int v1;
    private int v2;
    private int v3;

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getV1() {
        return v1;
    }

    public int getV2() {
        return v2;
    }

    public int getV3() {
        return v3;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public void setV3(int v3) {
        this.v3 = v3;
    }
      
    
    public double calculateBMI(){
        double BMI = this.weight / (this.height * this.height);
        return BMI;
    }
    
    */
    
    public static double calculateBMI(double weight, double  height){
        double BMI = weight / Math.pow(height, 2);
        return BMI;
    }
    
    public static double average(int v1, int v2, int v3){
        double average = (v1 + v2 + v3) / 3;
        return average;
    }
 
}
