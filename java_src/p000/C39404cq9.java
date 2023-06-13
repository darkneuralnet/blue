package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsa;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsi;
/* renamed from: cq9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39404cq9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzsh zzshVar = null;
        String str = null;
        String str2 = null;
        zzsi[] zzsiVarArr = null;
        zzsf[] zzsfVarArr = null;
        String[] strArr = null;
        zzsa[] zzsaVarArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzshVar = (zzsh) SafeParcelReader.createParcelable(parcel, readHeader, zzsh.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    zzsiVarArr = (zzsi[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzsi.CREATOR);
                    break;
                case 5:
                    zzsfVarArr = (zzsf[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzsf.CREATOR);
                    break;
                case 6:
                    strArr = SafeParcelReader.createStringArray(parcel, readHeader);
                    break;
                case 7:
                    zzsaVarArr = (zzsa[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzsa.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzsd(zzshVar, str, str2, zzsiVarArr, zzsfVarArr, strArr, zzsaVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsd[i];
    }
}