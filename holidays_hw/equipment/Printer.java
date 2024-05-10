package org.example.holidays_hw.equipment;

/**
 * Класс Printer (Принтер) - наследуется от OfficeEquipment.
 * Дополнительные поля: printTechnology, printSpeed, maxResolution,
 * isColor, paperSize, connectivity, dutyCycle.
 */
import lombok.*;
import org.example.holidays_hw.equipment.OfficeEquipment;


@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@AllArgsConstructor
public class Printer extends OfficeEquipment {
    private String printTechnology;
    private double printSpeed;
    private int maxResolution;
    private boolean isColor;
    private int paperSize;
    private String connectivity;
    private int dutyCycle;


}
