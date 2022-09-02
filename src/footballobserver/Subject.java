/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballobserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tinip
 */
public class Subject {
    private List<Observer> oblist = new ArrayList<Observer>();
    private String score;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
        notifyAllObservers();
    }
    
    public void attach(Observer ob){
        oblist.add(ob);
    }
    
    public void notifyAllObservers(){
        for(Observer ob : oblist){
            ob.update();
        }
    }
    
    
    
}
