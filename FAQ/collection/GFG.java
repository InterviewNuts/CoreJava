package com.sahu.spring.springCore.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//implementing Comparable interface
public class GFG implements Comparable<GFG> {

 String name;
 int age;

 // Class constructor
 GFG(String name, int age)
 {
     this.name = name;
     this.age = age;
 }
 public int getage() { return age; }
 public String getname() { return name; }
 public static void main(String[] args)
 {
     // Creating GFG class object
     GFG ob[] = new GFG[4];

     // Inserting elements in the objects
     ob[0] = new GFG("Aayush", 14);
     ob[1] = new GFG("Ravi", 12);
     ob[2] = new GFG("Sachin", 19);
     ob[3] = new GFG("Mohit", 20);

     // sort the array,using overriden method
     Arrays.sort(ob);

     for (GFG o : ob) {

         // printing the sorted array objects name and
         // age
         System.out.println(o.name + " " + o.age);
     }

     // if you want to create a dynamic array ,then you
     // can create an arraylist
     ArrayList<GFG> objects = new ArrayList<>();

     // creating a new GFG object
     GFG newObject1 = new GFG("Rohan Devaki", 20);

     // inserting the new object into the arraylist
     objects.add(newObject1);

     // creating a new GFG object
     GFG newObject2 = new GFG("Algorithammer", 22);

     // inserting the new object into the arraylist
     objects.add(newObject2);

     // using Collections to sort the arraylist
     Collections.sort(objects);

     for (GFG o : objects) {
         // printing the sorted objects in arraylist by
         // name and age
         System.out.format("%s  %d\n", o.name, o.age);
     }
 }
 // Overriding compareTo() method
 @Override public int compareTo(GFG o)
 {
     if (this.age > o.age) {

         // if current object is greater,then return 1
         return 1;
     }
     else if (this.age < o.age) {

         // if current object is greater,then return -1
         return -1;
     }
     else {

         // if current object is equal to o,then return 0
         return 0;
     }
 }
}