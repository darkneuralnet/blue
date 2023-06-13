package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p000.WO1;
@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new C39619dC7();
    @SafeParcelable.Field(getter = "getType", m51606id = 2)

    /* renamed from: b */
    public final int f71402b;
    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", m51606id = 3, type = "android.os.IBinder")

    /* renamed from: c */
    public final C6378PT f71403c;
    @SafeParcelable.Field(getter = "getBitmapRefWidth", m51606id = 4)

    /* renamed from: d */
    public final Float f71404d;

    public Cap(int i) {
        this(i, (C6378PT) null, (Float) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        if (this.f71402b == cap.f71402b && Objects.equal(this.f71403c, cap.f71403c) && Objects.equal(this.f71404d, cap.f71404d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f71402b), this.f71403c, this.f71404d);
    }

    public String toString() {
        int i = this.f71402b;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f71402b);
        C6378PT c6378pt = this.f71403c;
        if (c6378pt == null) {
            asBinder = null;
        } else {
            asBinder = c6378pt.m90218a().asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, asBinder, false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.f71404d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public Cap(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) IBinder iBinder, @SafeParcelable.Param(m51605id = 4) Float f) {
        this(i, iBinder == null ? null : new C6378PT(WO1.AbstractBinderC9015a.m78501c5(iBinder)), f);
    }

    public Cap(int i, C6378PT c6378pt, Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            z = c6378pt != null && z2;
            i = 3;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), c6378pt, f));
        this.f71402b = i;
        this.f71403c = c6378pt;
        this.f71404d = f;
    }
}
