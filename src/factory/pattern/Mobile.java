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
public interface Mobile {
     static final String IPHONE="Iphone";
     static final String SAMSUNG="Samsung";
     static final String SONY="Sony";
    
     void printInfo();
}
