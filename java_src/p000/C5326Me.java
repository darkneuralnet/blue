package p000;

import androidx.compose.p003ui.layout.C11336b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C6080Oe;
import p000.F96;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
import p000.OU3;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: S
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aU\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002>\b\u0002\u0010\t\u001a8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0002H\u0007ø\u0001\u0000\u001a\u0015\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0087\u0004\u001a©\u0001\u0010!\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u001f\b\u0002\u0010\u0018\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192%\b\u0002\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00152,\u0010 \u001a(\u0012\u0004\u0012\u00020\u001e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001f0\u0002¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"", "clip", "Lkotlin/Function2;", "LG52;", "Lkotlin/ParameterName;", "name", "initialSize", "targetSize", "Ltm1;", "sizeAnimationSpec", "LGB5;", "b", "LZe1;", "Lgi1;", "exit", "LHA0;", DateTokenConverter.CONVERTER_KEY, "S", "LF96;", "LgV2;", "modifier", "Lkotlin/Function1;", "LOe;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "LK9;", "contentAlignment", "targetState", "", "contentKey", "LTe;", "", "content", C17296a.f69688o, "(LF96;LgV2;Lkotlin/jvm/functions/Function1;LK9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;LEt0;II)V", "animation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,780:1\n76#2:781\n76#2:832\n36#3:782\n36#3:789\n36#3:796\n50#3:816\n49#3:817\n25#3:824\n460#3,13:844\n473#3,3:859\n1057#4,6:783\n1057#4,6:790\n1057#4,6:797\n1057#4,6:818\n1057#4,6:825\n350#5,7:803\n1855#5,2:857\n32#6,6:810\n75#7:831\n76#7,11:833\n89#7:862\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n617#1:781\n709#1:832\n618#1:782\n623#1:789\n624#1:796\n707#1:816\n707#1:817\n718#1:824\n709#1:844,13\n709#1:859,3\n618#1:783,6\n623#1:790,6\n624#1:797,6\n707#1:818,6\n718#1:825,6\n653#1:803,7\n712#1:857,2\n663#1:810,6\n709#1:831\n709#1:833,11\n709#1:862\n*E\n"})
/* renamed from: Me */
/* loaded from: classes.dex */
public final class C5326Me {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Me$a */
    /* loaded from: classes.dex */
    public static final class C5327a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ F96<S> f23319g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f23320h;

        /* renamed from: i */
        public final /* synthetic */ Function1<C6080Oe<S>, HA0> f23321i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC4360K9 f23322j;

        /* renamed from: k */
        public final /* synthetic */ Function1<S, Object> f23323k;

        /* renamed from: l */
        public final /* synthetic */ Function4<InterfaceC7907Te, S, InterfaceC32720Et0, Integer, Unit> f23324l;

        /* renamed from: m */
        public final /* synthetic */ int f23325m;

        /* renamed from: n */
        public final /* synthetic */ int f23326n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5327a(F96<S> f96, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super C6080Oe<S>, HA0> function1, InterfaceC4360K9 interfaceC4360K9, Function1<? super S, ? extends Object> function12, Function4<? super InterfaceC7907Te, ? super S, ? super InterfaceC32720Et0, ? super Integer, Unit> function4, int i, int i2) {
            super(2);
            this.f23319g = f96;
            this.f23320h = interfaceC41563gV2;
            this.f23321i = function1;
            this.f23322j = interfaceC4360K9;
            this.f23323k = function12;
            this.f23324l = function4;
            this.f23325m = i;
            this.f23326n = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C5326Me.m95100a(this.f23319g, this.f23320h, this.f23321i, this.f23322j, this.f23323k, this.f23324l, interfaceC32720Et0, this.f23325m | 1, this.f23326n);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Me$b */
    /* loaded from: classes.dex */
    public static final class C5328b extends Lambda implements Function1<C6080Oe<S>, HA0> {

        /* renamed from: g */
        public static final C5328b f23327g = new C5328b();

        public C5328b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final HA0 invoke(C6080Oe<S> c6080Oe) {
            Intrinsics.checkNotNullParameter(c6080Oe, "$this$null");
            return C5326Me.m95097d(C37266Ye1.m74631t(C26160mf.m25219k(220, 90, null, 4, null), 0.0f, 2, null).m72831c(C37266Ye1.m74627x(C26160mf.m25219k(220, 90, null, 4, null), 0.92f, 0L, 4, null)), C37266Ye1.m74629v(C26160mf.m25219k(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Me$c */
    /* loaded from: classes.dex */
    public static final class C5329c extends Lambda implements Function1<S, S> {

        /* renamed from: g */
        public static final C5329c f23328g = new C5329c();

        public C5329c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final S invoke(S s) {
            return s;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,780:1\n25#2:781\n36#2:788\n25#2:795\n1057#3,6:782\n1057#3,6:789\n1057#3,6:796\n1#4:802\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1\n*L\n665#1:781\n669#1:788\n676#1:795\n665#1:782,6\n669#1:789,6\n676#1:796,6\n*E\n"})
    /* renamed from: Me$d */
    /* loaded from: classes.dex */
    public static final class C5330d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ F96<S> f23329g;

        /* renamed from: h */
        public final /* synthetic */ S f23330h;

        /* renamed from: i */
        public final /* synthetic */ int f23331i;

        /* renamed from: j */
        public final /* synthetic */ Function1<C6080Oe<S>, HA0> f23332j;

        /* renamed from: k */
        public final /* synthetic */ C6080Oe<S> f23333k;

        /* renamed from: l */
        public final /* synthetic */ Function4<InterfaceC7907Te, S, InterfaceC32720Et0, Integer, Unit> f23334l;

        /* renamed from: m */
        public final /* synthetic */ MM5<S> f23335m;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Me$d$a */
        /* loaded from: classes.dex */
        public static final class C5331a extends Lambda implements Function3<InterfaceC52765zO2, InterfaceC50393vO2, C44228kz0, InterfaceC52172yO2> {

            /* renamed from: g */
            public final /* synthetic */ HA0 f23336g;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Me$d$a$a */
            /* loaded from: classes.dex */
            public static final class C5332a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

                /* renamed from: g */
                public final /* synthetic */ OU3 f23337g;

                /* renamed from: h */
                public final /* synthetic */ HA0 f23338h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5332a(OU3 ou3, HA0 ha0) {
                    super(1);
                    this.f23337g = ou3;
                    this.f23338h = ha0;
                }

                /* renamed from: a */
                public final void m95094a(OU3.AbstractC6015a layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    layout.m92210m(this.f23337g, 0, 0, this.f23338h.m104226d());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                    m95094a(abstractC6015a);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5331a(HA0 ha0) {
                super(3);
                this.f23336g = ha0;
            }

            /* renamed from: a */
            public final InterfaceC52172yO2 m95095a(InterfaceC52765zO2 layout, InterfaceC50393vO2 measurable, long j) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Intrinsics.checkNotNullParameter(measurable, "measurable");
                OU3 mo8763P0 = measurable.mo8763P0(j);
                return InterfaceC52765zO2.m1430Y(layout, mo8763P0.m92226i1(), mo8763P0.m92229d1(), null, new C5332a(mo8763P0, this.f23336g), 4, null);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ InterfaceC52172yO2 invoke(InterfaceC52765zO2 interfaceC52765zO2, InterfaceC50393vO2 interfaceC50393vO2, C44228kz0 c44228kz0) {
                return m95095a(interfaceC52765zO2, interfaceC50393vO2, c44228kz0.m28058s());
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Me$d$b */
        /* loaded from: classes.dex */
        public static final class C5333b extends Lambda implements Function1<S, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ S f23339g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5333b(S s) {
                super(1);
                this.f23339g = s;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((C5333b) obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(S s) {
                return Boolean.valueOf(Intrinsics.areEqual(s, this.f23339g));
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Me$d$c */
        /* loaded from: classes.dex */
        public static final class C5334c extends Lambda implements Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C6080Oe<S> f23340g;

            /* renamed from: h */
            public final /* synthetic */ S f23341h;

            /* renamed from: i */
            public final /* synthetic */ Function4<InterfaceC7907Te, S, InterfaceC32720Et0, Integer, Unit> f23342i;

            /* renamed from: j */
            public final /* synthetic */ int f23343j;

            /* renamed from: k */
            public final /* synthetic */ MM5<S> f23344k;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1$4$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,780:1\n62#2,5:781\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1$4$1\n*L\n694#1:781,5\n*E\n"})
            /* renamed from: Me$d$c$a */
            /* loaded from: classes.dex */
            public static final class C5335a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

                /* renamed from: g */
                public final /* synthetic */ MM5<S> f23345g;

                /* renamed from: h */
                public final /* synthetic */ S f23346h;

                /* renamed from: i */
                public final /* synthetic */ C6080Oe<S> f23347i;

                @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"Me$d$c$a$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1$4$1\n*L\n1#1,483:1\n695#2,3:484\n*E\n"})
                /* renamed from: Me$d$c$a$a */
                /* loaded from: classes.dex */
                public static final class C5336a implements InterfaceC44288l51 {

                    /* renamed from: a */
                    public final /* synthetic */ MM5 f23348a;

                    /* renamed from: b */
                    public final /* synthetic */ Object f23349b;

                    /* renamed from: c */
                    public final /* synthetic */ C6080Oe f23350c;

                    public C5336a(MM5 mm5, Object obj, C6080Oe c6080Oe) {
                        this.f23348a = mm5;
                        this.f23349b = obj;
                        this.f23350c = c6080Oe;
                    }

                    @Override // p000.InterfaceC44288l51
                    public void dispose() {
                        this.f23348a.remove(this.f23349b);
                        this.f23350c.m91775g().remove(this.f23349b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5335a(MM5<S> mm5, S s, C6080Oe<S> c6080Oe) {
                    super(1);
                    this.f23345g = mm5;
                    this.f23346h = s;
                    this.f23347i = c6080Oe;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ InterfaceC44288l51 invoke(C44881m51 c44881m51) {
                    return invoke2(c44881m51);
                }

                /* renamed from: invoke */
                public final InterfaceC44288l51 invoke2(C44881m51 DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    return new C5336a(this.f23345g, this.f23346h, this.f23347i);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C5334c(C6080Oe<S> c6080Oe, S s, Function4<? super InterfaceC7907Te, ? super S, ? super InterfaceC32720Et0, ? super Integer, Unit> function4, int i, MM5<S> mm5) {
                super(3);
                this.f23340g = c6080Oe;
                this.f23341h = s;
                this.f23342i = function4;
                this.f23343j = i;
                this.f23344k = mm5;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC7907Te, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC7907Te AnimatedVisibility, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if ((i & 14) == 0) {
                    i |= interfaceC32720Et0.mo89539n(AnimatedVisibility) ? 4 : 2;
                }
                if ((i & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1894897681, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:690)");
                }
                int i2 = i & 14;
                Y91.m75536c(AnimatedVisibility, new C5335a(this.f23344k, this.f23341h, this.f23340g), interfaceC32720Et0, i2);
                this.f23340g.m91775g().put(this.f23341h, ((C8338Ue) AnimatedVisibility).m81217a());
                this.f23342i.invoke(AnimatedVisibility, this.f23341h, interfaceC32720Et0, Integer.valueOf(i2 | ((this.f23343j >> 9) & 896)));
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5330d(F96<S> f96, S s, int i, Function1<? super C6080Oe<S>, HA0> function1, C6080Oe<S> c6080Oe, Function4<? super InterfaceC7907Te, ? super S, ? super InterfaceC32720Et0, ? super Integer, Unit> function4, MM5<S> mm5) {
            super(2);
            this.f23329g = f96;
            this.f23330h = s;
            this.f23331i = i;
            this.f23332j = function1;
            this.f23333k = c6080Oe;
            this.f23334l = function4;
            this.f23335m = mm5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            AbstractC41687gi1 m104229a;
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(885640742, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:663)");
            }
            Function1<C6080Oe<S>, HA0> function1 = this.f23332j;
            F96.InterfaceC2189b interfaceC2189b = this.f23333k;
            interfaceC32720Et0.mo89638F(-492369756);
            HA0 mo89635G = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                mo89635G = function1.invoke(interfaceC2189b);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            HA0 ha0 = (HA0) mo89635G;
            Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(this.f23329g.m107531k().mo91780b(), this.f23330h));
            F96<S> f96 = this.f23329g;
            Object obj = this.f23330h;
            Function1<C6080Oe<S>, HA0> function12 = this.f23332j;
            F96.InterfaceC2189b interfaceC2189b2 = this.f23333k;
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(valueOf);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G2 == c2012a.m108267a()) {
                if (Intrinsics.areEqual(f96.m107531k().mo91780b(), obj)) {
                    m104229a = AbstractC41687gi1.f84046a.m37886a();
                } else {
                    m104229a = function12.invoke(interfaceC2189b2).m104229a();
                }
                mo89635G2 = m104229a;
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            AbstractC41687gi1 abstractC41687gi1 = (AbstractC41687gi1) mo89635G2;
            Object obj2 = this.f23330h;
            F96<S> f962 = this.f23329g;
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G3 = interfaceC32720Et0.mo89635G();
            if (mo89635G3 == c2012a.m108267a()) {
                mo89635G3 = new C6080Oe.C6081a(Intrinsics.areEqual(obj2, f962.m107529m()));
                interfaceC32720Et0.mo89503z(mo89635G3);
            }
            interfaceC32720Et0.mo89605Q();
            C6080Oe.C6081a c6081a = (C6080Oe.C6081a) mo89635G3;
            AbstractC37500Ze1 m104227c = ha0.m104227c();
            InterfaceC41563gV2 m68613a = C11336b.m68613a(InterfaceC41563gV2.f82354b0, new C5331a(ha0));
            c6081a.m91769b(Intrinsics.areEqual(this.f23330h, this.f23329g.m107529m()));
            C7489Se.m85172c(this.f23329g, new C5333b(this.f23330h), m68613a.mo39266t0(c6081a), m104227c, abstractC41687gi1, C43575jt0.m29791b(interfaceC32720Et0, -1894897681, true, new C5334c(this.f23333k, this.f23330h, this.f23334l, this.f23331i, this.f23335m)), interfaceC32720Et0, 196608 | (this.f23331i & 14), 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LG52;", "<anonymous parameter 0>", "<anonymous parameter 1>", "LjO5;", C17296a.f69688o, "(JJ)LjO5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Me$e */
    /* loaded from: classes.dex */
    public static final class C5337e extends Lambda implements Function2<G52, G52, C43282jO5<G52>> {

        /* renamed from: g */
        public static final C5337e f23351g = new C5337e();

        static {
        }

        public C5337e() {
            super(2);
        }

        /* renamed from: a */
        public final C43282jO5<G52> m95093a(long j, long j2) {
            return C26160mf.m25221i(0.0f, 0.0f, G52.m105834b(C32501Du6.m109709d(G52.f10893b)), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C43282jO5<G52> invoke(G52 g52, G52 g522) {
            return m95093a(g52.m105826j(), g522.m105826j());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x024e A[LOOP:2: B:319:0x024c->B:320:0x024e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void m95100a(F96<S> f96, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super C6080Oe<S>, HA0> function1, InterfaceC4360K9 interfaceC4360K9, Function1<? super S, ? extends Object> function12, Function4<? super InterfaceC7907Te, ? super S, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        C5328b c5328b;
        int i7;
        int i8;
        int i9;
        InterfaceC4360K9 interfaceC4360K92;
        int i10;
        int i11;
        C5329c c5329c;
        int i12;
        int i13;
        InterfaceC41563gV2.C20912a c20912a;
        EnumC47065pm2 enumC47065pm2;
        boolean mo89539n;
        Object mo89635G;
        C6080Oe c6080Oe;
        boolean mo89539n2;
        Object mo89635G2;
        MM5 mm5;
        boolean mo89539n3;
        Object mo89635G3;
        Map map;
        int size;
        int i14;
        Function1<? super C6080Oe<S>, HA0> function13;
        boolean mo89539n4;
        Function1<? super C6080Oe<S>, HA0> function14;
        HA0 invoke;
        Object mo89635G4;
        Function1<? super C6080Oe<S>, HA0> function15;
        Function1<? super S, ? extends Object> function16;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC4360K9 interfaceC4360K93;
        Iterator<T> it;
        int i15;
        int i16;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(f96, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-114689412);
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
        int i17 = i2 & 1;
        if (i17 != 0) {
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
            if (i6 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                c5328b = function1;
                if (mo89518u.mo89539n(c5328b)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
                i8 = i2 & 4;
                if (i8 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    Object obj2 = interfaceC4360K9;
                    if (mo89518u.mo89539n(obj2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i3 |= i9;
                    interfaceC4360K92 = obj2;
                    i10 = i2 & 8;
                    if (i10 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        Object obj3 = function12;
                        if (mo89518u.mo89539n(obj3)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i3 |= i11;
                        c5329c = obj3;
                        if ((i2 & 16) != 0) {
                            i12 = ImageMetadata.EDGE_MODE;
                        } else {
                            if ((458752 & i) == 0) {
                                if (mo89518u.mo89539n(content)) {
                                    i12 = DateUtils.FORMAT_NUMERIC_DATE;
                                } else {
                                    i12 = 65536;
                                }
                            }
                            i13 = i3;
                            if ((374491 & i13) != 74898 && mo89518u.mo89575b()) {
                                mo89518u.mo89548k();
                                interfaceC41563gV22 = obj;
                                function15 = c5328b;
                                interfaceC4360K93 = interfaceC4360K92;
                                function16 = c5329c;
                            } else {
                                if (i17 == 0) {
                                    c20912a = InterfaceC41563gV2.f82354b0;
                                } else {
                                    c20912a = obj;
                                }
                                if (i6 != 0) {
                                    c5328b = C5328b.f23327g;
                                }
                                if (i8 != 0) {
                                    interfaceC4360K92 = InterfaceC4360K9.f19170a.m99132n();
                                }
                                if (i10 != 0) {
                                    c5329c = C5329c.f23328g;
                                }
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87816Z(-114689412, i13, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:605)");
                                }
                                enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                                mo89518u.mo89638F(1157296644);
                                mo89539n = mo89518u.mo89539n(f96);
                                mo89635G = mo89518u.mo89635G();
                                if (!mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                                    mo89635G = new C6080Oe(f96, interfaceC4360K92, enumC47065pm2);
                                    mo89518u.mo89503z(mo89635G);
                                }
                                mo89518u.mo89605Q();
                                c6080Oe = (C6080Oe) mo89635G;
                                mo89518u.mo89638F(1157296644);
                                mo89539n2 = mo89518u.mo89539n(f96);
                                mo89635G2 = mo89518u.mo89635G();
                                if (!mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                                    mo89635G2 = GM5.m105202e(f96.m107535g());
                                    mo89518u.mo89503z(mo89635G2);
                                }
                                mo89518u.mo89605Q();
                                mm5 = (MM5) mo89635G2;
                                mo89518u.mo89638F(1157296644);
                                mo89539n3 = mo89518u.mo89539n(f96);
                                mo89635G3 = mo89518u.mo89635G();
                                if (!mo89539n3 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                                    mo89635G3 = new LinkedHashMap();
                                    mo89518u.mo89503z(mo89635G3);
                                }
                                mo89518u.mo89605Q();
                                map = (Map) mo89635G3;
                                if (!mm5.contains(f96.m107535g())) {
                                    mm5.clear();
                                    mm5.add(f96.m107535g());
                                }
                                if (Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
                                    if (mm5.size() != 1 || !Intrinsics.areEqual(mm5.get(0), f96.m107535g())) {
                                        mm5.clear();
                                        mm5.add(f96.m107535g());
                                    }
                                    if (map.size() != 1 || map.containsKey(f96.m107535g())) {
                                        map.clear();
                                    }
                                    c6080Oe.m91773i(interfaceC4360K92);
                                    c6080Oe.m91772j(enumC47065pm2);
                                }
                                if (!Intrinsics.areEqual(f96.m107535g(), f96.m107529m()) && !mm5.contains(f96.m107529m())) {
                                    it = mm5.iterator();
                                    i15 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            if (Intrinsics.areEqual(c5329c.invoke((Object) it.next()), c5329c.invoke(f96.m107529m()))) {
                                                i16 = -1;
                                                break;
                                            }
                                            i15++;
                                        } else {
                                            i16 = -1;
                                            i15 = -1;
                                            break;
                                        }
                                    }
                                    if (i15 != i16) {
                                        mm5.add(f96.m107529m());
                                    } else {
                                        mm5.set(i15, f96.m107529m());
                                    }
                                }
                                if (map.containsKey(f96.m107529m()) || !map.containsKey(f96.m107535g())) {
                                    map.clear();
                                    size = mm5.size();
                                    i14 = 0;
                                    while (i14 < size) {
                                        Object obj4 = mm5.get(i14);
                                        MM5 mm52 = mm5;
                                        map = map;
                                        map.put(obj4, C43575jt0.m29791b(mo89518u, 885640742, true, new C5330d(f96, obj4, i13, c5328b, c6080Oe, content, mm52)));
                                        i14++;
                                        mm5 = mm52;
                                        c5328b = c5328b;
                                        size = size;
                                        interfaceC4360K92 = interfaceC4360K92;
                                    }
                                }
                                MM5 mm53 = mm5;
                                function13 = c5328b;
                                InterfaceC4360K9 interfaceC4360K94 = interfaceC4360K92;
                                F96.InterfaceC2189b<S> m107531k = f96.m107531k();
                                mo89518u.mo89638F(511388516);
                                mo89539n4 = mo89518u.mo89539n(m107531k) | mo89518u.mo89539n(c6080Oe);
                                Object mo89635G5 = mo89518u.mo89635G();
                                if (mo89539n4 && mo89635G5 != InterfaceC32720Et0.f8257a.m108267a()) {
                                    invoke = mo89635G5;
                                    function14 = function13;
                                } else {
                                    function14 = function13;
                                    invoke = function14.invoke(c6080Oe);
                                    mo89518u.mo89503z(invoke);
                                }
                                mo89518u.mo89605Q();
                                InterfaceC41563gV2 mo39266t0 = c20912a.mo39266t0(c6080Oe.m91779c(invoke, mo89518u, 72));
                                mo89518u.mo89638F(-492369756);
                                mo89635G4 = mo89518u.mo89635G();
                                if (mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                                    mo89635G4 = new C5616Ne(c6080Oe);
                                    mo89518u.mo89503z(mo89635G4);
                                }
                                mo89518u.mo89605Q();
                                C5616Ne c5616Ne = (C5616Ne) mo89635G4;
                                mo89518u.mo89638F(-1323940314);
                                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                                EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(mo39266t0);
                                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                                    C52468yt0.m2335c();
                                }
                                mo89518u.mo89557h();
                                if (!mo89518u.mo89521t()) {
                                    mo89518u.mo89617M(m113415a);
                                } else {
                                    mo89518u.mo89566e();
                                }
                                mo89518u.mo89620L();
                                InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
                                C38680bf6.m64191b(m64192a, c5616Ne, c0757a.m113412d());
                                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                                C38680bf6.m64191b(m64192a, enumC47065pm22, c0757a.m113413c());
                                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                                mo89518u.mo89530q();
                                m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                                mo89518u.mo89638F(2058660585);
                                mo89518u.mo89638F(-441512234);
                                for (Object obj5 : mm53) {
                                    mo89518u.mo89623K(-1739564366, c5329c.invoke(obj5));
                                    Function2 function2 = (Function2) map.get(obj5);
                                    if (function2 != null) {
                                        function2.invoke(mo89518u, 0);
                                    }
                                    mo89518u.mo89608P();
                                }
                                mo89518u.mo89605Q();
                                mo89518u.mo89605Q();
                                mo89518u.mo89563f();
                                mo89518u.mo89605Q();
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                                function15 = function14;
                                function16 = c5329c;
                                interfaceC41563gV22 = c20912a;
                                interfaceC4360K93 = interfaceC4360K94;
                            }
                            mo89512w = mo89518u.mo89512w();
                            if (mo89512w == null) {
                                mo89512w.mo20405a(new C5327a(f96, interfaceC41563gV22, function15, interfaceC4360K93, function16, content, i, i2));
                                return;
                            }
                            return;
                        }
                        i3 |= i12;
                        i13 = i3;
                        if ((374491 & i13) != 74898) {
                        }
                        if (i17 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (C35528Qt0.m87827O()) {
                        }
                        enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                        mo89518u.mo89638F(1157296644);
                        mo89539n = mo89518u.mo89539n(f96);
                        mo89635G = mo89518u.mo89635G();
                        if (!mo89539n) {
                        }
                        mo89635G = new C6080Oe(f96, interfaceC4360K92, enumC47065pm2);
                        mo89518u.mo89503z(mo89635G);
                        mo89518u.mo89605Q();
                        c6080Oe = (C6080Oe) mo89635G;
                        mo89518u.mo89638F(1157296644);
                        mo89539n2 = mo89518u.mo89539n(f96);
                        mo89635G2 = mo89518u.mo89635G();
                        if (!mo89539n2) {
                        }
                        mo89635G2 = GM5.m105202e(f96.m107535g());
                        mo89518u.mo89503z(mo89635G2);
                        mo89518u.mo89605Q();
                        mm5 = (MM5) mo89635G2;
                        mo89518u.mo89638F(1157296644);
                        mo89539n3 = mo89518u.mo89539n(f96);
                        mo89635G3 = mo89518u.mo89635G();
                        if (!mo89539n3) {
                        }
                        mo89635G3 = new LinkedHashMap();
                        mo89518u.mo89503z(mo89635G3);
                        mo89518u.mo89605Q();
                        map = (Map) mo89635G3;
                        if (!mm5.contains(f96.m107535g())) {
                        }
                        if (Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
                        }
                        if (!Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
                            it = mm5.iterator();
                            i15 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                }
                                i15++;
                            }
                            if (i15 != i16) {
                            }
                        }
                        if (map.containsKey(f96.m107529m())) {
                        }
                        map.clear();
                        size = mm5.size();
                        i14 = 0;
                        while (i14 < size) {
                        }
                        MM5 mm532 = mm5;
                        function13 = c5328b;
                        InterfaceC4360K9 interfaceC4360K942 = interfaceC4360K92;
                        F96.InterfaceC2189b<S> m107531k2 = f96.m107531k();
                        mo89518u.mo89638F(511388516);
                        mo89539n4 = mo89518u.mo89539n(m107531k2) | mo89518u.mo89539n(c6080Oe);
                        Object mo89635G52 = mo89518u.mo89635G();
                        if (mo89539n4) {
                        }
                        function14 = function13;
                        invoke = function14.invoke(c6080Oe);
                        mo89518u.mo89503z(invoke);
                        mo89518u.mo89605Q();
                        InterfaceC41563gV2 mo39266t02 = c20912a.mo39266t0(c6080Oe.m91779c(invoke, mo89518u, 72));
                        mo89518u.mo89638F(-492369756);
                        mo89635G4 = mo89518u.mo89635G();
                        if (mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                        }
                        mo89518u.mo89605Q();
                        C5616Ne c5616Ne2 = (C5616Ne) mo89635G4;
                        mo89518u.mo89638F(-1323940314);
                        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                        EnumC47065pm2 enumC47065pm222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                        InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
                        Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
                        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(mo39266t02);
                        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                        }
                        mo89518u.mo89557h();
                        if (!mo89518u.mo89521t()) {
                        }
                        mo89518u.mo89620L();
                        InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
                        C38680bf6.m64191b(m64192a2, c5616Ne2, c0757a2.m113412d());
                        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a2.m113414b());
                        C38680bf6.m64191b(m64192a2, enumC47065pm222, c0757a2.m113413c());
                        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
                        mo89518u.mo89530q();
                        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                        mo89518u.mo89638F(2058660585);
                        mo89518u.mo89638F(-441512234);
                        while (r0.hasNext()) {
                        }
                        mo89518u.mo89605Q();
                        mo89518u.mo89605Q();
                        mo89518u.mo89563f();
                        mo89518u.mo89605Q();
                        if (C35528Qt0.m87827O()) {
                        }
                        function15 = function14;
                        function16 = c5329c;
                        interfaceC41563gV22 = c20912a;
                        interfaceC4360K93 = interfaceC4360K942;
                        mo89512w = mo89518u.mo89512w();
                        if (mo89512w == null) {
                        }
                    }
                    c5329c = function12;
                    if ((i2 & 16) != 0) {
                    }
                    i3 |= i12;
                    i13 = i3;
                    if ((374491 & i13) != 74898) {
                    }
                    if (i17 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    mo89518u.mo89638F(1157296644);
                    mo89539n = mo89518u.mo89539n(f96);
                    mo89635G = mo89518u.mo89635G();
                    if (!mo89539n) {
                    }
                    mo89635G = new C6080Oe(f96, interfaceC4360K92, enumC47065pm2);
                    mo89518u.mo89503z(mo89635G);
                    mo89518u.mo89605Q();
                    c6080Oe = (C6080Oe) mo89635G;
                    mo89518u.mo89638F(1157296644);
                    mo89539n2 = mo89518u.mo89539n(f96);
                    mo89635G2 = mo89518u.mo89635G();
                    if (!mo89539n2) {
                    }
                    mo89635G2 = GM5.m105202e(f96.m107535g());
                    mo89518u.mo89503z(mo89635G2);
                    mo89518u.mo89605Q();
                    mm5 = (MM5) mo89635G2;
                    mo89518u.mo89638F(1157296644);
                    mo89539n3 = mo89518u.mo89539n(f96);
                    mo89635G3 = mo89518u.mo89635G();
                    if (!mo89539n3) {
                    }
                    mo89635G3 = new LinkedHashMap();
                    mo89518u.mo89503z(mo89635G3);
                    mo89518u.mo89605Q();
                    map = (Map) mo89635G3;
                    if (!mm5.contains(f96.m107535g())) {
                    }
                    if (Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
                    }
                    if (!Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
                    }
                    if (map.containsKey(f96.m107529m())) {
                    }
                    map.clear();
                    size = mm5.size();
                    i14 = 0;
                    while (i14 < size) {
                    }
                    MM5 mm5322 = mm5;
                    function13 = c5328b;
                    InterfaceC4360K9 interfaceC4360K9422 = interfaceC4360K92;
                    F96.InterfaceC2189b<S> m107531k22 = f96.m107531k();
                    mo89518u.mo89638F(511388516);
                    mo89539n4 = mo89518u.mo89539n(m107531k22) | mo89518u.mo89539n(c6080Oe);
                    Object mo89635G522 = mo89518u.mo89635G();
                    if (mo89539n4) {
                    }
                    function14 = function13;
                    invoke = function14.invoke(c6080Oe);
                    mo89518u.mo89503z(invoke);
                    mo89518u.mo89605Q();
                    InterfaceC41563gV2 mo39266t022 = c20912a.mo39266t0(c6080Oe.m91779c(invoke, mo89518u, 72));
                    mo89518u.mo89638F(-492369756);
                    mo89635G4 = mo89518u.mo89635G();
                    if (mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    C5616Ne c5616Ne22 = (C5616Ne) mo89635G4;
                    mo89518u.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm2222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq622 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a22 = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a22 = c0757a22.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22 = C31723Am2.m115273a(mo39266t022);
                    if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    }
                    mo89518u.mo89557h();
                    if (!mo89518u.mo89521t()) {
                    }
                    mo89518u.mo89620L();
                    InterfaceC32720Et0 m64192a22 = C38680bf6.m64192a(mo89518u);
                    C38680bf6.m64191b(m64192a22, c5616Ne22, c0757a22.m113412d());
                    C38680bf6.m64191b(m64192a22, interfaceC41273g0122, c0757a22.m113414b());
                    C38680bf6.m64191b(m64192a22, enumC47065pm2222, c0757a22.m113413c());
                    C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a22.m113410f());
                    mo89518u.mo89530q();
                    m115273a22.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                    mo89518u.mo89638F(2058660585);
                    mo89518u.mo89638F(-441512234);
                    while (r0.hasNext()) {
                    }
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    mo89518u.mo89563f();
                    mo89518u.mo89605Q();
                    if (C35528Qt0.m87827O()) {
                    }
                    function15 = function14;
                    function16 = c5329c;
                    interfaceC41563gV22 = c20912a;
                    interfaceC4360K93 = interfaceC4360K9422;
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w == null) {
                    }
                }
                interfaceC4360K92 = interfaceC4360K9;
                i10 = i2 & 8;
                if (i10 == 0) {
                }
                c5329c = function12;
                if ((i2 & 16) != 0) {
                }
                i3 |= i12;
                i13 = i3;
                if ((374491 & i13) != 74898) {
                }
                if (i17 == 0) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                mo89518u.mo89638F(1157296644);
                mo89539n = mo89518u.mo89539n(f96);
                mo89635G = mo89518u.mo89635G();
                if (!mo89539n) {
                }
                mo89635G = new C6080Oe(f96, interfaceC4360K92, enumC47065pm2);
                mo89518u.mo89503z(mo89635G);
                mo89518u.mo89605Q();
                c6080Oe = (C6080Oe) mo89635G;
                mo89518u.mo89638F(1157296644);
                mo89539n2 = mo89518u.mo89539n(f96);
                mo89635G2 = mo89518u.mo89635G();
                if (!mo89539n2) {
                }
                mo89635G2 = GM5.m105202e(f96.m107535g());
                mo89518u.mo89503z(mo89635G2);
                mo89518u.mo89605Q();
                mm5 = (MM5) mo89635G2;
                mo89518u.mo89638F(1157296644);
                mo89539n3 = mo89518u.mo89539n(f96);
                mo89635G3 = mo89518u.mo89635G();
                if (!mo89539n3) {
                }
                mo89635G3 = new LinkedHashMap();
                mo89518u.mo89503z(mo89635G3);
                mo89518u.mo89605Q();
                map = (Map) mo89635G3;
                if (!mm5.contains(f96.m107535g())) {
                }
                if (Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
                }
                if (!Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
                }
                if (map.containsKey(f96.m107529m())) {
                }
                map.clear();
                size = mm5.size();
                i14 = 0;
                while (i14 < size) {
                }
                MM5 mm53222 = mm5;
                function13 = c5328b;
                InterfaceC4360K9 interfaceC4360K94222 = interfaceC4360K92;
                F96.InterfaceC2189b<S> m107531k222 = f96.m107531k();
                mo89518u.mo89638F(511388516);
                mo89539n4 = mo89518u.mo89539n(m107531k222) | mo89518u.mo89539n(c6080Oe);
                Object mo89635G5222 = mo89518u.mo89635G();
                if (mo89539n4) {
                }
                function14 = function13;
                invoke = function14.invoke(c6080Oe);
                mo89518u.mo89503z(invoke);
                mo89518u.mo89605Q();
                InterfaceC41563gV2 mo39266t0222 = c20912a.mo39266t0(c6080Oe.m91779c(invoke, mo89518u, 72));
                mo89518u.mo89638F(-492369756);
                mo89635G4 = mo89518u.mo89635G();
                if (mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                }
                mo89518u.mo89605Q();
                C5616Ne c5616Ne222 = (C5616Ne) mo89635G4;
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm22222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6222 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a222 = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a222 = c0757a222.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a222 = C31723Am2.m115273a(mo39266t0222);
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                }
                mo89518u.mo89557h();
                if (!mo89518u.mo89521t()) {
                }
                mo89518u.mo89620L();
                InterfaceC32720Et0 m64192a222 = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a222, c5616Ne222, c0757a222.m113412d());
                C38680bf6.m64191b(m64192a222, interfaceC41273g01222, c0757a222.m113414b());
                C38680bf6.m64191b(m64192a222, enumC47065pm22222, c0757a222.m113413c());
                C38680bf6.m64191b(m64192a222, interfaceC33869Jq6222, c0757a222.m113410f());
                mo89518u.mo89530q();
                m115273a222.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                mo89518u.mo89638F(-441512234);
                while (r0.hasNext()) {
                }
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                if (C35528Qt0.m87827O()) {
                }
                function15 = function14;
                function16 = c5329c;
                interfaceC41563gV22 = c20912a;
                interfaceC4360K93 = interfaceC4360K94222;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                }
            }
            c5328b = function1;
            i8 = i2 & 4;
            if (i8 != 0) {
            }
            interfaceC4360K92 = interfaceC4360K9;
            i10 = i2 & 8;
            if (i10 == 0) {
            }
            c5329c = function12;
            if ((i2 & 16) != 0) {
            }
            i3 |= i12;
            i13 = i3;
            if ((374491 & i13) != 74898) {
            }
            if (i17 == 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            mo89518u.mo89638F(1157296644);
            mo89539n = mo89518u.mo89539n(f96);
            mo89635G = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            mo89635G = new C6080Oe(f96, interfaceC4360K92, enumC47065pm2);
            mo89518u.mo89503z(mo89635G);
            mo89518u.mo89605Q();
            c6080Oe = (C6080Oe) mo89635G;
            mo89518u.mo89638F(1157296644);
            mo89539n2 = mo89518u.mo89539n(f96);
            mo89635G2 = mo89518u.mo89635G();
            if (!mo89539n2) {
            }
            mo89635G2 = GM5.m105202e(f96.m107535g());
            mo89518u.mo89503z(mo89635G2);
            mo89518u.mo89605Q();
            mm5 = (MM5) mo89635G2;
            mo89518u.mo89638F(1157296644);
            mo89539n3 = mo89518u.mo89539n(f96);
            mo89635G3 = mo89518u.mo89635G();
            if (!mo89539n3) {
            }
            mo89635G3 = new LinkedHashMap();
            mo89518u.mo89503z(mo89635G3);
            mo89518u.mo89605Q();
            map = (Map) mo89635G3;
            if (!mm5.contains(f96.m107535g())) {
            }
            if (Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
            }
            if (!Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
            }
            if (map.containsKey(f96.m107529m())) {
            }
            map.clear();
            size = mm5.size();
            i14 = 0;
            while (i14 < size) {
            }
            MM5 mm532222 = mm5;
            function13 = c5328b;
            InterfaceC4360K9 interfaceC4360K942222 = interfaceC4360K92;
            F96.InterfaceC2189b<S> m107531k2222 = f96.m107531k();
            mo89518u.mo89638F(511388516);
            mo89539n4 = mo89518u.mo89539n(m107531k2222) | mo89518u.mo89539n(c6080Oe);
            Object mo89635G52222 = mo89518u.mo89635G();
            if (mo89539n4) {
            }
            function14 = function13;
            invoke = function14.invoke(c6080Oe);
            mo89518u.mo89503z(invoke);
            mo89518u.mo89605Q();
            InterfaceC41563gV2 mo39266t02222 = c20912a.mo39266t0(c6080Oe.m91779c(invoke, mo89518u, 72));
            mo89518u.mo89638F(-492369756);
            mo89635G4 = mo89518u.mo89635G();
            if (mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
            }
            mo89518u.mo89605Q();
            C5616Ne c5616Ne2222 = (C5616Ne) mo89635G4;
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm222222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62222 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a2222 = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a2222 = c0757a2222.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2222 = C31723Am2.m115273a(mo39266t02222);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            }
            mo89518u.mo89557h();
            if (!mo89518u.mo89521t()) {
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a2222 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a2222, c5616Ne2222, c0757a2222.m113412d());
            C38680bf6.m64191b(m64192a2222, interfaceC41273g012222, c0757a2222.m113414b());
            C38680bf6.m64191b(m64192a2222, enumC47065pm222222, c0757a2222.m113413c());
            C38680bf6.m64191b(m64192a2222, interfaceC33869Jq62222, c0757a2222.m113410f());
            mo89518u.mo89530q();
            m115273a2222.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-441512234);
            while (r0.hasNext()) {
            }
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
            }
            function15 = function14;
            function16 = c5329c;
            interfaceC41563gV22 = c20912a;
            interfaceC4360K93 = interfaceC4360K942222;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
            }
        }
        obj = interfaceC41563gV2;
        i6 = i2 & 2;
        if (i6 == 0) {
        }
        c5328b = function1;
        i8 = i2 & 4;
        if (i8 != 0) {
        }
        interfaceC4360K92 = interfaceC4360K9;
        i10 = i2 & 8;
        if (i10 == 0) {
        }
        c5329c = function12;
        if ((i2 & 16) != 0) {
        }
        i3 |= i12;
        i13 = i3;
        if ((374491 & i13) != 74898) {
        }
        if (i17 == 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        mo89518u.mo89638F(1157296644);
        mo89539n = mo89518u.mo89539n(f96);
        mo89635G = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G = new C6080Oe(f96, interfaceC4360K92, enumC47065pm2);
        mo89518u.mo89503z(mo89635G);
        mo89518u.mo89605Q();
        c6080Oe = (C6080Oe) mo89635G;
        mo89518u.mo89638F(1157296644);
        mo89539n2 = mo89518u.mo89539n(f96);
        mo89635G2 = mo89518u.mo89635G();
        if (!mo89539n2) {
        }
        mo89635G2 = GM5.m105202e(f96.m107535g());
        mo89518u.mo89503z(mo89635G2);
        mo89518u.mo89605Q();
        mm5 = (MM5) mo89635G2;
        mo89518u.mo89638F(1157296644);
        mo89539n3 = mo89518u.mo89539n(f96);
        mo89635G3 = mo89518u.mo89635G();
        if (!mo89539n3) {
        }
        mo89635G3 = new LinkedHashMap();
        mo89518u.mo89503z(mo89635G3);
        mo89518u.mo89605Q();
        map = (Map) mo89635G3;
        if (!mm5.contains(f96.m107535g())) {
        }
        if (Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
        }
        if (!Intrinsics.areEqual(f96.m107535g(), f96.m107529m())) {
        }
        if (map.containsKey(f96.m107529m())) {
        }
        map.clear();
        size = mm5.size();
        i14 = 0;
        while (i14 < size) {
        }
        MM5 mm5322222 = mm5;
        function13 = c5328b;
        InterfaceC4360K9 interfaceC4360K9422222 = interfaceC4360K92;
        F96.InterfaceC2189b<S> m107531k22222 = f96.m107531k();
        mo89518u.mo89638F(511388516);
        mo89539n4 = mo89518u.mo89539n(m107531k22222) | mo89518u.mo89539n(c6080Oe);
        Object mo89635G522222 = mo89518u.mo89635G();
        if (mo89539n4) {
        }
        function14 = function13;
        invoke = function14.invoke(c6080Oe);
        mo89518u.mo89503z(invoke);
        mo89518u.mo89605Q();
        InterfaceC41563gV2 mo39266t022222 = c20912a.mo39266t0(c6080Oe.m91779c(invoke, mo89518u, 72));
        mo89518u.mo89638F(-492369756);
        mo89635G4 = mo89518u.mo89635G();
        if (mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
        }
        mo89518u.mo89605Q();
        C5616Ne c5616Ne22222 = (C5616Ne) mo89635G4;
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g0122222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2222222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq622222 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a22222 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a22222 = c0757a22222.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22222 = C31723Am2.m115273a(mo39266t022222);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (!mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a22222 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a22222, c5616Ne22222, c0757a22222.m113412d());
        C38680bf6.m64191b(m64192a22222, interfaceC41273g0122222, c0757a22222.m113414b());
        C38680bf6.m64191b(m64192a22222, enumC47065pm2222222, c0757a22222.m113413c());
        C38680bf6.m64191b(m64192a22222, interfaceC33869Jq622222, c0757a22222.m113410f());
        mo89518u.mo89530q();
        m115273a22222.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-441512234);
        while (r0.hasNext()) {
        }
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        function15 = function14;
        function16 = c5329c;
        interfaceC41563gV22 = c20912a;
        interfaceC4360K93 = interfaceC4360K9422222;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: b */
    public static final GB5 m95099b(boolean z, Function2<? super G52, ? super G52, ? extends InterfaceC49435tm1<G52>> sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        return new HB5(z, sizeAnimationSpec);
    }

    /* renamed from: c */
    public static /* synthetic */ GB5 m95098c(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = C5337e.f23351g;
        }
        return m95099b(z, function2);
    }

    /* renamed from: d */
    public static final HA0 m95097d(AbstractC37500Ze1 abstractC37500Ze1, AbstractC41687gi1 exit) {
        Intrinsics.checkNotNullParameter(abstractC37500Ze1, "<this>");
        Intrinsics.checkNotNullParameter(exit, "exit");
        return new HA0(abstractC37500Ze1, exit, 0.0f, null, 12, null);
    }
}
