/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.mysurya.output;

/**
 *
 * @author ceplo
 */
public class HLine {
    int width;
    
    public HLine(int width){
        this.width = width;
    }
    
    public void draw() throws Exception {
        String word = "=";
        System.out.println("+ " + word.repeat(width) + " +");
    }
}
