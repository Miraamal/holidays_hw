package org.example.holidays_hw.equipment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Класс Laptop (Ноутбук) - наследуется от OfficeEquipment.
 * Дополнительные поля: processorType, ramSize, storageSize,
 * batteryLife, screenSize, operatingSystem, isTouchscreen.
 */



@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@AllArgsConstructor

public class Laptop extends OfficeEquipment {
    private String processorType;
    private double ramSize;
    private double storageSize;
    private int batteryLife;
    private double screenSize;
    private String operatingSystem;
    private boolean isTouchscreen;




}
