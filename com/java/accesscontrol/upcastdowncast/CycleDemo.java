package com.java.accesscontrol.upcastdowncast;

public class CycleDemo {
    public static void main(String[] args) {

        // Upcasting -> method balance not found
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new UniCycle();
        cycles[1] = new BiCycle();
        cycles[2] = new TriCycle();

        /*
            method balance is not found in Cycle
            for (Cycle cycle : cycles) {
                cycle.balance();
            }
        */

        // Downcasting
        UniCycle uniCycle = (UniCycle) cycles[0];
        BiCycle biCycle = (BiCycle) cycles[1];
        // TriCycle class do not have balance() method
        // TriCycle triCycle = (TriCycle)cycles[2];

        uniCycle.balance();
        biCycle.balance();
        // TriCycle class do not have balance() method
        // triCycle.balance();
    }
}
