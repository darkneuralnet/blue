package p000;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaz;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
/* renamed from: OD7 */
/* loaded from: classes5.dex */
public final class OD7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzat zzatVar = null;
        zzaw zzawVar = null;
        zzax zzaxVar = null;
        zzaz zzazVar = null;
        zzay zzayVar = null;
        zzau zzauVar = null;
        zzaq zzaqVar = null;
        zzar zzarVar = null;
        zzas zzasVar = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 5:
                    pointArr = (Point[]) SafeParcelReader.createTypedArray(parcel, readHeader, Point.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    zzatVar = (zzat) SafeParcelReader.createParcelable(parcel, readHeader, zzat.CREATOR);
                    break;
                case 8:
                    zzawVar = (zzaw) SafeParcelReader.createParcelable(parcel, readHeader, zzaw.CREATOR);
                    break;
                case 9:
                    zzaxVar = (zzax) SafeParcelReader.createParcelable(parcel, readHeader, zzax.CREATOR);
                    break;
                case 10:
                    zzazVar = (zzaz) SafeParcelReader.createParcelable(parcel, readHeader, zzaz.CREATOR);
                    break;
                case 11:
                    zzayVar = (zzay) SafeParcelReader.createParcelable(parcel, readHeader, zzay.CREATOR);
                    break;
                case 12:
                    zzauVar = (zzau) SafeParcelReader.createParcelable(parcel, readHeader, zzau.CREATOR);
                    break;
                case 13:
                    zzaqVar = (zzaq) SafeParcelReader.createParcelable(parcel, readHeader, zzaq.CREATOR);
                    break;
                case 14:
                    zzarVar = (zzar) SafeParcelReader.createParcelable(parcel, readHeader, zzar.CREATOR);
                    break;
                case 15:
                    zzasVar = (zzas) SafeParcelReader.createParcelable(parcel, readHeader, zzas.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzba(i, str, str2, bArr, pointArr, i2, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzba[i];
    }
}
