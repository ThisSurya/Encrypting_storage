/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.mysurya.output;

/**
 *
 * @author ceplo
 */
public class Space {
    int width;
    
    public Space(int width){
        this.width = width;
    }
    
    public void draw() throws Exception {
        System.out.println("| " + " ".repeat(width) + " |");
    }
}
