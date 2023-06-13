package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C42488i30;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\bH\u0000\u001a0\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0000\u001a\f\u0010\u0012\u001a\u00020\u0010*\u00020\bH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u001a\u0014\u0010\u0018\u001a\u00020\b*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0000\u001a\u0014\u0010\u001a\u001a\u00020\b*\u00020\n2\u0006\u0010\u0019\u001a\u00020\bH\u0000\" \u0010 \u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"\u001a\u0010$\u001a\u00020\b8\u0000X\u0080D¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m28432d2 = {"", "size", "offset", "byteCount", "", "b", "", "i", "", "h", "", C17296a.f69688o, "aOffset", "bOffset", "", "", "", "j", "k", "Li30$a;", "unsafeCursor", "g", "LM70;", "position", "e", "sizeParam", "f", "Li30$a;", DateTokenConverter.CONVERTER_KEY, "()Li30$a;", "getDEFAULT__new_UnsafeCursor$annotations", "()V", "DEFAULT__new_UnsafeCursor", "I", "c", "()I", "DEFAULT__ByteString_size", "okio"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: FJ6 */
/* loaded from: classes8.dex */
public final class FJ6 {

    /* renamed from: a */
    public static final C42488i30.C23107a f9185a = new C42488i30.C23107a();

    /* renamed from: b */
    public static final int f9186b = -1234567890;

    /* renamed from: a */
    public static final boolean m107321a(byte[] a, int i, byte[] b, int i2, int i3) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (a[i4 + i] != b[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m107320b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: c */
    public static final int m107319c() {
        return f9186b;
    }

    /* renamed from: d */
    public static final C42488i30.C23107a m107318d() {
        return f9185a;
    }

    /* renamed from: e */
    public static final int m107317e(M70 m70, int i) {
        Intrinsics.checkNotNullParameter(m70, "<this>");
        if (i == f9186b) {
            return m70.size();
        }
        return i;
    }

    /* renamed from: f */
    public static final int m107316f(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i == f9186b) {
            return bArr.length;
        }
        return i;
    }

    /* renamed from: g */
    public static final C42488i30.C23107a m107315g(C42488i30.C23107a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (unsafeCursor == f9185a) {
            return new C42488i30.C23107a();
        }
        return unsafeCursor;
    }

    /* renamed from: h */
    public static final int m107314h(int i) {
        return ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: i */
    public static final short m107313i(short s) {
        int i = s & UShort.MAX_VALUE;
        return (short) (((i & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: j */
    public static final String m107312j(byte b) {
        String concatToString;
        concatToString = StringsKt__StringsJVMKt.concatToString(new char[]{CJ6.m112345f()[(b >> 4) & 15], CJ6.m112345f()[b & 15]});
        return concatToString;
    }

    /* renamed from: k */
    public static final String m107311k(int i) {
        String concatToString;
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {CJ6.m112345f()[(i >> 28) & 15], CJ6.m112345f()[(i >> 24) & 15], CJ6.m112345f()[(i >> 20) & 15], CJ6.m112345f()[(i >> 16) & 15], CJ6.m112345f()[(i >> 12) & 15], CJ6.m112345f()[(i >> 8) & 15], CJ6.m112345f()[(i >> 4) & 15], CJ6.m112345f()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        concatToString = StringsKt__StringsJVMKt.concatToString(cArr, i2, 8);
        return concatToString;
    }
}
