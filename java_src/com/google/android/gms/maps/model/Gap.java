package com.google.android.gms.maps.model;
/* loaded from: classes6.dex */
public final class Gap extends PatternItem {

    /* renamed from: d */
    public final float f71417d;

    @Override // com.google.android.gms.maps.model.PatternItem
    public String toString() {
        float f = this.f71417d;
        StringBuilder sb = new StringBuilder(29);
        sb.append("[Gap: length=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
