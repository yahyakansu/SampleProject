package DDT_excel;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class test {
    @Test
    public void deneme(){
        Faker faker = new Faker();
        String s=faker.name().firstName();
        System.out.println(s);
    }
}
