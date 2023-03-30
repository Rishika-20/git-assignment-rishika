public class Person {
    String name;
    // typo mistake.
    Intege age;
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
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Boolean isAdult(String name, Integer age) {
        if(age >= 18) return true;
          else return false;
    }
}
