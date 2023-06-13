package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzgd;
import com.google.android.gms.internal.nearby.zzgq;
/* renamed from: Rq8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35743Rq8 implements Parcelable.Creator<zzgq> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzgq createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        IBinder iBinder = null;
        zzgd zzgdVar = null;
        boolean z = false;
        String[] strArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            z = SafeParcelReader.readBoolean(parcel, readHeader);
                        }
                    } else {
                        zzgdVar = (zzgd) SafeParcelReader.createParcelable(parcel, readHeader, zzgd.CREATOR);
                    }
                } else {
                    strArr = SafeParcelReader.createStringArray(parcel, readHeader);
                }
            } else {
                iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzgq(iBinder, strArr, zzgdVar, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzgq[] newArray(int i) {
        return new zzgq[i];
    }
}
