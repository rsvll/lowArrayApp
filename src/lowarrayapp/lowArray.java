/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowarrayapp;

/**
 *
 * @author svlln
 */
public class lowArray {
    
        private long[] a;                           // ref to array
    
    //==========================================================================
    
    public lowArray(int size){
        a = new long[size];                     // create array
    }
    
    //==========================================================================
    
    public void setElem(int index, long value){
        a[index] = value;                               // set value
    }
    
    //==========================================================================
    
    public long getElem(int index){
        return a[index];                               // get Value
    }
    
    //==========================================================================
    
}
