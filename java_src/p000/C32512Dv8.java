package p000;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzhg;
/* renamed from: Dv8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32512Dv8 implements Parcelable.Creator<zzhg> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzhg createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        ParcelUuid parcelUuid = null;
        ParcelUuid parcelUuid2 = null;
        ParcelUuid parcelUuid3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 4:
                        parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel, readHeader, ParcelUuid.CREATOR);
                        continue;
                    case 5:
                        parcelUuid2 = (ParcelUuid) SafeParcelReader.createParcelable(parcel, readHeader, ParcelUuid.CREATOR);
                        continue;
                    case 6:
                        parcelUuid3 = (ParcelUuid) SafeParcelReader.createParcelable(parcel, readHeader, ParcelUuid.CREATOR);
                        continue;
                    case 7:
                        bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                        continue;
                    case 8:
                        bArr2 = SafeParcelReader.createByteArray(parcel, readHeader);
                        continue;
                    case 9:
                        i2 = SafeParcelReader.readInt(parcel, readHeader);
                        continue;
                    case 10:
                        bArr3 = SafeParcelReader.createByteArray(parcel, readHeader);
                        continue;
                    case 11:
                        bArr4 = SafeParcelReader.createByteArray(parcel, readHeader);
                        continue;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                        continue;
                }
            } else {
                i = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzhg(i, parcelUuid, parcelUuid2, parcelUuid3, bArr, bArr2, i2, bArr3, bArr4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzhg[] newArray(int i) {
        return new zzhg[i];
    }
}
