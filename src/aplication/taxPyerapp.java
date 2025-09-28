package aplication;

import java.util.ArrayList;
import java.util.List;

import entity.Company;
import entity.Individual;
import entity.taxPayer;

public class taxPyerapp {
    public static void main(String[] args) {
        List<taxPayer>list=new ArrayList<>();
         Double tot=0.00;
        list.add(new Individual("Martha",    120000.00, 1000.00));
        list.add(new Company("Lucas",  400000.00, 25));
        System.out.println("Taxes PAID");
        for(taxPayer tax: list){
            System.out.println(tax);
             tot+=tax.tax();
            System.out.println(tot);
        }
    }
}
