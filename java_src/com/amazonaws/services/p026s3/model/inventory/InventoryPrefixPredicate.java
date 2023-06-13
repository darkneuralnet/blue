package com.amazonaws.services.p026s3.model.inventory;
/* renamed from: com.amazonaws.services.s3.model.inventory.InventoryPrefixPredicate */
/* loaded from: classes3.dex */
public final class InventoryPrefixPredicate extends InventoryFilterPredicate {
    private final String prefix;

    public InventoryPrefixPredicate(String str) {
        this.prefix = str;
    }

    @Override // com.amazonaws.services.p026s3.model.inventory.InventoryFilterPredicate
    public void accept(InventoryPredicateVisitor inventoryPredicateVisitor) {
        inventoryPredicateVisitor.visit(this);
    }

    public String getPrefix() {
        return this.prefix;
    }
}
