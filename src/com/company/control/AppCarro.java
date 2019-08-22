package com.company.control;

import com.company.model.Carro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AppCarro {

    public static void main(String[] args) {

        Carro carro = new Carro("Citroen", "C3", 2008);
        System.out.println(carro.getMarca());


        System.out.println("\n\nList");
        List<Carro> carros = new ArrayList<>();
        carros.add(carro);
        System.out.println(carros);

        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");
        carro1.setModelo("Ford");
        carro1.setAnoFabricacao(2007);
        carros.add(carro1);

        Carro carro3 = new Carro();
        carro3.setMarca("Toyota");
        carro3.setModelo("Corolla");
        carro3.setAnoFabricacao(2011);
        carros.add(carro3);


        Carro carro2 = new Carro();
        carro2.setMarca("Toyota");
        carro2.setModelo("Etios");
        carro2.setAnoFabricacao(2013);
        carros.add(carro2);

        Carro carro4 = new Carro();
        carro4.setMarca("Honda");
        carro4.setModelo("Civic");
        carro4.setAnoFabricacao(2009);
        carros.add(carro4);

        Carro carro5 = new Carro();
        carro5.setMarca("Chevrolet");
        carro5.setModelo("S10 Rodeio");
        carro5.setAnoFabricacao(2013);
        carros.add(carro5);

        System.out.println(carros);
        System.out.print(carro.equals(carro2));
        System.out.println("\n " + carro.equals(carro));
        System.out.println(carros.get(0) + "\n " + carros.get(1));
        System.out.println("Objetos na collection List (utilizando foreatch tradicional):\n");
        for (Carro c : carros) {
            System.out.println(c);
            if(c.getMarca().equals("Etios")){
                System.out.println("Achou o objeto de marca=Etios\n");
            }else
                System.out.println("Não Encontrou");
        }

        System.out.println("\n\nMap");
        Map<Integer, Carro> carrosMap = new HashMap<>();
        carrosMap.put(carro.hashCode(), carro);
        carrosMap.put(carro2.hashCode(), carro2);
        System.out.println(carrosMap);
        carrosMap.put(carro.hashCode(), carro);
        carrosMap.put(carro2.hashCode(), carro2);
        System.out.println(carrosMap);
        System.out.println(carrosMap.get(carro2.hashCode()));
        System.out.println(carrosMap.get(carro2.hashCode()));

    }
}