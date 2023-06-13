package p000;

import androidx.compose.p003ui.graphics.C11327b;
import androidx.compose.p003ui.graphics.C11333f;
import androidx.compose.p003ui.graphics.InterfaceC11328c;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.F96;
import p000.InterfaceC32720Et0;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\"\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0007\u001a9\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aT\u0010\u0018\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112#\b\u0002\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u0013H\u0007ø\u0001\u0001\u001aT\u0010\u001b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112#\b\u0002\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u0013H\u0007ø\u0001\u0001\u001aT\u0010 \u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u001c2\b\b\u0002\u0010\u0012\u001a\u00020\u00112#\b\u0002\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001d0\u0013H\u0007ø\u0001\u0001\u001aT\u0010\"\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u001c2\b\b\u0002\u0010\u0012\u001a\u00020\u00112#\b\u0002\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001d0\u0013H\u0007ø\u0001\u0001\u001a\f\u0010#\u001a\u00020\u000f*\u00020\u001cH\u0002\u001a1\u0010+\u001a\u00020**\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,\u001aB\u00103\u001a\u00020**\u00020*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020%0$2\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00102\u001a\u00020(H\u0002\u001aB\u00107\u001a\u00020**\u00020*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020%0$2\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040.2\u000e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040.2\u0006\u00102\u001a\u00020(H\u0002\"#\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u0010;\"\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00010=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\"\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C\"\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020E0A8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bF\u0010C\"\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000e0A8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bH\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006J"}, m28432d2 = {"Ltm1;", "", "animationSpec", "initialAlpha", "LZe1;", "s", "targetAlpha", "Lgi1;", "u", "initialScale", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "w", "(Ltm1;FJ)LZe1;", "LG52;", "LK9;", "expandFrom", "", "clip", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "fullSize", "initialSize", "o", "shrinkTowards", "targetSize", "z", "LK9$c;", "", "fullHeight", "initialHeight", "q", "targetHeight", "B", "E", "LF96;", "LXe1;", "enter", "exit", "", "label", "LgV2;", "g", "(LF96;LZe1;Lgi1;Ljava/lang/String;LEt0;I)LgV2;", "transition", "LsP5;", "LdE5;", "slideIn", "slideOut", "labelPrefix", "D", "LEh0;", "expand", "shrink", "y", "Lwb6;", "Ltf;", C17296a.f69688o, "Lwb6;", "TransformOriginVectorConverter", "LEX2;", "b", "LEX2;", "DefaultAlpha", "LjO5;", "c", "LjO5;", "DefaultAlphaAndScaleSpring", "LA52;", DateTokenConverter.CONVERTER_KEY, "DefaultOffsetAnimationSpec", "e", "DefaultSizeAnimationSpec", "animation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1180:1\n36#2:1181\n36#2:1188\n25#2:1195\n25#2:1208\n67#2,3:1231\n66#2:1234\n36#2:1241\n1057#3,6:1182\n1057#3,6:1189\n1057#3,6:1196\n1057#3,6:1209\n1057#3,6:1235\n1057#3,6:1242\n939#4:1202\n857#4,5:1203\n939#4:1215\n857#4,5:1216\n852#4,10:1221\n76#5:1248\n102#5,2:1249\n76#5:1251\n102#5,2:1252\n76#5:1254\n76#5:1255\n76#5:1256\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n846#1:1181\n847#1:1188\n871#1:1195\n894#1:1208\n923#1:1231,3\n923#1:1234\n930#1:1241\n846#1:1182,6\n847#1:1189,6\n871#1:1196,6\n894#1:1209,6\n923#1:1235,6\n930#1:1242,6\n861#1:1202\n861#1:1203,5\n884#1:1215\n884#1:1216,5\n910#1:1221,10\n846#1:1248\n846#1:1249,2\n847#1:1251\n847#1:1252,2\n860#1:1254\n884#1:1255\n910#1:1256\n*E\n"})
/* renamed from: Ye1 */
/* loaded from: classes.dex */
public final class C37266Ye1 {

    /* renamed from: a */
    public static final InterfaceC51108wb6<C11333f, C28797tf> f46172a = C37082Xj6.m76524a(C9867a.f46177g, C9868b.f46178g);

    /* renamed from: b */
    public static final EX2<Float> f46173b;

    /* renamed from: c */
    public static final C43282jO5<Float> f46174c;

    /* renamed from: d */
    public static final C43282jO5<A52> f46175d;

    /* renamed from: e */
    public static final C43282jO5<G52> f46176e;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/compose/ui/graphics/f;", "it", "Ltf;", C17296a.f69688o, "(J)Ltf;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ye1$a */
    /* loaded from: classes.dex */
    public static final class C9867a extends Lambda implements Function1<C11333f, C28797tf> {

        /* renamed from: g */
        public static final C9867a f46177g = new C9867a();

        public C9867a() {
            super(1);
        }

