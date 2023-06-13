package p000;

import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
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
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u008c\u0001\u0010\u001a\u001a\u00020\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a \u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002\u001aA\u0010\u001d\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00182\u0006\u0010#\u001a\u00020\u0014H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010$\"\u0017\u0010&\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010%\"\u0017\u0010'\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010%\"\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, m28432d2 = {"Lo71;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Lm71;", "i", "(Lo71;Lkotlin/jvm/functions/Function1;LEt0;II)Lm71;", "LPm0;", "", "Lkotlin/ExtensionFunctionType;", "drawerContent", "LgV2;", "modifier", "drawerState", "gesturesEnabled", "Lhy5;", "drawerShape", "Lk61;", "drawerElevation", "Lpm0;", "drawerBackgroundColor", "drawerContentColor", "scrimColor", "Lkotlin/Function0;", "content", C17296a.f69688o, "(Lkotlin/jvm/functions/Function3;LgV2;Lm71;ZLhy5;FJJJLkotlin/jvm/functions/Function2;LEt0;II)V", "", "b", "pos", "h", "open", "onClose", "fraction", "color", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLEt0;I)V", "F", "EndDrawerPadding", "DrawerVelocityThreshold", "Ltb6;", "c", "Ltb6;", "AnimationSpec", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,713:1\n50#2:714\n49#2:715\n50#2:722\n49#2:723\n25#2:734\n25#2:749\n36#2:761\n50#2:768\n49#2:769\n50#2:776\n49#2:777\n36#2:784\n50#2:791\n49#2:792\n50#2:799\n49#2:800\n1114#3,6:716\n1114#3,6:724\n1114#3,3:735\n1117#3,3:741\n1114#3,3:750\n1117#3,3:756\n1114#3,6:762\n1114#3,6:770\n1114#3,6:778\n1114#3,6:785\n1114#3,6:793\n1114#3,6:801\n474#4,4:730\n478#4,2:738\n482#4:744\n474#4,4:745\n478#4,2:753\n482#4:759\n474#5:740\n474#5:755\n646#6:760\n76#7:807\n154#8:808\n154#8:809\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n*L\n333#1:714\n333#1:715\n350#1:722\n350#1:723\n398#1:734\n532#1:749\n656#1:761\n659#1:768\n659#1:769\n671#1:776\n671#1:777\n687#1:784\n688#1:791\n688#1:792\n700#1:799\n700#1:800\n333#1:716,6\n350#1:724,6\n398#1:735,3\n398#1:741,3\n532#1:750,3\n532#1:756,3\n656#1:762,6\n659#1:770,6\n671#1:778,6\n687#1:785,6\n688#1:793,6\n700#1:801,6\n398#1:730,4\n398#1:738,2\n398#1:744\n532#1:745,4\n532#1:753,2\n532#1:759\n398#1:740\n532#1:755\n648#1:760\n649#1:807\n705#1:808\n706#1:809\n*E\n"})
/* renamed from: l71  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44308l71 {

    /* renamed from: a */
    public static final float f95510a = C43705k61.m29303g(56);

    /* renamed from: b */
    public static final float f95511b = C43705k61.m29303g(400);

    /* renamed from: c */
    public static final C49330tb6<Float> f95512c = new C49330tb6<>(256, 0, null, 6, null);

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,713:1\n76#2:714\n76#2:730\n76#2:764\n76#2:805\n50#3:715\n49#3:716\n460#3,13:742\n460#3,13:776\n473#3,3:790\n67#3,3:795\n66#3:798\n36#3:806\n473#3,3:813\n1114#4,6:717\n1114#4,6:799\n1114#4,6:807\n67#5,6:723\n73#5:755\n66#5,7:756\n73#5:789\n77#5:794\n77#5:817\n75#6:729\n76#6,11:731\n75#6:763\n76#6,11:765\n89#6:793\n89#6:816\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1\n*L\n409#1:714\n410#1:730\n428#1:764\n448#1:805\n421#1:715\n421#1:716\n410#1:742,13\n428#1:776,13\n428#1:790,3\n441#1:795,3\n441#1:798\n457#1:806\n410#1:813,3\n421#1:717,6\n441#1:799,6\n457#1:807,6\n410#1:723,6\n410#1:755\n428#1:756,7\n428#1:789\n428#1:794\n410#1:817\n410#1:729\n410#1:731,11\n428#1:763\n428#1:765,11\n428#1:793\n410#1:816\n*E\n"})
    /* renamed from: l71$a */
    /* loaded from: classes.dex */
    public static final class C25600a extends Lambda implements Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C44901m71 f95513g;

        /* renamed from: h */
        public final /* synthetic */ boolean f95514h;

        /* renamed from: i */
        public final /* synthetic */ int f95515i;

        /* renamed from: j */
        public final /* synthetic */ long f95516j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC42444hy5 f95517k;

        /* renamed from: l */
        public final /* synthetic */ long f95518l;

        /* renamed from: m */
        public final /* synthetic */ long f95519m;

        /* renamed from: n */
        public final /* synthetic */ float f95520n;

        /* renamed from: o */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f95521o;

        /* renamed from: p */
        public final /* synthetic */ ZC0 f95522p;

        /* renamed from: q */
        public final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> f95523q;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: l71$a$a */
        /* loaded from: classes.dex */
        public static final class C25601a extends Lambda implements Function2<EnumC46087o71, G52, Float> {

            /* renamed from: g */
            public final /* synthetic */ float f95524g;

            /* renamed from: h */
            public final /* synthetic */ float f95525h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: l71$a$a$a */
            /* loaded from: classes.dex */
            public /* synthetic */ class C25602a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC46087o71.values().length];
                    try {
                        iArr[EnumC46087o71.Closed.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC46087o71.Open.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25601a(float f, float f2) {
                super(2);
                this.f95524g = f;
                this.f95525h = f2;
            }

            /* renamed from: a */
            public final Float m27831a(EnumC46087o71 value, long j) {
                Intrinsics.checkNotNullParameter(value, "value");
                int i = C25602a.$EnumSwitchMapping$0[value.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        return Float.valueOf(this.f95525h);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return Float.valueOf(this.f95524g);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(EnumC46087o71 enumC46087o71, G52 g52) {
                return m27831a(enumC46087o71, g52.m105826j());
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: l71$a$b */
        /* loaded from: classes.dex */
        public static final class C25603b extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ boolean f95526g;

            /* renamed from: h */
            public final /* synthetic */ C44901m71 f95527h;

            /* renamed from: i */
            public final /* synthetic */ ZC0 f95528i;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", m28418f = "Drawer.kt", m28417i = {}, m28416l = {438}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: l71$a$b$a */
            /* loaded from: classes.dex */
            public static final class C25604a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f95529h;

                /* renamed from: i */
                public final /* synthetic */ C44901m71 f95530i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C25604a(C44901m71 c44901m71, Continuation<? super C25604a> continuation) {
                    super(2, continuation);
                    this.f95530i = c44901m71;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C25604a(this.f95530i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C25604a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f95529h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        C44901m71 c44901m71 = this.f95530i;
                        this.f95529h = 1;
                        if (c44901m71.m26326a(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25603b(boolean z, C44901m71 c44901m71, ZC0 zc0) {
                super(0);
                this.f95526g = z;
                this.f95527h = c44901m71;
                this.f95528i = zc0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f95526g && this.f95527h.m26324c().m12123m().invoke(EnumC46087o71.Closed).booleanValue()) {
                    Z30.m73800d(this.f95528i, null, null, new C25604a(this.f95527h, null), 3, null);
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: l71$a$c */
        /* loaded from: classes.dex */
        public static final class C25605c extends Lambda implements Function0<Float> {

            /* renamed from: g */
            public final /* synthetic */ float f95531g;

            /* renamed from: h */
            public final /* synthetic */ float f95532h;

            /* renamed from: i */
            public final /* synthetic */ C44901m71 f95533i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25605c(float f, float f2, C44901m71 c44901m71) {
                super(0);
                this.f95531g = f;
                this.f95532h = f2;
                this.f95533i = c44901m71;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final Float invoke() {
                return Float.valueOf(C44308l71.m27833h(this.f95531g, this.f95532h, this.f95533i.m26322e()));
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: l71$a$d */
        /* loaded from: classes.dex */
        public static final class C25606d extends Lambda implements Function1<InterfaceC41273g01, A52> {

            /* renamed from: g */
            public final /* synthetic */ C44901m71 f95534g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25606d(C44901m71 c44901m71) {
                super(1);
                this.f95534g = c44901m71;
            }

            /* renamed from: a */
            public final long m27829a(InterfaceC41273g01 offset) {
                int roundToInt;
                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                roundToInt = MathKt__MathJVMKt.roundToInt(this.f95534g.m26322e());
                return B52.m114704a(roundToInt, 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ A52 invoke(InterfaceC41273g01 interfaceC41273g01) {
                return A52.m116119b(m27829a(interfaceC41273g01));
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: l71$a$e */
        /* loaded from: classes.dex */
        public static final class C25607e extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ String f95535g;

            /* renamed from: h */
            public final /* synthetic */ C44901m71 f95536h;

            /* renamed from: i */
            public final /* synthetic */ ZC0 f95537i;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: l71$a$e$a */
            /* loaded from: classes.dex */
            public static final class C25608a extends Lambda implements Function0<Boolean> {

                /* renamed from: g */
                public final /* synthetic */ C44901m71 f95538g;

                /* renamed from: h */
                public final /* synthetic */ ZC0 f95539h;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", m28418f = "Drawer.kt", m28417i = {}, m28416l = {473}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                /* renamed from: l71$a$e$a$a */
                /* loaded from: classes.dex */
                public static final class C25609a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                    /* renamed from: h */
                    public int f95540h;

                    /* renamed from: i */
                    public final /* synthetic */ C44901m71 f95541i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C25609a(C44901m71 c44901m71, Continuation<? super C25609a> continuation) {
                        super(2, continuation);
                        this.f95541i = c44901m71;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C25609a(this.f95541i, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                        return ((C25609a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f95540h;
                        if (i != 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            C44901m71 c44901m71 = this.f95541i;
                            this.f95540h = 1;
                            if (c44901m71.m26326a(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C25608a(C44901m71 c44901m71, ZC0 zc0) {
                    super(0);
                    this.f95538g = c44901m71;
                    this.f95539h = zc0;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    if (this.f95538g.m26324c().m12123m().invoke(EnumC46087o71.Closed).booleanValue()) {
                        Z30.m73800d(this.f95539h, null, null, new C25609a(this.f95538g, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25607e(String str, C44901m71 c44901m71, ZC0 zc0) {
                super(1);
                this.f95535g = str;
                this.f95536h = c44901m71;
                this.f95537i = zc0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
                invoke2(interfaceC48906ss5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC48906ss5 semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                C47128ps5.m18612N(semantics, this.f95535g);
                if (this.f95536h.m26323d()) {
                    C47128ps5.m18589j(semantics, null, new C25608a(this.f95536h, this.f95537i), 1, null);
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1$2$7\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,713:1\n74#2,6:714\n80#2:746\n84#2:751\n75#3:720\n76#3,11:722\n89#3:750\n76#4:721\n460#5,13:733\n473#5,3:747\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1$2$7\n*L\n483#1:714,6\n483#1:746\n483#1:751\n483#1:720\n483#1:722,11\n483#1:750\n483#1:721\n483#1:733,13\n483#1:747,3\n*E\n"})
        /* renamed from: l71$a$f */
        /* loaded from: classes.dex */
        public static final class C25610f extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> f95542g;

            /* renamed from: h */
            public final /* synthetic */ int f95543h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C25610f(Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
                super(2);
                this.f95542g = function3;
                this.f95543h = i;
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
                    C35528Qt0.m87816Z(-1941234439, i, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:481)");
                }
                InterfaceC41563gV2 m114257l = BB5.m114257l(InterfaceC41563gV2.f82354b0, 0.0f, 1, null);
                Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> function3 = this.f95542g;
                int i2 = ((this.f95543h << 9) & 7168) | 6;
                interfaceC32720Et0.mo89638F(-483455358);
                int i3 = i2 >> 3;
                InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et0, (i3 & 112) | (i3 & 14));
                interfaceC32720Et0.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114257l);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25600a(C44901m71 c44901m71, boolean z, int i, long j, InterfaceC42444hy5 interfaceC42444hy5, long j2, long j3, float f, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, ZC0 zc0, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3) {
            super(3);
            this.f95513g = c44901m71;
            this.f95514h = z;
            this.f95515i = i;
            this.f95516j = j;
            this.f95517k = interfaceC42444hy5;
            this.f95518l = j2;
            this.f95519m = j3;
            this.f95520n = f;
            this.f95521o = function2;
            this.f95522p = zc0;
            this.f95523q = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41875h10 interfaceC41875h10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC41875h10, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r34v0, types: [Et0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r5v20 */
        public final void invoke(InterfaceC41875h10 BoxWithConstraints, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int i2;
            Set of;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 14) == 0) {
                i2 = (interfaceC32720Et0.mo89539n(BoxWithConstraints) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(816674999, i, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:398)");
            }
            long mo35389b = BoxWithConstraints.mo35389b();
            if (C44228kz0.m28067j(mo35389b)) {
                float f = -C44228kz0.m28063n(mo35389b);
                boolean z = interfaceC32720Et0.mo89572c(C42399hu0.m35607l()) == EnumC47065pm2.Rtl;
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                InterfaceC41563gV2 m14065k = C48699sX5.m14065k(c20912a, this.f95513g.m26324c(), EnumC32768Ey3.Horizontal, this.f95514h, z, null, 16, null);
                C49292tX5<EnumC46087o71> m26324c = this.f95513g.m26324c();
                of = SetsKt__SetsKt.setOf((Object[]) new EnumC46087o71[]{EnumC46087o71.Closed, EnumC46087o71.Open});
                Float valueOf = Float.valueOf(f);
                Float valueOf2 = Float.valueOf(0.0f);
                interfaceC32720Et0.mo89638F(511388516);
                boolean mo89539n = interfaceC32720Et0.mo89539n(valueOf) | interfaceC32720Et0.mo89539n(valueOf2);
                Object mo89635G = interfaceC32720Et0.mo89635G();
                if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new C25601a(f, 0.0f);
                    interfaceC32720Et0.mo89503z(mo89635G);
                }
                interfaceC32720Et0.mo89605Q();
                InterfaceC41563gV2 m14067i = C48699sX5.m14067i(m14065k, m26324c, of, null, mo89635G, 4, null);
                C44901m71 c44901m71 = this.f95513g;
                int i3 = this.f95515i;
                long j = this.f95516j;
                InterfaceC42444hy5 interfaceC42444hy5 = this.f95517k;
                long j2 = this.f95518l;
                long j3 = this.f95519m;
                float f2 = this.f95520n;
                Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f95521o;
                boolean z2 = this.f95514h;
                ZC0 zc0 = this.f95522p;
                Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> function3 = this.f95523q;
                interfaceC32720Et0.mo89638F(733328855);
                InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
                InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m14067i);
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
                interfaceC32720Et0.mo89638F(733328855);
                InterfaceC51579xO2 m44729h2 = C39504d10.m44729h(c4361a.m99132n(), false, interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(c20912a);
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
                C38680bf6.m64191b(m64192a2, m44729h2, c0757a.m113412d());
                C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
                C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
                C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
                interfaceC32720Et0.mo89530q();
                m115273a2.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89638F(2058660585);
                function2.invoke(interfaceC32720Et0, Integer.valueOf((i3 >> 27) & 14));
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89563f();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                boolean m26323d = c44901m71.m26323d();
                C25603b c25603b = new C25603b(z2, c44901m71, zc0);
                Float valueOf3 = Float.valueOf(f);
                Float valueOf4 = Float.valueOf(0.0f);
                interfaceC32720Et0.mo89638F(1618982084);
                boolean mo89539n2 = interfaceC32720Et0.mo89539n(valueOf3) | interfaceC32720Et0.mo89539n(valueOf4) | interfaceC32720Et0.mo89539n(c44901m71);
                Object mo89635G2 = interfaceC32720Et0.mo89635G();
                if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G2 = new C25605c(f, 0.0f, c44901m71);
                    interfaceC32720Et0.mo89503z(mo89635G2);
                }
                interfaceC32720Et0.mo89605Q();
                C44308l71.m27839b(m26323d, c25603b, mo89635G2, j, interfaceC32720Et0, (i3 >> 15) & 7168);
                String m17501a = C47469qS5.m17501a(C45690nS5.f99991a.m23660e(), interfaceC32720Et0, 6);
                InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                InterfaceC41563gV2 m114244y = BB5.m114244y(c20912a, interfaceC41273g013.mo3398w(C44228kz0.m28061p(mo35389b)), interfaceC41273g013.mo3398w(C44228kz0.m28062o(mo35389b)), interfaceC41273g013.mo3398w(C44228kz0.m28063n(mo35389b)), interfaceC41273g013.mo3398w(C44228kz0.m28064m(mo35389b)));
                interfaceC32720Et0.mo89638F(1157296644);
                boolean mo89539n3 = interfaceC32720Et0.mo89539n(c44901m71);
                Object mo89635G3 = interfaceC32720Et0.mo89635G();
                if (mo89539n3 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G3 = new C25606d(c44901m71);
                    interfaceC32720Et0.mo89503z(mo89635G3);
                }
                interfaceC32720Et0.mo89605Q();
                int i4 = i3 >> 12;
                NV5.m93838a(C41198fs5.m40620b(ND3.m94180m(C32822Fe3.m106817a(m114244y, (Function1) mo89635G3), 0.0f, 0.0f, C44308l71.f95510a, 0.0f, 11, null), false, new C25607e(m17501a, c44901m71, zc0), 1, null), interfaceC42444hy5, j2, j3, null, f2, C43575jt0.m29791b(interfaceC32720Et0, -1941234439, true, new C25610f(function3, i3)), interfaceC32720Et0, ((i3 >> 9) & 112) | 1572864 | (i4 & 896) | (i4 & 7168) | (458752 & i3), 16);
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89563f();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Drawer shouldn't have infinite width");
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: l71$b */
    /* loaded from: classes.dex */
    public static final class C25611b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> f95544g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f95545h;

        /* renamed from: i */
        public final /* synthetic */ C44901m71 f95546i;

        /* renamed from: j */
        public final /* synthetic */ boolean f95547j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC42444hy5 f95548k;

        /* renamed from: l */
        public final /* synthetic */ float f95549l;

        /* renamed from: m */
        public final /* synthetic */ long f95550m;

        /* renamed from: n */
        public final /* synthetic */ long f95551n;

        /* renamed from: o */
        public final /* synthetic */ long f95552o;

        /* renamed from: p */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f95553p;

        /* renamed from: q */
        public final /* synthetic */ int f95554q;

        /* renamed from: r */
        public final /* synthetic */ int f95555r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25611b(Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC41563gV2 interfaceC41563gV2, C44901m71 c44901m71, boolean z, InterfaceC42444hy5 interfaceC42444hy5, float f, long j, long j2, long j3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f95544g = function3;
            this.f95545h = interfaceC41563gV2;
            this.f95546i = c44901m71;
            this.f95547j = z;
            this.f95548k = interfaceC42444hy5;
            this.f95549l = f;
            this.f95550m = j;
            this.f95551n = j2;
            this.f95552o = j3;
            this.f95553p = function2;
            this.f95554q = i;
            this.f95555r = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C44308l71.m27840a(this.f95544g, this.f95545h, this.f95546i, this.f95547j, this.f95548k, this.f95549l, this.f95550m, this.f95551n, this.f95552o, this.f95553p, interfaceC32720Et0, C47127ps4.m18626a(this.f95554q | 1), this.f95555r);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: l71$c */
    /* loaded from: classes.dex */
    public static final class C25612c extends Lambda implements Function1<I61, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f95556g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Float> f95557h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25612c(long j, Function0<Float> function0) {
            super(1);
            this.f95556g = j;
            this.f95557h = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(I61 i61) {
            invoke2(i61);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(I61 Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            I61.m102945z0(Canvas, this.f95556g, 0L, 0L, this.f95557h.invoke().floatValue(), null, null, 0, 118, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: l71$d */
    /* loaded from: classes.dex */
    public static final class C25613d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f95558g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f95559h;

        /* renamed from: i */
        public final /* synthetic */ Function0<Float> f95560i;

        /* renamed from: j */
        public final /* synthetic */ long f95561j;

        /* renamed from: k */
        public final /* synthetic */ int f95562k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25613d(boolean z, Function0<Unit> function0, Function0<Float> function02, long j, int i) {
            super(2);
            this.f95558g = z;
            this.f95559h = function0;
            this.f95560i = function02;
            this.f95561j = j;
            this.f95562k = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C44308l71.m27839b(this.f95558g, this.f95559h, this.f95560i, this.f95561j, interfaceC32720Et0, C47127ps4.m18626a(this.f95562k | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", m28418f = "Drawer.kt", m28417i = {}, m28416l = {687}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: l71$e */
    /* loaded from: classes.dex */
    public static final class C25614e extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f95563h;

        /* renamed from: i */
        public /* synthetic */ Object f95564i;

        /* renamed from: j */
        public final /* synthetic */ Function0<Unit> f95565j;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: l71$e$a */
        /* loaded from: classes.dex */
        public static final class C25615a extends Lambda implements Function1<C32120Ce3, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function0<Unit> f95566g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25615a(Function0<Unit> function0) {
                super(1);
                this.f95566g = function0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C32120Ce3 c32120Ce3) {
                m118304invokek4lQ0M(c32120Ce3.m111935x());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final void m118304invokek4lQ0M(long j) {
                this.f95566g.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25614e(Function0<Unit> function0, Continuation<? super C25614e> continuation) {
            super(2, continuation);
            this.f95565j = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25614e c25614e = new C25614e(this.f95565j, continuation);
            c25614e.f95564i = obj;
            return c25614e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
            return ((C25614e) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f95563h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC49290tX3 interfaceC49290tX3 = (InterfaceC49290tX3) this.f95564i;
                C25615a c25615a = new C25615a(this.f95565j);
                this.f95563h = 1;
                if (KY5.m98768j(interfaceC49290tX3, null, null, null, c25615a, this, 7, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: l71$f */
    /* loaded from: classes.dex */
    public static final class C25616f extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f95567g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f95568h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: l71$f$a */
        /* loaded from: classes.dex */
        public static final class C25617a extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ Function0<Unit> f95569g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25617a(Function0<Unit> function0) {
                super(0);
                this.f95569g = function0;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                this.f95569g.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25616f(String str, Function0<Unit> function0) {
            super(1);
            this.f95567g = str;
            this.f95568h = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            C47128ps5.m18618H(semantics, this.f95567g);
            C47128ps5.m18580s(semantics, null, new C25617a(this.f95568h), 1, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: l71$g */
    /* loaded from: classes.dex */
    public static final class C25618g extends Lambda implements Function1<EnumC46087o71, Boolean> {

        /* renamed from: g */
        public static final C25618g f95570g = new C25618g();

        public C25618g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(EnumC46087o71 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: l71$h */
    /* loaded from: classes.dex */
    public static final class C25619h extends Lambda implements Function0<C44901m71> {

        /* renamed from: g */
        public final /* synthetic */ EnumC46087o71 f95571g;

        /* renamed from: h */
        public final /* synthetic */ Function1<EnumC46087o71, Boolean> f95572h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25619h(EnumC46087o71 enumC46087o71, Function1<? super EnumC46087o71, Boolean> function1) {
            super(0);
            this.f95571g = enumC46087o71;
            this.f95572h = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C44901m71 invoke() {
            return new C44901m71(this.f95571g, this.f95572h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m27840a(Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> drawerContent, InterfaceC41563gV2 interfaceC41563gV2, C44901m71 c44901m71, boolean z, InterfaceC42444hy5 interfaceC42444hy5, float f, long j, long j2, long j3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        Object obj;
        Object obj2;
        int i4;
        boolean z2;
        Object obj3;
        int i5;
        float f2;
        int i6;
        int i7;
        C44901m71 c44901m712;
        KC0 kc0;
        long j4;
        long j5;
        long j6;
        Object obj4;
        float f3;
        long j7;
        long j8;
        Object obj5;
        Object obj6;
        boolean z3;
        int i8;
        Object mo89635G;
        InterfaceC32720Et0 interfaceC32720Et02;
        C44901m71 c44901m713;
        boolean z4;
        InterfaceC42444hy5 interfaceC42444hy52;
        float f4;
        long j9;
        long j10;
        long j11;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC36874Wm5 mo89512w;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(drawerContent, "drawerContent");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1305806945);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (mo89518u.mo89629I(drawerContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = interfaceC41563gV2;
            i3 |= mo89518u.mo89539n(obj) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    obj2 = c44901m71;
                    if (mo89518u.mo89539n(obj2)) {
                        i11 = 256;
                        i3 |= i11;
                    }
                } else {
                    obj2 = c44901m71;
                }
                i11 = 128;
                i3 |= i11;
            } else {
                obj2 = c44901m71;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= mo89518u.mo89536o(z2) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj3 = interfaceC42444hy5;
                        if (mo89518u.mo89539n(obj3)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        obj3 = interfaceC42444hy5;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    obj3 = interfaceC42444hy5;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ImageMetadata.EDGE_MODE;
                } else if ((458752 & i) == 0) {
                    f2 = f;
                    i3 |= mo89518u.mo89533p(f2) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                    if ((i & 3670016) != 0) {
                        if ((i2 & 64) == 0) {
                            i6 = i12;
                            if (mo89518u.mo89524s(j)) {
                                i9 = 1048576;
                                i3 |= i9;
                            }
                        } else {
                            i6 = i12;
                        }
                        i9 = 524288;
                        i3 |= i9;
                    } else {
                        i6 = i12;
                    }
                    if ((i & 29360128) == 0) {
                        i3 |= ((i2 & 128) == 0 && mo89518u.mo89524s(j2)) ? 8388608 : 4194304;
                    }
                    if ((234881024 & i) == 0) {
                        i3 |= ((i2 & 256) == 0 && mo89518u.mo89524s(j3)) ? 67108864 : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i7 = mo89518u.mo89629I(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) != 306783378 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            interfaceC41563gV22 = obj;
                            c44901m713 = obj2;
                            z4 = z2;
                            interfaceC42444hy52 = obj3;
                            f4 = f2;
                            interfaceC32720Et02 = mo89518u;
                            j9 = j;
                            j10 = j2;
                            j11 = j3;
                        } else {
                            mo89518u.mo89626J();
                            if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                                mo89518u.mo89548k();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    j7 = j;
                                    j8 = j2;
                                    j6 = j3;
                                    i8 = (-234881025) & i3;
                                } else {
                                    j7 = j;
                                    j8 = j2;
                                    j6 = j3;
                                    i8 = i3;
                                }
                                obj5 = obj;
                                obj6 = obj2;
                                z3 = z2;
                                obj4 = obj3;
                                f3 = f2;
                            } else {
                                Object obj7 = i6 != 0 ? InterfaceC41563gV2.f82354b0 : obj;
                                if ((i2 & 4) != 0) {
                                    c44901m712 = m27832i(EnumC46087o71.Closed, null, mo89518u, 6, 2);
                                    i3 &= -897;
                                } else {
                                    c44901m712 = obj2;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    kc0 = TM2.f35372a.m83730b(mo89518u, 6).m109566c();
                                    i3 &= -57345;
                                } else {
                                    kc0 = obj3;
                                }
                                float m29274a = i5 != 0 ? C43715k71.f93955a.m29274a() : f2;
                                if ((i2 & 64) != 0) {
                                    j4 = TM2.f35372a.m83731a(mo89518u, 6).m94896n();
                                    i3 &= -3670017;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 128) != 0) {
                                    j5 = C34763Nm0.m93468b(j4, mo89518u, (i3 >> 18) & 14);
                                    i3 &= -29360129;
                                } else {
                                    j5 = j2;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                    obj4 = kc0;
                                    j8 = j5;
                                    j6 = C43715k71.f93955a.m29273b(mo89518u, 6);
                                    obj6 = c44901m712;
                                    f3 = m29274a;
                                    z3 = z2;
                                    j7 = j4;
                                    obj5 = obj7;
                                } else {
                                    j6 = j3;
                                    obj4 = kc0;
                                    f3 = m29274a;
                                    j7 = j4;
                                    j8 = j5;
                                    obj5 = obj7;
                                    obj6 = c44901m712;
                                    z3 = z2;
                                }
                                i8 = i3;
                            }
                            mo89518u.mo89650B();
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(1305806945, i8, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:385)");
                            }
                            mo89518u.mo89638F(773894976);
                            mo89518u.mo89638F(-492369756);
                            mo89635G = mo89518u.mo89635G();
                            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                                C42992iu0 c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, mo89518u));
                                mo89518u.mo89503z(c42992iu0);
                                mo89635G = c42992iu0;
                            }
                            mo89518u.mo89605Q();
                            ZC0 m31665a = ((C42992iu0) mo89635G).m31665a();
                            mo89518u.mo89605Q();
                            InterfaceC41563gV2 interfaceC41563gV23 = obj5;
                            interfaceC32720Et02 = mo89518u;
                            C41282g10.m40327a(BB5.m114257l(obj5, 0.0f, 1, null), null, false, C43575jt0.m29791b(interfaceC32720Et02, 816674999, true, new C25600a(obj6, z3, i8, j6, obj4, j7, j8, f3, content, m31665a, drawerContent)), interfaceC32720Et02, 3072, 6);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            c44901m713 = obj6;
                            z4 = z3;
                            interfaceC42444hy52 = obj4;
                            f4 = f3;
                            j9 = j7;
                            j10 = j8;
                            j11 = j6;
                            interfaceC41563gV22 = interfaceC41563gV23;
                        }
                        mo89512w = interfaceC32720Et02.mo89512w();
                        if (mo89512w == null) {
                            return;
                        }
                        mo89512w.mo20405a(new C25611b(drawerContent, interfaceC41563gV22, c44901m713, z4, interfaceC42444hy52, f4, j9, j10, j11, content, i, i2));
                        return;
                    }
                    i7 = 805306368;
                    i3 |= i7;
                    if ((1533916891 & i3) != 306783378) {
                    }
                    mo89518u.mo89626J();
                    if ((i & 1) == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    i8 = i3;
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                    }
                    mo89518u.mo89638F(773894976);
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    ZC0 m31665a2 = ((C42992iu0) mo89635G).m31665a();
                    mo89518u.mo89605Q();
                    InterfaceC41563gV2 interfaceC41563gV232 = obj5;
                    interfaceC32720Et02 = mo89518u;
                    C41282g10.m40327a(BB5.m114257l(obj5, 0.0f, 1, null), null, false, C43575jt0.m29791b(interfaceC32720Et02, 816674999, true, new C25600a(obj6, z3, i8, j6, obj4, j7, j8, f3, content, m31665a2, drawerContent)), interfaceC32720Et02, 3072, 6);
                    if (C35528Qt0.m87827O()) {
                    }
                    c44901m713 = obj6;
                    z4 = z3;
                    interfaceC42444hy52 = obj4;
                    f4 = f3;
                    j9 = j7;
                    j10 = j8;
                    j11 = j6;
                    interfaceC41563gV22 = interfaceC41563gV232;
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w == null) {
                    }
                }
                f2 = f;
                if ((i & 3670016) != 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((234881024 & i) == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i7;
                if ((1533916891 & i3) != 306783378) {
                }
                mo89518u.mo89626J();
                if ((i & 1) == 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i8 = i3;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                mo89518u.mo89638F(773894976);
                mo89518u.mo89638F(-492369756);
                mo89635G = mo89518u.mo89635G();
                if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                }
                mo89518u.mo89605Q();
                ZC0 m31665a22 = ((C42992iu0) mo89635G).m31665a();
                mo89518u.mo89605Q();
                InterfaceC41563gV2 interfaceC41563gV2322 = obj5;
                interfaceC32720Et02 = mo89518u;
                C41282g10.m40327a(BB5.m114257l(obj5, 0.0f, 1, null), null, false, C43575jt0.m29791b(interfaceC32720Et02, 816674999, true, new C25600a(obj6, z3, i8, j6, obj4, j7, j8, f3, content, m31665a22, drawerContent)), interfaceC32720Et02, 3072, 6);
                if (C35528Qt0.m87827O()) {
                }
                c44901m713 = obj6;
                z4 = z3;
                interfaceC42444hy52 = obj4;
                f4 = f3;
                j9 = j7;
                j10 = j8;
                j11 = j6;
                interfaceC41563gV22 = interfaceC41563gV2322;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w == null) {
                }
            }
            z2 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((i & 3670016) != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((234881024 & i) == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i7;
            if ((1533916891 & i3) != 306783378) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i8 = i3;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89638F(773894976);
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            }
            mo89518u.mo89605Q();
            ZC0 m31665a222 = ((C42992iu0) mo89635G).m31665a();
            mo89518u.mo89605Q();
            InterfaceC41563gV2 interfaceC41563gV23222 = obj5;
            interfaceC32720Et02 = mo89518u;
            C41282g10.m40327a(BB5.m114257l(obj5, 0.0f, 1, null), null, false, C43575jt0.m29791b(interfaceC32720Et02, 816674999, true, new C25600a(obj6, z3, i8, j6, obj4, j7, j8, f3, content, m31665a222, drawerContent)), interfaceC32720Et02, 3072, 6);
            if (C35528Qt0.m87827O()) {
            }
            c44901m713 = obj6;
            z4 = z3;
            interfaceC42444hy52 = obj4;
            f4 = f3;
            j9 = j7;
            j10 = j8;
            j11 = j6;
            interfaceC41563gV22 = interfaceC41563gV23222;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
            }
        }
        obj = interfaceC41563gV2;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((i & 3670016) != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((234881024 & i) == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i7;
        if ((1533916891 & i3) != 306783378) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i8 = i3;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89638F(773894976);
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
        }
        mo89518u.mo89605Q();
        ZC0 m31665a2222 = ((C42992iu0) mo89635G).m31665a();
        mo89518u.mo89605Q();
        InterfaceC41563gV2 interfaceC41563gV232222 = obj5;
        interfaceC32720Et02 = mo89518u;
        C41282g10.m40327a(BB5.m114257l(obj5, 0.0f, 1, null), null, false, C43575jt0.m29791b(interfaceC32720Et02, 816674999, true, new C25600a(obj6, z3, i8, j6, obj4, j7, j8, f3, content, m31665a2222, drawerContent)), interfaceC32720Et02, 3072, 6);
        if (C35528Qt0.m87827O()) {
        }
        c44901m713 = obj6;
        z4 = z3;
        interfaceC42444hy52 = obj4;
        f4 = f3;
        j9 = j7;
        j10 = j8;
        j11 = j6;
        interfaceC41563gV22 = interfaceC41563gV232222;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: b */
    public static final void m27839b(boolean z, Function0<Unit> function0, Function0<Float> function02, long j, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC41563gV2 interfaceC41563gV2;
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1983403750);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89629I(function0)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89629I(function02)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89524s(j)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1983403750, i2, -1, "androidx.compose.material.Scrim (Drawer.kt:677)");
            }
            String m17501a = C47469qS5.m17501a(C45690nS5.f99991a.m23664a(), mo89518u, 6);
            mo89518u.mo89638F(1010554804);
            if (z) {
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                mo89518u.mo89638F(1157296644);
                boolean mo89539n = mo89518u.mo89539n(function0);
                Object mo89635G = mo89518u.mo89635G();
                if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new C25614e(function0, null);
                    mo89518u.mo89503z(mo89635G);
                }
                mo89518u.mo89605Q();
                InterfaceC41563gV2 m1270c = C52840zW5.m1270c(c20912a, function0, (Function2) mo89635G);
                mo89518u.mo89638F(511388516);
                boolean mo89539n2 = mo89518u.mo89539n(m17501a) | mo89518u.mo89539n(function0);
                Object mo89635G2 = mo89518u.mo89635G();
                if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G2 = new C25616f(m17501a, function0);
                    mo89518u.mo89503z(mo89635G2);
                }
                mo89518u.mo89605Q();
                interfaceC41563gV2 = C41198fs5.m40621a(m1270c, true, (Function1) mo89635G2);
            } else {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            mo89518u.mo89605Q();
            InterfaceC41563gV2 mo39266t0 = BB5.m114257l(InterfaceC41563gV2.f82354b0, 0.0f, 1, null).mo39266t0(interfaceC41563gV2);
            C47063pm0 m18747i = C47063pm0.m18747i(j);
            mo89518u.mo89638F(511388516);
            boolean mo89539n3 = mo89518u.mo89539n(m18747i) | mo89518u.mo89539n(function02);
            Object mo89635G3 = mo89518u.mo89635G();
            if (mo89539n3 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G3 = new C25612c(j, function02);
                mo89518u.mo89503z(mo89635G3);
            }
            mo89518u.mo89605Q();
            C48169re0.m15656a(mo39266t0, (Function1) mo89635G3, mo89518u, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C25613d(z, function0, function02, j, i));
        }
    }

    /* renamed from: h */
    public static final float m27833h(float f, float f2, float f3) {
        float coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn((f3 - f) / (f2 - f), 0.0f, 1.0f);
        return coerceIn;
    }

    /* renamed from: i */
    public static final C44901m71 m27832i(EnumC46087o71 initialValue, Function1<? super EnumC46087o71, Boolean> function1, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        interfaceC32720Et0.mo89638F(-1435874229);
        if ((i2 & 2) != 0) {
            function1 = C25618g.f95570g;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1435874229, i, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:328)");
        }
        Object[] objArr = new Object[0];
        InterfaceC35668Ri5<C44901m71, EnumC46087o71> m26321a = C44901m71.f97369b.m26321a(function1);
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n = interfaceC32720Et0.mo89539n(initialValue) | interfaceC32720Et0.mo89539n(function1);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C25619h(initialValue, function1);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C44901m71 c44901m71 = (C44901m71) C35550Qv4.m87571b(objArr, m26321a, null, (Function0) mo89635G, interfaceC32720Et0, 72, 4);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c44901m71;
    }
}
