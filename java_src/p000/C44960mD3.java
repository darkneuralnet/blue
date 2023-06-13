package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B0\u0012'\u0010(\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b)\u0010*J/\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\f\u0010\nJC\u0010\u0012\u001a\u00020\u0007\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001bR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001b¨\u0006+"}, m28432d2 = {"LmD3;", "", "LJm2;", "node", "", "affectsLookahead", "Lkotlin/Function0;", "", "block", DateTokenConverter.CONVERTER_KEY, "(LJm2;ZLkotlin/jvm/functions/Function0;)V", "b", "f", "LlD3;", "T", "target", "Lkotlin/Function1;", "onChanged", "h", "(LlD3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", C17296a.f69688o, "()V", "i", "j", "LQM5;", "LQM5;", "observer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLookaheadMeasure", "c", "onCommitAffectingMeasure", "onCommitAffectingLayout", "e", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "g", "onCommitAffectingLookaheadLayout", "Lkotlin/ParameterName;", "name", "callback", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mD3 */
/* loaded from: classes.dex */
public final class C44960mD3 {

    /* renamed from: a */
    public final QM5 f97618a;

    /* renamed from: b */
    public final Function1<C33829Jm2, Unit> f97619b;

    /* renamed from: c */
    public final Function1<C33829Jm2, Unit> f97620c;

    /* renamed from: d */
    public final Function1<C33829Jm2, Unit> f97621d;

    /* renamed from: e */
    public final Function1<C33829Jm2, Unit> f97622e;

    /* renamed from: f */
    public final Function1<C33829Jm2, Unit> f97623f;

    /* renamed from: g */
    public final Function1<C33829Jm2, Unit> f97624g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mD3$a */
    /* loaded from: classes.dex */
    public static final class C25987a extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: g */
        public static final C25987a f97625g = new C25987a();

        public C25987a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!((InterfaceC44367lD3) it).mo14142L());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "layoutNode", "", C17296a.f69688o, "(LJm2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mD3$b */
    /* loaded from: classes.dex */
    public static final class C25988b extends Lambda implements Function1<C33829Jm2, Unit> {

        /* renamed from: g */
        public static final C25988b f97626g = new C25988b();

        public C25988b() {
            super(1);
        }

        /* renamed from: a */
        public final void m26007a(C33829Jm2 layoutNode) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            if (layoutNode.mo14142L()) {
                C33829Jm2.m99765l1(layoutNode, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2) {
            m26007a(c33829Jm2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "layoutNode", "", C17296a.f69688o, "(LJm2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mD3$c */
    /* loaded from: classes.dex */
    public static final class C25989c extends Lambda implements Function1<C33829Jm2, Unit> {

        /* renamed from: g */
        public static final C25989c f97627g = new C25989c();

        public C25989c() {
            super(1);
        }

        /* renamed from: a */
        public final void m26006a(C33829Jm2 layoutNode) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            if (layoutNode.mo14142L()) {
                C33829Jm2.m99765l1(layoutNode, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2) {
            m26006a(c33829Jm2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "layoutNode", "", C17296a.f69688o, "(LJm2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mD3$d */
    /* loaded from: classes.dex */
    public static final class C25990d extends Lambda implements Function1<C33829Jm2, Unit> {

        /* renamed from: g */
        public static final C25990d f97628g = new C25990d();

        public C25990d() {
            super(1);
        }

        /* renamed from: a */
        public final void m26005a(C33829Jm2 layoutNode) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            if (layoutNode.mo14142L()) {
                C33829Jm2.m99774h1(layoutNode, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2) {
            m26005a(c33829Jm2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "layoutNode", "", C17296a.f69688o, "(LJm2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mD3$e */
    /* loaded from: classes.dex */
    public static final class C25991e extends Lambda implements Function1<C33829Jm2, Unit> {

        /* renamed from: g */
        public static final C25991e f97629g = new C25991e();

        public C25991e() {
            super(1);
        }

        /* renamed from: a */
        public final void m26004a(C33829Jm2 layoutNode) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            if (layoutNode.mo14142L()) {
                C33829Jm2.m99774h1(layoutNode, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2) {
            m26004a(c33829Jm2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "layoutNode", "", C17296a.f69688o, "(LJm2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mD3$f */
    /* loaded from: classes.dex */
    public static final class C25992f extends Lambda implements Function1<C33829Jm2, Unit> {

        /* renamed from: g */
        public static final C25992f f97630g = new C25992f();

        public C25992f() {
            super(1);
        }

        /* renamed from: a */
        public final void m26003a(C33829Jm2 layoutNode) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            if (layoutNode.mo14142L()) {
                C33829Jm2.m99770j1(layoutNode, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2) {
            m26003a(c33829Jm2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "layoutNode", "", C17296a.f69688o, "(LJm2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mD3$g */
    /* loaded from: classes.dex */
    public static final class C25993g extends Lambda implements Function1<C33829Jm2, Unit> {

        /* renamed from: g */
        public static final C25993g f97631g = new C25993g();

        public C25993g() {
            super(1);
        }

        /* renamed from: a */
        public final void m26002a(C33829Jm2 layoutNode) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            if (layoutNode.mo14142L()) {
                C33829Jm2.m99761n1(layoutNode, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2) {
            m26002a(c33829Jm2);
            return Unit.INSTANCE;
        }
    }

    public C44960mD3(Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.f97618a = new QM5(onChangedExecutor);
        this.f97619b = C25992f.f97630g;
        this.f97620c = C25993g.f97631g;
        this.f97621d = C25988b.f97626g;
        this.f97622e = C25989c.f97627g;
        this.f97623f = C25990d.f97628g;
        this.f97624g = C25991e.f97629g;
    }

    /* renamed from: c */
    public static /* synthetic */ void m26015c(C44960mD3 c44960mD3, C33829Jm2 c33829Jm2, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c44960mD3.m26016b(c33829Jm2, z, function0);
    }

    /* renamed from: e */
    public static /* synthetic */ void m26013e(C44960mD3 c44960mD3, C33829Jm2 c33829Jm2, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c44960mD3.m26014d(c33829Jm2, z, function0);
    }

    /* renamed from: g */
    public static /* synthetic */ void m26011g(C44960mD3 c44960mD3, C33829Jm2 c33829Jm2, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c44960mD3.m26012f(c33829Jm2, z, function0);
    }

    /* renamed from: a */
    public final void m26017a() {
        this.f97618a.m88625l(C25987a.f97625g);
    }

    /* renamed from: b */
    public final void m26016b(C33829Jm2 node, boolean z, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        if (z && node.m99781e0() != null) {
            m26010h(node, this.f97623f, block);
        } else {
            m26010h(node, this.f97622e, block);
        }
    }

    /* renamed from: d */
    public final void m26014d(C33829Jm2 node, boolean z, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        if (z && node.m99781e0() != null) {
            m26010h(node, this.f97624g, block);
        } else {
            m26010h(node, this.f97621d, block);
        }
    }

    /* renamed from: f */
    public final void m26012f(C33829Jm2 node, boolean z, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        if (z && node.m99781e0() != null) {
            m26010h(node, this.f97619b, block);
        } else {
            m26010h(node, this.f97620c, block);
        }
    }

    /* renamed from: h */
    public final <T extends InterfaceC44367lD3> void m26010h(T target, Function1<? super T, Unit> onChanged, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f97618a.m88622o(target, onChanged, block);
    }

    /* renamed from: i */
    public final void m26009i() {
        this.f97618a.m88618s();
    }

    /* renamed from: j */
    public final void m26008j() {
        this.f97618a.m88617t();
        this.f97618a.m88626k();
    }
}
