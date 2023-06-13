package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: KP7 */
/* loaded from: classes6.dex */
public final class KP7 {

    /* renamed from: a */
    public static final ClassLoader f19539a = KP7.class.getClassLoader();

    private KP7() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m98912a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m98911b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m98910c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }
}
