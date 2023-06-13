package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC44199kw1;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a(\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¨\u0006\t"}, m28432d2 = {"LgV2;", "LG26;", "textStyle", "", "minLines", "maxLines", C17296a.f69688o, "", "c", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,134:1\n135#2:135\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n53#1:135\n*E\n"})
/* renamed from: EI1 */
/* loaded from: classes.dex */
public final class EI1 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n1#1,170:1\n54#2,5:171\n*E\n"})
    /* renamed from: EI1$a */
    /* loaded from: classes.dex */
    public static final class C1774a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f7198g;

        /* renamed from: h */
        public final /* synthetic */ int f7199h;

        /* renamed from: i */
        public final /* synthetic */ G26 f7200i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1774a(int i, int i2, G26 g26) {
            super(1);
            this.f7198g = i;
            this.f7199h = i2;
            this.f7200i = g26;
        }

        /* renamed from: a */
        public final void m109241a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("heightInLines");
            s42.m86038a().m104824a("minLines", Integer.valueOf(this.f7198g));
            s42.m86038a().m104824a("maxLines", Integer.valueOf(this.f7199h));
            s42.m86038a().m104824a("textStyle", this.f7200i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m109241a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,134:1\n76#2:135\n76#2:136\n76#2:137\n50#3:138\n49#3:139\n50#3:146\n49#3:147\n83#3,3:154\n83#3,3:163\n1114#4,6:140\n1114#4,6:148\n1114#4,6:157\n1114#4,6:166\n76#5:172\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n*L\n63#1:135\n64#1:136\n65#1:137\n69#1:138\n69#1:139\n72#1:146\n72#1:147\n81#1:154,3\n97#1:163,3\n69#1:140,6\n72#1:148,6\n81#1:157,6\n97#1:166,6\n72#1:172\n*E\n"})
    /* renamed from: EI1$b */
    /* loaded from: classes.dex */
    public static final class C1775b extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ int f7201g;

        /* renamed from: h */
        public final /* synthetic */ int f7202h;

        /* renamed from: i */
        public final /* synthetic */ G26 f7203i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1775b(int i, int i2, G26 g26) {
            super(3);
            this.f7201g = i;
            this.f7202h = i2;
            this.f7203i = g26;
        }

        /* renamed from: b */
        public static final Object m109239b(InterfaceC48627sP5<? extends Object> interfaceC48627sP5) {
            return interfaceC48627sP5.getValue();
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m109240a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int m108201b;
            int m106232a;
            Integer valueOf;
            float m29295c;
            float m29295c2;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(408240218);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(408240218, i, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:58)");
            }
            EI1.m109242c(this.f7201g, this.f7202h);
            if (this.f7201g == 1 && this.f7202h == Integer.MAX_VALUE) {
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC32720Et0.mo89605Q();
                return c20912a;
            }
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            AbstractC44199kw1.InterfaceC25559b interfaceC25559b = (AbstractC44199kw1.InterfaceC25559b) interfaceC32720Et0.mo89572c(C42399hu0.m35610i());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            G26 g26 = this.f7203i;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(g26) | interfaceC32720Et0.mo89539n(enumC47065pm2);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = H26.m104477d(g26, enumC47065pm2);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            G26 g262 = (G26) mo89635G;
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
            InterfaceC48627sP5 interfaceC48627sP5 = (InterfaceC48627sP5) mo89635G2;
            Object[] objArr = {interfaceC41273g01, interfaceC25559b, this.f7203i, enumC47065pm2, m109239b(interfaceC48627sP5)};
            interfaceC32720Et0.mo89638F(-568225417);
            boolean z = false;
            for (int i2 = 0; i2 < 5; i2++) {
                z |= interfaceC32720Et0.mo89539n(objArr[i2]);
            }
            Object mo89635G3 = interfaceC32720Et0.mo89635G();
            if (z || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G3 = Integer.valueOf(G52.m105830f(C43067j16.m31240a(g262, interfaceC41273g01, interfaceC25559b, C43067j16.m31238c(), 1)));
                interfaceC32720Et0.mo89503z(mo89635G3);
            }
            interfaceC32720Et0.mo89605Q();
            int intValue = ((Number) mo89635G3).intValue();
            Object[] objArr2 = {interfaceC41273g01, interfaceC25559b, this.f7203i, enumC47065pm2, m109239b(interfaceC48627sP5)};
            interfaceC32720Et0.mo89638F(-568225417);
            boolean z2 = false;
            for (int i3 = 0; i3 < 5; i3++) {
                z2 |= interfaceC32720Et0.mo89539n(objArr2[i3]);
            }
            Object mo89635G4 = interfaceC32720Et0.mo89635G();
            if (z2 || mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G4 = Integer.valueOf(G52.m105830f(C43067j16.m31240a(g262, interfaceC41273g01, interfaceC25559b, C43067j16.m31238c() + '\n' + C43067j16.m31238c(), 2)));
                interfaceC32720Et0.mo89503z(mo89635G4);
            }
            interfaceC32720Et0.mo89605Q();
            int intValue2 = ((Number) mo89635G4).intValue() - intValue;
            int i4 = this.f7201g;
            Integer num = null;
            if (i4 == 1) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(((i4 - 1) * intValue2) + intValue);
            }
            int i5 = this.f7202h;
            if (i5 != Integer.MAX_VALUE) {
                num = Integer.valueOf(intValue + (intValue2 * (i5 - 1)));
            }
            InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
            if (valueOf != null) {
                m29295c = interfaceC41273g01.mo3398w(valueOf.intValue());
            } else {
                m29295c = C43705k61.f93903c.m29295c();
            }
            if (num != null) {
                m29295c2 = interfaceC41273g01.mo3398w(num.intValue());
            } else {
                m29295c2 = C43705k61.f93903c.m29295c();
            }
            InterfaceC41563gV2 m114253p = BB5.m114253p(c20912a2, m29295c, m29295c2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m114253p;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m109240a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m109244a(InterfaceC41563gV2 interfaceC41563gV2, G26 textStyle, int i, int i2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        if (K32.m99301c()) {
            m99303a = new C1774a(i, i2, textStyle);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C1775b(i, i2, textStyle));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC41563gV2 m109243b(InterfaceC41563gV2 interfaceC41563gV2, G26 g26, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return m109244a(interfaceC41563gV2, g26, i, i2);
    }

    /* renamed from: c */
    public static final void m109242c(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0 && i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > i2) {
                z2 = false;
            }
            if (z2) {
                return;
            }
            throw new IllegalArgumentException(("minLines " + i + " must be less than or equal to maxLines " + i2).toString());
        }
        throw new IllegalArgumentException(("both minLines " + i + " and maxLines " + i2 + " must be greater than zero").toString());
    }
}
