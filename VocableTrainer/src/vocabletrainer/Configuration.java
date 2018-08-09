/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabletrainer;

import java.util.ArrayList;

/**
 *
 * @author jackzz
 */
public class Configuration {

    private boolean NativeToLang;
    private String vocablePath;
    private ArrayList<Vocable> wrongVocableList;
    private boolean wrongVocables;
    private String chosenLanguage;
    private int rightAnswer;

    public Configuration() {
        this.NativeToLang = true;
        this.vocablePath = "";
        wrongVocableList = new ArrayList<>();
        wrongVocables = false;
        chosenLanguage = "";
        rightAnswer = 0;
    }

    public void setNativeToLang(boolean NativeToLang) {
        this.NativeToLang = NativeToLang;
    }

    public void setVocablePath(String vocablePath) {
        this.vocablePath = vocablePath;
    }

    public boolean isNativeToLang() {
        return NativeToLang;
    }

    public String getVocablePath() {
        return vocablePath;
    }

    public boolean isWrongVocables() {
        return wrongVocables;
    }

    public ArrayList<Vocable> getWrongVocableList() {
        return wrongVocableList;
    }

    public void setWrongVocables(boolean wrongVocables) {
        this.wrongVocables = wrongVocables;
    }

    public void setChosenLanguage(String chosenLanguage) {
        this.chosenLanguage = chosenLanguage;
    }

    public String getChosenLanguage() {
        return chosenLanguage;
    }

    public void addRight() {
        this.rightAnswer = this.rightAnswer + 1;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public void clearRight() {
        this.rightAnswer = 0;
    }
    
    public void clearVocableList(){
     this.wrongVocableList = new ArrayList<>();
    }
    
}
