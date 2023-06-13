package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: xQ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51602xQ7 {

    /* renamed from: a */
    public static final ClassLoader f117598a = C51602xQ7.class.getClassLoader();

    private C51602xQ7() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m5273a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m5272b(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: c */
    public static void m5271c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static void m5270d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: e */
    public static boolean m5269e(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
