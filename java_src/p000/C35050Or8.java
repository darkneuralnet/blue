package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzgu;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
/* renamed from: Or8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35050Or8 implements Parcelable.Creator<zzgu> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzgu createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        String str2 = null;
        AdvertisingOptions advertisingOptions = null;
        IBinder iBinder3 = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 2:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    j = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    advertisingOptions = (AdvertisingOptions) SafeParcelReader.createParcelable(parcel, readHeader, AdvertisingOptions.CREATOR);
                    break;
                case 7:
                    iBinder3 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 8:
                    bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzgu(iBinder, iBinder2, str, str2, j, advertisingOptions, iBinder3, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzgu[] newArray(int i) {
        return new zzgu[i];
    }
}
