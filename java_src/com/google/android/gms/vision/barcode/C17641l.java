package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode;
/* renamed from: com.google.android.gms.vision.barcode.l */
/* loaded from: classes6.dex */
public final class C17641l implements Parcelable.Creator<Barcode.WiFi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Barcode.WiFi createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    } else {
                        i = SafeParcelReader.readInt(parcel, readHeader);
                    }
                } else {
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                }
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new Barcode.WiFi(str, str2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Barcode.WiFi[] newArray(int i) {
        return new Barcode.WiFi[i];
    }
}
