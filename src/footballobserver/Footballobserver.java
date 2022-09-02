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

    
    //method ใส่ผลคะแนนฟุตบอล
    public static String inputScore(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score :");
        String score = sc.nextLine();
        return score;
    }
    
    public static void main(String[] args) {
        //สร้าง subject
        Subject subject = new Subject();
        
        //สร้าง Observer ขึ้นมา 2 ตัว
        new ScoreObserver(subject);
        new ScoreObserver(subject);
        
        String score = inputScore();
        while(!score.equals("")){
            subject.setScore(score);
            score = inputScore();
        }
    }
    
}
