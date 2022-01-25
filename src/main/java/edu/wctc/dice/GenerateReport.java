package edu.wctc.dice;

import edu.wctc.dice.iface.SalesInput;
import edu.wctc.dice.iface.SalesReport;
import edu.wctc.dice.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GenerateReport {
    private SalesInput in;
    private SalesReport report;
    private ShippingPolicy ship;

    @Autowired
    public GenerateReport(SalesInput in, SalesReport report, ShippingPolicy ship) {
        this.in = in;
        this.report = report;
        this.ship = ship;
    }

    public void generateReport(){
        List<Sale> allSales = in.getSales();
        for(Sale aSale : allSales)
            ship.applyShipping(aSale);
        report.generateReport(allSales);
    }
}
