package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
@SafeParcelable.Class(creator = "BleFilterCreator")
/* loaded from: classes5.dex */
public final class zzhg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhg> CREATOR = new C32512Dv8();
    @SafeParcelable.VersionField(getter = "getVersionCode", m51603id = 1)

    /* renamed from: b */
    public final int f71119b;
    @SafeParcelable.Field(getter = "getServiceUuid", m51606id = 4)

    /* renamed from: c */
    public final ParcelUuid f71120c;
    @SafeParcelable.Field(getter = "getServiceUuidMask", m51606id = 5)

    /* renamed from: d */
    public final ParcelUuid f71121d;
    @SafeParcelable.Field(getter = "getServiceDataUuid", m51606id = 6)

    /* renamed from: e */
    public final ParcelUuid f71122e;
    @SafeParcelable.Field(getter = "getServiceData", m51606id = 7)

    /* renamed from: f */
    public final byte[] f71123f;
    @SafeParcelable.Field(getter = "getServiceDataMask", m51606id = 8)

    /* renamed from: g */
    public final byte[] f71124g;
    @SafeParcelable.Field(getter = "getManufacturerId", m51606id = 9)

    /* renamed from: h */
    public final int f71125h;
    @SafeParcelable.Field(getter = "getManufacturerData", m51606id = 10)

    /* renamed from: i */
    public final byte[] f71126i;
    @SafeParcelable.Field(getter = "getManufacturerDataMask", m51606id = 11)

    /* renamed from: j */
    public final byte[] f71127j;

    @SafeParcelable.Constructor
    public zzhg(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 4) ParcelUuid parcelUuid, @SafeParcelable.Param(m51605id = 5) ParcelUuid parcelUuid2, @SafeParcelable.Param(m51605id = 6) ParcelUuid parcelUuid3, @SafeParcelable.Param(m51605id = 7) byte[] bArr, @SafeParcelable.Param(m51605id = 8) byte[] bArr2, @SafeParcelable.Param(m51605id = 9) int i2, @SafeParcelable.Param(m51605id = 10) byte[] bArr3, @SafeParcelable.Param(m51605id = 11) byte[] bArr4) {
        this.f71119b = i;
        this.f71120c = parcelUuid;
        this.f71121d = parcelUuid2;
        this.f71122e = parcelUuid3;
        this.f71123f = bArr;
        this.f71124g = bArr2;
        this.f71125h = i2;
        this.f71126i = bArr3;
        this.f71127j = bArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhg.class == obj.getClass()) {
            zzhg zzhgVar = (zzhg) obj;
            if (this.f71125h == zzhgVar.f71125h && Arrays.equals(this.f71126i, zzhgVar.f71126i) && Arrays.equals(this.f71127j, zzhgVar.f71127j) && Objects.equal(this.f71122e, zzhgVar.f71122e) && Arrays.equals(this.f71123f, zzhgVar.f71123f) && Arrays.equals(this.f71124g, zzhgVar.f71124g) && Objects.equal(this.f71120c, zzhgVar.f71120c) && Objects.equal(this.f71121d, zzhgVar.f71121d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f71125h), Integer.valueOf(Arrays.hashCode(this.f71126i)), Integer.valueOf(Arrays.hashCode(this.f71127j)), this.f71122e, Integer.valueOf(Arrays.hashCode(this.f71123f)), Integer.valueOf(Arrays.hashCode(this.f71124g)), this.f71120c, this.f71121d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71119b);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71120c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f71121d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f71122e, i, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.f71123f, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.f71124g, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f71125h);
        SafeParcelWriter.writeByteArray(parcel, 10, this.f71126i, false);
        SafeParcelWriter.writeByteArray(parcel, 11, this.f71127j, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
