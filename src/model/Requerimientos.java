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

}