package Common.Model;

public class WriterModel {

    private Integer Id;

    private String name;

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

    public WriterModel(Integer id) {
        Id = id;
    }
}
