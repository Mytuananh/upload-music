package anhtuan.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class MusicForm {
    private int id;
    private String name;
    private String single;
    private String category;
    private MultipartFile upload;

    public MusicForm() {
    }

    public MusicForm(int id, String name, String single, String category, MultipartFile upload) {
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

    public MultipartFile getUpload() {
        return upload;
    }

    public void setUpload(MultipartFile upload) {
        this.upload = upload;
    }
}
