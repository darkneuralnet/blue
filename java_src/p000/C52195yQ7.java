package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: yQ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52195yQ7 {

    /* renamed from: a */
    public static final ClassLoader f119539a = C52195yQ7.class.getClassLoader();

    private C52195yQ7() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m3510a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m3509b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: c */
    public static boolean m3508c(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
