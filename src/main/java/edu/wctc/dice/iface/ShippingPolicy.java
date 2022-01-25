package edu.wctc.dice.iface;

import edu.wctc.dice.Sale;

public interface ShippingPolicy {
    void applyShipping(Sale sale);
}
