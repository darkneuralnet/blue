package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u001ax\u0010\u000f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a`\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a`\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001b\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a\"\u0017\u0010\u001c\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001d\"\u0014\u0010 \u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\"\u0017\u0010\"\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\u001a\"\u0017\u0010$\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, m28432d2 = {"Lkotlin/Function0;", "", "title", "LgV2;", "modifier", "navigationIcon", "Lkotlin/Function1;", "LZc5;", "Lkotlin/ExtensionFunctionType;", "actions", "Lpm0;", "backgroundColor", "contentColor", "Lk61;", "elevation", "c", "(Lkotlin/jvm/functions/Function2;LgV2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLEt0;II)V", "LPD3;", "contentPadding", "content", "b", "(LgV2;JJFLPD3;Lkotlin/jvm/functions/Function3;LEt0;II)V", "Lhy5;", "shape", C17296a.f69688o, "(JJFLPD3;Lhy5;LgV2;Lkotlin/jvm/functions/Function3;LEt0;II)V", "F", "AppBarHeight", "AppBarHorizontalPadding", "LgV2;", "TitleInsetWithoutIcon", DateTokenConverter.CONVERTER_KEY, "TitleIconModifier", "e", "BottomAppBarCutoutOffset", "f", "BottomAppBarRoundedEdgeRadius", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,547:1\n400#1:549\n400#1:550\n400#1:551\n400#1:552\n400#1:553\n400#1:554\n76#2:548\n154#3:555\n154#3:556\n154#3:557\n154#3:559\n154#3:561\n154#3:562\n58#4:558\n58#4:560\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n426#1:549\n458#1:550\n459#1:551\n461#1:552\n468#1:553\n469#1:554\n224#1:548\n534#1:555\n536#1:556\n538#1:557\n541#1:559\n544#1:561\n546#1:562\n538#1:558\n541#1:560\n*E\n"})
/* renamed from: Ih */
/* loaded from: classes.dex */
public final class C3727Ih {

    /* renamed from: a */
    public static final float f16006a = C43705k61.m29303g(56);

    /* renamed from: b */
    public static final float f16007b;

    /* renamed from: c */
    public static final InterfaceC41563gV2 f16008c;

    /* renamed from: d */
    public static final InterfaceC41563gV2 f16009d;

    /* renamed from: e */
    public static final float f16010e;

    /* renamed from: f */
    public static final float f16011f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ih$a */
    /* loaded from: classes.dex */
    public static final class C3728a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ PD3 f16012g;

        /* renamed from: h */
        public final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> f16013h;

        /* renamed from: i */
        public final /* synthetic */ int f16014i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$AppBar$1$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,547:1\n79#2,2:548\n81#2:576\n85#2:581\n75#3:550\n76#3,11:552\n89#3:580\n76#4:551\n460#5,13:563\n473#5,3:577\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$AppBar$1$1\n*L\n522#1:548,2\n522#1:576\n522#1:581\n522#1:550\n522#1:552,11\n522#1:580\n522#1:551\n522#1:563,13\n522#1:577,3\n*E\n"})
        /* renamed from: Ih$a$a */
        /* loaded from: classes.dex */
        public static final class C3729a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ PD3 f16015g;

            /* renamed from: h */
            public final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> f16016h;

