package p000;

import android.text.TextPaint;
import com.facebook.share.internal.C17296a;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, m28432d2 = {"Landroid/text/TextPaint;", "", "alpha", "", C17296a.f69688o, "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Rd */
/* loaded from: classes.dex */
public final class C7218Rd {
    /* renamed from: a */
    public static final void m86539a(TextPaint textPaint, float f) {
        float coerceIn;
        int roundToInt;
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        if (!Float.isNaN(f)) {
            coerceIn = RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f);
            roundToInt = MathKt__MathJVMKt.roundToInt(coerceIn * ((float) KotlinVersion.MAX_COMPONENT_VALUE));
            textPaint.setAlpha(roundToInt);
        }
    }
}
