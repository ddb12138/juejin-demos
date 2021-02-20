package enumdemo;

//首先于上面自定义的class类很相似，只不过抽离了一些固定的前缀如public static final
enum Season {
    //public static final Seasons SPINRG = new Seasons("春天", "四季如春");
    //反正public static final 类名是固定的，还有new 类名也是固定的，不如去掉，然后多个值之间用逗号分开，结束用分号,其余不变
    SPRING("春天", "四季如春"),
    SUMMER("夏天", "热的不行"),
    AUTUMN("秋天", "凉风飒飒"),
    WINTER("冬天", "冰天雪地");

    private final String seasonName;
    private final String seasonDesc;


    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //可以添加其他诉求比如get方法、toString方法....

    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.class.getSuperclass());
    }
}
