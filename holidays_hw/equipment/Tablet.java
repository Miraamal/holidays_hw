package org.example.holidays_hw.equipment;
/**
 * Класс Tablet (Планшет) - наследуется от OfficeEquipment.
 * Дополнительные поля: screenSize, storageSize, operatingSystem,
 * batteryLife, isCellular, cameraResolution, processorType.
 */
import lombok.*;
import org.example.holidays_hw.equipment.OfficeEquipment;


@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@AllArgsConstructor

public class Tablet extends OfficeEquipment {
    private double screenSize;
    private double storageSize;
    private String operatingSystem;
    private int batteryLife;
    private boolean isCellular;
    private int cameraResolution;
    private String processorType;


}
