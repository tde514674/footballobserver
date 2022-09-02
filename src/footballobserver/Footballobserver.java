/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballobserver;
import java.util.Scanner;

/**
 *
 * @author Tinip
 */
public class Footballobserver {

    /**
     * 
     */
    public static String inputScore(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score :");
        String score = sc.nextLine();
        return score;
    }
    
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        new ScoreObserver1(subject);
        new ScoreObserver2(subject);
        
        String score = inputScore();
        while(!score.equals("")){
            subject.setScore(score);
            score = inputScore();
        }
    }
    
}
