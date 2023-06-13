package p000;

import androidx.compose.p003ui.graphics.C11327b;
import androidx.compose.p003ui.graphics.C11333f;
import androidx.compose.p003ui.graphics.InterfaceC11328c;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.F96;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aQ\u0010\r\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0017\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u0015\"\u001d\u0010\u001a\u001a\u00020\u00148\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001c\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015\"\u001d\u0010\u001f\u001a\u00020\u00148\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0019\"\u0017\u0010!\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010\u0015\"\u0017\u0010\"\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015\"\u0017\u0010#\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m28432d2 = {"LKX2;", "", "expandedStates", "LEX2;", "Landroidx/compose/ui/graphics/f;", "transformOriginState", "LgV2;", "modifier", "Lkotlin/Function1;", "LPm0;", "", "Lkotlin/ExtensionFunctionType;", "content", C17296a.f69688o, "(LKX2;LEX2;LgV2;Lkotlin/jvm/functions/Function3;LEt0;II)V", "LD52;", "parentBounds", "menuBounds", "f", "(LD52;LD52;)J", "Lk61;", "F", "MenuElevation", "b", "h", "()F", "MenuVerticalMargin", "c", "DropdownMenuItemHorizontalPadding", DateTokenConverter.CONVERTER_KEY, "g", "DropdownMenuVerticalPadding", "e", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemDefaultMaxWidth", "DropdownMenuItemDefaultMinHeight", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,298:1\n931#2,4:299\n852#2,5:303\n931#2,4:308\n852#2,5:312\n67#3,3:317\n66#3:320\n25#3:327\n460#3,13:353\n473#3,3:367\n1114#4,6:321\n1114#4,6:328\n75#5,6:334\n81#5:366\n85#5:371\n75#6:340\n76#6,11:342\n89#6:370\n76#7:341\n76#8:372\n76#8:373\n154#9:374\n154#9:375\n154#9:376\n154#9:377\n154#9:378\n154#9:379\n154#9:380\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n*L\n71#1:299,4\n71#1:303,5\n97#1:308,4\n97#1:312,5\n117#1:317,3\n117#1:320\n141#1:327\n145#1:353,13\n145#1:367,3\n117#1:321,6\n141#1:328,6\n145#1:334,6\n145#1:366\n145#1:371\n145#1:340\n145#1:342,11\n145#1:370\n145#1:341\n71#1:372\n97#1:373\n187#1:374\n188#1:375\n189#1:376\n190#1:377\n191#1:378\n192#1:379\n193#1:380\n*E\n"})
/* renamed from: rQ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48041rQ2 {

    /* renamed from: a */
    public static final float f107023a;

    /* renamed from: b */
    public static final float f107024b;

    /* renamed from: d */
    public static final float f107026d;

    /* renamed from: g */
    public static final float f107029g;

    /* renamed from: c */
    public static final float f107025c = C43705k61.m29303g(16);

    /* renamed from: e */
    public static final float f107027e = C43705k61.m29303g(112);

    /* renamed from: f */
    public static final float f107028f = C43705k61.m29303g(280);

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rQ2$a */
    /* loaded from: classes.dex */
    public static final class C27908a extends Lambda implements Function1<InterfaceC11328c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EX2<C11333f> f107030g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48627sP5<Float> f107031h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC48627sP5<Float> f107032i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27908a(EX2<C11333f> ex2, InterfaceC48627sP5<Float> interfaceC48627sP5, InterfaceC48627sP5<Float> interfaceC48627sP52) {
            super(1);
            this.f107030g = ex2;
            this.f107031h = interfaceC48627sP5;
            this.f107032i = interfaceC48627sP52;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11328c interfaceC11328c) {
            invoke2(interfaceC11328c);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC11328c graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.mo68708D(C48041rQ2.m15985b(this.f107031h));
            graphicsLayer.mo68706E(C48041rQ2.m15985b(this.f107031h));
            graphicsLayer.mo68690g(C48041rQ2.m15984c(this.f107032i));
            graphicsLayer.mo68700P(this.f107030g.getValue().m68627j());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt$DropdownMenuContent$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,298:1\n74#2,6:299\n80#2:331\n84#2:336\n75#3:305\n76#3,11:307\n89#3:335\n76#4:306\n460#5,13:318\n473#5,3:332\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt$DropdownMenuContent$2\n*L\n125#1:299,6\n125#1:331\n125#1:336\n125#1:305\n125#1:307,11\n125#1:335\n125#1:306\n125#1:318,13\n125#1:332,3\n*E\n"})
    /* renamed from: rQ2$b */
    /* loaded from: classes.dex */
    public static final class C27909b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f107033g;

        /* renamed from: h */
        public final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> f107034h;

        /* renamed from: i */
        public final /* synthetic */ int f107035i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27909b(InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
            super(2);
            this.f107033g = interfaceC41563gV2;
            this.f107034h = function3;
            this.f107035i = i;
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
                C35528Qt0.m87816Z(-242468534, i, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:123)");
            }
            InterfaceC41563gV2 m80787d = C36433Up5.m80787d(W62.m78829a(ND3.m94182k(this.f107033g, 0.0f, C48041rQ2.m15980g(), 1, null), EnumC38362b72.Max), C36433Up5.m80790a(0, interfaceC32720Et0, 0, 1), false, null, false, 14, null);
            Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> function3 = this.f107034h;
            int i2 = this.f107035i & 7168;
            interfaceC32720Et0.mo89638F(-483455358);
            int i3 = i2 >> 3;
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et0, (i3 & 112) | (i3 & 14));
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m80787d);
            int i4 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
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
            C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            interfaceC32720Et0.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, Integer.valueOf((i4 >> 3) & 112));
            interfaceC32720Et0.mo89638F(2058660585);
            function3.invoke(C35465Qm0.f30887a, interfaceC32720Et0, Integer.valueOf(((i2 >> 6) & 112) | 6));
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
    /* renamed from: rQ2$c */
    /* loaded from: classes.dex */
    public static final class C27910c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ KX2<Boolean> f107036g;

        /* renamed from: h */
        public final /* synthetic */ EX2<C11333f> f107037h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f107038i;

        /* renamed from: j */
        public final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> f107039j;

        /* renamed from: k */
        public final /* synthetic */ int f107040k;

        /* renamed from: l */
        public final /* synthetic */ int f107041l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27910c(KX2<Boolean> kx2, EX2<C11333f> ex2, InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f107036g = kx2;
            this.f107037h = ex2;
            this.f107038i = interfaceC41563gV2;
            this.f107039j = function3;
            this.f107040k = i;
            this.f107041l = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C48041rQ2.m15986a(this.f107036g, this.f107037h, this.f107038i, this.f107039j, interfaceC32720Et0, C47127ps4.m18626a(this.f107040k | 1), this.f107041l);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rQ2$d */
    /* loaded from: classes.dex */
    public static final class C27911d extends Lambda implements Function3<F96.InterfaceC2189b<Boolean>, InterfaceC32720Et0, Integer, InterfaceC49435tm1<Float>> {

        /* renamed from: g */
        public static final C27911d f107042g = new C27911d();

        public C27911d() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<Boolean> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return invoke(interfaceC2189b, interfaceC32720Et0, num.intValue());
        }

        public final InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<Boolean> animateFloat, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C49330tb6 m25219k;
            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
            interfaceC32720Et0.mo89638F(782718552);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(782718552, i, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:97)");
            }
            if (animateFloat.m107505a(Boolean.FALSE, Boolean.TRUE)) {
                m25219k = C26160mf.m25219k(30, 0, null, 6, null);
            } else {
                m25219k = C26160mf.m25219k(75, 0, null, 6, null);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m25219k;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rQ2$e */
    /* loaded from: classes.dex */
    public static final class C27912e extends Lambda implements Function3<F96.InterfaceC2189b<Boolean>, InterfaceC32720Et0, Integer, InterfaceC49435tm1<Float>> {

        /* renamed from: g */
        public static final C27912e f107043g = new C27912e();

        public C27912e() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<Boolean> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return invoke(interfaceC2189b, interfaceC32720Et0, num.intValue());
        }

        public final InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<Boolean> animateFloat, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C49330tb6 m25219k;
            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
            interfaceC32720Et0.mo89638F(365249092);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(365249092, i, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:71)");
            }
            if (animateFloat.m107505a(Boolean.FALSE, Boolean.TRUE)) {
                m25219k = C26160mf.m25219k(120, 0, C42549i91.m34393d(), 2, null);
            } else {
                m25219k = C26160mf.m25219k(1, 74, null, 4, null);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m25219k;
        }
    }

    static {
        float f = 8;
        f107023a = C43705k61.m29303g(f);
        float f2 = 48;
        f107024b = C43705k61.m29303g(f2);
        f107026d = C43705k61.m29303g(f);
        f107029g = C43705k61.m29303g(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b9  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15986a(KX2<Boolean> expandedStates, EX2<C11333f> transformOriginState, InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        int i8;
        InterfaceC41563gV2.C20912a c20912a;
        boolean booleanValue;
        float f;
        boolean booleanValue2;
        boolean booleanValue3;
        float f2;
        boolean booleanValue4;
        boolean mo89539n;
        Object mo89635G;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(expandedStates, "expandedStates");
        Intrinsics.checkNotNullParameter(transformOriginState, "transformOriginState");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1164283597);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(expandedStates)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(transformOriginState)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (mo89518u.mo89629I(content)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i8 & 5851) != 1170 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
            } else {
                if (i9 == 0) {
                    c20912a = InterfaceC41563gV2.f82354b0;
                } else {
                    c20912a = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1164283597, i8, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:61)");
                }
                F96 m101072d = J96.m101072d(expandedStates, "DropDownMenu", mo89518u, KX2.f19719d | 48 | (i8 & 14), 0);
                C27912e c27912e = C27912e.f107043g;
                mo89518u.mo89638F(-1338768149);
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                InterfaceC51108wb6<Float, C28366sf> m76516i = C37082Xj6.m76516i(floatCompanionObject);
                mo89518u.mo89638F(-142660079);
                booleanValue = ((Boolean) m101072d.m107535g()).booleanValue();
                mo89518u.mo89638F(-1958825495);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1958825495, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:86)");
                }
                float f3 = 0.8f;
                float f4 = 1.0f;
                if (!booleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                mo89518u.mo89605Q();
                Float valueOf = Float.valueOf(f);
                booleanValue2 = ((Boolean) m101072d.m107529m()).booleanValue();
                mo89518u.mo89638F(-1958825495);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1958825495, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:86)");
                }
                if (booleanValue2) {
                    f3 = 1.0f;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                mo89518u.mo89605Q();
                InterfaceC48627sP5 m101073c = J96.m101073c(m101072d, valueOf, Float.valueOf(f3), c27912e.invoke((C27912e) m101072d.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i, "FloatAnimation", mo89518u, 0);
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                C27911d c27911d = C27911d.f107042g;
                mo89518u.mo89638F(-1338768149);
                InterfaceC51108wb6<Float, C28366sf> m76516i2 = C37082Xj6.m76516i(floatCompanionObject);
                mo89518u.mo89638F(-142660079);
                booleanValue3 = ((Boolean) m101072d.m107535g()).booleanValue();
                mo89518u.mo89638F(-1541356035);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1541356035, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:106)");
                }
                if (!booleanValue3) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                mo89518u.mo89605Q();
                Float valueOf2 = Float.valueOf(f2);
                booleanValue4 = ((Boolean) m101072d.m107529m()).booleanValue();
                mo89518u.mo89638F(-1541356035);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1541356035, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:106)");
                }
                if (!booleanValue4) {
                    f4 = 0.0f;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                mo89518u.mo89605Q();
                InterfaceC48627sP5 m101073c2 = J96.m101073c(m101072d, valueOf2, Float.valueOf(f4), c27911d.invoke((C27911d) m101072d.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i2, "FloatAnimation", mo89518u, 0);
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
                mo89518u.mo89638F(1618982084);
                mo89539n = mo89518u.mo89539n(m101073c) | mo89518u.mo89539n(m101073c2) | mo89518u.mo89539n(transformOriginState);
                mo89635G = mo89518u.mo89635G();
                if (!mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new C27908a(transformOriginState, m101073c, m101073c2);
                    mo89518u.mo89503z(mo89635G);
                }
                mo89518u.mo89605Q();
                InterfaceC41563gV2 interfaceC41563gV22 = c20912a;
                C35168Pf0.m90018a(C11327b.m68714a(c20912a2, (Function1) mo89635G), null, 0L, 0L, null, f107023a, C43575jt0.m29791b(mo89518u, -242468534, true, new C27909b(c20912a, content, i8)), mo89518u, 1769472, 30);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                obj = interfaceC41563gV22;
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new C27910c(expandedStates, transformOriginState, obj, content, i, i2));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        if ((i2 & 8) == 0) {
        }
        i8 = i3;
        if ((i8 & 5851) != 1170) {
        }
        if (i9 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        F96 m101072d2 = J96.m101072d(expandedStates, "DropDownMenu", mo89518u, KX2.f19719d | 48 | (i8 & 14), 0);
        C27912e c27912e2 = C27912e.f107043g;
        mo89518u.mo89638F(-1338768149);
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        InterfaceC51108wb6<Float, C28366sf> m76516i3 = C37082Xj6.m76516i(floatCompanionObject2);
        mo89518u.mo89638F(-142660079);
        booleanValue = ((Boolean) m101072d2.m107535g()).booleanValue();
        mo89518u.mo89638F(-1958825495);
        if (C35528Qt0.m87827O()) {
        }
        float f32 = 0.8f;
        float f42 = 1.0f;
        if (!booleanValue) {
        }
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89605Q();
        Float valueOf3 = Float.valueOf(f);
        booleanValue2 = ((Boolean) m101072d2.m107529m()).booleanValue();
        mo89518u.mo89638F(-1958825495);
        if (C35528Qt0.m87827O()) {
        }
        if (booleanValue2) {
        }
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89605Q();
        InterfaceC48627sP5 m101073c3 = J96.m101073c(m101072d2, valueOf3, Float.valueOf(f32), c27912e2.invoke((C27912e) m101072d2.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i3, "FloatAnimation", mo89518u, 0);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        C27911d c27911d2 = C27911d.f107042g;
        mo89518u.mo89638F(-1338768149);
        InterfaceC51108wb6<Float, C28366sf> m76516i22 = C37082Xj6.m76516i(floatCompanionObject2);
        mo89518u.mo89638F(-142660079);
        booleanValue3 = ((Boolean) m101072d2.m107535g()).booleanValue();
        mo89518u.mo89638F(-1541356035);
        if (C35528Qt0.m87827O()) {
        }
        if (!booleanValue3) {
        }
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89605Q();
        Float valueOf22 = Float.valueOf(f2);
        booleanValue4 = ((Boolean) m101072d2.m107529m()).booleanValue();
        mo89518u.mo89638F(-1541356035);
        if (C35528Qt0.m87827O()) {
        }
        if (!booleanValue4) {
        }
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89605Q();
        InterfaceC48627sP5 m101073c22 = J96.m101073c(m101072d2, valueOf22, Float.valueOf(f42), c27911d2.invoke((C27911d) m101072d2.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i22, "FloatAnimation", mo89518u, 0);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        InterfaceC41563gV2.C20912a c20912a22 = InterfaceC41563gV2.f82354b0;
        mo89518u.mo89638F(1618982084);
        mo89539n = mo89518u.mo89539n(m101073c3) | mo89518u.mo89539n(m101073c22) | mo89518u.mo89539n(transformOriginState);
        mo89635G = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G = new C27908a(transformOriginState, m101073c3, m101073c22);
        mo89518u.mo89503z(mo89635G);
        mo89518u.mo89605Q();
        InterfaceC41563gV2 interfaceC41563gV222 = c20912a;
        C35168Pf0.m90018a(C11327b.m68714a(c20912a22, (Function1) mo89635G), null, 0L, 0L, null, f107023a, C43575jt0.m29791b(mo89518u, -242468534, true, new C27909b(c20912a, content, i8)), mo89518u, 1769472, 30);
        if (C35528Qt0.m87827O()) {
        }
        obj = interfaceC41563gV222;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: b */
    public static final float m15985b(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    /* renamed from: c */
    public static final float m15984c(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m15981f(D52 parentBounds, D52 menuBounds) {
        float max;
        Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
        Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
        float f = 1.0f;
        if (menuBounds.m110922c() < parentBounds.m110921d()) {
            if (menuBounds.m110921d() <= parentBounds.m110922c()) {
                max = 1.0f;
            } else if (menuBounds.m110919f() != 0) {
                max = (((Math.max(parentBounds.m110922c(), menuBounds.m110922c()) + Math.min(parentBounds.m110921d(), menuBounds.m110921d())) / 2) - menuBounds.m110922c()) / menuBounds.m110919f();
            }
            if (menuBounds.m110920e() < parentBounds.m110924a()) {
                if (menuBounds.m110924a() > parentBounds.m110920e()) {
                    if (menuBounds.m110923b() != 0) {
                        f = (((Math.max(parentBounds.m110920e(), menuBounds.m110920e()) + Math.min(parentBounds.m110924a(), menuBounds.m110924a())) / 2) - menuBounds.m110920e()) / menuBounds.m110923b();
                    }
                }
                return C45519n96.m24273a(max, f);
            }
            f = 0.0f;
            return C45519n96.m24273a(max, f);
        }
        max = 0.0f;
        if (menuBounds.m110920e() < parentBounds.m110924a()) {
        }
        f = 0.0f;
        return C45519n96.m24273a(max, f);
    }

    /* renamed from: g */
    public static final float m15980g() {
        return f107026d;
    }

    /* renamed from: h */
    public static final float m15979h() {
        return f107024b;
    }
}
