/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package car;

import java.util.List;

/**
 *
 * @author guillaumerebmann
 */
public class Car {
    
   private List<Attributes> listOfAttributes;
   private String name;
   private String typeVoiture;
   
   public Car(String name,String typeVoiture){
       this.name=name;
       this.typeVoiture=typeVoiture;
   }
   
   
   
   
   // Get and Set METHOD

    public List<Attributes> getListOfAttributes() {
        return listOfAttributes;
    }

    public void setListOfAttributes(List<Attributes> listOfAttributes) {
        this.listOfAttributes = listOfAttributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeVoiture() {
        return typeVoiture;
    }

    public void setTypeVoiture(String typeVoiture) {
        this.typeVoiture = typeVoiture;
    }
   
   
   
}
