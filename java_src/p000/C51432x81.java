package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
/* renamed from: x81  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51432x81 implements Parcelable.Creator<DynamicLinkData> {
    /* renamed from: c */
    public static void m5820c(DynamicLinkData dynamicLinkData, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, dynamicLinkData.m47300v(), false);
        SafeParcelWriter.writeString(parcel, 2, dynamicLinkData.m47301u(), false);
        SafeParcelWriter.writeInt(parcel, 3, dynamicLinkData.m47305F());
        SafeParcelWriter.writeLong(parcel, 4, dynamicLinkData.m47302s());
        SafeParcelWriter.writeBundle(parcel, 5, dynamicLinkData.m47306E(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, dynamicLinkData.m47304K(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DynamicLinkData createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    j = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 5:
                    bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel, readHeader, Uri.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new DynamicLinkData(str, str2, i, j, bundle, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public DynamicLinkData[] newArray(int i) {
        return new DynamicLinkData[i];
    }
}
