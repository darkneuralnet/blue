package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.internal.zzae;
/* renamed from: lk7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44678lk7 implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        Message message = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 1000) {
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                } else {
                    i = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                message = (Message) SafeParcelReader.createParcelable(parcel, readHeader, Message.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzae(i, message);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzae[] newArray(int i) {
        return new zzae[i];
    }
}
