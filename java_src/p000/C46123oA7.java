package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.auth.zzax;
/* renamed from: oA7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46123oA7 implements Parcelable.Creator<zzax> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzax createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                } else {
                    str = SafeParcelReader.createString(parcel, readHeader);
                }
            } else {
                i = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzax(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzax[] newArray(int i) {
        return new zzax[i];
    }
}