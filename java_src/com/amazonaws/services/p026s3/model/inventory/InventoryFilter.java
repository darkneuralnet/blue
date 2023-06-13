package com.amazonaws.services.p026s3.model.inventory;

import java.io.Serializable;
/* renamed from: com.amazonaws.services.s3.model.inventory.InventoryFilter */
/* loaded from: classes3.dex */
public class InventoryFilter implements Serializable {
    private InventoryFilterPredicate predicate;

    public InventoryFilter() {
    }

    public InventoryFilterPredicate getPredicate() {
        return this.predicate;
    }

    public void setPredicate(InventoryFilterPredicate inventoryFilterPredicate) {
        this.predicate = inventoryFilterPredicate;
    }

    public InventoryFilter withPredicate(InventoryFilterPredicate inventoryFilterPredicate) {
        setPredicate(inventoryFilterPredicate);
        return this;
    }

    public InventoryFilter(InventoryFilterPredicate inventoryFilterPredicate) {
        this.predicate = inventoryFilterPredicate;
    }
}