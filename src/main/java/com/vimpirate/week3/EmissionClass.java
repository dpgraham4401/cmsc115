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

        int x;
        double d = 1.5;

        switch (d) {
            case 1.0:
                x = 1;
            case 1.5:
                x = 2;
            case 2.0:
                x = 3;
        }
    }
}
