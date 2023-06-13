package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.focus.C11299c;
import androidx.compose.p003ui.focus.C11309h;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC0587BG;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a7\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\f\u001a\u001a\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fH\u0003\u001a1\u0010\u0015\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0001H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a5\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001b\u001a\f\u0010 \u001a\u00020\u0013*\u00020\u0013H\u0002\u001a\f\u0010!\u001a\u00020\u0013*\u00020\u0013H\u0002\u001a\f\u0010\"\u001a\u00020\u0000*\u00020\u0000H\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/c;", "direction", "Lkotlin/Function1;", "", "onFound", "t", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "k", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "focusedItem", "l", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "r", "LvZ0;", "LLX2;", "accessibleChildren", "", "i", "LOs4;", "focusRect", "j", "(LLX2;LOs4;I)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "proposedCandidate", "currentCandidate", "focusedRect", "m", "(LOs4;LOs4;LOs4;I)Z", Stripe3ds2AuthParams.FIELD_SOURCE, "rect1", "rect2", "c", "s", "h", "b", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,425:1\n1#2:426\n1161#3,2:427\n1161#3,2:431\n1182#3:437\n1161#3,2:438\n1182#3:467\n1161#3,2:468\n359#4:429\n523#4:430\n48#4:447\n460#4,11:482\n460#4,11:501\n87#5:433\n87#5:463\n340#6:434\n206#6,2:435\n208#6,7:440\n215#6,15:448\n346#6:464\n237#6,2:465\n239#6,12:470\n251#6,8:493\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n120#1:427,2\n178#1:431,2\n179#1:437\n179#1:438,2\n214#1:467\n214#1:468,2\n125#1:429\n125#1:430\n179#1:447\n227#1:482,11\n259#1:501,11\n179#1:433\n214#1:463\n179#1:434\n179#1:435,2\n179#1:440,7\n179#1:448,15\n214#1:464\n214#1:465,2\n214#1:470,12\n214#1:493,8\n*E\n"})
/* renamed from: androidx.compose.ui.focus.m */
/* loaded from: classes.dex */
public final class C11322m {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.focus.m$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C11323a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC37185Xv1.values().length];
            try {
                iArr[EnumC37185Xv1.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37185Xv1.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC37185Xv1.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC37185Xv1.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LBG$a;", "", C17296a.f69688o, "(LBG$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.focus.m$b */
    /* loaded from: classes.dex */
    public static final class C11324b extends Lambda implements Function1<InterfaceC0587BG.InterfaceC0588a, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ FocusTargetModifierNode f53000g;

        /* renamed from: h */
        public final /* synthetic */ FocusTargetModifierNode f53001h;

        /* renamed from: i */
        public final /* synthetic */ int f53002i;

        /* renamed from: j */
        public final /* synthetic */ Function1<FocusTargetModifierNode, Boolean> f53003j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11324b(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
            super(1);
            this.f53000g = focusTargetModifierNode;
            this.f53001h = focusTargetModifierNode2;
            this.f53002i = i;
            this.f53003j = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC0587BG.InterfaceC0588a searchBeyondBounds) {
            boolean z;
            Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
            Boolean valueOf = Boolean.valueOf(C11322m.m68732r(this.f53000g, this.f53001h, this.f53002i, this.f53003j));
            if (!valueOf.booleanValue() && searchBeyondBounds.mo93408a()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return null;
            }
            return valueOf;
        }
    }

    /* renamed from: b */
    public static final FocusTargetModifierNode m68748b(FocusTargetModifierNode focusTargetModifierNode) {
        boolean z;
        if (focusTargetModifierNode.m68831g0() == EnumC37185Xv1.ActiveParent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FocusTargetModifierNode m68765b = C11317k.m68765b(focusTargetModifierNode);
            if (m68765b != null) {
                return m68765b;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public static final boolean m68747c(C35055Os4 c35055Os4, C35055Os4 c35055Os42, C35055Os4 c35055Os43, int i) {
        if (m68746d(c35055Os43, i, c35055Os4) || !m68746d(c35055Os42, i, c35055Os4)) {
            return false;
        }
        if (m68745e(c35055Os43, i, c35055Os4)) {
            C11299c.C11300a c11300a = C11299c.f52961b;
            if (!C11299c.m68811l(i, c11300a.m68804d()) && !C11299c.m68811l(i, c11300a.m68801g()) && m68744f(c35055Os42, i, c35055Os4) >= m68743g(c35055Os43, i, c35055Os4)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m68746d(C35055Os4 c35055Os4, int i, C35055Os4 c35055Os42) {
        boolean m68811l;
        boolean m68811l2;
        C11299c.C11300a c11300a = C11299c.f52961b;
        if (C11299c.m68811l(i, c11300a.m68804d())) {
            m68811l = true;
        } else {
            m68811l = C11299c.m68811l(i, c11300a.m68801g());
        }
        if (m68811l) {
            if (c35055Os4.m91262e() > c35055Os42.m91255l() && c35055Os4.m91255l() < c35055Os42.m91262e()) {
                return true;
            }
        } else {
            if (C11299c.m68811l(i, c11300a.m68800h())) {
                m68811l2 = true;
            } else {
                m68811l2 = C11299c.m68811l(i, c11300a.m68807a());
            }
            if (m68811l2) {
                if (c35055Os4.m91257j() > c35055Os42.m91258i() && c35055Os4.m91258i() < c35055Os42.m91257j()) {
                    return true;
                }
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m68745e(C35055Os4 c35055Os4, int i, C35055Os4 c35055Os42) {
        C11299c.C11300a c11300a = C11299c.f52961b;
        if (C11299c.m68811l(i, c11300a.m68804d())) {
            if (c35055Os42.m91258i() >= c35055Os4.m91257j()) {
                return true;
            }
        } else if (C11299c.m68811l(i, c11300a.m68801g())) {
            if (c35055Os42.m91257j() <= c35055Os4.m91258i()) {
                return true;
            }
        } else if (C11299c.m68811l(i, c11300a.m68800h())) {
            if (c35055Os42.m91255l() >= c35055Os4.m91262e()) {
                return true;
            }
        } else if (C11299c.m68811l(i, c11300a.m68807a())) {
            if (c35055Os42.m91262e() <= c35055Os4.m91255l()) {
                return true;
            }
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return false;
    }

    /* renamed from: f */
    public static final float m68744f(C35055Os4 c35055Os4, int i, C35055Os4 c35055Os42) {
        float m91255l;
        float m91262e;
        float m91255l2;
        float m91262e2;
        float f;
        C11299c.C11300a c11300a = C11299c.f52961b;
        if (C11299c.m68811l(i, c11300a.m68804d())) {
            m91255l2 = c35055Os42.m91258i();
            m91262e2 = c35055Os4.m91257j();
        } else {
            if (C11299c.m68811l(i, c11300a.m68801g())) {
                m91255l = c35055Os4.m91258i();
                m91262e = c35055Os42.m91257j();
            } else if (C11299c.m68811l(i, c11300a.m68800h())) {
                m91255l2 = c35055Os42.m91255l();
                m91262e2 = c35055Os4.m91262e();
            } else if (C11299c.m68811l(i, c11300a.m68807a())) {
                m91255l = c35055Os4.m91255l();
                m91262e = c35055Os42.m91262e();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = m91255l - m91262e;
            return Math.max(0.0f, f);
        }
        f = m91255l2 - m91262e2;
        return Math.max(0.0f, f);
    }

    /* renamed from: g */
    public static final float m68743g(C35055Os4 c35055Os4, int i, C35055Os4 c35055Os42) {
        float m91262e;
        float m91262e2;
        float m91255l;
        float m91255l2;
        float f;
        C11299c.C11300a c11300a = C11299c.f52961b;
        if (C11299c.m68811l(i, c11300a.m68804d())) {
            m91255l = c35055Os42.m91258i();
            m91255l2 = c35055Os4.m91258i();
        } else {
            if (C11299c.m68811l(i, c11300a.m68801g())) {
                m91262e = c35055Os4.m91257j();
                m91262e2 = c35055Os42.m91257j();
            } else if (C11299c.m68811l(i, c11300a.m68800h())) {
                m91255l = c35055Os42.m91255l();
                m91255l2 = c35055Os4.m91255l();
            } else if (C11299c.m68811l(i, c11300a.m68807a())) {
                m91262e = c35055Os4.m91262e();
                m91262e2 = c35055Os42.m91262e();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = m91262e - m91262e2;
            return Math.max(1.0f, f);
        }
        f = m91255l - m91255l2;
        return Math.max(1.0f, f);
    }

    /* renamed from: h */
    public static final C35055Os4 m68742h(C35055Os4 c35055Os4) {
        return new C35055Os4(c35055Os4.m91257j(), c35055Os4.m91262e(), c35055Os4.m91257j(), c35055Os4.m91262e());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1 A[SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m68741i(InterfaceC50490vZ0 interfaceC50490vZ0, LX2<FocusTargetModifierNode> lx2) {
        boolean z;
        LX2<InterfaceC36483Uv1> m68780d;
        int m96690u;
        int m99169a = K83.m99169a(1024);
        if (interfaceC50490vZ0.mo8445r().m39254Q()) {
            LX2 lx22 = new LX2(new InterfaceC41563gV2.AbstractC20914c[16], 0);
            InterfaceC41563gV2.AbstractC20914c m39261I = interfaceC50490vZ0.mo8445r().m39261I();
            if (m39261I == null) {
                C51083wZ0.m6667b(lx22, interfaceC50490vZ0.mo8445r());
            } else {
                lx22.m96701b(m39261I);
            }
            while (lx22.m96687x()) {
                InterfaceC41563gV2.AbstractC20914c abstractC20914c = (InterfaceC41563gV2.AbstractC20914c) lx22.m96707C(lx22.m96690u() - 1);
                if ((abstractC20914c.m39262G() & m99169a) != 0) {
                    for (InterfaceC41563gV2.AbstractC20914c abstractC20914c2 = abstractC20914c; abstractC20914c2 != null; abstractC20914c2 = abstractC20914c2.m39261I()) {
                        if ((abstractC20914c2.m39258M() & m99169a) != 0) {
                            if (abstractC20914c2 instanceof FocusTargetModifierNode) {
                                FocusTargetModifierNode focusTargetModifierNode = abstractC20914c2;
                                if (focusTargetModifierNode.m39254Q()) {
                                    if (focusTargetModifierNode.m68833e0().mo68789h()) {
                                        lx2.m96701b(focusTargetModifierNode);
                                    } else {
                                        C11309h invoke = focusTargetModifierNode.m68833e0().mo68790g().invoke(C11299c.m68814i(C11299c.f52961b.m68806b()));
                                        C11309h.C11310a c11310a = C11309h.f52988b;
                                        if (Intrinsics.areEqual(invoke, c11310a.m68777b())) {
                                            invoke = null;
                                        }
                                        C11309h c11309h = invoke;
                                        if (c11309h != null) {
                                            if (!Intrinsics.areEqual(c11309h, c11310a.m68778a()) && (m96690u = (m68780d = c11309h.m68780d()).m96690u()) > 0) {
                                                InterfaceC36483Uv1[] m96691s = m68780d.m96691s();
                                                int i = 0;
                                                do {
                                                    m68741i(m96691s[i], lx2);
                                                    i++;
                                                } while (i < m96690u);
                                            }
                                        }
                                    }
                                }
                                z = false;
                                if (!z) {
                                }
                            }
                            z = true;
                            if (!z) {
                                break;
                            }
                        }
                    }
                }
                C51083wZ0.m6667b(lx22, abstractC20914c);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: j */
    public static final FocusTargetModifierNode m68740j(LX2<FocusTargetModifierNode> lx2, C35055Os4 c35055Os4, int i) {
        C35055Os4 m91249r;
        C11299c.C11300a c11300a = C11299c.f52961b;
        if (C11299c.m68811l(i, c11300a.m68804d())) {
            m91249r = c35055Os4.m91249r(c35055Os4.m91252o() + 1, 0.0f);
        } else if (C11299c.m68811l(i, c11300a.m68801g())) {
            m91249r = c35055Os4.m91249r(-(c35055Os4.m91252o() + 1), 0.0f);
        } else if (C11299c.m68811l(i, c11300a.m68800h())) {
            m91249r = c35055Os4.m91249r(0.0f, c35055Os4.m91259h() + 1);
        } else if (C11299c.m68811l(i, c11300a.m68807a())) {
            m91249r = c35055Os4.m91249r(0.0f, -(c35055Os4.m91259h() + 1));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        int m96690u = lx2.m96690u();
        FocusTargetModifierNode focusTargetModifierNode = null;
        if (m96690u > 0) {
            FocusTargetModifierNode[] m96691s = lx2.m96691s();
            int i2 = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = m96691s[i2];
                if (C11317k.m68760g(focusTargetModifierNode2)) {
                    C35055Os4 m68763d = C11317k.m68763d(focusTargetModifierNode2);
                    if (m68737m(m68763d, m91249r, c35055Os4, i)) {
                        focusTargetModifierNode = focusTargetModifierNode2;
                        m91249r = m68763d;
                    }
                }
                i2++;
            } while (i2 < m96690u);
            return focusTargetModifierNode;
        }
        return focusTargetModifierNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* renamed from: k */
    public static final boolean m68739k(FocusTargetModifierNode findChildCorrespondingToFocusEnter, int i, Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        boolean m68811l;
        C35055Os4 m68742h;
        Intrinsics.checkNotNullParameter(findChildCorrespondingToFocusEnter, "$this$findChildCorrespondingToFocusEnter");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        C11309h invoke = findChildCorrespondingToFocusEnter.m68833e0().mo68790g().invoke(C11299c.m68814i(i));
        C11309h.C11310a c11310a = C11309h.f52988b;
        FocusTargetModifierNode focusTargetModifierNode = null;
        if (Intrinsics.areEqual(invoke, c11310a.m68777b())) {
            invoke = null;
        }
        C11309h c11309h = invoke;
        if (c11309h != null) {
            if (Intrinsics.areEqual(c11309h, c11310a.m68778a())) {
                return false;
            }
            return c11309h.m68781c(onFound);
        }
        LX2 lx2 = new LX2(new FocusTargetModifierNode[16], 0);
        m68741i(findChildCorrespondingToFocusEnter, lx2);
        boolean z = true;
        if (lx2.m96690u() <= 1) {
            if (!lx2.m96688w()) {
                focusTargetModifierNode = lx2.m96691s()[0];
            }
            FocusTargetModifierNode focusTargetModifierNode2 = focusTargetModifierNode;
            if (focusTargetModifierNode2 == null) {
                return false;
            }
            return onFound.invoke(focusTargetModifierNode2).booleanValue();
        }
        C11299c.C11300a c11300a = C11299c.f52961b;
        if (C11299c.m68811l(i, c11300a.m68806b())) {
            i = c11300a.m68801g();
        }
        if (C11299c.m68811l(i, c11300a.m68801g())) {
            m68811l = true;
        } else {
            m68811l = C11299c.m68811l(i, c11300a.m68807a());
        }
        if (m68811l) {
            m68742h = m68731s(C11317k.m68763d(findChildCorrespondingToFocusEnter));
        } else {
            if (!C11299c.m68811l(i, c11300a.m68804d())) {
                z = C11299c.m68811l(i, c11300a.m68800h());
            }
            if (z) {
                m68742h = m68742h(C11317k.m68763d(findChildCorrespondingToFocusEnter));
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        FocusTargetModifierNode m68740j = m68740j(lx2, m68742h, i);
        if (m68740j == null) {
            return false;
        }
        return onFound.invoke(m68740j).booleanValue();
    }

    /* renamed from: l */
    public static final boolean m68738l(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (m68732r(focusTargetModifierNode, focusTargetModifierNode2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) C11297a.m68824a(focusTargetModifierNode, i, new C11324b(focusTargetModifierNode, focusTargetModifierNode2, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m68737m(C35055Os4 c35055Os4, C35055Os4 c35055Os42, C35055Os4 c35055Os43, int i) {
        if (!m68736n(c35055Os4, i, c35055Os43)) {
            return false;
        }
        if (m68736n(c35055Os42, i, c35055Os43) && !m68747c(c35055Os43, c35055Os4, c35055Os42, i) && (m68747c(c35055Os43, c35055Os42, c35055Os4, i) || m68733q(i, c35055Os43, c35055Os4) >= m68733q(i, c35055Os43, c35055Os42))) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static final boolean m68736n(C35055Os4 c35055Os4, int i, C35055Os4 c35055Os42) {
        C11299c.C11300a c11300a = C11299c.f52961b;
        if (C11299c.m68811l(i, c11300a.m68804d())) {
            if ((c35055Os42.m91257j() > c35055Os4.m91257j() || c35055Os42.m91258i() >= c35055Os4.m91257j()) && c35055Os42.m91258i() > c35055Os4.m91258i()) {
                return true;
            }
        } else if (C11299c.m68811l(i, c11300a.m68801g())) {
            if ((c35055Os42.m91258i() < c35055Os4.m91258i() || c35055Os42.m91257j() <= c35055Os4.m91258i()) && c35055Os42.m91257j() < c35055Os4.m91257j()) {
                return true;
            }
        } else if (C11299c.m68811l(i, c11300a.m68800h())) {
            if ((c35055Os42.m91262e() > c35055Os4.m91262e() || c35055Os42.m91255l() >= c35055Os4.m91262e()) && c35055Os42.m91255l() > c35055Os4.m91255l()) {
                return true;
            }
        } else if (C11299c.m68811l(i, c11300a.m68807a())) {
            if ((c35055Os42.m91255l() < c35055Os4.m91255l() || c35055Os42.m91262e() <= c35055Os4.m91255l()) && c35055Os42.m91262e() < c35055Os4.m91262e()) {
                return true;
            }
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return false;
    }

    /* renamed from: o */
    public static final float m68735o(C35055Os4 c35055Os4, int i, C35055Os4 c35055Os42) {
        float m91255l;
        float m91262e;
        float m91255l2;
        float m91262e2;
        float f;
        C11299c.C11300a c11300a = C11299c.f52961b;
        if (C11299c.m68811l(i, c11300a.m68804d())) {
            m91255l2 = c35055Os42.m91258i();
            m91262e2 = c35055Os4.m91257j();
        } else {
            if (C11299c.m68811l(i, c11300a.m68801g())) {
                m91255l = c35055Os4.m91258i();
                m91262e = c35055Os42.m91257j();
            } else if (C11299c.m68811l(i, c11300a.m68800h())) {
                m91255l2 = c35055Os42.m91255l();
                m91262e2 = c35055Os4.m91262e();
            } else if (C11299c.m68811l(i, c11300a.m68807a())) {
                m91255l = c35055Os4.m91255l();
                m91262e = c35055Os42.m91262e();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = m91255l - m91262e;
            return Math.max(0.0f, f);
        }
        f = m91255l2 - m91262e2;
        return Math.max(0.0f, f);
    }

    /* renamed from: p */
    public static final float m68734p(C35055Os4 c35055Os4, int i, C35055Os4 c35055Os42) {
        boolean m68811l;
        float f;
        float m91258i;
        float m91258i2;
        float m91252o;
        C11299c.C11300a c11300a = C11299c.f52961b;
        boolean z = true;
        if (C11299c.m68811l(i, c11300a.m68804d())) {
            m68811l = true;
        } else {
            m68811l = C11299c.m68811l(i, c11300a.m68801g());
        }
        if (m68811l) {
            f = 2;
            m91258i = c35055Os42.m91255l() + (c35055Os42.m91259h() / f);
            m91258i2 = c35055Os4.m91255l();
            m91252o = c35055Os4.m91259h();
        } else {
            if (!C11299c.m68811l(i, c11300a.m68800h())) {
                z = C11299c.m68811l(i, c11300a.m68807a());
            }
            if (z) {
                f = 2;
                m91258i = c35055Os42.m91258i() + (c35055Os42.m91252o() / f);
                m91258i2 = c35055Os4.m91258i();
                m91252o = c35055Os4.m91252o();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        return m91258i - (m91258i2 + (m91252o / f));
    }

    /* renamed from: q */
    public static final long m68733q(int i, C35055Os4 c35055Os4, C35055Os4 c35055Os42) {
        long abs = Math.abs(m68735o(c35055Os42, i, c35055Os4));
        long abs2 = Math.abs(m68734p(c35055Os42, i, c35055Os4));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    /* renamed from: r */
    public static final boolean m68732r(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        FocusTargetModifierNode m68740j;
        LX2 lx2 = new LX2(new FocusTargetModifierNode[16], 0);
        int m99169a = K83.m99169a(1024);
        if (focusTargetModifierNode.mo8445r().m39254Q()) {
            LX2 lx22 = new LX2(new InterfaceC41563gV2.AbstractC20914c[16], 0);
            InterfaceC41563gV2.AbstractC20914c m39261I = focusTargetModifierNode.mo8445r().m39261I();
            if (m39261I == null) {
                C51083wZ0.m6667b(lx22, focusTargetModifierNode.mo8445r());
            } else {
                lx22.m96701b(m39261I);
            }
            while (lx22.m96687x()) {
                InterfaceC41563gV2.AbstractC20914c abstractC20914c = (InterfaceC41563gV2.AbstractC20914c) lx22.m96707C(lx22.m96690u() - 1);
                if ((abstractC20914c.m39262G() & m99169a) == 0) {
                    C51083wZ0.m6667b(lx22, abstractC20914c);
                } else {
                    while (true) {
                        if (abstractC20914c == null) {
                            break;
                        } else if ((abstractC20914c.m39258M() & m99169a) != 0) {
                            if (abstractC20914c instanceof FocusTargetModifierNode) {
                                lx2.m96701b((FocusTargetModifierNode) abstractC20914c);
                            }
                        } else {
                            abstractC20914c = abstractC20914c.m39261I();
                        }
                    }
                }
            }
            while (lx2.m96687x() && (m68740j = m68740j(lx2, C11317k.m68763d(focusTargetModifierNode2), i)) != null) {
                if (m68740j.m68833e0().mo68789h()) {
                    return function1.invoke(m68740j).booleanValue();
                }
                C11309h invoke = m68740j.m68833e0().mo68790g().invoke(C11299c.m68814i(i));
                C11309h.C11310a c11310a = C11309h.f52988b;
                if (Intrinsics.areEqual(invoke, c11310a.m68777b())) {
                    invoke = null;
                }
                C11309h c11309h = invoke;
                if (c11309h != null) {
                    if (Intrinsics.areEqual(c11309h, c11310a.m68778a())) {
                        return false;
                    }
                    return c11309h.m68781c(function1);
                } else if (m68738l(m68740j, focusTargetModifierNode2, i, function1)) {
                    return true;
                } else {
                    lx2.m96709A(m68740j);
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: s */
    public static final C35055Os4 m68731s(C35055Os4 c35055Os4) {
        return new C35055Os4(c35055Os4.m91258i(), c35055Os4.m91255l(), c35055Os4.m91258i(), c35055Os4.m91255l());
    }

    /* renamed from: t */
    public static final Boolean m68730t(FocusTargetModifierNode twoDimensionalFocusSearch, int i, Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        Intrinsics.checkNotNullParameter(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        EnumC37185Xv1 m68830h0 = twoDimensionalFocusSearch.m68830h0();
        int[] iArr = C11323a.$EnumSwitchMapping$0;
        int i2 = iArr[m68830h0.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    if (twoDimensionalFocusSearch.m68833e0().mo68789h()) {
                        return onFound.invoke(twoDimensionalFocusSearch);
                    }
                    return Boolean.FALSE;
                }
                throw new NoWhenBranchMatchedException();
            }
            return Boolean.valueOf(m68739k(twoDimensionalFocusSearch, i, onFound));
        }
        FocusTargetModifierNode m68761f = C11317k.m68761f(twoDimensionalFocusSearch);
        if (m68761f != null) {
            int i3 = iArr[m68761f.m68830h0().ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                return Boolean.valueOf(m68738l(twoDimensionalFocusSearch, m68761f, i, onFound));
            }
            Boolean m68730t = m68730t(m68761f, i, onFound);
            if (!Intrinsics.areEqual(m68730t, Boolean.FALSE)) {
                return m68730t;
            }
            C11309h invoke = m68761f.m68833e0().mo68794c().invoke(C11299c.m68814i(i));
            C11309h.C11310a c11310a = C11309h.f52988b;
            if (Intrinsics.areEqual(invoke, c11310a.m68777b())) {
                invoke = null;
            }
            C11309h c11309h = invoke;
            if (c11309h != null) {
                if (Intrinsics.areEqual(c11309h, c11310a.m68778a())) {
                    return null;
                }
                return Boolean.valueOf(c11309h.m68781c(onFound));
            }
            return Boolean.valueOf(m68738l(twoDimensionalFocusSearch, m68748b(m68761f), i, onFound));
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }
}
