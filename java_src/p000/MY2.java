package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p000.C53061zt0;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aM\u0010\f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m28432d2 = {"LKY2;", "", "route", "", "LmY2;", "arguments", "LFY2;", "deepLinks", "Lkotlin/Function1;", "LAY2;", "", "content", C17296a.f69688o, "(LKY2;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "navigation-compose_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: MY2 */
/* loaded from: classes.dex */
public final class MY2 {
    /* renamed from: a */
    public static final void m95171a(KY2 ky2, String route, List<C45148mY2> arguments, List<FY2> deepLinks, Function3<? super AY2, ? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(ky2, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(deepLinks, "deepLinks");
        Intrinsics.checkNotNullParameter(content, "content");
        C53061zt0.C31587b c31587b = new C53061zt0.C31587b((C53061zt0) ky2.m98780e().m35382d(C53061zt0.class), content);
        c31587b.m103782D(route);
        for (C45148mY2 c45148mY2 : arguments) {
            c31587b.m103781a(c45148mY2.m25447a(), c45148mY2.m25446b());
        }
        for (FY2 fy2 : deepLinks) {
            c31587b.m103780b(fy2);
        }
        ky2.m98782c(c31587b);
    }

    /* renamed from: b */
    public static /* synthetic */ void m95170b(KY2 ky2, String str, List list, List list2, Function3 function3, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        m95171a(ky2, str, list, list2, function3);
    }
}
