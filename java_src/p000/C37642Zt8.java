package p000;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.google.android.gms.internal.auth.zzew;
import com.google.android.gms.location.places.Place;
/* renamed from: Zt8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37642Zt8 {
    /* renamed from: a */
    public static /* synthetic */ void m72340a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzew {
        if (!m72336e(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !m72336e(b3) && !m72336e(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & Place.TYPE_SUBLOCALITY_LEVEL_1) + GeneratorBase.SURR2_FIRST);
            return;
        }
        throw zzew.m51578b();
    }

    /* renamed from: b */
    public static /* synthetic */ void m72339b(byte b, byte b2, char[] cArr, int i) throws zzew {
        if (b >= -62 && !m72336e(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw zzew.m51578b();
    }

    /* renamed from: c */
    public static /* synthetic */ void m72338c(byte b, byte b2, byte b3, char[] cArr, int i) throws zzew {
        if (!m72336e(b2)) {
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
            if (!m72336e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzew.m51578b();
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m72337d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    public static boolean m72336e(byte b) {
        return b > -65;
    }
}
