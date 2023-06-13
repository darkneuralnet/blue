package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzr;
/* renamed from: Fo9 */
/* loaded from: classes5.dex */
public final class Fo9 implements Parcelable.Creator<zzr> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzr createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        byte[] bArr = null;
        IBinder iBinder3 = null;
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
                                iBinder3 = SafeParcelReader.readIBinder(parcel, readHeader);
                            }
                        } else {
                            bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                        }
                    } else {
                        str = SafeParcelReader.createString(parcel, readHeader);
                    }
                } else {
                    iBinder2 = SafeParcelReader.readIBinder(parcel, readHeader);
                }
            } else {
                iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzr(iBinder, iBinder2, str, bArr, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzr[] newArray(int i) {
        return new zzr[i];
    }
}
