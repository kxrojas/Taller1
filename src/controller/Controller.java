package controller;

import model.ReadCSV;
import model.Requerimientos;
import view.Vista;

public class Controller {

    private Requerimientos r;
    private ReadCSV readCSV;
    private Vista v;

    public Controller(){
        readCSV = new ReadCSV();
        readCSV.uploadData();
        v = new Vista();
        v.mostrarMensaje("El proceso de carga del archivo ha finalizado");
        r = new Requerimientos();
        r.sumTotalSales(readCSV.getDatos());
        v.mostrarMensaje("El total de ventas es: $" + String.valueOf(r.sumTotalSales(readCSV.getDatos())));
        }
    }

