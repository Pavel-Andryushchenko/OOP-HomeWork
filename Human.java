
public class Human extends Actor {
    @Override
    public String getName() {
        return super.name;
    }

    public Human(String name) {
        super(name);
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean MakeOrder) {
        super.isMakeOrder = MakeOrder;
    }

    @Override
    public void setTakeOrder(boolean TakeOrder) {
        super.isTakeOrder = TakeOrder;
    }
}
