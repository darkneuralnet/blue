package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.connection.ConnectionOptions;
/* renamed from: wN8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50983wN8 implements Parcelable.Creator<ConnectionOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionOptions createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = true;
        byte[] bArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 2:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 3:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 4:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    z6 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 10:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 12:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new ConnectionOptions(z, z3, z4, z5, z6, z7, z8, z9, bArr, z2, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionOptions[] newArray(int i) {
        return new ConnectionOptions[i];
    }
}
