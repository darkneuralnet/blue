package bo.app;

import com.facebook.share.internal.C17296a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0002"}, m28432d2 = {"Ljava/math/BigDecimal;", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: bo.app.p3 */
/* loaded from: classes.dex */
public final class C13019p3 {
    /* renamed from: a */
    public static final BigDecimal m63151a(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "this.setScale(2, RoundingMode.HALF_UP)");
        return scale;
    }
}
