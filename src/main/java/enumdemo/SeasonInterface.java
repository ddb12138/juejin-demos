package enumdemo;

enum SeasonInterface implements interfaceDemo {
    SPRING("春天", "四季如春"){
        @Override
        public void sayHello() {
            System.out.println("春天到了");
        }
    },
    SUMMER("夏天", "热的不行"){
        @Override
        public void sayHello() {
            System.out.println("夏天到了");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    private SeasonInterface(String name,String desc){
        this.seasonName=name;
        this.seasonDesc=desc;
    }


    public static void main(String[] args) {
        SeasonInterface.SPRING.sayHello();
        SeasonInterface.SUMMER.sayHello();
    }
}
