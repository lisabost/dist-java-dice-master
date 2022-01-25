package edu.wctc.dice.iface;

import edu.wctc.dice.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> saleList);
}
