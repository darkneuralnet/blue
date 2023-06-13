package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzfc;
/* renamed from: Sf8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35878Sf8 implements Parcelable.Creator<zzfc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzfc createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    } else {
                        bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                    }
                } else {
                    i = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzfc(str, i, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzfc[] newArray(int i) {
        return new zzfc[i];
    }
}
