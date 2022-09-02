/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballobserver;

/**
 *
 * @author Tinip
 */
//ให้ ScoreObserver เป็น sub-class ของ Observer เพื่อที่จะได้ใช้คำสั่งของคลาส Observer และ Subject ได้
public class ScoreObserver extends Observer{

    public ScoreObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
   @Override
   public void update() {
      System.out.println( "live result: "+ subject.getScore()); 
   }
    
}
