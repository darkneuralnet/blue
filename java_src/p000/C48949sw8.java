package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzhj;
/* renamed from: sw8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48949sw8 implements Parcelable.Creator<zzhj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzhj createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 3) {
                if (fieldId != 6) {
                    if (fieldId != 1000) {
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
        return new zzhj(i, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzhj[] newArray(int i) {
        return new zzhj[i];
    }
}
