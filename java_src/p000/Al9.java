package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
/* renamed from: Al9 */
/* loaded from: classes6.dex */
public final class Al9 implements Parcelable.Creator<PayloadTransferUpdate> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PayloadTransferUpdate createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            j3 = SafeParcelReader.readLong(parcel, readHeader);
                        }
                    } else {
                        j2 = SafeParcelReader.readLong(parcel, readHeader);
                    }
                } else {
                    i = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                j = SafeParcelReader.readLong(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new PayloadTransferUpdate(j, i, j2, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PayloadTransferUpdate[] newArray(int i) {
        return new PayloadTransferUpdate[i];
    }
}
