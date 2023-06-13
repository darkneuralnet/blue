package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"LpI4;", "", C17296a.f69688o, "(LpI4;)Z", "isCancelled", "fuel"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: cd0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39247cd0 {
    /* renamed from: a */
    public static final boolean m61161a(InterfaceC46785pI4 isCancelled) {
        Intrinsics.checkNotNullParameter(isCancelled, "$this$isCancelled");
        FutureC38654bd0 m64264b = FutureC38654bd0.f57763f.m64264b(isCancelled.getRequest());
        if (m64264b != null) {
            return m64264b.isCancelled();
        }
        return false;
    }
}
