/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package car;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author guillaumerebmann
 */
public class Attributes {
    private String name;
    private Timestamp start;
    private Timestamp expire;
    
    
    public Attributes(String name,Timestamp start,Timestamp expire){
        this.name=name;
        this.start=start;
        this.expire=expire;
    }
    
    
    // Set Method
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setStart(Timestamp start){
        this.start=start;
    }
    
    public void setExpire(Timestamp expire){
        this.expire=expire;
    }
    
    // Get Method
    
    public String getName(){
        return this.name;
    }
    
    public Timestamp getStart(){
        return this.start;
    }
    
    public Timestamp getExpire(){
        return this.expire;
    }
    
    
    public Boolean haveToRepair(){
         java.util.Date date= new java.util.Date();
	 Timestamp now = new Timestamp(date.getTime());
         
        if(now.after(expire))
            return true;
        else 
            return false;
    }
    
    
    
}
