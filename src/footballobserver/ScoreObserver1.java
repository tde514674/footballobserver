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
public class ScoreObserver1 extends Observer{

    public ScoreObserver1(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
   @Override
   public void update() {
      System.out.println( "live result: "+ subject.getScore()); 
   }
    
}
