package edu.wctc.dice.impl;

import edu.wctc.dice.Sale;
import edu.wctc.dice.iface.ShippingPolicy;

public class FlatRateShipping implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        switch (sale.Country) {
            case "United States":
                sale.shipping = 5.99;
                break;
            case "Japan":
                sale.shipping = 14.50;
                break;
            case "India":
                sale.shipping = 11.79;
                break;
            case "Scotland":
                sale.shipping = 7.54;
                break;
            default: sale.shipping = 0.00;
        }
    }
}
