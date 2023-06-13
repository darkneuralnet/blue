package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
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
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u007f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0012*\u00020\u00112\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aO\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aK\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\"\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d\"\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001d\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d\"\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d\"\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d\"\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, m28432d2 = {"", "targetValue", "Llf;", "animationSpec", "visibilityThreshold", "", "label", "Lkotlin/Function1;", "", "finishedListener", "LsP5;", "e", "(FLlf;FLjava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;", "Lk61;", "c", "(FLlf;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;", "T", "Lvf;", "V", "Lwb6;", "typeConverter", "g", "(Ljava/lang/Object;Lwb6;Llf;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;", "f", "(FLlf;FLkotlin/jvm/functions/Function1;LEt0;II)LsP5;", DateTokenConverter.CONVERTER_KEY, "(FLlf;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;", "LjO5;", C17296a.f69688o, "LjO5;", "defaultAnimation", "b", "dpDefaultSpring", "LxB5;", "sizeDefaultSpring", "LCe3;", "offsetDefaultSpring", "LOs4;", "rectDefaultSpring", "", "intDefaultSpring", "LA52;", "intOffsetDefaultSpring", "LG52;", "h", "intSizeDefaultSpring", "animation-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimateAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,584:1\n36#2:585\n25#2:592\n25#2:599\n25#2:606\n25#2:613\n25#2:620\n1057#3,6:586\n1057#3,6:593\n1057#3,6:600\n1057#3,6:607\n1057#3,6:614\n1057#3,6:621\n76#4:627\n76#4:628\n*S KotlinDebug\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n*L\n72#1:585\n394#1:592\n400#1:599\n401#1:606\n414#1:613\n573#1:620\n72#1:586,6\n394#1:593,6\n400#1:600,6\n401#1:607,6\n414#1:614,6\n573#1:621,6\n402#1:627\n403#1:628\n*E\n"})
/* renamed from: Je */
/* loaded from: classes.dex */
public final class C4171Je {

    /* renamed from: a */
    public static final C43282jO5<Float> f17932a = C26160mf.m25221i(0.0f, 0.0f, null, 7, null);

    /* renamed from: b */
    public static final C43282jO5<C43705k61> f17933b = C26160mf.m25221i(0.0f, 0.0f, C43705k61.m29306d(C32501Du6.m109712a(C43705k61.f93903c)), 3, null);

    /* renamed from: c */
    public static final C43282jO5<C51465xB5> f17934c = C26160mf.m25221i(0.0f, 0.0f, C51465xB5.m5736c(C32501Du6.m109707f(C51465xB5.f117175b)), 3, null);

    /* renamed from: d */
    public static final C43282jO5<C32120Ce3> f17935d = C26160mf.m25221i(0.0f, 0.0f, C32120Ce3.m111955d(C32501Du6.m109708e(C32120Ce3.f4427b)), 3, null);

    /* renamed from: e */
    public static final C43282jO5<C35055Os4> f17936e = C26160mf.m25221i(0.0f, 0.0f, C32501Du6.m109706g(C35055Os4.f27481e), 3, null);

    /* renamed from: f */
    public static final C43282jO5<Integer> f17937f = C26160mf.m25221i(0.0f, 0.0f, Integer.valueOf(C32501Du6.m109711b(IntCompanionObject.INSTANCE)), 3, null);

    /* renamed from: g */
    public static final C43282jO5<A52> f17938g = C26160mf.m25221i(0.0f, 0.0f, A52.m116119b(C32501Du6.m109710c(A52.f130b)), 3, null);

    /* renamed from: h */
    public static final C43282jO5<G52> f17939h = C26160mf.m25221i(0.0f, 0.0f, G52.m105834b(C32501Du6.m109709d(G52.f10893b)), 3, null);

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Je$a */
    /* loaded from: classes.dex */
    public static final class C4172a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC32846Fh0<T> f17940g;

        /* renamed from: h */
        public final /* synthetic */ T f17941h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4172a(InterfaceC32846Fh0<T> interfaceC32846Fh0, T t) {
            super(0);
            this.f17940g = interfaceC32846Fh0;
            this.f17941h = t;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f17940g.mo2349h(this.f17941h);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", m28418f = "AnimateAsState.kt", m28417i = {0}, m28416l = {419}, m28415m = "invokeSuspend", m28414n = {"$this$LaunchedEffect"}, m28413s = {"L$0"})
    /* renamed from: Je$b */
    /* loaded from: classes.dex */
    public static final class C4173b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f17942h;

        /* renamed from: i */
        public int f17943i;

        /* renamed from: j */
        public /* synthetic */ Object f17944j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC32846Fh0<T> f17945k;

        /* renamed from: l */
        public final /* synthetic */ C26560ne<T, V> f17946l;

        /* renamed from: m */
        public final /* synthetic */ InterfaceC48627sP5<InterfaceC25753lf<T>> f17947m;

        /* renamed from: n */
        public final /* synthetic */ InterfaceC48627sP5<Function1<T, Unit>> f17948n;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", m28418f = "AnimateAsState.kt", m28417i = {}, m28416l = {428}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: Je$b$a */
        /* loaded from: classes.dex */
        public static final class C4174a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f17949h;

            /* renamed from: i */
            public final /* synthetic */ T f17950i;

            /* renamed from: j */
            public final /* synthetic */ C26560ne<T, V> f17951j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC48627sP5<InterfaceC25753lf<T>> f17952k;

            /* renamed from: l */
            public final /* synthetic */ InterfaceC48627sP5<Function1<T, Unit>> f17953l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4174a(T t, C26560ne<T, V> c26560ne, InterfaceC48627sP5<? extends InterfaceC25753lf<T>> interfaceC48627sP5, InterfaceC48627sP5<? extends Function1<? super T, Unit>> interfaceC48627sP52, Continuation<? super C4174a> continuation) {
                super(2, continuation);
                this.f17950i = t;
                this.f17951j = c26560ne;
                this.f17952k = interfaceC48627sP5;
                this.f17953l = interfaceC48627sP52;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C4174a(this.f17950i, this.f17951j, this.f17952k, this.f17953l, continuation);
            }

            /* renamed from: invoke */
            public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C4174a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f17949h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(this.f17950i, this.f17951j.m23387l())) {
                        C26560ne<T, V> c26560ne = this.f17951j;
                        Object obj2 = this.f17950i;
                        InterfaceC25753lf m100060i = C4171Je.m100060i(this.f17952k);
                        this.f17949h = 1;
                        if (C26560ne.m23393f(c26560ne, obj2, m100060i, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                Function1 m100061h = C4171Je.m100061h(this.f17953l);
                if (m100061h != null) {
                    m100061h.invoke(this.f17951j.m23385n());
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return invoke2(zc0, continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4173b(InterfaceC32846Fh0<T> interfaceC32846Fh0, C26560ne<T, V> c26560ne, InterfaceC48627sP5<? extends InterfaceC25753lf<T>> interfaceC48627sP5, InterfaceC48627sP5<? extends Function1<? super T, Unit>> interfaceC48627sP52, Continuation<? super C4173b> continuation) {
            super(2, continuation);
            this.f17945k = interfaceC32846Fh0;
            this.f17946l = c26560ne;
            this.f17947m = interfaceC48627sP5;
            this.f17948n = interfaceC48627sP52;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C4173b c4173b = new C4173b(this.f17945k, this.f17946l, this.f17947m, this.f17948n, continuation);
            c4173b.f17944j = obj;
            return c4173b;
        }

        /* renamed from: invoke */
        public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C4173b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0043 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0041 -> B:33:0x0044). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            C4173b c4173b;
            ZC0 zc0;
            InterfaceC34952Oh0 interfaceC34952Oh0;
            Object mo31286a;
            Object obj2;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f17943i;
            if (i != 0) {
                if (i == 1) {
                    interfaceC34952Oh0 = (InterfaceC34952Oh0) this.f17942h;
                    zc0 = (ZC0) this.f17944j;
                    ResultKt.throwOnFailure(obj);
                    mo31286a = obj;
                    c4173b = this;
                    if (((Boolean) mo31286a).booleanValue()) {
                        Object next = interfaceC34952Oh0.next();
                        Object m88184f = C35420Qh0.m88184f(c4173b.f17945k.mo28254l());
                        if (m88184f == null) {
                            obj2 = next;
                        } else {
                            obj2 = m88184f;
                        }
                        Z30.m73800d(zc0, null, null, new C4174a(obj2, c4173b.f17946l, c4173b.f17947m, c4173b.f17948n, null), 3, null);
                        c4173b.f17944j = zc0;
                        c4173b.f17942h = interfaceC34952Oh0;
                        c4173b.f17943i = 1;
                        mo31286a = interfaceC34952Oh0.mo31286a(c4173b);
                        if (mo31286a == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) mo31286a).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC34952Oh0 it = this.f17945k.iterator();
                c4173b = this;
                zc0 = (ZC0) this.f17944j;
                interfaceC34952Oh0 = it;
                c4173b.f17944j = zc0;
                c4173b.f17942h = interfaceC34952Oh0;
                c4173b.f17943i = 1;
                mo31286a = interfaceC34952Oh0.mo31286a(c4173b);
                if (mo31286a == coroutine_suspended) {
                }
                if (((Boolean) mo31286a).booleanValue()) {
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, continuation);
        }
    }

    static {
    }

    /* renamed from: c */
    public static final InterfaceC48627sP5<C43705k61> m100066c(float f, InterfaceC25753lf<C43705k61> interfaceC25753lf, String str, Function1<? super C43705k61, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        C43282jO5<C43705k61> c43282jO5;
        String str2;
        Function1<? super C43705k61, Unit> function12;
        interfaceC32720Et0.mo89638F(-1407150062);
        if ((i2 & 2) != 0) {
            c43282jO5 = f17933b;
        } else {
            c43282jO5 = interfaceC25753lf;
        }
        if ((i2 & 4) != 0) {
            str2 = "DpAnimation";
        } else {
            str2 = str;
        }
        if ((i2 & 8) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1407150062, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:108)");
        }
        int i3 = i << 6;
        InterfaceC48627sP5<C43705k61> m100062g = m100062g(C43705k61.m29306d(f), C37082Xj6.m76523b(C43705k61.f93903c), c43282jO5, null, str2, function12, interfaceC32720Et0, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES), 8);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m100062g;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: d */
    public static final /* synthetic */ InterfaceC48627sP5 m100065d(float f, InterfaceC25753lf interfaceC25753lf, Function1 function1, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        interfaceC32720Et0.mo89638F(704104481);
        if ((i2 & 2) != 0) {
            interfaceC25753lf = f17933b;
        }
        InterfaceC25753lf interfaceC25753lf2 = interfaceC25753lf;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(704104481, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:458)");
        }
        InterfaceC48627sP5 m100062g = m100062g(C43705k61.m29306d(f), C37082Xj6.m76523b(C43705k61.f93903c), interfaceC25753lf2, null, null, function12, interfaceC32720Et0, (i & 14) | ((i << 3) & 896) | ((i << 9) & ImageMetadata.JPEG_GPS_COORDINATES), 24);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m100062g;
    }

    /* renamed from: e */
    public static final InterfaceC48627sP5<Float> m100064e(float f, InterfaceC25753lf<Float> interfaceC25753lf, float f2, String str, Function1<? super Float, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC25753lf<Float> interfaceC25753lf2;
        float f3;
        String str2;
        Function1<? super Float, Unit> function12;
        interfaceC32720Et0.mo89638F(668842840);
        if ((i2 & 2) != 0) {
            interfaceC25753lf2 = f17932a;
        } else {
            interfaceC25753lf2 = interfaceC25753lf;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.01f;
        } else {
            f3 = f2;
        }
        if ((i2 & 8) != 0) {
            str2 = "FloatAnimation";
        } else {
            str2 = str;
        }
        if ((i2 & 16) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(668842840, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:62)");
        }
        interfaceC32720Et0.mo89638F(841393662);
        if (interfaceC25753lf2 == f17932a) {
            Float valueOf = Float.valueOf(f3);
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(valueOf);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = C26160mf.m25221i(0.0f, 0.0f, Float.valueOf(f3), 3, null);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            interfaceC25753lf2 = (InterfaceC25753lf) mo89635G;
        }
        interfaceC32720Et0.mo89605Q();
        int i3 = i << 3;
        InterfaceC48627sP5<Float> m100062g = m100062g(Float.valueOf(f), C37082Xj6.m76516i(FloatCompanionObject.INSTANCE), interfaceC25753lf2, Float.valueOf(f3), str2, function12, interfaceC32720Et0, (i3 & 7168) | (i & 14) | (57344 & i3) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m100062g;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: f */
    public static final /* synthetic */ InterfaceC48627sP5 m100063f(float f, InterfaceC25753lf interfaceC25753lf, float f2, Function1 function1, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        interfaceC32720Et0.mo89638F(1091643291);
        if ((i2 & 2) != 0) {
            interfaceC25753lf = f17932a;
        }
        InterfaceC25753lf interfaceC25753lf2 = interfaceC25753lf;
        if ((i2 & 4) != 0) {
            f2 = 0.01f;
        }
        float f3 = f2;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1091643291, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:441)");
        }
        InterfaceC48627sP5<Float> m100064e = m100064e(f, interfaceC25753lf2, f3, null, function12, interfaceC32720Et0, (i & 14) | (i & 112) | (i & 896) | ((i << 3) & 57344), 8);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m100064e;
    }

    /* renamed from: g */
    public static final <T, V extends AbstractC29607vf> InterfaceC48627sP5<T> m100062g(T t, InterfaceC51108wb6<T, V> typeConverter, InterfaceC25753lf<T> interfaceC25753lf, T t2, String str, Function1<? super T, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC25753lf<T> interfaceC25753lf2;
        T t3;
        String str2;
        Function1<? super T, Unit> function12;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        interfaceC32720Et0.mo89638F(-1994373980);
        if ((i2 & 4) != 0) {
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = C26160mf.m25221i(0.0f, 0.0f, null, 7, null);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            interfaceC25753lf2 = (InterfaceC25753lf) mo89635G;
        } else {
            interfaceC25753lf2 = interfaceC25753lf;
        }
        if ((i2 & 8) != 0) {
            t3 = null;
        } else {
            t3 = t2;
        }
        if ((i2 & 16) != 0) {
            str2 = "ValueAnimation";
        } else {
            str2 = str;
        }
        if ((i2 & 32) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1994373980, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:390)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G2 == c2012a.m108267a()) {
            mo89635G2 = LM5.m97025e(null, null, 2, null);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        EX2 ex2 = (EX2) mo89635G2;
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G3 = interfaceC32720Et0.mo89635G();
        if (mo89635G3 == c2012a.m108267a()) {
            mo89635G3 = new C26560ne(t, typeConverter, t3, str2);
            interfaceC32720Et0.mo89503z(mo89635G3);
        }
        interfaceC32720Et0.mo89605Q();
        C26560ne c26560ne = (C26560ne) mo89635G3;
        InterfaceC48627sP5 m105193n = GM5.m105193n(function12, interfaceC32720Et0, (i >> 15) & 14);
        if (t3 != null && (interfaceC25753lf2 instanceof C43282jO5)) {
            C43282jO5 c43282jO5 = (C43282jO5) interfaceC25753lf2;
            if (!Intrinsics.areEqual(c43282jO5.m30722h(), t3)) {
                interfaceC25753lf2 = C26160mf.m25222h(c43282jO5.m30724f(), c43282jO5.m30723g(), t3);
            }
        }
        InterfaceC48627sP5 m105193n2 = GM5.m105193n(interfaceC25753lf2, interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G4 = interfaceC32720Et0.mo89635G();
        if (mo89635G4 == c2012a.m108267a()) {
            mo89635G4 = C35186Ph0.m89918b(-1, null, null, 6, null);
            interfaceC32720Et0.mo89503z(mo89635G4);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC32846Fh0 interfaceC32846Fh0 = (InterfaceC32846Fh0) mo89635G4;
        Y91.m75531h(new C4172a(interfaceC32846Fh0, t), interfaceC32720Et0, 0);
        Y91.m75533f(interfaceC32846Fh0, new C4173b(interfaceC32846Fh0, c26560ne, m105193n2, m105193n, null), interfaceC32720Et0, 72);
        InterfaceC48627sP5<T> interfaceC48627sP5 = (InterfaceC48627sP5) ex2.getValue();
        if (interfaceC48627sP5 == null) {
            interfaceC48627sP5 = c26560ne.m23392g();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return interfaceC48627sP5;
    }

    /* renamed from: h */
    public static final <T> Function1<T, Unit> m100061h(InterfaceC48627sP5<? extends Function1<? super T, Unit>> interfaceC48627sP5) {
        return (Function1) ((Function1<? super T, Unit>) interfaceC48627sP5.getValue());
    }

    /* renamed from: i */
    public static final <T> InterfaceC25753lf<T> m100060i(InterfaceC48627sP5<? extends InterfaceC25753lf<T>> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }
}
