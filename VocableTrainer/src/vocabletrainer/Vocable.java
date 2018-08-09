/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabletrainer;

/**
 *
 * @author jackzz
 */
public class Vocable {
    private String nativeVocable;
    private String chosenVocable;

    public Vocable() {
        this.nativeVocable = "";
        this.chosenVocable = "";
    }

    public Vocable(String nativeVocable, String chosenVocable) {
        this.nativeVocable = nativeVocable;
        this.chosenVocable = chosenVocable;
    }
    
    

    public void setNativeVocable(String nativeVocable) {
        this.nativeVocable = nativeVocable;
    }

    public void setChosenVocable(String chosenVocable) {
        this.chosenVocable = chosenVocable;
    }

    public String getNativeVocable() {
        return nativeVocable;
    }

    public String getChosenVocable() {
        return chosenVocable;
    }
    
    
    
    
    
}
