package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: wP7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51000wP7 {

    /* renamed from: a */
    public static final ClassLoader f115924a = C51000wP7.class.getClassLoader();

    private C51000wP7() {
    }

    /* renamed from: a */
    public static void m6865a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static <T extends Parcelable> T m6864b(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: c */
    public static void m6863c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static void m6862d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
