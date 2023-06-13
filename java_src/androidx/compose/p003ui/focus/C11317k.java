package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.focus.C11299c;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0001\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002\"\u001e\u0010\u0015\u001a\u00020\t*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\" \u0010\u0019\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/c;", "focusDirection", "Lpm2;", "layoutDirection", "Landroidx/compose/ui/focus/h;", C17296a.f69688o, "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILpm2;)Landroidx/compose/ui/focus/h;", "Lkotlin/Function1;", "", "onFound", "e", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILpm2;Lkotlin/jvm/functions/Function1;)Z", "LOs4;", DateTokenConverter.CONVERTER_KEY, "b", "c", "g", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z", "isEligibleForFocusSearch$annotations", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "isEligibleForFocusSearch", "f", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "getActiveChild$annotations", "activeChild", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,173:1\n1#2:174\n87#3:175\n87#3:205\n87#3:235\n340#4:176\n206#4,2:177\n208#4,7:182\n215#4,15:190\n340#4:206\n206#4,2:207\n208#4,7:212\n215#4,15:220\n314#4:236\n78#4,17:237\n1182#5:179\n1161#5,2:180\n1182#5:209\n1161#5,2:210\n48#6:189\n48#6:219\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n142#1:175\n156#1:205\n168#1:235\n142#1:176\n142#1:177,2\n142#1:182,7\n142#1:190,15\n156#1:206\n156#1:207,2\n156#1:212,7\n156#1:220,15\n168#1:236\n168#1:237,17\n142#1:179\n142#1:180,2\n156#1:209\n156#1:210,2\n142#1:189\n156#1:219\n*E\n"})
/* renamed from: androidx.compose.ui.focus.k */
/* loaded from: classes.dex */
public final class C11317k {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.focus.k$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C11318a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumC47065pm2.values().length];
            try {
                iArr[EnumC47065pm2.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC47065pm2.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC37185Xv1.values().length];
            try {
                iArr2[EnumC37185Xv1.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC37185Xv1.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC37185Xv1.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC37185Xv1.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: a */
    public static final C11309h m68766a(FocusTargetModifierNode customFocusSearch, int i, EnumC47065pm2 layoutDirection) {
        C11309h end;
        Intrinsics.checkNotNullParameter(customFocusSearch, "$this$customFocusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        InterfaceC11302e m68833e0 = customFocusSearch.m68833e0();
        C11299c.C11300a c11300a = C11299c.f52961b;
        if (C11299c.m68811l(i, c11300a.m68803e())) {
            return m68833e0.mo68796a();
        }
        if (C11299c.m68811l(i, c11300a.m68802f())) {
            return m68833e0.mo68791f();
        }
        if (C11299c.m68811l(i, c11300a.m68800h())) {
            return m68833e0.mo68795b();
        }
        if (C11299c.m68811l(i, c11300a.m68807a())) {
            return m68833e0.mo68793d();
        }
        if (C11299c.m68811l(i, c11300a.m68804d())) {
            int i2 = C11318a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    end = m68833e0.getEnd();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                end = m68833e0.getStart();
            }
            if (Intrinsics.areEqual(end, C11309h.f52988b.m68777b())) {
                end = null;
            }
            if (end == null) {
                return m68833e0.mo68787w();
            }
        } else if (C11299c.m68811l(i, c11300a.m68801g())) {
            int i3 = C11318a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    end = m68833e0.getStart();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                end = m68833e0.getEnd();
            }
            if (Intrinsics.areEqual(end, C11309h.f52988b.m68777b())) {
                end = null;
            }
            if (end == null) {
                return m68833e0.mo68788v();
            }
        } else if (C11299c.m68811l(i, c11300a.m68806b())) {
            return m68833e0.mo68790g().invoke(C11299c.m68814i(i));
        } else {
            if (C11299c.m68811l(i, c11300a.m68805c())) {
                return m68833e0.mo68794c().invoke(C11299c.m68814i(i));
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return end;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0054, code lost:
        continue;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusTargetModifierNode m68765b(FocusTargetModifierNode focusTargetModifierNode) {
        FocusTargetModifierNode m68765b;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i = C11318a.$EnumSwitchMapping$1[focusTargetModifierNode.m68830h0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                int m99169a = K83.m99169a(1024);
                if (focusTargetModifierNode.mo8445r().m39254Q()) {
                    LX2 lx2 = new LX2(new InterfaceC41563gV2.AbstractC20914c[16], 0);
                    InterfaceC41563gV2.AbstractC20914c m39261I = focusTargetModifierNode.mo8445r().m39261I();
                    if (m39261I == null) {
                        C51083wZ0.m6667b(lx2, focusTargetModifierNode.mo8445r());
                    } else {
                        lx2.m96701b(m39261I);
                    }
                    while (lx2.m96687x()) {
                        InterfaceC41563gV2.AbstractC20914c abstractC20914c = (InterfaceC41563gV2.AbstractC20914c) lx2.m96707C(lx2.m96690u() - 1);
                        if ((abstractC20914c.m39262G() & m99169a) == 0) {
                            C51083wZ0.m6667b(lx2, abstractC20914c);
                        } else {
                            while (true) {
                                if (abstractC20914c == null) {
                                    break;
                                } else if ((abstractC20914c.m39258M() & m99169a) != 0) {
                                    if ((abstractC20914c instanceof FocusTargetModifierNode) && (m68765b = m68765b((FocusTargetModifierNode) abstractC20914c)) != null) {
                                        return m68765b;
                                    }
                                } else {
                                    abstractC20914c = abstractC20914c.m39261I();
                                }
                            }
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return focusTargetModifierNode;
    }

    /* renamed from: c */
    public static final FocusTargetModifierNode m68764c(FocusTargetModifierNode focusTargetModifierNode) {
        F83 m99764m0;
        int m99169a = K83.m99169a(1024);
        if (focusTargetModifierNode.mo8445r().m39254Q()) {
            InterfaceC41563gV2.AbstractC20914c m39256O = focusTargetModifierNode.mo8445r().m39256O();
            C33829Jm2 m6661h = C51083wZ0.m6661h(focusTargetModifierNode);
            while (m6661h != null) {
                if ((m6661h.m99764m0().m107677l().m39262G() & m99169a) != 0) {
                    while (m39256O != null) {
                        if ((m39256O.m39258M() & m99169a) != 0 && (m39256O instanceof FocusTargetModifierNode)) {
                            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) m39256O;
                            if (focusTargetModifierNode2.m68833e0().mo68789h()) {
                                return focusTargetModifierNode2;
                            }
                        }
                        m39256O = m39256O.m39256O();
                    }
                }
                m6661h = m6661h.m99756p0();
                if (m6661h != null && (m99764m0 = m6661h.m99764m0()) != null) {
                    m39256O = m99764m0.m107674o();
                } else {
                    m39256O = null;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: d */
    public static final C35055Os4 m68763d(FocusTargetModifierNode focusTargetModifierNode) {
        C35055Os4 mo23185e;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        H83 m39260J = focusTargetModifierNode.m39260J();
        if (m39260J == null || (mo23185e = C46472om2.m20517d(m39260J).mo23185e(m39260J, false)) == null) {
            return C35055Os4.f27481e.m91247a();
        }
        return mo23185e;
    }

    /* renamed from: e */
    public static final boolean m68762e(FocusTargetModifierNode focusSearch, int i, EnumC47065pm2 layoutDirection, Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        boolean m68811l;
        boolean m68811l2;
        boolean m68811l3;
        boolean m68811l4;
        FocusTargetModifierNode focusTargetModifierNode;
        int m68801g;
        Boolean m68730t;
        Intrinsics.checkNotNullParameter(focusSearch, "$this$focusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        C11299c.C11300a c11300a = C11299c.f52961b;
        if (C11299c.m68811l(i, c11300a.m68803e())) {
            m68811l = true;
        } else {
            m68811l = C11299c.m68811l(i, c11300a.m68802f());
        }
        if (m68811l) {
            return C11319l.m68754f(focusSearch, i, onFound);
        }
        if (C11299c.m68811l(i, c11300a.m68804d())) {
            m68811l2 = true;
        } else {
            m68811l2 = C11299c.m68811l(i, c11300a.m68801g());
        }
        if (m68811l2) {
            m68811l3 = true;
        } else {
            m68811l3 = C11299c.m68811l(i, c11300a.m68800h());
        }
        if (m68811l3) {
            m68811l4 = true;
        } else {
            m68811l4 = C11299c.m68811l(i, c11300a.m68807a());
        }
        if (m68811l4) {
            Boolean m68730t2 = C11322m.m68730t(focusSearch, i, onFound);
            if (m68730t2 != null) {
                return m68730t2.booleanValue();
            }
        } else if (C11299c.m68811l(i, c11300a.m68806b())) {
            int i2 = C11318a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    m68801g = c11300a.m68804d();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                m68801g = c11300a.m68801g();
            }
            FocusTargetModifierNode m68765b = m68765b(focusSearch);
            if (m68765b != null && (m68730t = C11322m.m68730t(m68765b, m68801g, onFound)) != null) {
                return m68730t.booleanValue();
            }
        } else if (C11299c.m68811l(i, c11300a.m68805c())) {
            FocusTargetModifierNode m68765b2 = m68765b(focusSearch);
            if (m68765b2 != null) {
                focusTargetModifierNode = m68764c(m68765b2);
            } else {
                focusTargetModifierNode = null;
            }
            if (focusTargetModifierNode != null && !Intrinsics.areEqual(focusTargetModifierNode, focusSearch)) {
                return onFound.invoke(focusTargetModifierNode).booleanValue();
            }
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C11299c.m68809n(i))).toString());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0040, code lost:
        continue;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusTargetModifierNode m68761f(FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        if (!focusTargetModifierNode.mo8445r().m39254Q()) {
            return null;
        }
        int m99169a = K83.m99169a(1024);
        if (focusTargetModifierNode.mo8445r().m39254Q()) {
            LX2 lx2 = new LX2(new InterfaceC41563gV2.AbstractC20914c[16], 0);
            InterfaceC41563gV2.AbstractC20914c m39261I = focusTargetModifierNode.mo8445r().m39261I();
            if (m39261I == null) {
                C51083wZ0.m6667b(lx2, focusTargetModifierNode.mo8445r());
            } else {
                lx2.m96701b(m39261I);
            }
            while (lx2.m96687x()) {
                InterfaceC41563gV2.AbstractC20914c abstractC20914c = (InterfaceC41563gV2.AbstractC20914c) lx2.m96707C(lx2.m96690u() - 1);
                if ((abstractC20914c.m39262G() & m99169a) == 0) {
                    C51083wZ0.m6667b(lx2, abstractC20914c);
                } else {
                    while (true) {
                        if (abstractC20914c == null) {
                            break;
                        } else if ((abstractC20914c.m39258M() & m99169a) != 0) {
                            if (abstractC20914c instanceof FocusTargetModifierNode) {
                                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) abstractC20914c;
                                int i = C11318a.$EnumSwitchMapping$1[focusTargetModifierNode2.m68830h0().ordinal()];
                                if (i == 1 || i == 2 || i == 3) {
                                    return focusTargetModifierNode2;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            abstractC20914c = abstractC20914c.m39261I();
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: g */
    public static final boolean m68760g(FocusTargetModifierNode focusTargetModifierNode) {
        boolean z;
        boolean z2;
        C33829Jm2 mo84222r1;
        C33829Jm2 mo84222r12;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        H83 m39260J = focusTargetModifierNode.m39260J();
        if (m39260J != null && (mo84222r12 = m39260J.mo84222r1()) != null && mo84222r12.mo8156n()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            H83 m39260J2 = focusTargetModifierNode.m39260J();
            if (m39260J2 != null && (mo84222r1 = m39260J2.mo84222r1()) != null && mo84222r1.m99822J0()) {
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
}
