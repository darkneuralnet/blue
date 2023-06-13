package com.amazonaws.services.p026s3.model.inventory;
/* renamed from: com.amazonaws.services.s3.model.inventory.InventoryFormat */
/* loaded from: classes3.dex */
public enum InventoryFormat {
    CSV("CSV");
    
    private final String format;

    InventoryFormat(String str) {
        this.format = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.format;
    }
}
