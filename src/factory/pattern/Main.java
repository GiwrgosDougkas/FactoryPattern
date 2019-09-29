/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George
 */
public class Main{

    public static void main (String[] args){
        List<Mobile> mobiles= new ArrayList<>();
        FactoryPattern pattern= new FactoryPattern();
        
        
        Mobile samsung=pattern.createMobile("Samsung");
        Mobile iphone=pattern.createMobile("Iphone");
        Mobile sony=pattern.createMobile("Sony");
        
        mobiles.add(sony);
        mobiles.add(iphone);
        mobiles.add(samsung);
        
        for(Mobile mobile:mobiles){
            mobile.printInfo();            
        
        }
    }

}
