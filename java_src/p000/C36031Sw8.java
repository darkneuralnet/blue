package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzhl;
/* renamed from: Sw8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36031Sw8 implements Parcelable.Creator<zzhl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzhl createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        boolean z = false;
        byte[] bArr = null;
        int i2 = 0;
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
                        z = SafeParcelReader.readBoolean(parcel, readHeader);
                    }
                } else {
                    bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                }
            } else {
                i2 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzhl(i, i2, bArr, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzhl[] newArray(int i) {
        return new zzhl[i];
    }
}
