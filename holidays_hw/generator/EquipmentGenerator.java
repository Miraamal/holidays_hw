package org.example.holidays_hw.generator;

import com.github.javafaker.Faker;
import org.example.holidays_hw.equipment.*;

public class EquipmentGenerator {
    private Faker faker = new Faker();
    public OfficeEquipment generate(){
       int num = faker.random().nextInt(10);
       OfficeEquipment equipment =  switch(num){
           case 0-> generateLaptop();
           case 1-> generateMonitor();
           case 2-> generatePrinter();
           case 3-> generateProjector();
           case 4-> generateRouter();
           case 5-> generateSwitch();
           case 6-> genertaeTablet();
           case 7-> generateScanner();
           default -> generatePhone();
       };
       fillInEquipment(equipment);
       return equipment;
    }

    public Laptop generateLaptop() {
        return new Laptop(
                faker.programmingLanguage().name(),
                faker.random().nextDouble(),
                faker.random().nextDouble(),
                faker.random().nextInt(100),
                faker.random().nextDouble(),
                faker.funnyName().name(),
                faker.random().nextBoolean()
        );

    }

    public Monitor generateMonitor() {
        return new Monitor(
                faker.random().nextDouble(),
                faker.random().nextInt(100),
                faker.programmingLanguage().name(),
                faker.random().nextDouble(),
                faker.random().nextBoolean(),
                faker.random().nextInt(100),
                faker.random().nextBoolean()
        );

    }

    public Phone generatePhone() {
        return new Phone(
                faker.random().nextDouble(),
                faker.random().nextDouble(),
                faker.programmingLanguage().name(),
                faker.random().nextInt(100),
                faker.random().nextBoolean(),
                faker.random().nextInt(100),
                faker.programmingLanguage().name()
        );
    }

    public Printer generatePrinter(){
        return new Printer(
                faker.programmingLanguage().name(),
                faker.random().nextDouble(),
                faker.random().nextInt(100),
                faker.random().nextBoolean(),
                faker.random().nextInt(100),
                faker.programmingLanguage().name(),
                faker.random().nextInt(100)
        );
    }
    public Projector generateProjector(){
        return new Projector(
                faker.programmingLanguage().name(),
                faker.random().nextInt(100),
                faker.random().nextInt(100),
                faker.random().nextDouble(),
                faker.random().nextInt(100),
                faker.programmingLanguage().name(),
                faker.random().nextBoolean()

        );
    }
    public Router generateRouter(){
        return new Router(
                faker.random().nextDouble(),
                faker.random().nextDouble(),
                faker.programmingLanguage().name(),
                faker.random().nextInt(100),
                faker.random().nextDouble(),
                faker.random().nextBoolean(),
                faker.programmingLanguage().name()
        );
    }
    public Switch generateSwitch(){
        return new Switch(
                faker.random().nextInt(100),
                faker.random().nextDouble(),
                faker.random().nextInt(100),
                faker.programmingLanguage().name(),
                faker.random().nextDouble(),
                faker.programmingLanguage().name(),
                faker.programmingLanguage().name()
        );
    }
    public Tablet genertaeTablet(){
        return new Tablet(
                faker.random().nextDouble(),
                faker.random().nextDouble(),
                faker.programmingLanguage().name(),
                faker.random().nextInt(100),
                faker.random().nextBoolean(),
                faker.random().nextInt(100),
                faker.programmingLanguage().name()
        );
    }
    public Scanner generateScanner(){
        return new Scanner(
                faker.random().nextInt(100),
                faker.random().nextDouble(),
                faker.random().nextInt(100),
                faker.random().nextDouble(),
                faker.programmingLanguage().name(),
                faker.random().nextBoolean(),
                faker.programmingLanguage().name()
        );
    }
    private void fillInEquipment(OfficeEquipment officeEquipment){
        officeEquipment.setId(faker.random().nextInt(1000));
        officeEquipment.setPrice(faker.random().nextInt(1000));
        officeEquipment.setManufacturer(faker.programmingLanguage().name());
        officeEquipment.setYearOfManufacture(faker.random().nextInt(1959, 2030));
        officeEquipment.setOperational(faker.random().nextBoolean());
    }

}
