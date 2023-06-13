package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "CancelPayloadParamsCreator")
/* loaded from: classes5.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new C43011iv9();
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", m51606id = 1, type = "android.os.IBinder")

    /* renamed from: b */
    public InterfaceC34429Ma8 f71141b;
    @SafeParcelable.Field(getter = "getPayloadId", m51606id = 2)

    /* renamed from: c */
    public long f71142c;

    private zzv() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzv) {
            zzv zzvVar = (zzv) obj;
            if (Objects.equal(this.f71141b, zzvVar.f71141b) && Objects.equal(Long.valueOf(this.f71142c), Long.valueOf(zzvVar.f71142c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71141b, Long.valueOf(this.f71142c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        InterfaceC34429Ma8 interfaceC34429Ma8 = this.f71141b;
        if (interfaceC34429Ma8 == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC34429Ma8.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, asBinder, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f71142c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzv(@SafeParcelable.Param(m51605id = 1) IBinder iBinder, @SafeParcelable.Param(m51605id = 2) long j) {
        InterfaceC34429Ma8 c42800ia8;
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
        this.f71141b = c42800ia8;
        this.f71142c = j;
    }
}
