package p000;

import androidx.compose.p003ui.layout.C11335a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C47063pm0;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aÃ\u0001\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aC\u0010!\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a\u0012\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0000\u001a\u0012\u0010'\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0000\"\u001d\u0010,\u001a\u00020(8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\"\u001d\u00101\u001a\u00020-8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b/\u00100\"\u001d\u00103\u001a\u00020-8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b2\u00100\"\u001a\u00108\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107\"\u001a\u0010=\u001a\u0004\u0018\u00010:*\u0002098@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, m28432d2 = {"LE16;", "type", "", "value", "Lkotlin/Function0;", "", "innerTextField", "LEu6;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "", "singleLine", "enabled", "isError", "Le62;", "interactionSource", "LPD3;", "contentPadding", "Ld16;", "colors", "border", C17296a.f69688o, "(LE16;Ljava/lang/String;Lkotlin/jvm/functions/Function2;LEu6;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLe62;LPD3;Ld16;Lkotlin/jvm/functions/Function2;LEt0;III)V", "Lpm0;", "contentColor", "LG26;", "typography", "", "contentAlpha", "content", "b", "(JLG26;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;LEt0;II)V", "LOU3;", "placeable", "", "i", "h", "Lkz0;", "J", "g", "()J", "ZeroConstraints", "Lk61;", "F", "f", "()F", "TextFieldPadding", "c", "HorizontalIconPadding", "LgV2;", DateTokenConverter.CONVERTER_KEY, "LgV2;", "()LgV2;", "IconDefaultSizeModifier", "LX62;", "", "e", "(LX62;)Ljava/lang/Object;", "layoutId", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,374:1\n50#2:375\n49#2:376\n1114#3,6:377\n658#4:383\n646#4:384\n658#4:385\n646#4:386\n154#5:387\n154#5:388\n154#5:389\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n81#1:375\n81#1:376\n81#1:377,6\n112#1:383\n112#1:384\n115#1:385\n115#1:386\n371#1:387\n372#1:388\n374#1:389\n*E\n"})
/* renamed from: m16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44846m16 {

    /* renamed from: a */
    public static final long f97123a = C46007nz0.m22043a(0, 0, 0, 0);

    /* renamed from: b */
    public static final float f97124b = C43705k61.m29303g(16);

    /* renamed from: c */
    public static final float f97125c = C43705k61.m29303g(12);

    /* renamed from: d */
    public static final InterfaceC41563gV2 f97126d;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,374:1\n50#2:375\n49#2:376\n25#2:383\n50#2:390\n49#2:391\n1114#3,6:377\n1114#3,6:384\n1114#3,6:392\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3\n*L\n151#1:375\n151#1:376\n191#1:383\n209#1:390\n209#1:391\n151#1:377,6\n191#1:384,6\n209#1:392,6\n*E\n"})
    /* renamed from: m16$a */
    /* loaded from: classes.dex */
    public static final class C25868a extends Lambda implements Function6<Float, C47063pm0, C47063pm0, Float, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97127g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97128h;

        /* renamed from: i */
        public final /* synthetic */ String f97129i;

        /* renamed from: j */
        public final /* synthetic */ boolean f97130j;

        /* renamed from: k */
        public final /* synthetic */ int f97131k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC39510d16 f97132l;

        /* renamed from: m */
        public final /* synthetic */ boolean f97133m;

        /* renamed from: n */
        public final /* synthetic */ InterfaceC40148e62 f97134n;

        /* renamed from: o */
        public final /* synthetic */ int f97135o;

        /* renamed from: p */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97136p;

        /* renamed from: q */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97137q;

        /* renamed from: r */
        public final /* synthetic */ E16 f97138r;

        /* renamed from: s */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97139s;

        /* renamed from: t */
        public final /* synthetic */ boolean f97140t;

        /* renamed from: u */
        public final /* synthetic */ PD3 f97141u;

        /* renamed from: v */
        public final /* synthetic */ boolean f97142v;

        /* renamed from: w */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97143w;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: m16$a$a */
        /* loaded from: classes.dex */
        public static final class C25869a extends Lambda implements Function1<C51465xB5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ float f97144g;

            /* renamed from: h */
            public final /* synthetic */ EX2<C51465xB5> f97145h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25869a(float f, EX2<C51465xB5> ex2) {
                super(1);
                this.f97144g = f;
                this.f97145h = ex2;
            }

            /* renamed from: a */
            public final void m26471a(long j) {
                boolean z;
                float m5730i = C51465xB5.m5730i(j) * this.f97144g;
                float m5732g = C51465xB5.m5732g(j) * this.f97144g;
                boolean z2 = true;
                if (C51465xB5.m5730i(this.f97145h.getValue().m5725n()) == m5730i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (C51465xB5.m5732g(this.f97145h.getValue().m5725n()) != m5732g) {
                        z2 = false;
                    }
                    if (z2) {
                        return;
                    }
                }
                this.f97145h.setValue(C51465xB5.m5736c(CB5.m112663a(m5730i, m5732g)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C51465xB5 c51465xB5) {
                m26471a(c51465xB5.m5725n());
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: m16$a$b */
        /* loaded from: classes.dex */
        public /* synthetic */ class C25870b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[E16.values().length];
                try {
                    iArr[E16.Filled.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[E16.Outlined.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: m16$a$c */
        /* loaded from: classes.dex */
        public static final class C25871c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ float f97146g;

            /* renamed from: h */
            public final /* synthetic */ long f97147h;

            /* renamed from: i */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97148i;

            /* renamed from: j */
            public final /* synthetic */ int f97149j;

            /* renamed from: k */
            public final /* synthetic */ boolean f97150k;

            /* renamed from: l */
            public final /* synthetic */ long f97151l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C25871c(float f, long j, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, boolean z, long j2) {
                super(2);
                this.f97146g = f;
                this.f97147h = j;
                this.f97148i = function2;
                this.f97149j = i;
                this.f97150k = z;
                this.f97151l = j2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                G26 g26;
                G26 m105923b;
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(362863774, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)");
                }
                TM2 tm2 = TM2.f35372a;
                G26 m104478c = H26.m104478c(tm2.m83729c(interfaceC32720Et0, 6).m104957k(), tm2.m83729c(interfaceC32720Et0, 6).m104962f(), this.f97146g);
                boolean z = this.f97150k;
                long j = this.f97151l;
                if (z) {
                    m105923b = m104478c.m105923b((r46 & 1) != 0 ? m104478c.f10827a.m105168g() : j, (r46 & 2) != 0 ? m104478c.f10827a.m105164k() : 0L, (r46 & 4) != 0 ? m104478c.f10827a.m105161n() : null, (r46 & 8) != 0 ? m104478c.f10827a.m105163l() : null, (r46 & 16) != 0 ? m104478c.f10827a.m105162m() : null, (r46 & 32) != 0 ? m104478c.f10827a.m105166i() : null, (r46 & 64) != 0 ? m104478c.f10827a.m105165j() : null, (r46 & 128) != 0 ? m104478c.f10827a.m105160o() : 0L, (r46 & 256) != 0 ? m104478c.f10827a.m105170e() : null, (r46 & 512) != 0 ? m104478c.f10827a.m105154u() : null, (r46 & 1024) != 0 ? m104478c.f10827a.m105159p() : null, (r46 & 2048) != 0 ? m104478c.f10827a.m105171d() : 0L, (r46 & 4096) != 0 ? m104478c.f10827a.m105156s() : null, (r46 & 8192) != 0 ? m104478c.f10827a.m105157r() : null, (r46 & 16384) != 0 ? m104478c.f10828b.m110652j() : null, (r46 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m104478c.f10828b.m110650l() : null, (r46 & 65536) != 0 ? m104478c.f10828b.m110655g() : 0L, (r46 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m104478c.f10828b.m110649m() : null, (r46 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? m104478c.f10829c : null, (r46 & 524288) != 0 ? m104478c.f10828b.m110654h() : null, (r46 & 1048576) != 0 ? m104478c.f10828b.m110657e() : null, (r46 & 2097152) != 0 ? m104478c.f10828b.m110659c() : null);
                    g26 = m105923b;
                } else {
                    g26 = m104478c;
                }
                C44846m16.m26480b(this.f97147h, g26, null, this.f97148i, interfaceC32720Et0, ((this.f97149j >> 6) & 14) | 384, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: m16$a$d */
        /* loaded from: classes.dex */
        public static final class C25872d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ long f97152g;

            /* renamed from: h */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97153h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C25872d(long j, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
                super(2);
                this.f97152g = j;
                this.f97153h = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1505327088, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:158)");
                }
                C44846m16.m26480b(this.f97152g, null, null, this.f97153h, interfaceC32720Et0, 0, 6);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,374:1\n67#2,6:375\n73#2:407\n77#2:412\n75#3:381\n76#3,11:383\n89#3:411\n76#4:382\n460#5,13:394\n473#5,3:408\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1\n*L\n137#1:375,6\n137#1:407\n137#1:412\n137#1:381\n137#1:383,11\n137#1:411\n137#1:382\n137#1:394,13\n137#1:408,3\n*E\n"})
        /* renamed from: m16$a$e */
        /* loaded from: classes.dex */
        public static final class C25873e extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ float f97154g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC39510d16 f97155h;

            /* renamed from: i */
            public final /* synthetic */ boolean f97156i;

            /* renamed from: j */
            public final /* synthetic */ int f97157j;

            /* renamed from: k */
            public final /* synthetic */ int f97158k;

            /* renamed from: l */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97159l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C25873e(float f, InterfaceC39510d16 interfaceC39510d16, boolean z, int i, int i2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
                super(3);
                this.f97154g = f;
                this.f97155h = interfaceC39510d16;
                this.f97156i = z;
                this.f97157j = i;
                this.f97158k = i2;
                this.f97159l = function2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC41563gV2 modifier, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                int i2;
                Intrinsics.checkNotNullParameter(modifier, "modifier");
                if ((i & 14) == 0) {
                    i2 = (interfaceC32720Et0.mo89539n(modifier) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1120552650, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:135)");
                }
                InterfaceC41563gV2 m81909a = C8203U9.m81909a(modifier, this.f97154g);
                InterfaceC39510d16 interfaceC39510d16 = this.f97155h;
                boolean z = this.f97156i;
                int i3 = this.f97157j;
                int i4 = this.f97158k;
                Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f97159l;
                interfaceC32720Et0.mo89638F(733328855);
                InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m81909a);
                if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                interfaceC32720Et0.mo89557h();
                if (interfaceC32720Et0.mo89521t()) {
                    interfaceC32720Et0.mo89617M(m113415a);
                } else {
                    interfaceC32720Et0.mo89566e();
                }
                interfaceC32720Et0.mo89620L();
                InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
                C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                interfaceC32720Et0.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89638F(2058660585);
                C40689f10 c40689f10 = C40689f10.f79291a;
                C44846m16.m26480b(interfaceC39510d16.mo44715b(z, interfaceC32720Et0, ((i3 >> 27) & 14) | ((i4 >> 6) & 112)).getValue().m18733w(), TM2.f35372a.m83729c(interfaceC32720Et0, 6).m104957k(), null, function2, interfaceC32720Et0, (i3 >> 6) & 7168, 4);
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89563f();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: m16$a$f */
        /* loaded from: classes.dex */
        public static final class C25874f extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ long f97160g;

            /* renamed from: h */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97161h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C25874f(long j, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
                super(2);
                this.f97160g = j;
                this.f97161h = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1894727196, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:169)");
                }
                C44846m16.m26480b(this.f97160g, null, null, this.f97161h, interfaceC32720Et0, 0, 6);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: m16$a$g */
        /* loaded from: classes.dex */
        public static final class C25875g extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ boolean f97162g;

            /* renamed from: h */
            public final /* synthetic */ String f97163h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25875g(boolean z, String str) {
                super(1);
                this.f97162g = z;
                this.f97163h = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
                invoke2(interfaceC48906ss5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC48906ss5 semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (this.f97162g) {
                    C47128ps5.m18588k(semantics, this.f97163h);
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$drawBorder$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,374:1\n67#2,6:375\n73#2:407\n77#2:412\n75#3:381\n76#3,11:383\n89#3:411\n76#4:382\n460#5,13:394\n473#5,3:408\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$drawBorder$1\n*L\n193#1:375,6\n193#1:407\n193#1:412\n193#1:381\n193#1:383,11\n193#1:411\n193#1:382\n193#1:394,13\n193#1:408,3\n*E\n"})
        /* renamed from: m16$a$h */
        /* loaded from: classes.dex */
        public static final class C25876h extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ EX2<C51465xB5> f97164g;

            /* renamed from: h */
            public final /* synthetic */ PD3 f97165h;

            /* renamed from: i */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97166i;

            /* renamed from: j */
            public final /* synthetic */ int f97167j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C25876h(EX2<C51465xB5> ex2, PD3 pd3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
                super(2);
                this.f97164g = ex2;
                this.f97165h = pd3;
                this.f97166i = function2;
                this.f97167j = i;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(139886979, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:191)");
                }
                InterfaceC41563gV2 m89184j = C35351Pz3.m89184j(C11335a.m68614b(InterfaceC41563gV2.f82354b0, "border"), this.f97164g.getValue().m5725n(), this.f97165h);
                Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f97166i;
                int i2 = this.f97167j;
                interfaceC32720Et0.mo89638F(733328855);
                InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), true, interfaceC32720Et0, 48);
                interfaceC32720Et0.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m89184j);
                if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                interfaceC32720Et0.mo89557h();
                if (interfaceC32720Et0.mo89521t()) {
                    interfaceC32720Et0.mo89617M(m113415a);
                } else {
                    interfaceC32720Et0.mo89566e();
                }
                interfaceC32720Et0.mo89620L();
                InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
                C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                interfaceC32720Et0.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89638F(2058660585);
                C40689f10 c40689f10 = C40689f10.f79291a;
                interfaceC32720Et0.mo89638F(1661576453);
                if (function2 != null) {
                    function2.invoke(interfaceC32720Et0, Integer.valueOf((i2 >> 12) & 14));
                }
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89563f();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25868a(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, String str, boolean z, int i, InterfaceC39510d16 interfaceC39510d16, boolean z2, InterfaceC40148e62 interfaceC40148e62, int i2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, E16 e16, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function25, boolean z3, PD3 pd3, boolean z4, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function26) {
            super(6);
            this.f97127g = function2;
            this.f97128h = function22;
            this.f97129i = str;
            this.f97130j = z;
            this.f97131k = i;
            this.f97132l = interfaceC39510d16;
            this.f97133m = z2;
            this.f97134n = interfaceC40148e62;
            this.f97135o = i2;
            this.f97136p = function23;
            this.f97137q = function24;
            this.f97138r = e16;
            this.f97139s = function25;
            this.f97140t = z3;
            this.f97141u = pd3;
            this.f97142v = z4;
            this.f97143w = function26;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x02c9  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0307  */
        /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m26472a(float f, long j, long j2, float f2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int i2;
            ?? r14;
            InterfaceC42389ht0 interfaceC42389ht0;
            InterfaceC42389ht0 interfaceC42389ht02;
            boolean mo89539n;
            Object mo89635G;
            long m18733w;
            long m18733w2;
            int i3;
            if ((i & 14) == 0) {
                i2 = (interfaceC32720Et0.mo89533p(f) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 112) == 0) {
                i2 |= interfaceC32720Et0.mo89524s(j) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                i2 |= interfaceC32720Et0.mo89524s(j2) ? 256 : 128;
            }
            if ((i & 7168) == 0) {
                i2 |= interfaceC32720Et0.mo89533p(f2) ? 2048 : 1024;
            }
            int i4 = i2;
            if ((46811 & i4) == 9362 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(341865432, i4, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:118)");
            }
            Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f97127g;
            if (function2 != null) {
                r14 = 1;
                interfaceC42389ht0 = C43575jt0.m29791b(interfaceC32720Et0, 362863774, true, new C25871c(f, j2, function2, i4, this.f97142v, j));
            } else {
                r14 = 1;
                interfaceC42389ht0 = null;
            }
            if (this.f97128h != null) {
                if (this.f97129i.length() == 0 ? r14 : false) {
                    interfaceC42389ht02 = C43575jt0.m29791b(interfaceC32720Et0, 1120552650, r14, new C25873e(f2, this.f97132l, this.f97133m, this.f97135o, this.f97131k, this.f97128h));
                    String m17501a = C47469qS5.m17501a(C45690nS5.f99991a.m23662c(), interfaceC32720Et0, 6);
                    InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                    Object valueOf = Boolean.valueOf(this.f97130j);
                    boolean z = this.f97130j;
                    interfaceC32720Et0.mo89638F(511388516);
                    mo89539n = interfaceC32720Et0.mo89539n(valueOf) | interfaceC32720Et0.mo89539n(m17501a);
                    mo89635G = interfaceC32720Et0.mo89635G();
                    if (!mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                        mo89635G = new C25875g(z, m17501a);
                        interfaceC32720Et0.mo89503z(mo89635G);
                    }
                    interfaceC32720Et0.mo89605Q();
                    InterfaceC41563gV2 m40620b = C41198fs5.m40620b(c20912a, false, (Function1) mo89635G, r14, null);
                    if (!(this.f97132l instanceof InterfaceC40102e16)) {
                        interfaceC32720Et0.mo89638F(-1083197894);
                        boolean z2 = this.f97133m;
                        boolean z3 = this.f97130j;
                        InterfaceC40148e62 interfaceC40148e62 = this.f97134n;
                        int i5 = this.f97131k;
                        m18733w = ((InterfaceC40102e16) this.f97132l).m43402c(z2, z3, interfaceC40148e62, interfaceC32720Et0, ((i5 << 3) & 896) | ((this.f97135o >> 27) & 14) | ((i5 << 3) & 112)).getValue().m18733w();
                        interfaceC32720Et0.mo89605Q();
                    } else {
                        interfaceC32720Et0.mo89638F(-1083197798);
                        InterfaceC39510d16 interfaceC39510d16 = this.f97132l;
                        boolean z4 = this.f97133m;
                        boolean z5 = this.f97130j;
                        int i6 = this.f97131k;
                        m18733w = interfaceC39510d16.mo44713e(z4, z5, interfaceC32720Et0, ((this.f97135o >> 27) & 14) | ((i6 << 3) & 112) | ((i6 >> 3) & 896)).getValue().m18733w();
                        interfaceC32720Et0.mo89605Q();
                    }
                    Function2<InterfaceC32720Et0, Integer, Unit> function22 = this.f97136p;
                    InterfaceC42389ht0 m29791b = function22 == null ? C43575jt0.m29791b(interfaceC32720Et0, 1505327088, r14, new C25872d(m18733w, function22)) : null;
                    if (!(this.f97132l instanceof InterfaceC40102e16)) {
                        interfaceC32720Et0.mo89638F(-1083197452);
                        boolean z6 = this.f97133m;
                        boolean z7 = this.f97130j;
                        InterfaceC40148e62 interfaceC40148e622 = this.f97134n;
                        int i7 = this.f97131k;
                        m18733w2 = ((InterfaceC40102e16) this.f97132l).mo43401f(z6, z7, interfaceC40148e622, interfaceC32720Et0, ((i7 << 3) & 896) | ((this.f97135o >> 27) & 14) | ((i7 << 3) & 112)).getValue().m18733w();
                        interfaceC32720Et0.mo89605Q();
                    } else {
                        interfaceC32720Et0.mo89638F(-1083197355);
                        InterfaceC39510d16 interfaceC39510d162 = this.f97132l;
                        boolean z8 = this.f97133m;
                        boolean z9 = this.f97130j;
                        int i8 = this.f97131k;
                        m18733w2 = interfaceC39510d162.mo44710i(z8, z9, interfaceC32720Et0, ((this.f97135o >> 27) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 896)).getValue().m18733w();
                        interfaceC32720Et0.mo89605Q();
                    }
                    Function2<InterfaceC32720Et0, Integer, Unit> function23 = this.f97137q;
                    InterfaceC42389ht0 m29791b2 = function23 == null ? C43575jt0.m29791b(interfaceC32720Et0, -1894727196, r14, new C25874f(m18733w2, function23)) : null;
                    i3 = C25870b.$EnumSwitchMapping$0[this.f97138r.ordinal()];
                    if (i3 != r14) {
                        interfaceC32720Et0.mo89638F(-1083197019);
                        Function2<InterfaceC32720Et0, Integer, Unit> function24 = this.f97139s;
                        boolean z10 = this.f97140t;
                        PD3 pd3 = this.f97141u;
                        int i9 = this.f97135o;
                        C47218q16.m18302c(m40620b, function24, interfaceC42389ht0, interfaceC42389ht02, m29791b, m29791b2, z10, f, pd3, interfaceC32720Et0, ((i9 >> 6) & 3670016) | ((i9 >> 3) & 112) | ((i4 << 21) & 29360128) | ((this.f97131k << 18) & 234881024));
                        interfaceC32720Et0.mo89605Q();
                    } else if (i3 != 2) {
                        interfaceC32720Et0.mo89638F(-1083194976);
                        interfaceC32720Et0.mo89605Q();
                    } else {
                        interfaceC32720Et0.mo89638F(-1083196463);
                        interfaceC32720Et0.mo89638F(-492369756);
                        Object mo89635G2 = interfaceC32720Et0.mo89635G();
                        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
                        if (mo89635G2 == c2012a.m108267a()) {
                            mo89635G2 = LM5.m97025e(C51465xB5.m5736c(C51465xB5.f117175b.m5723b()), null, 2, null);
                            interfaceC32720Et0.mo89503z(mo89635G2);
                        }
                        interfaceC32720Et0.mo89605Q();
                        EX2 ex2 = (EX2) mo89635G2;
                        InterfaceC42389ht0 m29791b3 = C43575jt0.m29791b(interfaceC32720Et0, 139886979, r14, new C25876h(ex2, this.f97141u, this.f97143w, this.f97131k));
                        Function2<InterfaceC32720Et0, Integer, Unit> function25 = this.f97139s;
                        boolean z11 = this.f97140t;
                        Object valueOf2 = Float.valueOf(f);
                        interfaceC32720Et0.mo89638F(511388516);
                        boolean mo89539n2 = interfaceC32720Et0.mo89539n(valueOf2) | interfaceC32720Et0.mo89539n(ex2);
                        Object mo89635G3 = interfaceC32720Et0.mo89635G();
                        if (mo89539n2 || mo89635G3 == c2012a.m108267a()) {
                            mo89635G3 = new C25869a(f, ex2);
                            interfaceC32720Et0.mo89503z(mo89635G3);
                        }
                        interfaceC32720Et0.mo89605Q();
                        PD3 pd32 = this.f97141u;
                        int i10 = this.f97135o;
                        C35351Pz3.m89191c(m40620b, function25, interfaceC42389ht02, interfaceC42389ht0, m29791b, m29791b2, z11, f, (Function1) mo89635G3, m29791b3, pd32, interfaceC32720Et0, ((i10 >> 6) & 3670016) | ((i10 >> 3) & 112) | 805306368 | ((i4 << 21) & 29360128), (this.f97131k >> 6) & 14);
                        interfaceC32720Et0.mo89605Q();
                    }
                    if (C35528Qt0.m87827O()) {
                        return;
                    }
                    C35528Qt0.m87817Y();
                    return;
                }
            }
            interfaceC42389ht02 = null;
            String m17501a2 = C47469qS5.m17501a(C45690nS5.f99991a.m23662c(), interfaceC32720Et0, 6);
            InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
            Object valueOf3 = Boolean.valueOf(this.f97130j);
            boolean z12 = this.f97130j;
            interfaceC32720Et0.mo89638F(511388516);
            mo89539n = interfaceC32720Et0.mo89539n(valueOf3) | interfaceC32720Et0.mo89539n(m17501a2);
            mo89635G = interfaceC32720Et0.mo89635G();
            if (!mo89539n) {
            }
            mo89635G = new C25875g(z12, m17501a2);
            interfaceC32720Et0.mo89503z(mo89635G);
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m40620b2 = C41198fs5.m40620b(c20912a2, false, (Function1) mo89635G, r14, null);
            if (!(this.f97132l instanceof InterfaceC40102e16)) {
            }
            Function2<InterfaceC32720Et0, Integer, Unit> function222 = this.f97136p;
            if (function222 == null) {
            }
            if (!(this.f97132l instanceof InterfaceC40102e16)) {
            }
            Function2<InterfaceC32720Et0, Integer, Unit> function232 = this.f97137q;
            if (function232 == null) {
            }
            i3 = C25870b.$EnumSwitchMapping$0[this.f97138r.ordinal()];
            if (i3 != r14) {
            }
            if (C35528Qt0.m87827O()) {
            }
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(Float f, C47063pm0 c47063pm0, C47063pm0 c47063pm02, Float f2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            m26472a(f.floatValue(), c47063pm0.m18733w(), c47063pm02.m18733w(), f2.floatValue(), interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: m16$b */
    /* loaded from: classes.dex */
    public static final class C25877b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ E16 f97168g;

        /* renamed from: h */
        public final /* synthetic */ String f97169h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97170i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC32735Eu6 f97171j;

        /* renamed from: k */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97172k;

        /* renamed from: l */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97173l;

        /* renamed from: m */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97174m;

        /* renamed from: n */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97175n;

        /* renamed from: o */
        public final /* synthetic */ boolean f97176o;

        /* renamed from: p */
        public final /* synthetic */ boolean f97177p;

        /* renamed from: q */
        public final /* synthetic */ boolean f97178q;

        /* renamed from: r */
        public final /* synthetic */ InterfaceC40148e62 f97179r;

        /* renamed from: s */
        public final /* synthetic */ PD3 f97180s;

        /* renamed from: t */
        public final /* synthetic */ InterfaceC39510d16 f97181t;

        /* renamed from: u */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97182u;

        /* renamed from: v */
        public final /* synthetic */ int f97183v;

        /* renamed from: w */
        public final /* synthetic */ int f97184w;

        /* renamed from: x */
        public final /* synthetic */ int f97185x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25877b(E16 e16, String str, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, InterfaceC32735Eu6 interfaceC32735Eu6, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function25, boolean z, boolean z2, boolean z3, InterfaceC40148e62 interfaceC40148e62, PD3 pd3, InterfaceC39510d16 interfaceC39510d16, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function26, int i, int i2, int i3) {
            super(2);
            this.f97168g = e16;
            this.f97169h = str;
            this.f97170i = function2;
            this.f97171j = interfaceC32735Eu6;
            this.f97172k = function22;
            this.f97173l = function23;
            this.f97174m = function24;
            this.f97175n = function25;
            this.f97176o = z;
            this.f97177p = z2;
            this.f97178q = z3;
            this.f97179r = interfaceC40148e62;
            this.f97180s = pd3;
            this.f97181t = interfaceC39510d16;
            this.f97182u = function26;
            this.f97183v = i;
            this.f97184w = i2;
            this.f97185x = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C44846m16.m26481a(this.f97168g, this.f97169h, this.f97170i, this.f97171j, this.f97172k, this.f97173l, this.f97174m, this.f97175n, this.f97176o, this.f97177p, this.f97178q, this.f97179r, this.f97180s, this.f97181t, this.f97182u, interfaceC32720Et0, C47127ps4.m18626a(this.f97183v | 1), C47127ps4.m18626a(this.f97184w), this.f97185x);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: m16$c */
    /* loaded from: classes.dex */
    public static final class C25878c extends Lambda implements Function3<EnumC46048o32, InterfaceC32720Et0, Integer, C47063pm0> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC39510d16 f97186g;

        /* renamed from: h */
        public final /* synthetic */ boolean f97187h;

        /* renamed from: i */
        public final /* synthetic */ boolean f97188i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC40148e62 f97189j;

        /* renamed from: k */
        public final /* synthetic */ int f97190k;

        /* renamed from: l */
        public final /* synthetic */ int f97191l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25878c(InterfaceC39510d16 interfaceC39510d16, boolean z, boolean z2, InterfaceC40148e62 interfaceC40148e62, int i, int i2) {
            super(3);
            this.f97186g = interfaceC39510d16;
            this.f97187h = z;
            this.f97188i = z2;
            this.f97189j = interfaceC40148e62;
            this.f97190k = i;
            this.f97191l = i2;
        }

        /* renamed from: a */
        public final long m26470a(EnumC46048o32 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            interfaceC32720Et0.mo89638F(697243846);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(697243846, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
            }
            InterfaceC39510d16 interfaceC39510d16 = this.f97186g;
            boolean z2 = this.f97187h;
            if (it == EnumC46048o32.UnfocusedEmpty) {
                z = false;
            } else {
                z = this.f97188i;
            }
            InterfaceC40148e62 interfaceC40148e62 = this.f97189j;
            int i2 = this.f97191l;
            long m18733w = interfaceC39510d16.mo44711h(z2, z, interfaceC40148e62, interfaceC32720Et0, ((this.f97190k >> 27) & 14) | ((i2 << 3) & 896) | (i2 & 7168)).getValue().m18733w();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m18733w;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C47063pm0 invoke(EnumC46048o32 enumC46048o32, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return C47063pm0.m18747i(m26470a(enumC46048o32, interfaceC32720Et0, num.intValue()));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: m16$d */
    /* loaded from: classes.dex */
    public static final class C25879d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f97192g;

        /* renamed from: h */
        public final /* synthetic */ G26 f97193h;

        /* renamed from: i */
        public final /* synthetic */ Float f97194i;

        /* renamed from: j */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97195j;

        /* renamed from: k */
        public final /* synthetic */ int f97196k;

        /* renamed from: l */
        public final /* synthetic */ int f97197l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25879d(long j, G26 g26, Float f, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f97192g = j;
            this.f97193h = g26;
            this.f97194i = f;
            this.f97195j = function2;
            this.f97196k = i;
            this.f97197l = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C44846m16.m26480b(this.f97192g, this.f97193h, this.f97194i, this.f97195j, interfaceC32720Et0, C47127ps4.m18626a(this.f97196k | 1), this.f97197l);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: m16$e */
    /* loaded from: classes.dex */
    public static final class C25880e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f97198g;

        /* renamed from: h */
        public final /* synthetic */ Float f97199h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97200i;

        /* renamed from: j */
        public final /* synthetic */ int f97201j;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: m16$e$a */
        /* loaded from: classes.dex */
        public static final class C25881a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Float f97202g;

            /* renamed from: h */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f97203h;

            /* renamed from: i */
            public final /* synthetic */ int f97204i;

            /* renamed from: j */
            public final /* synthetic */ long f97205j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C25881a(Float f, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, long j) {
                super(2);
                this.f97202g = f;
                this.f97203h = function2;
                this.f97204i = i;
                this.f97205j = j;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1132188434, i, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:238)");
                }
                if (this.f97202g != null) {
                    interfaceC32720Et0.mo89638F(-452622131);
                    C41806gu0.m37353a(new W94[]{C37220Xz0.m75931a().m81907c(this.f97202g)}, this.f97203h, interfaceC32720Et0, ((this.f97204i >> 6) & 112) | 8);
                    interfaceC32720Et0.mo89605Q();
                } else {
                    interfaceC32720Et0.mo89638F(-452621951);
                    C41806gu0.m37353a(new W94[]{C37220Xz0.m75931a().m81907c(Float.valueOf(C47063pm0.m18740p(this.f97205j)))}, this.f97203h, interfaceC32720Et0, ((this.f97204i >> 6) & 112) | 8);
                    interfaceC32720Et0.mo89605Q();
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25880e(long j, Float f, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f97198g = j;
            this.f97199h = f;
            this.f97200i = function2;
            this.f97201j = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(494684590, i, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:237)");
            }
            C41806gu0.m37353a(new W94[]{C41372gA0.m39962a().m81907c(C47063pm0.m18747i(this.f97198g))}, C43575jt0.m29791b(interfaceC32720Et0, -1132188434, true, new C25881a(this.f97199h, this.f97200i, this.f97201j, this.f97198g)), interfaceC32720Et0, 56);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    static {
        float f = 48;
        f97126d = BB5.m114262g(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(f), C43705k61.m29303g(f));
    }

    /* renamed from: a */
    public static final void m26481a(E16 type, String value, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> innerTextField, InterfaceC32735Eu6 visualTransformation, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, boolean z, boolean z2, boolean z3, InterfaceC40148e62 interactionSource, PD3 contentPadding, InterfaceC39510d16 colors, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function25, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2, int i3) {
        int i4;
        int i5;
        EnumC46048o32 enumC46048o32;
        InterfaceC32720Et0 interfaceC32720Et02;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function26;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function27;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function28;
        boolean z4;
        boolean z5;
        boolean z6;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function29;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(colors, "colors");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-712568069);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (mo89518u.mo89539n(type) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= mo89518u.mo89539n(value) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= mo89518u.mo89629I(innerTextField) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= mo89518u.mo89539n(visualTransformation) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i) == 0) {
            i4 |= mo89518u.mo89629I(function2) ? 16384 : 8192;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= ImageMetadata.EDGE_MODE;
        } else if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
            i4 |= mo89518u.mo89629I(function22) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
        }
        int i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
        } else if ((i & 3670016) == 0) {
            i4 |= mo89518u.mo89629I(function23) ? 1048576 : 524288;
        }
        int i8 = i3 & 128;
        if (i8 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i4 |= mo89518u.mo89629I(function24) ? 8388608 : 4194304;
        }
        int i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i4 |= mo89518u.mo89536o(z) ? 67108864 : 33554432;
        }
        int i10 = i3 & 512;
        if (i10 != 0) {
            i4 |= 805306368;
        } else if ((i & 1879048192) == 0) {
            i4 |= mo89518u.mo89536o(z2) ? 536870912 : 268435456;
        }
        int i11 = i3 & 1024;
        if (i11 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = i2 | (mo89518u.mo89536o(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i3 & 2048) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= mo89518u.mo89539n(interactionSource) ? 32 : 16;
        }
        int i12 = i5;
        if ((i3 & 4096) != 0) {
            i12 |= 384;
        } else if ((i2 & 896) == 0) {
            i12 |= mo89518u.mo89539n(contentPadding) ? 256 : 128;
        }
        if ((i3 & 8192) != 0) {
            i12 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i12 |= mo89518u.mo89539n(colors) ? 2048 : 1024;
        }
        int i13 = i3 & 16384;
        if (i13 != 0) {
            i12 |= 24576;
        } else if ((i2 & 57344) == 0) {
            i12 |= mo89518u.mo89629I(function25) ? 16384 : 8192;
        }
        if ((i4 & 1533916891) == 306783378 && (46811 & i12) == 9362 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            function26 = function22;
            function27 = function23;
            function28 = function24;
            z4 = z;
            z5 = z2;
            z6 = z3;
            function29 = function25;
            interfaceC32720Et02 = mo89518u;
        } else {
            Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function210 = i6 != 0 ? null : function22;
            Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function211 = i7 != 0 ? null : function23;
            Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function212 = i8 != 0 ? null : function24;
            boolean z7 = i9 != 0 ? false : z;
            boolean z8 = i10 != 0 ? true : z2;
            boolean z9 = i11 != 0 ? false : z3;
            Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function213 = i13 != 0 ? null : function25;
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-712568069, i4, i12, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:63)");
            }
            mo89518u.mo89638F(511388516);
            boolean mo89539n = mo89518u.mo89539n(value) | mo89518u.mo89539n(visualTransformation);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = visualTransformation.filter(new C1577Df(value, null, null, 6, null));
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            String m110052j = ((A96) mo89635G).m116051b().m110052j();
            if (C53082zv1.m116a(interactionSource, mo89518u, (i12 >> 3) & 14).getValue().booleanValue()) {
                enumC46048o32 = EnumC46048o32.Focused;
            } else {
                enumC46048o32 = m110052j.length() == 0 ? EnumC46048o32.UnfocusedEmpty : EnumC46048o32.UnfocusedNotEmpty;
            }
            EnumC46048o32 enumC46048o322 = enumC46048o32;
            int i14 = i4;
            C25878c c25878c = new C25878c(colors, z8, z9, interactionSource, i14, i12);
            TM2 tm2 = TM2.f35372a;
            C33041Gc6 m83729c = tm2.m83729c(mo89518u, 6);
            G26 m104957k = m83729c.m104957k();
            G26 m104962f = m83729c.m104962f();
            long m105915j = m104957k.m105915j();
            C47063pm0.C27386a c27386a = C47063pm0.f104050b;
            boolean z10 = (C47063pm0.m18741o(m105915j, c27386a.m18726g()) && !C47063pm0.m18741o(m104962f.m105915j(), c27386a.m18726g())) || (!C47063pm0.m18741o(m104957k.m105915j(), c27386a.m18726g()) && C47063pm0.m18741o(m104962f.m105915j(), c27386a.m18726g()));
            D16 d16 = D16.f5084a;
            mo89518u.mo89638F(2129141006);
            long m105915j2 = tm2.m83729c(mo89518u, 6).m104962f().m105915j();
            if (z10) {
                if (!(m105915j2 != c27386a.m18726g())) {
                    m105915j2 = c25878c.invoke(enumC46048o322, mo89518u, 0).m18733w();
                }
            }
            long j = m105915j2;
            mo89518u.mo89605Q();
            mo89518u.mo89638F(2129141197);
            long m105915j3 = tm2.m83729c(mo89518u, 6).m104957k().m105915j();
            if (z10) {
                if (!(m105915j3 != c27386a.m18726g())) {
                    m105915j3 = c25878c.invoke(enumC46048o322, mo89518u, 0).m18733w();
                }
            }
            long j2 = m105915j3;
            mo89518u.mo89605Q();
            interfaceC32720Et02 = mo89518u;
            d16.m111038a(enumC46048o322, j, j2, c25878c, function2 != null, C43575jt0.m29791b(interfaceC32720Et02, 341865432, true, new C25868a(function2, function210, m110052j, z9, i12, colors, z8, interactionSource, i14, function211, function212, type, innerTextField, z7, contentPadding, z10, function213)), interfaceC32720Et02, 1769472);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            function26 = function210;
            function27 = function211;
            function28 = function212;
            z4 = z7;
            z5 = z8;
            z6 = z9;
            function29 = function213;
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new C25877b(type, value, innerTextField, visualTransformation, function2, function26, function27, function28, z4, z5, z6, interactionSource, contentPadding, colors, function29, i, i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26480b(long j, G26 g26, Float f, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        Object obj2;
        int i7;
        int i8;
        int i9;
        G26 g262;
        Object obj3;
        Float f2;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-399493340);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89524s(j)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = g26;
            if (mo89518u.mo89539n(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i2 & 4;
            if (i6 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = f;
                if (mo89518u.mo89539n(obj2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (mo89518u.mo89629I(content)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((i9 & 5851) != 1170 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    f2 = obj2;
                } else {
                    if (i10 != 0) {
                        g262 = null;
                    } else {
                        g262 = obj;
                    }
                    if (i6 != 0) {
                        obj3 = null;
                    } else {
                        obj3 = obj2;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(-399493340, i9, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:231)");
                    }
                    InterfaceC42389ht0 m29791b = C43575jt0.m29791b(mo89518u, 494684590, true, new C25880e(j, obj3, content, i9));
                    if (g262 != null) {
                        mo89518u.mo89638F(-2009952864);
                        C38909c26.m62004a(g262, m29791b, mo89518u, ((i9 >> 3) & 14) | 48);
                    } else {
                        mo89518u.mo89638F(-2009952812);
                        m29791b.invoke(mo89518u, 6);
                    }
                    mo89518u.mo89605Q();
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    obj = g262;
                    f2 = obj3;
                }
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new C25879d(j, obj, f2, content, i, i2));
                    return;
                }
                return;
            }
            obj2 = f;
            if ((i2 & 8) != 0) {
            }
            i9 = i3;
            if ((i9 & 5851) != 1170) {
            }
            if (i10 != 0) {
            }
            if (i6 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            InterfaceC42389ht0 m29791b2 = C43575jt0.m29791b(mo89518u, 494684590, true, new C25880e(j, obj3, content, i9));
            if (g262 != null) {
            }
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
            }
            obj = g262;
            f2 = obj3;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        obj = g26;
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        obj2 = f;
        if ((i2 & 8) != 0) {
        }
        i9 = i3;
        if ((i9 & 5851) != 1170) {
        }
        if (i10 != 0) {
        }
        if (i6 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        InterfaceC42389ht0 m29791b22 = C43575jt0.m29791b(mo89518u, 494684590, true, new C25880e(j, obj3, content, i9));
        if (g262 != null) {
        }
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        obj = g262;
        f2 = obj3;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* renamed from: c */
    public static final float m26479c() {
        return f97125c;
    }

    /* renamed from: d */
    public static final InterfaceC41563gV2 m26478d() {
        return f97126d;
    }

    /* renamed from: e */
    public static final Object m26477e(X62 x62) {
        InterfaceC48843sm2 interfaceC48843sm2;
        Intrinsics.checkNotNullParameter(x62, "<this>");
        Object mo77401c = x62.mo77401c();
        if (mo77401c instanceof InterfaceC48843sm2) {
            interfaceC48843sm2 = (InterfaceC48843sm2) mo77401c;
        } else {
            interfaceC48843sm2 = null;
        }
        if (interfaceC48843sm2 == null) {
            return null;
        }
        return interfaceC48843sm2.getLayoutId();
    }

    /* renamed from: f */
    public static final float m26476f() {
        return f97124b;
    }

    /* renamed from: g */
    public static final long m26475g() {
        return f97123a;
    }

    /* renamed from: h */
    public static final int m26474h(OU3 ou3) {
        if (ou3 != null) {
            return ou3.m92229d1();
        }
        return 0;
    }

    /* renamed from: i */
    public static final int m26473i(OU3 ou3) {
        if (ou3 != null) {
            return ou3.m92226i1();
        }
        return 0;
    }
}
