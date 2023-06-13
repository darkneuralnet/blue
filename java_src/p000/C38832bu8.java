package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzha;
/* renamed from: bu8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38832bu8 implements Parcelable.Creator<zzha> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzha createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            SafeParcelReader.getFieldId(readHeader);
            SafeParcelReader.skipUnknownField(parcel, readHeader);
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzha();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzha[] newArray(int i) {
        return new zzha[i];
    }
}
