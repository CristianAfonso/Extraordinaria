/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordinaria2021.model;

import java.util.ArrayList;


/**
 *
 * @author can97
 */
public abstract class PatrimonialElement {
    protected int localization;
    protected String name;
    protected String author;
    protected int year;
    protected String fabricationMethod;
    protected String material;
    protected String conservationState;
    protected ArrayList<String> photoGallery;
    protected String tematica;

    public int getLocalization() {
        return localization;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getFabricationMethod() {
        return fabricationMethod;
    }

    public String getMaterial() {
        return material;
    }

    public String getConservationState() {
        return conservationState;
    }

    public ArrayList<String> getPhotoGallery() {
        return photoGallery;
    }

    public String getTematica() {
        return tematica;
    }
    
    public void admirar(){
        System.out.println("Admiras el elemento de patrimonio " + this.getName());
    }
    
    public void sacarFoto(){
        System.out.println("Sacas una foto a " + this.getName());
        photoGallery.add("Foto " + photoGallery.size());
    }
    
    
}
