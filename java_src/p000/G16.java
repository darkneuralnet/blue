package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0007"}, m28432d2 = {"LF16;", "", "maxChars", "LDf;", "c", "b", C17296a.f69688o, "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: G16 */
/* loaded from: classes.dex */
public final class G16 {
    /* renamed from: a */
    public static final C1577Df m105951a(F16 f16) {
        Intrinsics.checkNotNullParameter(f16, "<this>");
        return f16.m108105e().m110047o(f16.m108103g());
    }

    /* renamed from: b */
    public static final C1577Df m105950b(F16 f16, int i) {
        Intrinsics.checkNotNullParameter(f16, "<this>");
        return f16.m108105e().subSequence(C48413s26.m14835k(f16.m108103g()), Math.min(C48413s26.m14835k(f16.m108103g()) + i, f16.m108102h().length()));
    }

    /* renamed from: c */
    public static final C1577Df m105949c(F16 f16, int i) {
        Intrinsics.checkNotNullParameter(f16, "<this>");
        return f16.m108105e().subSequence(Math.max(0, C48413s26.m14834l(f16.m108103g()) - i), C48413s26.m14834l(f16.m108103g()));
    }
}
