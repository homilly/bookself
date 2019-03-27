package hello.Model;

public class Person {

    private long id;

    private String name;

    private String sex;

    private String signature;

    public Person(long id) {
        this.id = id;
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
