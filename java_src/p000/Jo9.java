package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.connection.Strategy;
/* renamed from: Jo9 */
/* loaded from: classes6.dex */
public final class Jo9 implements Parcelable.Creator<Strategy> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Strategy createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 3) {
                if (fieldId != 4) {
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                } else {
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                i = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new Strategy(i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Strategy[] newArray(int i) {
        return new Strategy[i];
    }
}