        /* renamed from: a */
        public final C28797tf m74624a(long j) {
            return new C28797tf(C11333f.m68631f(j), C11333f.m68630g(j));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C28797tf invoke(C11333f c11333f) {
            return m74624a(c11333f.m68627j());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Ltf;", "it", "Landroidx/compose/ui/graphics/f;", C17296a.f69688o, "(Ltf;)J"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ye1$b */
    /* loaded from: classes.dex */
    public static final class C9868b extends Lambda implements Function1<C28797tf, C11333f> {

        /* renamed from: g */
        public static final C9868b f46178g = new C9868b();

        public C9868b() {
            super(1);
        }

        /* renamed from: a */
        public final long m74623a(C28797tf it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C45519n96.m24273a(it.m11962f(), it.m11961g());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C11333f invoke(C28797tf c28797tf) {
            return C11333f.m68635b(m74623a(c28797tf));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ye1$c */
    /* loaded from: classes.dex */
    public /* synthetic */ class C9869c {
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateValue$1\n*L\n1#1,1155:1\n*E\n"})
    /* renamed from: Ye1$d */
    /* loaded from: classes.dex */
    public static final class C9870d extends Lambda implements Function3<F96.InterfaceC2189b<EnumC37032Xe1>, InterfaceC32720Et0, Integer, C43282jO5<C11333f>> {

        /* renamed from: g */
        public static final C9870d f46179g = new C9870d();

        public C9870d() {
            super(3);
        }

        /* renamed from: a */
        public final C43282jO5<C11333f> m74622a(F96.InterfaceC2189b<EnumC37032Xe1> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(interfaceC2189b, "$this$null");
            interfaceC32720Et0.mo89638F(-895531546);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-895531546, i, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:851)");
            }
            C43282jO5<C11333f> m25221i = C26160mf.m25221i(0.0f, 0.0f, null, 7, null);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m25221i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C43282jO5<C11333f> invoke(F96.InterfaceC2189b<EnumC37032Xe1> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m74622a(interfaceC2189b, interfaceC32720Et0, num.intValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ye1$e */
    /* loaded from: classes.dex */
    public static final class C9871e extends Lambda implements Function1<InterfaceC11328c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48627sP5<Float> f46180g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48627sP5<Float> f46181h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC48627sP5<C11333f> f46182i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9871e(InterfaceC48627sP5<Float> interfaceC48627sP5, InterfaceC48627sP5<Float> interfaceC48627sP52, InterfaceC48627sP5<C11333f> interfaceC48627sP53) {
            super(1);
            this.f46180g = interfaceC48627sP5;
            this.f46181h = interfaceC48627sP52;
            this.f46182i = interfaceC48627sP53;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11328c interfaceC11328c) {
            invoke2(interfaceC11328c);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(InterfaceC11328c graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.mo68690g(C37266Ye1.m74637n(this.f46180g));
            graphicsLayer.mo68708D(C37266Ye1.m74642i(this.f46181h));
            graphicsLayer.mo68706E(C37266Ye1.m74642i(this.f46181h));
            graphicsLayer.mo68700P(C37266Ye1.m74641j(this.f46182i));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ye1$f */
    /* loaded from: classes.dex */
    public static final class C9872f extends Lambda implements Function1<InterfaceC11328c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48627sP5<Float> f46183g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9872f(InterfaceC48627sP5<Float> interfaceC48627sP5) {
            super(1);
            this.f46183g = interfaceC48627sP5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11328c interfaceC11328c) {
            invoke2(interfaceC11328c);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(InterfaceC11328c graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.mo68690g(C37266Ye1.m74637n(this.f46183g));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ye1$g */
    /* loaded from: classes.dex */
    public static final class C9873g extends Lambda implements Function3<F96.InterfaceC2189b<EnumC37032Xe1>, InterfaceC32720Et0, Integer, InterfaceC49435tm1<Float>> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC37500Ze1 f46184g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC41687gi1 f46185h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9873g(AbstractC37500Ze1 abstractC37500Ze1, AbstractC41687gi1 abstractC41687gi1) {
            super(3);
            this.f46184g = abstractC37500Ze1;
            this.f46185h = abstractC41687gi1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<EnumC37032Xe1> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return invoke(interfaceC2189b, interfaceC32720Et0, num.intValue());
        }

        public final InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<EnumC37032Xe1> animateFloat, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            InterfaceC49435tm1<Float> interfaceC49435tm1;
            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
            interfaceC32720Et0.mo89638F(-57153604);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-57153604, i, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:861)");
            }
            EnumC37032Xe1 enumC37032Xe1 = EnumC37032Xe1.PreEnter;
            EnumC37032Xe1 enumC37032Xe12 = EnumC37032Xe1.Visible;
            if (animateFloat.m107505a(enumC37032Xe1, enumC37032Xe12)) {
                C50590vj1 m104250b = this.f46184g.mo70908b().m104250b();
                if (m104250b == null || (interfaceC49435tm1 = m104250b.m8237b()) == null) {
                    interfaceC49435tm1 = C37266Ye1.f46174c;
                }
            } else if (animateFloat.m107505a(enumC37032Xe12, EnumC37032Xe1.PostExit)) {
                C50590vj1 m104250b2 = this.f46185h.mo36086b().m104250b();
                if (m104250b2 == null || (interfaceC49435tm1 = m104250b2.m8237b()) == null) {
                    interfaceC49435tm1 = C37266Ye1.f46174c;
                }
            } else {
                interfaceC49435tm1 = C37266Ye1.f46174c;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return interfaceC49435tm1;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ye1$h */
    /* loaded from: classes.dex */
    public static final class C9874h extends Lambda implements Function3<F96.InterfaceC2189b<EnumC37032Xe1>, InterfaceC32720Et0, Integer, InterfaceC49435tm1<Float>> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC37500Ze1 f46186g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC41687gi1 f46187h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9874h(AbstractC37500Ze1 abstractC37500Ze1, AbstractC41687gi1 abstractC41687gi1) {
            super(3);
            this.f46186g = abstractC37500Ze1;
            this.f46187h = abstractC41687gi1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<EnumC37032Xe1> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return invoke(interfaceC2189b, interfaceC32720Et0, num.intValue());
        }

        public final InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<EnumC37032Xe1> animateFloat, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            InterfaceC49435tm1<Float> interfaceC49435tm1;
            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
            interfaceC32720Et0.mo89638F(-53984035);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-53984035, i, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:884)");
            }
            EnumC37032Xe1 enumC37032Xe1 = EnumC37032Xe1.PreEnter;
            EnumC37032Xe1 enumC37032Xe12 = EnumC37032Xe1.Visible;
            if (animateFloat.m107505a(enumC37032Xe1, enumC37032Xe12)) {
                C37306Yi5 m104249c = this.f46186g.mo70908b().m104249c();
                if (m104249c == null || (interfaceC49435tm1 = m104249c.m74364a()) == null) {
                    interfaceC49435tm1 = C37266Ye1.f46174c;
                }
            } else if (animateFloat.m107505a(enumC37032Xe12, EnumC37032Xe1.PostExit)) {
                C37306Yi5 m104249c2 = this.f46187h.mo36086b().m104249c();
                if (m104249c2 == null || (interfaceC49435tm1 = m104249c2.m74364a()) == null) {
                    interfaceC49435tm1 = C37266Ye1.f46174c;
                }
            } else {
                interfaceC49435tm1 = C37266Ye1.f46174c;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return interfaceC49435tm1;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LG52;", "it", C17296a.f69688o, "(J)J"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ye1$i */
    /* loaded from: classes.dex */
    public static final class C9875i extends Lambda implements Function1<G52, G52> {

        /* renamed from: g */
        public static final C9875i f46188g = new C9875i();

        public C9875i() {
            super(1);
        }

        /* renamed from: a */
        public final long m74621a(long j) {
            return H52.m104430a(0, 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ G52 invoke(G52 g52) {
            return G52.m105834b(m74621a(g52.m105826j()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ye1$j */
    /* loaded from: classes.dex */
    public static final class C9876j extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: g */
        public static final C9876j f46189g = new C9876j();

        public C9876j() {
            super(1);
        }

        public final Integer invoke(int i) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LG52;", "it", C17296a.f69688o, "(J)J"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ye1$k */
    /* loaded from: classes.dex */
    public static final class C9877k extends Lambda implements Function1<G52, G52> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Integer, Integer> f46190g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9877k(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f46190g = function1;
        }

        /* renamed from: a */
        public final long m74620a(long j) {
            return H52.m104430a(G52.m105829g(j), this.f46190g.invoke(Integer.valueOf(G52.m105830f(j))).intValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ G52 invoke(G52 g52) {
            return G52.m105834b(m74620a(g52.m105826j()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkExpand$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1180:1\n36#2:1181\n25#2:1188\n25#2:1195\n36#2:1202\n1057#3,6:1182\n1057#3,6:1189\n1057#3,6:1196\n1057#3,6:1203\n76#4:1209\n102#4,2:1210\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkExpand$1\n*L\n1038#1:1181\n1061#1:1188\n1066#1:1195\n1070#1:1202\n1038#1:1182,6\n1061#1:1189,6\n1066#1:1196,6\n1070#1:1203,6\n1038#1:1209\n1038#1:1210,2\n*E\n"})
    /* renamed from: Ye1$l */
    /* loaded from: classes.dex */
    public static final class C9878l extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ F96<EnumC37032Xe1> f46191g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48627sP5<C32612Eh0> f46192h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC48627sP5<C32612Eh0> f46193i;

        /* renamed from: j */
        public final /* synthetic */ String f46194j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9878l(F96<EnumC37032Xe1> f96, InterfaceC48627sP5<C32612Eh0> interfaceC48627sP5, InterfaceC48627sP5<C32612Eh0> interfaceC48627sP52, String str) {
            super(3);
            this.f46191g = f96;
            this.f46192h = interfaceC48627sP5;
            this.f46193i = interfaceC48627sP52;
            this.f46194j = str;
        }

        public static final boolean invoke$lambda$1(EX2<Boolean> ex2) {
            return ex2.getValue().booleanValue();
        }

        public static final void invoke$lambda$2(EX2<Boolean> ex2, boolean z) {
            ex2.setValue(Boolean.valueOf(z));
        }

        /* JADX WARN: Removed duplicated region for block: B:130:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x01ed  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC41563gV2 m74619a(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            InterfaceC4360K9 m108582a;
            InterfaceC48627sP5 m105193n;
            Object mo89635G;
            InterfaceC32720Et0.C2012a c2012a;
            boolean z;
            Object mo89635G2;
            boolean mo89539n;
            Object mo89635G3;
            C32612Eh0 value;
            boolean z2;
            boolean z3;
            InterfaceC41563gV2 composed = interfaceC41563gV2;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(-140634085);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-140634085, i, -1, "androidx.compose.animation.shrinkExpand.<anonymous> (EnterExitTransition.kt:1033)");
            }
            F96<EnumC37032Xe1> f96 = this.f46191g;
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n2 = interfaceC32720Et0.mo89539n(f96);
            Object mo89635G4 = interfaceC32720Et0.mo89635G();
            if (mo89539n2 || mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G4 = LM5.m97025e(Boolean.FALSE, null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G4);
            }
            interfaceC32720Et0.mo89605Q();
            EX2 ex2 = (EX2) mo89635G4;
            boolean z4 = true;
            if (this.f46191g.m107535g() == this.f46191g.m107529m() && !this.f46191g.m107525q()) {
                invoke$lambda$2(ex2, false);
            } else if (this.f46192h.getValue() != null || this.f46193i.getValue() != null) {
                invoke$lambda$2(ex2, true);
            }
            if (invoke$lambda$1(ex2)) {
                boolean m107505a = this.f46191g.m107531k().m107505a(EnumC37032Xe1.PreEnter, EnumC37032Xe1.Visible);
                InterfaceC48627sP5<C32612Eh0> interfaceC48627sP5 = this.f46192h;
                InterfaceC48627sP5<C32612Eh0> interfaceC48627sP52 = this.f46193i;
                if (m107505a) {
                    C32612Eh0 value2 = interfaceC48627sP5.getValue();
                    if (value2 == null || (m108582a = value2.m108582a()) == null) {
                        C32612Eh0 value3 = interfaceC48627sP52.getValue();
                        if (value3 != null) {
                            m108582a = value3.m108582a();
                        }
                        m108582a = null;
                    }
                    m105193n = GM5.m105193n(m108582a, interfaceC32720Et0, 0);
                    F96<EnumC37032Xe1> f962 = this.f46191g;
                    InterfaceC51108wb6<G52, C28797tf> m76520e = C37082Xj6.m76520e(G52.f10893b);
                    String str = this.f46194j;
                    interfaceC32720Et0.mo89638F(-492369756);
                    mo89635G = interfaceC32720Et0.mo89635G();
                    c2012a = InterfaceC32720Et0.f8257a;
                    if (mo89635G == c2012a.m108267a()) {
                        mo89635G = str + " shrink/expand";
                        interfaceC32720Et0.mo89503z(mo89635G);
                    }
                    interfaceC32720Et0.mo89605Q();
                    F96.C2187a m101074b = J96.m101074b(f962, m76520e, (String) mo89635G, interfaceC32720Et0, 448, 0);
                    if (this.f46191g.m107535g() != this.f46191g.m107529m()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    interfaceC32720Et0.mo89623K(-1553213624, Boolean.valueOf(z));
                    F96<EnumC37032Xe1> f963 = this.f46191g;
                    InterfaceC51108wb6<A52, C28797tf> m76521d = C37082Xj6.m76521d(A52.f130b);
                    String str2 = this.f46194j;
                    interfaceC32720Et0.mo89638F(-492369756);
                    mo89635G2 = interfaceC32720Et0.mo89635G();
                    if (mo89635G2 == c2012a.m108267a()) {
                        mo89635G2 = str2 + " InterruptionHandlingOffset";
                        interfaceC32720Et0.mo89503z(mo89635G2);
                    }
                    interfaceC32720Et0.mo89605Q();
                    F96.C2187a m101074b2 = J96.m101074b(f963, m76521d, (String) mo89635G2, interfaceC32720Et0, 448, 0);
                    interfaceC32720Et0.mo89608P();
                    F96<EnumC37032Xe1> f964 = this.f46191g;
                    InterfaceC48627sP5<C32612Eh0> interfaceC48627sP53 = this.f46192h;
                    InterfaceC48627sP5<C32612Eh0> interfaceC48627sP54 = this.f46193i;
                    interfaceC32720Et0.mo89638F(1157296644);
                    mo89539n = interfaceC32720Et0.mo89539n(f964);
                    mo89635G3 = interfaceC32720Et0.mo89635G();
                    if (!mo89539n || mo89635G3 == c2012a.m108267a()) {
                        mo89635G3 = new C43466ji1(m101074b, m101074b2, interfaceC48627sP53, interfaceC48627sP54, m105193n);
                        interfaceC32720Et0.mo89503z(mo89635G3);
                    }
                    interfaceC32720Et0.mo89605Q();
                    C43466ji1 c43466ji1 = (C43466ji1) mo89635G3;
                    if (this.f46191g.m107535g() != this.f46191g.m107529m()) {
                        c43466ji1.m30081h(null);
                    } else if (c43466ji1.m30084a() == null) {
                        InterfaceC4360K9 interfaceC4360K9 = (InterfaceC4360K9) m105193n.getValue();
                        if (interfaceC4360K9 == null) {
                            interfaceC4360K9 = InterfaceC4360K9.f19170a.m99132n();
                        }
                        c43466ji1.m30081h(interfaceC4360K9);
                    }
                    value = this.f46192h.getValue();
                    if (value == null && !value.m108580c()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        C32612Eh0 value4 = this.f46193i.getValue();
                        if (value4 != null && !value4.m108580c()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            z4 = false;
                        }
                    }
                    InterfaceC41563gV2 interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
                    if (!z4) {
                        interfaceC41563gV22 = C35447Qk0.m88105b(interfaceC41563gV22);
                    }
                    composed = composed.mo39266t0(interfaceC41563gV22).mo39266t0(c43466ji1);
                } else {
                    C32612Eh0 value5 = interfaceC48627sP52.getValue();
                    if (value5 == null || (m108582a = value5.m108582a()) == null) {
                        C32612Eh0 value6 = interfaceC48627sP5.getValue();
                        if (value6 != null) {
                            m108582a = value6.m108582a();
                        }
                        m108582a = null;
                    }
                    m105193n = GM5.m105193n(m108582a, interfaceC32720Et0, 0);
                    F96<EnumC37032Xe1> f9622 = this.f46191g;
                    InterfaceC51108wb6<G52, C28797tf> m76520e2 = C37082Xj6.m76520e(G52.f10893b);
                    String str3 = this.f46194j;
                    interfaceC32720Et0.mo89638F(-492369756);
                    mo89635G = interfaceC32720Et0.mo89635G();
                    c2012a = InterfaceC32720Et0.f8257a;
                    if (mo89635G == c2012a.m108267a()) {
                    }
                    interfaceC32720Et0.mo89605Q();
                    F96.C2187a m101074b3 = J96.m101074b(f9622, m76520e2, (String) mo89635G, interfaceC32720Et0, 448, 0);
                    if (this.f46191g.m107535g() != this.f46191g.m107529m()) {
                    }
                    interfaceC32720Et0.mo89623K(-1553213624, Boolean.valueOf(z));
                    F96<EnumC37032Xe1> f9632 = this.f46191g;
                    InterfaceC51108wb6<A52, C28797tf> m76521d2 = C37082Xj6.m76521d(A52.f130b);
                    String str22 = this.f46194j;
                    interfaceC32720Et0.mo89638F(-492369756);
                    mo89635G2 = interfaceC32720Et0.mo89635G();
                    if (mo89635G2 == c2012a.m108267a()) {
                    }
                    interfaceC32720Et0.mo89605Q();
                    F96.C2187a m101074b22 = J96.m101074b(f9632, m76521d2, (String) mo89635G2, interfaceC32720Et0, 448, 0);
                    interfaceC32720Et0.mo89608P();
                    F96<EnumC37032Xe1> f9642 = this.f46191g;
                    InterfaceC48627sP5<C32612Eh0> interfaceC48627sP532 = this.f46192h;
                    InterfaceC48627sP5<C32612Eh0> interfaceC48627sP542 = this.f46193i;
                    interfaceC32720Et0.mo89638F(1157296644);
                    mo89539n = interfaceC32720Et0.mo89539n(f9642);
                    mo89635G3 = interfaceC32720Et0.mo89635G();
                    if (!mo89539n) {
                    }
                    mo89635G3 = new C43466ji1(m101074b3, m101074b22, interfaceC48627sP532, interfaceC48627sP542, m105193n);
                    interfaceC32720Et0.mo89503z(mo89635G3);
                    interfaceC32720Et0.mo89605Q();
                    C43466ji1 c43466ji12 = (C43466ji1) mo89635G3;
                    if (this.f46191g.m107535g() != this.f46191g.m107529m()) {
                    }
                    value = this.f46192h.getValue();
                    if (value == null) {
                    }
                    z2 = false;
                    if (!z2) {
                    }
                    InterfaceC41563gV2 interfaceC41563gV222 = InterfaceC41563gV2.f82354b0;
                    if (!z4) {
                    }
                    composed = composed.mo39266t0(interfaceC41563gV222).mo39266t0(c43466ji12);
                }
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return composed;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m74619a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LG52;", "it", C17296a.f69688o, "(J)J"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ye1$m */
    /* loaded from: classes.dex */
    public static final class C9879m extends Lambda implements Function1<G52, G52> {

        /* renamed from: g */
        public static final C9879m f46195g = new C9879m();

        public C9879m() {
            super(1);
        }

        /* renamed from: a */
        public final long m74618a(long j) {
            return H52.m104430a(0, 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ G52 invoke(G52 g52) {
            return G52.m105834b(m74618a(g52.m105826j()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ye1$n */
    /* loaded from: classes.dex */
    public static final class C9880n extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: g */
        public static final C9880n f46196g = new C9880n();

        public C9880n() {
            super(1);
        }

        public final Integer invoke(int i) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LG52;", "it", C17296a.f69688o, "(J)J"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ye1$o */
    /* loaded from: classes.dex */
    public static final class C9881o extends Lambda implements Function1<G52, G52> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Integer, Integer> f46197g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9881o(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f46197g = function1;
        }

        /* renamed from: a */
        public final long m74617a(long j) {
            return H52.m104430a(G52.m105829g(j), this.f46197g.invoke(Integer.valueOf(G52.m105830f(j))).intValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ G52 invoke(G52 g52) {
            return G52.m105834b(m74617a(g52.m105826j()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideInOut$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1180:1\n36#2:1181\n25#2:1188\n36#2:1195\n1057#3,6:1182\n1057#3,6:1189\n1057#3,6:1196\n76#4:1202\n102#4,2:1203\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideInOut$1\n*L\n955#1:1181\n967#1:1188\n969#1:1195\n955#1:1182,6\n967#1:1189,6\n969#1:1196,6\n955#1:1202\n955#1:1203,2\n*E\n"})
    /* renamed from: Ye1$p */
    /* loaded from: classes.dex */
    public static final class C9882p extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ F96<EnumC37032Xe1> f46198g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48627sP5<C39635dE5> f46199h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC48627sP5<C39635dE5> f46200i;

        /* renamed from: j */
        public final /* synthetic */ String f46201j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9882p(F96<EnumC37032Xe1> f96, InterfaceC48627sP5<C39635dE5> interfaceC48627sP5, InterfaceC48627sP5<C39635dE5> interfaceC48627sP52, String str) {
            super(3);
            this.f46198g = f96;
            this.f46199h = interfaceC48627sP5;
            this.f46200i = interfaceC48627sP52;
            this.f46201j = str;
        }

        public static final boolean invoke$lambda$1(EX2<Boolean> ex2) {
            return ex2.getValue().booleanValue();
        }

        public static final void invoke$lambda$2(EX2<Boolean> ex2, boolean z) {
            ex2.setValue(Boolean.valueOf(z));
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m74616a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(158379472);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(158379472, i, -1, "androidx.compose.animation.slideInOut.<anonymous> (EnterExitTransition.kt:951)");
            }
            F96<EnumC37032Xe1> f96 = this.f46198g;
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(f96);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = LM5.m97025e(Boolean.FALSE, null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            EX2 ex2 = (EX2) mo89635G;
            if (this.f46198g.m107535g() == this.f46198g.m107529m() && !this.f46198g.m107525q()) {
                invoke$lambda$2(ex2, false);
            } else if (this.f46199h.getValue() != null || this.f46200i.getValue() != null) {
                invoke$lambda$2(ex2, true);
            }
            if (invoke$lambda$1(ex2)) {
                F96<EnumC37032Xe1> f962 = this.f46198g;
                InterfaceC51108wb6<A52, C28797tf> m76521d = C37082Xj6.m76521d(A52.f130b);
                String str = this.f46201j;
                interfaceC32720Et0.mo89638F(-492369756);
                Object mo89635G2 = interfaceC32720Et0.mo89635G();
                InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
                if (mo89635G2 == c2012a.m108267a()) {
                    mo89635G2 = str + " slide";
                    interfaceC32720Et0.mo89503z(mo89635G2);
                }
                interfaceC32720Et0.mo89605Q();
                F96.C2187a m101074b = J96.m101074b(f962, m76521d, (String) mo89635G2, interfaceC32720Et0, 448, 0);
                F96<EnumC37032Xe1> f963 = this.f46198g;
                InterfaceC48627sP5<C39635dE5> interfaceC48627sP5 = this.f46199h;
                InterfaceC48627sP5<C39635dE5> interfaceC48627sP52 = this.f46200i;
                interfaceC32720Et0.mo89638F(1157296644);
                boolean mo89539n2 = interfaceC32720Et0.mo89539n(f963);
                Object mo89635G3 = interfaceC32720Et0.mo89635G();
                if (mo89539n2 || mo89635G3 == c2012a.m108267a()) {
                    mo89635G3 = new C40820fE5(m101074b, interfaceC48627sP5, interfaceC48627sP52);
                    interfaceC32720Et0.mo89503z(mo89635G3);
                }
                interfaceC32720Et0.mo89605Q();
                composed = composed.mo39266t0((C40820fE5) mo89635G3);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return composed;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m74616a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    static {
        EX2<Float> m97025e;
        m97025e = LM5.m97025e(Float.valueOf(1.0f), null, 2, null);
        f46173b = m97025e;
        f46174c = C26160mf.m25221i(0.0f, 400.0f, null, 5, null);
        f46175d = C26160mf.m25221i(0.0f, 400.0f, A52.m116119b(C32501Du6.m109710c(A52.f130b)), 1, null);
        f46176e = C26160mf.m25221i(0.0f, 400.0f, G52.m105834b(C32501Du6.m109709d(G52.f10893b)), 1, null);
    }

    /* renamed from: A */
    public static /* synthetic */ AbstractC41687gi1 m74655A(InterfaceC49435tm1 interfaceC49435tm1, InterfaceC4360K9 interfaceC4360K9, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC49435tm1 = C26160mf.m25221i(0.0f, 400.0f, G52.m105834b(C32501Du6.m109709d(G52.f10893b)), 1, null);
        }
        if ((i & 2) != 0) {
            interfaceC4360K9 = InterfaceC4360K9.f19170a.m99143c();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = C9879m.f46195g;
        }
        return m74625z(interfaceC49435tm1, interfaceC4360K9, z, function1);
    }

    /* renamed from: B */
    public static final AbstractC41687gi1 m74654B(InterfaceC49435tm1<G52> animationSpec, InterfaceC4360K9.InterfaceC4363c shrinkTowards, boolean z, Function1<? super Integer, Integer> targetHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetHeight, "targetHeight");
        return m74625z(animationSpec, m74651E(shrinkTowards), z, new C9881o(targetHeight));
    }

    /* renamed from: C */
    public static /* synthetic */ AbstractC41687gi1 m74653C(InterfaceC49435tm1 interfaceC49435tm1, InterfaceC4360K9.InterfaceC4363c interfaceC4363c, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC49435tm1 = C26160mf.m25221i(0.0f, 400.0f, G52.m105834b(C32501Du6.m109709d(G52.f10893b)), 1, null);
        }
        if ((i & 2) != 0) {
            interfaceC4363c = InterfaceC4360K9.f19170a.m99145a();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = C9880n.f46196g;
        }
        return m74654B(interfaceC49435tm1, interfaceC4363c, z, function1);
    }

    /* renamed from: D */
    public static final InterfaceC41563gV2 m74652D(InterfaceC41563gV2 interfaceC41563gV2, F96<EnumC37032Xe1> f96, InterfaceC48627sP5<C39635dE5> interfaceC48627sP5, InterfaceC48627sP5<C39635dE5> interfaceC48627sP52, String str) {
        return C32486Dt0.m109807b(interfaceC41563gV2, null, new C9882p(f96, interfaceC48627sP5, interfaceC48627sP52, str), 1, null);
    }

    /* renamed from: E */
    public static final InterfaceC4360K9 m74651E(InterfaceC4360K9.InterfaceC4363c interfaceC4363c) {
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        if (Intrinsics.areEqual(interfaceC4363c, c4361a.m99135k())) {
            return c4361a.m99134l();
        }
        if (Intrinsics.areEqual(interfaceC4363c, c4361a.m99145a())) {
            return c4361a.m99144b();
        }
        return c4361a.m99141e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:283:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0580  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [Et0, java.lang.Object] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC41563gV2 m74644g(F96<EnumC37032Xe1> f96, AbstractC37500Ze1 enter, AbstractC41687gi1 exit, String label, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        EX2 ex2;
        EX2 ex22;
        C11333f c11333f;
        InterfaceC48627sP5 interfaceC48627sP5;
        float f;
        int i3;
        C11333f m68635b;
        int i4;
        C11333f c11333f2;
        long m68626a;
        C11333f c11333f3;
        int i5;
        C11333f c11333f4;
        long m68626a2;
        boolean mo89539n;
        Object mo89635G;
        EX2 ex23;
        float f2;
        EX2 ex24;
        int i6;
        float f3;
        Intrinsics.checkNotNullParameter(f96, "<this>");
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(label, "label");
        interfaceC32720Et0.mo89638F(914000546);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(914000546, i, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:820)");
        }
        InterfaceC41563gV2 m74626y = m74626y(m74652D(InterfaceC41563gV2.f82354b0, f96, GM5.m105193n(enter.mo70908b().m104248d(), interfaceC32720Et0, 0), GM5.m105193n(exit.mo36086b().m104248d(), interfaceC32720Et0, 0), label), f96, GM5.m105193n(enter.mo70908b().m104251a(), interfaceC32720Et0, 0), GM5.m105193n(exit.mo36086b().m104251a(), interfaceC32720Et0, 0), label);
        int i7 = i & 14;
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n2 = interfaceC32720Et0.mo89539n(f96);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = LM5.m97025e(Boolean.FALSE, null, 2, null);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        EX2 ex25 = mo89635G2;
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n3 = interfaceC32720Et0.mo89539n(f96);
        Object mo89635G3 = interfaceC32720Et0.mo89635G();
        if (mo89539n3 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G3 = LM5.m97025e(Boolean.FALSE, null, 2, null);
            interfaceC32720Et0.mo89503z(mo89635G3);
        }
        interfaceC32720Et0.mo89605Q();
        EX2 ex26 = mo89635G3;
        if (f96.m107535g() == f96.m107529m() && !f96.m107525q()) {
            m74640k(ex25, false);
            m74638m(ex26, false);
        } else {
            if (enter.mo70908b().m104250b() != null || exit.mo36086b().m104250b() != null) {
                m74640k(ex25, true);
            }
            if (enter.mo70908b().m104249c() != null || exit.mo36086b().m104249c() != null) {
                m74638m(ex26, true);
            }
        }
        interfaceC32720Et0.mo89638F(1657241561);
        float f4 = 1.0f;
        if (m74643h(ex25)) {
            C9873g c9873g = new C9873g(enter, exit);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G4 = interfaceC32720Et0.mo89635G();
            if (mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G4 = label + " alpha";
                interfaceC32720Et0.mo89503z(mo89635G4);
            }
            interfaceC32720Et0.mo89605Q();
            String str = (String) mo89635G4;
            int i8 = i7 | 384;
            interfaceC32720Et0.mo89638F(-1338768149);
            InterfaceC51108wb6<Float, C28366sf> m76516i = C37082Xj6.m76516i(FloatCompanionObject.INSTANCE);
            int i9 = i8 & 14;
            int i10 = i8 << 3;
            int i11 = (i10 & 57344) | i9 | (i10 & 896) | (i10 & 7168);
            interfaceC32720Et0.mo89638F(-142660079);
            int i12 = (i11 >> 9) & 112;
            EnumC37032Xe1 m107535g = f96.m107535g();
            interfaceC32720Et0.mo89638F(755689166);
            if (C35528Qt0.m87827O()) {
                ex23 = ex26;
                C35528Qt0.m87816Z(755689166, i12, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:871)");
            } else {
                ex23 = ex26;
            }
            int[] iArr = C9869c.$EnumSwitchMapping$0;
            int i13 = iArr[m107535g.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    C50590vj1 m104250b = enter.mo70908b().m104250b();
                    if (m104250b != null) {
                        f2 = m104250b.m8238a();
                        if (C35528Qt0.m87827O()) {
                        }
                        interfaceC32720Et0.mo89605Q();
                        Float valueOf = Float.valueOf(f2);
                        EnumC37032Xe1 m107529m = f96.m107529m();
                        interfaceC32720Et0.mo89638F(755689166);
                        if (C35528Qt0.m87827O()) {
                        }
                        i6 = iArr[m107529m.ordinal()];
                        if (i6 != 1) {
                        }
                        f3 = 1.0f;
                        if (C35528Qt0.m87827O()) {
                        }
                        interfaceC32720Et0.mo89605Q();
                        i2 = -492369756;
                        ex2 = ex23;
                        ex22 = ex24;
                        c11333f = null;
                        interfaceC48627sP5 = J96.m101073c(f96, valueOf, Float.valueOf(f3), c9873g.invoke((C9873g) f96.m107531k(), (F96.InterfaceC2189b<EnumC37032Xe1>) interfaceC32720Et0, (??) Integer.valueOf((i11 >> 3) & 112)), m76516i, str, interfaceC32720Et0, (i11 & 14) | ((i11 << 9) & 57344) | ((i11 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                        interfaceC32720Et0.mo89605Q();
                        interfaceC32720Et0.mo89605Q();
                    }
                } else if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    C50590vj1 m104250b2 = exit.mo36086b().m104250b();
                    if (m104250b2 != null) {
                        f2 = m104250b2.m8238a();
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        interfaceC32720Et0.mo89605Q();
                        Float valueOf2 = Float.valueOf(f2);
                        EnumC37032Xe1 m107529m2 = f96.m107529m();
                        interfaceC32720Et0.mo89638F(755689166);
                        if (C35528Qt0.m87827O()) {
                            ex24 = ex25;
                            C35528Qt0.m87816Z(755689166, i12, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:871)");
                        } else {
                            ex24 = ex25;
                        }
                        i6 = iArr[m107529m2.ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                C50590vj1 m104250b3 = enter.mo70908b().m104250b();
                                if (m104250b3 != null) {
                                    f3 = m104250b3.m8238a();
                                    if (C35528Qt0.m87827O()) {
                                    }
                                    interfaceC32720Et0.mo89605Q();
                                    i2 = -492369756;
                                    ex2 = ex23;
                                    ex22 = ex24;
                                    c11333f = null;
                                    interfaceC48627sP5 = J96.m101073c(f96, valueOf2, Float.valueOf(f3), c9873g.invoke((C9873g) f96.m107531k(), (F96.InterfaceC2189b<EnumC37032Xe1>) interfaceC32720Et0, (??) Integer.valueOf((i11 >> 3) & 112)), m76516i, str, interfaceC32720Et0, (i11 & 14) | ((i11 << 9) & 57344) | ((i11 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                                    interfaceC32720Et0.mo89605Q();
                                    interfaceC32720Et0.mo89605Q();
                                }
                            } else if (i6 != 3) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                C50590vj1 m104250b4 = exit.mo36086b().m104250b();
                                if (m104250b4 != null) {
                                    f3 = m104250b4.m8238a();
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87817Y();
                                    }
                                    interfaceC32720Et0.mo89605Q();
                                    i2 = -492369756;
                                    ex2 = ex23;
                                    ex22 = ex24;
                                    c11333f = null;
                                    interfaceC48627sP5 = J96.m101073c(f96, valueOf2, Float.valueOf(f3), c9873g.invoke((C9873g) f96.m107531k(), (F96.InterfaceC2189b<EnumC37032Xe1>) interfaceC32720Et0, (??) Integer.valueOf((i11 >> 3) & 112)), m76516i, str, interfaceC32720Et0, (i11 & 14) | ((i11 << 9) & 57344) | ((i11 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                                    interfaceC32720Et0.mo89605Q();
                                    interfaceC32720Et0.mo89605Q();
                                }
                            }
                        }
                        f3 = 1.0f;
                        if (C35528Qt0.m87827O()) {
                        }
                        interfaceC32720Et0.mo89605Q();
                        i2 = -492369756;
                        ex2 = ex23;
                        ex22 = ex24;
                        c11333f = null;
                        interfaceC48627sP5 = J96.m101073c(f96, valueOf2, Float.valueOf(f3), c9873g.invoke((C9873g) f96.m107531k(), (F96.InterfaceC2189b<EnumC37032Xe1>) interfaceC32720Et0, (??) Integer.valueOf((i11 >> 3) & 112)), m76516i, str, interfaceC32720Et0, (i11 & 14) | ((i11 << 9) & 57344) | ((i11 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                        interfaceC32720Et0.mo89605Q();
                        interfaceC32720Et0.mo89605Q();
                    }
                }
            }
            f2 = 1.0f;
            if (C35528Qt0.m87827O()) {
            }
            interfaceC32720Et0.mo89605Q();
            Float valueOf22 = Float.valueOf(f2);
            EnumC37032Xe1 m107529m22 = f96.m107529m();
            interfaceC32720Et0.mo89638F(755689166);
            if (C35528Qt0.m87827O()) {
            }
            i6 = iArr[m107529m22.ordinal()];
            if (i6 != 1) {
            }
            f3 = 1.0f;
            if (C35528Qt0.m87827O()) {
            }
            interfaceC32720Et0.mo89605Q();
            i2 = -492369756;
            ex2 = ex23;
            ex22 = ex24;
            c11333f = null;
            interfaceC48627sP5 = J96.m101073c(f96, valueOf22, Float.valueOf(f3), c9873g.invoke((C9873g) f96.m107531k(), (F96.InterfaceC2189b<EnumC37032Xe1>) interfaceC32720Et0, (??) Integer.valueOf((i11 >> 3) & 112)), m76516i, str, interfaceC32720Et0, (i11 & 14) | ((i11 << 9) & 57344) | ((i11 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
        } else {
            i2 = -492369756;
            ex2 = ex26;
            ex22 = ex25;
            c11333f = null;
            interfaceC48627sP5 = f46173b;
        }
        InterfaceC48627sP5 interfaceC48627sP52 = interfaceC48627sP5;
        interfaceC32720Et0.mo89605Q();
        if (m74639l(ex2)) {
            interfaceC32720Et0.mo89638F(1657242461);
            C9874h c9874h = new C9874h(enter, exit);
            interfaceC32720Et0.mo89638F(i2);
            Object mo89635G5 = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G5 == c2012a.m108267a()) {
                mo89635G5 = label + " scale";
                interfaceC32720Et0.mo89503z(mo89635G5);
            }
            interfaceC32720Et0.mo89605Q();
            String str2 = (String) mo89635G5;
            int i14 = i7 | 384;
            interfaceC32720Et0.mo89638F(-1338768149);
            InterfaceC51108wb6<Float, C28366sf> m76516i2 = C37082Xj6.m76516i(FloatCompanionObject.INSTANCE);
            int i15 = i14 & 14;
            int i16 = i14 << 3;
            int i17 = (i16 & 57344) | i15 | (i16 & 896) | (i16 & 7168);
            interfaceC32720Et0.mo89638F(-142660079);
            int i18 = (i17 >> 9) & 112;
            EnumC37032Xe1 m107535g2 = f96.m107535g();
            interfaceC32720Et0.mo89638F(-596129937);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-596129937, i18, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:894)");
            }
            int[] iArr2 = C9869c.$EnumSwitchMapping$0;
            int i19 = iArr2[m107535g2.ordinal()];
            if (i19 != 1) {
                if (i19 == 2) {
                    C37306Yi5 m104249c = enter.mo70908b().m104249c();
                    if (m104249c != null) {
                        f = m104249c.m74363b();
                        if (C35528Qt0.m87827O()) {
                        }
                        interfaceC32720Et0.mo89605Q();
                        Float valueOf3 = Float.valueOf(f);
                        EnumC37032Xe1 m107529m3 = f96.m107529m();
                        interfaceC32720Et0.mo89638F(-596129937);
                        if (C35528Qt0.m87827O()) {
                        }
                        i3 = iArr2[m107529m3.ordinal()];
                        if (i3 != 1) {
                        }
                        if (C35528Qt0.m87827O()) {
                        }
                        interfaceC32720Et0.mo89605Q();
                        InterfaceC48627sP5 m101073c = J96.m101073c(f96, valueOf3, Float.valueOf(f4), c9874h.invoke((C9874h) f96.m107531k(), (F96.InterfaceC2189b<EnumC37032Xe1>) interfaceC32720Et0, (??) Integer.valueOf((i17 >> 3) & 112)), m76516i2, str2, interfaceC32720Et0, (i17 & 14) | ((i17 << 9) & 57344) | ((i17 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                        interfaceC32720Et0.mo89605Q();
                        interfaceC32720Et0.mo89605Q();
                        if (f96.m107535g() == EnumC37032Xe1.PreEnter) {
                        }
                    }
                } else if (i19 != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    C37306Yi5 m104249c2 = exit.mo36086b().m104249c();
                    if (m104249c2 != null) {
                        f = m104249c2.m74363b();
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        interfaceC32720Et0.mo89605Q();
                        Float valueOf32 = Float.valueOf(f);
                        EnumC37032Xe1 m107529m32 = f96.m107529m();
                        interfaceC32720Et0.mo89638F(-596129937);
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(-596129937, i18, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:894)");
                        }
                        i3 = iArr2[m107529m32.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                C37306Yi5 m104249c3 = enter.mo70908b().m104249c();
                                if (m104249c3 != null) {
                                    f4 = m104249c3.m74363b();
                                }
                            } else if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                C37306Yi5 m104249c4 = exit.mo36086b().m104249c();
                                if (m104249c4 != null) {
                                    f4 = m104249c4.m74363b();
                                }
                            }
                        }
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        interfaceC32720Et0.mo89605Q();
                        InterfaceC48627sP5 m101073c2 = J96.m101073c(f96, valueOf32, Float.valueOf(f4), c9874h.invoke((C9874h) f96.m107531k(), (F96.InterfaceC2189b<EnumC37032Xe1>) interfaceC32720Et0, (??) Integer.valueOf((i17 >> 3) & 112)), m76516i2, str2, interfaceC32720Et0, (i17 & 14) | ((i17 << 9) & 57344) | ((i17 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                        interfaceC32720Et0.mo89605Q();
                        interfaceC32720Et0.mo89605Q();
                        if (f96.m107535g() == EnumC37032Xe1.PreEnter) {
                            C37306Yi5 m104249c5 = enter.mo70908b().m104249c();
                            if (m104249c5 != null || (m104249c5 = exit.mo36086b().m104249c()) != null) {
                                m68635b = C11333f.m68635b(m104249c5.m74362c());
                                InterfaceC51108wb6<C11333f, C28797tf> interfaceC51108wb6 = f46172a;
                                int i20 = i7 | 3136;
                                interfaceC32720Et0.mo89638F(-142660079);
                                C9870d c9870d = C9870d.f46179g;
                                int i21 = (i20 >> 9) & 112;
                                EnumC37032Xe1 m107535g3 = f96.m107535g();
                                interfaceC32720Et0.mo89638F(-288165413);
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87816Z(-288165413, i21, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:912)");
                                }
                                i4 = iArr2[m107535g3.ordinal()];
                                if (i4 != 1) {
                                    c11333f2 = m68635b;
                                } else if (i4 == 2) {
                                    C37306Yi5 m104249c6 = enter.mo70908b().m104249c();
                                    if (m104249c6 != null || (m104249c6 = exit.mo36086b().m104249c()) != null) {
                                        c11333f2 = C11333f.m68635b(m104249c6.m74362c());
                                    }
                                    c11333f2 = c11333f;
                                } else if (i4 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    C37306Yi5 m104249c7 = exit.mo36086b().m104249c();
                                    if (m104249c7 != null || (m104249c7 = enter.mo70908b().m104249c()) != null) {
                                        c11333f2 = C11333f.m68635b(m104249c7.m74362c());
                                    }
                                    c11333f2 = c11333f;
                                }
                                if (c11333f2 == null) {
                                    m68626a = c11333f2.m68627j();
                                } else {
                                    m68626a = C11333f.f53066b.m68626a();
                                }
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                                interfaceC32720Et0.mo89605Q();
                                C11333f m68635b2 = C11333f.m68635b(m68626a);
                                EnumC37032Xe1 m107529m4 = f96.m107529m();
                                interfaceC32720Et0.mo89638F(-288165413);
                                if (C35528Qt0.m87827O()) {
                                    c11333f3 = m68635b;
                                } else {
                                    c11333f3 = m68635b;
                                    C35528Qt0.m87816Z(-288165413, i21, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:912)");
                                }
                                i5 = iArr2[m107529m4.ordinal()];
                                if (i5 != 1) {
                                    c11333f4 = c11333f3;
                                } else if (i5 == 2) {
                                    C37306Yi5 m104249c8 = enter.mo70908b().m104249c();
                                    if (m104249c8 != null || (m104249c8 = exit.mo36086b().m104249c()) != null) {
                                        c11333f4 = C11333f.m68635b(m104249c8.m74362c());
                                    }
                                    c11333f4 = c11333f;
                                } else if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    C37306Yi5 m104249c9 = exit.mo36086b().m104249c();
                                    if (m104249c9 != null || (m104249c9 = enter.mo70908b().m104249c()) != null) {
                                        c11333f4 = C11333f.m68635b(m104249c9.m74362c());
                                    }
                                    c11333f4 = c11333f;
                                }
                                if (c11333f4 == null) {
                                    m68626a2 = c11333f4.m68627j();
                                } else {
                                    m68626a2 = C11333f.f53066b.m68626a();
                                }
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                                interfaceC32720Et0.mo89605Q();
                                InterfaceC48627sP5 m101073c3 = J96.m101073c(f96, m68635b2, C11333f.m68635b(m68626a2), c9870d.invoke(f96.m107531k(), interfaceC32720Et0, Integer.valueOf((i20 >> 3) & 112)), interfaceC51108wb6, "TransformOriginInterruptionHandling", interfaceC32720Et0, (i20 & 14) | ((i20 << 9) & 57344) | ((i20 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                                interfaceC32720Et0.mo89605Q();
                                interfaceC32720Et0.mo89638F(1618982084);
                                mo89539n = interfaceC32720Et0.mo89539n(interfaceC48627sP52) | interfaceC32720Et0.mo89539n(m101073c2) | interfaceC32720Et0.mo89539n(m101073c3);
                                mo89635G = interfaceC32720Et0.mo89635G();
                                if (!mo89539n || mo89635G == c2012a.m108267a()) {
                                    mo89635G = new C9871e(interfaceC48627sP52, m101073c2, m101073c3);
                                    interfaceC32720Et0.mo89503z(mo89635G);
                                }
                                interfaceC32720Et0.mo89605Q();
                                m74626y = C11327b.m68714a(m74626y, (Function1) mo89635G);
                                interfaceC32720Et0.mo89605Q();
                            }
                            m68635b = c11333f;
                            InterfaceC51108wb6<C11333f, C28797tf> interfaceC51108wb62 = f46172a;
                            int i202 = i7 | 3136;
                            interfaceC32720Et0.mo89638F(-142660079);
                            C9870d c9870d2 = C9870d.f46179g;
                            int i212 = (i202 >> 9) & 112;
                            EnumC37032Xe1 m107535g32 = f96.m107535g();
                            interfaceC32720Et0.mo89638F(-288165413);
                            if (C35528Qt0.m87827O()) {
                            }
                            i4 = iArr2[m107535g32.ordinal()];
                            if (i4 != 1) {
                            }
                            if (c11333f2 == null) {
                            }
                            if (C35528Qt0.m87827O()) {
                            }
                            interfaceC32720Et0.mo89605Q();
                            C11333f m68635b22 = C11333f.m68635b(m68626a);
                            EnumC37032Xe1 m107529m42 = f96.m107529m();
                            interfaceC32720Et0.mo89638F(-288165413);
                            if (C35528Qt0.m87827O()) {
                            }
                            i5 = iArr2[m107529m42.ordinal()];
                            if (i5 != 1) {
                            }
                            if (c11333f4 == null) {
                            }
                            if (C35528Qt0.m87827O()) {
                            }
                            interfaceC32720Et0.mo89605Q();
                            InterfaceC48627sP5 m101073c32 = J96.m101073c(f96, m68635b22, C11333f.m68635b(m68626a2), c9870d2.invoke(f96.m107531k(), interfaceC32720Et0, Integer.valueOf((i202 >> 3) & 112)), interfaceC51108wb62, "TransformOriginInterruptionHandling", interfaceC32720Et0, (i202 & 14) | ((i202 << 9) & 57344) | ((i202 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                            interfaceC32720Et0.mo89605Q();
                            interfaceC32720Et0.mo89638F(1618982084);
                            mo89539n = interfaceC32720Et0.mo89539n(interfaceC48627sP52) | interfaceC32720Et0.mo89539n(m101073c2) | interfaceC32720Et0.mo89539n(m101073c32);
                            mo89635G = interfaceC32720Et0.mo89635G();
                            if (!mo89539n) {
                            }
                            mo89635G = new C9871e(interfaceC48627sP52, m101073c2, m101073c32);
                            interfaceC32720Et0.mo89503z(mo89635G);
                            interfaceC32720Et0.mo89605Q();
                            m74626y = C11327b.m68714a(m74626y, (Function1) mo89635G);
                            interfaceC32720Et0.mo89605Q();
                        } else {
                            C37306Yi5 m104249c10 = exit.mo36086b().m104249c();
                            if (m104249c10 != null || (m104249c10 = enter.mo70908b().m104249c()) != null) {
                                m68635b = C11333f.m68635b(m104249c10.m74362c());
                                InterfaceC51108wb6<C11333f, C28797tf> interfaceC51108wb622 = f46172a;
                                int i2022 = i7 | 3136;
                                interfaceC32720Et0.mo89638F(-142660079);
                                C9870d c9870d22 = C9870d.f46179g;
                                int i2122 = (i2022 >> 9) & 112;
                                EnumC37032Xe1 m107535g322 = f96.m107535g();
                                interfaceC32720Et0.mo89638F(-288165413);
                                if (C35528Qt0.m87827O()) {
                                }
                                i4 = iArr2[m107535g322.ordinal()];
                                if (i4 != 1) {
                                }
                                if (c11333f2 == null) {
                                }
                                if (C35528Qt0.m87827O()) {
                                }
                                interfaceC32720Et0.mo89605Q();
                                C11333f m68635b222 = C11333f.m68635b(m68626a);
                                EnumC37032Xe1 m107529m422 = f96.m107529m();
                                interfaceC32720Et0.mo89638F(-288165413);
                                if (C35528Qt0.m87827O()) {
                                }
                                i5 = iArr2[m107529m422.ordinal()];
                                if (i5 != 1) {
                                }
                                if (c11333f4 == null) {
                                }
                                if (C35528Qt0.m87827O()) {
                                }
                                interfaceC32720Et0.mo89605Q();
                                InterfaceC48627sP5 m101073c322 = J96.m101073c(f96, m68635b222, C11333f.m68635b(m68626a2), c9870d22.invoke(f96.m107531k(), interfaceC32720Et0, Integer.valueOf((i2022 >> 3) & 112)), interfaceC51108wb622, "TransformOriginInterruptionHandling", interfaceC32720Et0, (i2022 & 14) | ((i2022 << 9) & 57344) | ((i2022 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                                interfaceC32720Et0.mo89605Q();
                                interfaceC32720Et0.mo89638F(1618982084);
                                mo89539n = interfaceC32720Et0.mo89539n(interfaceC48627sP52) | interfaceC32720Et0.mo89539n(m101073c2) | interfaceC32720Et0.mo89539n(m101073c322);
                                mo89635G = interfaceC32720Et0.mo89635G();
                                if (!mo89539n) {
                                }
                                mo89635G = new C9871e(interfaceC48627sP52, m101073c2, m101073c322);
                                interfaceC32720Et0.mo89503z(mo89635G);
                                interfaceC32720Et0.mo89605Q();
                                m74626y = C11327b.m68714a(m74626y, (Function1) mo89635G);
                                interfaceC32720Et0.mo89605Q();
                            }
                            m68635b = c11333f;
                            InterfaceC51108wb6<C11333f, C28797tf> interfaceC51108wb6222 = f46172a;
                            int i20222 = i7 | 3136;
                            interfaceC32720Et0.mo89638F(-142660079);
                            C9870d c9870d222 = C9870d.f46179g;
                            int i21222 = (i20222 >> 9) & 112;
                            EnumC37032Xe1 m107535g3222 = f96.m107535g();
                            interfaceC32720Et0.mo89638F(-288165413);
                            if (C35528Qt0.m87827O()) {
                            }
                            i4 = iArr2[m107535g3222.ordinal()];
                            if (i4 != 1) {
                            }
                            if (c11333f2 == null) {
                            }
                            if (C35528Qt0.m87827O()) {
                            }
                            interfaceC32720Et0.mo89605Q();
                            C11333f m68635b2222 = C11333f.m68635b(m68626a);
                            EnumC37032Xe1 m107529m4222 = f96.m107529m();
                            interfaceC32720Et0.mo89638F(-288165413);
                            if (C35528Qt0.m87827O()) {
                            }
                            i5 = iArr2[m107529m4222.ordinal()];
                            if (i5 != 1) {
                            }
                            if (c11333f4 == null) {
                            }
                            if (C35528Qt0.m87827O()) {
                            }
                            interfaceC32720Et0.mo89605Q();
                            InterfaceC48627sP5 m101073c3222 = J96.m101073c(f96, m68635b2222, C11333f.m68635b(m68626a2), c9870d222.invoke(f96.m107531k(), interfaceC32720Et0, Integer.valueOf((i20222 >> 3) & 112)), interfaceC51108wb6222, "TransformOriginInterruptionHandling", interfaceC32720Et0, (i20222 & 14) | ((i20222 << 9) & 57344) | ((i20222 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
                            interfaceC32720Et0.mo89605Q();
                            interfaceC32720Et0.mo89638F(1618982084);
                            mo89539n = interfaceC32720Et0.mo89539n(interfaceC48627sP52) | interfaceC32720Et0.mo89539n(m101073c2) | interfaceC32720Et0.mo89539n(m101073c3222);
                            mo89635G = interfaceC32720Et0.mo89635G();
                            if (!mo89539n) {
                            }
                            mo89635G = new C9871e(interfaceC48627sP52, m101073c2, m101073c3222);
                            interfaceC32720Et0.mo89503z(mo89635G);
                            interfaceC32720Et0.mo89605Q();
                            m74626y = C11327b.m68714a(m74626y, (Function1) mo89635G);
                            interfaceC32720Et0.mo89605Q();
                        }
                    }
                }
            }
            f = 1.0f;
            if (C35528Qt0.m87827O()) {
            }
            interfaceC32720Et0.mo89605Q();
            Float valueOf322 = Float.valueOf(f);
            EnumC37032Xe1 m107529m322 = f96.m107529m();
            interfaceC32720Et0.mo89638F(-596129937);
            if (C35528Qt0.m87827O()) {
            }
            i3 = iArr2[m107529m322.ordinal()];
            if (i3 != 1) {
            }
            if (C35528Qt0.m87827O()) {
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC48627sP5 m101073c22 = J96.m101073c(f96, valueOf322, Float.valueOf(f4), c9874h.invoke((C9874h) f96.m107531k(), (F96.InterfaceC2189b<EnumC37032Xe1>) interfaceC32720Et0, (??) Integer.valueOf((i17 >> 3) & 112)), m76516i2, str2, interfaceC32720Et0, (i17 & 14) | ((i17 << 9) & 57344) | ((i17 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            if (f96.m107535g() == EnumC37032Xe1.PreEnter) {
            }
        } else if (m74643h(ex22)) {
            interfaceC32720Et0.mo89638F(1657244550);
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n4 = interfaceC32720Et0.mo89539n(interfaceC48627sP52);
            Object mo89635G6 = interfaceC32720Et0.mo89635G();
            if (mo89539n4 || mo89635G6 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G6 = new C9872f(interfaceC48627sP52);
                interfaceC32720Et0.mo89503z(mo89635G6);
            }
            interfaceC32720Et0.mo89605Q();
            m74626y = C11327b.m68714a(m74626y, (Function1) mo89635G6);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(1657244642);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m74626y;
    }

    /* renamed from: h */
    public static final boolean m74643h(EX2<Boolean> ex2) {
        return ex2.getValue().booleanValue();
    }

    /* renamed from: i */
    public static final float m74642i(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    /* renamed from: j */
    public static final long m74641j(InterfaceC48627sP5<C11333f> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().m68627j();
    }

    /* renamed from: k */
    public static final void m74640k(EX2<Boolean> ex2, boolean z) {
        ex2.setValue(Boolean.valueOf(z));
    }

    /* renamed from: l */
    public static final boolean m74639l(EX2<Boolean> ex2) {
        return ex2.getValue().booleanValue();
    }

    /* renamed from: m */
    public static final void m74638m(EX2<Boolean> ex2, boolean z) {
        ex2.setValue(Boolean.valueOf(z));
    }

    /* renamed from: n */
    public static final float m74637n(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    /* renamed from: o */
    public static final AbstractC37500Ze1 m74636o(InterfaceC49435tm1<G52> animationSpec, InterfaceC4360K9 expandFrom, boolean z, Function1<? super G52, G52> initialSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialSize, "initialSize");
        return new C38082af1(new H96(null, null, new C32612Eh0(expandFrom, initialSize, animationSpec, z), null, 11, null));
    }

    /* renamed from: p */
    public static /* synthetic */ AbstractC37500Ze1 m74635p(InterfaceC49435tm1 interfaceC49435tm1, InterfaceC4360K9 interfaceC4360K9, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC49435tm1 = C26160mf.m25221i(0.0f, 400.0f, G52.m105834b(C32501Du6.m109709d(G52.f10893b)), 1, null);
        }
        if ((i & 2) != 0) {
            interfaceC4360K9 = InterfaceC4360K9.f19170a.m99143c();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = C9875i.f46188g;
        }
        return m74636o(interfaceC49435tm1, interfaceC4360K9, z, function1);
    }

    /* renamed from: q */
    public static final AbstractC37500Ze1 m74634q(InterfaceC49435tm1<G52> animationSpec, InterfaceC4360K9.InterfaceC4363c expandFrom, boolean z, Function1<? super Integer, Integer> initialHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialHeight, "initialHeight");
        return m74636o(animationSpec, m74651E(expandFrom), z, new C9877k(initialHeight));
    }

    /* renamed from: r */
    public static /* synthetic */ AbstractC37500Ze1 m74633r(InterfaceC49435tm1 interfaceC49435tm1, InterfaceC4360K9.InterfaceC4363c interfaceC4363c, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC49435tm1 = C26160mf.m25221i(0.0f, 400.0f, G52.m105834b(C32501Du6.m109709d(G52.f10893b)), 1, null);
        }
        if ((i & 2) != 0) {
            interfaceC4363c = InterfaceC4360K9.f19170a.m99145a();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = C9876j.f46189g;
        }
        return m74634q(interfaceC49435tm1, interfaceC4363c, z, function1);
    }

    /* renamed from: s */
    public static final AbstractC37500Ze1 m74632s(InterfaceC49435tm1<Float> animationSpec, float f) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new C38082af1(new H96(new C50590vj1(f, animationSpec), null, null, null, 14, null));
    }

    /* renamed from: t */
    public static /* synthetic */ AbstractC37500Ze1 m74631t(InterfaceC49435tm1 interfaceC49435tm1, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC49435tm1 = C26160mf.m25221i(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return m74632s(interfaceC49435tm1, f);
    }

    /* renamed from: u */
    public static final AbstractC41687gi1 m74630u(InterfaceC49435tm1<Float> animationSpec, float f) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new C42280hi1(new H96(new C50590vj1(f, animationSpec), null, null, null, 14, null));
    }

    /* renamed from: v */
    public static /* synthetic */ AbstractC41687gi1 m74629v(InterfaceC49435tm1 interfaceC49435tm1, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC49435tm1 = C26160mf.m25221i(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return m74630u(interfaceC49435tm1, f);
    }

    /* renamed from: w */
    public static final AbstractC37500Ze1 m74628w(InterfaceC49435tm1<Float> animationSpec, float f, long j) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new C38082af1(new H96(null, null, null, new C37306Yi5(f, j, animationSpec, null), 7, null));
    }

    /* renamed from: x */
    public static /* synthetic */ AbstractC37500Ze1 m74627x(InterfaceC49435tm1 interfaceC49435tm1, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC49435tm1 = C26160mf.m25221i(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = C11333f.f53066b.m68626a();
        }
        return m74628w(interfaceC49435tm1, f, j);
    }

    /* renamed from: y */
    public static final InterfaceC41563gV2 m74626y(InterfaceC41563gV2 interfaceC41563gV2, F96<EnumC37032Xe1> f96, InterfaceC48627sP5<C32612Eh0> interfaceC48627sP5, InterfaceC48627sP5<C32612Eh0> interfaceC48627sP52, String str) {
        return C32486Dt0.m109807b(interfaceC41563gV2, null, new C9878l(f96, interfaceC48627sP5, interfaceC48627sP52, str), 1, null);
    }

    /* renamed from: z */
    public static final AbstractC41687gi1 m74625z(InterfaceC49435tm1<G52> animationSpec, InterfaceC4360K9 shrinkTowards, boolean z, Function1<? super G52, G52> targetSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetSize, "targetSize");
        return new C42280hi1(new H96(null, null, new C32612Eh0(shrinkTowards, targetSize, animationSpec, z), null, 11, null));
    }
}
