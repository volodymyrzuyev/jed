package com.it355.jed.rules;

/**
 * Program to showcase Rule OBJ13-J
 * @author Josh Ripoli
 */

public class OBJ13j_Main implements Cloneable{
    private static final int[] DATA = {0,1,2,3,4,5,6,7};

    public static void main(String[] args) {
        int [] newData = getData();
        for (int i = 0; i < newData.length; i++){
            newData[i] +=1;
        }
        System.out.print("unchanged data: [");
        for(int i = 0; i < DATA.length; i++){
            if(i != DATA.length - 1){
                System.out.print(DATA[i] + ", ");
        }
            else{
                System.out.println(DATA[i] + "]");
            }

        }
        System.out.print("updated data: [");
        for(int i = 0; i < newData.length; i++){
            if(i != newData.length - 1){
            System.out.print(newData[i] + ", ");
        }else{
            System.out.println(newData[i] + "]");
        }
    }
}

/**
 * 
 * @return a copy of DATA array to be changed and modified as needed
 */
public static final int[] getData() {
    return DATA.clone();
    } 
}

