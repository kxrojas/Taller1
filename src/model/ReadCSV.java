package model;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadCSV {

    private Datos claseDatos;
    private ArrayList<Datos> datos = new ArrayList<Datos>();

    public void uploadData(){

        FileReader arcCSV =null;
        CSVReader csvReader = null;

        try{
            arcCSV = new FileReader("csv/data.csv");
            CSVParser punto =new CSVParserBuilder().withSeparator(';').build();
            csvReader = new CSVReaderBuilder(arcCSV).withCSVParser(punto).build();
            List<String[] > data = csvReader.readAll();

            for (int i = 1; i < datos.size(); i++){

                long invoiceNo;
                long stockCode;
                String description;
                double quantity;
                Date invoiceDate;
                double unitPrice;
                long costumerID;
                String country;

                try{
                    invoiceNo = Long.parseLong(data.get(i)[0].split(",")[0]);
                } catch (NumberFormatException n){
                    invoiceNo = 0;
                }
                try {
                    stockCode = Long.parseLong(data.get(i)[1].split(",")[1]);
                } catch (NumberFormatException n){
                    stockCode = 0;
                }

                description =data.get(i)[0].split(",")[2];

                try {
                    quantity =  Double.parseDouble(data.get(i)[0].split(",")[3]);
                } catch (NumberFormatException n){
                    quantity = 0;
                }
                try {
                    SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                    invoiceDate = fecha.parse(data.get(i)[0].split(",")[4]);
                } catch (ParseException p){
                    invoiceDate = null;
                }
                try {
                    unitPrice = Double.parseDouble(data.get(i)[0].split(",")[5]);
                } catch (NumberFormatException n){
                    unitPrice = 0;
                }
                try {
                    costumerID = Long.parseLong(data.get(i)[0].split(",")[6]);
                } catch (NumberFormatException n){
                    costumerID = 0;
                }

                country = data.get(i)[0].split(",")[7];

                claseDatos = new Datos(invoiceNo, stockCode, description, quantity, invoiceDate, unitPrice, costumerID, country);
                datos.add(claseDatos);
            }
        }
        catch (IOException | CsvException e){
            e.printStackTrace();
        }
        try {
            arcCSV.close();
            csvReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public ArrayList<Datos> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Datos> datos) {
        this.datos = datos;
    }
}
