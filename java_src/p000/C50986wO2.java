package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33829Jm2;
import p000.InterfaceC43181jD3;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\bI\u0010JJ'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0006J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0006J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0006J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0019\u001a\u00020\u00062\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017J\u0006\u0010\u001a\u001a\u00020\nJ#\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\"\u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0002R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001d018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u0010:\u001a\u0002052\u0006\u00106\u001a\u0002058F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u00109R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R!\u0010>\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b \u0010=R\u0016\u0010B\u001a\u0004\u0018\u00010?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0018\u0010F\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010DR\u0018\u0010H\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010D\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006K"}, m28432d2 = {"LwO2;", "", "LJm2;", "layoutNode", "Lkz0;", "constraints", "", "f", "(LJm2;Lkz0;)Z", "g", "", "p", "c", "r", "s", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(J)V", "forced", "v", "A", "t", "y", "x", "Lkotlin/Function0;", "onLayout", "l", "n", "m", "(LJm2;J)V", "LjD3$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "q", "h", "forceDispatch", DateTokenConverter.CONVERTER_KEY, "node", "o", C17296a.f69688o, "LJm2;", "root", "Ls01;", "b", "Ls01;", "relayoutNodes", "Z", "duringMeasureLayout", "Ldh3;", "Ldh3;", "onPositionedDispatcher", "LLX2;", "e", "LLX2;", "onLayoutCompletedListeners", "", "<set-?>", "J", "getMeasureIteration", "()J", "measureIteration", "LwO2$a;", "postponedMeasureRequests", "Lkz0;", "rootConstraints", "LUm2;", "i", "LUm2;", "consistencyChecker", "k", "(LJm2;)Z", "measureAffectsParent", "canAffectParent", "j", "canAffectParentInLookahead", "<init>", "(LJm2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,557:1\n390#1,8:565\n399#1,5:584\n390#1,14:589\n390#1,14:614\n1182#2:558\n1161#2,2:559\n1182#2:561\n1161#2,2:562\n100#3:564\n100#3:573\n91#3,10:574\n460#4,11:603\n728#4,2:628\n460#4,11:630\n460#4,11:641\n460#4,11:653\n163#5:652\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n327#1:565,8\n327#1:584,5\n347#1:589,14\n370#1:614,14\n63#1:558\n63#1:559,2\n84#1:561\n84#1:562,2\n48#1:564\n328#1:573\n329#1:574,10\n359#1:603,11\n406#1:628,2\n410#1:630,11\n452#1:641,11\n499#1:653,11\n499#1:652\n*E\n"})
/* renamed from: wO2 */
/* loaded from: classes.dex */
public final class C50986wO2 {

    /* renamed from: a */
    public final C33829Jm2 f115880a;

    /* renamed from: b */
    public final C48388s01 f115881b;

    /* renamed from: c */
    public boolean f115882c;

    /* renamed from: d */
    public final C39901dh3 f115883d;

    /* renamed from: e */
    public final LX2<InterfaceC43181jD3.InterfaceC24738b> f115884e;

    /* renamed from: f */
    public long f115885f;

    /* renamed from: g */
    public final LX2<C29867a> f115886g;

    /* renamed from: h */
    public C44228kz0 f115887h;

    /* renamed from: i */
    public final C36403Um2 f115888i;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\u0010"}, m28432d2 = {"LwO2$a;", "", "LJm2;", C17296a.f69688o, "LJm2;", "()LJm2;", "node", "", "b", "Z", "c", "()Z", "isLookahead", "isForced", "<init>", "(LJm2;ZZ)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: wO2$a */
    /* loaded from: classes.dex */
    public static final class C29867a {

        /* renamed from: a */
        public final C33829Jm2 f115889a;

        /* renamed from: b */
        public final boolean f115890b;

        /* renamed from: c */
        public final boolean f115891c;

        public C29867a(C33829Jm2 node, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.f115889a = node;
            this.f115890b = z;
            this.f115891c = z2;
        }

        /* renamed from: a */
        public final C33829Jm2 m6904a() {
            return this.f115889a;
        }

        /* renamed from: b */
        public final boolean m6903b() {
            return this.f115891c;
        }

