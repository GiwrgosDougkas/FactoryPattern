/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.pattern;

/**
 *
 * @author George
 */
public class FactoryPattern {
    
    public Mobile createMobile(String in){
    if(in.equals(Mobile.IPHONE)){
        return new Iphone(4,4,"Intel");
    }
    else if(in.equals(Mobile.SAMSUNG)){
        return new Samsung(4,2,"Amd");
    }
    else if(in.equals(Mobile.SONY)){
        return new Sony(2,2,"Amd");
    }
    else{
        return null;
    }
    }
}
