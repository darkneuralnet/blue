package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.F96;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\t\u000fB'\b\u0000\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR4\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R/\u0010,\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0'0&8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R-\u00102\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010'8\u0000@\u0000X\u0080\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00105\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m28432d2 = {"LOe;", "S", "LF96$b;", "LHA0;", "contentTransform", "LgV2;", "c", "(LHA0;LEt0;I)LgV2;", "LF96;", C17296a.f69688o, "LF96;", "getTransition$animation_release", "()LF96;", "transition", "LK9;", "b", "LK9;", "f", "()LK9;", "i", "(LK9;)V", "contentAlignment", "Lpm2;", "Lpm2;", "getLayoutDirection$animation_release", "()Lpm2;", "j", "(Lpm2;)V", "layoutDirection", "LG52;", "<set-?>", DateTokenConverter.CONVERTER_KEY, "LEX2;", "getMeasuredSize-YbymL2g$animation_release", "()J", "k", "(J)V", "measuredSize", "", "LsP5;", "e", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "targetSizeMap", "LsP5;", "getAnimatedSize$animation_release", "()LsP5;", "h", "(LsP5;)V", "animatedSize", "getInitialState", "()Ljava/lang/Object;", "initialState", "targetState", "<init>", "(LF96;LK9;Lpm2;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,780:1\n76#2:781\n102#2,2:782\n76#2:798\n102#2,2:799\n36#3:784\n36#3:791\n1057#4,6:785\n1057#4,6:792\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentScope\n*L\n478#1:781\n478#1:782,2\n493#1:798\n493#1:799,2\n493#1:784\n505#1:791\n493#1:785,6\n505#1:792,6\n*E\n"})
/* renamed from: Oe */
/* loaded from: classes.dex */
public final class C6080Oe<S> implements F96.InterfaceC2189b<S> {

    /* renamed from: a */
    public final F96<S> f26958a;

    /* renamed from: b */
    public InterfaceC4360K9 f26959b;

    /* renamed from: c */
    public EnumC47065pm2 f26960c;

    /* renamed from: d */
    public final EX2 f26961d;

    /* renamed from: e */
    public final Map<S, InterfaceC48627sP5<G52>> f26962e;

    /* renamed from: f */
    public InterfaceC48627sP5<G52> f26963f;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0011J\u0016\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\r\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"LOe$a;", "LSE3;", "Lg01;", "", "parentData", "B", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "b", "Z", C17296a.f69688o, "()Z", "(Z)V", "isTarget", "<init>", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Oe$a */
    /* loaded from: classes.dex */
    public static final class C6081a implements SE3 {

        /* renamed from: b */
        public boolean f26964b;

        public C6081a(boolean z) {
            this.f26964b = z;
        }

        @Override // p000.SE3
        /* renamed from: B */
        public Object mo62029B(InterfaceC41273g01 interfaceC41273g01, Object obj) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            return this;
        }

        /* renamed from: a */
        public final boolean m91770a() {
            return this.f26964b;
        }

