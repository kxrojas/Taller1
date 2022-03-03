package model;

import java.util.Date;

public class Datos {

    private int invoiceNo;
    private String stockCode;
    private String description;
    private double quantity;
    private Date invoiceDate;
    private double unitPrice;
    private int costumerID;
    private String country;

    public Datos(int invoiceNo, String stockCode, String description, double quantity, Date invoiceDate, double unitPrice, int costumerID, String country) {
        this.invoiceNo = invoiceNo;
        this.stockCode = stockCode;
        this.description = description;
        this.quantity = quantity;
        this.invoiceDate = invoiceDate;
        this.unitPrice = unitPrice;
        this.costumerID = costumerID;
        this.country = country;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCostumerID() {
        return costumerID;
    }

    public void setCostumerID(int costumerID) {
        this.costumerID = costumerID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "invoiceNo=" + invoiceNo +
                ", stockCode='" + stockCode + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", invoiceDate=" + invoiceDate +
                ", unitPrice=" + unitPrice +
                ", costumerID=" + costumerID +
                ", country='" + country + '\'' +
                '}';
    }
}
