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
public class LowArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    lowArray arr;                                // References
    arr = new lowArray(100);                     // create lowArray object   
    int nElems = 0;                             // number of items in array
    int j;                                      // loop variable
    
    arr.setElem(0, 77);                         // inserts 10 items
    arr.setElem(1, 99);
    arr.setElem(2, 55);
    arr.setElem(3, 23);
    arr.setElem(4, 69);
    arr.setElem(5, 24);
    arr.setElem(6, 30);
    arr.setElem(7, 96);
    arr.setElem(8, 22);
    arr.setElem(9, 27);
    nElems = 10;
    
//==============================================================================
    // write function that displays items
    
    for(j = 0; j < nElems; j++){
        System.out.println(arr.getElem(j) + " ");
        System.out.println("");
    }
    
//==============================================================================
// write a funcntion that search for data items

    int searchKey = 23;                                                     // search for data items
    
    for(j = 0; j < nElems; j++){                                            //  
        if(arr.getElem(j)== searchKey){
            break;
        }
    } if(j == nElems){
        System.out.println("Cant find " + searchKey);
    } else{
        System.out.println("Found " + searchKey);
    }

//==============================================================================
// write a function that deletes a element 

    for(j = 0; j < nElems; j++){
        if(arr.getElem(j) == 99){
            break;
        }
    for(int k = j; k < nElems; k++){
        arr.setElem(k, arr.getElem(k+1));
        nElems--;                                                           // decrement size
    }   
    
    }

    for(j = 0; j < nElems; j++){                                            //display items
        System.out.println(arr.getElem(j) + " " );
        System.out.println("");
    }

    }
    
}
