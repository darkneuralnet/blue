package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: EP7 */
/* loaded from: classes5.dex */
public final class EP7 {

    /* renamed from: a */
    public static final ClassLoader f7421a = EP7.class.getClassLoader();

    private EP7() {
    }

    /* renamed from: a */
    public static Parcelable m109033a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m109032b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
