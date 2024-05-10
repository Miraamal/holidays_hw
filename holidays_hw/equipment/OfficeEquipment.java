package org.example.holidays_hw.equipment;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfficeEquipment {
    private int id;
    private String modelName;
    private String manufacturer;
    private int yearOfManufacture;
    private double price;
    private double weight;
    private boolean isOperational;


}
