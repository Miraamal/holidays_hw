package org.example.holidays_hw.equipment;

import lombok.*;
import org.example.holidays_hw.equipment.OfficeEquipment;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@AllArgsConstructor

public class Projector extends OfficeEquipment {
   private String lumens;
    private int resolution;
    private int contrastRatio;
    private double lampLife;
    private int projectionSize;
    private String connectivity;
    private boolean is3DReady;




}
