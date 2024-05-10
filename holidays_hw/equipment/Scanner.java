package org.example.holidays_hw.equipment;
/**
 * Класс Scanner (Сканер) - наследуется от OfficeEquipment.
 * Дополнительные поля: scanResolution, scanSpeed, colorDepth,
 * maxPaperSize, connectivity, isDuplexScanning, scannerType.
 */

import lombok.*;
import org.example.holidays_hw.equipment.OfficeEquipment;


@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@AllArgsConstructor
public class Scanner extends OfficeEquipment {
    private int scanResolution;
    private double scanSpeed;
    private int colorDepth;
    private double maxPaperSize;
    private String connectivity;
    private boolean isDuplexScanning;
    private String scannerType;


}
