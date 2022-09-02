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
//สร้าง observer เป็น abstract class
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
    
}
