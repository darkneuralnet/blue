package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: zQ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C52788zQ7 {

    /* renamed from: a */
    public static final ClassLoader f121352a = C52788zQ7.class.getClassLoader();

    private C52788zQ7() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m1385a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m1384b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m1383c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
