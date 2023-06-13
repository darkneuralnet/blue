package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a2\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a$\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"Li26;", "textLayoutResult", "", "offset", "", "isStart", "areHandlesCrossed", "LCe3;", "b", "(Li26;IZZ)J", "", C17296a.f69688o, "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: D26 */
/* loaded from: classes.dex */
public final class D26 {
    /* renamed from: a */
    public static final float m111021a(C42484i26 c42484i26, int i, boolean z, boolean z2) {
        int max;
        Intrinsics.checkNotNullParameter(c42484i26, "<this>");
        boolean z3 = false;
        if ((z && !z2) || (!z && z2)) {
            max = i;
        } else {
            max = Math.max(i - 1, 0);
        }
        if (c42484i26.m34606b(max) == c42484i26.m34584x(i)) {
            z3 = true;
        }
        return c42484i26.m34599i(i, z3);
    }

    /* renamed from: b */
    public static final long m111020b(C42484i26 textLayoutResult, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        return C33056Ge3.m104938a(m111021a(textLayoutResult, i, z, z2), textLayoutResult.m34596l(textLayoutResult.m34592p(i)));
    }
}
