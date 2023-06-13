package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.AbstractC29607vf;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010T\u001a\u00028\u0000\u0012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010-\u001a\u00020(¢\u0006\u0004\bU\u0010VB1\b\u0017\u0012\u0006\u0010T\u001a\u00028\u0000\u0012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bU\u0010WJ\u001b\u0010\u0007\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJb\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u000b\u001a\u00028\u00002%\u0010\u000f\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\b\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\rH\u0002Jj\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0016\u001a\u00028\u00002\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\b\b\u0002\u0010\u000b\u001a\u00028\u00002'\b\u0002\u0010\u000f\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\b\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dR#\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R&\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R+\u0010;\u001a\u0002042\u0006\u00105\u001a\u0002048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R+\u0010\u0016\u001a\u00028\u00002\u0006\u00105\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010BR \u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010IR\u0014\u0010K\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010IR\u0016\u0010L\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010IR\u0016\u0010M\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010IR\u0011\u0010\u0006\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bN\u0010>R\u0011\u0010Q\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010S\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bR\u0010>\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, m28432d2 = {"Lne;", "T", "Lvf;", "V", "", "", "value", "i", "(Ljava/lang/Object;F)Lvf;", "Lef;", "animation", "initialVelocity", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "Ljf;", "r", "(Lef;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "j", "targetValue", "Llf;", "animationSpec", "e", "(Ljava/lang/Object;Llf;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LsP5;", "g", "Lwb6;", C17296a.f69688o, "Lwb6;", "m", "()Lwb6;", "typeConverter", "b", "Ljava/lang/Object;", "visibilityThreshold", "", "c", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "Lnf;", DateTokenConverter.CONVERTER_KEY, "Lnf;", "k", "()Lnf;", "internalState", "", "<set-?>", "LEX2;", "q", "()Z", "s", "(Z)V", "isRunning", "f", "l", "()Ljava/lang/Object;", "t", "(Ljava/lang/Object;)V", "LQX2;", "LQX2;", "mutatorMutex", "LjO5;", "LjO5;", "getDefaultSpringSpec$animation_core_release", "()LjO5;", "defaultSpringSpec", "Lvf;", "negativeInfinityBounds", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "n", "p", "()Lvf;", "velocityVector", "o", "velocity", "initialValue", "<init>", "(Ljava/lang/Object;Lwb6;Ljava/lang/Object;Ljava/lang/String;)V", "(Ljava/lang/Object;Lwb6;Ljava/lang/Object;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,477:1\n76#2:478\n102#2,2:479\n76#2:481\n102#2,2:482\n1#3:484\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n96#1:478\n96#1:479,2\n103#1:481\n103#1:482,2\n*E\n"})
/* renamed from: ne */
/* loaded from: classes.dex */
public final class C26560ne<T, V extends AbstractC29607vf> {

    /* renamed from: a */
    public final InterfaceC51108wb6<T, V> f100235a;

    /* renamed from: b */
    public final T f100236b;

    /* renamed from: c */
    public final String f100237c;

    /* renamed from: d */
    public final C26565nf<T, V> f100238d;

    /* renamed from: e */
    public final EX2 f100239e;

    /* renamed from: f */
    public final EX2 f100240f;

    /* renamed from: g */
    public final QX2 f100241g;

    /* renamed from: h */
    public final C43282jO5<T> f100242h;

    /* renamed from: i */
    public final V f100243i;

    /* renamed from: j */
    public final V f100244j;

    /* renamed from: k */
    public V f100245k;

    /* renamed from: l */
    public V f100246l;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "Lvf;", "V", "Ljf;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.animation.core.Animatable$runAnimation$2", m28418f = "Animatable.kt", m28417i = {0, 0}, m28416l = {305}, m28415m = "invokeSuspend", m28414n = {"endState", "clampingNeeded"}, m28413s = {"L$0", "L$1"})
    /* renamed from: ne$a */
    /* loaded from: classes.dex */
    public static final class C26561a extends SuspendLambda implements Function1<Continuation<? super C24979jf<T, V>>, Object> {

        /* renamed from: h */
        public Object f100247h;

        /* renamed from: i */
        public Object f100248i;

        /* renamed from: j */
        public int f100249j;

        /* renamed from: k */
        public final /* synthetic */ C26560ne<T, V> f100250k;

        /* renamed from: l */
        public final /* synthetic */ T f100251l;

        /* renamed from: m */
        public final /* synthetic */ InterfaceC20082ef<T, V> f100252m;

        /* renamed from: n */
        public final /* synthetic */ long f100253n;

        /* renamed from: o */
        public final /* synthetic */ Function1<C26560ne<T, V>, Unit> f100254o;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lvf;", "V", "Lkf;", "", C17296a.f69688o, "(Lkf;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ne$a$a */
        /* loaded from: classes.dex */
        public static final class C26562a extends Lambda implements Function1<C25201kf<T, V>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C26560ne<T, V> f100255g;

            /* renamed from: h */
            public final /* synthetic */ C26565nf<T, V> f100256h;

            /* renamed from: i */
            public final /* synthetic */ Function1<C26560ne<T, V>, Unit> f100257i;

            /* renamed from: j */
            public final /* synthetic */ Ref.BooleanRef f100258j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C26562a(C26560ne<T, V> c26560ne, C26565nf<T, V> c26565nf, Function1<? super C26560ne<T, V>, Unit> function1, Ref.BooleanRef booleanRef) {
                super(1);
                this.f100255g = c26560ne;
                this.f100256h = c26565nf;
                this.f100257i = function1;
                this.f100258j = booleanRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public final void m23377a(C25201kf<T, V> animate) {
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                C49876uW5.m10127o(animate, this.f100255g.m23388k());
                Object m23391h = this.f100255g.m23391h(animate.m28697e());
                if (!Intrinsics.areEqual(m23391h, animate.m28697e())) {
                    this.f100255g.m23388k().m23353n(m23391h);
                    this.f100256h.m23353n(m23391h);
                    Function1<C26560ne<T, V>, Unit> function1 = this.f100257i;
                    if (function1 != null) {
                        function1.invoke(this.f100255g);
                    }
                    animate.m28701a();
                    this.f100258j.element = true;
                    return;
                }
                Function1<C26560ne<T, V>, Unit> function12 = this.f100257i;
                if (function12 != null) {
                    function12.invoke(this.f100255g);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                m23377a((C25201kf) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26561a(C26560ne<T, V> c26560ne, T t, InterfaceC20082ef<T, V> interfaceC20082ef, long j, Function1<? super C26560ne<T, V>, Unit> function1, Continuation<? super C26561a> continuation) {
            super(1, continuation);
            this.f100250k = c26560ne;
            this.f100251l = t;
            this.f100252m = interfaceC20082ef;
            this.f100253n = j;
            this.f100254o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C26561a(this.f100250k, this.f100251l, this.f100252m, this.f100253n, this.f100254o, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Continuation) ((Continuation) obj));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            C26565nf c26565nf;
            Ref.BooleanRef booleanRef;
            EnumC20481ff enumC20481ff;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f100249j;
            try {
                if (i != 0) {
                    if (i == 1) {
                        booleanRef = (Ref.BooleanRef) this.f100248i;
                        c26565nf = (C26565nf) this.f100247h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.f100250k.m23388k().m23352o(this.f100250k.m23386m().mo4960a().invoke(this.f100251l));
                    this.f100250k.m23379t(this.f100252m.mo33856f());
                    this.f100250k.m23380s(true);
                    C26565nf m20694f = C27022of.m20694f(this.f100250k.m23388k(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    InterfaceC20082ef<T, V> interfaceC20082ef = this.f100252m;
                    long j = this.f100253n;
                    C26562a c26562a = new C26562a(this.f100250k, m20694f, this.f100254o, booleanRef2);
                    this.f100247h = m20694f;
                    this.f100248i = booleanRef2;
                    this.f100249j = 1;
                    if (C49876uW5.m10139c(m20694f, interfaceC20082ef, j, c26562a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c26565nf = m20694f;
                    booleanRef = booleanRef2;
                }
                if (booleanRef.element) {
                    enumC20481ff = EnumC20481ff.BoundReached;
                } else {
                    enumC20481ff = EnumC20481ff.Finished;
                }
                this.f100250k.m23389j();
                return new C24979jf(c26565nf, enumC20481ff);
            } catch (CancellationException e) {
                this.f100250k.m23389j();
                throw e;
            }
        }

        public final Object invoke(Continuation<? super C24979jf<T, V>> continuation) {
            return ((C26561a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "Lvf;", "V", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.animation.core.Animatable$snapTo$2", m28418f = "Animatable.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: ne$b */
    /* loaded from: classes.dex */
    public static final class C26563b extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f100259h;

        /* renamed from: i */
        public final /* synthetic */ C26560ne<T, V> f100260i;

        /* renamed from: j */
        public final /* synthetic */ T f100261j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26563b(C26560ne<T, V> c26560ne, T t, Continuation<? super C26563b> continuation) {
            super(1, continuation);
            this.f100260i = c26560ne;
            this.f100261j = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C26563b(this.f100260i, this.f100261j, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> continuation) {
            return invoke2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f100259h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f100260i.m23389j();
                Object m23391h = this.f100260i.m23391h(this.f100261j);
                this.f100260i.m23388k().m23353n(m23391h);
                this.f100260i.m23379t(m23391h);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: invoke */
        public final Object invoke2(Continuation<? super Unit> continuation) {
            return ((C26563b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
    }

    public C26560ne(T t, InterfaceC51108wb6<T, V> typeConverter, T t2, String label) {
        EX2 m97025e;
        EX2 m97025e2;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f100235a = typeConverter;
        this.f100236b = t2;
        this.f100237c = label;
        this.f100238d = new C26565nf<>(typeConverter, t, null, 0L, 0L, false, 60, null);
        m97025e = LM5.m97025e(Boolean.FALSE, null, 2, null);
        this.f100239e = m97025e;
        m97025e2 = LM5.m97025e(t, null, 2, null);
        this.f100240f = m97025e2;
        this.f100241g = new QX2();
        this.f100242h = new C43282jO5<>(0.0f, 0.0f, t2, 3, null);
        V m23390i = m23390i(t, Float.NEGATIVE_INFINITY);
        this.f100243i = m23390i;
        V m23390i2 = m23390i(t, Float.POSITIVE_INFINITY);
        this.f100244j = m23390i2;
        this.f100245k = m23390i;
        this.f100246l = m23390i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static /* synthetic */ Object m23393f(C26560ne c26560ne, Object obj, InterfaceC25753lf interfaceC25753lf, Object obj2, Function1 function1, Continuation continuation, int i, Object obj3) {
        C43282jO5<T> c43282jO5 = interfaceC25753lf;
        if ((i & 2) != 0) {
            c43282jO5 = c26560ne.f100242h;
        }
        InterfaceC25753lf interfaceC25753lf2 = c43282jO5;
        T t = obj2;
        if ((i & 4) != 0) {
            t = c26560ne.m23384o();
        }
        T t2 = t;
        Function1<? super C26560ne<T, V>, Unit> function12 = function1;
        if ((i & 8) != 0) {
            function12 = null;
        }
        return c26560ne.m23394e(obj, interfaceC25753lf2, t2, function12, continuation);
    }

    /* renamed from: e */
    public final Object m23394e(T t, InterfaceC25753lf<T> interfaceC25753lf, T t2, Function1<? super C26560ne<T, V>, Unit> function1, Continuation<? super C24979jf<T, V>> continuation) {
        return m23381r(C22705hf.m36113a(interfaceC25753lf, this.f100235a, m23385n(), t, t2), t2, function1, continuation);
    }

    /* renamed from: g */
    public final InterfaceC48627sP5<T> m23392g() {
        return this.f100238d;
    }

    /* renamed from: h */
    public final T m23391h(T t) {
        float coerceIn;
        if (Intrinsics.areEqual(this.f100245k, this.f100243i) && Intrinsics.areEqual(this.f100246l, this.f100244j)) {
            return t;
        }
        V invoke = this.f100235a.mo4960a().invoke(t);
        int mo8295b = invoke.mo8295b();
        boolean z = false;
        for (int i = 0; i < mo8295b; i++) {
            if (invoke.mo8296a(i) < this.f100245k.mo8296a(i) || invoke.mo8296a(i) > this.f100246l.mo8296a(i)) {
                coerceIn = RangesKt___RangesKt.coerceIn(invoke.mo8296a(i), this.f100245k.mo8296a(i), this.f100246l.mo8296a(i));
                invoke.mo8292e(i, coerceIn);
                z = true;
            }
        }
        if (z) {
            return this.f100235a.mo4959b().invoke(invoke);
        }
        return t;
    }

    /* renamed from: i */
    public final V m23390i(T t, float f) {
        V invoke = this.f100235a.mo4960a().invoke(t);
        int mo8295b = invoke.mo8295b();
        for (int i = 0; i < mo8295b; i++) {
            invoke.mo8292e(i, f);
        }
        return invoke;
    }

    /* renamed from: j */
    public final void m23389j() {
        C26565nf<T, V> c26565nf = this.f100238d;
        c26565nf.m23358i().mo8293d();
        c26565nf.m23355l(Long.MIN_VALUE);
        m23380s(false);
    }

    /* renamed from: k */
    public final C26565nf<T, V> m23388k() {
        return this.f100238d;
    }

    /* renamed from: l */
    public final T m23387l() {
        return this.f100240f.getValue();
    }

    /* renamed from: m */
    public final InterfaceC51108wb6<T, V> m23386m() {
        return this.f100235a;
    }

    /* renamed from: n */
    public final T m23385n() {
        return this.f100238d.getValue();
    }

    /* renamed from: o */
    public final T m23384o() {
        return this.f100235a.mo4959b().invoke(m23383p());
    }

    /* renamed from: p */
    public final V m23383p() {
        return this.f100238d.m23358i();
    }

    /* renamed from: q */
    public final boolean m23382q() {
        return ((Boolean) this.f100239e.getValue()).booleanValue();
    }

    /* renamed from: r */
    public final Object m23381r(InterfaceC20082ef<T, V> interfaceC20082ef, T t, Function1<? super C26560ne<T, V>, Unit> function1, Continuation<? super C24979jf<T, V>> continuation) {
        return QX2.m88430e(this.f100241g, null, new C26561a(this, t, interfaceC20082ef, this.f100238d.m23361e(), function1, null), continuation, 1, null);
    }

    /* renamed from: s */
    public final void m23380s(boolean z) {
        this.f100239e.setValue(Boolean.valueOf(z));
    }

    /* renamed from: t */
    public final void m23379t(T t) {
        this.f100240f.setValue(t);
    }

    /* renamed from: u */
    public final Object m23378u(T t, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m88430e = QX2.m88430e(this.f100241g, null, new C26563b(this, t, null), continuation, 1, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m88430e == coroutine_suspended ? m88430e : Unit.INSTANCE;
    }

    public /* synthetic */ C26560ne(Object obj, InterfaceC51108wb6 interfaceC51108wb6, Object obj2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, interfaceC51108wb6, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ C26560ne(Object obj, InterfaceC51108wb6 interfaceC51108wb6, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, interfaceC51108wb6, (i & 4) != 0 ? null : obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @ReplaceWith(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ C26560ne(Object obj, InterfaceC51108wb6 typeConverter, Object obj2) {
        this(obj, typeConverter, obj2, "Animatable");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
