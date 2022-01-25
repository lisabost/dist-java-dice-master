package edu.wctc.dice.impl;

import edu.wctc.dice.Sale;
import edu.wctc.dice.iface.SalesReport;

import java.util.List;

public class DetailReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> saleList) {
        System.out.println("Sales Detail Report");
        System.out.printf("%-22s%-22s%-22s%-22s%-22s\n", "Customer", "Country", "Amount", "Tax", "Shipping");
        for (Sale sale: saleList) {
            System.out.printf("%-22s%-22s%-22.2f%-22.2f%-22.2f\n", sale.Customer, sale.Country, sale.amount, sale.tax, sale.shipping);
        }

    }
}
