package enumdemo;

public class enumtest {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);    //toString
        System.out.println("***********");
        Season[] values = Season.values();  //values
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println("***********");
        Season value = Season.valueOf("SPRING");		//如果不存在则会报Exception
        System.out.println(value);

        Season value1 = Season.valueOf("XXXX");
        System.out.println(value1);
    }
}
