package anhtuan.model;

import java.util.List;

public class Music {
    private int id;
    private String name;
    private String single;
    private String category;
    private String upload;

    public Music() {
    }

    public Music(int id, String name, String single, String category, String upload) {
        this.id = id;
        this.name = name;
        this.single = single;
        this.category = category;
        this.upload = upload;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUpload() {
        return upload;
    }

    public void setUpload(String upload) {
        this.upload = upload;
    }
}


