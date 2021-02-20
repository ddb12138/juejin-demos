package reflection;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        ParamProcessor.setDefalutValue(person);
        System.out.println(person);
    }
}
