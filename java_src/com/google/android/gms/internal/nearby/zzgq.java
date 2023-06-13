package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
@SafeParcelable.Class(creator = "SendPayloadParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzgq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgq> CREATOR = new C35743Rq8();
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", m51606id = 1, type = "android.os.IBinder")

    /* renamed from: b */
    public InterfaceC34429Ma8 f71101b;
    @SafeParcelable.Field(getter = "getRemoteEndpointIds", m51606id = 2)

    /* renamed from: c */
    public String[] f71102c;
    @SafeParcelable.Field(getter = "getPayload", m51606id = 3)

    /* renamed from: d */
    public zzgd f71103d;
    @SafeParcelable.Field(getter = "getSendReliably", m51606id = 4)

    /* renamed from: e */
    public boolean f71104e;

    private zzgq() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgq) {
            zzgq zzgqVar = (zzgq) obj;
            if (Objects.equal(this.f71101b, zzgqVar.f71101b) && Arrays.equals(this.f71102c, zzgqVar.f71102c) && Objects.equal(this.f71103d, zzgqVar.f71103d) && Objects.equal(Boolean.valueOf(this.f71104e), Boolean.valueOf(zzgqVar.f71104e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71101b, Integer.valueOf(Arrays.hashCode(this.f71102c)), this.f71103d, Boolean.valueOf(this.f71104e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        InterfaceC34429Ma8 interfaceC34429Ma8 = this.f71101b;
        if (interfaceC34429Ma8 == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC34429Ma8.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, asBinder, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.f71102c, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71103d, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f71104e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzgq(@SafeParcelable.Param(m51605id = 1) IBinder iBinder, @SafeParcelable.Param(m51605id = 2) String[] strArr, @SafeParcelable.Param(m51605id = 3) zzgd zzgdVar, @SafeParcelable.Param(m51605id = 4) boolean z) {
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
        this.f71101b = c42800ia8;
        this.f71102c = strArr;
        this.f71103d = zzgdVar;
        this.f71104e = z;
    }
}
