package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u001a6\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¨\u0006\u0010"}, m28432d2 = {"", "initial", "LXp5;", C17296a.f69688o, "(ILEt0;II)LXp5;", "LgV2;", TransferTable.COLUMN_STATE, "", "enabled", "Lcu1;", "flingBehavior", "reverseScrolling", "c", "isScrollable", "isVertical", "b", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,410:1\n36#2:411\n1114#3,6:412\n135#4:418\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n72#1:411\n72#1:412,6\n317#1:418\n*E\n"})
/* renamed from: Up5 */
/* loaded from: classes.dex */
public final class C36433Up5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Up5$a */
    /* loaded from: classes.dex */
    public static final class C8454a extends Lambda implements Function0<C37135Xp5> {

        /* renamed from: g */
        public final /* synthetic */ int f38062g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8454a(int i) {
            super(0);
            this.f38062g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C37135Xp5 invoke() {
            return new C37135Xp5(this.f38062g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n1#1,170:1\n318#2,7:171\n*E\n"})
    /* renamed from: Up5$b */
    /* loaded from: classes.dex */
    public static final class C8455b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C37135Xp5 f38063g;

        /* renamed from: h */
        public final /* synthetic */ boolean f38064h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC39436cu1 f38065i;

        /* renamed from: j */
        public final /* synthetic */ boolean f38066j;

        /* renamed from: k */
        public final /* synthetic */ boolean f38067k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8455b(C37135Xp5 c37135Xp5, boolean z, InterfaceC39436cu1 interfaceC39436cu1, boolean z2, boolean z3) {
            super(1);
            this.f38063g = c37135Xp5;
            this.f38064h = z;
            this.f38065i = interfaceC39436cu1;
            this.f38066j = z2;
            this.f38067k = z3;
        }

        /* renamed from: a */
        public final void m80785a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("scroll");
            s42.m86038a().m104824a(TransferTable.COLUMN_STATE, this.f38063g);
            s42.m86038a().m104824a("reverseScrolling", Boolean.valueOf(this.f38064h));
            s42.m86038a().m104824a("flingBehavior", this.f38065i);
            s42.m86038a().m104824a("isScrollable", Boolean.valueOf(this.f38066j));
            s42.m86038a().m104824a("isVertical", Boolean.valueOf(this.f38067k));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m80785a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt$scroll$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,410:1\n474#2,4:411\n478#2,2:419\n482#2:425\n25#3:415\n1114#4,3:416\n1117#4,3:422\n474#5:421\n76#6:426\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt$scroll$2\n*L\n267#1:411,4\n267#1:419,2\n267#1:425\n267#1:415\n267#1:416,3\n267#1:422,3\n267#1:421\n299#1:426\n*E\n"})
    /* renamed from: Up5$c */
    /* loaded from: classes.dex */
    public static final class C8456c extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ boolean f38068g;

        /* renamed from: h */
        public final /* synthetic */ boolean f38069h;

        /* renamed from: i */
        public final /* synthetic */ C37135Xp5 f38070i;

        /* renamed from: j */
        public final /* synthetic */ boolean f38071j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC39436cu1 f38072k;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Up5$c$a */
        /* loaded from: classes.dex */
        public static final class C8457a extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ boolean f38073g;

            /* renamed from: h */
            public final /* synthetic */ boolean f38074h;

            /* renamed from: i */
            public final /* synthetic */ boolean f38075i;

            /* renamed from: j */
            public final /* synthetic */ C37135Xp5 f38076j;

            /* renamed from: k */
            public final /* synthetic */ ZC0 f38077k;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Up5$c$a$a */
            /* loaded from: classes.dex */
            public static final class C8458a extends Lambda implements Function2<Float, Float, Boolean> {

                /* renamed from: g */
                public final /* synthetic */ ZC0 f38078g;

                /* renamed from: h */
                public final /* synthetic */ boolean f38079h;

                /* renamed from: i */
                public final /* synthetic */ C37135Xp5 f38080i;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", m28418f = "Scroll.kt", m28417i = {}, m28416l = {285, 287}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                /* renamed from: Up5$c$a$a$a */
                /* loaded from: classes.dex */
                public static final class C8459a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                    /* renamed from: h */
                    public int f38081h;

                    /* renamed from: i */
                    public final /* synthetic */ boolean f38082i;

                    /* renamed from: j */
                    public final /* synthetic */ C37135Xp5 f38083j;

                    /* renamed from: k */
                    public final /* synthetic */ float f38084k;

                    /* renamed from: l */
                    public final /* synthetic */ float f38085l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8459a(boolean z, C37135Xp5 c37135Xp5, float f, float f2, Continuation<? super C8459a> continuation) {
                        super(2, continuation);
                        this.f38082i = z;
                        this.f38083j = c37135Xp5;
                        this.f38084k = f;
                        this.f38085l = f2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C8459a(this.f38082i, this.f38083j, this.f38084k, this.f38085l, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                        return ((C8459a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f38081h;
                        if (i != 0) {
                            if (i != 1 && i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        } else {
                            ResultKt.throwOnFailure(obj);
                            if (this.f38082i) {
                                C37135Xp5 c37135Xp5 = this.f38083j;
                                Intrinsics.checkNotNull(c37135Xp5, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                float f = this.f38084k;
                                this.f38081h = 1;
                                if (C36199Tp5.m82952b(c37135Xp5, f, null, this, 2, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                C37135Xp5 c37135Xp52 = this.f38083j;
                                Intrinsics.checkNotNull(c37135Xp52, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                float f2 = this.f38085l;
                                this.f38081h = 2;
                                if (C36199Tp5.m82952b(c37135Xp52, f2, null, this, 2, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8458a(ZC0 zc0, boolean z, C37135Xp5 c37135Xp5) {
                    super(2);
                    this.f38078g = zc0;
                    this.f38079h = z;
                    this.f38080i = c37135Xp5;
                }

                /* renamed from: a */
                public final Boolean m80783a(float f, float f2) {
                    Z30.m73800d(this.f38078g, null, null, new C8459a(this.f38079h, this.f38080i, f2, f, null), 3, null);
                    return Boolean.TRUE;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Boolean invoke(Float f, Float f2) {
                    return m80783a(f.floatValue(), f2.floatValue());
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Up5$c$a$b */
            /* loaded from: classes.dex */
            public static final class C8460b extends Lambda implements Function0<Float> {

                /* renamed from: g */
                public final /* synthetic */ C37135Xp5 f38086g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8460b(C37135Xp5 c37135Xp5) {
                    super(0);
                    this.f38086g = c37135Xp5;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: b */
                public final Float invoke() {
                    return Float.valueOf(this.f38086g.m76237m());
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Up5$c$a$c */
            /* loaded from: classes.dex */
            public static final class C8461c extends Lambda implements Function0<Float> {

                /* renamed from: g */
                public final /* synthetic */ C37135Xp5 f38087g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8461c(C37135Xp5 c37135Xp5) {
                    super(0);
                    this.f38087g = c37135Xp5;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: b */
                public final Float invoke() {
                    return Float.valueOf(this.f38087g.m76238l());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8457a(boolean z, boolean z2, boolean z3, C37135Xp5 c37135Xp5, ZC0 zc0) {
                super(1);
                this.f38073g = z;
                this.f38074h = z2;
                this.f38075i = z3;
                this.f38076j = c37135Xp5;
                this.f38077k = zc0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
                invoke2(interfaceC48906ss5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(InterfaceC48906ss5 semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                C35497Qp5 c35497Qp5 = new C35497Qp5(new C8460b(this.f38076j), new C8461c(this.f38076j), this.f38073g);
                if (this.f38074h) {
                    C47128ps5.m18598a0(semantics, c35497Qp5);
                } else {
                    C47128ps5.m18615K(semantics, c35497Qp5);
                }
                if (this.f38075i) {
                    C47128ps5.m18623C(semantics, null, new C8458a(this.f38077k, this.f38074h, this.f38076j), 1, null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8456c(boolean z, boolean z2, C37135Xp5 c37135Xp5, boolean z3, InterfaceC39436cu1 interfaceC39436cu1) {
            super(3);
            this.f38068g = z;
            this.f38069h = z2;
            this.f38070i = c37135Xp5;
            this.f38071j = z3;
            this.f38072k = interfaceC39436cu1;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m80784a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            EnumC32768Ey3 enumC32768Ey3;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(1478351300);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1478351300, i, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:264)");
            }
            C37369Yp5 c37369Yp5 = C37369Yp5.f47422a;
            DA3 m74176b = c37369Yp5.m74176b(interfaceC32720Et0, 6);
            interfaceC32720Et0.mo89638F(773894976);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                C42992iu0 c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, interfaceC32720Et0));
                interfaceC32720Et0.mo89503z(c42992iu0);
                mo89635G = c42992iu0;
            }
            interfaceC32720Et0.mo89605Q();
            ZC0 m31665a = ((C42992iu0) mo89635G).m31665a();
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m40620b = C41198fs5.m40620b(c20912a, false, new C8457a(this.f38069h, this.f38068g, this.f38071j, this.f38070i, m31665a), 1, null);
            if (this.f38068g) {
                enumC32768Ey3 = EnumC32768Ey3.Vertical;
            } else {
                enumC32768Ey3 = EnumC32768Ey3.Horizontal;
            }
            EnumC32768Ey3 enumC32768Ey32 = enumC32768Ey3;
            InterfaceC41563gV2 m72420j = C37603Zp5.m72420j(c20912a, this.f38070i, enumC32768Ey32, m74176b, this.f38071j, c37369Yp5.m74175c((EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l()), enumC32768Ey32, this.f38069h), this.f38072k, this.f38070i.m76239k());
            InterfaceC41563gV2 mo39266t0 = EA3.m109331a(C35915Sk0.m84932a(m40620b, enumC32768Ey32), m74176b).mo39266t0(m72420j).mo39266t0(new C39400cq5(this.f38070i, this.f38069h, this.f38068g));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return mo39266t0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m80784a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final C37135Xp5 m80790a(int i, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3) {
        interfaceC32720Et0.mo89638F(-1464256199);
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1464256199, i2, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:70)");
        }
        Object[] objArr = new Object[0];
        InterfaceC35668Ri5<C37135Xp5, ?> m76231a = C37135Xp5.f44028i.m76231a();
        Integer valueOf = Integer.valueOf(i);
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(valueOf);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C8454a(i);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C37135Xp5 c37135Xp5 = (C37135Xp5) C35550Qv4.m87571b(objArr, m76231a, null, (Function0) mo89635G, interfaceC32720Et0, 72, 4);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c37135Xp5;
    }

    /* renamed from: b */
    public static final InterfaceC41563gV2 m80789b(InterfaceC41563gV2 interfaceC41563gV2, C37135Xp5 c37135Xp5, boolean z, InterfaceC39436cu1 interfaceC39436cu1, boolean z2, boolean z3) {
        Function1 m99303a;
        if (K32.m99301c()) {
            m99303a = new C8455b(c37135Xp5, z, interfaceC39436cu1, z2, z3);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C8456c(z3, z, c37135Xp5, z2, interfaceC39436cu1));
    }

    /* renamed from: c */
    public static final InterfaceC41563gV2 m80788c(InterfaceC41563gV2 interfaceC41563gV2, C37135Xp5 state, boolean z, InterfaceC39436cu1 interfaceC39436cu1, boolean z2) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return m80789b(interfaceC41563gV2, state, z2, interfaceC39436cu1, z, true);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC41563gV2 m80787d(InterfaceC41563gV2 interfaceC41563gV2, C37135Xp5 c37135Xp5, boolean z, InterfaceC39436cu1 interfaceC39436cu1, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            interfaceC39436cu1 = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return m80788c(interfaceC41563gV2, c37135Xp5, z, interfaceC39436cu1, z2);
    }
}
