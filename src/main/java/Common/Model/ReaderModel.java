package Common.Model;

public class ReaderModel {

    private Integer Id;

    private String name;

    private String gender;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ReaderModel(Integer id) {
        Id = id;
    }
}
