package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.vision.zzfz;
/* renamed from: Bl8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31954Bl8 implements Parcelable.Creator<zzfz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzfz createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                j = SafeParcelReader.readLong(parcel, readHeader);
                            }
                        } else {
                            i4 = SafeParcelReader.readInt(parcel, readHeader);
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
        return new zzfz(i, i2, i3, i4, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzfz[] newArray(int i) {
        return new zzfz[i];
    }
}
