package p000;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.location.places.Place;
/* renamed from: N09 */
/* loaded from: classes6.dex */
public final class N09 {
    /* renamed from: f */
    public static void m94468f(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzjk {
        if (!m94459o(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !m94459o(b3) && !m94459o(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & Place.TYPE_SUBLOCALITY_LEVEL_1) + GeneratorBase.SURR2_FIRST);
            return;
        }
        throw zzjk.m50757h();
    }

    /* renamed from: g */
    public static void m94467g(byte b, byte b2, byte b3, char[] cArr, int i) throws zzjk {
        if (!m94459o(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !m94459o(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw zzjk.m50757h();
    }

    /* renamed from: h */
    public static void m94466h(byte b, byte b2, char[] cArr, int i) throws zzjk {
        if (b >= -62 && !m94459o(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw zzjk.m50757h();
    }

    /* renamed from: i */
    public static void m94465i(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* renamed from: l */
    public static boolean m94462l(byte b) {
        return b >= 0;
    }

    /* renamed from: m */
    public static boolean m94461m(byte b) {
        return b < -32;
    }

    /* renamed from: n */
    public static boolean m94460n(byte b) {
        return b < -16;
    }

    /* renamed from: o */
    public static boolean m94459o(byte b) {
        return b > -65;
    }
}