            /* renamed from: i */
            public final /* synthetic */ int f16017i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3729a(PD3 pd3, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
                super(2);
                this.f16015g = pd3;
                this.f16016h = function3;
                this.f16017i = i;
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
                    C35528Qt0.m87816Z(1296061040, i, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:520)");
                }
                InterfaceC41563gV2 m114254o = BB5.m114254o(ND3.m94185h(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), this.f16015g), C3727Ih.f16006a);
                C25777lo.InterfaceC25781d m26803f = C25777lo.f96729a.m26803f();
                InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
                Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> function3 = this.f16016h;
                int i2 = ((this.f16017i >> 9) & 7168) | 432;
                interfaceC32720Et0.mo89638F(693286680);
                int i3 = i2 >> 3;
                InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26803f, m99138h, interfaceC32720Et0, (i3 & 112) | (i3 & 14));
                interfaceC32720Et0.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114254o);
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
                C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                interfaceC32720Et0.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, Integer.valueOf((i4 >> 3) & 112));
                interfaceC32720Et0.mo89638F(2058660585);
                function3.invoke(C38066ad5.f50835a, interfaceC32720Et0, Integer.valueOf(((i2 >> 6) & 112) | 6));
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
        public C3728a(PD3 pd3, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
            super(2);
            this.f16012g = pd3;
            this.f16013h = function3;
            this.f16014i = i;
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
                C35528Qt0.m87816Z(-1027830352, i, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:519)");
            }
            C41806gu0.m37353a(new W94[]{C37220Xz0.m75931a().m81907c(Float.valueOf(C36986Wz0.f42427a.m77586d(interfaceC32720Et0, 6)))}, C43575jt0.m29791b(interfaceC32720Et0, 1296061040, true, new C3729a(this.f16012g, this.f16013h, this.f16014i)), interfaceC32720Et0, 56);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ih$b */
    /* loaded from: classes.dex */
    public static final class C3730b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f16018g;

        /* renamed from: h */
        public final /* synthetic */ long f16019h;

        /* renamed from: i */
        public final /* synthetic */ float f16020i;

        /* renamed from: j */
        public final /* synthetic */ PD3 f16021j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC42444hy5 f16022k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC41563gV2 f16023l;

        /* renamed from: m */
        public final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> f16024m;

        /* renamed from: n */
        public final /* synthetic */ int f16025n;

        /* renamed from: o */
        public final /* synthetic */ int f16026o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3730b(long j, long j2, float f, PD3 pd3, InterfaceC42444hy5 interfaceC42444hy5, InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f16018g = j;
            this.f16019h = j2;
            this.f16020i = f;
            this.f16021j = pd3;
            this.f16022k = interfaceC42444hy5;
            this.f16023l = interfaceC41563gV2;
            this.f16024m = function3;
            this.f16025n = i;
            this.f16026o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C3727Ih.m101814a(this.f16018g, this.f16019h, this.f16020i, this.f16021j, this.f16022k, this.f16023l, this.f16024m, interfaceC32720Et0, C47127ps4.m18626a(this.f16025n | 1), this.f16026o);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,547:1\n75#2,6:548\n81#2:580\n85#2:585\n75#2,6:586\n81#2:618\n85#2:623\n75#3:554\n76#3,11:556\n89#3:584\n75#3:592\n76#3,11:594\n89#3:622\n76#4:555\n76#4:593\n460#5,13:567\n473#5,3:581\n460#5,13:605\n473#5,3:619\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1\n*L\n97#1:548,6\n97#1:580\n97#1:585\n105#1:586,6\n105#1:618\n105#1:623\n97#1:554\n97#1:556,11\n97#1:584\n105#1:592\n105#1:594,11\n105#1:622\n97#1:555\n105#1:593\n97#1:567,13\n97#1:581,3\n105#1:605,13\n105#1:619,3\n*E\n"})
    /* renamed from: Ih$c */
    /* loaded from: classes.dex */
    public static final class C3731c extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f16027g;

        /* renamed from: h */
        public final /* synthetic */ int f16028h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f16029i;

        /* renamed from: j */
        public final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> f16030j;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ih$c$a */
        /* loaded from: classes.dex */
        public static final class C3732a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f16031g;

            /* renamed from: h */
            public final /* synthetic */ int f16032h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3732a(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
                super(2);
                this.f16031g = function2;
                this.f16032h = i;
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
                    C35528Qt0.m87816Z(-2021518195, i, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                }
                C41806gu0.m37353a(new W94[]{C37220Xz0.m75931a().m81907c(Float.valueOf(C36986Wz0.f42427a.m77587c(interfaceC32720Et0, 6)))}, this.f16031g, interfaceC32720Et0, ((this.f16032h << 3) & 112) | 8);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1$3\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,547:1\n79#2,2:548\n81#2:576\n85#2:581\n75#3:550\n76#3,11:552\n89#3:580\n76#4:551\n460#5,13:563\n473#5,3:577\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1$3\n*L\n118#1:548,2\n118#1:576\n118#1:581\n118#1:550\n118#1:552,11\n118#1:580\n118#1:551\n118#1:563,13\n118#1:577,3\n*E\n"})
        /* renamed from: Ih$c$b */
        /* loaded from: classes.dex */
        public static final class C3733b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> f16033g;

            /* renamed from: h */
            public final /* synthetic */ int f16034h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3733b(Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
                super(2);
                this.f16033g = function3;
                this.f16034h = i;
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
                    C35528Qt0.m87816Z(1157662914, i, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                }
                InterfaceC41563gV2 m114259j = BB5.m114259j(InterfaceC41563gV2.f82354b0, 0.0f, 1, null);
                C25777lo.InterfaceC25781d m26806c = C25777lo.f96729a.m26806c();
                InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
                Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> function3 = this.f16033g;
                int i2 = (this.f16034h & 7168) | 438;
                interfaceC32720Et0.mo89638F(693286680);
                int i3 = i2 >> 3;
                InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26806c, m99138h, interfaceC32720Et0, (i3 & 112) | (i3 & 14));
                interfaceC32720Et0.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114259j);
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
                C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                interfaceC32720Et0.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, Integer.valueOf((i4 >> 3) & 112));
                interfaceC32720Et0.mo89638F(2058660585);
                function3.invoke(C38066ad5.f50835a, interfaceC32720Et0, Integer.valueOf(((i2 >> 6) & 112) | 6));
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
        public C3731c(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3) {
            super(3);
            this.f16027g = function2;
            this.f16028h = i;
            this.f16029i = function22;
            this.f16030j = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC37486Zc5 AppBar, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
            if ((i & 14) == 0) {
                i2 = (interfaceC32720Et0.mo89539n(AppBar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1484077694, i, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
            }
            if (this.f16027g == null) {
                interfaceC32720Et0.mo89638F(-512812651);
                DN5.m110552a(C3727Ih.f16008c, interfaceC32720Et0, 6);
                interfaceC32720Et0.mo89605Q();
            } else {
                interfaceC32720Et0.mo89638F(-512812592);
                InterfaceC41563gV2 interfaceC41563gV2 = C3727Ih.f16009d;
                InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
                Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f16027g;
                int i3 = this.f16028h;
                interfaceC32720Et0.mo89638F(693286680);
                InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, interfaceC32720Et0, 48);
                interfaceC32720Et0.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(interfaceC41563gV2);
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
                C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                interfaceC32720Et0.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89638F(2058660585);
                C38066ad5 c38066ad5 = C38066ad5.f50835a;
                C41806gu0.m37353a(new W94[]{C37220Xz0.m75931a().m81907c(Float.valueOf(C36986Wz0.f42427a.m77587c(interfaceC32720Et0, 6)))}, function2, interfaceC32720Et0, ((i3 >> 3) & 112) | 8);
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89563f();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
            }
            InterfaceC41563gV2 m72851b = InterfaceC37486Zc5.m72851b(AppBar, BB5.m114259j(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), 1.0f, false, 2, null);
            InterfaceC4360K9.InterfaceC4363c m99138h2 = InterfaceC4360K9.f19170a.m99138h();
            Function2<InterfaceC32720Et0, Integer, Unit> function22 = this.f16029i;
            int i4 = this.f16028h;
            interfaceC32720Et0.mo89638F(693286680);
            InterfaceC51579xO2 m74813a2 = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h2, interfaceC32720Et0, 48);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m72851b);
            if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et0.mo89557h();
            if (interfaceC32720Et0.mo89521t()) {
                interfaceC32720Et0.mo89617M(m113415a2);
            } else {
                interfaceC32720Et0.mo89566e();
            }
            interfaceC32720Et0.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(interfaceC32720Et0);
            C38680bf6.m64191b(m64192a2, m74813a2, c0757a2.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a2.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
            interfaceC32720Et0.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(2058660585);
            C38066ad5 c38066ad52 = C38066ad5.f50835a;
            C38909c26.m62004a(TM2.f35372a.m83729c(interfaceC32720Et0, 6).m104958j(), C43575jt0.m29791b(interfaceC32720Et0, -2021518195, true, new C3732a(function22, i4)), interfaceC32720Et0, 48);
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89563f();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            C41806gu0.m37353a(new W94[]{C37220Xz0.m75931a().m81907c(Float.valueOf(C36986Wz0.f42427a.m77586d(interfaceC32720Et0, 6)))}, C43575jt0.m29791b(interfaceC32720Et0, 1157662914, true, new C3733b(this.f16030j, this.f16028h)), interfaceC32720Et0, 56);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ih$d */
    /* loaded from: classes.dex */
    public static final class C3734d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f16035g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f16036h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f16037i;

        /* renamed from: j */
        public final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> f16038j;

        /* renamed from: k */
        public final /* synthetic */ long f16039k;

        /* renamed from: l */
        public final /* synthetic */ long f16040l;

        /* renamed from: m */
        public final /* synthetic */ float f16041m;

        /* renamed from: n */
        public final /* synthetic */ int f16042n;

        /* renamed from: o */
        public final /* synthetic */ int f16043o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3734d(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, InterfaceC41563gV2 interfaceC41563gV2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, long j, long j2, float f, int i, int i2) {
            super(2);
            this.f16035g = function2;
            this.f16036h = interfaceC41563gV2;
            this.f16037i = function22;
            this.f16038j = function3;
            this.f16039k = j;
            this.f16040l = j2;
            this.f16041m = f;
            this.f16042n = i;
            this.f16043o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C3727Ih.m101812c(this.f16035g, this.f16036h, this.f16037i, this.f16038j, this.f16039k, this.f16040l, this.f16041m, interfaceC32720Et0, C47127ps4.m18626a(this.f16042n | 1), this.f16043o);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ih$e */
    /* loaded from: classes.dex */
    public static final class C3735e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f16044g;

        /* renamed from: h */
        public final /* synthetic */ long f16045h;

        /* renamed from: i */
        public final /* synthetic */ long f16046i;

        /* renamed from: j */
        public final /* synthetic */ float f16047j;

        /* renamed from: k */
        public final /* synthetic */ PD3 f16048k;

        /* renamed from: l */
        public final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> f16049l;

        /* renamed from: m */
        public final /* synthetic */ int f16050m;

        /* renamed from: n */
        public final /* synthetic */ int f16051n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3735e(InterfaceC41563gV2 interfaceC41563gV2, long j, long j2, float f, PD3 pd3, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f16044g = interfaceC41563gV2;
            this.f16045h = j;
            this.f16046i = j2;
            this.f16047j = f;
            this.f16048k = pd3;
            this.f16049l = function3;
            this.f16050m = i;
            this.f16051n = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C3727Ih.m101813b(this.f16044g, this.f16045h, this.f16046i, this.f16047j, this.f16048k, this.f16049l, interfaceC32720Et0, C47127ps4.m18626a(this.f16050m | 1), this.f16051n);
        }
    }

    static {
        float f = 4;
        float m29303g = C43705k61.m29303g(f);
        f16007b = m29303g;
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        f16008c = BB5.m114273A(c20912a, C43705k61.m29303g(C43705k61.m29303g(16) - m29303g));
        f16009d = BB5.m114273A(BB5.m114259j(c20912a, 0.0f, 1, null), C43705k61.m29303g(C43705k61.m29303g(72) - m29303g));
        f16010e = C43705k61.m29303g(8);
        f16011f = C43705k61.m29303g(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m101814a(long j, long j2, float f, PD3 pd3, InterfaceC42444hy5 interfaceC42444hy5, InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj;
        int i10;
        int i11;
        InterfaceC41563gV2.C20912a c20912a;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1249680788);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89524s(j2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89533p(f)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (mo89518u.mo89539n(pd3)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (mo89518u.mo89539n(interfaceC42444hy5)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            i9 = i2 & 32;
            if (i9 == 0) {
                i3 |= ImageMetadata.EDGE_MODE;
            } else if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                obj = interfaceC41563gV2;
                if (mo89518u.mo89539n(obj)) {
                    i10 = DateUtils.FORMAT_NUMERIC_DATE;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (mo89518u.mo89629I(function3)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((2995931 & i3) != 599186 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    c20912a = obj;
                } else {
                    if (i9 != 0) {
                        c20912a = InterfaceC41563gV2.f82354b0;
                    } else {
                        c20912a = obj;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(-1249680788, i3, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i12 = i3 << 6;
                    InterfaceC41563gV2 interfaceC41563gV22 = c20912a;
                    NV5.m93838a(interfaceC41563gV22, interfaceC42444hy5, j, j2, null, f, C43575jt0.m29791b(mo89518u, -1027830352, true, new C3728a(pd3, function3, i3)), mo89518u, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i12 & 896) | (i12 & 7168) | ((i3 << 9) & ImageMetadata.JPEG_GPS_COORDINATES), 16);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                }
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new C3730b(j, j2, f, pd3, interfaceC42444hy5, c20912a, function3, i, i2));
                    return;
                }
                return;
            }
            obj = interfaceC41563gV2;
            if ((i2 & 64) != 0) {
            }
            if ((2995931 & i3) != 599186) {
            }
            if (i9 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            int i122 = i3 << 6;
            InterfaceC41563gV2 interfaceC41563gV222 = c20912a;
            NV5.m93838a(interfaceC41563gV222, interfaceC42444hy5, j, j2, null, f, C43575jt0.m29791b(mo89518u, -1027830352, true, new C3728a(pd3, function3, i3)), mo89518u, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i122 & 896) | (i122 & 7168) | ((i3 << 9) & ImageMetadata.JPEG_GPS_COORDINATES), 16);
            if (C35528Qt0.m87827O()) {
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i9 = i2 & 32;
        if (i9 == 0) {
        }
        obj = interfaceC41563gV2;
        if ((i2 & 64) != 0) {
        }
        if ((2995931 & i3) != 599186) {
        }
        if (i9 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        int i1222 = i3 << 6;
        InterfaceC41563gV2 interfaceC41563gV2222 = c20912a;
        NV5.m93838a(interfaceC41563gV2222, interfaceC42444hy5, j, j2, null, f, C43575jt0.m29791b(mo89518u, -1027830352, true, new C3728a(pd3, function3, i3)), mo89518u, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1222 & 896) | (i1222 & 7168) | ((i3 << 9) & ImageMetadata.JPEG_GPS_COORDINATES), 16);
        if (C35528Qt0.m87827O()) {
        }
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m101813b(InterfaceC41563gV2 interfaceC41563gV2, long j, long j2, float f, PD3 pd3, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        long j3;
        long j4;
        float f2;
        int i5;
        int i6;
        Object obj2;
        int i7;
        int i8;
        Object obj3;
        long j5;
        Object obj4;
        long j6;
        PD3 m103532a;
        long j7;
        float f3;
        InterfaceC41563gV2 interfaceC41563gV22;
        long j8;
        long j9;
        float f4;
        PD3 pd32;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1897058582);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            obj = interfaceC41563gV2;
        } else if ((i & 14) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = interfaceC41563gV2;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (mo89518u.mo89524s(j3)) {
                    i10 = 32;
                    i3 |= i10;
                }
            } else {
                j3 = j;
            }
            i10 = 16;
            i3 |= i10;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (mo89518u.mo89524s(j4)) {
                    i9 = 256;
                    i3 |= i9;
                }
            } else {
                j4 = j2;
            }
            i9 = 128;
            i3 |= i9;
        } else {
            j4 = j2;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            f2 = f;
            if (mo89518u.mo89533p(f2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
            i6 = i2 & 16;
            if (i6 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                obj2 = pd3;
                if (mo89518u.mo89539n(obj2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
                if ((i2 & 32) != 0) {
                    i8 = ImageMetadata.EDGE_MODE;
                } else {
                    if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                        if (mo89518u.mo89629I(content)) {
                            i8 = DateUtils.FORMAT_NUMERIC_DATE;
                        } else {
                            i8 = 65536;
                        }
                    }
                    if ((374491 & i3) != 74898 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        interfaceC41563gV22 = obj;
                        j8 = j3;
                        j9 = j4;
                        f4 = f2;
                        pd32 = obj2;
                    } else {
                        mo89518u.mo89626J();
                        if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                            mo89518u.mo89548k();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            obj4 = obj;
                            j6 = j3;
                        } else {
                            if (i11 == 0) {
                                obj3 = InterfaceC41563gV2.f82354b0;
                            } else {
                                obj3 = obj;
                            }
                            if ((i2 & 2) == 0) {
                                j5 = C34763Nm0.m93464f(TM2.f35372a.m83731a(mo89518u, 6));
                                i3 &= -113;
                            } else {
                                j5 = j3;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                j4 = C34763Nm0.m93468b(j5, mo89518u, (i3 >> 3) & 14);
                            }
                            if (i12 != 0) {
                                f2 = C3207Hh.f13756a.m103531b();
                            }
                            if (i6 == 0) {
                                obj4 = obj3;
                                j6 = j5;
                                m103532a = C3207Hh.f13756a.m103532a();
                                j7 = j4;
                                f3 = f2;
                                mo89518u.mo89650B();
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87816Z(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                                }
                                int i13 = i3 >> 3;
                                m101814a(j6, j7, f3, m103532a, C37629Zs4.m72365a(), obj4, content, mo89518u, (i13 & 7168) | (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | ((i3 << 15) & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & (i3 << 3)), 0);
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                                interfaceC41563gV22 = obj4;
                                j8 = j6;
                                j9 = j7;
                                f4 = f3;
                                pd32 = m103532a;
                            } else {
                                obj4 = obj3;
                                j6 = j5;
                            }
                        }
                        j7 = j4;
                        f3 = f2;
                        m103532a = obj2;
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                        }
                        int i132 = i3 >> 3;
                        m101814a(j6, j7, f3, m103532a, C37629Zs4.m72365a(), obj4, content, mo89518u, (i132 & 7168) | (i132 & 14) | 24576 | (i132 & 112) | (i132 & 896) | ((i3 << 15) & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & (i3 << 3)), 0);
                        if (C35528Qt0.m87827O()) {
                        }
                        interfaceC41563gV22 = obj4;
                        j8 = j6;
                        j9 = j7;
                        f4 = f3;
                        pd32 = m103532a;
                    }
                    InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
                    if (mo89512w != null) {
                        mo89512w.mo20405a(new C3735e(interfaceC41563gV22, j8, j9, f4, pd32, content, i, i2));
                        return;
                    }
                    return;
                }
                i3 |= i8;
                if ((374491 & i3) != 74898) {
                }
                mo89518u.mo89626J();
                if ((i & 1) == 0) {
                }
                if (i11 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i12 != 0) {
                }
                if (i6 == 0) {
                }
            }
            obj2 = pd3;
            if ((i2 & 32) != 0) {
            }
            i3 |= i8;
            if ((374491 & i3) != 74898) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i11 == 0) {
            }
            if ((i2 & 2) == 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i12 != 0) {
            }
            if (i6 == 0) {
            }
        }
        f2 = f;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        obj2 = pd3;
        if ((i2 & 32) != 0) {
        }
        i3 |= i8;
        if ((374491 & i3) != 74898) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i11 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i12 != 0) {
        }
        if (i6 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m101812c(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> title, InterfaceC41563gV2 interfaceC41563gV2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, long j, long j2, float f, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Object obj;
        int i7;
        int i8;
        Object obj2;
        int i9;
        long j3;
        long j4;
        int i10;
        float f2;
        int i11;
        InterfaceC41563gV2 interfaceC41563gV22;
        Object obj3;
        Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> function32;
        long j5;
        long j6;
        long j7;
        float f3;
        InterfaceC41563gV2 interfaceC41563gV23;
        float f4;
        InterfaceC36874Wm5 mo89512w;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(title, "title");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2087748139);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89629I(title)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(interfaceC41563gV2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i2 & 4;
            if (i6 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj = function2;
                if (mo89518u.mo89629I(obj)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
                i8 = i2 & 8;
                if (i8 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    obj2 = function3;
                    if (mo89518u.mo89629I(obj2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i3 |= i9;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            j3 = j;
                            if (mo89518u.mo89524s(j3)) {
                                i13 = 16384;
                                i3 |= i13;
                            }
                        } else {
                            j3 = j;
                        }
                        i13 = 8192;
                        i3 |= i13;
                    } else {
                        j3 = j;
                    }
                    if ((i & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
                        if ((i2 & 32) == 0) {
                            j4 = j2;
                            if (mo89518u.mo89524s(j4)) {
                                i12 = DateUtils.FORMAT_NUMERIC_DATE;
                                i3 |= i12;
                            }
                        } else {
                            j4 = j2;
                        }
                        i12 = 65536;
                        i3 |= i12;
                    } else {
                        j4 = j2;
                    }
                    i10 = i2 & 64;
                    if (i10 == 0) {
                        i3 |= 1572864;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i & 3670016) == 0) {
                            if (mo89518u.mo89533p(f2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                    }
                    if ((i3 & 2995931) != 599186 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        interfaceC41563gV23 = interfaceC41563gV2;
                        obj3 = obj;
                        function32 = obj2;
                        j5 = j3;
                        f4 = f2;
                        j7 = j4;
                    } else {
                        mo89518u.mo89626J();
                        if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                            mo89518u.mo89548k();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            interfaceC41563gV22 = interfaceC41563gV2;
                            obj3 = obj;
                            function32 = obj2;
                            j5 = j3;
                            f3 = f2;
                            j7 = j4;
                        } else {
                            if (i14 == 0) {
                                interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
                            } else {
                                interfaceC41563gV22 = interfaceC41563gV2;
                            }
                            if (i6 == 0) {
                                obj3 = null;
                            } else {
                                obj3 = obj;
                            }
                            if (i8 == 0) {
                                function32 = C45947nt0.f100977a.m22249a();
                            } else {
                                function32 = obj2;
                            }
                            if ((i2 & 16) == 0) {
                                j5 = C34763Nm0.m93464f(TM2.f35372a.m83731a(mo89518u, 6));
                                i3 &= -57345;
                            } else {
                                j5 = j3;
                            }
                            if ((i2 & 32) == 0) {
                                j6 = C34763Nm0.m93468b(j5, mo89518u, (i3 >> 12) & 14);
                                i3 &= -458753;
                            } else {
                                j6 = j4;
                            }
                            if (i10 == 0) {
                                f3 = C3207Hh.f13756a.m103531b();
                                j7 = j6;
                            } else {
                                j7 = j6;
                                f3 = f2;
                            }
                        }
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                        }
                        int i15 = i3 >> 12;
                        long j8 = j5;
                        long j9 = j7;
                        float f5 = f3;
                        InterfaceC41563gV2 interfaceC41563gV24 = interfaceC41563gV22;
                        m101814a(j8, j9, f5, C3207Hh.f13756a.m103532a(), C37629Zs4.m72365a(), interfaceC41563gV24, C43575jt0.m29791b(mo89518u, -1484077694, true, new C3731c(obj3, i3, title, function32)), mo89518u, (i15 & 896) | (i15 & 14) | 1600512 | (i15 & 112) | ((i3 << 12) & ImageMetadata.JPEG_GPS_COORDINATES), 0);
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        interfaceC41563gV23 = interfaceC41563gV22;
                        f4 = f3;
                    }
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w == null) {
                        mo89512w.mo20405a(new C3734d(title, interfaceC41563gV23, obj3, function32, j5, j7, f4, i, i2));
                        return;
                    }
                    return;
                }
                obj2 = function3;
                if ((57344 & i) != 0) {
                }
                if ((i & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
                }
                i10 = i2 & 64;
                if (i10 == 0) {
                }
                if ((i3 & 2995931) != 599186) {
                }
                mo89518u.mo89626J();
                if ((i & 1) == 0) {
                }
                if (i14 == 0) {
                }
                if (i6 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i10 == 0) {
                }
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                int i152 = i3 >> 12;
                long j82 = j5;
                long j92 = j7;
                float f52 = f3;
                InterfaceC41563gV2 interfaceC41563gV242 = interfaceC41563gV22;
                m101814a(j82, j92, f52, C3207Hh.f13756a.m103532a(), C37629Zs4.m72365a(), interfaceC41563gV242, C43575jt0.m29791b(mo89518u, -1484077694, true, new C3731c(obj3, i3, title, function32)), mo89518u, (i152 & 896) | (i152 & 14) | 1600512 | (i152 & 112) | ((i3 << 12) & ImageMetadata.JPEG_GPS_COORDINATES), 0);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV23 = interfaceC41563gV22;
                f4 = f3;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                }
            }
            obj = function2;
            i8 = i2 & 8;
            if (i8 != 0) {
            }
            obj2 = function3;
            if ((57344 & i) != 0) {
            }
            if ((i & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
            }
            i10 = i2 & 64;
            if (i10 == 0) {
            }
            if ((i3 & 2995931) != 599186) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i14 == 0) {
            }
            if (i6 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i10 == 0) {
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            int i1522 = i3 >> 12;
            long j822 = j5;
            long j922 = j7;
            float f522 = f3;
            InterfaceC41563gV2 interfaceC41563gV2422 = interfaceC41563gV22;
            m101814a(j822, j922, f522, C3207Hh.f13756a.m103532a(), C37629Zs4.m72365a(), interfaceC41563gV2422, C43575jt0.m29791b(mo89518u, -1484077694, true, new C3731c(obj3, i3, title, function32)), mo89518u, (i1522 & 896) | (i1522 & 14) | 1600512 | (i1522 & 112) | ((i3 << 12) & ImageMetadata.JPEG_GPS_COORDINATES), 0);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV23 = interfaceC41563gV22;
            f4 = f3;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
            }
        }
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        obj = function2;
        i8 = i2 & 8;
        if (i8 != 0) {
        }
        obj2 = function3;
        if ((57344 & i) != 0) {
        }
        if ((i & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
        }
        i10 = i2 & 64;
        if (i10 == 0) {
        }
        if ((i3 & 2995931) != 599186) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i14 == 0) {
        }
        if (i6 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i10 == 0) {
        }
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        int i15222 = i3 >> 12;
        long j8222 = j5;
        long j9222 = j7;
        float f5222 = f3;
        InterfaceC41563gV2 interfaceC41563gV24222 = interfaceC41563gV22;
        m101814a(j8222, j9222, f5222, C3207Hh.f13756a.m103532a(), C37629Zs4.m72365a(), interfaceC41563gV24222, C43575jt0.m29791b(mo89518u, -1484077694, true, new C3731c(obj3, i3, title, function32)), mo89518u, (i15222 & 896) | (i15222 & 14) | 1600512 | (i15222 & 112) | ((i3 << 12) & ImageMetadata.JPEG_GPS_COORDINATES), 0);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV23 = interfaceC41563gV22;
        f4 = f3;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }
}
