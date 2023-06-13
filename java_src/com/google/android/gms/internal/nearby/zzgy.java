package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
@SafeParcelable.Class(creator = "StartDiscoveryParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzgy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgy> CREATOR = new C34825Ns8();
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", m51606id = 1, type = "android.os.IBinder")

    /* renamed from: b */
    public InterfaceC34429Ma8 f71113b;
    @SafeParcelable.Field(getter = "getServiceId", m51606id = 3)

    /* renamed from: c */
    public String f71114c;
    @SafeParcelable.Field(getter = "getDurationMillis", m51606id = 4)

    /* renamed from: d */
    public long f71115d;
    @SafeParcelable.Field(getter = "getOptions", m51606id = 5)

    /* renamed from: e */
    public DiscoveryOptions f71116e;
    @SafeParcelable.Field(getter = "getDiscoveryListenerAsBinder", m51606id = 6, type = "android.os.IBinder")

    /* renamed from: f */
    public I88 f71117f;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", m51606id = 2, type = "android.os.IBinder")

    /* renamed from: g */
    public N78 f71118g;

    private zzgy() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgy) {
            zzgy zzgyVar = (zzgy) obj;
            if (Objects.equal(this.f71113b, zzgyVar.f71113b) && Objects.equal(this.f71118g, zzgyVar.f71118g) && Objects.equal(this.f71114c, zzgyVar.f71114c) && Objects.equal(Long.valueOf(this.f71115d), Long.valueOf(zzgyVar.f71115d)) && Objects.equal(this.f71116e, zzgyVar.f71116e) && Objects.equal(this.f71117f, zzgyVar.f71117f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71113b, this.f71118g, this.f71114c, Long.valueOf(this.f71115d), this.f71116e, this.f71117f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        InterfaceC34429Ma8 interfaceC34429Ma8 = this.f71113b;
        IBinder iBinder = null;
        if (interfaceC34429Ma8 == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC34429Ma8.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, asBinder, false);
        N78 n78 = this.f71118g;
        if (n78 == null) {
            asBinder2 = null;
        } else {
            asBinder2 = n78.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, asBinder2, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71114c, false);
        SafeParcelWriter.writeLong(parcel, 4, this.f71115d);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f71116e, i, false);
        I88 i88 = this.f71117f;
        if (i88 != null) {
            iBinder = i88.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzgy(@SafeParcelable.Param(m51605id = 1) IBinder iBinder, @SafeParcelable.Param(m51605id = 2) IBinder iBinder2, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 4) long j, @SafeParcelable.Param(m51605id = 5) DiscoveryOptions discoveryOptions, @SafeParcelable.Param(m51605id = 6) IBinder iBinder3) {
        InterfaceC34429Ma8 c42800ia8;
        N78 n78;
        I88 i88 = null;
        if (iBinder == null) {
            c42800ia8 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            if (queryLocalInterface instanceof InterfaceC34429Ma8) {
                c42800ia8 = (InterfaceC34429Ma8) queryLocalInterface;
            } else {
                c42800ia8 = new C42800ia8(iBinder);
            }
        }
        if (iBinder2 == null) {
            n78 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
            if (queryLocalInterface2 instanceof N78) {
                n78 = (N78) queryLocalInterface2;
            } else {
                n78 = new N78(iBinder2);
            }
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            if (queryLocalInterface3 instanceof I88) {
                i88 = (I88) queryLocalInterface3;
            } else {
                i88 = new C39582d88(iBinder3);
            }
        }
        this.f71113b = c42800ia8;
        this.f71118g = n78;
        this.f71114c = str;
        this.f71115d = j;
        this.f71116e = discoveryOptions;
        this.f71117f = i88;
    }
}
