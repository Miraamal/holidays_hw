package org.example.holidays_hw.equipment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Класс Monitor (Монитор) - наследуется от OfficeEquipment.
 * Дополнительные поля: screenSize, resolution, panelType,
 * refreshRate, isCurved, ports, isHDR.
 */

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@AllArgsConstructor

public class Monitor extends OfficeEquipment {
    private double screenSize;
    private int resolution;
    private String panelType;
    private double refreshRate;
    private boolean isCurved;
    private int ports;
    private boolean isHDR;



}
