package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzfi;
/* renamed from: Fh8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32854Fh8 implements Parcelable.Creator<zzfi> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzfi createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        BluetoothDevice bluetoothDevice = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                            }
                        } else {
                            bluetoothDevice = (BluetoothDevice) SafeParcelReader.createParcelable(parcel, readHeader, BluetoothDevice.CREATOR);
                        }
                    } else {
                        str3 = SafeParcelReader.createString(parcel, readHeader);
                    }
                } else {
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                }
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzfi(str, str2, str3, bluetoothDevice, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzfi[] newArray(int i) {
        return new zzfi[i];
    }
}
