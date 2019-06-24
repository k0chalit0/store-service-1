package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.BillDto;

import javax.persistence.*;

@Entity
@Table(name = "bill")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "GetAllBill",
                procedureName = "GetAllBill",
                resultClasses = Bill.class
        ),
        @NamedStoredProcedureQuery(
                name = "DeleteBillById",
                procedureName = "DeleteBillById",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "id", type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "result", type = Boolean.class)
                }
        ),
        @NamedStoredProcedureQuery(
                name = "GetBillById",
                procedureName = "GetBillById",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "id", type = Long.class)
                },
                resultClasses = Bill.class
        )/*,
        @NamedStoredProcedureQuery(
                name = "SaveBill",
                procedureName = "SaveBill",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "model", type = Bill.class)
                },
                resultClasses = Bill.class
        )*/
})
public class Bill extends ModelBase<BillDto>{

    private String billCode;
    private String nit;
    private int totalPay;
    private Boolean isDeleted;

    @Basic
    @Column(name = "Bill_Code")
    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    @Basic
    @Column(name = "NIT")
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Basic
    @Column(name = "Total_Pay")
    public int getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
    }

    @Basic
    @Column(name = "Is_Deleted")
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
