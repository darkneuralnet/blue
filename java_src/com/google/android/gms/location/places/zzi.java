package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class zzi implements Parcelable.Creator<PlaceFilter> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlaceFilter createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList<Integer> arrayList = null;
        ArrayList arrayList2 = null;
        boolean z = false;
        ArrayList<String> arrayList3 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 6) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, zzp.CREATOR);
                        }
                    } else {
                        z = SafeParcelReader.readBoolean(parcel, readHeader);
                    }
                } else {
                    arrayList3 = SafeParcelReader.createStringList(parcel, readHeader);
                }
            } else {
                arrayList = SafeParcelReader.createIntegerList(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new PlaceFilter((List<Integer>) arrayList, z, (List<String>) arrayList3, (List<zzp>) arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlaceFilter[] newArray(int i) {
        return new PlaceFilter[i];
    }
}
