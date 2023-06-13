package p000;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.location.places.Place;
/* renamed from: u89  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49662u89 {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m10795a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m10791e(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !m10791e(b3) && !m10791e(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & Place.TYPE_SUBLOCALITY_LEVEL_1) + GeneratorBase.SURR2_FIRST);
            return;
        }
        throw zzll.m51342c();
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m10794b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m10791e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m10791e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzll.m51342c();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m10793c(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !m10791e(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw zzll.m51342c();
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m10792d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    public static boolean m10791e(byte b) {
        return b > -65;
    }
}
