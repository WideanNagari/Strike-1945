/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Widean Nagari
 */
public class ArrayEnemy<T> implements Iterable<T>,Serializable{
    ArrayList<T> e;
    public ArrayEnemy() {
        this.e = new ArrayList();
    }

    public T get(int i) {
        return e.get(i);
    }
    
    public void add(T t){
        this.e.add(t);
    }
    
    public void remove(int i){
        this.e.remove(i);
    }
    
    public int size(){
        return this.e.size();
    }
    public Iterator iterator(){
        return this.e.iterator();
    }
}
