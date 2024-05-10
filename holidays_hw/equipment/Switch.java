package org.example.holidays_hw.equipment;
/**
 * Класс Switch (Коммутатор) - наследуется от OfficeEquipment.
 * Дополнительные поля: portCount, speed, layer, managementType,
 * powerOverEthernet, stackable, formFactor.
 */
import lombok.*;
import org.example.holidays_hw.equipment.OfficeEquipment;


@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@AllArgsConstructor
public class Switch extends OfficeEquipment {
    private int portCount;
    private double speed;
    private int layer;
    private String managementType;
    private double powerOverEthernet;
    private String stackable;
    private String formFactor;


}
