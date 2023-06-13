package p000;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.location.places.Place;
/* renamed from: kw8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44206kw8 {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m28114a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m28110e(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !m28110e(b3) && !m28110e(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & Place.TYPE_SUBLOCALITY_LEVEL_1) + GeneratorBase.SURR2_FIRST);
            return;
        }
        throw zzeo.m51319c();
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m28113b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m28110e(b2)) {
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
            if (!m28110e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzeo.m51319c();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m28112c(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !m28110e(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw zzeo.m51319c();
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m28111d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    public static boolean m28110e(byte b) {
        return b > -65;
    }
}
