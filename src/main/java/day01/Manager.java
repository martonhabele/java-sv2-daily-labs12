package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Manager {

    private List<Running> running = new ArrayList<>();

    public void readAllLines(String fileName){
        try(BufferedReader br = Files.newBufferedReader(Path.of(fileName))){
            String line;
            br.readLine();
            while((line = br.readLine())!=null){
                Running run =  crateRunObjectFromLine(line);
                running.add(run);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot reach file",e);
        }
    }

    public double sumOfMonthAndYear(int year, Month month){
        double sum = 0;
        for(Running actual : running){
            if(actual.getDate().getYear()==year && actual.getDate().getMonth()==month){
                sum+=actual.getKm();
            }
        }
        return sum;
    }

    private Running crateRunObjectFromLine(String line) {
        String[] temp = line.split(";");
        return new Running(Double.parseDouble(temp[0].split(" ")[0]), LocalDate.parse(temp[1]));
    }


}