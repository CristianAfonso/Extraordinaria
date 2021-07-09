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
public class Iglesia extends PatrimonialElement {
    private boolean restringido;
    public Iglesia(int localization, String name, String author, int year, String fabricationMethod, String material, String conservationState, String tematica, boolean restringido) {
        this.localization = localization;
        this.name = name;
        this.author = author;
        this.year = year;
        this.fabricationMethod = fabricationMethod;
        this.material = material;
        this.conservationState = conservationState;
        this.photoGallery = new ArrayList<>();
        this.tematica=tematica;
        this.restringido = restringido;
    }
    @Override
    public void sacarFoto(){
        if(!restringido){
            photoGallery.add("Foto desde la iglesia  " + photoGallery.size());
        }else{
            photoGallery.add("Foto a la iglesia " + photoGallery.size());
        }
    }
}
