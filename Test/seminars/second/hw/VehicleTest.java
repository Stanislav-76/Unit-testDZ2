package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.second.simple_shopping_cart.Cart;
import seminars.second.simple_shopping_cart.Shop;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("BMW", "X5", 2021);
        motorcycle = new Motorcycle("Honda", "g", 2022);
    }

    /*
             - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
             - проверка того, объект Car создается с 4-мя колесами
             - проверка того, объект Motorcycle создается с 2-мя колесами
             - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
             - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
             - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
             - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    */

    /**
     * проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
     */
    @Test
    void carInstanceOfVehicle() {
//        assertThat(car).isInstanceOf(Vehicle.class);
        assertInstanceOf(Vehicle.class, car);
    }

    /**
     * проверка того, объект Car создается с 4-мя колесами
     */
    @Test
    void carCorrectWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /**
     * проверка того, объект Motorcycle создается с 2-мя колесами
     */
    @Test
    void motorcycleCorrectWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    /**
     * проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
     */
    @Test
    void carCorrectTestDriveSpeed() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /**
     * проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
     */
    @Test
    void motorcycleCorrectTestDriveSpeed() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    /**
     * проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
     */
    @Test
    void carCorrectParkSpeed() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    /**
     * проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
     */
    @Test
    void motorcycleCorrectParkSpeed() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}