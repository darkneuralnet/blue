package p000;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;
/* renamed from: nd9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45796nd9 implements Parcelable.Creator<DiscoveryOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DiscoveryOptions createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Strategy strategy = null;
        ParcelUuid parcelUuid = null;
        byte[] bArr = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
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
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 4:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel, readHeader, ParcelUuid.CREATOR);
                    break;
                case 7:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 8:
                    z6 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 12:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 13:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 14:
                    bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 15:
                    j = SafeParcelReader.readLong(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new DiscoveryOptions(strategy, z, z4, z5, z2, parcelUuid, z6, z7, z8, z3, i, i2, bArr, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DiscoveryOptions[] newArray(int i) {
        return new DiscoveryOptions[i];
    }
}
