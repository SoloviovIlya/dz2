import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PatternTest {
    @Test
    void singleTest() {
        Composite composite = new Composite();
        composite.add(new Component(100L));
        composite.add(new Component(200L));
        composite.add(new Component(300L));
        Long result = composite.getS();
        Assertions.assertEquals(600L, result);
    }
    @Test
    void multipleTest() {
        //given
        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        composite.add(composite1);
        composite.add(composite2);
        composite1.add(new Component(100L));
        composite1.add(new Component(200L));
        composite1.add(new Component(300L));
        composite2.add(new Component(100L));
        composite2.add(new Component(200L));
        composite2.add(new Component(300L));
        Long result = composite.getS();
        Assertions.assertEquals(1200L, result);
    }
}
