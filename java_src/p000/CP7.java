package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: CP7 */
/* loaded from: classes5.dex */
public final class CP7 {

    /* renamed from: a */
    public static final ClassLoader f4046a = CP7.class.getClassLoader();

    private CP7() {
    }

    /* renamed from: a */
    public static void m112246a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: b */
    public static void m112245b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
