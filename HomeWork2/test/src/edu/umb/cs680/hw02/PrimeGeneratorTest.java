package edu.umb.cs680.hw02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PrimeGeneratorTest {

    @Test
    public void generatePrime_1_10()
    {
        PrimeGenerator gen = new PrimeGenerator(1, 10);
        gen.generatePrimes();
        Long[] expectedPrimes = {2L, 3L, 5L, 7L};
        assertArrayEquals( expectedPrimes,gen.getPrimes().toArray() );
    }

    @Test
    public void primeGenerate_10_1()
    {
        try
        {
            PrimeGenerator gen = new PrimeGenerator(10, 1);
            gen.generatePrimes();
        }
        catch (RuntimeException ex) {
            assertEquals("Wrong input values: from=10 to=1", ex.getMessage());
        }

    }

    @Test
    public void primeGenerate_negative_10_10()
    {
        try
        {
            PrimeGenerator gen = new PrimeGenerator(-10, 10);
            gen.generatePrimes();

        }
        catch (RuntimeException ex)
        {
            assertEquals("Wrong input values: from=-10 to=10", ex.getMessage());
        }

    }

    @Test
    public void primeGenerate_negative_10_negative_1()
    {
        try
        {
            PrimeGenerator gen = new PrimeGenerator(-10, -1);
            gen.generatePrimes();

        }
        catch (RuntimeException ex)
        {
            assertEquals("Wrong input values: from=-10 to=-1", ex.getMessage());
        }

    }

    @Test
    public void primeGenerate_0_0()
    {
        try
        {
            PrimeGenerator gen = new PrimeGenerator(0, 0);
            gen.generatePrimes();
        }
        catch (RuntimeException ex)
        {
            assertEquals("Wrong input values: from=0 to=0", ex.getMessage());
        }

    }

}