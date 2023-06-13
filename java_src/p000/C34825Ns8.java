package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzgy;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
/* renamed from: Ns8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34825Ns8 implements Parcelable.Creator<zzgy> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzgy createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        DiscoveryOptions discoveryOptions = null;
        IBinder iBinder3 = null;
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
                    j = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 5:
                    discoveryOptions = (DiscoveryOptions) SafeParcelReader.createParcelable(parcel, readHeader, DiscoveryOptions.CREATOR);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzgy(iBinder, iBinder2, str, j, discoveryOptions, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzgy[] newArray(int i) {
        return new zzgy[i];
    }
}
