package com.google.android.gms.maps.model;
/* loaded from: classes6.dex */
public final class CustomCap extends Cap {

    /* renamed from: e */
    public final C6378PT f71414e;

    /* renamed from: f */
    public final float f71415f;

    @Override // com.google.android.gms.maps.model.Cap
    public String toString() {
        String valueOf = String.valueOf(this.f71414e);
        float f = this.f71415f;
        StringBuilder sb = new StringBuilder(valueOf.length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
