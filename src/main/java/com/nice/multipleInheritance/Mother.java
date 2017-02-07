package com.nice.multipleInheritance;

/**
 * Created by Evegeny on 07/02/2017.
 */
public interface Mother {
   default void talk(){
       System.out.println("COME TO ME NOW!!!!!");
   }
}
