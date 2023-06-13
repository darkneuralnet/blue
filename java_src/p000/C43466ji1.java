package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.F96;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001Bv\u0012\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0012R\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u0012R\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d\u0012\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d\u0012\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u001dø\u0001\u0001¢\u0006\u0004\b7\u00108J#\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0007J)\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R0\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0012R\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R0\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u0012R\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0015\u0010!R\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010!R\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u001d8\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b'\u0010!R$\u0010.\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R7\u00106\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0004010/¢\u0006\u0002\b28\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b,\u00103\u001a\u0004\b4\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00069"}, m28432d2 = {"Lji1;", "LHm2;", "LXe1;", "targetState", "LG52;", "fullSize", "j", "(LXe1;J)J", "LA52;", "k", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "LF96$a;", "Ltf;", "LF96;", "b", "LF96$a;", "getSizeAnimation", "()LF96$a;", "sizeAnimation", "c", "getOffsetAnimation", "offsetAnimation", "LsP5;", "LEh0;", DateTokenConverter.CONVERTER_KEY, "LsP5;", "()LsP5;", "expand", "e", "g", "shrink", "LK9;", "getAlignment", "alignment", "LK9;", C17296a.f69688o, "()LK9;", "h", "(LK9;)V", "currentAlignment", "Lkotlin/Function1;", "LF96$b;", "Ltm1;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "getSizeTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "sizeTransitionSpec", "<init>", "(LF96$a;LF96$a;LsP5;LsP5;LsP5;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/ExpandShrinkModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1180:1\n1#2:1181\n79#3:1182\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/ExpandShrinkModifier\n*L\n1152#1:1182\n*E\n"})
/* renamed from: ji1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43466ji1 extends AbstractC33361Hm2 {

    /* renamed from: b */
    public final F96<EnumC37032Xe1>.C2187a<G52, C28797tf> f93193b;

    /* renamed from: c */
    public final F96<EnumC37032Xe1>.C2187a<A52, C28797tf> f93194c;

    /* renamed from: d */
    public final InterfaceC48627sP5<C32612Eh0> f93195d;

    /* renamed from: e */
    public final InterfaceC48627sP5<C32612Eh0> f93196e;

    /* renamed from: f */
    public final InterfaceC48627sP5<InterfaceC4360K9> f93197f;

    /* renamed from: g */
    public InterfaceC4360K9 f93198g;

    /* renamed from: h */
    public final Function1<F96.InterfaceC2189b<EnumC37032Xe1>, InterfaceC49435tm1<G52>> f93199h;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ji1$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C24988a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC37032Xe1.values().length];
            try {
                iArr[EnumC37032Xe1.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37032Xe1.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC37032Xe1.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ji1$b */
    /* loaded from: classes.dex */
    public static final class C24989b extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU3 f93200g;

        /* renamed from: h */
        public final /* synthetic */ long f93201h;

        /* renamed from: i */
        public final /* synthetic */ long f93202i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24989b(OU3 ou3, long j, long j2) {
            super(1);
            this.f93200g = ou3;
            this.f93201h = j;
            this.f93202i = j2;
        }

        /* renamed from: a */
        public final void m30078a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            OU3.AbstractC6015a.m92209n(layout, this.f93200g, A52.m116111j(this.f93201h) + A52.m116111j(this.f93202i), A52.m116110k(this.f93201h) + A52.m116110k(this.f93202i), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m30078a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LXe1;", "it", "LG52;", C17296a.f69688o, "(LXe1;)J"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ji1$c */
    /* loaded from: classes.dex */
    public static final class C24990c extends Lambda implements Function1<EnumC37032Xe1, G52> {

        /* renamed from: h */
        public final /* synthetic */ long f93204h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24990c(long j) {
            super(1);
            this.f93204h = j;
        }

        /* renamed from: a */
        public final long m30077a(EnumC37032Xe1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C43466ji1.this.m30080j(it, this.f93204h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ G52 invoke(EnumC37032Xe1 enumC37032Xe1) {
            return G52.m105834b(m30077a(enumC37032Xe1));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LF96$b;", "LXe1;", "Ltm1;", "LA52;", C17296a.f69688o, "(LF96$b;)Ltm1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ji1$d */
    /* loaded from: classes.dex */
    public static final class C24991d extends Lambda implements Function1<F96.InterfaceC2189b<EnumC37032Xe1>, InterfaceC49435tm1<A52>> {

        /* renamed from: g */
        public static final C24991d f93205g = new C24991d();

        public C24991d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC49435tm1<A52> invoke(F96.InterfaceC2189b<EnumC37032Xe1> animate) {
            C43282jO5 c43282jO5;
            Intrinsics.checkNotNullParameter(animate, "$this$animate");
            c43282jO5 = C37266Ye1.f46175d;
            return c43282jO5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LXe1;", "it", "LA52;", C17296a.f69688o, "(LXe1;)J"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ji1$e */
    /* loaded from: classes.dex */
    public static final class C24992e extends Lambda implements Function1<EnumC37032Xe1, A52> {

        /* renamed from: h */
        public final /* synthetic */ long f93207h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24992e(long j) {
            super(1);
            this.f93207h = j;
        }

        /* renamed from: a */
        public final long m30075a(EnumC37032Xe1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C43466ji1.this.m30079k(it, this.f93207h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ A52 invoke(EnumC37032Xe1 enumC37032Xe1) {
            return A52.m116119b(m30075a(enumC37032Xe1));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LF96$b;", "LXe1;", "Ltm1;", "LG52;", C17296a.f69688o, "(LF96$b;)Ltm1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ji1$f */
    /* loaded from: classes.dex */
    public static final class C24993f extends Lambda implements Function1<F96.InterfaceC2189b<EnumC37032Xe1>, InterfaceC49435tm1<G52>> {
        public C24993f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC49435tm1<G52> invoke(F96.InterfaceC2189b<EnumC37032Xe1> interfaceC2189b) {
            C43282jO5 c43282jO5;
            Intrinsics.checkNotNullParameter(interfaceC2189b, "$this$null");
            EnumC37032Xe1 enumC37032Xe1 = EnumC37032Xe1.PreEnter;
            EnumC37032Xe1 enumC37032Xe12 = EnumC37032Xe1.Visible;
            InterfaceC49435tm1<G52> interfaceC49435tm1 = null;
            if (interfaceC2189b.m107505a(enumC37032Xe1, enumC37032Xe12)) {
                C32612Eh0 value = C43466ji1.this.m30083b().getValue();
                if (value != null) {
                    interfaceC49435tm1 = value.m108581b();
                }
            } else if (interfaceC2189b.m107505a(enumC37032Xe12, EnumC37032Xe1.PostExit)) {
                C32612Eh0 value2 = C43466ji1.this.m30082g().getValue();
                if (value2 != null) {
                    interfaceC49435tm1 = value2.m108581b();
                }
            } else {
                interfaceC49435tm1 = C37266Ye1.f46176e;
            }
            if (interfaceC49435tm1 == null) {
                c43282jO5 = C37266Ye1.f46176e;
                return c43282jO5;
            }
            return interfaceC49435tm1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43466ji1(F96<EnumC37032Xe1>.C2187a<G52, C28797tf> sizeAnimation, F96<EnumC37032Xe1>.C2187a<A52, C28797tf> offsetAnimation, InterfaceC48627sP5<C32612Eh0> expand, InterfaceC48627sP5<C32612Eh0> shrink, InterfaceC48627sP5<? extends InterfaceC4360K9> alignment) {
        Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
        Intrinsics.checkNotNullParameter(offsetAnimation, "offsetAnimation");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(shrink, "shrink");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f93193b = sizeAnimation;
        this.f93194c = offsetAnimation;
        this.f93195d = expand;
        this.f93196e = shrink;
        this.f93197f = alignment;
        this.f93199h = new C24993f();
    }

    /* renamed from: a */
    public final InterfaceC4360K9 m30084a() {
        return this.f93198g;
    }

    /* renamed from: b */
    public final InterfaceC48627sP5<C32612Eh0> m30083b() {
        return this.f93195d;
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: f */
    public InterfaceC52172yO2 mo3871f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        long m116106a;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        OU3 mo8763P0 = measurable.mo8763P0(j);
        long m104430a = H52.m104430a(mo8763P0.m92226i1(), mo8763P0.m92229d1());
        long m105826j = this.f93193b.m107515a(this.f93199h, new C24990c(m104430a)).getValue().m105826j();
        long m116107n = this.f93194c.m107515a(C24991d.f93205g, new C24992e(m104430a)).getValue().m116107n();
        InterfaceC4360K9 interfaceC4360K9 = this.f93198g;
        if (interfaceC4360K9 != null) {
            m116106a = interfaceC4360K9.mo99146a(m104430a, m105826j, EnumC47065pm2.Ltr);
        } else {
            m116106a = A52.f130b.m116106a();
        }
        return InterfaceC52765zO2.m1430Y(measure, G52.m105829g(m105826j), G52.m105830f(m105826j), null, new C24989b(mo8763P0, m116106a, m116107n), 4, null);
    }

    /* renamed from: g */
    public final InterfaceC48627sP5<C32612Eh0> m30082g() {
        return this.f93196e;
    }

    /* renamed from: h */
    public final void m30081h(InterfaceC4360K9 interfaceC4360K9) {
        this.f93198g = interfaceC4360K9;
    }

    /* renamed from: j */
    public final long m30080j(EnumC37032Xe1 targetState, long j) {
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        C32612Eh0 value = this.f93195d.getValue();
        if (value != null) {
            j2 = value.m108579d().invoke(G52.m105834b(j)).m105826j();
        } else {
            j2 = j;
        }
        C32612Eh0 value2 = this.f93196e.getValue();
        if (value2 != null) {
            j3 = value2.m108579d().invoke(G52.m105834b(j)).m105826j();
        } else {
            j3 = j;
        }
        int i = C24988a.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return j3;
                }
                throw new NoWhenBranchMatchedException();
            }
            return j2;
        }
        return j;
    }

    /* renamed from: k */
    public final long m30079k(EnumC37032Xe1 targetState, long j) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        if (this.f93198g == null) {
            return A52.f130b.m116106a();
        }
        if (this.f93197f.getValue() == null) {
            return A52.f130b.m116106a();
        }
        if (Intrinsics.areEqual(this.f93198g, this.f93197f.getValue())) {
            return A52.f130b.m116106a();
        }
        int i = C24988a.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C32612Eh0 value = this.f93196e.getValue();
                    if (value != null) {
                        long m105826j = value.m108579d().invoke(G52.m105834b(j)).m105826j();
                        InterfaceC4360K9 value2 = this.f93197f.getValue();
                        Intrinsics.checkNotNull(value2);
                        InterfaceC4360K9 interfaceC4360K9 = value2;
                        EnumC47065pm2 enumC47065pm2 = EnumC47065pm2.Ltr;
                        long mo99146a = interfaceC4360K9.mo99146a(j, m105826j, enumC47065pm2);
                        InterfaceC4360K9 interfaceC4360K92 = this.f93198g;
                        Intrinsics.checkNotNull(interfaceC4360K92);
                        long mo99146a2 = interfaceC4360K92.mo99146a(j, m105826j, enumC47065pm2);
                        return B52.m114704a(A52.m116111j(mo99146a) - A52.m116111j(mo99146a2), A52.m116110k(mo99146a) - A52.m116110k(mo99146a2));
                    }
                    return A52.f130b.m116106a();
                }
                throw new NoWhenBranchMatchedException();
            }
            return A52.f130b.m116106a();
        }
        return A52.f130b.m116106a();
    }
}
