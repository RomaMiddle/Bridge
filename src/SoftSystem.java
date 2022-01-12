import Bridge.Java;
import Bridge.Junior;

public class SoftSystem extends Java {

    protected SoftSystem(Junior junior) {
        super(junior);
    }

    @Override
    public void juniorJava() {
        System.out.println("Soft System junior in progress...");
        junior.writeCode();
    }
}
