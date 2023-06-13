package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u001d\u0010\u0004\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0007¢\u0006\u0004\b\u0004\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J-\u0010\u0015\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0007¨\u0006\u001e"}, m28432d2 = {"Lhi3;", "", "LUE2;", "x", "b", "", C17296a.f69688o, "w", "h", "i", "", "startDim", "f", "", "tensors", "([LUE2;)LUE2;", "j", DateTokenConverter.CONVERTER_KEY, "", "texts", "seqLength", "e", "([Ljava/lang/String;ILUE2;)LUE2;", "k", "l", "c", "poolSize", "g", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: hi3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42282hi3 {

    /* renamed from: a */
    public static final C42282hi3 f85702a = new C42282hi3();

    private C42282hi3() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m36078a(UE2 x, UE2 b) {
        if (TD0.m84203d(C42282hi3.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            Intrinsics.checkNotNullParameter(b, "b");
            int m81797b = x.m81797b(0);
            int m81797b2 = x.m81797b(1);
            int m81797b3 = x.m81797b(2);
            float[] m81798a = x.m81798a();
            float[] m81798a2 = b.m81798a();
            for (int i = 0; i < m81797b; i++) {
                for (int i2 = 0; i2 < m81797b2; i2++) {
                    for (int i3 = 0; i3 < m81797b3; i3++) {
                        int i4 = (i * m81797b2 * m81797b3) + (i2 * m81797b3) + i3;
                        m81798a[i4] = m81798a[i4] + m81798a2[i3];
                    }
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C42282hi3.class);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final UE2 m36077b(UE2[] tensors) {
        if (TD0.m84203d(C42282hi3.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(tensors, "tensors");
            int m81797b = tensors[0].m81797b(0);
            int i = 0;
            for (UE2 ue2 : tensors) {
                i += ue2.m81797b(1);
            }
            UE2 ue22 = new UE2(new int[]{m81797b, i});
            float[] m81798a = ue22.m81798a();
            for (int i2 = 0; i2 < m81797b; i2++) {
                int i3 = i2 * i;
                int length = tensors.length;
                for (int i4 = 0; i4 < length; i4++) {
                    float[] m81798a2 = tensors[i4].m81798a();
                    int m81797b2 = tensors[i4].m81797b(1);
                    System.arraycopy(m81798a2, i2 * m81797b2, m81798a, i3, m81797b2);
                    i3 += m81797b2;
                }
            }
            return ue22;
        } catch (Throwable th) {
            TD0.m84205b(th, C42282hi3.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final UE2 m36076c(UE2 x, UE2 w) {
        if (TD0.m84203d(C42282hi3.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            Intrinsics.checkNotNullParameter(w, "w");
            int i = 0;
            int m81797b = x.m81797b(0);
            int m81797b2 = x.m81797b(1);
            int m81797b3 = x.m81797b(2);
            int m81797b4 = w.m81797b(0);
            int i2 = (m81797b2 - m81797b4) + 1;
            int m81797b5 = w.m81797b(2);
            UE2 ue2 = new UE2(new int[]{m81797b, i2, m81797b5});
            float[] m81798a = x.m81798a();
            float[] m81798a2 = ue2.m81798a();
            float[] m81798a3 = w.m81798a();
            int i3 = 0;
            while (i3 < m81797b) {
                int i4 = i;
                while (i4 < m81797b5) {
                    int i5 = i;
                    while (i5 < i2) {
                        float f = 0.0f;
                        while (i < m81797b4) {
                            for (int i6 = 0; i6 < m81797b3; i6++) {
                                f += m81798a[(m81797b2 * m81797b3 * i3) + ((i + i5) * m81797b3) + i6] * m81798a3[(((i * m81797b3) + i6) * m81797b5) + i4];
                            }
                            i++;
                        }
                        m81798a2[(i2 * m81797b5 * i3) + (i5 * m81797b5) + i4] = f;
                        i5++;
                        i = 0;
                    }
                    i4++;
                    i = 0;
                }
                i3++;
                i = 0;
            }
            return ue2;
        } catch (Throwable th) {
            TD0.m84205b(th, C42282hi3.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final UE2 m36075d(UE2 x, UE2 w, UE2 b) {
        if (TD0.m84203d(C42282hi3.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            Intrinsics.checkNotNullParameter(w, "w");
            Intrinsics.checkNotNullParameter(b, "b");
            int m81797b = x.m81797b(0);
            int m81797b2 = b.m81797b(0);
            UE2 m36071h = m36071h(x, w);
            float[] m81798a = b.m81798a();
            float[] m81798a2 = m36071h.m81798a();
            for (int i = 0; i < m81797b; i++) {
                for (int i2 = 0; i2 < m81797b2; i2++) {
                    int i3 = (i * m81797b2) + i2;
                    m81798a2[i3] = m81798a2[i3] + m81798a[i2];
                }
            }
            return m36071h;
        } catch (Throwable th) {
            TD0.m84205b(th, C42282hi3.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final UE2 m36074e(String[] texts, int i, UE2 w) {
        if (TD0.m84203d(C42282hi3.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(w, "w");
            int length = texts.length;
            int m81797b = w.m81797b(1);
            UE2 ue2 = new UE2(new int[]{length, i, m81797b});
            float[] m81798a = ue2.m81798a();
            float[] m81798a2 = w.m81798a();
            for (int i2 = 0; i2 < length; i2++) {
                int[] m95003d = C34499Mi6.f23423a.m95003d(texts[i2], i);
                for (int i3 = 0; i3 < i; i3++) {
                    System.arraycopy(m81798a2, m95003d[i3] * m81797b, m81798a, (m81797b * i * i2) + (m81797b * i3), m81797b);
                }
            }
            return ue2;
        } catch (Throwable th) {
            TD0.m84205b(th, C42282hi3.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m36073f(UE2 x, int i) {
        if (TD0.m84203d(C42282hi3.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            if (i >= x.m81796c()) {
                return;
            }
            int m81796c = x.m81796c();
            int i2 = 1;
            for (int i3 = i; i3 < m81796c; i3++) {
                i2 *= x.m81797b(i3);
            }
            int[] iArr = new int[i + 1];
            for (int i4 = 0; i4 < i; i4++) {
                iArr[i4] = x.m81797b(i4);
            }
            iArr[i] = i2;
            x.m81795d(iArr);
        } catch (Throwable th) {
            TD0.m84205b(th, C42282hi3.class);
        }
    }

    @JvmStatic
    /* renamed from: g */
    public static final UE2 m36072g(UE2 x, int i) {
        if (TD0.m84203d(C42282hi3.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            int i2 = 0;
            int m81797b = x.m81797b(0);
            int m81797b2 = x.m81797b(1);
            int m81797b3 = x.m81797b(2);
            int i3 = (m81797b2 - i) + 1;
            UE2 ue2 = new UE2(new int[]{m81797b, i3, m81797b3});
            float[] m81798a = x.m81798a();
            float[] m81798a2 = ue2.m81798a();
            int i4 = 0;
            while (i4 < m81797b) {
                int i5 = i2;
                while (i5 < m81797b3) {
                    int i6 = i2;
                    while (i6 < i3) {
                        int i7 = i6 * m81797b3;
                        int i8 = (i4 * i3 * m81797b3) + i7 + i5;
                        int i9 = (i4 * m81797b2 * m81797b3) + i7 + i5;
                        m81798a2[i8] = Float.MIN_VALUE;
                        for (int i10 = i2; i10 < i; i10++) {
                            m81798a2[i8] = Math.max(m81798a2[i8], m81798a[i9 + (i10 * m81797b3)]);
                        }
                        i6++;
                        i2 = 0;
                    }
                    i5++;
                    i2 = 0;
                }
                i4++;
                i2 = 0;
            }
            return ue2;
        } catch (Throwable th) {
            TD0.m84205b(th, C42282hi3.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: h */
    public static final UE2 m36071h(UE2 x, UE2 w) {
        if (TD0.m84203d(C42282hi3.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            Intrinsics.checkNotNullParameter(w, "w");
            int m81797b = x.m81797b(0);
            int m81797b2 = w.m81797b(0);
            int m81797b3 = w.m81797b(1);
            UE2 ue2 = new UE2(new int[]{m81797b, m81797b3});
            float[] m81798a = x.m81798a();
            float[] m81798a2 = w.m81798a();
            float[] m81798a3 = ue2.m81798a();
            for (int i = 0; i < m81797b; i++) {
                for (int i2 = 0; i2 < m81797b3; i2++) {
                    int i3 = (i * m81797b3) + i2;
                    m81798a3[i3] = 0.0f;
                    for (int i4 = 0; i4 < m81797b2; i4++) {
                        m81798a3[i3] = m81798a3[i3] + (m81798a[(i * m81797b2) + i4] * m81798a2[(i4 * m81797b3) + i2]);
                    }
                }
            }
            return ue2;
        } catch (Throwable th) {
            TD0.m84205b(th, C42282hi3.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m36070i(UE2 x) {
        if (TD0.m84203d(C42282hi3.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            float[] m81798a = x.m81798a();
            int length = m81798a.length;
            for (int i = 0; i < length; i++) {
                if (m81798a[i] < 0) {
                    m81798a[i] = 0.0f;
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C42282hi3.class);
        }
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m36069j(UE2 x) {
        if (TD0.m84203d(C42282hi3.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            int m81797b = x.m81797b(0);
            int m81797b2 = x.m81797b(1);
            float[] m81798a = x.m81798a();
            for (int i = 0; i < m81797b; i++) {
                int i2 = i * m81797b2;
                int i3 = i2 + m81797b2;
                float f = Float.MIN_VALUE;
                for (int i4 = i2; i4 < i3; i4++) {
                    float f2 = m81798a[i4];
                    if (f2 > f) {
                        f = f2;
                    }
                }
                float f3 = 0.0f;
                for (int i5 = i2; i5 < i3; i5++) {
                    float exp = (float) Math.exp(m81798a[i5] - f);
                    m81798a[i5] = exp;
                    f3 += exp;
                }
                while (i2 < i3) {
                    m81798a[i2] = m81798a[i2] / f3;
                    i2++;
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C42282hi3.class);
        }
    }

    @JvmStatic
    /* renamed from: k */
    public static final UE2 m36068k(UE2 x) {
        if (TD0.m84203d(C42282hi3.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            int m81797b = x.m81797b(0);
            int m81797b2 = x.m81797b(1);
            UE2 ue2 = new UE2(new int[]{m81797b2, m81797b});
            float[] m81798a = x.m81798a();
            float[] m81798a2 = ue2.m81798a();
            for (int i = 0; i < m81797b; i++) {
                for (int i2 = 0; i2 < m81797b2; i2++) {
                    m81798a2[(i2 * m81797b) + i] = m81798a[(i * m81797b2) + i2];
                }
            }
            return ue2;
        } catch (Throwable th) {
            TD0.m84205b(th, C42282hi3.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: l */
    public static final UE2 m36067l(UE2 x) {
        if (TD0.m84203d(C42282hi3.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            int m81797b = x.m81797b(0);
            int m81797b2 = x.m81797b(1);
            int m81797b3 = x.m81797b(2);
            UE2 ue2 = new UE2(new int[]{m81797b3, m81797b2, m81797b});
            float[] m81798a = x.m81798a();
            float[] m81798a2 = ue2.m81798a();
            for (int i = 0; i < m81797b; i++) {
                for (int i2 = 0; i2 < m81797b2; i2++) {
                    for (int i3 = 0; i3 < m81797b3; i3++) {
                        m81798a2[(i3 * m81797b * m81797b2) + (i2 * m81797b) + i] = m81798a[(i * m81797b2 * m81797b3) + (i2 * m81797b3) + i3];
                    }
                }
            }
            return ue2;
        } catch (Throwable th) {
            TD0.m84205b(th, C42282hi3.class);
            return null;
        }
    }
}
