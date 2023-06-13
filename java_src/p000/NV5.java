package p000;

import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32018Bt0;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0083\u0001\u0010\u0015\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, m28432d2 = {"LgV2;", "modifier", "Lhy5;", "shape", "Lpm0;", "color", "contentColor", "LeZ;", "border", "Lk61;", "elevation", "Lkotlin/Function0;", "", "content", C17296a.f69688o, "(LgV2;Lhy5;JJLeZ;FLkotlin/jvm/functions/Function2;LEt0;II)V", "onClick", "", "enabled", "LrX2;", "interactionSource", "b", "(Lkotlin/jvm/functions/Function0;LgV2;ZLhy5;JJLeZ;FLrX2;Lkotlin/jvm/functions/Function2;LEt0;II)V", "backgroundColor", "e", "(LgV2;Lhy5;JLeZ;F)LgV2;", "Lma1;", "elevationOverlay", "absoluteElevation", "f", "(JLma1;FLEt0;I)J", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,641:1\n154#2:642\n154#2:645\n154#2:655\n154#2:665\n154#2:675\n76#3:643\n76#3:653\n76#3:663\n76#3:673\n76#3:683\n76#3:684\n51#4:644\n51#4:654\n51#4:664\n51#4:674\n51#4:685\n25#5:646\n25#5:656\n25#5:666\n25#5:676\n1114#6,6:647\n1114#6,6:657\n1114#6,6:667\n1114#6,6:677\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n*L\n111#1:642\n219#1:645\n333#1:655\n448#1:665\n576#1:675\n114#1:643\n223#1:653\n337#1:663\n452#1:673\n578#1:683\n584#1:684\n114#1:644\n223#1:654\n337#1:664\n452#1:674\n584#1:685\n220#1:646\n334#1:656\n449#1:666\n577#1:676\n220#1:647,6\n334#1:657,6\n449#1:667,6\n577#1:677,6\n*E\n"})
/* renamed from: NV5 */
/* loaded from: classes.dex */
public final class NV5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt$Surface$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,641:1\n76#2:642\n76#2:650\n67#3,6:643\n73#3:675\n77#3:680\n75#4:649\n76#4,11:651\n89#4:679\n460#5,13:662\n473#5,3:676\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt$Surface$1\n*L\n125#1:642\n119#1:650\n119#1:643,6\n119#1:675\n119#1:680\n119#1:649\n119#1:651,11\n119#1:679\n119#1:662,13\n119#1:676,3\n*E\n"})
    /* renamed from: NV5$a */
    /* loaded from: classes.dex */
    public static final class C5591a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f24687g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC42444hy5 f24688h;

        /* renamed from: i */
        public final /* synthetic */ long f24689i;

        /* renamed from: j */
        public final /* synthetic */ float f24690j;

        /* renamed from: k */
        public final /* synthetic */ int f24691k;

        /* renamed from: l */
        public final /* synthetic */ C20064eZ f24692l;

        /* renamed from: m */
        public final /* synthetic */ float f24693m;

        /* renamed from: n */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f24694n;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: NV5$a$a */
        /* loaded from: classes.dex */
        public static final class C5592a extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

            /* renamed from: g */
            public static final C5592a f24695g = new C5592a();

            public C5592a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
                invoke2(interfaceC48906ss5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC48906ss5 semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                C47128ps5.m18619G(semantics, true);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.material.SurfaceKt$Surface$1$2", m28418f = "Surface.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: NV5$a$b */
        /* loaded from: classes.dex */
        public static final class C5593b extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f24696h;

            public C5593b(Continuation<? super C5593b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C5593b(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
                return ((C5593b) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f24696h == 0) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5591a(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC42444hy5 interfaceC42444hy5, long j, float f, int i, C20064eZ c20064eZ, float f2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
            super(2);
            this.f24687g = interfaceC41563gV2;
            this.f24688h = interfaceC42444hy5;
            this.f24689i = j;
            this.f24690j = f;
            this.f24691k = i;
            this.f24692l = c20064eZ;
            this.f24693m = f2;
            this.f24694n = function2;
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
                C35528Qt0.m87816Z(-1822160838, i, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:117)");
            }
            InterfaceC41563gV2 m1270c = C52840zW5.m1270c(C41198fs5.m40621a(NV5.m93834e(this.f24687g, this.f24688h, NV5.m93833f(this.f24689i, (InterfaceC45165ma1) interfaceC32720Et0.mo89572c(C45758na1.m23501d()), this.f24690j, interfaceC32720Et0, (this.f24691k >> 6) & 14), this.f24692l, this.f24693m), false, C5592a.f24695g), Unit.INSTANCE, new C5593b(null));
            Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f24694n;
            int i2 = this.f24691k;
            interfaceC32720Et0.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), true, interfaceC32720Et0, 48);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m1270c);
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
            function2.invoke(interfaceC32720Et0, Integer.valueOf((i2 >> 18) & 14));
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
    /* renamed from: NV5$b */
    /* loaded from: classes.dex */
    public static final class C5594b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f24697g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC42444hy5 f24698h;

        /* renamed from: i */
        public final /* synthetic */ long f24699i;

        /* renamed from: j */
        public final /* synthetic */ long f24700j;

        /* renamed from: k */
        public final /* synthetic */ C20064eZ f24701k;

        /* renamed from: l */
        public final /* synthetic */ float f24702l;

        /* renamed from: m */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f24703m;

        /* renamed from: n */
        public final /* synthetic */ int f24704n;

        /* renamed from: o */
        public final /* synthetic */ int f24705o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5594b(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC42444hy5 interfaceC42444hy5, long j, long j2, C20064eZ c20064eZ, float f, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f24697g = interfaceC41563gV2;
            this.f24698h = interfaceC42444hy5;
            this.f24699i = j;
            this.f24700j = j2;
            this.f24701k = c20064eZ;
            this.f24702l = f;
            this.f24703m = function2;
            this.f24704n = i;
            this.f24705o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            NV5.m93838a(this.f24697g, this.f24698h, this.f24699i, this.f24700j, this.f24701k, this.f24702l, this.f24703m, interfaceC32720Et0, C47127ps4.m18626a(this.f24704n | 1), this.f24705o);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt$Surface$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,641:1\n76#2:642\n76#2:650\n67#3,6:643\n73#3:675\n77#3:680\n75#4:649\n76#4,11:651\n89#4:679\n460#5,13:662\n473#5,3:676\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt$Surface$4\n*L\n235#1:642\n228#1:650\n228#1:643,6\n228#1:675\n228#1:680\n228#1:649\n228#1:651,11\n228#1:679\n228#1:662,13\n228#1:676,3\n*E\n"})
    /* renamed from: NV5$c */
    /* loaded from: classes.dex */
    public static final class C5595c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f24706g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC42444hy5 f24707h;

        /* renamed from: i */
        public final /* synthetic */ long f24708i;

        /* renamed from: j */
        public final /* synthetic */ float f24709j;

        /* renamed from: k */
        public final /* synthetic */ int f24710k;

        /* renamed from: l */
        public final /* synthetic */ C20064eZ f24711l;

        /* renamed from: m */
        public final /* synthetic */ float f24712m;

        /* renamed from: n */
        public final /* synthetic */ InterfaceC48104rX2 f24713n;

        /* renamed from: o */
        public final /* synthetic */ boolean f24714o;

        /* renamed from: p */
        public final /* synthetic */ Function0<Unit> f24715p;

        /* renamed from: q */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f24716q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5595c(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC42444hy5 interfaceC42444hy5, long j, float f, int i, C20064eZ c20064eZ, float f2, InterfaceC48104rX2 interfaceC48104rX2, boolean z, Function0<Unit> function0, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
            super(2);
            this.f24706g = interfaceC41563gV2;
            this.f24707h = interfaceC42444hy5;
            this.f24708i = j;
            this.f24709j = f;
            this.f24710k = i;
            this.f24711l = c20064eZ;
            this.f24712m = f2;
            this.f24713n = interfaceC48104rX2;
            this.f24714o = z;
            this.f24715p = function0;
            this.f24716q = function2;
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
                C35528Qt0.m87816Z(2031491085, i, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:226)");
            }
            InterfaceC41563gV2 m70816c = C38131ak0.m70816c(NV5.m93834e(C41334g62.m40069c(this.f24706g), this.f24707h, NV5.m93833f(this.f24708i, (InterfaceC45165ma1) interfaceC32720Et0.mo89572c(C45758na1.m23501d()), this.f24709j, interfaceC32720Et0, (this.f24710k >> 12) & 14), this.f24711l, this.f24712m), this.f24713n, C51107wb5.m6605e(false, 0.0f, 0L, interfaceC32720Et0, 0, 7), this.f24714o, null, null, this.f24715p, 24, null);
            Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f24716q;
            int i2 = this.f24710k;
            interfaceC32720Et0.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), true, interfaceC32720Et0, 48);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m70816c);
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
            function2.invoke(interfaceC32720Et0, Integer.valueOf((i2 >> 27) & 14));
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
    /* renamed from: NV5$d */
    /* loaded from: classes.dex */
    public static final class C5596d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f24717g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f24718h;

        /* renamed from: i */
        public final /* synthetic */ boolean f24719i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC42444hy5 f24720j;

        /* renamed from: k */
        public final /* synthetic */ long f24721k;

        /* renamed from: l */
        public final /* synthetic */ long f24722l;

        /* renamed from: m */
        public final /* synthetic */ C20064eZ f24723m;

        /* renamed from: n */
        public final /* synthetic */ float f24724n;

        /* renamed from: o */
        public final /* synthetic */ InterfaceC48104rX2 f24725o;

        /* renamed from: p */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f24726p;

        /* renamed from: q */
        public final /* synthetic */ int f24727q;

        /* renamed from: r */
        public final /* synthetic */ int f24728r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5596d(Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, boolean z, InterfaceC42444hy5 interfaceC42444hy5, long j, long j2, C20064eZ c20064eZ, float f, InterfaceC48104rX2 interfaceC48104rX2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f24717g = function0;
            this.f24718h = interfaceC41563gV2;
            this.f24719i = z;
            this.f24720j = interfaceC42444hy5;
            this.f24721k = j;
            this.f24722l = j2;
            this.f24723m = c20064eZ;
            this.f24724n = f;
            this.f24725o = interfaceC48104rX2;
            this.f24726p = function2;
            this.f24727q = i;
            this.f24728r = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            NV5.m93837b(this.f24717g, this.f24718h, this.f24719i, this.f24720j, this.f24721k, this.f24722l, this.f24723m, this.f24724n, this.f24725o, this.f24726p, interfaceC32720Et0, C47127ps4.m18626a(this.f24727q | 1), this.f24728r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m93838a(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC42444hy5 interfaceC42444hy5, long j, long j2, C20064eZ c20064eZ, float f, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        Object obj2;
        int i5;
        long j3;
        long j4;
        int i6;
        Object obj3;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj4;
        float f2;
        long j5;
        Object obj5;
        Object obj6;
        Object obj7;
        long j6;
        int i11;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC42444hy5 interfaceC42444hy52;
        long j7;
        C20064eZ c20064eZ2;
        long j8;
        float f3;
        InterfaceC36874Wm5 mo89512w;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1412203386);
        int i14 = i2 & 1;
        if (i14 != 0) {
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
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj2 = interfaceC42444hy5;
            if (mo89518u.mo89539n(obj2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (mo89518u.mo89524s(j3)) {
                        i13 = 256;
                        i3 |= i13;
                    }
                } else {
                    j3 = j;
                }
                i13 = 128;
                i3 |= i13;
            } else {
                j3 = j;
            }
            if ((i & 7168) != 0) {
                j4 = j2;
                if ((i2 & 8) == 0 && mo89518u.mo89524s(j4)) {
                    i12 = 2048;
                } else {
                    i12 = 1024;
                }
                i3 |= i12;
            } else {
                j4 = j2;
            }
            i6 = i2 & 16;
            if (i6 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                obj3 = c20064eZ;
                if (mo89518u.mo89539n(obj3)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= ImageMetadata.EDGE_MODE;
                } else if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                    if (mo89518u.mo89533p(f)) {
                        i9 = DateUtils.FORMAT_NUMERIC_DATE;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 64) != 0) {
                    i10 = 1572864;
                } else {
                    if ((i & 3670016) == 0) {
                        if (mo89518u.mo89629I(content)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                    }
                    if ((i3 & 2995931) != 599186 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        interfaceC41563gV22 = obj;
                        interfaceC42444hy52 = obj2;
                        j7 = j3;
                        j8 = j4;
                        c20064eZ2 = obj3;
                        f3 = f;
                    } else {
                        mo89518u.mo89626J();
                        if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                            mo89518u.mo89548k();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                f2 = f;
                                j5 = j4;
                                obj5 = obj3;
                                obj6 = obj;
                                obj7 = obj2;
                                j6 = j3;
                                i11 = i3 & (-7169);
                                mo89518u.mo89650B();
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87816Z(1412203386, i11, -1, "androidx.compose.material.Surface (Surface.kt:104)");
                                }
                                float m29303g = C43705k61.m29303g(((C43705k61) mo89518u.mo89572c(C45758na1.m23502c())).m29298l() + f2);
                                C41806gu0.m37353a(new W94[]{C41372gA0.m39962a().m81907c(C47063pm0.m18747i(j5)), C45758na1.m23502c().m81907c(C43705k61.m29306d(m29303g))}, C43575jt0.m29791b(mo89518u, -1822160838, true, new C5591a(obj6, obj7, j6, m29303g, i11, obj5, f2, content)), mo89518u, 56);
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                                interfaceC41563gV22 = obj6;
                                interfaceC42444hy52 = obj7;
                                j7 = j6;
                                c20064eZ2 = obj5;
                                j8 = j5;
                                f3 = f2;
                            } else {
                                f2 = f;
                                j5 = j4;
                                obj5 = obj3;
                                obj6 = obj;
                            }
                        } else {
                            if (i14 == 0) {
                                obj4 = InterfaceC41563gV2.f82354b0;
                            } else {
                                obj4 = obj;
                            }
                            if (i15 != 0) {
                                obj2 = C37629Zs4.m72365a();
                            }
                            if ((i2 & 4) != 0) {
                                j3 = TM2.f35372a.m83731a(mo89518u, 6).m94896n();
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                j4 = C34763Nm0.m93468b(j3, mo89518u, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            if (i6 != 0) {
                                obj3 = null;
                            }
                            if (i8 == 0) {
                                f2 = C43705k61.m29303g(0);
                            } else {
                                f2 = f;
                            }
                            j5 = j4;
                            obj5 = obj3;
                            obj6 = obj4;
                        }
                        obj7 = obj2;
                        j6 = j3;
                        i11 = i3;
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                        }
                        float m29303g2 = C43705k61.m29303g(((C43705k61) mo89518u.mo89572c(C45758na1.m23502c())).m29298l() + f2);
                        C41806gu0.m37353a(new W94[]{C41372gA0.m39962a().m81907c(C47063pm0.m18747i(j5)), C45758na1.m23502c().m81907c(C43705k61.m29306d(m29303g2))}, C43575jt0.m29791b(mo89518u, -1822160838, true, new C5591a(obj6, obj7, j6, m29303g2, i11, obj5, f2, content)), mo89518u, 56);
                        if (C35528Qt0.m87827O()) {
                        }
                        interfaceC41563gV22 = obj6;
                        interfaceC42444hy52 = obj7;
                        j7 = j6;
                        c20064eZ2 = obj5;
                        j8 = j5;
                        f3 = f2;
                    }
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w == null) {
                        mo89512w.mo20405a(new C5594b(interfaceC41563gV22, interfaceC42444hy52, j7, j8, c20064eZ2, f3, content, i, i2));
                        return;
                    }
                    return;
                }
                i3 |= i10;
                if ((i3 & 2995931) != 599186) {
                }
                mo89518u.mo89626J();
                if ((i & 1) == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 == 0) {
                }
                j5 = j4;
                obj5 = obj3;
                obj6 = obj4;
                obj7 = obj2;
                j6 = j3;
                i11 = i3;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                float m29303g22 = C43705k61.m29303g(((C43705k61) mo89518u.mo89572c(C45758na1.m23502c())).m29298l() + f2);
                C41806gu0.m37353a(new W94[]{C41372gA0.m39962a().m81907c(C47063pm0.m18747i(j5)), C45758na1.m23502c().m81907c(C43705k61.m29306d(m29303g22))}, C43575jt0.m29791b(mo89518u, -1822160838, true, new C5591a(obj6, obj7, j6, m29303g22, i11, obj5, f2, content)), mo89518u, 56);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV22 = obj6;
                interfaceC42444hy52 = obj7;
                j7 = j6;
                c20064eZ2 = obj5;
                j8 = j5;
                f3 = f2;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                }
            }
            obj3 = c20064eZ;
            i8 = i2 & 32;
            if (i8 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            i3 |= i10;
            if ((i3 & 2995931) != 599186) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 == 0) {
            }
            j5 = j4;
            obj5 = obj3;
            obj6 = obj4;
            obj7 = obj2;
            j6 = j3;
            i11 = i3;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            float m29303g222 = C43705k61.m29303g(((C43705k61) mo89518u.mo89572c(C45758na1.m23502c())).m29298l() + f2);
            C41806gu0.m37353a(new W94[]{C41372gA0.m39962a().m81907c(C47063pm0.m18747i(j5)), C45758na1.m23502c().m81907c(C43705k61.m29306d(m29303g222))}, C43575jt0.m29791b(mo89518u, -1822160838, true, new C5591a(obj6, obj7, j6, m29303g222, i11, obj5, f2, content)), mo89518u, 56);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV22 = obj6;
            interfaceC42444hy52 = obj7;
            j7 = j6;
            c20064eZ2 = obj5;
            j8 = j5;
            f3 = f2;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
            }
        }
        obj2 = interfaceC42444hy5;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        obj3 = c20064eZ;
        i8 = i2 & 32;
        if (i8 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        i3 |= i10;
        if ((i3 & 2995931) != 599186) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 == 0) {
        }
        j5 = j4;
        obj5 = obj3;
        obj6 = obj4;
        obj7 = obj2;
        j6 = j3;
        i11 = i3;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        float m29303g2222 = C43705k61.m29303g(((C43705k61) mo89518u.mo89572c(C45758na1.m23502c())).m29298l() + f2);
        C41806gu0.m37353a(new W94[]{C41372gA0.m39962a().m81907c(C47063pm0.m18747i(j5)), C45758na1.m23502c().m81907c(C43705k61.m29306d(m29303g2222))}, C43575jt0.m29791b(mo89518u, -1822160838, true, new C5591a(obj6, obj7, j6, m29303g2222, i11, obj5, f2, content)), mo89518u, 56);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = obj6;
        interfaceC42444hy52 = obj7;
        j7 = j6;
        c20064eZ2 = obj5;
        j8 = j5;
        f3 = f2;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m93837b(Function0<Unit> onClick, InterfaceC41563gV2 interfaceC41563gV2, boolean z, InterfaceC42444hy5 interfaceC42444hy5, long j, long j2, C20064eZ c20064eZ, float f, InterfaceC48104rX2 interfaceC48104rX2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        Object obj;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j4;
        long j5;
        InterfaceC48104rX2 interfaceC48104rX22;
        float f2;
        Object obj2;
        boolean z3;
        long j6;
        long j7;
        C20064eZ c20064eZ2;
        int i11;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2 interfaceC41563gV23;
        boolean z4;
        InterfaceC42444hy5 interfaceC42444hy52;
        long j8;
        long j9;
        C20064eZ c20064eZ3;
        float f3;
        InterfaceC48104rX2 interfaceC48104rX23;
        InterfaceC36874Wm5 mo89512w;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1560876237);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (mo89518u.mo89629I(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= mo89518u.mo89539n(interfaceC41563gV2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= mo89518u.mo89536o(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    obj = interfaceC42444hy5;
                    i3 |= mo89518u.mo89539n(obj) ? 2048 : 1024;
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
                            i6 = i14;
                            if (mo89518u.mo89524s(j2)) {
                                i12 = DateUtils.FORMAT_NUMERIC_DATE;
                                i3 |= i12;
                            }
                        } else {
                            i6 = i14;
                        }
                        i12 = 65536;
                        i3 |= i12;
                    } else {
                        i6 = i14;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= mo89518u.mo89539n(c20064eZ) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= mo89518u.mo89533p(f) ? 8388608 : 4194304;
                    }
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= mo89518u.mo89539n(interfaceC48104rX2) ? 67108864 : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i10 = mo89518u.mo89629I(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) != 306783378 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            interfaceC41563gV23 = interfaceC41563gV2;
                            z4 = z2;
                            interfaceC42444hy52 = obj;
                            j8 = j3;
                            interfaceC32720Et02 = mo89518u;
                            j9 = j2;
                            c20064eZ3 = c20064eZ;
                            f3 = f;
                            interfaceC48104rX23 = interfaceC48104rX2;
                        } else {
                            mo89518u.mo89626J();
                            if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                                mo89518u.mo89548k();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    interfaceC41563gV22 = interfaceC41563gV2;
                                    j7 = j2;
                                    c20064eZ2 = c20064eZ;
                                    f2 = f;
                                    interfaceC48104rX22 = interfaceC48104rX2;
                                    z3 = z2;
                                    obj2 = obj;
                                    j6 = j3;
                                    i11 = i3 & (-458753);
                                } else {
                                    interfaceC41563gV22 = interfaceC41563gV2;
                                    j7 = j2;
                                    c20064eZ2 = c20064eZ;
                                    f2 = f;
                                    interfaceC48104rX22 = interfaceC48104rX2;
                                    z3 = z2;
                                    obj2 = obj;
                                    j6 = j3;
                                    i11 = i3;
                                }
                            } else {
                                InterfaceC41563gV2 interfaceC41563gV24 = i6 != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                InterfaceC42444hy5 m72365a = i5 != 0 ? C37629Zs4.m72365a() : obj;
                                if ((i2 & 16) != 0) {
                                    j4 = TM2.f35372a.m83731a(mo89518u, 6).m94896n();
                                    i3 &= -57345;
                                } else {
                                    j4 = j3;
                                }
                                if ((i2 & 32) != 0) {
                                    j5 = C34763Nm0.m93468b(j4, mo89518u, (i3 >> 12) & 14);
                                    i3 &= -458753;
                                } else {
                                    j5 = j2;
                                }
                                C20064eZ c20064eZ4 = i7 != 0 ? null : c20064eZ;
                                float m29303g = i8 != 0 ? C43705k61.m29303g(0) : f;
                                if (i9 != 0) {
                                    mo89518u.mo89638F(-492369756);
                                    Object mo89635G = mo89518u.mo89635G();
                                    if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                                        mo89635G = C40741f62.m42091a();
                                        mo89518u.mo89503z(mo89635G);
                                    }
                                    mo89518u.mo89605Q();
                                    f2 = m29303g;
                                    interfaceC48104rX22 = (InterfaceC48104rX2) mo89635G;
                                } else {
                                    interfaceC48104rX22 = interfaceC48104rX2;
                                    f2 = m29303g;
                                }
                                obj2 = m72365a;
                                z3 = z2;
                                j6 = j4;
                                j7 = j5;
                                c20064eZ2 = c20064eZ4;
                                i11 = i3;
                                interfaceC41563gV22 = interfaceC41563gV24;
                            }
                            mo89518u.mo89650B();
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(1560876237, i11, -1, "androidx.compose.material.Surface (Surface.kt:210)");
                            }
                            float m29303g2 = C43705k61.m29303g(((C43705k61) mo89518u.mo89572c(C45758na1.m23502c())).m29298l() + f2);
                            interfaceC32720Et02 = mo89518u;
                            C41806gu0.m37353a(new W94[]{C41372gA0.m39962a().m81907c(C47063pm0.m18747i(j7)), C45758na1.m23502c().m81907c(C43705k61.m29306d(m29303g2))}, C43575jt0.m29791b(interfaceC32720Et02, 2031491085, true, new C5595c(interfaceC41563gV22, obj2, j6, m29303g2, i11, c20064eZ2, f2, interfaceC48104rX22, z3, onClick, content)), interfaceC32720Et02, 56);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            interfaceC41563gV23 = interfaceC41563gV22;
                            z4 = z3;
                            interfaceC42444hy52 = obj2;
                            j8 = j6;
                            j9 = j7;
                            c20064eZ3 = c20064eZ2;
                            f3 = f2;
                            interfaceC48104rX23 = interfaceC48104rX22;
                        }
                        mo89512w = interfaceC32720Et02.mo89512w();
                        if (mo89512w == null) {
                            return;
                        }
                        mo89512w.mo20405a(new C5596d(onClick, interfaceC41563gV23, z4, interfaceC42444hy52, j8, j9, c20064eZ3, f3, interfaceC48104rX23, content, i, i2));
                        return;
                    }
                    i10 = 805306368;
                    i3 |= i10;
                    if ((1533916891 & i3) != 306783378) {
                    }
                    mo89518u.mo89626J();
                    if ((i & 1) == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    obj2 = m72365a;
                    z3 = z2;
                    j6 = j4;
                    j7 = j5;
                    c20064eZ2 = c20064eZ4;
                    i11 = i3;
                    interfaceC41563gV22 = interfaceC41563gV24;
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                    }
                    float m29303g22 = C43705k61.m29303g(((C43705k61) mo89518u.mo89572c(C45758na1.m23502c())).m29298l() + f2);
                    interfaceC32720Et02 = mo89518u;
                    C41806gu0.m37353a(new W94[]{C41372gA0.m39962a().m81907c(C47063pm0.m18747i(j7)), C45758na1.m23502c().m81907c(C43705k61.m29306d(m29303g22))}, C43575jt0.m29791b(interfaceC32720Et02, 2031491085, true, new C5595c(interfaceC41563gV22, obj2, j6, m29303g22, i11, c20064eZ2, f2, interfaceC48104rX22, z3, onClick, content)), interfaceC32720Et02, 56);
                    if (C35528Qt0.m87827O()) {
                    }
                    interfaceC41563gV23 = interfaceC41563gV22;
                    z4 = z3;
                    interfaceC42444hy52 = obj2;
                    j8 = j6;
                    j9 = j7;
                    c20064eZ3 = c20064eZ2;
                    f3 = f2;
                    interfaceC48104rX23 = interfaceC48104rX22;
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w == null) {
                    }
                }
                obj = interfaceC42444hy5;
                if ((57344 & i) != 0) {
                }
                if ((i & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i10;
                if ((1533916891 & i3) != 306783378) {
                }
                mo89518u.mo89626J();
                if ((i & 1) == 0) {
                }
                if (i6 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                obj2 = m72365a;
                z3 = z2;
                j6 = j4;
                j7 = j5;
                c20064eZ2 = c20064eZ4;
                i11 = i3;
                interfaceC41563gV22 = interfaceC41563gV24;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                float m29303g222 = C43705k61.m29303g(((C43705k61) mo89518u.mo89572c(C45758na1.m23502c())).m29298l() + f2);
                interfaceC32720Et02 = mo89518u;
                C41806gu0.m37353a(new W94[]{C41372gA0.m39962a().m81907c(C47063pm0.m18747i(j7)), C45758na1.m23502c().m81907c(C43705k61.m29306d(m29303g222))}, C43575jt0.m29791b(interfaceC32720Et02, 2031491085, true, new C5595c(interfaceC41563gV22, obj2, j6, m29303g222, i11, c20064eZ2, f2, interfaceC48104rX22, z3, onClick, content)), interfaceC32720Et02, 56);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV23 = interfaceC41563gV22;
                z4 = z3;
                interfaceC42444hy52 = obj2;
                j8 = j6;
                j9 = j7;
                c20064eZ3 = c20064eZ2;
                f3 = f2;
                interfaceC48104rX23 = interfaceC48104rX22;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj = interfaceC42444hy5;
            if ((57344 & i) != 0) {
            }
            if ((i & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i10;
            if ((1533916891 & i3) != 306783378) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            obj2 = m72365a;
            z3 = z2;
            j6 = j4;
            j7 = j5;
            c20064eZ2 = c20064eZ4;
            i11 = i3;
            interfaceC41563gV22 = interfaceC41563gV24;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            float m29303g2222 = C43705k61.m29303g(((C43705k61) mo89518u.mo89572c(C45758na1.m23502c())).m29298l() + f2);
            interfaceC32720Et02 = mo89518u;
            C41806gu0.m37353a(new W94[]{C41372gA0.m39962a().m81907c(C47063pm0.m18747i(j7)), C45758na1.m23502c().m81907c(C43705k61.m29306d(m29303g2222))}, C43575jt0.m29791b(interfaceC32720Et02, 2031491085, true, new C5595c(interfaceC41563gV22, obj2, j6, m29303g2222, i11, c20064eZ2, f2, interfaceC48104rX22, z3, onClick, content)), interfaceC32720Et02, 56);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV23 = interfaceC41563gV22;
            z4 = z3;
            interfaceC42444hy52 = obj2;
            j8 = j6;
            j9 = j7;
            c20064eZ3 = c20064eZ2;
            f3 = f2;
            interfaceC48104rX23 = interfaceC48104rX22;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj = interfaceC42444hy5;
        if ((57344 & i) != 0) {
        }
        if ((i & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i10;
        if ((1533916891 & i3) != 306783378) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        obj2 = m72365a;
        z3 = z2;
        j6 = j4;
        j7 = j5;
        c20064eZ2 = c20064eZ4;
        i11 = i3;
        interfaceC41563gV22 = interfaceC41563gV24;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        float m29303g22222 = C43705k61.m29303g(((C43705k61) mo89518u.mo89572c(C45758na1.m23502c())).m29298l() + f2);
        interfaceC32720Et02 = mo89518u;
        C41806gu0.m37353a(new W94[]{C41372gA0.m39962a().m81907c(C47063pm0.m18747i(j7)), C45758na1.m23502c().m81907c(C43705k61.m29306d(m29303g22222))}, C43575jt0.m29791b(interfaceC32720Et02, 2031491085, true, new C5595c(interfaceC41563gV22, obj2, j6, m29303g22222, i11, c20064eZ2, f2, interfaceC48104rX22, z3, onClick, content)), interfaceC32720Et02, 56);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV23 = interfaceC41563gV22;
        z4 = z3;
        interfaceC42444hy52 = obj2;
        j8 = j6;
        j9 = j7;
        c20064eZ3 = c20064eZ2;
        f3 = f2;
        interfaceC48104rX23 = interfaceC48104rX22;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: e */
    public static final InterfaceC41563gV2 m93834e(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC42444hy5 interfaceC42444hy5, long j, C20064eZ c20064eZ, float f) {
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC41563gV2 m87499b = C35569Qx5.m87499b(interfaceC41563gV2, f, interfaceC42444hy5, false, 0L, 0L, 24, null);
        if (c20064eZ != null) {
            interfaceC41563gV22 = C19783dZ.m44156f(InterfaceC41563gV2.f82354b0, c20064eZ, interfaceC42444hy5);
        } else {
            interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
        }
        return C35447Qk0.m88106a(C13342bw.m62125c(m87499b.mo39266t0(interfaceC41563gV22), j, interfaceC42444hy5), interfaceC42444hy5);
    }

    /* renamed from: f */
    public static final long m93833f(long j, InterfaceC45165ma1 interfaceC45165ma1, float f, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(1561611256);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1561611256, i, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:629)");
        }
        if (C47063pm0.m18741o(j, TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94896n()) && interfaceC45165ma1 != null) {
            j = interfaceC45165ma1.mo25423a(j, f, interfaceC32720Et0, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896));
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return j;
    }
}
