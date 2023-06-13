package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new C33699Ix7();
    @SafeParcelable.Field(getter = "z", m51606id = 2)

    /* renamed from: b */
    public final Bundle f71528b;

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(m51605id = 2) Bundle bundle) {
        this.f71528b = bundle;
    }

    /* renamed from: E */
    public final Long m50587E(String str) {
        return Long.valueOf(this.f71528b.getLong("value"));
    }

    /* renamed from: F */
    public final Object m50586F(String str) {
        return this.f71528b.get(str);
    }

    /* renamed from: K */
    public final String m50585K(String str) {
        return this.f71528b.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C40647ew7(this);
    }

    public final String toString() {
        return this.f71528b.toString();
    }

    /* renamed from: u */
    public final Bundle m50583u() {
        return new Bundle(this.f71528b);
    }

    /* renamed from: v */
    public final Double m50582v(String str) {
        return Double.valueOf(this.f71528b.getDouble("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, m50583u(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f71528b.size();
    }
}
