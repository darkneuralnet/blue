package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.G83;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001:\u0002/5B\u000f\u0012\u0006\u00103\u001a\u00020.¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J0\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J<\u0010\u0011\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J \u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"J\u0006\u0010#\u001a\u00020\u0002J\u000f\u0010$\u001a\u00020\u0002H\u0000¢\u0006\u0004\b$\u0010\"J!\u0010(\u001a\u00020'2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020\u000eH\u0000¢\u0006\u0004\b+\u0010)J\b\u0010-\u001a\u00020,H\u0016R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00108\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u001e\u00107R$\u0010?\u001a\u0002092\u0006\u0010:\u001a\u0002098\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR$\u0010F\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010GR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010GR\u001c\u0010K\u001a\b\u0018\u00010\fR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010JR\u0014\u0010N\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Q"}, m28432d2 = {"LF83;", "", "", "s", "y", "x", "LgV2$c;", "tail", "LLX2;", "LgV2$b;", "before", "after", "LF83$a;", "k", "", "beforeSize", "afterSize", "w", "prev", "next", "u", "node", "i", "t", "element", "child", "g", "r", "A", "LgV2;", "m", "z", "(LgV2;)V", "v", "()V", "f", "h", "LK83;", "type", "", "q", "(I)Z", "mask", "p", "", "toString", "LJm2;", C17296a.f69688o, "LJm2;", "getLayoutNode", "()LJm2;", "layoutNode", "LN22;", "b", "LN22;", "()LN22;", "innerCoordinator", "LH83;", "<set-?>", "c", "LH83;", "n", "()LH83;", "outerCoordinator", DateTokenConverter.CONVERTER_KEY, "LgV2$c;", "o", "()LgV2$c;", "e", "l", "head", "LLX2;", "current", "buffer", "LF83$a;", "cachedDiffer", "j", "()I", "aggregateChildKindSet", "<init>", "(LJm2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,751:1\n633#1,6:763\n641#1,3:770\n644#1,3:776\n664#1,6:779\n610#1,8:785\n633#1,3:793\n618#1,2:796\n611#1,12:798\n636#1,3:810\n623#1:813\n613#1:814\n616#1,2:815\n633#1,3:817\n618#1,5:820\n636#1,3:825\n623#1:828\n633#1,6:829\n655#1,15:835\n664#1,6:850\n649#1,21:856\n610#1,8:877\n633#1,3:885\n618#1,2:888\n611#1,12:890\n636#1,3:902\n623#1:905\n613#1:906\n641#1,6:907\n1162#2:752\n1182#2:753\n1161#2,2:754\n1162#2:769\n523#3:756\n523#3:757\n523#3:758\n523#3:759\n523#3:773\n728#3,2:774\n1#4:760\n69#5:761\n196#6:762\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n268#1:763,6\n295#1:770,3\n295#1:776,3\n306#1:779,6\n603#1:785,8\n603#1:793,3\n603#1:796,2\n603#1:798,12\n603#1:810,3\n603#1:813\n603#1:814\n610#1:815,2\n610#1:817,3\n610#1:820,5\n610#1:825,3\n610#1:828\n617#1:829,6\n649#1:835,15\n656#1:850,6\n672#1:856,21\n679#1:877,8\n679#1:885,3\n679#1:888,2\n679#1:890,12\n679#1:902,3\n679#1:905\n679#1:906\n695#1:907,6\n100#1:752\n101#1:753\n101#1:754,2\n293#1:769\n112#1:756\n113#1:757\n175#1:758\n190#1:759\n297#1:773\n297#1:774,2\n243#1:761\n243#1:762\n*E\n"})
/* renamed from: F83 */
/* loaded from: classes.dex */
public final class F83 {

    /* renamed from: a */
    public final C33829Jm2 f8825a;

    /* renamed from: b */
    public final N22 f8826b;

    /* renamed from: c */
    public H83 f8827c;

    /* renamed from: d */
    public final InterfaceC41563gV2.AbstractC20914c f8828d;

    /* renamed from: e */
    public InterfaceC41563gV2.AbstractC20914c f8829e;

    /* renamed from: f */
    public LX2<InterfaceC41563gV2.InterfaceC20913b> f8830f;

    /* renamed from: g */
    public LX2<InterfaceC41563gV2.InterfaceC20913b> f8831g;

