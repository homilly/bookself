package Common.Model;


import javax.persistence.Id;

public class ReaderModel {

    @javax.persistence.Id
    private long Id;

    private String name;

    private String gender;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
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
