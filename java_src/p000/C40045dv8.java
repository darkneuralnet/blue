package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzhe;
/* renamed from: dv8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40045dv8 implements Parcelable.Creator<zzhe> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzhe createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            SafeParcelReader.getFieldId(readHeader);
            SafeParcelReader.skipUnknownField(parcel, readHeader);
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzhe();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzhe[] newArray(int i) {
        return new zzhe[i];
    }
}
