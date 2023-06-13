package p000;

import ch.qos.logback.core.CoreConstants;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a;\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"LgV2;", "LRn2;", "itemProvider", "Ldo2;", TransferTable.COLUMN_STATE, "LEy3;", "orientation", "", "userScrollEnabled", "reverseScrolling", C17296a.f69688o, "(LgV2;LRn2;Ldo2;LEy3;ZZLEt0;I)LgV2;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,151:1\n474#2,4:152\n478#2,2:160\n482#2:166\n25#3:156\n83#3,3:167\n1114#4,3:157\n1117#4,3:163\n1114#4,6:170\n474#5:162\n*S KotlinDebug\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n*L\n47#1:152,4\n47#1:160,2\n47#1:166\n47#1:156\n49#1:167,3\n47#1:157,3\n47#1:163,3\n49#1:170,6\n47#1:162\n*E\n"})
/* renamed from: fo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41155fo2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fo2$a */
    /* loaded from: classes.dex */
    public static final class C20529a extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Object, Integer> f80713g;

        /* renamed from: h */
        public final /* synthetic */ boolean f80714h;

        /* renamed from: i */
        public final /* synthetic */ C35497Qp5 f80715i;

        /* renamed from: j */
        public final /* synthetic */ Function2<Float, Float, Boolean> f80716j;

        /* renamed from: k */
        public final /* synthetic */ Function1<Integer, Boolean> f80717k;

        /* renamed from: l */
        public final /* synthetic */ C40540em0 f80718l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20529a(Function1<Object, Integer> function1, boolean z, C35497Qp5 c35497Qp5, Function2<? super Float, ? super Float, Boolean> function2, Function1<? super Integer, Boolean> function12, C40540em0 c40540em0) {
            super(1);
            this.f80713g = function1;
            this.f80714h = z;
            this.f80715i = c35497Qp5;
            this.f80716j = function2;
            this.f80717k = function12;
            this.f80718l = c40540em0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            C47128ps5.m18582q(semantics, this.f80713g);
            if (this.f80714h) {
                C47128ps5.m18598a0(semantics, this.f80715i);
            } else {
                C47128ps5.m18615K(semantics, this.f80715i);
            }
            Function2<Float, Float, Boolean> function2 = this.f80716j;
            if (function2 != null) {
                C47128ps5.m18623C(semantics, null, function2, 1, null);
            }
            Function1<Integer, Boolean> function1 = this.f80717k;
            if (function1 != null) {
                C47128ps5.m18621E(semantics, null, function1, 1, null);
            }
            C47128ps5.m18620F(semantics, this.f80718l);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fo2$b */
    /* loaded from: classes.dex */
    public static final class C20530b extends Lambda implements Function0<Float> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC39969do2 f80719g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20530b(InterfaceC39969do2 interfaceC39969do2) {
            super(0);
            this.f80719g = interfaceC39969do2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(this.f80719g.mo42538c());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fo2$c */
    /* loaded from: classes.dex */
    public static final class C20531c extends Lambda implements Function0<Float> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC39969do2 f80720g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC35710Rn2 f80721h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20531c(InterfaceC39969do2 interfaceC39969do2, InterfaceC35710Rn2 interfaceC35710Rn2) {
            super(0);
            this.f80720g = interfaceC39969do2;
            this.f80721h = interfaceC35710Rn2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Float invoke() {
            float mo42538c;
            if (this.f80720g.mo42540a()) {
                mo42538c = this.f80721h.getItemCount() + 1.0f;
            } else {
                mo42538c = this.f80720g.mo42538c();
            }
            return Float.valueOf(mo42538c);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fo2$d */
    /* loaded from: classes.dex */
    public static final class C20532d extends Lambda implements Function1<Object, Integer> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC35710Rn2 f80722g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20532d(InterfaceC35710Rn2 interfaceC35710Rn2) {
            super(1);
            this.f80722g = interfaceC35710Rn2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Object needle) {
            Intrinsics.checkNotNullParameter(needle, "needle");
            int itemCount = this.f80722g.getItemCount();
            int i = 0;
            while (true) {
                if (i >= itemCount) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(this.f80722g.mo15369c(i), needle)) {
                    break;
                } else {
                    i++;
                }
            }
            return Integer.valueOf(i);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fo2$e */
    /* loaded from: classes.dex */
    public static final class C20533e extends Lambda implements Function2<Float, Float, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ boolean f80723g;

        /* renamed from: h */
        public final /* synthetic */ ZC0 f80724h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC39969do2 f80725i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", m28418f = "LazyLayoutSemantics.kt", m28417i = {}, m28416l = {96}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: fo2$e$a */
        /* loaded from: classes.dex */
        public static final class C20534a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f80726h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC39969do2 f80727i;

            /* renamed from: j */
            public final /* synthetic */ float f80728j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20534a(InterfaceC39969do2 interfaceC39969do2, float f, Continuation<? super C20534a> continuation) {
                super(2, continuation);
                this.f80727i = interfaceC39969do2;
                this.f80728j = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C20534a(this.f80727i, this.f80728j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C20534a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f80726h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC39969do2 interfaceC39969do2 = this.f80727i;
                    float f = this.f80728j;
                    this.f80726h = 1;
                    if (interfaceC39969do2.mo42537d(f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20533e(boolean z, ZC0 zc0, InterfaceC39969do2 interfaceC39969do2) {
            super(2);
            this.f80723g = z;
            this.f80724h = zc0;
            this.f80725i = interfaceC39969do2;
        }

        /* renamed from: a */
        public final Boolean m40803a(float f, float f2) {
            if (this.f80723g) {
                f = f2;
            }
            Z30.m73800d(this.f80724h, null, null, new C20534a(this.f80725i, f, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Float f, Float f2) {
            return m40803a(f.floatValue(), f2.floatValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fo2$f */
    /* loaded from: classes.dex */
    public static final class C20535f extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC35710Rn2 f80729g;

        /* renamed from: h */
        public final /* synthetic */ ZC0 f80730h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC39969do2 f80731i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", m28418f = "LazyLayoutSemantics.kt", m28417i = {}, m28416l = {112}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: fo2$f$a */
        /* loaded from: classes.dex */
        public static final class C20536a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f80732h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC39969do2 f80733i;

            /* renamed from: j */
            public final /* synthetic */ int f80734j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20536a(InterfaceC39969do2 interfaceC39969do2, int i, Continuation<? super C20536a> continuation) {
                super(2, continuation);
                this.f80733i = interfaceC39969do2;
                this.f80734j = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C20536a(this.f80733i, this.f80734j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C20536a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f80732h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC39969do2 interfaceC39969do2 = this.f80733i;
                    int i2 = this.f80734j;
                    this.f80732h = 1;
                    if (interfaceC39969do2.mo42539b(i2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20535f(InterfaceC35710Rn2 interfaceC35710Rn2, ZC0 zc0, InterfaceC39969do2 interfaceC39969do2) {
            super(1);
            this.f80729g = interfaceC35710Rn2;
            this.f80730h = zc0;
            this.f80731i = interfaceC39969do2;
        }

        /* renamed from: b */
        public final Boolean m40802b(int i) {
            boolean z;
            if (i >= 0 && i < this.f80729g.getItemCount()) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC35710Rn2 interfaceC35710Rn2 = this.f80729g;
            if (z) {
                Z30.m73800d(this.f80730h, null, null, new C20536a(this.f80731i, i, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i + ", it is out of bounds [0, " + interfaceC35710Rn2.getItemCount() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return m40802b(num.intValue());
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m40806a(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC35710Rn2 itemProvider, InterfaceC39969do2 state, EnumC32768Ey3 orientation, boolean z, boolean z2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        boolean z3;
        C20533e c20533e;
        C20535f c20535f;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        interfaceC32720Et0.mo89638F(290103779);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(290103779, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:39)");
        }
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
        Object[] objArr = {itemProvider, state, orientation, Boolean.valueOf(z)};
        interfaceC32720Et0.mo89638F(-568225417);
        boolean z4 = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z4 |= interfaceC32720Et0.mo89539n(objArr[i2]);
        }
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (z4 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            if (orientation == EnumC32768Ey3.Vertical) {
                z3 = true;
            } else {
                z3 = false;
            }
            C20532d c20532d = new C20532d(itemProvider);
            C35497Qp5 c35497Qp5 = new C35497Qp5(new C20530b(state), new C20531c(state, itemProvider), z2);
            if (z) {
                c20533e = new C20533e(z3, m31665a, state);
            } else {
                c20533e = null;
            }
            if (z) {
                c20535f = new C20535f(itemProvider, m31665a, state);
            } else {
                c20535f = null;
            }
            mo89635G2 = C41198fs5.m40620b(InterfaceC41563gV2.f82354b0, false, new C20529a(c20532d, z3, c35497Qp5, c20533e, c20535f, state.mo42536e()), 1, null);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC41563gV2 mo39266t0 = interfaceC41563gV2.mo39266t0((InterfaceC41563gV2) mo89635G2);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return mo39266t0;
    }
}
