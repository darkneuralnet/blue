package p000;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.google.android.gms.internal.places.zzbk;
import com.google.android.gms.location.places.Place;
/* renamed from: J58 */
/* loaded from: classes5.dex */
public final class J58 {
    /* renamed from: a */
    public static void m101164a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzbk {
        if (!m101153l(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !m101153l(b3) && !m101153l(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & Place.TYPE_SUBLOCALITY_LEVEL_1) + GeneratorBase.SURR2_FIRST);
            return;
        }
        throw zzbk.m51033f();
    }

    /* renamed from: b */
    public static void m101163b(byte b, byte b2, byte b3, char[] cArr, int i) throws zzbk {
        if (!m101153l(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !m101153l(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw zzbk.m51033f();
    }

    /* renamed from: c */
    public static void m101162c(byte b, byte b2, char[] cArr, int i) throws zzbk {
        if (b >= -62 && !m101153l(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw zzbk.m51033f();
    }

    /* renamed from: d */
    public static void m101161d(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* renamed from: i */
    public static boolean m101156i(byte b) {
        return b >= 0;
    }

    /* renamed from: j */
    public static boolean m101155j(byte b) {
        return b < -32;
    }

    /* renamed from: k */
    public static boolean m101154k(byte b) {
        return b < -16;
    }

    /* renamed from: l */
    public static boolean m101153l(byte b) {
        return b > -65;
    }
}
