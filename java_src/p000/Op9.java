package p000;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzse;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;
/* renamed from: Op9 */
/* loaded from: classes5.dex */
public final class Op9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzsf zzsfVar = null;
        zzsi zzsiVar = null;
        zzsj zzsjVar = null;
        zzsl zzslVar = null;
        zzsk zzskVar = null;
        zzsg zzsgVar = null;
        zzsc zzscVar = null;
        zzsd zzsdVar = null;
        zzse zzseVar = null;
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
                    zzsfVar = (zzsf) SafeParcelReader.createParcelable(parcel, readHeader, zzsf.CREATOR);
                    break;
                case 8:
                    zzsiVar = (zzsi) SafeParcelReader.createParcelable(parcel, readHeader, zzsi.CREATOR);
                    break;
                case 9:
                    zzsjVar = (zzsj) SafeParcelReader.createParcelable(parcel, readHeader, zzsj.CREATOR);
                    break;
                case 10:
                    zzslVar = (zzsl) SafeParcelReader.createParcelable(parcel, readHeader, zzsl.CREATOR);
                    break;
                case 11:
                    zzskVar = (zzsk) SafeParcelReader.createParcelable(parcel, readHeader, zzsk.CREATOR);
                    break;
                case 12:
                    zzsgVar = (zzsg) SafeParcelReader.createParcelable(parcel, readHeader, zzsg.CREATOR);
                    break;
                case 13:
                    zzscVar = (zzsc) SafeParcelReader.createParcelable(parcel, readHeader, zzsc.CREATOR);
                    break;
                case 14:
                    zzsdVar = (zzsd) SafeParcelReader.createParcelable(parcel, readHeader, zzsd.CREATOR);
                    break;
                case 15:
                    zzseVar = (zzse) SafeParcelReader.createParcelable(parcel, readHeader, zzse.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzsm(i, str, str2, bArr, pointArr, i2, zzsfVar, zzsiVar, zzsjVar, zzslVar, zzskVar, zzsgVar, zzscVar, zzsdVar, zzseVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsm[i];
    }
}
