/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Scanner;

/**
 *
 * @author nemishappy
 */
public class Observer {

    public static void main(String[] args) {
        Reporter1 obj1 = new Reporter1();
        Reporter2 obj2 = new Reporter2();
        HeadReporter obj = new HeadReporter();
        obj.register(obj1);
        obj.register(obj2);
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Score ");
        String type = inp.nextLine();
        while(!type.isEmpty()){
            obj.setSomeData(type);
            System.out.print("Enter Score ");
            type = inp.nextLine();
        }
        
    }
    
}
