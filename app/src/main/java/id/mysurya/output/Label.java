/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.mysurya.output;

/**
 *
 * @author ceplo
 */
public class Label {
    int width;
    public String text;
    
    public Label(String text, int width){
        this.width = width;
        this.text = text;
    }
    
    public void draw() throws Exception{
        int space = this.width - text.length();
        
        if(text.length() > width){
            System.out.println("| " + text + " |");
        }else{
            System.out.println("| " + text + " ".repeat(space) + " |");
        }
    }
}
