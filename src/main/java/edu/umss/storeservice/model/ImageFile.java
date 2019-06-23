package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ImageFileDto;

import javax.persistence.*;

@Entity
@Table(name = "IMAGE_FILE", schema = "dbo", catalog = "SYSTEMSALES")
public class ImageFile extends ModelBase<ImageFileDto>{
    private String fileImageName;
    private String formatImage;
    private String urlImage;
    private Boolean isDeleted;

    @Basic
    @Column(name = "File_Image_Name")
    public String getFileImageName() {
        return fileImageName;
    }

    public void setFileImageName(String fileImageName) {
        this.fileImageName = fileImageName;
    }

    @Basic
    @Column(name = "Format_Image")
    public String getFormatImage() {
        return formatImage;
    }

    public void setFormatImage(String formatImage) {
        this.formatImage = formatImage;
    }

    @Basic
    @Column(name = "URL_Image")
    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Basic
    @Column(name = "Is_deleted")
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

}
