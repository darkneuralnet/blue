package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzhg;
import com.google.android.gms.internal.nearby.zzhl;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.internal.zzac;
import java.util.ArrayList;
/* renamed from: hC7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41990hC7 implements Parcelable.Creator<MessageFilter> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MessageFilter createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                if (fieldId != 1000) {
                                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                                } else {
                                    i = SafeParcelReader.readInt(parcel, readHeader);
                                }
                            } else {
                                i2 = SafeParcelReader.readInt(parcel, readHeader);
                            }
                        } else {
                            arrayList3 = SafeParcelReader.createTypedList(parcel, readHeader, zzhg.CREATOR);
                        }
                    } else {
                        z = SafeParcelReader.readBoolean(parcel, readHeader);
                    }
                } else {
                    arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, zzhl.CREATOR);
                }
            } else {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzac.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new MessageFilter(i, arrayList, arrayList2, z, arrayList3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MessageFilter[] newArray(int i) {
        return new MessageFilter[i];
    }
}
