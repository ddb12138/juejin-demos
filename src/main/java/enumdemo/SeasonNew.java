package enumdemo;

//enum类
enum  SeasonNew implements interfaceDemo{
    SPRING("春天", "四季如春"),
    SUMMER("夏天", "热的不行");

    private final String seasonName;
    private final String seasonDesc;

    private SeasonNew(String name,String desc){
        this.seasonName=name;
        this.seasonDesc=desc;
    }

    @Override
    public void sayHello() {
        System.out.println("春天到了");
    }

    public static void main(String[] args) {
        SeasonNew.SPRING.sayHello();
        SeasonNew.SUMMER.sayHello();
    }
}
