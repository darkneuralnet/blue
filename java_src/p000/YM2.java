package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0000¨\u0006\u0007"}, m28432d2 = {"", "start", "stop", "fraction", C17296a.f69688o, "", "b", "ui-util_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: YM2 */
/* loaded from: classes.dex */
public final class YM2 {
    /* renamed from: a */
    public static final float m75146a(float f, float f2, float f3) {
        return ((1 - f3) * f) + (f3 * f2);
    }

    /* renamed from: b */
    public static final int m75145b(int i, int i2, float f) {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt((i2 - i) * f);
        return i + roundToInt;
    }
}