    /* renamed from: h */
    public C2173a f8832h;

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b!\u0010\u001f¨\u0006&"}, m28432d2 = {"LF83$a;", "LL31;", "", "oldIndex", "newIndex", "", C17296a.f69688o, "atIndex", "", "b", "remove", "c", "LgV2$c;", "LgV2$c;", "getNode", "()LgV2$c;", "g", "(LgV2$c;)V", "node", "I", "getAggregateChildKindSet", "()I", "e", "(I)V", "aggregateChildKindSet", "LLX2;", "LgV2$b;", "LLX2;", "getBefore", "()LLX2;", "f", "(LLX2;)V", "before", DateTokenConverter.CONVERTER_KEY, "getAfter", "after", "<init>", "(LF83;LgV2$c;ILLX2;LLX2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,751:1\n523#2:752\n523#2:753\n523#2:754\n523#2:755\n523#2:756\n523#2:757\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n348#1:752\n353#1:753\n356#1:754\n363#1:755\n369#1:756\n370#1:757\n*E\n"})
    /* renamed from: F83$a */
    /* loaded from: classes.dex */
    public final class C2173a implements L31 {

        /* renamed from: a */
        public InterfaceC41563gV2.AbstractC20914c f8833a;

        /* renamed from: b */
        public int f8834b;

        /* renamed from: c */
        public LX2<InterfaceC41563gV2.InterfaceC20913b> f8835c;

        /* renamed from: d */
        public LX2<InterfaceC41563gV2.InterfaceC20913b> f8836d;

        /* renamed from: e */
        public final /* synthetic */ F83 f8837e;

        public C2173a(F83 f83, InterfaceC41563gV2.AbstractC20914c node, int i, LX2<InterfaceC41563gV2.InterfaceC20913b> before, LX2<InterfaceC41563gV2.InterfaceC20913b> after) {
            Intrinsics.checkNotNullParameter(node, "node");
            Intrinsics.checkNotNullParameter(before, "before");
            Intrinsics.checkNotNullParameter(after, "after");
            this.f8837e = f83;
            this.f8833a = node;
            this.f8834b = i;
            this.f8835c = before;
            this.f8836d = after;
        }

        @Override // p000.L31
        /* renamed from: a */
        public boolean mo97896a(int i, int i2) {
            if (G83.m105708d(this.f8835c.m96691s()[i], this.f8836d.m96691s()[i2]) != 0) {
                return true;
            }
            return false;
        }

        @Override // p000.L31
        /* renamed from: b */
        public void mo97895b(int i, int i2) {
            InterfaceC41563gV2.AbstractC20914c m107682g = this.f8837e.m107682g(this.f8836d.m96691s()[i2], this.f8833a);
            this.f8833a = m107682g;
            if (!m107682g.m39254Q()) {
                this.f8833a.m39249X(true);
                this.f8837e.getClass();
                int m39258M = this.f8834b | this.f8833a.m39258M();
                this.f8834b = m39258M;
                this.f8833a.m39251V(m39258M);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        @Override // p000.L31
        /* renamed from: c */
        public void mo97894c(int i, int i2) {
            InterfaceC41563gV2.AbstractC20914c m39256O = this.f8833a.m39256O();
            Intrinsics.checkNotNull(m39256O);
            this.f8833a = m39256O;
            InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f8835c.m96691s()[i];
            InterfaceC41563gV2.InterfaceC20913b interfaceC20913b2 = this.f8836d.m96691s()[i2];
            if (!Intrinsics.areEqual(interfaceC20913b, interfaceC20913b2)) {
                this.f8833a = this.f8837e.m107689A(interfaceC20913b, interfaceC20913b2, this.f8833a);
                this.f8837e.getClass();
            } else {
                this.f8837e.getClass();
            }
            int m39258M = this.f8834b | this.f8833a.m39258M();
            this.f8834b = m39258M;
            this.f8833a.m39251V(m39258M);
        }

        /* renamed from: d */
        public final void m107662d(LX2<InterfaceC41563gV2.InterfaceC20913b> lx2) {
            Intrinsics.checkNotNullParameter(lx2, "<set-?>");
            this.f8836d = lx2;
        }

        /* renamed from: e */
        public final void m107661e(int i) {
            this.f8834b = i;
        }

        /* renamed from: f */
        public final void m107660f(LX2<InterfaceC41563gV2.InterfaceC20913b> lx2) {
            Intrinsics.checkNotNullParameter(lx2, "<set-?>");
            this.f8835c = lx2;
        }

        /* renamed from: g */
        public final void m107659g(InterfaceC41563gV2.AbstractC20914c abstractC20914c) {
            Intrinsics.checkNotNullParameter(abstractC20914c, "<set-?>");
            this.f8833a = abstractC20914c;
        }

        @Override // p000.L31
        public void remove(int i) {
            InterfaceC41563gV2.AbstractC20914c m39256O = this.f8833a.m39256O();
            Intrinsics.checkNotNull(m39256O);
            this.f8833a = m39256O;
            this.f8837e.getClass();
            this.f8833a = this.f8837e.m107680i(this.f8833a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m28432d2 = {"LF83$b;", "", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: F83$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2174b {
    }

    public F83(C33829Jm2 layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f8825a = layoutNode;
        N22 n22 = new N22(layoutNode);
        this.f8826b = n22;
        this.f8827c = n22;
        InterfaceC41563gV2.AbstractC20914c mo94436h2 = n22.mo94436h2();
        this.f8828d = mo94436h2;
        this.f8829e = mo94436h2;
    }

    /* renamed from: A */
    public final InterfaceC41563gV2.AbstractC20914c m107689A(InterfaceC41563gV2.InterfaceC20913b interfaceC20913b, InterfaceC41563gV2.InterfaceC20913b interfaceC20913b2, InterfaceC41563gV2.AbstractC20914c abstractC20914c) {
        InterfaceC41563gV2.AbstractC20914c m105706f;
        if ((interfaceC20913b instanceof AbstractC48086rV2) && (interfaceC20913b2 instanceof AbstractC48086rV2)) {
            AbstractC48086rV2 abstractC48086rV2 = (AbstractC48086rV2) interfaceC20913b2;
            m105706f = G83.m105706f(abstractC48086rV2, abstractC20914c);
            if (m105706f != abstractC20914c) {
                if (!m105706f.m39254Q()) {
                    m105706f.m39249X(true);
                    if (abstractC20914c.m39254Q()) {
                        L83.m97665c(abstractC20914c);
                        abstractC20914c.m39263E();
                    }
                    return m107668u(abstractC20914c, m105706f);
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            if (abstractC48086rV2.mo15843b()) {
                if (m105706f.m39254Q()) {
                    L83.m97664d(m105706f);
                } else {
                    m105706f.m39245b0(true);
                }
            }
            return m105706f;
        } else if (abstractC20914c instanceof C25040jw) {
            ((C25040jw) abstractC20914c).m29730j0(interfaceC20913b2);
            if (abstractC20914c.m39254Q()) {
                L83.m97664d(abstractC20914c);
            } else {
                abstractC20914c.m39245b0(true);
            }
            return abstractC20914c;
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
    }

    /* renamed from: f */
    public final void m107683f() {
        for (InterfaceC41563gV2.AbstractC20914c m107677l = m107677l(); m107677l != null; m107677l = m107677l.m39261I()) {
            if (!m107677l.m39254Q()) {
                m107677l.m39242z();
                if (m107677l.m39259K()) {
                    L83.m97667a(m107677l);
                }
                if (m107677l.m39255P()) {
                    L83.m97664d(m107677l);
                }
                m107677l.m39249X(false);
                m107677l.m39245b0(false);
            }
        }
    }

    /* renamed from: g */
    public final InterfaceC41563gV2.AbstractC20914c m107682g(InterfaceC41563gV2.InterfaceC20913b interfaceC20913b, InterfaceC41563gV2.AbstractC20914c abstractC20914c) {
        InterfaceC41563gV2.AbstractC20914c c25040jw;
        if (interfaceC20913b instanceof AbstractC48086rV2) {
            c25040jw = ((AbstractC48086rV2) interfaceC20913b).mo15844a();
            c25040jw.m39248Y(L83.m97662f(c25040jw));
        } else {
            c25040jw = new C25040jw(interfaceC20913b);
        }
        if (!c25040jw.m39254Q()) {
            c25040jw.m39249X(true);
            return m107671r(c25040jw, abstractC20914c);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: h */
    public final void m107681h() {
        for (InterfaceC41563gV2.AbstractC20914c m107674o = m107674o(); m107674o != null; m107674o = m107674o.m39256O()) {
            if (m107674o.m39254Q()) {
                m107674o.m39263E();
            }
        }
    }

    /* renamed from: i */
    public final InterfaceC41563gV2.AbstractC20914c m107680i(InterfaceC41563gV2.AbstractC20914c abstractC20914c) {
        if (abstractC20914c.m39254Q()) {
            L83.m97665c(abstractC20914c);
            abstractC20914c.m39263E();
        }
        return m107669t(abstractC20914c);
    }

    /* renamed from: j */
    public final int m107679j() {
        return this.f8829e.m39262G();
    }

    /* renamed from: k */
    public final C2173a m107678k(InterfaceC41563gV2.AbstractC20914c abstractC20914c, LX2<InterfaceC41563gV2.InterfaceC20913b> lx2, LX2<InterfaceC41563gV2.InterfaceC20913b> lx22) {
        C2173a c2173a = this.f8832h;
        if (c2173a == null) {
            C2173a c2173a2 = new C2173a(this, abstractC20914c, abstractC20914c.m39262G(), lx2, lx22);
            this.f8832h = c2173a2;
            return c2173a2;
        }
        c2173a.m107659g(abstractC20914c);
        c2173a.m107661e(abstractC20914c.m39262G());
        c2173a.m107660f(lx2);
        c2173a.m107662d(lx22);
        return c2173a;
    }

    /* renamed from: l */
    public final InterfaceC41563gV2.AbstractC20914c m107677l() {
        return this.f8829e;
    }

    /* renamed from: m */
    public final N22 m107676m() {
        return this.f8826b;
    }

    /* renamed from: n */
    public final H83 m107675n() {
        return this.f8827c;
    }

    /* renamed from: o */
    public final InterfaceC41563gV2.AbstractC20914c m107674o() {
        return this.f8828d;
    }

    /* renamed from: p */
    public final boolean m107673p(int i) {
        return (i & m107679j()) != 0;
    }

    /* renamed from: q */
    public final boolean m107672q(int i) {
        return (i & m107679j()) != 0;
    }

    /* renamed from: r */
    public final InterfaceC41563gV2.AbstractC20914c m107671r(InterfaceC41563gV2.AbstractC20914c abstractC20914c, InterfaceC41563gV2.AbstractC20914c abstractC20914c2) {
        InterfaceC41563gV2.AbstractC20914c m39256O = abstractC20914c2.m39256O();
        if (m39256O != null) {
            m39256O.m39250W(abstractC20914c);
            abstractC20914c.m39246a0(m39256O);
        }
        abstractC20914c2.m39246a0(abstractC20914c);
        abstractC20914c.m39250W(abstractC20914c2);
        return abstractC20914c;
    }

    /* renamed from: s */
    public final void m107670s() {
        G83.C2673a c2673a;
        boolean z;
        G83.C2673a c2673a2;
        G83.C2673a c2673a3;
        G83.C2673a c2673a4;
        InterfaceC41563gV2.AbstractC20914c abstractC20914c = this.f8829e;
        c2673a = G83.f11042a;
        if (abstractC20914c != c2673a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            InterfaceC41563gV2.AbstractC20914c abstractC20914c2 = this.f8829e;
            c2673a2 = G83.f11042a;
            abstractC20914c2.m39246a0(c2673a2);
            c2673a3 = G83.f11042a;
            c2673a3.m39250W(abstractC20914c2);
            c2673a4 = G83.f11042a;
            this.f8829e = c2673a4;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: t */
    public final InterfaceC41563gV2.AbstractC20914c m107669t(InterfaceC41563gV2.AbstractC20914c abstractC20914c) {
        InterfaceC41563gV2.AbstractC20914c m39261I = abstractC20914c.m39261I();
        InterfaceC41563gV2.AbstractC20914c m39256O = abstractC20914c.m39256O();
        if (m39261I != null) {
            m39261I.m39246a0(m39256O);
            abstractC20914c.m39250W(null);
        }
        if (m39256O != null) {
            m39256O.m39250W(m39261I);
            abstractC20914c.m39246a0(null);
        }
        Intrinsics.checkNotNull(m39261I);
        return m39261I;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.f8829e == this.f8828d) {
            sb.append("]");
        } else {
            InterfaceC41563gV2.AbstractC20914c m107677l = m107677l();
            while (true) {
                if (m107677l == null || m107677l == m107674o()) {
                    break;
                }
                sb.append(String.valueOf(m107677l));
                if (m107677l.m39261I() == this.f8828d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                m107677l = m107677l.m39261I();
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: u */
    public final InterfaceC41563gV2.AbstractC20914c m107668u(InterfaceC41563gV2.AbstractC20914c abstractC20914c, InterfaceC41563gV2.AbstractC20914c abstractC20914c2) {
        InterfaceC41563gV2.AbstractC20914c m39256O = abstractC20914c.m39256O();
        if (m39256O != null) {
            abstractC20914c2.m39246a0(m39256O);
            m39256O.m39250W(abstractC20914c2);
            abstractC20914c.m39246a0(null);
        }
        InterfaceC41563gV2.AbstractC20914c m39261I = abstractC20914c.m39261I();
        if (m39261I != null) {
            abstractC20914c2.m39250W(m39261I);
            m39261I.m39246a0(abstractC20914c2);
            abstractC20914c.m39250W(null);
        }
        abstractC20914c2.m39243d0(abstractC20914c.m39260J());
        return abstractC20914c2;
    }

    /* renamed from: v */
    public final void m107667v() {
        LX2<InterfaceC41563gV2.InterfaceC20913b> lx2 = this.f8830f;
        if (lx2 == null) {
            return;
        }
        int m96690u = lx2.m96690u();
        InterfaceC41563gV2.AbstractC20914c m39256O = this.f8828d.m39256O();
        for (int i = m96690u - 1; m39256O != null && i >= 0; i--) {
            if (m39256O.m39254Q()) {
                m39256O.m39252U();
                m39256O.m39263E();
            }
            m39256O = m39256O.m39256O();
        }
    }

    /* renamed from: w */
    public final void m107666w(LX2<InterfaceC41563gV2.InterfaceC20913b> lx2, int i, LX2<InterfaceC41563gV2.InterfaceC20913b> lx22, int i2, InterfaceC41563gV2.AbstractC20914c abstractC20914c) {
        C39812dY2.m44175e(i, i2, m107678k(abstractC20914c, lx2, lx22));
    }

    /* renamed from: x */
    public final void m107665x() {
        H83 h83;
        boolean z;
        C32659Em2 c32659Em2;
        H83 h832 = this.f8826b;
        for (InterfaceC41563gV2.AbstractC20914c m39256O = this.f8828d.m39256O(); m39256O != null; m39256O = m39256O.m39256O()) {
            if ((K83.m99169a(2) & m39256O.m39258M()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (m39256O instanceof InterfaceC32425Dm2)) {
                if (m39256O.m39260J() != null) {
                    H83 m39260J = m39256O.m39260J();
                    Intrinsics.checkNotNull(m39260J, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    c32659Em2 = (C32659Em2) m39260J;
                    InterfaceC32425Dm2 m108392W2 = c32659Em2.m108392W2();
                    c32659Em2.m108390Y2((InterfaceC32425Dm2) m39256O);
                    if (m108392W2 != m39256O) {
                        c32659Em2.mo104294z2();
                    }
                } else {
                    c32659Em2 = new C32659Em2(this.f8825a, (InterfaceC32425Dm2) m39256O);
                    m39256O.m39243d0(c32659Em2);
                }
                h832.m104341L2(c32659Em2);
                c32659Em2.m104343K2(h832);
                h832 = c32659Em2;
            } else {
                m39256O.m39243d0(h832);
            }
        }
        C33829Jm2 m99756p0 = this.f8825a.m99756p0();
        if (m99756p0 != null) {
            h83 = m99756p0.m99806S();
        } else {
            h83 = null;
        }
        h832.m104341L2(h83);
        this.f8827c = h832;
    }

    /* renamed from: y */
    public final void m107664y() {
        G83.C2673a c2673a;
        boolean z;
        G83.C2673a c2673a2;
        G83.C2673a c2673a3;
        G83.C2673a c2673a4;
        InterfaceC41563gV2.AbstractC20914c abstractC20914c = this.f8829e;
        c2673a = G83.f11042a;
        boolean z2 = true;
        if (abstractC20914c == c2673a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c2673a2 = G83.f11042a;
            InterfaceC41563gV2.AbstractC20914c m39261I = c2673a2.m39261I();
            if (m39261I == null) {
                m39261I = this.f8828d;
            }
            this.f8829e = m39261I;
            m39261I.m39246a0(null);
            c2673a3 = G83.f11042a;
            c2673a3.m39250W(null);
            InterfaceC41563gV2.AbstractC20914c abstractC20914c2 = this.f8829e;
            c2673a4 = G83.f11042a;
            if (abstractC20914c2 == c2673a4) {
                z2 = false;
            }
            if (z2) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m107663z(InterfaceC41563gV2 m) {
        LX2<InterfaceC41563gV2.InterfaceC20913b> m105707e;
        Intrinsics.checkNotNullParameter(m, "m");
        m107670s();
        LX2<InterfaceC41563gV2.InterfaceC20913b> lx2 = this.f8830f;
        int i = 0;
        if (lx2 == null) {
            lx2 = new LX2<>(new InterfaceC41563gV2.InterfaceC20913b[0], 0);
        }
        LX2<InterfaceC41563gV2.InterfaceC20913b> lx22 = this.f8831g;
        if (lx22 == null) {
            lx22 = new LX2<>(new InterfaceC41563gV2.InterfaceC20913b[16], 0);
        }
        m105707e = G83.m105707e(m, lx22);
        boolean z = true;
        if (m105707e.m96690u() == lx2.m96690u()) {
            int m96690u = lx2.m96690u();
            InterfaceC41563gV2.AbstractC20914c m39256O = this.f8828d.m39256O();
            int i2 = m96690u - 1;
            int i3 = 0;
            boolean z2 = false;
            while (true) {
                if (m39256O == null || i2 < 0) {
                    break;
                }
                InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = lx2.m96691s()[i2];
                InterfaceC41563gV2.InterfaceC20913b interfaceC20913b2 = m105707e.m96691s()[i2];
                int m105708d = G83.m105708d(interfaceC20913b, interfaceC20913b2);
                if (m105708d != 0) {
                    if (m105708d == 1) {
                        m39256O = m107689A(interfaceC20913b, interfaceC20913b2, m39256O);
                    }
                    if (!m39256O.m39254Q()) {
                        z2 = true;
                    }
                    i3 |= m39256O.m39258M();
                    m39256O.m39251V(i3);
                    m39256O = m39256O.m39256O();
                    i2--;
                } else {
                    i2++;
                    m39256O = m39256O.m39261I();
                    break;
                }
            }
            int i4 = i2;
            InterfaceC41563gV2.AbstractC20914c abstractC20914c = m39256O;
            if (i4 > 0) {
                if (abstractC20914c != null) {
                    i = 1;
                }
                if (i != 0) {
                    m107666w(lx2, i4, m105707e, i4, abstractC20914c);
                    i = 1;
                    this.f8830f = m105707e;
                    lx2.m96696h();
                    this.f8831g = lx2;
                    m107664y();
                    if (i != 0) {
                        m107665x();
                    }
                    if (!z && this.f8825a.m99822J0()) {
                        m107683f();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            z = z2;
            this.f8830f = m105707e;
            lx2.m96696h();
            this.f8831g = lx2;
            m107664y();
            if (i != 0) {
            }
            if (!z) {
                return;
            }
            return;
        }
        if (lx2.m96690u() == 0) {
            InterfaceC41563gV2.AbstractC20914c abstractC20914c2 = this.f8828d;
            for (int m96690u2 = m105707e.m96690u() - 1; m96690u2 >= 0; m96690u2--) {
                abstractC20914c2 = m107682g(m105707e.m96691s()[m96690u2], abstractC20914c2);
                i |= abstractC20914c2.m39258M();
                abstractC20914c2.m39251V(i);
            }
        } else if (m105707e.m96690u() == 0) {
            int m96690u3 = lx2.m96690u() - 1;
            InterfaceC41563gV2.AbstractC20914c m39256O2 = this.f8828d.m39256O();
            while (m39256O2 != null && m96690u3 >= 0) {
                InterfaceC41563gV2.AbstractC20914c m39256O3 = m39256O2.m39256O();
                m107680i(m39256O2);
                m96690u3--;
                m39256O2 = m39256O3;
            }
            z = false;
            i = 1;
            this.f8830f = m105707e;
            lx2.m96696h();
            this.f8831g = lx2;
            m107664y();
            if (i != 0) {
            }
            if (!z) {
            }
        } else {
            m107666w(lx2, lx2.m96690u(), m105707e, m105707e.m96690u(), this.f8828d);
        }
        i = 1;
        this.f8830f = m105707e;
        lx2.m96696h();
        this.f8831g = lx2;
        m107664y();
        if (i != 0) {
        }
        if (!z) {
        }
    }
}
