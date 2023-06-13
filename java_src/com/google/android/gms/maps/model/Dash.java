package com.google.android.gms.maps.model;
/* loaded from: classes6.dex */
public final class Dash extends PatternItem {

    /* renamed from: d */
    public final float f71416d;

    @Override // com.google.android.gms.maps.model.PatternItem
    public String toString() {
        float f = this.f71416d;
        StringBuilder sb = new StringBuilder(30);
        sb.append("[Dash: length=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
