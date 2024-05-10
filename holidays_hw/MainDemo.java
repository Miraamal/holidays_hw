package org.example.holidays_hw;

import com.github.javafaker.Faker;
import org.example.holidays_hw.equipment.OfficeEquipment;
import org.example.holidays_hw.generator.EquipmentGenerator;

import java.util.Arrays;
import java.util.Objects;
/*
Задание
Создайте массив из 10 произвольных объектов, выбирая из вышеуказанных классов.
Используйте Faker для генерации значений полей
Реализуйте следующие методы которые принимают массив OfficeEquipment:
printAllEquipment(OfficeEquipment[] officeEquipment) - выводит информацию о всей технике.
calculateTotalPrice(OfficeEquipment[] officeEquipment) - вычисляет общую стоимость всей техники.
listByManufacturer(OfficeEquipment[] officeEquipment, String manufacturer)
- выводит всю технику указанного производителя.
findOldestEquipment(OfficeEquipment[] officeEquipment, int year)
 - находит самую старую технику по году выпуска.
countOperational(OfficeEquipment[] officeEquipment) - подсчитывает количество исправной техники.
 */

public class MainDemo {
    public static void main(String[] args) {
        OfficeEquipment[] equipment = new OfficeEquipment[9]; //zadali massiv
        EquipmentGenerator generator = new EquipmentGenerator();
        for (int i = 0; i < equipment.length; i++) {
            equipment[i] = generator.generate();
        }
        printAllEquipment(equipment);
        System.out.println(calculateTotalPrice(equipment));
        listByManufacturer(equipment, equipment[0].getManufacturer());
        System.out.println(Arrays.toString(findOldestEquipment(equipment, equipment[0].getYearOfManufacture())));
        System.out.println(countOperational(equipment));
    }

    public static void printAllEquipment(OfficeEquipment[] officeEquipment) {
        for (OfficeEquipment equipment : officeEquipment) {
            System.out.println(equipment.toString());
        }
    }

    public static double calculateTotalPrice(OfficeEquipment[] officeEquipment) {
        double sum = 0;
        for (OfficeEquipment e : officeEquipment) {
            sum = sum + e.getPrice();
        }
        return sum;
    }

    public static void listByManufacturer(OfficeEquipment[] officeEquipment, String manufacturer) {
        for (OfficeEquipment e : officeEquipment) {
            if (Objects.equals(e.getManufacturer(), manufacturer)) {
                System.out.println(e);
            }
        }

    }

    public static OfficeEquipment[] findOldestEquipment(OfficeEquipment[] officeEquipment, int year) {
        OfficeEquipment[] result = new OfficeEquipment[officeEquipment.length];
        int index = 0;

        for (OfficeEquipment e : officeEquipment) {
            if (Objects.equals(e.getYearOfManufacture(), year)) {
            result[index] = e;
            index++;
            }
        }
        return Arrays.copyOfRange(result,0,index);
    }

    public static int countOperational(OfficeEquipment[] officeEquipment){
        int count = 0;
        for (OfficeEquipment e : officeEquipment){
            if (e.isOperational()){
                count++;
            }
        }
        return count;
    }
}
