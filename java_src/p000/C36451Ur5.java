package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, m28432d2 = {"Lnm2;", "LOs4;", "b", "LCe3;", "offset", "", C17296a.f69688o, "(LOs4;J)Z", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ur5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36451Ur5 {
    /* renamed from: a */
    public static final boolean m80742a(C35055Os4 containsInclusive, long j) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(containsInclusive, "$this$containsInclusive");
        float m91258i = containsInclusive.m91258i();
        float m91257j = containsInclusive.m91257j();
        float m111944o = C32120Ce3.m111944o(j);
        if (m91258i <= m111944o && m111944o <= m91257j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float m91255l = containsInclusive.m91255l();
            float m91262e = containsInclusive.m91262e();
            float m111943p = C32120Ce3.m111943p(j);
            if (m91255l <= m111943p && m111943p <= m91262e) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final C35055Os4 m80741b(InterfaceC45879nm2 interfaceC45879nm2) {
        Intrinsics.checkNotNullParameter(interfaceC45879nm2, "<this>");
        C35055Os4 m20518c = C46472om2.m20518c(interfaceC45879nm2);
        return C35991Ss4.m84693a(interfaceC45879nm2.mo23188H(m20518c.m91254m()), interfaceC45879nm2.mo23188H(m20518c.m91261f()));
    }
}
