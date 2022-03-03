package model;

import java.util.ArrayList;

public class Requerimientos {

    private ReadCSV readCSV = new ReadCSV();

    public double sumTotalSales(ArrayList<Datos> datos) {
        double total = 0.0;
        int length = datos.size() / 9;
        for (int i = 0; i < length; i++) {
            total += (datos.get(i).getQuantity() * datos.get(i).getUnitPrice());
        }
        return total;
    }

}