package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes5.dex */
public final class zzx implements Parcelable.Creator<DeviceMetaData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceMetaData createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        long j = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                        }
                    } else {
                        j = SafeParcelReader.readLong(parcel, readHeader);
                    }
                } else {
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                }
            } else {
                i = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new DeviceMetaData(i, z, j, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceMetaData[] newArray(int i) {
        return new DeviceMetaData[i];
    }
}
