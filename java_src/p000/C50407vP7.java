package p000;

import android.os.Parcel;
/* renamed from: vP7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C50407vP7 {

    /* renamed from: a */
    public static final ClassLoader f114018a = C50407vP7.class.getClassLoader();

    private C50407vP7() {
    }

    /* renamed from: a */
    public static void m8738a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static boolean m8737b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
