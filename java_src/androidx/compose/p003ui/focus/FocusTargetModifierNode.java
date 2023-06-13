package androidx.compose.p003ui.focus;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u000bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u000f\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Lhe3;", "LmV2;", "LgV2$c;", "", "s", "T", "Landroidx/compose/ui/focus/e;", "e0", "()Landroidx/compose/ui/focus/e;", "i0", "()V", "j0", "LXv1;", "l", "LXv1;", "h0", "()LXv1;", "k0", "(LXv1;)V", "focusStateImpl", "LWv1;", "g0", "()LWv1;", "focusState", "LBG;", "f0", "()LBG;", "beyondBoundsLayoutParent", "<init>", "FocusTargetModifierElement", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusTargetModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetModifierNode.kt\nandroidx/compose/ui/focus/FocusTargetModifierNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,195:1\n89#2:196\n87#2:197\n87#2:208\n91#2:217\n87#2:218\n87#2:229\n47#3:198\n47#3:219\n78#4,9:199\n88#4,7:210\n78#4,9:220\n88#4,7:231\n196#5:209\n196#5:230\n*S KotlinDebug\n*F\n+ 1 FocusTargetModifierNode.kt\nandroidx/compose/ui/focus/FocusTargetModifierNode\n*L\n88#1:196\n88#1:197\n91#1:208\n174#1:217\n174#1:218\n175#1:229\n88#1:198\n174#1:219\n88#1:199,9\n88#1:210,7\n174#1:220,9\n174#1:231,7\n91#1:209\n175#1:230\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusTargetModifierNode */
/* loaded from: classes.dex */
public final class FocusTargetModifierNode extends InterfaceC41563gV2.AbstractC20914c implements InterfaceC42242he3, InterfaceC45121mV2 {

    /* renamed from: l */
    public EnumC37185Xv1 f52957l = EnumC37185Xv1.Inactive;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¨\u0006\u000e"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;", "LrV2;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "h", "node", "j", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.focus.FocusTargetModifierNode$FocusTargetModifierElement */
    /* loaded from: classes.dex */
    public static final class FocusTargetModifierElement extends AbstractC48086rV2<FocusTargetModifierNode> {

        /* renamed from: b */
        public static final FocusTargetModifierElement f52958b = new FocusTargetModifierElement();

        private FocusTargetModifierElement() {
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // p000.AbstractC48086rV2
        /* renamed from: h */
        public FocusTargetModifierNode mo15844a() {
            return new FocusTargetModifierNode();
        }

        public int hashCode() {
            return 1739042953;
        }

        @Override // p000.AbstractC48086rV2
        /* renamed from: j */
        public FocusTargetModifierNode mo15842g(FocusTargetModifierNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return node;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusTargetModifierNode$a */
    /* loaded from: classes.dex */
    public static final class C11296a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<InterfaceC11302e> f52959g;

        /* renamed from: h */
        public final /* synthetic */ FocusTargetModifierNode f52960h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11296a(Ref.ObjectRef<InterfaceC11302e> objectRef, FocusTargetModifierNode focusTargetModifierNode) {
            super(0);
            this.f52959g = objectRef;
            this.f52960h = focusTargetModifierNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.focus.e, T] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f52959g.element = this.f52960h.m68833e0();
        }
    }

    @Override // p000.InterfaceC41563gV2.AbstractC20914c
    /* renamed from: T */
    public void mo39253T() {
        boolean z;
        InterfaceC36951Wv1 m68831g0 = m68831g0();
        if (m68831g0 == EnumC37185Xv1.Active || m68831g0 == EnumC37185Xv1.Captured) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C51083wZ0.m6660i(this).mo31015B().mo68846n(true);
        } else if (m68831g0 == EnumC37185Xv1.ActiveParent) {
            m68828j0();
            this.f52957l = EnumC37185Xv1.Inactive;
        } else if (m68831g0 == EnumC37185Xv1.Inactive) {
            m68828j0();
        }
    }

    /* renamed from: e0 */
    public final InterfaceC11302e m68833e0() {
        F83 m99764m0;
        boolean z;
        C11305f c11305f = new C11305f();
        int m99169a = K83.m99169a(2048) | K83.m99169a(1024);
        if (mo8445r().m39254Q()) {
            InterfaceC41563gV2.AbstractC20914c m39256O = mo8445r().m39256O();
            C33829Jm2 m6661h = C51083wZ0.m6661h(this);
            while (m6661h != null) {
                if ((m6661h.m99764m0().m107677l().m39262G() & m99169a) != 0) {
                    while (m39256O != null) {
                        if ((m39256O.m39258M() & m99169a) != 0) {
                            if ((K83.m99169a(1024) & m39256O.m39258M()) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                return c11305f;
                            }
                            if (m39256O instanceof InterfaceC35781Rv1) {
                                ((InterfaceC35781Rv1) m39256O).mo29727m(c11305f);
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
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
            return c11305f;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: f0 */
    public final InterfaceC0587BG m68832f0() {
        return (InterfaceC0587BG) mo19176a(C0970CG.m112497a());
    }

    /* renamed from: g0 */
    public final InterfaceC36951Wv1 m68831g0() {
        return this.f52957l;
    }

    /* renamed from: h0 */
    public final EnumC37185Xv1 m68830h0() {
        return this.f52957l;
    }

    /* renamed from: i0 */
    public final void m68829i0() {
        boolean z;
        InterfaceC11302e interfaceC11302e;
        InterfaceC36951Wv1 m68831g0 = m68831g0();
        if (m68831g0 == EnumC37185Xv1.Active || m68831g0 == EnumC37185Xv1.Captured) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C42835ie3.m33645a(this, new C11296a(objectRef, this));
            Object obj = objectRef.element;
            if (obj == null) {
                Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
                interfaceC11302e = null;
            } else {
                interfaceC11302e = (InterfaceC11302e) obj;
            }
            if (!interfaceC11302e.mo68789h()) {
                C51083wZ0.m6660i(this).mo31015B().mo68846n(true);
            }
        } else if (m68831g0 != EnumC37185Xv1.ActiveParent) {
            EnumC37185Xv1 enumC37185Xv1 = EnumC37185Xv1.Active;
        }
    }

    /* renamed from: j0 */
    public final void m68828j0() {
        F83 m99764m0;
        boolean z;
        int m99169a = K83.m99169a(4096) | K83.m99169a(1024);
        if (mo8445r().m39254Q()) {
            InterfaceC41563gV2.AbstractC20914c m39256O = mo8445r().m39256O();
            C33829Jm2 m6661h = C51083wZ0.m6661h(this);
            while (m6661h != null) {
                if ((m6661h.m99764m0().m107677l().m39262G() & m99169a) != 0) {
                    while (m39256O != null) {
                        if ((m39256O.m39258M() & m99169a) != 0) {
                            if ((K83.m99169a(1024) & m39256O.m39258M()) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                continue;
                            } else if (m39256O instanceof InterfaceC50710vv1) {
                                C51083wZ0.m6660i(this).mo31015B().mo68855d((InterfaceC50710vv1) m39256O);
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
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
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: k0 */
    public final void m68827k0(EnumC37185Xv1 enumC37185Xv1) {
        Intrinsics.checkNotNullParameter(enumC37185Xv1, "<set-?>");
        this.f52957l = enumC37185Xv1;
    }

    @Override // p000.InterfaceC42242he3
    /* renamed from: s */
    public void mo36118s() {
        InterfaceC36951Wv1 m68831g0 = m68831g0();
        m68829i0();
        if (!Intrinsics.areEqual(m68831g0, m68831g0())) {
            C51303wv1.m6104b(this);
        }
    }
}
