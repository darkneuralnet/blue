package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: fP7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40921fP7 {
    private C40921fP7() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m41418a(Bundle bundle, String str) {
        ClassLoader m41415d = m41415d();
        bundle.setClassLoader(m41415d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(m41415d);
        return (T) bundle2.getParcelable(str);
    }

    /* renamed from: b */
    public static void m41417b(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable m41418a = m41418a(bundle, "MapOptions");
            if (m41418a != null) {
                m41416c(bundle2, "MapOptions", m41418a);
            }
            Parcelable m41418a2 = m41418a(bundle, "StreetViewPanoramaOptions");
            if (m41418a2 != null) {
                m41416c(bundle2, "StreetViewPanoramaOptions", m41418a2);
            }
            Parcelable m41418a3 = m41418a(bundle, "camera");
            if (m41418a3 != null) {
                m41416c(bundle2, "camera", m41418a3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    /* renamed from: c */
    public static void m41416c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader m41415d = m41415d();
        bundle.setClassLoader(m41415d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(m41415d);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    /* renamed from: d */
    public static ClassLoader m41415d() {
        return (ClassLoader) Preconditions.checkNotNull(C40921fP7.class.getClassLoader());
    }
}
