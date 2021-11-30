import jdk.nashorn.internal.ir.annotations.Ignore;
import org.testng.Assert;
import org.testng.annotations.Test;

@Ignore
public class NewTest {
    Calculate calcuate;
    @Test
    public void testAdd() {
        calcuate = new Calculate();
        int result = calcuate.add(1, 2);
        Assert.assertEquals(result,3);

    }
    @Test
    public void testSubtract() {
        calcuate = new Calculate();
        int result = calcuate.subtract(5, 2);
        Assert.assertEquals(result,3); //故意设置减法期望值为10000
    }
    @Test
    public void testMultiply() {
        calcuate = new Calculate();
        int result = calcuate.multiply(4, 3);
        Assert.assertEquals(result, 12);
    }
    @Test
    public void testDivide() {
        calcuate = new Calculate();
        int result = calcuate.divide(9, 3);
        Assert.assertEquals(result, 3);
    }
}
