package org.example.holidays_hw.equipment;
/**
 * Класс Phone (Телефон) - наследуется от OfficeEquipment.
 * Дополнительные поля: screenSize, storageSize, operatingSystem,
 * batteryLife, isSmart, cameraResolution, processorType.
 */
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@AllArgsConstructor
public class Phone extends OfficeEquipment {
    private double screenSize;
    private double storageSize;
    private String operatingSystem;
    private int batteryLife;
    private boolean isSmart;
    private int cameraResolution;
    private String processorType;



}