        /* renamed from: b */
        public final void m91769b(boolean z) {
            this.f26964b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6081a) && this.f26964b == ((C6081a) obj).f26964b;
        }

        public int hashCode() {
            boolean z = this.f26964b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "ChildData(isTarget=" + this.f26964b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0083\u0004\u0018\u00002\u00020\u0001B8\u0012\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nR\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tR0\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nR\b\u0012\u0004\u0012\u00028\u00000\r8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, m28432d2 = {"LOe$b;", "LHm2;", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "LF96$a;", "LG52;", "Ltf;", "LF96;", "b", "LF96$a;", "getSizeAnimation", "()LF96$a;", "sizeAnimation", "LsP5;", "LGB5;", "c", "LsP5;", C17296a.f69688o, "()LsP5;", "sizeTransform", "<init>", "(LOe;LF96$a;LsP5;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Oe$b */
    /* loaded from: classes.dex */
    public final class C6082b extends AbstractC33361Hm2 {

        /* renamed from: b */
        public final F96<S>.C2187a<G52, C28797tf> f26965b;

        /* renamed from: c */
        public final InterfaceC48627sP5<GB5> f26966c;

        /* renamed from: d */
        public final /* synthetic */ C6080Oe<S> f26967d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"S", "LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Oe$b$a */
        /* loaded from: classes.dex */
        public static final class C6083a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ OU3 f26968g;

            /* renamed from: h */
            public final /* synthetic */ long f26969h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6083a(OU3 ou3, long j) {
                super(1);
                this.f26968g = ou3;
                this.f26969h = j;
            }

            /* renamed from: a */
            public final void m91767a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                OU3.AbstractC6015a.m92207p(layout, this.f26968g, this.f26969h, 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m91767a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"S", "LF96$b;", "Ltm1;", "LG52;", C17296a.f69688o, "(LF96$b;)Ltm1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Oe$b$b */
        /* loaded from: classes.dex */
        public static final class C6084b extends Lambda implements Function1<F96.InterfaceC2189b<S>, InterfaceC49435tm1<G52>> {

            /* renamed from: g */
            public final /* synthetic */ C6080Oe<S> f26970g;

            /* renamed from: h */
            public final /* synthetic */ C6080Oe<S>.C6082b f26971h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6084b(C6080Oe<S> c6080Oe, C6080Oe<S>.C6082b c6082b) {
                super(1);
                this.f26970g = c6080Oe;
                this.f26971h = c6082b;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC49435tm1<G52> invoke(F96.InterfaceC2189b<S> animate) {
                long m105825a;
                long m105825a2;
                InterfaceC49435tm1<G52> mo104181b;
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                InterfaceC48627sP5<G52> interfaceC48627sP5 = this.f26970g.m91775g().get(animate.getInitialState());
                if (interfaceC48627sP5 != null) {
                    m105825a = interfaceC48627sP5.getValue().m105826j();
                } else {
                    m105825a = G52.f10893b.m105825a();
                }
                InterfaceC48627sP5<G52> interfaceC48627sP52 = this.f26970g.m91775g().get(animate.mo91780b());
                if (interfaceC48627sP52 != null) {
                    m105825a2 = interfaceC48627sP52.getValue().m105826j();
                } else {
                    m105825a2 = G52.f10893b.m105825a();
                }
                GB5 value = this.f26971h.m91768a().getValue();
                if (value == null || (mo104181b = value.mo104181b(m105825a, m105825a2)) == null) {
                    return C26160mf.m25221i(0.0f, 0.0f, null, 7, null);
                }
                return mo104181b;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"S", "it", "LG52;", "b", "(Ljava/lang/Object;)J"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Oe$b$c */
        /* loaded from: classes.dex */
        public static final class C6085c extends Lambda implements Function1<S, G52> {

            /* renamed from: g */
            public final /* synthetic */ C6080Oe<S> f26972g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6085c(C6080Oe<S> c6080Oe) {
                super(1);
                this.f26972g = c6080Oe;
            }

            /* renamed from: b */
            public final long m91765b(S s) {
                InterfaceC48627sP5<G52> interfaceC48627sP5 = this.f26972g.m91775g().get(s);
                return interfaceC48627sP5 != null ? interfaceC48627sP5.getValue().m105826j() : G52.f10893b.m105825a();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ G52 invoke(Object obj) {
                return G52.m105834b(m91765b(obj));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C6082b(C6080Oe c6080Oe, F96<S>.C2187a<G52, C28797tf> sizeAnimation, InterfaceC48627sP5<? extends GB5> sizeTransform) {
            Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
            Intrinsics.checkNotNullParameter(sizeTransform, "sizeTransform");
            this.f26967d = c6080Oe;
            this.f26965b = sizeAnimation;
            this.f26966c = sizeTransform;
        }

        /* renamed from: a */
        public final InterfaceC48627sP5<GB5> m91768a() {
            return this.f26966c;
        }

        @Override // p000.InterfaceC31957Bm2
        /* renamed from: f */
        public InterfaceC52172yO2 mo3871f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            OU3 mo8763P0 = measurable.mo8763P0(j);
            InterfaceC48627sP5<G52> m107515a = this.f26965b.m107515a(new C6084b(this.f26967d, this), new C6085c(this.f26967d));
            this.f26967d.m91774h(m107515a);
            return InterfaceC52765zO2.m1430Y(measure, G52.m105829g(m107515a.getValue().m105826j()), G52.m105830f(m107515a.getValue().m105826j()), null, new C6083a(mo8763P0, this.f26967d.m91776f().mo99146a(H52.m104430a(mo8763P0.m92226i1(), mo8763P0.m92229d1()), m107515a.getValue().m105826j(), EnumC47065pm2.Ltr)), 4, null);
        }
    }

    public C6080Oe(F96<S> transition, InterfaceC4360K9 contentAlignment, EnumC47065pm2 layoutDirection) {
        EX2 m97025e;
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f26958a = transition;
        this.f26959b = contentAlignment;
        this.f26960c = layoutDirection;
        m97025e = LM5.m97025e(G52.m105834b(G52.f10893b.m105825a()), null, 2, null);
        this.f26961d = m97025e;
        this.f26962e = new LinkedHashMap();
    }

    /* renamed from: d */
    public static final boolean m91778d(EX2<Boolean> ex2) {
        return ex2.getValue().booleanValue();
    }

    /* renamed from: e */
    public static final void m91777e(EX2<Boolean> ex2, boolean z) {
        ex2.setValue(Boolean.valueOf(z));
    }

    @Override // p000.F96.InterfaceC2189b
    /* renamed from: b */
    public S mo91780b() {
        return this.f26958a.m107531k().mo91780b();
    }

    /* renamed from: c */
    public final InterfaceC41563gV2 m91779c(HA0 contentTransform, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC41563gV2 interfaceC41563gV2;
        Intrinsics.checkNotNullParameter(contentTransform, "contentTransform");
        interfaceC32720Et0.mo89638F(-1349251863);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1349251863, i, -1, "androidx.compose.animation.AnimatedContentScope.createSizeAnimationModifier (AnimatedContent.kt:489)");
        }
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(this);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = LM5.m97025e(Boolean.FALSE, null, 2, null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        EX2 ex2 = (EX2) mo89635G;
        boolean z = false;
        InterfaceC48627sP5 m105193n = GM5.m105193n(contentTransform.m104228b(), interfaceC32720Et0, 0);
        if (Intrinsics.areEqual(this.f26958a.m107535g(), this.f26958a.m107529m())) {
            m91777e(ex2, false);
        } else if (m105193n.getValue() != null) {
            m91777e(ex2, true);
        }
        if (m91778d(ex2)) {
            F96.C2187a m101074b = J96.m101074b(this.f26958a, C37082Xj6.m76520e(G52.f10893b), null, interfaceC32720Et0, 64, 2);
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n2 = interfaceC32720Et0.mo89539n(m101074b);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                GB5 gb5 = (GB5) m105193n.getValue();
                if (gb5 != null && !gb5.mo104182a()) {
                    z = true;
                }
                InterfaceC41563gV2 interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
                if (!z) {
                    interfaceC41563gV22 = C35447Qk0.m88105b(interfaceC41563gV22);
                }
                mo89635G2 = interfaceC41563gV22.mo39266t0(new C6082b(this, m101074b, m105193n));
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            interfaceC41563gV2 = (InterfaceC41563gV2) mo89635G2;
        } else {
            this.f26963f = null;
            interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return interfaceC41563gV2;
    }

    /* renamed from: f */
    public final InterfaceC4360K9 m91776f() {
        return this.f26959b;
    }

    /* renamed from: g */
    public final Map<S, InterfaceC48627sP5<G52>> m91775g() {
        return this.f26962e;
    }

    @Override // p000.F96.InterfaceC2189b
    public S getInitialState() {
        return this.f26958a.m107531k().getInitialState();
    }

    /* renamed from: h */
    public final void m91774h(InterfaceC48627sP5<G52> interfaceC48627sP5) {
        this.f26963f = interfaceC48627sP5;
    }

    /* renamed from: i */
    public final void m91773i(InterfaceC4360K9 interfaceC4360K9) {
        Intrinsics.checkNotNullParameter(interfaceC4360K9, "<set-?>");
        this.f26959b = interfaceC4360K9;
    }

    /* renamed from: j */
    public final void m91772j(EnumC47065pm2 enumC47065pm2) {
        Intrinsics.checkNotNullParameter(enumC47065pm2, "<set-?>");
        this.f26960c = enumC47065pm2;
    }

    /* renamed from: k */
    public final void m91771k(long j) {
        this.f26961d.setValue(G52.m105834b(j));
    }
}
