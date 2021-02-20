package reflection;


public class Person {
    @ParamAnno(value = "ddb12138")
    private String name;
    @ParamAnno(value = "13")
    private Integer age;
    @ParamAnno(value = "20.2d")
    private Double money;
    @ParamAnno(value = "true")
    private Boolean man;
    @ParamAnno(value = "郭")
    private Character lastName='无';

    public Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Boolean getMan() {
        return man;
    }

    public void setMan(Boolean man) {
        this.man = man;
    }

    public Character getLastName() {
        return lastName;
    }

    public void setLastName(Character lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "reflection.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", man=" + man +
                ", lastName=" + lastName +
                '}';
    }
}
