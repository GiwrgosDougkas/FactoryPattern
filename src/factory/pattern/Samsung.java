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
public class Samsung implements Mobile{
    private int cpu;
    private int memory;
    private String name;
    
    public Samsung(int newCpu, int newMemory, String newName){
       this.cpu=newCpu;
       this.memory=newMemory;
       this.name=newName;
    }

    @Override
    public void printInfo() {
        System.out.println("-------------Samsung ---------");
        System.out.println("Cpu:"+cpu+" Memory:"+memory+" Name:"+name);
        
    }
}
