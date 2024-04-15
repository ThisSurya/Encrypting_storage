/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.mysurya.input;
import id.mysurya.output.Label;
import java.util.Scanner;
/**
 *
 * @author ceplo
 */
public class Input {
    String label;
    Scanner input = new Scanner(System.in);
    String value;
    
    public Input(String text){
        this.label = text;
    }
    
    public Input(){
        this.label = "";
    }
    
    public void draw() throws Exception{
        System.out.print("| " + label + " :");
        this.value = input.nextLine();
    }
    
    public String getValue(){
        return this.value;
    }
    
    public int getValueInt() throws Exception {
        int val = Integer.parseInt(value);
        return val;
    }
    
    public double getValueDouble() throws Exception {
        double val = Double.parseDouble(value);
        return val;
    }
}
