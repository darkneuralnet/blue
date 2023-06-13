package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes5.dex */
public final class zbb implements Parcelable.Creator<CredentialPickerConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CredentialPickerConfig createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 1000) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                i = SafeParcelReader.readInt(parcel, readHeader);
                            }
                        } else {
                            i2 = SafeParcelReader.readInt(parcel, readHeader);
                        }
                    } else {
                        z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    }
                } else {
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                }
            } else {
                z = SafeParcelReader.readBoolean(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CredentialPickerConfig[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
