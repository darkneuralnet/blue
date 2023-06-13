package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: HP7 */
/* loaded from: classes5.dex */
public final class HP7 {

    /* renamed from: a */
    public static final ClassLoader f13362a = HP7.class.getClassLoader();

    private HP7() {
    }

    /* renamed from: a */
    public static void m103904a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: b */
    public static void m103903b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
