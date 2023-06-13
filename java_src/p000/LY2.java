package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import p000.C5048Le;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aî\u0001\u0010\u0016\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032#\b\u0002\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b¢\u0006\u0002\b\f2#\b\u0002\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\b¢\u0006\u0002\b\f2#\b\u0002\u0010\u0010\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b¢\u0006\u0002\b\f2#\b\u0002\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\b¢\u0006\u0002\b\f2\u001d\u0010\u0015\u001a\u0019\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m28432d2 = {"LKY2;", "", "route", "", "LmY2;", "arguments", "LFY2;", "deepLinks", "Lkotlin/Function1;", "LOe;", "LAY2;", "LZe1;", "Lkotlin/ExtensionFunctionType;", "enterTransition", "Lgi1;", "exitTransition", "popEnterTransition", "popExitTransition", "Lkotlin/Function2;", "LTe;", "", "content", C17296a.f69688o, "(LKY2;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "navigation-animation_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: LY2 */
/* loaded from: classes5.dex */
public final class LY2 {
    /* renamed from: a */
    public static final void m96641a(KY2 ky2, String route, List<C45148mY2> arguments, List<FY2> deepLinks, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function1, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function12, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function13, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function14, Function4<? super InterfaceC7907Te, ? super AY2, ? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(ky2, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(deepLinks, "deepLinks");
        Intrinsics.checkNotNullParameter(content, "content");
        C5048Le.C5050b c5050b = new C5048Le.C5050b((C5048Le) ky2.m98780e().m35382d(C5048Le.class), content);
        c5050b.m103782D(route);
        for (C45148mY2 c45148mY2 : arguments) {
            c5050b.m103781a(c45148mY2.m25447a(), c45148mY2.m25446b());
        }
        for (FY2 fy2 : deepLinks) {
            c5050b.m103780b(fy2);
        }
        if (function1 != null) {
            C6817Qe.m88300e().put(route, function1);
        }
        if (function12 != null) {
            C6817Qe.m88299f().put(route, function12);
        }
        if (function13 != null) {
            C6817Qe.m88298g().put(route, function13);
        }
        if (function14 != null) {
            C6817Qe.m88297h().put(route, function14);
        }
        ky2.m98782c(c5050b);
    }

    /* renamed from: b */
    public static /* synthetic */ void m96640b(KY2 ky2, String str, List list, List list2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function4 function4, int i, Object obj) {
        List list3;
        List list4;
        Function1 function15;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        List emptyList;
        List emptyList2;
        if ((i & 2) != 0) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            list3 = emptyList2;
        } else {
            list3 = list;
        }
        if ((i & 4) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list4 = emptyList;
        } else {
            list4 = list2;
        }
        if ((i & 8) != 0) {
            function15 = null;
        } else {
            function15 = function1;
        }
        if ((i & 16) != 0) {
            function16 = null;
        } else {
            function16 = function12;
        }
        if ((i & 32) != 0) {
            function17 = function15;
        } else {
            function17 = function13;
        }
        if ((i & 64) != 0) {
            function18 = function16;
        } else {
            function18 = function14;
        }
        m96641a(ky2, str, list3, list4, function15, function16, function17, function18, function4);
    }
}
