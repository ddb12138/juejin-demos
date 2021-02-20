package enumdemo;

//自定义注解类
public class CustomEnum {
    private final String seasonName;    //类的成员变量不变
    private final String seasonDesc;

    private CustomEnum(String seasonName,String seasonDesc){        //构造器私有化
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public static final CustomEnum SPRING = new CustomEnum("春天","春暖花开");        //static final值无法被修改
    public static final CustomEnum SUMMER = new CustomEnum("夏天","炎炎夏日");
    public static final CustomEnum AUTUMN = new CustomEnum("秋天","秋高气爽");
    public static final CustomEnum WINTER = new CustomEnum("冬天", "凛冬来袭");
    //可以重写toString方法或者添加get方法
    @Override
    public String toString() {
        return "CustomEnum{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
    public static void main(String[] args) {
        System.out.println(CustomEnum.AUTUMN);
    }
}
