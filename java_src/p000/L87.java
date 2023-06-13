package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p031authapi.zbp;
/* renamed from: L87 */
/* loaded from: classes5.dex */
public final class L87 implements Parcelable.Creator<zbp> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zbp createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) != 1) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                credential = (Credential) SafeParcelReader.createParcelable(parcel, readHeader, Credential.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zbp(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zbp[] newArray(int i) {
        return new zbp[i];
    }
}
