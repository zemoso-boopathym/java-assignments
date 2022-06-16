package com.java.accesscontrol.cyclefactory;

public class CycleFactory {
    public static void main(String[] args) {
        UniCycleFactory uniCycleFactory = new UniCycleFactory();
        BiCycleFactory biCycleFactory = new BiCycleFactory();
        TriCycleFactory triCycleFactory = new TriCycleFactory();

        uniCycleFactory.balance();
        uniCycleFactory.driveSpeed();
        uniCycleFactory.wheels();

        biCycleFactory.balance();
        biCycleFactory.driveSpeed();
        biCycleFactory.wheels();

        triCycleFactory.driveSpeed();
        triCycleFactory.wheels();
    }
}
