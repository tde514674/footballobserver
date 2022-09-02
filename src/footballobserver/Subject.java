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
    //สร้าง list ขึ้นมาเพื่อเก็บ Observer หลายๆตัว
    private List<Observer> oblist = new ArrayList<Observer>();
    //สร้างตัวแปร score มาเก็บผลคะแนน
    private String score; 

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
        notifyAllObservers();
    }
    
    //methood ที่ add Observer เข้า list
    public void attach(Observer ob){
        oblist.add(ob);
    }
    
    //method ที่แจ้งให้ Observer หลายตัว update
    public void notifyAllObservers(){
        for(Observer ob : oblist){
            ob.update();
        }
    }
    
    
    
}
