package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.messages.internal.zze;
/* renamed from: ye8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52326ye8 implements Parcelable.Creator<zze> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zze createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        double d = 0.0d;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    } else {
                        d = SafeParcelReader.readDouble(parcel, readHeader);
                    }
                } else {
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                i = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zze(i, i2, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zze[] newArray(int i) {
        return new zze[i];
    }
}
