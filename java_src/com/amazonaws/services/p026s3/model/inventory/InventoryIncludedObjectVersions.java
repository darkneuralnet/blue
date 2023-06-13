package com.amazonaws.services.p026s3.model.inventory;
/* renamed from: com.amazonaws.services.s3.model.inventory.InventoryIncludedObjectVersions */
/* loaded from: classes3.dex */
public enum InventoryIncludedObjectVersions {
    All("All"),
    Current("Current");
    
    private final String name;

    InventoryIncludedObjectVersions(String str) {
        this.name = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
