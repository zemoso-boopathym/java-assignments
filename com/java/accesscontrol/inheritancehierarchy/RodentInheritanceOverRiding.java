package com.java.accesscontrol.inheritancehierarchy;

public class RodentInheritanceOverRiding {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[]{new Rodent(), new Mouse(), new Hamster(), new Gerbil()};
        for (Rodent rodent : rodents) {
            rodent.mammals();
            rodent.incisors();
            rodent.pet();
            rodent.feeding();
        }
    }
}
