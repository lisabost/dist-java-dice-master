package edu.wctc.dice.impl;

import edu.wctc.dice.Sale;
import edu.wctc.dice.iface.ShippingPolicy;

public class FreeShipping implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        sale.shipping = 0.00;
    }
}
