package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbog;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok;
import java.util.ArrayList;
/* renamed from: T77 */
/* loaded from: classes5.dex */
public final class T77 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        Rect rect = null;
        ArrayList arrayList = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, zbok.CREATOR);
                            }
                        } else {
                            str2 = SafeParcelReader.createString(parcel, readHeader);
                        }
                    } else {
                        arrayList = SafeParcelReader.createTypedList(parcel, readHeader, Point.CREATOR);
                    }
                } else {
                    rect = (Rect) SafeParcelReader.createParcelable(parcel, readHeader, Rect.CREATOR);
                }
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zbog(str, rect, arrayList, str2, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zbog[i];
    }
}