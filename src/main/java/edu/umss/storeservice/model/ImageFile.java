package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ImageFileDto;

import javax.persistence.*;

@Entity
public class ImageFile extends ModelBase<ImageFileDto>{
    private String fileImageName;
    private String formatImage;
    private String urlImage;
    private Boolean isDeleted;

    @Basic
    public String getFileImageName() {
        return fileImageName;
    }

    public void setFileImageName(String fileImageName) {
        this.fileImageName = fileImageName;
    }

    @Basic
    public String getFormatImage() {
        return formatImage;
    }

    public void setFormatImage(String formatImage) {
        this.formatImage = formatImage;
    }

    @Basic
    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Basic
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

}
