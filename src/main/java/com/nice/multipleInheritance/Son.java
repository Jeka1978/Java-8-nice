package com.nice.multipleInheritance;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class Son implements Mother, Father {
    @Override
    public void talk() {
        Father.super.talk();
        Mother.super.talk();
    }
}
