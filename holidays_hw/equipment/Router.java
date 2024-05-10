package org.example.holidays_hw.equipment;
/**
 * Класс Router (Маршрутизатор) - наследуется от OfficeEquipment.
 * Дополнительные поля: speed, band, security, ports, range,
 * isDualBand, connectivityType.
 */
import lombok.*;
import org.example.holidays_hw.equipment.OfficeEquipment;


@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@AllArgsConstructor
public class Router extends OfficeEquipment {
    private double speed;
    private double band;
    private String security;
    private int ports;
    private double range;
    private boolean isDualBand;
    private String connectivityType;


}
