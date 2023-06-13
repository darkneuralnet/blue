package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import p000.C42488i30;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0013*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\" \u0010\u001b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LTq5;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "c", "Li30;", "", "newline", "", DateTokenConverter.CONVERTER_KEY, "Lry3;", "options", "selectTruncated", "e", "Li30$a;", "unsafeCursor", C17296a.f69688o, "[B", "b", "()[B", "getHEX_DIGIT_BYTES$annotations", "()V", "HEX_DIGIT_BYTES", "okio"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: BJ6 */
/* loaded from: classes8.dex */
public final class BJ6 {

    /* renamed from: a */
    public static final byte[] f2199a = DJ6.m110576a("0123456789abcdef");

    /* renamed from: a */
    public static final C42488i30.C23107a m114106a(C42488i30 c42488i30, C42488i30.C23107a unsafeCursor) {
        boolean z;
        Intrinsics.checkNotNullParameter(c42488i30, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        C42488i30.C23107a m107315g = FJ6.m107315g(unsafeCursor);
        if (m107315g.f86659b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m107315g.f86659b = c42488i30;
            m107315g.f86660c = true;
            return m107315g;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    /* renamed from: b */
    public static final byte[] m114105b() {
        return f2199a;
    }

    /* renamed from: c */
    public static final boolean m114104c(C36208Tq5 segment, int i, byte[] bytes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i4 = segment.f36328c;
        byte[] bArr = segment.f36326a;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.f36331f;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.f36326a;
                bArr = bArr2;
                i = segment.f36327b;
                i4 = segment.f36328c;
            }
            if (bArr[i] != bytes[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: d */
    public static final String m114103d(C42488i30 c42488i30, long j) {
        Intrinsics.checkNotNullParameter(c42488i30, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (c42488i30.m34547p(j2) == ((byte) 13)) {
                String m34573G = c42488i30.m34573G(j2);
                c42488i30.skip(2L);
                return m34573G;
            }
        }
        String m34573G2 = c42488i30.m34573G(j);
        c42488i30.skip(1L);
        return m34573G2;
    }

    /* renamed from: e */
    public static final int m114102e(C42488i30 c42488i30, C48371ry3 options, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        C36208Tq5 c36208Tq5;
        Intrinsics.checkNotNullParameter(c42488i30, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        C36208Tq5 c36208Tq52 = c42488i30.f86657b;
        if (c36208Tq52 == null) {
            if (z) {
                return -2;
            }
            return -1;
        }
        byte[] bArr = c36208Tq52.f36326a;
        int i5 = c36208Tq52.f36327b;
        int i6 = c36208Tq52.f36328c;
        int[] m14971e = options.m14971e();
        C36208Tq5 c36208Tq53 = c36208Tq52;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = m14971e[i8];
            int i11 = i9 + 1;
            int i12 = m14971e[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (c36208Tq53 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = i11 + (i10 * (-1));
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr[i5] & UByte.MAX_VALUE) != m14971e[i11]) {
                        return i7;
                    }
                    if (i15 == i13) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i14 == i6) {
                        Intrinsics.checkNotNull(c36208Tq53);
                        C36208Tq5 c36208Tq54 = c36208Tq53.f36331f;
                        Intrinsics.checkNotNull(c36208Tq54);
                        i4 = c36208Tq54.f36327b;
                        byte[] bArr2 = c36208Tq54.f36326a;
                        i3 = c36208Tq54.f36328c;
                        if (c36208Tq54 == c36208Tq52) {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr2;
                            c36208Tq5 = null;
                        } else {
                            c36208Tq5 = c36208Tq54;
                            bArr = bArr2;
                        }
                    } else {
                        C36208Tq5 c36208Tq55 = c36208Tq53;
                        i3 = i6;
                        i4 = i14;
                        c36208Tq5 = c36208Tq55;
                    }
                    if (z2) {
                        i2 = m14971e[i15];
                        i = i4;
                        i6 = i3;
                        c36208Tq53 = c36208Tq5;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    i11 = i15;
                    c36208Tq53 = c36208Tq5;
                }
            } else {
                i = i5 + 1;
                int i16 = bArr[i5] & UByte.MAX_VALUE;
                int i17 = i11 + i10;
                while (i11 != i17) {
                    if (i16 == m14971e[i11]) {
                        i2 = m14971e[i11 + i10];
                        if (i == i6) {
                            c36208Tq53 = c36208Tq53.f36331f;
                            Intrinsics.checkNotNull(c36208Tq53);
                            i = c36208Tq53.f36327b;
                            bArr = c36208Tq53.f36326a;
                            i6 = c36208Tq53.f36328c;
                            if (c36208Tq53 == c36208Tq52) {
                                c36208Tq53 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            if (i2 >= 0) {
                return i2;
            }
            i8 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    /* renamed from: f */
    public static /* synthetic */ int m114101f(C42488i30 c42488i30, C48371ry3 c48371ry3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m114102e(c42488i30, c48371ry3, z);
    }
}
