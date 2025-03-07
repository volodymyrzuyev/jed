package com.it355.jed.rules;

/**
 * Program to showcase Recommendation OBJ55-J and MET55-J
 * @author Josh Ripoli
 */

public class OBJ55J_MET55_Rec {
    public static void main(String[] args) {
        ListData data = new ListData(10);

        System.out.println("Value at index 3: " + data.getIndexValue(3));

        ListData data2 = new ListData(0);
        System.out.println("Value at index 3: " + data2.getIndexValue(3));

    }


    public static class ListData{
        private int[] numList;
        /**
         * 
         * @param num size of the list
         */
        public ListData(int num){
            numList = new int[num];
            for(int i = 0; i < numList.length; i++){
                numList[i] += i;
            }
        }

        /**
         * 
         * @return the list of numbers
         */
        public int getIndexValue(int index){
            if(numList.length > 0){
                return numList[index];
            }else{
                System.out.println("=================================\nCannot perform this action for list size of 0\n===============================");
                return -1;
            }
        }

    }
}
