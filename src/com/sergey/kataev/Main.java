package com.sergey.kataev;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    private static ArrayList<Integer> generateArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        Timestamp before = new Timestamp(System.currentTimeMillis());
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(random.nextInt());
        }
        Timestamp after = new Timestamp(System.currentTimeMillis());
        long deltaTime = after.getTime() - before.getTime();
        System.out.println("Времени ушло на создание ArrayList: " + deltaTime + "мс.");
        return arrayList;
    }
    private static void selectArrayList(ArrayList<Integer> arrayList){
        Random random = new Random();
        Timestamp before = new Timestamp(System.currentTimeMillis());
        for (int i = 0; i < 10000000; i++) {
            Integer temp = arrayList.get(random.nextInt(arrayList.size()-1));
        }
        Timestamp after = new Timestamp(System.currentTimeMillis());
        long deltaTime = after.getTime() - before.getTime();
        System.out.println("Времени ушло на выборку по ArrayList: " + deltaTime + "мс.");
    }

    private static LinkedList<Integer> generateLinkedList(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        Timestamp before = new Timestamp(System.currentTimeMillis());
        for (int i = 0; i < 10000000; i++) {
            linkedList.add(random.nextInt());
        }
        Timestamp after = new Timestamp(System.currentTimeMillis());
        long deltaTime = after.getTime() - before.getTime();
        System.out.println("Времени ушло на создание linkedList: " + deltaTime + "мс.");
        return linkedList;
    }
    private static void selectLinkedList(LinkedList<Integer> linkedList){
        Random random = new Random();
        Timestamp before = new Timestamp(System.currentTimeMillis());
        for (int i = 0; i < 10000000; i++) {
            Integer temp = linkedList.get(random.nextInt(linkedList.size()-1));
        }
        Timestamp after = new Timestamp(System.currentTimeMillis());
        long deltaTime = after.getTime() - before.getTime();
        System.out.println("Времени ушло на выборку из linkedList: " + deltaTime + "мс.");
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = generateArrayList();
        LinkedList<Integer> linkedList = generateLinkedList();
        selectArrayList(arrayList);
        selectLinkedList(linkedList);
    }
}
