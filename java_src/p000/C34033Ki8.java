package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzfm;
import com.google.android.gms.internal.nearby.zzgd;
/* renamed from: Ki8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34033Ki8 implements Parcelable.Creator<zzfm> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzfm createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        boolean z = false;
        zzgd zzgdVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    } else {
                        z = SafeParcelReader.readBoolean(parcel, readHeader);
                    }
                } else {
                    zzgdVar = (zzgd) SafeParcelReader.createParcelable(parcel, readHeader, zzgd.CREATOR);
                }
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzfm(str, zzgdVar, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzfm[] newArray(int i) {
        return new zzfm[i];
    }
}
