package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode;
/* renamed from: com.google.android.gms.vision.barcode.m */
/* loaded from: classes6.dex */
public final class C17642m implements Parcelable.Creator<Barcode.UrlBookmark> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Barcode.UrlBookmark createFromParcel(Parcel parcel) {
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
        return new Barcode.UrlBookmark(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Barcode.UrlBookmark[] newArray(int i) {
        return new Barcode.UrlBookmark[i];
    }
}
