package okhttp3.logging;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, m28432d2 = {"Li30;", "", "isProbablyUtf8", "okhttp-logging-interceptor"}, m28431k = 2, m28430mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(C42488i30 c42488i30) {
        long coerceAtMost;
        Intrinsics.checkNotNullParameter(c42488i30, "<this>");
        try {
            C42488i30 c42488i302 = new C42488i30();
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(c42488i30.size(), 64L);
            c42488i30.m34553l(c42488i302, 0L, coerceAtMost);
            int i = 0;
            while (i < 16) {
                i++;
                if (!c42488i302.mo21945O2()) {
                    int m34572I = c42488i302.m34572I();
                    if (Character.isISOControl(m34572I) && !Character.isWhitespace(m34572I)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
