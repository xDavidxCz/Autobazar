import com.engeto.Car;
import com.engeto.CarOwner;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CarOwner owner = new CarOwner();
        owner.setOwnerName("David Dvořák");
        owner.setNarozen(LocalDate.of(1992,4,16));
        owner.setAdress("Olomouc");
        owner.setVIP(true);

        CarOwner owner1 = new CarOwner("Filip Novák", "Zlín",
                false, LocalDate.of(1984,5,14));


        Car car = new Car("Peugeot 306", BigDecimal.valueOf(85000),
                true, 4.5);

        Car car1 = new Car("Seat Ibiza", BigDecimal.valueOf(120000),
                false, 5.2);

        Car car2 = new Car("Honda Civic", BigDecimal.valueOf(98000),
                true, 7.4);







    }

}