package p000;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import com.google.android.gms.location.places.Place;
/* renamed from: Dw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32520Dw7 {
    /* renamed from: a */
    public static /* synthetic */ void m109598a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzaqw {
        if (!m109594e(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !m109594e(b3) && !m109594e(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & Place.TYPE_SUBLOCALITY_LEVEL_1) + GeneratorBase.SURR2_FIRST);
            return;
        }
        throw zzaqw.m51284d();
    }

    /* renamed from: b */
    public static /* synthetic */ void m109597b(byte b, byte b2, char[] cArr, int i) throws zzaqw {
        if (b >= -62 && !m109594e(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw zzaqw.m51284d();
    }

    /* renamed from: c */
    public static /* synthetic */ void m109596c(byte b, byte b2, byte b3, char[] cArr, int i) throws zzaqw {
        if (!m109594e(b2)) {
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
            if (!m109594e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzaqw.m51284d();
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m109595d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    public static boolean m109594e(byte b) {
        return b > -65;
    }
}
