package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.connection.AppIdentifier;
/* renamed from: TP7 */
/* loaded from: classes6.dex */
public final class TP7 implements Parcelable.Creator<AppIdentifier> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AppIdentifier createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) != 1) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new AppIdentifier(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AppIdentifier[] newArray(int i) {
        return new AppIdentifier[i];
    }
}
