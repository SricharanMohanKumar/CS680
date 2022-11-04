package edu.umb.cs680.hw03;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class SingletonTest
{
    @Test
    void singletonObjectNotNull()
    {
        Singleton s = Singleton.getInstance();
        assertNotNull(s);
    }
    @Test
    void singletonhashcode()
    {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        assertEquals(x.hashCode(),y.hashCode());
    }

}