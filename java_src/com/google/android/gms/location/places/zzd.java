package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public final class zzd implements Parcelable.Creator<AutocompleteFilter> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AutocompleteFilter createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        ArrayList<Integer> arrayList = null;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 1000) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            i = SafeParcelReader.readInt(parcel, readHeader);
                        }
                    } else {
                        str = SafeParcelReader.createString(parcel, readHeader);
                    }
                } else {
                    arrayList = SafeParcelReader.createIntegerList(parcel, readHeader);
                }
            } else {
                z = SafeParcelReader.readBoolean(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new AutocompleteFilter(i, z, arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AutocompleteFilter[] newArray(int i) {
        return new AutocompleteFilter[i];
    }
}
