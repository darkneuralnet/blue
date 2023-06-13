package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.CardRequirements;
import java.util.ArrayList;
/* renamed from: pm8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47071pm8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        boolean z2 = true;
        ArrayList<Integer> arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            i = SafeParcelReader.readInt(parcel, readHeader);
                        }
                    } else {
                        z = SafeParcelReader.readBoolean(parcel, readHeader);
                    }
                } else {
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                }
            } else {
                arrayList = SafeParcelReader.createIntegerList(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new CardRequirements(arrayList, z2, z, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CardRequirements[i];
    }
}
