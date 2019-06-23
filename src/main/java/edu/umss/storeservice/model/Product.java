package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ProductDto;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product extends ModelBase<ProductDto>{
    private String nameProduct;
    private Integer quantityProduct;
    private Integer unitCostProduct;
    private Boolean isDeleted;

    @Basic
    @Column(name = "Name_Product")
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Basic
    @Column(name = "Quantity_Product")
    public Integer getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(Integer quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    @Basic
    @Column(name = "Unit_Cost_Product")
    public Integer getUnitCostProduct() {
        return unitCostProduct;
    }

    public void setUnitCostProduct(Integer unitCostProduct) {
        this.unitCostProduct = unitCostProduct;
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
