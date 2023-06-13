package p000;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.zzv;
/* renamed from: gC7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41397gC7 implements Parcelable.Creator<AdvertisingOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdvertisingOptions createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Strategy strategy = null;
        byte[] bArr = null;
        ParcelUuid parcelUuid = null;
        byte[] bArr2 = null;
        zzv[] zzvVarArr = null;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i = 0;
        int i2 = 0;
        boolean z13 = false;
        boolean z14 = false;
        long j = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel, readHeader, Strategy.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 3:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 4:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 7:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel, readHeader, ParcelUuid.CREATOR);
                    break;
                case 9:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z6 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 12:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 13:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 14:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 15:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 16:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 17:
                    bArr2 = SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 18:
                    j = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 19:
                    zzvVarArr = (zzv[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzv.CREATOR);
                    break;
                case 20:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 21:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 22:
                    z14 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new AdvertisingOptions(strategy, z, z2, z3, z4, bArr, z9, parcelUuid, z5, z6, z7, z10, z11, z12, i, i2, bArr2, j, zzvVarArr, z13, z8, z14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdvertisingOptions[] newArray(int i) {
        return new AdvertisingOptions[i];
    }
}
