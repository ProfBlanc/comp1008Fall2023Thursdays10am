package wk5;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testDefaultConstructor(){

        Car car = new Car();
        //hard assertions: fails, product/class fails
        assertNotNull(car);
        assertEquals("black", car.getColor());
        assertTrue(car.getColor().length() >= 3);
        assertFalse(car.getDoors() < 2);
    }
    @Test
    public void testSetDoorsStatic(){
        int doors = 5;
        Car car = new Car();
        car.setDoors(doors);
        assertEquals(doors, car.getDoors());
    }
    @ParameterizedTest
    @ValueSource(doubles = {1001, 1000.5, 1999.5})
    public void testWeightSetterDynamic(double weight){
        Car car = new Car();
        car.setWeight(weight);
        weight-= 0.5;

        assertEquals(weight, car.getWeight(), .5);
    }

    @ParameterizedTest
    @CsvSource( {"black,4,1111","blue,5,22","green,2,3333"}  )
    public void test3ArgConstructor(String color, int doors, double weight){
        Car car = new Car(color, doors, weight);
        assertEquals(color, car.getColor());
        assertEquals(doors, car.getDoors());
        assertEquals(weight, car.getWeight());
    }
}