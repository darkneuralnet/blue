package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzfo;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
/* renamed from: lj8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44669lj8 implements Parcelable.Creator<zzfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzfo createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        PayloadTransferUpdate payloadTransferUpdate = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                } else {
                    payloadTransferUpdate = (PayloadTransferUpdate) SafeParcelReader.createParcelable(parcel, readHeader, PayloadTransferUpdate.CREATOR);
                }
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzfo(str, payloadTransferUpdate);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzfo[] newArray(int i) {
        return new zzfo[i];
    }
}