        /* renamed from: c */
        public final boolean m6902c() {
            return this.f115890b;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wO2$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C29868b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C33829Jm2.EnumC4228e.values().length];
            try {
                iArr[C33829Jm2.EnumC4228e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C33829Jm2.EnumC4228e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C33829Jm2.EnumC4228e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C33829Jm2.EnumC4228e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C33829Jm2.EnumC4228e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C50986wO2(C33829Jm2 root) {
        C36403Um2 c36403Um2;
        Intrinsics.checkNotNullParameter(root, "root");
        this.f115880a = root;
        InterfaceC43181jD3.C24737a c24737a = InterfaceC43181jD3.f92292e0;
        C48388s01 c48388s01 = new C48388s01(c24737a.m30977a());
        this.f115881b = c48388s01;
        this.f115883d = new C39901dh3();
        this.f115884e = new LX2<>(new InterfaceC43181jD3.InterfaceC24738b[16], 0);
        this.f115885f = 1L;
        LX2<C29867a> lx2 = new LX2<>(new C29867a[16], 0);
        this.f115886g = lx2;
        if (c24737a.m30977a()) {
            c36403Um2 = new C36403Um2(root, c48388s01, lx2.m96697g());
        } else {
            c36403Um2 = null;
        }
        this.f115888i = c36403Um2;
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m6932B(C50986wO2 c50986wO2, C33829Jm2 c33829Jm2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c50986wO2.m6933A(c33829Jm2, z);
    }

    /* renamed from: e */
    public static /* synthetic */ void m6926e(C50986wO2 c50986wO2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c50986wO2.m6927d(z);
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m6910u(C50986wO2 c50986wO2, C33829Jm2 c33829Jm2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c50986wO2.m6911t(c33829Jm2, z);
    }

    /* renamed from: w */
    public static /* synthetic */ boolean m6908w(C50986wO2 c50986wO2, C33829Jm2 c33829Jm2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c50986wO2.m6909v(c33829Jm2, z);
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m6905z(C50986wO2 c50986wO2, C33829Jm2 c33829Jm2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c50986wO2.m6906y(c33829Jm2, z);
    }

    /* renamed from: A */
    public final boolean m6933A(C33829Jm2 layoutNode, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = C29868b.$EnumSwitchMapping$0[layoutNode.m99792Z().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    if (!layoutNode.m99777g0() || z) {
                        layoutNode.m99807R0();
                        if (layoutNode.mo8156n() || m6922i(layoutNode)) {
                            C33829Jm2 m99756p0 = layoutNode.m99756p0();
                            if (m99756p0 != null && m99756p0.m99777g0()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                this.f115881b.m14900a(layoutNode);
                            }
                        }
                        if (!this.f115882c) {
                            return true;
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                this.f115886g.m96701b(new C29867a(layoutNode, false, z));
                C36403Um2 c36403Um2 = this.f115888i;
                if (c36403Um2 != null) {
                    c36403Um2.m80882a();
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public final void m6931C(long j) {
        boolean m28070g;
        C44228kz0 c44228kz0 = this.f115887h;
        if (c44228kz0 == null) {
            m28070g = false;
        } else {
            m28070g = C44228kz0.m28070g(c44228kz0.m28058s(), j);
        }
        if (!m28070g) {
            if (!this.f115882c) {
                this.f115887h = C44228kz0.m28075b(j);
                this.f115880a.m99807R0();
                this.f115881b.m14900a(this.f115880a);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: c */
    public final void m6928c() {
        LX2<InterfaceC43181jD3.InterfaceC24738b> lx2 = this.f115884e;
        int m96690u = lx2.m96690u();
        if (m96690u > 0) {
            InterfaceC43181jD3.InterfaceC24738b[] m96691s = lx2.m96691s();
            int i = 0;
            do {
                m96691s[i].mo29723m();
                i++;
            } while (i < m96690u);
            this.f115884e.m96696h();
        }
        this.f115884e.m96696h();
    }

    /* renamed from: d */
    public final void m6927d(boolean z) {
        if (z) {
            this.f115883d.m43880d(this.f115880a);
        }
        this.f115883d.m43883a();
    }

    /* renamed from: f */
    public final boolean m6925f(C33829Jm2 c33829Jm2, C44228kz0 c44228kz0) {
        boolean m99817M0;
        if (c33829Jm2.m99781e0() == null) {
            return false;
        }
        if (c44228kz0 != null) {
            m99817M0 = c33829Jm2.m99819L0(c44228kz0);
        } else {
            m99817M0 = C33829Jm2.m99817M0(c33829Jm2, null, 1, null);
        }
        C33829Jm2 m99756p0 = c33829Jm2.m99756p0();
        if (m99817M0 && m99756p0 != null) {
            if (m99756p0.m99781e0() == null) {
                m6932B(this, m99756p0, false, 2, null);
            } else if (c33829Jm2.m99771j0() == C33829Jm2.EnumC4230g.InMeasureBlock) {
                m6908w(this, m99756p0, false, 2, null);
            } else if (c33829Jm2.m99771j0() == C33829Jm2.EnumC4230g.InLayoutBlock) {
                m6910u(this, m99756p0, false, 2, null);
            }
        }
        return m99817M0;
    }

    /* renamed from: g */
    public final boolean m6924g(C33829Jm2 c33829Jm2, C44228kz0 c44228kz0) {
        boolean m99784c1;
        if (c44228kz0 != null) {
            m99784c1 = c33829Jm2.m99786b1(c44228kz0);
        } else {
            m99784c1 = C33829Jm2.m99784c1(c33829Jm2, null, 1, null);
        }
        C33829Jm2 m99756p0 = c33829Jm2.m99756p0();
        if (m99784c1 && m99756p0 != null) {
            if (c33829Jm2.m99773i0() == C33829Jm2.EnumC4230g.InMeasureBlock) {
                m6932B(this, m99756p0, false, 2, null);
            } else if (c33829Jm2.m99773i0() == C33829Jm2.EnumC4230g.InLayoutBlock) {
                m6905z(this, m99756p0, false, 2, null);
            }
        }
        return m99784c1;
    }

    /* renamed from: h */
    public final void m6923h(C33829Jm2 layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.f115881b.m14897d()) {
            return;
        }
        if (this.f115882c) {
            if (!layoutNode.m99777g0()) {
                LX2<C33829Jm2> m99736w0 = layoutNode.m99736w0();
                int m96690u = m99736w0.m96690u();
                if (m96690u > 0) {
                    C33829Jm2[] m96691s = m99736w0.m96691s();
                    int i = 0;
                    do {
                        C33829Jm2 c33829Jm2 = m96691s[i];
                        if (c33829Jm2.m99777g0() && this.f115881b.m14895f(c33829Jm2)) {
                            m6913r(c33829Jm2);
                        }
                        if (!c33829Jm2.m99777g0()) {
                            m6923h(c33829Jm2);
                        }
                        i++;
                    } while (i < m96690u);
                    if (!layoutNode.m99777g0() && this.f115881b.m14895f(layoutNode)) {
                        m6913r(layoutNode);
                        return;
                    }
                    return;
                } else if (!layoutNode.m99777g0()) {
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: i */
    public final boolean m6922i(C33829Jm2 c33829Jm2) {
        return c33829Jm2.m99777g0() && m6920k(c33829Jm2);
    }

    /* renamed from: j */
    public final boolean m6921j(C33829Jm2 c33829Jm2) {
        boolean z;
        AbstractC6277P9 mo88870d;
        if (!c33829Jm2.m99789a0()) {
            return false;
        }
        if (c33829Jm2.m99771j0() != C33829Jm2.EnumC4230g.InMeasureBlock) {
            InterfaceC6687Q9 m91509t = c33829Jm2.m99796X().m91509t();
            if (m91509t != null && (mo88870d = m91509t.mo88870d()) != null && mo88870d.m90691k()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m6920k(C33829Jm2 c33829Jm2) {
        if (c33829Jm2.m99773i0() != C33829Jm2.EnumC4230g.InMeasureBlock && !c33829Jm2.m99796X().m91517l().mo88870d().m90691k()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean m6919l(Function0<Unit> function0) {
        boolean z;
        if (this.f115880a.m99822J0()) {
            if (this.f115880a.mo8156n()) {
                if (!this.f115882c) {
                    boolean z2 = false;
                    if (this.f115887h != null) {
                        this.f115882c = true;
                        try {
                            if (!this.f115881b.m14897d()) {
                                C48388s01 c48388s01 = this.f115881b;
                                z = false;
                                while (!c48388s01.m14897d()) {
                                    C33829Jm2 m14896e = c48388s01.m14896e();
                                    boolean m6913r = m6913r(m14896e);
                                    if (m14896e == this.f115880a && m6913r) {
                                        z = true;
                                    }
                                }
                                if (function0 != null) {
                                    function0.invoke();
                                }
                            } else {
                                z = false;
                            }
                            this.f115882c = false;
                            C36403Um2 c36403Um2 = this.f115888i;
                            if (c36403Um2 != null) {
                                c36403Um2.m80882a();
                            }
                            z2 = z;
                        } catch (Throwable th) {
                            this.f115882c = false;
                            throw th;
                        }
                    }
                    m6928c();
                    return z2;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: m */
    public final void m6918m(C33829Jm2 layoutNode, long j) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (!Intrinsics.areEqual(layoutNode, this.f115880a)) {
            if (this.f115880a.m99822J0()) {
                if (this.f115880a.mo8156n()) {
                    if (!this.f115882c) {
                        if (this.f115887h != null) {
                            this.f115882c = true;
                            try {
                                this.f115881b.m14895f(layoutNode);
                                boolean m6925f = m6925f(layoutNode, C44228kz0.m28075b(j));
                                m6924g(layoutNode, C44228kz0.m28075b(j));
                                if ((m6925f || layoutNode.m99789a0()) && Intrinsics.areEqual(layoutNode.m99820K0(), Boolean.TRUE)) {
                                    layoutNode.m99815N0();
                                }
                                if (layoutNode.m99794Y() && layoutNode.mo8156n()) {
                                    layoutNode.m99778f1();
                                    this.f115883d.m43881c(layoutNode);
                                }
                                this.f115882c = false;
                                C36403Um2 c36403Um2 = this.f115888i;
                                if (c36403Um2 != null) {
                                    c36403Um2.m80882a();
                                }
                            } catch (Throwable th) {
                                this.f115882c = false;
                                throw th;
                            }
                        }
                        m6928c();
                        return;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: n */
    public final void m6917n() {
        if (this.f115880a.m99822J0()) {
            if (this.f115880a.mo8156n()) {
                if (!this.f115882c) {
                    if (this.f115887h != null) {
                        this.f115882c = true;
                        try {
                            m6915p(this.f115880a);
                            this.f115882c = false;
                            C36403Um2 c36403Um2 = this.f115888i;
                            if (c36403Um2 != null) {
                                c36403Um2.m80882a();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            this.f115882c = false;
                            throw th;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: o */
    public final void m6916o(C33829Jm2 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f115881b.m14895f(node);
    }

    /* renamed from: p */
    public final void m6915p(C33829Jm2 c33829Jm2) {
        m6912s(c33829Jm2);
        LX2<C33829Jm2> m99736w0 = c33829Jm2.m99736w0();
        int m96690u = m99736w0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99736w0.m96691s();
            int i = 0;
            do {
                C33829Jm2 c33829Jm22 = m96691s[i];
                if (m6920k(c33829Jm22)) {
                    m6915p(c33829Jm22);
                }
                i++;
            } while (i < m96690u);
            m6912s(c33829Jm2);
        }
        m6912s(c33829Jm2);
    }

    /* renamed from: q */
    public final void m6914q(InterfaceC43181jD3.InterfaceC24738b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f115884e.m96701b(listener);
    }

    /* renamed from: r */
    public final boolean m6913r(C33829Jm2 c33829Jm2) {
        C44228kz0 c44228kz0;
        boolean z;
        boolean m6924g;
        int i = 0;
        if (!c33829Jm2.mo8156n() && !m6922i(c33829Jm2) && !Intrinsics.areEqual(c33829Jm2.m99820K0(), Boolean.TRUE) && !m6921j(c33829Jm2) && !c33829Jm2.m99827H()) {
            return false;
        }
        if (!c33829Jm2.m99787b0() && !c33829Jm2.m99777g0()) {
            m6924g = false;
            z = false;
        } else {
            if (c33829Jm2 == this.f115880a) {
                c44228kz0 = this.f115887h;
                Intrinsics.checkNotNull(c44228kz0);
            } else {
                c44228kz0 = null;
            }
            if (c33829Jm2.m99787b0()) {
                z = m6925f(c33829Jm2, c44228kz0);
            } else {
                z = false;
            }
            m6924g = m6924g(c33829Jm2, c44228kz0);
        }
        if ((z || c33829Jm2.m99789a0()) && Intrinsics.areEqual(c33829Jm2.m99820K0(), Boolean.TRUE)) {
            c33829Jm2.m99815N0();
        }
        if (c33829Jm2.m99794Y() && c33829Jm2.mo8156n()) {
            if (c33829Jm2 == this.f115880a) {
                c33829Jm2.m99791Z0(0, 0);
            } else {
                c33829Jm2.m99778f1();
            }
            this.f115883d.m43881c(c33829Jm2);
            C36403Um2 c36403Um2 = this.f115888i;
            if (c36403Um2 != null) {
                c36403Um2.m80882a();
            }
        }
        if (this.f115886g.m96687x()) {
            LX2<C29867a> lx2 = this.f115886g;
            int m96690u = lx2.m96690u();
            if (m96690u > 0) {
                C29867a[] m96691s = lx2.m96691s();
                do {
                    C29867a c29867a = m96691s[i];
                    if (c29867a.m6904a().m99822J0()) {
                        if (!c29867a.m6902c()) {
                            m6933A(c29867a.m6904a(), c29867a.m6903b());
                        } else {
                            m6909v(c29867a.m6904a(), c29867a.m6903b());
                        }
                    }
                    i++;
                } while (i < m96690u);
                this.f115886g.m96696h();
            } else {
                this.f115886g.m96696h();
            }
        }
        return m6924g;
    }

    /* renamed from: s */
    public final void m6912s(C33829Jm2 c33829Jm2) {
        C44228kz0 c44228kz0;
        if (!c33829Jm2.m99777g0() && !c33829Jm2.m99787b0()) {
            return;
        }
        if (c33829Jm2 == this.f115880a) {
            c44228kz0 = this.f115887h;
            Intrinsics.checkNotNull(c44228kz0);
        } else {
            c44228kz0 = null;
        }
        if (c33829Jm2.m99787b0()) {
            m6925f(c33829Jm2, c44228kz0);
        }
        m6924g(c33829Jm2, c44228kz0);
    }

    /* renamed from: t */
    public final boolean m6911t(C33829Jm2 layoutNode, boolean z) {
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = C29868b.$EnumSwitchMapping$0[layoutNode.m99792Z().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.m99787b0() || layoutNode.m99789a0()) && !z) {
                C36403Um2 c36403Um2 = this.f115888i;
                if (c36403Um2 != null) {
                    c36403Um2.m80882a();
                }
            } else {
                layoutNode.m99811P0();
                layoutNode.m99813O0();
                if (Intrinsics.areEqual(layoutNode.m99820K0(), Boolean.TRUE)) {
                    C33829Jm2 m99756p0 = layoutNode.m99756p0();
                    if (m99756p0 != null && m99756p0.m99787b0()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (m99756p0 != null && m99756p0.m99789a0()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            this.f115881b.m14900a(layoutNode);
                        }
                    }
                }
                if (!this.f115882c) {
                    return true;
                }
            }
            return false;
        }
        C36403Um2 c36403Um22 = this.f115888i;
        if (c36403Um22 != null) {
            c36403Um22.m80882a();
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m6909v(C33829Jm2 layoutNode, boolean z) {
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (layoutNode.m99781e0() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i = C29868b.$EnumSwitchMapping$0[layoutNode.m99792Z().ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    if (i == 5) {
                        if (!layoutNode.m99787b0() || z) {
                            layoutNode.m99809Q0();
                            layoutNode.m99807R0();
                            if (Intrinsics.areEqual(layoutNode.m99820K0(), Boolean.TRUE) || m6921j(layoutNode)) {
                                C33829Jm2 m99756p0 = layoutNode.m99756p0();
                                if (m99756p0 != null && m99756p0.m99787b0()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    this.f115881b.m14900a(layoutNode);
                                }
                            }
                            if (!this.f115882c) {
                                return true;
                            }
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    this.f115886g.m96701b(new C29867a(layoutNode, true, z));
                    C36403Um2 c36403Um2 = this.f115888i;
                    if (c36403Um2 != null) {
                        c36403Um2.m80882a();
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }

    /* renamed from: x */
    public final void m6907x(C33829Jm2 layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f115883d.m43881c(layoutNode);
    }

    /* renamed from: y */
    public final boolean m6906y(C33829Jm2 layoutNode, boolean z) {
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = C29868b.$EnumSwitchMapping$0[layoutNode.m99792Z().ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            if (i == 5) {
                if (!z && (layoutNode.m99777g0() || layoutNode.m99794Y())) {
                    C36403Um2 c36403Um2 = this.f115888i;
                    if (c36403Um2 != null) {
                        c36403Um2.m80882a();
                    }
                } else {
                    layoutNode.m99813O0();
                    if (layoutNode.mo8156n()) {
                        C33829Jm2 m99756p0 = layoutNode.m99756p0();
                        if (m99756p0 != null && m99756p0.m99794Y()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            if (m99756p0 != null && m99756p0.m99777g0()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                this.f115881b.m14900a(layoutNode);
                            }
                        }
                    }
                    if (!this.f115882c) {
                        return true;
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            C36403Um2 c36403Um22 = this.f115888i;
            if (c36403Um22 != null) {
                c36403Um22.m80882a();
            }
        }
        return false;
    }
}
