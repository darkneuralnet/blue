package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzhj;
import com.google.android.gms.nearby.messages.Message;
/* renamed from: Le7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34230Le7 implements Parcelable.Creator<Message> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Message createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        zzhj[] zzhjVarArr = null;
        long j = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                if (fieldId != 1000) {
                                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                                } else {
                                    i = SafeParcelReader.readInt(parcel, readHeader);
                                }
                            } else {
                                j = SafeParcelReader.readLong(parcel, readHeader);
                            }
                        } else {
                            zzhjVarArr = (zzhj[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzhj.CREATOR);
                        }
                    } else {
                        str = SafeParcelReader.createString(parcel, readHeader);
                    }
                } else {
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                }
            } else {
                bArr = SafeParcelReader.createByteArray(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new Message(i, bArr, str, str2, zzhjVarArr, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Message[] newArray(int i) {
        return new Message[i];
    }
}
