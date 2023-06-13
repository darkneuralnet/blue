package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.http2.Http2Connection;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\"\u0010\t\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002\u001a\f\u0010\r\u001a\u00020\u000b*\u00020\nH\u0002\" \u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\" \u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000f\"\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u00020\n8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m28432d2 = {"LJm2;", "", "Lgs5;", "list", "", "f", "Lkotlin/Function1;", "", "selector", "e", "Lis5;", "", DateTokenConverter.CONVERTER_KEY, "k", "i", "(LJm2;)Lgs5;", "getOuterSemantics$annotations", "(LJm2;)V", "outerSemantics", "h", "getOuterMergingSemantics$annotations", "outerMergingSemantics", "LCb5;", "j", "(Lis5;)LCb5;", "role", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,436:1\n73#2:437\n73#2:471\n679#3:438\n610#3,8:439\n633#3,3:447\n618#3,2:450\n611#3:452\n680#3:453\n612#3,11:454\n636#3,3:465\n623#3:468\n613#3:469\n682#3:470\n603#3,15:472\n633#3,3:487\n618#3,2:490\n611#3:492\n604#3,19:493\n636#3,3:512\n623#3:515\n613#3:516\n606#3:517\n460#4,11:518\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n391#1:437\n395#1:471\n391#1:438\n391#1:439,8\n391#1:447,3\n391#1:450,2\n391#1:452\n391#1:453\n391#1:454,11\n391#1:465,3\n391#1:468\n391#1:469\n391#1:470\n395#1:472,15\n395#1:487,3\n395#1:490,2\n395#1:492\n395#1:493,19\n395#1:512,3\n395#1:515\n395#1:516\n395#1:517\n405#1:518,11\n*E\n"})
/* renamed from: js5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43570js5 {
    /* renamed from: d */
    public static final int m29808d(C42977is5 c42977is5) {
        return c42977is5.m31730k() + 2000000000;
    }

    /* renamed from: e */
    public static final C33829Jm2 m29807e(C33829Jm2 c33829Jm2, Function1<? super C33829Jm2, Boolean> selector) {
        Intrinsics.checkNotNullParameter(c33829Jm2, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        for (C33829Jm2 m99756p0 = c33829Jm2.m99756p0(); m99756p0 != null; m99756p0 = m99756p0.m99756p0()) {
            if (selector.invoke(m99756p0).booleanValue()) {
                return m99756p0;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static final List<InterfaceC41791gs5> m29806f(C33829Jm2 c33829Jm2, List<InterfaceC41791gs5> list) {
        LX2<C33829Jm2> m99739v0 = c33829Jm2.m99739v0();
        int m96690u = m99739v0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99739v0.m96691s();
            int i = 0;
            do {
                C33829Jm2 c33829Jm22 = m96691s[i];
                InterfaceC41791gs5 m29803i = m29803i(c33829Jm22);
                if (m29803i != null) {
                    list.add(m29803i);
                } else {
                    m29806f(c33829Jm22, list);
                }
                i++;
            } while (i < m96690u);
            return list;
        }
        return list;
    }

    /* renamed from: g */
    public static /* synthetic */ List m29805g(C33829Jm2 c33829Jm2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return m29806f(c33829Jm2, list);
    }

    /* renamed from: h */
    public static final InterfaceC41791gs5 m29804h(C33829Jm2 c33829Jm2) {
        InterfaceC41563gV2.AbstractC20914c abstractC20914c;
        Intrinsics.checkNotNullParameter(c33829Jm2, "<this>");
        F83 m99764m0 = c33829Jm2.m99764m0();
        int m99169a = K83.m99169a(8);
        if ((F83.m107686c(m99764m0) & m99169a) != 0) {
            abstractC20914c = m99764m0.m107677l();
            while (abstractC20914c != null) {
                if ((abstractC20914c.m39258M() & m99169a) == 0 || !(abstractC20914c instanceof InterfaceC41791gs5) || !((InterfaceC41791gs5) abstractC20914c).mo29740H().m62254s()) {
                    if ((abstractC20914c.m39262G() & m99169a) == 0) {
                        break;
                    }
                    abstractC20914c = abstractC20914c.m39261I();
                } else {
                    break;
                }
            }
        }
        abstractC20914c = null;
        return (InterfaceC41791gs5) abstractC20914c;
    }

    /* renamed from: i */
    public static final InterfaceC41791gs5 m29803i(C33829Jm2 c33829Jm2) {
        InterfaceC41563gV2.AbstractC20914c abstractC20914c;
        Intrinsics.checkNotNullParameter(c33829Jm2, "<this>");
        F83 m99764m0 = c33829Jm2.m99764m0();
        int m99169a = K83.m99169a(8);
        if ((F83.m107686c(m99764m0) & m99169a) != 0) {
            abstractC20914c = m99764m0.m107677l();
            while (abstractC20914c != null) {
                if ((abstractC20914c.m39258M() & m99169a) != 0 && (abstractC20914c instanceof InterfaceC41791gs5)) {
                    break;
                } else if ((abstractC20914c.m39262G() & m99169a) == 0) {
                    break;
                } else {
                    abstractC20914c = abstractC20914c.m39261I();
                }
            }
        }
        abstractC20914c = null;
        return (InterfaceC41791gs5) abstractC20914c;
    }

    /* renamed from: j */
    public static final C32095Cb5 m29802j(C42977is5 c42977is5) {
        return (C32095Cb5) C39420cs5.m44940a(c42977is5.m31721t(), C45349ms5.f98933a.m24800t());
    }

    /* renamed from: k */
    public static final int m29801k(C42977is5 c42977is5) {
        return c42977is5.m31730k() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
    }
}
