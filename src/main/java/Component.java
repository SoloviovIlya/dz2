public class Component implements ISum{
    private Long S;
    public Component(Long S) {
        this.S = S;
    }
    @Override
    public Long getS() {
        return S;
    }
}
