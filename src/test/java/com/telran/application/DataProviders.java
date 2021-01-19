package com.telran.application;

import com.telran.models.ModelBase;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {

    @DataProvider
    public Iterator<Object[]> valid(){
        List<Object[]> list= new ArrayList<>();
        list.add(new Object[]{"5","6"});

        return list.iterator();
    }

    @org.testng.annotations.DataProvider
    public Iterator<Object[]>validFromFile() throws IOException {
        List<Object[]> list= new ArrayList<>();

        BufferedReader reader =
                new BufferedReader(new FileReader(new File("src/test/resources/data.csv")));
        String line=reader.readLine();
        while (line!=null){
            String[] split=line.split(";");
            list.add(new Object[]{new ModelBase().withFild1(split[0]).withFild2(split[1])});
            line=reader.readLine();
        }

        return list.iterator();
    }

}
