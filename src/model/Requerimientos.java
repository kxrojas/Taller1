package model;

import java.util.ArrayList;

public class Requerimientos {

    private ReadCSV readCSV = new ReadCSV();

    public double sumTotalSales(ArrayList<Datos> datos){
        double total = 0.0;
        for (Datos dato : datos) {
            total += (dato.getQuantity() * dato.getUnitPrice());
        }
        return total;
    }

    public String findByInvoiceNo (String invoiceNo, ArrayList<Datos> datos){
        int invNo = Integer.parseInt(invoiceNo);
        String resp = "";

        for (int i = 0; i < datos.size(); i++) {
            int buscar = datos.get(i).getInvoiceNo();
            if (invNo == buscar){
                String factura = ("Invoice No:        " + datos.get(i).getInvoiceNo()
                        +"\nStock Code:     "+ datos.get(i).getStockCode()
                        +"\nDescription:    "+ datos.get(i).getDescription()
                        +"\nQuantity:       "+ datos.get(i).getQuantity()
                        +"\nInvoice Date:   "+ datos.get(i).getInvoiceDate()
                        +"\nUnit Price:     "+ datos.get(i).getUnitPrice()
                        +"\nCostumer ID:    "+ datos.get(i).getCostumerID()
                        +"\nCountry:        "+ datos.get(i).getCountry());

                resp = "El detalle de la factura solicitada (" +invoiceNo+ ") es\n\n" + factura;
            } else {
                resp = "El número ingresado no coincide con ninguna factura";
            }
        }
        return resp;
    }

    public int countByStockCode(String stockCode, ArrayList<Datos> datos){
        stockCode = stockCode.toUpperCase();
        int contador = 0;
        String buscar = "";

        for (int i = 0; i < datos.size(); i++){
            buscar =  datos.get(i).getStockCode();
            if (stockCode.equals(buscar)){
                contador += datos.get(i).getQuantity();
            }
        }
        return contador;
    }
}