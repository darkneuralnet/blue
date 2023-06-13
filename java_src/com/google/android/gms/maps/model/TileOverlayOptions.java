package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new Pt9();
    @SafeParcelable.Field(getter = "getTileProviderDelegate", m51606id = 2, type = "android.os.IBinder")

    /* renamed from: b */
    public InterfaceC36651Vn7 f71499b;

    /* renamed from: c */
    public InterfaceC40725f46 f71500c;
    @SafeParcelable.Field(getter = "isVisible", m51606id = 3)

    /* renamed from: d */
    public boolean f71501d;
    @SafeParcelable.Field(getter = "getZIndex", m51606id = 4)

    /* renamed from: e */
    public float f71502e;
    @SafeParcelable.Field(defaultValue = "true", getter = "getFadeIn", m51606id = 5)

    /* renamed from: f */
    public boolean f71503f;
    @SafeParcelable.Field(getter = "getTransparency", m51606id = 6)

    /* renamed from: g */
    public float f71504g;

    public TileOverlayOptions() {
        this.f71501d = true;
        this.f71503f = true;
        this.f71504g = 0.0f;
    }

    /* renamed from: E */
    public boolean m50599E() {
        return this.f71501d;
    }

    /* renamed from: s */
    public boolean m50597s() {
        return this.f71503f;
    }

    /* renamed from: u */
    public float m50596u() {
        return this.f71504g;
    }

    /* renamed from: v */
    public float m50595v() {
        return this.f71502e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        InterfaceC36651Vn7 interfaceC36651Vn7 = this.f71499b;
        if (interfaceC36651Vn7 == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC36651Vn7.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, asBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 3, m50599E());
        SafeParcelWriter.writeFloat(parcel, 4, m50595v());
        SafeParcelWriter.writeBoolean(parcel, 5, m50597s());
        SafeParcelWriter.writeFloat(parcel, 6, m50596u());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public TileOverlayOptions(@SafeParcelable.Param(m51605id = 2) IBinder iBinder, @SafeParcelable.Param(m51605id = 3) boolean z, @SafeParcelable.Param(m51605id = 4) float f, @SafeParcelable.Param(m51605id = 5) boolean z2, @SafeParcelable.Param(m51605id = 6) float f2) {
        this.f71501d = true;
        this.f71503f = true;
        this.f71504g = 0.0f;
        InterfaceC36651Vn7 m43710d5 = AbstractBinderC39964dn7.m43710d5(iBinder);
        this.f71499b = m43710d5;
        this.f71500c = m43710d5 == null ? null : new Hq9(this);
        this.f71501d = z;
        this.f71502e = f;
        this.f71503f = z2;
        this.f71504g = f2;
    }
}
