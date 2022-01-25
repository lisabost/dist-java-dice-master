package edu.wctc.dice.impl;

import edu.wctc.dice.Sale;
import edu.wctc.dice.iface.SalesReport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SummaryReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> saleList) {

        Map<String, Sale> map = new HashMap<>();

        for (Sale sale: saleList) {
            if (map.containsKey(sale.Country)) {
                Sale objectFromMap = map.get(sale.Country);
                objectFromMap.setAmount(objectFromMap.getAmount() + sale.amount);
                objectFromMap.setTax(objectFromMap.getTax() + sale.tax);;
                objectFromMap.setShipping(objectFromMap.getShipping() + sale.shipping);
                map.put(sale.Country, objectFromMap);
            }
            else {
                map.put(sale.Country, sale);
            }
        }

        System.out.println("Summary Sales Report");
        for ( String country : map.keySet()) {
            System.out.printf("%-22s%-22.2f%-22.2f%-22.2f\n", country, map.get(country).getAmount(), map.get(country).getTax(), map.get(country).getShipping());
        }


        }
    }

