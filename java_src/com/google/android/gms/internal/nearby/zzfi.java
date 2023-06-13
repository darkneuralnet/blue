package com.google.android.gms.internal.nearby;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
@SafeParcelable.Class(creator = "OnEndpointFoundParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzfi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfi> CREATOR = new C32854Fh8();
    @SafeParcelable.Field(getter = "getEndpointId", m51606id = 1)

    /* renamed from: b */
    public String f71062b;
    @SafeParcelable.Field(getter = "getServiceId", m51606id = 2)

    /* renamed from: c */
    public String f71063c;
    @SafeParcelable.Field(getter = "getEndpointName", m51606id = 3)

    /* renamed from: d */
    public String f71064d;
    @SafeParcelable.Field(getter = "getBluetoothDevice", m51606id = 4)

    /* renamed from: e */
    public BluetoothDevice f71065e;
    @SafeParcelable.Field(getter = "getEndpointInfo", m51606id = 5)

    /* renamed from: f */
    public byte[] f71066f;

    private zzfi() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfi) {
            zzfi zzfiVar = (zzfi) obj;
            if (Objects.equal(this.f71062b, zzfiVar.f71062b) && Objects.equal(this.f71063c, zzfiVar.f71063c) && Objects.equal(this.f71064d, zzfiVar.f71064d) && Objects.equal(this.f71065e, zzfiVar.f71065e) && Arrays.equals(this.f71066f, zzfiVar.f71066f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71062b, this.f71063c, this.f71064d, this.f71065e, Integer.valueOf(Arrays.hashCode(this.f71066f)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71062b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f71063c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71064d, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71065e, i, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.f71066f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzfi(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) String str3, @SafeParcelable.Param(m51605id = 4) BluetoothDevice bluetoothDevice, @SafeParcelable.Param(m51605id = 5) byte[] bArr) {
        this.f71062b = str;
        this.f71063c = str2;
        this.f71064d = str3;
        this.f71065e = bluetoothDevice;
        this.f71066f = bArr;
    }
}
