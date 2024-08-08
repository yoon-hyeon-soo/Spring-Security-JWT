package sparta.springstudy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sparta.springstudy.food.Food;

@SpringBootTest
public class BeanTest {

    @Autowired
    Food pizza;

    @Autowired
    Food chicken;

    @Test
    @DisplayName("테스트")
    void test1(){
        pizza.eat();
        chicken.eat();
    }

}