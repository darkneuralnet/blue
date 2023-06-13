package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PayloadTransferUpdateCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes6.dex */
public final class PayloadTransferUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PayloadTransferUpdate> CREATOR = new Al9();
    @SafeParcelable.Field(getter = "getPayloadId", m51606id = 1)

    /* renamed from: b */
    public long f71616b;
    @SafeParcelable.Field(getter = "getStatus", m51606id = 2)

    /* renamed from: c */
    public int f71617c;
    @SafeParcelable.Field(getter = "getTotalBytes", m51606id = 3)

    /* renamed from: d */
    public long f71618d;
    @SafeParcelable.Field(getter = "getBytesTransferred", m51606id = 4)

    /* renamed from: e */
    public long f71619e;

    private PayloadTransferUpdate() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj;
            if (Objects.equal(Long.valueOf(this.f71616b), Long.valueOf(payloadTransferUpdate.f71616b)) && Objects.equal(Integer.valueOf(this.f71617c), Integer.valueOf(payloadTransferUpdate.f71617c)) && Objects.equal(Long.valueOf(this.f71618d), Long.valueOf(payloadTransferUpdate.f71618d)) && Objects.equal(Long.valueOf(this.f71619e), Long.valueOf(payloadTransferUpdate.f71619e))) {
                return true;
            }
        }
        return false;
    }

    public int getStatus() {
        return this.f71617c;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f71616b), Integer.valueOf(this.f71617c), Long.valueOf(this.f71618d), Long.valueOf(this.f71619e));
    }

    /* renamed from: s */
    public long m50571s() {
        return this.f71619e;
    }

    /* renamed from: u */
    public long m50570u() {
        return this.f71616b;
    }

    /* renamed from: v */
    public long m50569v() {
        return this.f71618d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, m50570u());
        SafeParcelWriter.writeInt(parcel, 2, getStatus());
        SafeParcelWriter.writeLong(parcel, 3, m50569v());
        SafeParcelWriter.writeLong(parcel, 4, m50571s());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PayloadTransferUpdate(@SafeParcelable.Param(m51605id = 1) long j, @SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) long j2, @SafeParcelable.Param(m51605id = 4) long j3) {
        this.f71616b = j;
        this.f71617c = i;
        this.f71618d = j2;
        this.f71619e = j3;
    }
}
