package edu.uoc.ds.adt;

import java.util.Vector;


public class PR0FibArray {
    public static int getFibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return getFibonacci(n-1) + getFibonacci(n-2);
    }
    public final int CAPACITY = 20;
    Vector<Object> Fibonacci = new Vector<>();

    public void fillVoid(){
        int i = 0;
        while(Fibonacci.size() < CAPACITY){
            Fibonacci.addElement(getFibonacci(i));
            i++;
        }
    }

    public int getIndexOf(int n){
        fillVoid();
        for(int i = 0; i < CAPACITY; i++){
            if (Integer.parseInt(Fibonacci.get(i).toString()) == n){
                System.out.println("Número de iteraciones: " + i);
                return i;
            }
        }
        return -1;
    }


    public int binarySearch(int n) {
        fillVoid();
        int first = 0;
        int last = CAPACITY-1;
        int mid = last/2;
        int i = 0;

        while (first <= last){
            mid = first + (last-first)/2;
            if (Integer.parseInt(Fibonacci.get(mid).toString()) == n){
                System.out.println("Número de iteraciones: " + i);
                return mid;
            }else if (Integer.parseInt(Fibonacci.get(mid).toString()) > n){
                last = mid-1;
                i++;
            }else{
                first = mid+1;
                i++;
            }
        }
        System.out.println("Número de iteraciones: " + i);
        return -1;
    }


    public int[] getArray() {
        fillVoid();
        int [] list = new int[20];

        for (int i = 0; i < CAPACITY; i++){
            list[i] = Integer.parseInt(Fibonacci.get(i).toString());
        }
        return list;
    }
}

