package p000;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: AP7 */
/* loaded from: classes5.dex */
public final class AP7 {

    /* renamed from: a */
    public static final ClassLoader f497a = AP7.class.getClassLoader();

    private AP7() {
    }

    /* renamed from: a */
    public static Parcelable m115816a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m115815b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }
}
