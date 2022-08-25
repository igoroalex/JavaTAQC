package hm3;

public class NonFlyingBird extends Bird{
    @Override
    public String fly() {
        return "Only walk";
    }
}
