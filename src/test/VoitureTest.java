package test;

import main.Voiture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {
    @Test
        public void VoitureTest()  {
        Voiture v1 = new Voiture("Audi", 25000.5);
        System.out.println(v1.getMarque());
        System.out.println(v1.getPrix());
        assertEquals(v1.getMarque(),"Audi");
        assertEquals(v1.getPrix(),25000.5);


    }
}
