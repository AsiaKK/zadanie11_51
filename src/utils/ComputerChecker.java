package utils;

import domain.Components;
import domain.HardDrive;
import domain.Processor;
import domain.Ram;

public class ComputerChecker {
    public static void main(String[] args) {

        Processor processor = new Processor("ABC", "HP", "123456", 2000, 40.0, 80.5);
        Ram ram = new Ram("EDF", "HP", "123457", 2300, 40, 90, 100);
        HardDrive hardDrive = new HardDrive("BNM", "Dell", "123456", 128);

        Components[] components = new Components[3];
        components[0] = processor;
        components[1] = ram;
        components[2] = hardDrive;

        for (int i = 0; i < components.length; i++) {
            components[i].basicInfo();
        }

        System.out.println("=========================================================================================");

        try {
            processor.increaseTiming(3000);
        } catch (Exception e) {
            System.out.println(e);
        }

        processor.basicInfo();

        try {
            processor.increaseTiming(2002);
        } catch (Exception e) {
            System.out.println(e);
        }

        processor.basicInfo();

        try {
            processor.increaseTiming(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        processor.basicInfo();

        try {
            ram.increaseTiming(3000);
        } catch (Exception e) {
            System.out.println(e);
        }

        ram.basicInfo();

        try {
            ram.increaseTiming(8000);
        } catch (Exception e) {
            System.out.println(e);
        }

        ram.basicInfo();
    }
}