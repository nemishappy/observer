/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author nemishappy
 */
public class HeadReporter implements Source {
    private final ArrayList<MyObserver> list;
    private String someData;
    
    public HeadReporter() {
        this.list = new ArrayList<MyObserver>();
    }
    
    public void setSomeData(String aData){
        someData = aData;
        notifyObserver();
    }
    
    public String getSomeData(){
        return someData;
    }

    public void notifyObserver() {
        for(int i = 0; i < list.size(); ++i){
            list.get(i).update(this);
        }
    }

    public void register(MyObserver observer) {
        list.add(observer);
    }
}
