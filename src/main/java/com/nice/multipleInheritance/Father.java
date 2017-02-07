package com.nice.multipleInheritance;

/**
 * Created by Evegeny on 07/02/2017.
 */
public interface Father {

    double PI = 3.14;

   default void talk(){
       System.out.println("come to me now!!!!!");
   }
}
