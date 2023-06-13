package p000;

import androidx.compose.p003ui.graphics.C11327b;
import androidx.compose.p003ui.graphics.InterfaceC11328c;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
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
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aK\u0010\n\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0083\u0001\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00072!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m28432d2 = {"T", "targetState", "LgV2;", "modifier", "Ltm1;", "", "animationSpec", "Lkotlin/Function1;", "", "content", "b", "(Ljava/lang/Object;LgV2;Ltm1;Lkotlin/jvm/functions/Function3;LEt0;II)V", "LF96;", "Lkotlin/ParameterName;", "name", "", "contentKey", C17296a.f69688o, "(LF96;LgV2;Ltm1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;LEt0;II)V", "animation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,147:1\n25#2:148\n25#2:156\n36#2:163\n460#2,13:202\n473#2,3:222\n1057#3,3:149\n1060#3,3:153\n1057#3,6:157\n1057#3,6:164\n1#4:152\n350#5,7:170\n32#6,6:177\n32#6,6:216\n67#7,6:183\n73#7:215\n77#7:226\n75#8:189\n76#8,11:191\n89#8:225\n76#9:190\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n*L\n104#1:148\n105#1:156\n112#1:163\n139#1:202,13\n139#1:222,3\n104#1:149,3\n104#1:153,3\n105#1:157,6\n112#1:164,6\n118#1:170,7\n127#1:177,6\n140#1:216,6\n139#1:183,6\n139#1:215\n139#1:226\n139#1:189\n139#1:191,11\n139#1:225\n139#1:190\n*E\n"})
/* renamed from: SE0 */
/* loaded from: classes.dex */
public final class SE0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SE0$a */
    /* loaded from: classes.dex */
    public static final class C7358a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Object f33362g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f33363h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC49435tm1<Float> f33364i;

        /* renamed from: j */
        public final /* synthetic */ Function3 f33365j;

        /* renamed from: k */
        public final /* synthetic */ int f33366k;

        /* renamed from: l */
        public final /* synthetic */ int f33367l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7358a(Object obj, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC49435tm1 interfaceC49435tm1, Function3 function3, int i, int i2) {
            super(2);
            this.f33362g = obj;
            this.f33363h = interfaceC41563gV2;
            this.f33364i = interfaceC49435tm1;
            this.f33365j = function3;
            this.f33366k = i;
            this.f33367l = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            SE0.m85819b(this.f33362g, this.f33363h, this.f33364i, this.f33365j, interfaceC32720Et0, this.f33366k | 1, this.f33367l);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SE0$b */
    /* loaded from: classes.dex */
    public static final class C7359b extends Lambda implements Function1<T, T> {

        /* renamed from: g */
        public static final C7359b f33368g = new C7359b();

        public C7359b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t) {
            return t;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SE0$c */
    /* loaded from: classes.dex */
    public static final class C7360c extends Lambda implements Function1<T, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ F96<T> f33369g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7360c(F96<T> f96) {
            super(1);
            this.f33369g = f96;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(T t) {
            return Boolean.valueOf(!Intrinsics.areEqual(t, this.f33369g.m107529m()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((C7360c) obj);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,147:1\n936#2,4:148\n857#2,5:152\n36#3:157\n460#3,13:183\n473#3,3:197\n1057#4,6:158\n67#5,6:164\n73#5:196\n77#5:201\n75#6:170\n76#6,11:172\n89#6:200\n76#7:171\n76#8:202\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n*L\n129#1:148,4\n129#1:152,5\n132#1:157\n132#1:183,13\n132#1:197,3\n132#1:158,6\n132#1:164,6\n132#1:196\n132#1:201\n132#1:170\n132#1:172,11\n132#1:200\n132#1:171\n129#1:202\n*E\n"})
    /* renamed from: SE0$d */
    /* loaded from: classes.dex */
    public static final class C7361d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ F96<T> f33370g;

        /* renamed from: h */
        public final /* synthetic */ int f33371h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC49435tm1<Float> f33372i;

        /* renamed from: j */
        public final /* synthetic */ T f33373j;

        /* renamed from: k */
        public final /* synthetic */ Function3<T, InterfaceC32720Et0, Integer, Unit> f33374k;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: SE0$d$a */
        /* loaded from: classes.dex */
        public static final class C7362a extends Lambda implements Function1<InterfaceC11328c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC48627sP5<Float> f33375g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7362a(InterfaceC48627sP5<Float> interfaceC48627sP5) {
                super(1);
                this.f33375g = interfaceC48627sP5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11328c interfaceC11328c) {
                invoke2(interfaceC11328c);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(InterfaceC11328c graphicsLayer) {
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.mo68690g(C7361d.m85817b(this.f33375g));
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: SE0$d$b */
        /* loaded from: classes.dex */
        public static final class C7363b extends Lambda implements Function3<F96.InterfaceC2189b<T>, InterfaceC32720Et0, Integer, InterfaceC49435tm1<Float>> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC49435tm1<Float> f33376g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7363b(InterfaceC49435tm1<Float> interfaceC49435tm1) {
                super(3);
                this.f33376g = interfaceC49435tm1;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ InterfaceC49435tm1<Float> invoke(Object obj, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                return invoke((F96.InterfaceC2189b) obj, interfaceC32720Et0, num.intValue());
            }

            public final InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<T> animateFloat, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                interfaceC32720Et0.mo89638F(438406499);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(438406499, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
                }
                InterfaceC49435tm1<Float> interfaceC49435tm1 = this.f33376g;
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC32720Et0.mo89605Q();
                return interfaceC49435tm1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7361d(F96<T> f96, int i, InterfaceC49435tm1<Float> interfaceC49435tm1, T t, Function3<? super T, ? super InterfaceC32720Et0, ? super Integer, Unit> function3) {
            super(2);
            this.f33370g = f96;
            this.f33371h = i;
            this.f33372i = interfaceC49435tm1;
            this.f33373j = t;
            this.f33374k = function3;
        }

        /* renamed from: b */
        public static final float m85817b(InterfaceC48627sP5<Float> interfaceC48627sP5) {
            return interfaceC48627sP5.getValue().floatValue();
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
                C35528Qt0.m87816Z(-1426421288, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            F96<T> f96 = this.f33370g;
            C7363b c7363b = new C7363b(this.f33372i);
            Object obj = this.f33373j;
            int i2 = this.f33371h & 14;
            interfaceC32720Et0.mo89638F(-1338768149);
            InterfaceC51108wb6<Float, C28366sf> m76516i = C37082Xj6.m76516i(FloatCompanionObject.INSTANCE);
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            int i5 = (i4 & 57344) | i3 | (i4 & 896) | (i4 & 7168);
            interfaceC32720Et0.mo89638F(-142660079);
            Object m107535g = f96.m107535g();
            int i6 = (i5 >> 9) & 112;
            interfaceC32720Et0.mo89638F(-438678252);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-438678252, i6, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
            }
            float f = Intrinsics.areEqual(m107535g, obj) ? 1.0f : 0.0f;
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            Float valueOf = Float.valueOf(f);
            Object m107529m = f96.m107529m();
            interfaceC32720Et0.mo89638F(-438678252);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-438678252, i6, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
            }
            float f2 = Intrinsics.areEqual(m107529m, obj) ? 1.0f : 0.0f;
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC48627sP5 m101073c = J96.m101073c(f96, valueOf, Float.valueOf(f2), c7363b.invoke((C7363b) f96.m107531k(), (F96.InterfaceC2189b) interfaceC32720Et0, (InterfaceC32720Et0) Integer.valueOf((i5 >> 3) & 112)), m76516i, "FloatAnimation", interfaceC32720Et0, (i5 & 14) | (57344 & (i5 << 9)) | ((i5 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(m101073c);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C7362a(m101073c);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m68714a = C11327b.m68714a(c20912a, (Function1) mo89635G);
            Function3<T, InterfaceC32720Et0, Integer, Unit> function3 = this.f33374k;
            Object obj2 = this.f33373j;
            int i7 = this.f33371h;
            interfaceC32720Et0.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m68714a);
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
            interfaceC32720Et0.mo89638F(-2137368960);
            C40689f10 c40689f10 = C40689f10.f79291a;
            function3.invoke(obj2, interfaceC32720Et0, Integer.valueOf((i7 >> 9) & 112));
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SE0$e */
    /* loaded from: classes.dex */
    public static final class C7364e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ F96<T> f33377g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f33378h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC49435tm1<Float> f33379i;

        /* renamed from: j */
        public final /* synthetic */ Function1<T, Object> f33380j;

        /* renamed from: k */
        public final /* synthetic */ Function3<T, InterfaceC32720Et0, Integer, Unit> f33381k;

        /* renamed from: l */
        public final /* synthetic */ int f33382l;

        /* renamed from: m */
        public final /* synthetic */ int f33383m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7364e(F96<T> f96, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC49435tm1<Float> interfaceC49435tm1, Function1<? super T, ? extends Object> function1, Function3<? super T, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f33377g = f96;
            this.f33378h = interfaceC41563gV2;
            this.f33379i = interfaceC49435tm1;
            this.f33380j = function1;
            this.f33381k = function3;
            this.f33382l = i;
            this.f33383m = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            SE0.m85820a(this.f33377g, this.f33378h, this.f33379i, this.f33380j, this.f33381k, interfaceC32720Et0, this.f33382l | 1, this.f33383m);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void m85820a(F96<T> f96, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC49435tm1<Float> interfaceC49435tm1, Function1<? super T, ? extends Object> function1, Function3<? super T, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        int i7;
        int i8;
        C7359b c7359b;
        int i9;
        int i10;
        InterfaceC41563gV2.C20912a c20912a;
        C49330tb6 c49330tb6;
        Object mo89635G;
        InterfaceC32720Et0.C2012a c2012a;
        MM5 mm5;
        Object mo89635G2;
        Map map;
        MM5 mm52;
        int i11;
        int size;
        int i12;
        Function1<? super T, ? extends Object> function12;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC49435tm1<Float> interfaceC49435tm12;
        boolean mo89539n;
        Object mo89635G3;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(f96, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(679005231);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(f96)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i2 & 2;
            if (i6 != 0) {
                i3 |= 128;
            }
            i7 = i2 & 4;
            if (i7 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                Object obj2 = function1;
                if (mo89518u.mo89539n(obj2)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
                c7359b = obj2;
                if ((i2 & 8) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    if (mo89518u.mo89539n(content)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if (i6 != 2 && (46811 & i10) == 9362 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    interfaceC41563gV22 = obj;
                    function12 = c7359b;
                    interfaceC49435tm12 = interfaceC49435tm1;
                } else {
                    if (i13 != 0) {
                        c20912a = InterfaceC41563gV2.f82354b0;
                    } else {
                        c20912a = obj;
                    }
                    if (i6 != 0) {
                        c49330tb6 = C26160mf.m25219k(0, 0, null, 7, null);
                    } else {
                        c49330tb6 = interfaceC49435tm1;
                    }
                    if (i7 != 0) {
                        c7359b = C7359b.f33368g;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(679005231, i10, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                    }
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    c2012a = InterfaceC32720Et0.f8257a;
                    MM5 mm53 = mo89635G;
                    if (mo89635G == c2012a.m108267a()) {
                        MM5 m105203d = GM5.m105203d();
                        m105203d.add(f96.m107535g());
                        mo89518u.mo89503z(m105203d);
                        mm53 = m105203d;
                    }
                    mo89518u.mo89605Q();
                    mm5 = (MM5) mm53;
                    mo89518u.mo89638F(-492369756);
                    mo89635G2 = mo89518u.mo89635G();
                    if (mo89635G2 == c2012a.m108267a()) {
                        mo89635G2 = new LinkedHashMap();
                        mo89518u.mo89503z(mo89635G2);
                    }
                    mo89518u.mo89605Q();
                    map = (Map) mo89635G2;
                    mo89518u.mo89638F(-1621449213);
                    if (Intrinsics.areEqual(f96.m107535g(), f96.m107529m()) && (mm5.size() != 1 || !Intrinsics.areEqual(mm5.get(0), f96.m107529m()))) {
                        mo89518u.mo89638F(1157296644);
                        mo89539n = mo89518u.mo89539n(f96);
                        mo89635G3 = mo89518u.mo89635G();
                        if (!mo89539n || mo89635G3 == c2012a.m108267a()) {
                            mo89635G3 = new C7360c(f96);
                            mo89518u.mo89503z(mo89635G3);
                        }
                        mo89518u.mo89605Q();
                        CollectionsKt__MutableCollectionsKt.removeAll((List) mm5, (Function1) mo89635G3);
                        map.clear();
                    }
                    mo89518u.mo89605Q();
                    if (!map.containsKey(f96.m107529m())) {
                        Iterator<T> it = mm5.iterator();
                        int i14 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                if (Intrinsics.areEqual(c7359b.invoke((T) it.next()), c7359b.invoke(f96.m107529m()))) {
                                    break;
                                }
                                i14++;
                            } else {
                                i14 = -1;
                                break;
                            }
                        }
                        if (i14 == -1) {
                            mm5.add(f96.m107529m());
                        } else {
                            mm5.set(i14, f96.m107529m());
                        }
                        map.clear();
                        int size2 = mm5.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            T t = mm5.get(i15);
                            Map map2 = map;
                            map2.put(t, C43575jt0.m29791b(mo89518u, -1426421288, true, new C7361d(f96, i10, c49330tb6, t, content)));
                            i15++;
                            mm5 = mm5;
                            map = map2;
                        }
                    }
                    Map map3 = map;
                    mm52 = mm5;
                    int i16 = (i10 >> 3) & 14;
                    mo89518u.mo89638F(733328855);
                    int i17 = i16 >> 3;
                    InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, mo89518u, (i17 & 112) | (i17 & 14));
                    mo89518u.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
                    i11 = ((((i16 << 3) & 112) << 9) & 7168) | 6;
                    if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                        C52468yt0.m2335c();
                    }
                    mo89518u.mo89557h();
                    if (mo89518u.mo89521t()) {
                        mo89518u.mo89617M(m113415a);
                    } else {
                        mo89518u.mo89566e();
                    }
                    mo89518u.mo89620L();
                    InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
                    C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
                    C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                    C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                    C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                    mo89518u.mo89530q();
                    m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i11 >> 3) & 112));
                    mo89518u.mo89638F(2058660585);
                    mo89518u.mo89638F(-2137368960);
                    if (((i11 >> 9) & 14 & 11) != 2 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                    } else {
                        C40689f10 c40689f10 = C40689f10.f79291a;
                        mo89518u.mo89638F(-1621447954);
                        size = mm52.size();
                        i12 = 0;
                        while (i12 < size) {
                            MM5 mm54 = mm52;
                            Object obj3 = mm54.get(i12);
                            mo89518u.mo89623K(-450541366, c7359b.invoke(obj3));
                            Function2 function2 = (Function2) map3.get(obj3);
                            if (function2 != null) {
                                function2.invoke(mo89518u, 0);
                            }
                            mo89518u.mo89608P();
                            i12++;
                            mm52 = mm54;
                        }
                        mo89518u.mo89605Q();
                    }
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    mo89518u.mo89563f();
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    function12 = c7359b;
                    interfaceC41563gV22 = c20912a;
                    interfaceC49435tm12 = c49330tb6;
                }
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new C7364e(f96, interfaceC41563gV22, interfaceC49435tm12, function12, content, i, i2));
                    return;
                }
                return;
            }
            c7359b = function1;
            if ((i2 & 8) != 0) {
            }
            i10 = i3;
            if (i6 != 2) {
            }
            if (i13 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            c2012a = InterfaceC32720Et0.f8257a;
            MM5 mm532 = mo89635G;
            if (mo89635G == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            mm5 = (MM5) mm532;
            mo89518u.mo89638F(-492369756);
            mo89635G2 = mo89518u.mo89635G();
            if (mo89635G2 == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            map = (Map) mo89635G2;
            mo89518u.mo89638F(-1621449213);
            if (Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
                mo89518u.mo89638F(1157296644);
                mo89539n = mo89518u.mo89539n(f96);
                mo89635G3 = mo89518u.mo89635G();
                if (!mo89539n) {
                }
                mo89635G3 = new C7360c(f96);
                mo89518u.mo89503z(mo89635G3);
                mo89518u.mo89605Q();
                CollectionsKt__MutableCollectionsKt.removeAll((List) mm5, (Function1) mo89635G3);
                map.clear();
            }
            mo89518u.mo89605Q();
            if (!map.containsKey(f96.m107529m())) {
            }
            Map map32 = map;
            mm52 = mm5;
            int i162 = (i10 >> 3) & 14;
            mo89518u.mo89638F(733328855);
            int i172 = i162 >> 3;
            InterfaceC51579xO2 m44729h2 = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, mo89518u, (i172 & 112) | (i172 & 14));
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(c20912a);
            i11 = ((((i162 << 3) & 112) << 9) & 7168) | 6;
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a2, m44729h2, c0757a2.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a2.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
            mo89518u.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i11 >> 3) & 112));
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-2137368960);
            if (((i11 >> 9) & 14 & 11) != 2) {
            }
            C40689f10 c40689f102 = C40689f10.f79291a;
            mo89518u.mo89638F(-1621447954);
            size = mm52.size();
            i12 = 0;
            while (i12 < size) {
            }
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
            }
            function12 = c7359b;
            interfaceC41563gV22 = c20912a;
            interfaceC49435tm12 = c49330tb6;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        obj = interfaceC41563gV2;
        i6 = i2 & 2;
        if (i6 != 0) {
        }
        i7 = i2 & 4;
        if (i7 == 0) {
        }
        c7359b = function1;
        if ((i2 & 8) != 0) {
        }
        i10 = i3;
        if (i6 != 2) {
        }
        if (i13 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        c2012a = InterfaceC32720Et0.f8257a;
        MM5 mm5322 = mo89635G;
        if (mo89635G == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        mm5 = (MM5) mm5322;
        mo89518u.mo89638F(-492369756);
        mo89635G2 = mo89518u.mo89635G();
        if (mo89635G2 == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        map = (Map) mo89635G2;
        mo89518u.mo89638F(-1621449213);
        if (Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
        }
        mo89518u.mo89605Q();
        if (!map.containsKey(f96.m107529m())) {
        }
        Map map322 = map;
        mm52 = mm5;
        int i1622 = (i10 >> 3) & 14;
        mo89518u.mo89638F(733328855);
        int i1722 = i1622 >> 3;
        InterfaceC51579xO2 m44729h22 = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, mo89518u, (i1722 & 112) | (i1722 & 14));
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq622 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a22 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a22 = c0757a22.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22 = C31723Am2.m115273a(c20912a);
        i11 = ((((i1622 << 3) & 112) << 9) & 7168) | 6;
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a22 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a22, m44729h22, c0757a22.m113412d());
        C38680bf6.m64191b(m64192a22, interfaceC41273g0122, c0757a22.m113414b());
        C38680bf6.m64191b(m64192a22, enumC47065pm222, c0757a22.m113413c());
        C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a22.m113410f());
        mo89518u.mo89530q();
        m115273a22.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i11 >> 3) & 112));
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-2137368960);
        if (((i11 >> 9) & 14 & 11) != 2) {
        }
        C40689f10 c40689f1022 = C40689f10.f79291a;
        mo89518u.mo89638F(-1621447954);
        size = mm52.size();
        i12 = 0;
        while (i12 < size) {
        }
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        function12 = c7359b;
        interfaceC41563gV22 = c20912a;
        interfaceC49435tm12 = c49330tb6;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    /* renamed from: b */
    public static final /* synthetic */ void m85819b(Object obj, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC49435tm1 interfaceC49435tm1, Function3 content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(523603005);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(interfaceC41563gV2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(content)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if (i8 == 4 && (i3 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (i7 != 0) {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            if (i8 != 0) {
                interfaceC49435tm1 = C26160mf.m25219k(0, 0, null, 7, null);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(523603005, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:65)");
            }
            m85820a(J96.m101071e(obj, null, mo89518u, (i3 & 8) | (i3 & 14), 2), interfaceC41563gV2, interfaceC49435tm1, null, content, mo89518u, (i3 & 112) | 512 | ((i3 << 3) & 57344), 4);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC41563gV2 interfaceC41563gV22 = interfaceC41563gV2;
        InterfaceC49435tm1 interfaceC49435tm12 = interfaceC49435tm1;
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C7358a(obj, interfaceC41563gV22, interfaceC49435tm12, content, i, i2));
        }
    }
}
