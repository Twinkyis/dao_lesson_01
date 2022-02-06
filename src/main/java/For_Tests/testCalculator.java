package For_Tests;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class testCalculator {

    @Test
    public void testAdd() throws SQLException {
        Calculator calculator = new Calculator();
        int add = calculator.add(4, 23);
        Assert.assertEquals(27, add);
    }
}
