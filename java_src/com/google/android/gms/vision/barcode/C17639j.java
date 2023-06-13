package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode;
/* renamed from: com.google.android.gms.vision.barcode.j */
/* loaded from: classes6.dex */
public final class C17639j implements Parcelable.Creator<Barcode.Sms> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Barcode.Sms createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                } else {
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                }
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new Barcode.Sms(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Barcode.Sms[] newArray(int i) {
        return new Barcode.Sms[i];
    }
}
