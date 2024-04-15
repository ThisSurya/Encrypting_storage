/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.mysurya.input;

/**
 *
 * @author ceplo
 */
public class SelectInput {
    String label;
    int width;
    String[] pilihan = new String[5];
    String value;
    
    Input input=new Input("Pilihanmu");
    
    public SelectInput(String label, String[] pilihan, int width){
        this.label = label;
        this.width = width;
        this.pilihan = new String[pilihan.length];
        this.pilihan = pilihan;
    }
    
    public void draw() throws Exception {
        int space = width + 1 - label.length();
        
        if(label.length() > width){
            System.out.println("| " + label + " |");
        }else{
            System.out.println("| " + label + " ".repeat(space) + "|");
        }
        
        for(int i = 0; i < pilihan.length; i++){
            int j = i + 1;
            space = width - 4 - pilihan[i].length();
            if(pilihan[i].length() > width){
                System.out.println("|  " + "[" + j + "]" + pilihan[i] + " |");
            }else{
                System.out.println("|  " + "[" + j + "] " + pilihan[i] + " ".repeat(space)+ "|");
            }
        }
        input.draw();
        
        value = input.getValue();
        
        if(Integer.parseInt(value) > pilihan.length){
            System.out.println("Diluar pilihan yang tersedia!");
            value = "0";
        }
    }
    
    public int getValue(){
        return Integer.parseInt(this.value);
    }
}
