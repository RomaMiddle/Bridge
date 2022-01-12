import Bridge.Java;
import Bridge.Junior;

public class SkillExchange extends Java {

    protected SkillExchange(Junior junior) {
        super(junior);
    }

    @Override
    public void juniorJava() {
        System.out.println("Skill Exchange junior in progress...");
        junior.writeCode();
    }
}
