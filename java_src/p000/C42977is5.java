package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\b\b\u0002\u0010*\u001a\u00020&¢\u0006\u0004\b\\\u0010]J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002J\u0016\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002J8\u0010\u0016\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010%\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b(\u0010)R\"\u0010.\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\"\u001a\u0004\b+\u0010$\"\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00106\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010<\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010$R\u0011\u0010B\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010F\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010J\u001a\u00020G8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010K\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\b2\u0010ER\u001a\u0010N\u001a\u00020L8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bM\u0010IR\u0011\u0010O\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\b8\u0010ER\u0014\u0010Q\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010$R\u0011\u0010S\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bR\u00105R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00000\t8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00000\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0013\u0010[\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bY\u0010Z\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006^"}, m28432d2 = {"Lis5;", "", "Lbs5;", "mergedConfig", "", "x", "", "includeReplacedSemantics", "includeFakeNodes", "", "i", "", "list", DateTokenConverter.CONVERTER_KEY, "unmergedChildren", C17296a.f69688o, "LCb5;", "role", "Lkotlin/Function1;", "Lss5;", "Lkotlin/ExtensionFunctionType;", "properties", "b", "(LCb5;Lkotlin/jvm/functions/Function1;)Lis5;", "y", "(Z)Ljava/util/List;", "LH83;", "c", "()LH83;", "Lgs5;", "Lgs5;", "n", "()Lgs5;", "outerSemanticsNode", "Z", "getMergingEnabled", "()Z", "mergingEnabled", "LJm2;", "LJm2;", "m", "()LJm2;", "layoutNode", "u", "setFake$ui_release", "(Z)V", "isFake", "e", "Lis5;", "fakeNodeParent", "f", "Lbs5;", "t", "()Lbs5;", "unmergedConfig", "", "g", "I", "k", "()I", "id", "v", "isMergingSemanticsOfDescendants", "Lvm2;", "l", "()Lvm2;", "layoutInfo", "LOs4;", "s", "()LOs4;", "touchBoundsInRoot", "LG52;", "r", "()J", "size", "boundsInRoot", "LCe3;", "p", "positionInRoot", "boundsInWindow", "w", "isTransparent", "j", "config", "h", "()Ljava/util/List;", "children", "q", "replacedChildren", "o", "()Lis5;", "parent", "<init>", "(Lgs5;ZLJm2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,436:1\n1#2:437\n33#3,6:438\n33#3,6:444\n33#3,6:450\n73#4:456\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n188#1:438,6\n211#1:444,6\n309#1:450,6\n331#1:456\n*E\n"})
/* renamed from: is5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42977is5 {

    /* renamed from: a */
    public final InterfaceC41791gs5 f91407a;

    /* renamed from: b */
    public final boolean f91408b;

    /* renamed from: c */
    public final C33829Jm2 f91409c;

    /* renamed from: d */
    public boolean f91410d;

    /* renamed from: e */
    public C42977is5 f91411e;

    /* renamed from: f */
    public final C38809bs5 f91412f;

    /* renamed from: g */
    public final int f91413g;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lss5;", "", "invoke", "(Lss5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: is5$a */
    /* loaded from: classes.dex */
    public static final class C24607a extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C32095Cb5 f91414g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24607a(C32095Cb5 c32095Cb5) {
            super(1);
            this.f91414g = c32095Cb5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 fakeSemanticsNode) {
            Intrinsics.checkNotNullParameter(fakeSemanticsNode, "$this$fakeSemanticsNode");
            C47128ps5.m18610P(fakeSemanticsNode, this.f91414g.m112067n());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lss5;", "", "invoke", "(Lss5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: is5$b */
    /* loaded from: classes.dex */
    public static final class C24608b extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f91415g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24608b(String str) {
            super(1);
            this.f91415g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 fakeSemanticsNode) {
            Intrinsics.checkNotNullParameter(fakeSemanticsNode, "$this$fakeSemanticsNode");
            C47128ps5.m18618H(fakeSemanticsNode, this.f91415g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m28432d2 = {"is5$c", "Lgs5;", "LgV2$c;", "Lbs5;", "l", "Lbs5;", "H", "()Lbs5;", "semanticsConfiguration", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: is5$c */
    /* loaded from: classes.dex */
    public static final class C24609c extends InterfaceC41563gV2.AbstractC20914c implements InterfaceC41791gs5 {

        /* renamed from: l */
        public final C38809bs5 f91416l;

        public C24609c(Function1<? super InterfaceC48906ss5, Unit> function1) {
            C38809bs5 c38809bs5 = new C38809bs5();
            c38809bs5.m62251w(false);
            c38809bs5.m62252v(false);
            function1.invoke(c38809bs5);
            this.f91416l = c38809bs5;
        }

        @Override // p000.InterfaceC41791gs5
        /* renamed from: H */
        public C38809bs5 mo29740H() {
            return this.f91416l;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "it", "", C17296a.f69688o, "(LJm2;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: is5$d */
    /* loaded from: classes.dex */
    public static final class C24610d extends Lambda implements Function1<C33829Jm2, Boolean> {

        /* renamed from: g */
        public static final C24610d f91417g = new C24610d();

        public C24610d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C33829Jm2 it) {
            C38809bs5 m35683a;
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC41791gs5 m29803i = C43570js5.m29803i(it);
            boolean z = false;
            if (m29803i != null && (m35683a = C42384hs5.m35683a(m29803i)) != null && m35683a.m62254s()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "it", "", C17296a.f69688o, "(LJm2;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: is5$e */
    /* loaded from: classes.dex */
    public static final class C24611e extends Lambda implements Function1<C33829Jm2, Boolean> {

        /* renamed from: g */
        public static final C24611e f91418g = new C24611e();

        public C24611e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C33829Jm2 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C43570js5.m29803i(it) != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public C42977is5(InterfaceC41791gs5 outerSemanticsNode, boolean z, C33829Jm2 layoutNode) {
        Intrinsics.checkNotNullParameter(outerSemanticsNode, "outerSemanticsNode");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f91407a = outerSemanticsNode;
        this.f91408b = z;
        this.f91409c = layoutNode;
        this.f91412f = C42384hs5.m35683a(outerSemanticsNode);
        this.f91413g = layoutNode.m99750r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static /* synthetic */ List m31736e(C42977is5 c42977is5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return c42977is5.m31737d(list);
    }

    /* renamed from: z */
    public static /* synthetic */ List m31715z(C42977is5 c42977is5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c42977is5.m31716y(z);
    }

    /* renamed from: a */
    public final void m31740a(List<C42977is5> list) {
        C32095Cb5 m29802j;
        String str;
        Object firstOrNull;
        m29802j = C43570js5.m29802j(this);
        if (m29802j != null && this.f91412f.m62254s() && (!list.isEmpty())) {
            list.add(m31739b(m29802j, new C24607a(m29802j)));
        }
        C38809bs5 c38809bs5 = this.f91412f;
        C45349ms5 c45349ms5 = C45349ms5.f98933a;
        if (c38809bs5.m62260c(c45349ms5.m24817c()) && (!list.isEmpty()) && this.f91412f.m62254s()) {
            List list2 = (List) C39420cs5.m44940a(this.f91412f, c45349ms5.m24817c());
            if (list2 != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list2);
                str = (String) firstOrNull;
            } else {
                str = null;
            }
            if (str != null) {
                list.add(0, m31739b(null, new C24608b(str)));
            }
        }
    }

    /* renamed from: b */
    public final C42977is5 m31739b(C32095Cb5 c32095Cb5, Function1<? super InterfaceC48906ss5, Unit> function1) {
        int m29808d;
        C24609c c24609c = new C24609c(function1);
        if (c32095Cb5 != null) {
            m29808d = C43570js5.m29801k(this);
        } else {
            m29808d = C43570js5.m29808d(this);
        }
        C42977is5 c42977is5 = new C42977is5(c24609c, false, new C33829Jm2(true, m29808d));
        c42977is5.f91410d = true;
        c42977is5.f91411e = this;
        return c42977is5;
    }

    /* renamed from: c */
    public final H83 m31738c() {
        InterfaceC41791gs5 interfaceC41791gs5 = null;
        if (this.f91410d) {
            C42977is5 m31726o = m31726o();
            if (m31726o == null) {
                return null;
            }
            return m31726o.m31738c();
        }
        InterfaceC41791gs5 m29804h = C43570js5.m29804h(this.f91409c);
        if (this.f91412f.m62254s()) {
            interfaceC41791gs5 = m29804h;
        }
        if (interfaceC41791gs5 == null) {
            interfaceC41791gs5 = this.f91407a;
        }
        return C51083wZ0.m6662g(interfaceC41791gs5, K83.m99169a(8));
    }

    /* renamed from: d */
    public final List<C42977is5> m31737d(List<C42977is5> list) {
        List m31715z = m31715z(this, false, 1, null);
        int size = m31715z.size();
        for (int i = 0; i < size; i++) {
            C42977is5 c42977is5 = (C42977is5) m31715z.get(i);
            if (c42977is5.m31719v()) {
                list.add(c42977is5);
            } else if (!c42977is5.f91412f.m62255o()) {
                c42977is5.m31737d(list);
            }
        }
        return list;
    }

    /* renamed from: f */
    public final C35055Os4 m31735f() {
        C35055Os4 m20519b;
        H83 m31738c = m31738c();
        if (m31738c != null) {
            if (!m31738c.mo23189F()) {
                m31738c = null;
            }
            if (m31738c != null && (m20519b = C46472om2.m20519b(m31738c)) != null) {
                return m20519b;
            }
        }
        return C35055Os4.f27481e.m91247a();
    }

    /* renamed from: g */
    public final C35055Os4 m31734g() {
        C35055Os4 m20518c;
        H83 m31738c = m31738c();
        if (m31738c != null) {
            if (!m31738c.mo23189F()) {
                m31738c = null;
            }
            if (m31738c != null && (m20518c = C46472om2.m20518c(m31738c)) != null) {
                return m20518c;
            }
        }
        return C35055Os4.f27481e.m91247a();
    }

    /* renamed from: h */
    public final List<C42977is5> m31733h() {
        return m31732i(!this.f91408b, false);
    }

    /* renamed from: i */
    public final List<C42977is5> m31732i(boolean z, boolean z2) {
        List<C42977is5> emptyList;
        if (!z && this.f91412f.m62255o()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (m31719v()) {
            return m31736e(this, null, 1, null);
        } else {
            return m31716y(z2);
        }
    }

    /* renamed from: j */
    public final C38809bs5 m31731j() {
        if (m31719v()) {
            C38809bs5 m62259e = this.f91412f.m62259e();
            m31717x(m62259e);
            return m62259e;
        }
        return this.f91412f;
    }

    /* renamed from: k */
    public final int m31730k() {
        return this.f91413g;
    }

    /* renamed from: l */
    public final InterfaceC50621vm2 m31729l() {
        return this.f91409c;
    }

    /* renamed from: m */
    public final C33829Jm2 m31728m() {
        return this.f91409c;
    }

    /* renamed from: n */
    public final InterfaceC41791gs5 m31727n() {
        return this.f91407a;
    }

    /* renamed from: o */
    public final C42977is5 m31726o() {
        C33829Jm2 c33829Jm2;
        InterfaceC41791gs5 interfaceC41791gs5;
        C42977is5 c42977is5 = this.f91411e;
        if (c42977is5 != null) {
            return c42977is5;
        }
        if (this.f91408b) {
            c33829Jm2 = C43570js5.m29807e(this.f91409c, C24610d.f91417g);
        } else {
            c33829Jm2 = null;
        }
        if (c33829Jm2 == null) {
            c33829Jm2 = C43570js5.m29807e(this.f91409c, C24611e.f91418g);
        }
        if (c33829Jm2 != null) {
            interfaceC41791gs5 = C43570js5.m29803i(c33829Jm2);
        } else {
            interfaceC41791gs5 = null;
        }
        if (interfaceC41791gs5 == null) {
            return null;
        }
        return new C42977is5(interfaceC41791gs5, this.f91408b, null, 4, null);
    }

    /* renamed from: p */
    public final long m31725p() {
        H83 m31738c = m31738c();
        if (m31738c != null) {
            if (!m31738c.mo23189F()) {
                m31738c = null;
            }
            if (m31738c != null) {
                return C46472om2.m20516e(m31738c);
            }
        }
        return C32120Ce3.f4427b.m111932c();
    }

    /* renamed from: q */
    public final List<C42977is5> m31724q() {
        return m31732i(false, true);
    }

    /* renamed from: r */
    public final long m31723r() {
        H83 m31738c = m31738c();
        return m31738c != null ? m31738c.mo23186a() : G52.f10893b.m105825a();
    }

    /* renamed from: s */
    public final C35055Os4 m31722s() {
        InterfaceC41791gs5 interfaceC41791gs5;
        if (this.f91412f.m62254s()) {
            interfaceC41791gs5 = C43570js5.m29804h(this.f91409c);
            if (interfaceC41791gs5 == null) {
                interfaceC41791gs5 = this.f91407a;
            }
        } else {
            interfaceC41791gs5 = this.f91407a;
        }
        return C42384hs5.m35680d(interfaceC41791gs5);
    }

    /* renamed from: t */
    public final C38809bs5 m31721t() {
        return this.f91412f;
    }

    /* renamed from: u */
    public final boolean m31720u() {
        return this.f91410d;
    }

    /* renamed from: v */
    public final boolean m31719v() {
        return this.f91408b && this.f91412f.m62254s();
    }

    /* renamed from: w */
    public final boolean m31718w() {
        H83 m31738c = m31738c();
        if (m31738c != null) {
            return m31738c.m104298v2();
        }
        return false;
    }

    /* renamed from: x */
    public final void m31717x(C38809bs5 c38809bs5) {
        if (!this.f91412f.m62255o()) {
            List m31715z = m31715z(this, false, 1, null);
            int size = m31715z.size();
            for (int i = 0; i < size; i++) {
                C42977is5 c42977is5 = (C42977is5) m31715z.get(i);
                if (!c42977is5.m31719v()) {
                    c38809bs5.m62253u(c42977is5.f91412f);
                    c42977is5.m31717x(c38809bs5);
                }
            }
        }
    }

    /* renamed from: y */
    public final List<C42977is5> m31716y(boolean z) {
        List<C42977is5> emptyList;
        if (this.f91410d) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList();
        List m29805g = C43570js5.m29805g(this.f91409c, null, 1, null);
        int size = m29805g.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C42977is5((InterfaceC41791gs5) m29805g.get(i), this.f91408b, null, 4, null));
        }
        if (z) {
            m31740a(arrayList);
        }
        return arrayList;
    }

    public /* synthetic */ C42977is5(InterfaceC41791gs5 interfaceC41791gs5, boolean z, C33829Jm2 c33829Jm2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC41791gs5, z, (i & 4) != 0 ? C51083wZ0.m6661h(interfaceC41791gs5) : c33829Jm2);
    }
}
