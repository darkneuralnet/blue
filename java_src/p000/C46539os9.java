package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.connection.zzt;
/* renamed from: os9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46539os9 implements Parcelable.Creator<zzt> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzt createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            z = SafeParcelReader.readBoolean(parcel, readHeader);
                        }
                    } else {
                        i3 = SafeParcelReader.readInt(parcel, readHeader);
                    }
                } else {
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                i = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzt(i, i2, i3, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzt[] newArray(int i) {
        return new zzt[i];
    }
}
