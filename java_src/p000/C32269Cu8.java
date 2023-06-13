package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzhc;
/* renamed from: Cu8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32269Cu8 implements Parcelable.Creator<zzhc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzhc createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            SafeParcelReader.getFieldId(readHeader);
            SafeParcelReader.skipUnknownField(parcel, readHeader);
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzhc();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzhc[] newArray(int i) {
        return new zzhc[i];
    }
}
