import Bridge.Java;

public class JavaCreator  {
    public static void main(String[] args) {
        Java[] javas = {
                new SoftSystem(new JSJunior()),
                new SkillExchange(new PythonJunior())
        };



        for (Java java : javas){
            java.juniorJava();
        }
    }
}
