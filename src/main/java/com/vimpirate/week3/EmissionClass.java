package com.vimpirate.week3;

public class EmissionClass {
    public static void main(String[] args) {
        int vehicleType = 1;

        switch (vehicleType) {
            case 0:
                System.out.println("Electric");
                break;
            case 1:
                System.out.println("Hybrid");
                break;
            case 2, 3, 4:
                System.out.println("Gasoline Low Emission");
                break;
            case 5:
                System.out.println("Gasoline");
                break;
            case 6, 7, 8, 9:
                System.out.println("Diesel");
                break;
        }

    }
}
