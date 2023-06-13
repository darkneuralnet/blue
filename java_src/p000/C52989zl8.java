package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.nearby.zzfz;
/* renamed from: zl8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52989zl8 extends C35005Om8 {
    @Override // p000.C35005Om8
    /* renamed from: a */
    public final zzfz mo451a(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        zzfz createFromParcel = super.createFromParcel(parcel);
        parcelFileDescriptor = createFromParcel.f71078c;
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor2 = createFromParcel.f71078c;
            createFromParcel.f71077b = zzfz.m51235s(parcelFileDescriptor2);
        }
        return createFromParcel;
    }

    @Override // p000.C35005Om8, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzfz createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }
}
