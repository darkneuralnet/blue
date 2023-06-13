package com.amazonaws.services.p026s3.model.inventory;
/* renamed from: com.amazonaws.services.s3.model.inventory.InventoryFrequency */
/* loaded from: classes3.dex */
public enum InventoryFrequency {
    Daily("Daily"),
    Weekly("Weekly");
    
    private final String frequency;

    InventoryFrequency(String str) {
        this.frequency = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.frequency;
    }
}
