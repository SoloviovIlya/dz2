import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
public class Composite implements ISum{
    public List<ISum> elements = new ArrayList<>();
    @Override
    public Long getS() {
        AtomicReference<Long> result = new AtomicReference<>(0L);
        elements.forEach(iSum -> {
            result.set(result.get() + iSum.getS());
        });
        return result.get();
    }
    public void add(ISum element){
        elements.add(element);
    }

}
