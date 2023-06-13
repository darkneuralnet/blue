package p000;

import androidx.compose.p003ui.layout.C11336b;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.AbstractC44199kw1;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, m28432d2 = {"LgV2;", "LG26;", "style", C17296a.f69688o, "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: B16 */
/* loaded from: classes.dex */
public final class B16 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", "b", "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTextFieldSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,116:1\n76#2:117\n76#2:118\n76#2:119\n50#3:120\n49#3:121\n50#3:128\n49#3:129\n25#3:136\n1114#4,6:122\n1114#4,6:130\n1114#4,6:137\n76#5:143\n*S KotlinDebug\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n*L\n40#1:117\n41#1:118\n42#1:119\n44#1:120\n44#1:121\n47#1:128\n47#1:129\n56#1:136\n44#1:122,6\n47#1:130,6\n56#1:137,6\n47#1:143\n*E\n"})
    /* renamed from: B16$a */
    /* loaded from: classes.dex */
    public static final class C0376a extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ G26 f1544g;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: B16$a$a */
        /* loaded from: classes.dex */
        public static final class C0377a extends Lambda implements Function3<InterfaceC52765zO2, InterfaceC50393vO2, C44228kz0, InterfaceC52172yO2> {

            /* renamed from: g */
            public final /* synthetic */ A16 f1545g;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: B16$a$a$a */
            /* loaded from: classes.dex */
            public static final class C0378a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

                /* renamed from: g */
                public final /* synthetic */ OU3 f1546g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0378a(OU3 ou3) {
                    super(1);
                    this.f1546g = ou3;
                }

                /* renamed from: a */
                public final void m114782a(OU3.AbstractC6015a layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    OU3.AbstractC6015a.m92205r(layout, this.f1546g, 0, 0, 0.0f, 4, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                    m114782a(abstractC6015a);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0377a(A16 a16) {
                super(3);
                this.f1545g = a16;
            }

            /* renamed from: a */
            public final InterfaceC52172yO2 m114783a(InterfaceC52765zO2 layout, InterfaceC50393vO2 measurable, long j) {
                int coerceIn;
                int coerceIn2;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Intrinsics.checkNotNullParameter(measurable, "measurable");
                BB5.m114261h(InterfaceC41563gV2.f82354b0, 0.0f, 0.0f, 3, null);
                long m116186b = this.f1545g.m116186b();
                coerceIn = RangesKt___RangesKt.coerceIn(G52.m105829g(m116186b), C44228kz0.m28061p(j), C44228kz0.m28063n(j));
                coerceIn2 = RangesKt___RangesKt.coerceIn(G52.m105830f(m116186b), C44228kz0.m28062o(j), C44228kz0.m28064m(j));
                OU3 mo8763P0 = measurable.mo8763P0(C44228kz0.m28072e(j, coerceIn, 0, coerceIn2, 0, 10, null));
                return InterfaceC52765zO2.m1430Y(layout, mo8763P0.m92226i1(), mo8763P0.m92229d1(), null, new C0378a(mo8763P0), 4, null);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ InterfaceC52172yO2 invoke(InterfaceC52765zO2 interfaceC52765zO2, InterfaceC50393vO2 interfaceC50393vO2, C44228kz0 c44228kz0) {
                return m114783a(interfaceC52765zO2, interfaceC50393vO2, c44228kz0.m28058s());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0376a(G26 g26) {
            super(3);
            this.f1544g = g26;
        }

        /* renamed from: c */
        public static final Object m114784c(InterfaceC48627sP5<? extends Object> interfaceC48627sP5) {
            return interfaceC48627sP5.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [Et0] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* renamed from: b */
        public final InterfaceC41563gV2 m114785b(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int m108201b;
            int m106232a;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(1582736677);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1582736677, i, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:38)");
            }
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            AbstractC44199kw1.InterfaceC25559b interfaceC25559b = (AbstractC44199kw1.InterfaceC25559b) interfaceC32720Et0.mo89572c(C42399hu0.m35610i());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            G26 g26 = this.f1544g;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(g26) | interfaceC32720Et0.mo89539n(enumC47065pm2);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = H26.m104477d(g26, enumC47065pm2);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            G26 g262 = mo89635G;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n2 = interfaceC32720Et0.mo89539n(interfaceC25559b) | interfaceC32720Et0.mo89539n(g262);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                AbstractC44199kw1 m105913l = g262.m105913l();
                C33918Jw1 m105908q = g262.m105908q();
                if (m105908q == null) {
                    m105908q = C33918Jw1.f18784c.m99540d();
                }
                C32748Ew1 m105910o = g262.m105910o();
                if (m105910o != null) {
                    m108201b = m105910o.m108203i();
                } else {
                    m108201b = C32748Ew1.f8309b.m108201b();
                }
                C32982Fw1 m105909p = g262.m105909p();
                if (m105909p != null) {
                    m106232a = m105909p.m106233m();
                } else {
                    m106232a = C32982Fw1.f10526b.m106232a();
                }
                mo89635G2 = interfaceC25559b.mo24699a(m105913l, m105908q, m108201b, m106232a);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC48627sP5 interfaceC48627sP5 = mo89635G2;
            G26 g263 = this.f1544g;
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G3 = interfaceC32720Et0.mo89635G();
            A16 a16 = mo89635G3;
            if (mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                A16 a162 = new A16(enumC47065pm2, interfaceC41273g01, interfaceC25559b, g263, m114784c(interfaceC48627sP5));
                interfaceC32720Et0.mo89503z(a162);
                a16 = a162;
            }
            interfaceC32720Et0.mo89605Q();
            A16 a163 = (A16) a16;
            a163.m116185c(enumC47065pm2, interfaceC41273g01, interfaceC25559b, g262, m114784c(interfaceC48627sP5));
            InterfaceC41563gV2 m68613a = C11336b.m68613a(InterfaceC41563gV2.f82354b0, new C0377a(a163));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m68613a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m114785b(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m114787a(InterfaceC41563gV2 interfaceC41563gV2, G26 style) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return C32486Dt0.m109807b(interfaceC41563gV2, null, new C0376a(style), 1, null);
    }
}
