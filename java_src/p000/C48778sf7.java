package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.CountrySpecification;
/* renamed from: sf7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48778sf7 implements Parcelable.Creator<CountrySpecification> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CountrySpecification createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) != 2) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new CountrySpecification(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CountrySpecification[] newArray(int i) {
        return new CountrySpecification[i];
    }
}
