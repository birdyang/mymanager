package cn.yangys.mymanager.model;

public class TestUserWithBLOBs extends TestUser {
    private byte[] photo;

    private String description;

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}