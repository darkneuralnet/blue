package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a:\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\n\u001a!\u0010\u000f\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a-\u0010\u0015\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m28432d2 = {"", "minWidth", "maxWidth", "minHeight", "maxHeight", "Lkz0;", C17296a.f69688o, "(IIII)J", "otherConstraints", "e", "(JJ)J", "LG52;", "size", DateTokenConverter.CONVERTER_KEY, "width", "g", "(JI)I", "height", "f", "horizontal", "vertical", "h", "(JII)J", "max", "value", "c", "ui-unit_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: nz0 */
/* loaded from: classes.dex */
public final class C46007nz0 {
    /* renamed from: a */
    public static final long m22043a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i4 >= i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i < 0 || i3 < 0) {
                    z3 = false;
                }
                if (z3) {
                    return C44228kz0.f95301b.m28056b(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ long m22042b(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m22043a(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static final int m22041c(int i, int i2) {
        int coerceAtLeast;
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i + i2, 0);
        return coerceAtLeast;
    }

    /* renamed from: d */
    public static final long m22040d(long j, long j2) {
        int coerceIn;
        int coerceIn2;
        coerceIn = RangesKt___RangesKt.coerceIn(G52.m105829g(j2), C44228kz0.m28061p(j), C44228kz0.m28063n(j));
        coerceIn2 = RangesKt___RangesKt.coerceIn(G52.m105830f(j2), C44228kz0.m28062o(j), C44228kz0.m28064m(j));
        return H52.m104430a(coerceIn, coerceIn2);
    }

    /* renamed from: e */
    public static final long m22039e(long j, long j2) {
        int coerceIn;
        int coerceIn2;
        int coerceIn3;
        int coerceIn4;
        coerceIn = RangesKt___RangesKt.coerceIn(C44228kz0.m28061p(j2), C44228kz0.m28061p(j), C44228kz0.m28063n(j));
        coerceIn2 = RangesKt___RangesKt.coerceIn(C44228kz0.m28063n(j2), C44228kz0.m28061p(j), C44228kz0.m28063n(j));
        coerceIn3 = RangesKt___RangesKt.coerceIn(C44228kz0.m28062o(j2), C44228kz0.m28062o(j), C44228kz0.m28064m(j));
        coerceIn4 = RangesKt___RangesKt.coerceIn(C44228kz0.m28064m(j2), C44228kz0.m28062o(j), C44228kz0.m28064m(j));
        return m22043a(coerceIn, coerceIn2, coerceIn3, coerceIn4);
    }

    /* renamed from: f */
    public static final int m22038f(long j, int i) {
        int coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(i, C44228kz0.m28062o(j), C44228kz0.m28064m(j));
        return coerceIn;
    }

    /* renamed from: g */
    public static final int m22037g(long j, int i) {
        int coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(i, C44228kz0.m28061p(j), C44228kz0.m28063n(j));
        return coerceIn;
    }

    /* renamed from: h */
    public static final long m22036h(long j, int i, int i2) {
        int coerceAtLeast;
        int coerceAtLeast2;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(C44228kz0.m28061p(j) + i, 0);
        int m22041c = m22041c(C44228kz0.m28063n(j), i);
        coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(C44228kz0.m28062o(j) + i2, 0);
        return m22043a(coerceAtLeast, m22041c, coerceAtLeast2, m22041c(C44228kz0.m28064m(j), i2));
    }

    /* renamed from: i */
    public static /* synthetic */ long m22035i(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m22036h(j, i, i2);
    }
}
