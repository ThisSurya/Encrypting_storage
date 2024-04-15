/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.mysurya.page;
import id.mysurya.input.Input;
import id.mysurya.output.HLine;
import id.mysurya.output.Space;
import id.mysurya.output.Label;
import id.mysurya.input.SelectInput;
import id.mysurya.storage.DataPassword;
import id.mysurya.modul3.encrypt.PasswordStore;
/**
 *
 * @author ceplo
 */
public class ListPasswordPage {
    String text;
    int width;
    
    public ListPasswordPage(String text, int width){
        this.text = text;
        this.width = width;
    }
    
    public void draw() throws Exception{
        drawHeader();
        drawContent();
        drawFooter();
    }
    
    public void drawHeader() throws Exception{
        new HLine(width).draw();
        new Space(width).draw();
        new Label(text, width).draw();
        new Space(width).draw();
        new HLine(width).draw();
    }
    
    public void drawContent() throws Exception{
        new Space(width).draw();
        
        String word = "Terdapat " + new DataPassword().passData.size() + " tersimpan";
        new Label(word, width).draw();
        
        new Label("----- ----- -----", this.width).draw();
        
        for(PasswordStore ps : DataPassword.passData){
            new Label(String.format("| %-15s | %-15s | %-15s |", ps.name, ps.username, ps.getCategory()), this.width).draw();
        }
    }
    
    public void drawFooter() throws Exception{
        new Space(this.width).draw();
        new HLine(this.width).draw();
        
        new MainPage("Enkrip password store", this.width).draw(); 
    }
}
