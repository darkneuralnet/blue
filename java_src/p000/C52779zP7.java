package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: zP7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52779zP7 {

    /* renamed from: a */
    public static final ClassLoader f121317a = C52779zP7.class.getClassLoader();

    private C52779zP7() {
    }

    /* renamed from: a */
    public static void m1390a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: b */
    public static void m1389b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
