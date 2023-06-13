package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a4\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0000\u001a6\u0010\u001a\u001a\u00020\u0019*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¨\u0006\u001b"}, m28432d2 = {"LgV2;", "Lv16;", "scrollerPosition", "LrX2;", "interactionSource", "", "enabled", DateTokenConverter.CONVERTER_KEY, "LF16;", "textFieldValue", "LEu6;", "visualTransformation", "Lkotlin/Function0;", "Lj26;", "textLayoutResultProvider", "c", "Lg01;", "", "cursorOffset", "LA96;", "transformedText", "Li26;", "textLayoutResult", "rtl", "textFieldWidth", "LOs4;", "b", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,369:1\n135#2:370\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n60#1:370\n*E\n"})
/* renamed from: u16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49589u16 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u16$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C28989a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC32768Ey3.values().length];
            try {
                iArr[EnumC32768Ey3.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32768Ey3.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n1#1,170:1\n61#2,5:171\n*E\n"})
    /* renamed from: u16$b */
    /* loaded from: classes.dex */
    public static final class C28990b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C50182v16 f111493g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48104rX2 f111494h;

        /* renamed from: i */
        public final /* synthetic */ boolean f111495i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28990b(C50182v16 c50182v16, InterfaceC48104rX2 interfaceC48104rX2, boolean z) {
            super(1);
            this.f111493g = c50182v16;
            this.f111494h = interfaceC48104rX2;
            this.f111495i = z;
        }

        /* renamed from: a */
        public final void m11051a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("textFieldScrollable");
            s42.m86038a().m104824a("scrollerPosition", this.f111493g);
            s42.m86038a().m104824a("interactionSource", this.f111494h);
            s42.m86038a().m104824a("enabled", Boolean.valueOf(this.f111495i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m11051a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,369:1\n76#2:370\n36#3:371\n50#3:378\n49#3:379\n1114#4,6:372\n1114#4,6:380\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n*L\n68#1:370\n70#1:371\n83#1:378\n83#1:379\n70#1:372,6\n83#1:380,6\n*E\n"})
    /* renamed from: u16$c */
    /* loaded from: classes.dex */
    public static final class C28991c extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ C50182v16 f111496g;

        /* renamed from: h */
        public final /* synthetic */ boolean f111497h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC48104rX2 f111498i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: u16$c$a */
        /* loaded from: classes.dex */
        public static final class C28992a extends Lambda implements Function1<Float, Float> {

            /* renamed from: g */
            public final /* synthetic */ C50182v16 f111499g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28992a(C50182v16 c50182v16) {
                super(1);
                this.f111499g = c50182v16;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }

            public final Float invoke(float f) {
                float m9372d = this.f111499g.m9372d() + f;
                if (m9372d > this.f111499g.m9373c()) {
                    f = this.f111499g.m9373c() - this.f111499g.m9372d();
                } else if (m9372d < 0.0f) {
                    f = -this.f111499g.m9372d();
                }
                C50182v16 c50182v16 = this.f111499g;
                c50182v16.m9368h(c50182v16.m9372d() + f);
                return Float.valueOf(f);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,369:1\n76#2:370\n76#2:371\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n*L\n85#1:370\n88#1:371\n*E\n"})
        /* renamed from: u16$c$b */
        /* loaded from: classes.dex */
        public static final class C28993b implements InterfaceC38196aq5 {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC38196aq5 f111500a;

            /* renamed from: b */
            public final InterfaceC48627sP5 f111501b;

            /* renamed from: c */
            public final InterfaceC48627sP5 f111502c;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: u16$c$b$a */
            /* loaded from: classes.dex */
            public static final class C28994a extends Lambda implements Function0<Boolean> {

                /* renamed from: g */
                public final /* synthetic */ C50182v16 f111503g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C28994a(C50182v16 c50182v16) {
                    super(0);
                    this.f111503g = c50182v16;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f111503g.m9372d() > 0.0f);
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: u16$c$b$b */
            /* loaded from: classes.dex */
            public static final class C28995b extends Lambda implements Function0<Boolean> {

                /* renamed from: g */
                public final /* synthetic */ C50182v16 f111504g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C28995b(C50182v16 c50182v16) {
                    super(0);
                    this.f111504g = c50182v16;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f111504g.m9372d() < this.f111504g.m9373c());
                }
            }

            public C28993b(InterfaceC38196aq5 interfaceC38196aq5, C50182v16 c50182v16) {
                this.f111500a = interfaceC38196aq5;
                this.f111501b = GM5.m105204c(new C28995b(c50182v16));
                this.f111502c = GM5.m105204c(new C28994a(c50182v16));
            }

            @Override // p000.InterfaceC38196aq5
            /* renamed from: a */
            public boolean mo11049a() {
                return ((Boolean) this.f111501b.getValue()).booleanValue();
            }

            @Override // p000.InterfaceC38196aq5
            /* renamed from: b */
            public float mo11048b(float f) {
                return this.f111500a.mo11048b(f);
            }

            @Override // p000.InterfaceC38196aq5
            /* renamed from: c */
            public Object mo11047c(OX2 ox2, Function2<? super InterfaceC36901Wp5, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
                return this.f111500a.mo11047c(ox2, function2, continuation);
            }

            @Override // p000.InterfaceC38196aq5
            /* renamed from: e */
            public boolean mo11046e() {
                return this.f111500a.mo11046e();
            }

            @Override // p000.InterfaceC38196aq5
            /* renamed from: f */
            public boolean mo11045f() {
                return ((Boolean) this.f111502c.getValue()).booleanValue();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28991c(C50182v16 c50182v16, boolean z, InterfaceC48104rX2 interfaceC48104rX2) {
            super(3);
            this.f111496g = c50182v16;
            this.f111497h = z;
            this.f111498i = interfaceC48104rX2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
        /* JADX WARN: Type inference failed for: r14v0, types: [Et0] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC41563gV2 m11050a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(805428266);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(805428266, i, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:65)");
            }
            if (interfaceC32720Et0.mo89572c(C42399hu0.m35607l()) == EnumC47065pm2.Rtl) {
                z = true;
            } else {
                z = false;
            }
            if (this.f111496g.m9370f() != EnumC32768Ey3.Vertical && z) {
                z2 = false;
            } else {
                z2 = true;
            }
            C50182v16 c50182v16 = this.f111496g;
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(c50182v16);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C28992a(c50182v16);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC38196aq5 m62555b = C38789bq5.m62555b((Function1) mo89635G, interfaceC32720Et0, 0);
            C50182v16 c50182v162 = this.f111496g;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n2 = interfaceC32720Et0.mo89539n(m62555b) | interfaceC32720Et0.mo89539n(c50182v162);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G2 = new C28993b(m62555b, c50182v162);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            C28993b c28993b = mo89635G2;
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            EnumC32768Ey3 m9370f = this.f111496g.m9370f();
            if (this.f111497h) {
                if (this.f111496g.m9373c() == 0.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    z3 = true;
                    InterfaceC41563gV2 m72418l = C37603Zp5.m72418l(c20912a, c28993b, m9370f, z3, z2, null, this.f111498i, 16, null);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    interfaceC32720Et0.mo89605Q();
                    return m72418l;
                }
            }
            z3 = false;
            InterfaceC41563gV2 m72418l2 = C37603Zp5.m72418l(c20912a, c28993b, m9370f, z3, z2, null, this.f111498i, 16, null);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC32720Et0.mo89605Q();
            return m72418l2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m11050a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: b */
    public static final C35055Os4 m11054b(InterfaceC41273g01 interfaceC41273g01, int i, A96 a96, C42484i26 c42484i26, boolean z, int i2) {
        C35055Os4 m91247a;
        float m91258i;
        float m91258i2;
        if (c42484i26 == null || (m91247a = c42484i26.m34604d(a96.m116052a().originalToTransformed(i))) == null) {
            m91247a = C35055Os4.f27481e.m91247a();
        }
        C35055Os4 c35055Os4 = m91247a;
        int mo3416F0 = interfaceC41273g01.mo3416F0(C40695f16.m42265c());
        if (z) {
            m91258i = (i2 - c35055Os4.m91258i()) - mo3416F0;
        } else {
            m91258i = c35055Os4.m91258i();
        }
        float f = m91258i;
        if (z) {
            m91258i2 = i2 - c35055Os4.m91258i();
        } else {
            m91258i2 = c35055Os4.m91258i() + mo3416F0;
        }
        return C35055Os4.m91263d(c35055Os4, f, 0.0f, m91258i2, 0.0f, 10, null);
    }

    /* renamed from: c */
    public static final InterfaceC41563gV2 m11053c(InterfaceC41563gV2 interfaceC41563gV2, C50182v16 scrollerPosition, F16 textFieldValue, InterfaceC32735Eu6 visualTransformation, Function0<C43077j26> textLayoutResultProvider) {
        InterfaceC41563gV2 c33851Jo6;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(textLayoutResultProvider, "textLayoutResultProvider");
        EnumC32768Ey3 m9370f = scrollerPosition.m9370f();
        int m9371e = scrollerPosition.m9371e(textFieldValue.m108103g());
        scrollerPosition.m9367i(textFieldValue.m108103g());
        A96 m8229a = C50595vj6.m8229a(visualTransformation, textFieldValue.m108105e());
        int i = C28989a.$EnumSwitchMapping$0[m9370f.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c33851Jo6 = new C39101cN1(scrollerPosition, m9371e, m8229a, textLayoutResultProvider);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            c33851Jo6 = new C33851Jo6(scrollerPosition, m9371e, m8229a, textLayoutResultProvider);
        }
        return C35447Qk0.m88105b(interfaceC41563gV2).mo39266t0(c33851Jo6);
    }

    /* renamed from: d */
    public static final InterfaceC41563gV2 m11052d(InterfaceC41563gV2 interfaceC41563gV2, C50182v16 scrollerPosition, InterfaceC48104rX2 interfaceC48104rX2, boolean z) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        if (K32.m99301c()) {
            m99303a = new C28990b(scrollerPosition, interfaceC48104rX2, z);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C28991c(scrollerPosition, z, interfaceC48104rX2));
    }
}
