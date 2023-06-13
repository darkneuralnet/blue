package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u009b\u0001\u0010\u0014\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a|\u0010\u001c\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00172%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001ar\u0010\u001f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\b\b\u0002\u0010\u0018\u001a\u00020\u00172%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001ax\u0010%\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!2\b\b\u0002\u0010$\u001a\u00020#2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001bH\u0080@ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\\\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u000f\"\b\b\u0002\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u00000\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a<\u0010-\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\u0000\u001a\u0085\u0001\u00100\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010(\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00002\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001bH\u0002\u001a\u0085\u0001\u00102\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010(\u001a\u00020#2\u0006\u00101\u001a\u00020#2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001bH\u0002\"\u0018\u0010.\u001a\u00020\u0000*\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, m28432d2 = {"", "initialValue", "targetValue", "initialVelocity", "Llf;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "velocity", "", "block", "b", "(FFFLlf;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lvf;", "V", "Lwb6;", "typeConverter", DateTokenConverter.CONVERTER_KEY, "(Lwb6;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Llf;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnf;", "", "sequentialAnimation", "Lkotlin/Function1;", "Lkf;", "Lkotlin/ExtensionFunctionType;", "i", "(Lnf;Ljava/lang/Object;Llf;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LjV0;", "g", "(Lnf;LjV0;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lef;", "animation", "", "startTimeNanos", "c", "(Lnf;Lef;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "frameTimeNanos", "onFrame", "k", "(Lef;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TransferTable.COLUMN_STATE, "o", "durationScale", "anim", "m", "playTimeNanos", "l", "Lkotlin/coroutines/CoroutineContext;", "n", "(Lkotlin/coroutines/CoroutineContext;)F", "animation-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
/* renamed from: uW5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49876uW5 {

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lvf;", "V", "Lkf;", "", C17296a.f69688o, "(Lkf;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uW5$a */
    /* loaded from: classes.dex */
    public static final class C29233a extends Lambda implements Function1<C25201kf<T, V>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<T, T, Unit> f112551g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC51108wb6<T, V> f112552h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29233a(Function2<? super T, ? super T, Unit> function2, InterfaceC51108wb6<T, V> interfaceC51108wb6) {
            super(1);
            this.f112551g = function2;
            this.f112552h = interfaceC51108wb6;
        }

        /* renamed from: a */
        public final void m10126a(C25201kf<T, V> animate) {
            Intrinsics.checkNotNullParameter(animate, "$this$animate");
            this.f112551g.invoke(animate.m28697e(), this.f112552h.mo4959b().invoke(animate.m28695g()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            m10126a((C25201kf) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.animation.core.SuspendAnimationKt", m28418f = "SuspendAnimation.kt", m28417i = {0, 0, 0, 0, 1, 1, 1, 1}, m28416l = {239, 278}, m28415m = "animate", m28414n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: uW5$b */
    /* loaded from: classes.dex */
    public static final class C29234b<T, V extends AbstractC29607vf> extends ContinuationImpl {

        /* renamed from: h */
        public Object f112553h;

        /* renamed from: i */
        public Object f112554i;

        /* renamed from: j */
        public Object f112555j;

        /* renamed from: k */
        public Object f112556k;

        /* renamed from: l */
        public /* synthetic */ Object f112557l;

        /* renamed from: m */
        public int f112558m;

        public C29234b(Continuation<? super C29234b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112557l = obj;
            this.f112558m |= Integer.MIN_VALUE;
            return C49876uW5.m10139c(null, null, 0L, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lvf;", "V", "Lkf;", "", C17296a.f69688o, "(Lkf;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uW5$c */
    /* loaded from: classes.dex */
    public static final class C29235c extends Lambda implements Function1 {

        /* renamed from: g */
        public static final C29235c f112559g = new C29235c();

        public C29235c() {
            super(1);
        }

        /* renamed from: a */
        public final void m10125a(C25201kf c25201kf) {
            Intrinsics.checkNotNullParameter(c25201kf, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10125a((C25201kf) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Incorrect field signature: TV; */
    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "Lvf;", "V", "", "it", "", C17296a.f69688o, "(J)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uW5$d */
    /* loaded from: classes.dex */
    public static final class C29236d extends Lambda implements Function1<Long, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<C25201kf<T, V>> f112560g;

        /* renamed from: h */
        public final /* synthetic */ T f112561h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC20082ef<T, V> f112562i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC29607vf f112563j;

        /* renamed from: k */
        public final /* synthetic */ C26565nf<T, V> f112564k;

        /* renamed from: l */
        public final /* synthetic */ float f112565l;

        /* renamed from: m */
        public final /* synthetic */ Function1<C25201kf<T, V>, Unit> f112566m;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "Lvf;", "V", "", "invoke", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: uW5$d$a */
        /* loaded from: classes.dex */
        public static final class C29237a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C26565nf<T, V> f112567g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29237a(C26565nf<T, V> c26565nf) {
                super(0);
                this.f112567g = c26565nf;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f112567g.m23354m(false);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/Ref$ObjectRef<Lkf<TT;TV;>;>;TT;Lef<TT;TV;>;TV;Lnf<TT;TV;>;FLkotlin/jvm/functions/Function1<-Lkf<TT;TV;>;Lkotlin/Unit;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        public C29236d(Ref.ObjectRef objectRef, Object obj, InterfaceC20082ef interfaceC20082ef, AbstractC29607vf abstractC29607vf, C26565nf c26565nf, float f, Function1 function1) {
            super(1);
            this.f112560g = objectRef;
            this.f112561h = obj;
            this.f112562i = interfaceC20082ef;
            this.f112563j = abstractC29607vf;
            this.f112564k = c26565nf;
            this.f112565l = f;
            this.f112566m = function1;
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [T, kf] */
        /* renamed from: a */
        public final void m10124a(long j) {
            Ref.ObjectRef<C25201kf<T, V>> objectRef = this.f112560g;
            ?? c25201kf = new C25201kf(this.f112561h, this.f112562i.mo33858d(), this.f112563j, j, this.f112562i.mo33856f(), j, true, new C29237a(this.f112564k));
            C49876uW5.m10129m(c25201kf, j, this.f112565l, this.f112562i, this.f112564k, this.f112566m);
            objectRef.element = c25201kf;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m10124a(l.longValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "Lvf;", "V", "", "invoke", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uW5$e */
    /* loaded from: classes.dex */
    public static final class C29238e extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ C26565nf<T, V> f112568g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29238e(C26565nf<T, V> c26565nf) {
            super(0);
            this.f112568g = c26565nf;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f112568g.m23354m(false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "Lvf;", "V", "", "it", "", C17296a.f69688o, "(J)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uW5$f */
    /* loaded from: classes.dex */
    public static final class C29239f extends Lambda implements Function1<Long, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<C25201kf<T, V>> f112569g;

        /* renamed from: h */
        public final /* synthetic */ float f112570h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC20082ef<T, V> f112571i;

        /* renamed from: j */
        public final /* synthetic */ C26565nf<T, V> f112572j;

        /* renamed from: k */
        public final /* synthetic */ Function1<C25201kf<T, V>, Unit> f112573k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29239f(Ref.ObjectRef<C25201kf<T, V>> objectRef, float f, InterfaceC20082ef<T, V> interfaceC20082ef, C26565nf<T, V> c26565nf, Function1<? super C25201kf<T, V>, Unit> function1) {
            super(1);
            this.f112569g = objectRef;
            this.f112570h = f;
            this.f112571i = interfaceC20082ef;
            this.f112572j = c26565nf;
            this.f112573k = function1;
        }

        /* renamed from: a */
        public final void m10123a(long j) {
            Object obj = this.f112569g.element;
            Intrinsics.checkNotNull(obj);
            C49876uW5.m10129m((C25201kf) obj, j, this.f112570h, this.f112571i, this.f112572j, this.f112573k);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m10123a(l.longValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lvf;", "V", "Lkf;", "", C17296a.f69688o, "(Lkf;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uW5$g */
    /* loaded from: classes.dex */
    public static final class C29240g extends Lambda implements Function1 {

        /* renamed from: g */
        public static final C29240g f112574g = new C29240g();

        static {
        }

        public C29240g() {
            super(1);
        }

        /* renamed from: a */
        public final void m10122a(C25201kf c25201kf) {
            Intrinsics.checkNotNullParameter(c25201kf, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10122a((C25201kf) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lvf;", "V", "Lkf;", "", C17296a.f69688o, "(Lkf;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uW5$h */
    /* loaded from: classes.dex */
    public static final class C29241h extends Lambda implements Function1 {

        /* renamed from: g */
        public static final C29241h f112575g = new C29241h();

        static {
        }

        public C29241h() {
            super(1);
        }

        /* renamed from: a */
        public final void m10121a(C25201kf c25201kf) {
            Intrinsics.checkNotNullParameter(c25201kf, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10121a((C25201kf) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"R", "T", "Lvf;", "V", "", "it", C17296a.f69688o, "(J)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uW5$i */
    /* loaded from: classes.dex */
    public static final class C29242i extends Lambda implements Function1<Long, R> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Long, R> f112576g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29242i(Function1<? super Long, ? extends R> function1) {
            super(1);
            this.f112576g = function1;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [R, java.lang.Object] */
        /* renamed from: a */
        public final R m10120a(long j) {
            return this.f112576g.invoke(Long.valueOf(j / 1));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Long l) {
            return m10120a(l.longValue());
        }
    }

    /* renamed from: b */
    public static final Object m10140b(float f, float f2, float f3, InterfaceC25753lf<Float> interfaceC25753lf, Function2<? super Float, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m10138d = m10138d(C37082Xj6.m76516i(FloatCompanionObject.INSTANCE), Boxing.boxFloat(f), Boxing.boxFloat(f2), Boxing.boxFloat(f3), interfaceC25753lf, function2, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m10138d == coroutine_suspended) {
            return m10138d;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee A[Catch: CancellationException -> 0x0061, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0061, blocks: (B:16:0x005a, B:31:0x00e1, B:33:0x00ee), top: B:55:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, kf] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, V extends AbstractC29607vf> Object m10139c(C26565nf<T, V> c26565nf, InterfaceC20082ef<T, V> interfaceC20082ef, long j, Function1<? super C25201kf<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        C29234b c29234b;
        C29234b c29234b2;
        Object coroutine_suspended;
        int i;
        Ref.ObjectRef objectRef;
        Function1<? super C25201kf<T, V>, Unit> function12;
        C26565nf<T, V> c26565nf2;
        C25201kf c25201kf;
        C25201kf c25201kf2;
        T t;
        C29239f c29239f;
        Function1<? super C25201kf<T, V>, Unit> function13;
        InterfaceC20082ef<T, V> interfaceC20082ef2;
        C26565nf<T, V> c26565nf3 = c26565nf;
        InterfaceC20082ef<T, V> interfaceC20082ef3 = interfaceC20082ef;
        if (continuation instanceof C29234b) {
            c29234b = (C29234b) continuation;
            int i2 = c29234b.f112558m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29234b.f112558m = i2 - Integer.MIN_VALUE;
                c29234b2 = c29234b;
                Object obj = c29234b2.f112557l;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29234b2.f112558m;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            objectRef = (Ref.ObjectRef) c29234b2.f112556k;
                            function13 = (Function1) c29234b2.f112555j;
                            interfaceC20082ef2 = (InterfaceC20082ef) c29234b2.f112554i;
                            c26565nf2 = (C26565nf) c29234b2.f112553h;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        objectRef = (Ref.ObjectRef) c29234b2.f112556k;
                        function13 = (Function1) c29234b2.f112555j;
                        interfaceC20082ef2 = (InterfaceC20082ef) c29234b2.f112554i;
                        c26565nf2 = (C26565nf) c29234b2.f112553h;
                    }
                    try {
                        ResultKt.throwOnFailure(obj);
                        function12 = function13;
                        interfaceC20082ef3 = interfaceC20082ef2;
                    } catch (CancellationException e) {
                        e = e;
                        c26565nf3 = c26565nf2;
                        c25201kf = (C25201kf) objectRef.element;
                        if (c25201kf != null) {
                            c25201kf.m28691k(false);
                        }
                        c25201kf2 = (C25201kf) objectRef.element;
                        if (c25201kf2 != null || c25201kf2.m28699c() != c26565nf3.m23361e()) {
                            z = false;
                        }
                        if (z) {
                            c26565nf3.m23354m(false);
                        }
                        throw e;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    T mo33857e = interfaceC20082ef3.mo33857e(0L);
                    V mo33855g = interfaceC20082ef3.mo33855g(0L);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        if (j == Long.MIN_VALUE) {
                            C29236d c29236d = new C29236d(objectRef2, mo33857e, interfaceC20082ef, mo33855g, c26565nf, m10128n(c29234b2.getContext()), function1);
                            c29234b2.f112553h = c26565nf3;
                            c29234b2.f112554i = interfaceC20082ef3;
                            function12 = function1;
                            c29234b2.f112555j = function12;
                            c29234b2.f112556k = objectRef2;
                            c29234b2.f112558m = 1;
                            if (m10131k(interfaceC20082ef3, c29236d, c29234b2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            function12 = function1;
                            try {
                                ?? r7 = (T) new C25201kf(mo33857e, interfaceC20082ef.mo33858d(), mo33855g, j, interfaceC20082ef.mo33856f(), j, true, new C29238e(c26565nf3));
                                objectRef2 = objectRef2;
                                m10129m(r7, j, m10128n(c29234b2.getContext()), interfaceC20082ef, c26565nf, function1);
                                objectRef2.element = r7;
                            } catch (CancellationException e2) {
                                e = e2;
                                objectRef2 = objectRef2;
                                objectRef = objectRef2;
                                c25201kf = (C25201kf) objectRef.element;
                                if (c25201kf != null) {
                                }
                                c25201kf2 = (C25201kf) objectRef.element;
                                if (c25201kf2 != null) {
                                }
                                z = false;
                                if (z) {
                                }
                                throw e;
                            }
                        }
                        c26565nf2 = c26565nf3;
                        objectRef = objectRef2;
                    } catch (CancellationException e3) {
                        e = e3;
                    }
                }
                do {
                    t = objectRef.element;
                    Intrinsics.checkNotNull(t);
                    if (!((C25201kf) t).m28694h()) {
                        c29239f = new C29239f(objectRef, m10128n(c29234b2.getContext()), interfaceC20082ef3, c26565nf2, function12);
                        c29234b2.f112553h = c26565nf2;
                        c29234b2.f112554i = interfaceC20082ef3;
                        c29234b2.f112555j = function12;
                        c29234b2.f112556k = objectRef;
                        c29234b2.f112558m = 2;
                    } else {
                        return Unit.INSTANCE;
                    }
                } while (m10131k(interfaceC20082ef3, c29239f, c29234b2) != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        c29234b = new C29234b(continuation);
        c29234b2 = c29234b;
        Object obj2 = c29234b2.f112557l;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29234b2.f112558m;
        boolean z2 = true;
        if (i == 0) {
        }
        do {
            t = objectRef.element;
            Intrinsics.checkNotNull(t);
            if (!((C25201kf) t).m28694h()) {
            }
        } while (m10131k(interfaceC20082ef3, c29239f, c29234b2) != coroutine_suspended);
        return coroutine_suspended;
    }

    /* renamed from: d */
    public static final <T, V extends AbstractC29607vf> Object m10138d(InterfaceC51108wb6<T, V> interfaceC51108wb6, T t, T t2, T t3, InterfaceC25753lf<T> interfaceC25753lf, Function2<? super T, ? super T, Unit> function2, Continuation<? super Unit> continuation) {
        V m6542d;
        Object coroutine_suspended;
        if (t3 == null || (m6542d = interfaceC51108wb6.mo4960a().invoke(t3)) == null) {
            m6542d = C29932wf.m6542d(interfaceC51108wb6.mo4960a().invoke(t));
        }
        Object m10136f = m10136f(new C26565nf(interfaceC51108wb6, t, m6542d, 0L, 0L, false, 56, null), new QY5(interfaceC25753lf, interfaceC51108wb6, t, t2, m6542d), 0L, new C29233a(function2, interfaceC51108wb6), continuation, 2, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m10136f == coroutine_suspended) {
            return m10136f;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m10137e(float f, float f2, float f3, InterfaceC25753lf interfaceC25753lf, Function2 function2, Continuation continuation, int i, Object obj) {
        float f4;
        if ((i & 4) != 0) {
            f4 = 0.0f;
        } else {
            f4 = f3;
        }
        if ((i & 8) != 0) {
            interfaceC25753lf = C26160mf.m25221i(0.0f, 0.0f, null, 7, null);
        }
        return m10140b(f, f2, f4, interfaceC25753lf, function2, continuation);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m10136f(C26565nf c26565nf, InterfaceC20082ef interfaceC20082ef, long j, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            function1 = C29235c.f112559g;
        }
        return m10139c(c26565nf, interfaceC20082ef, j2, function1, continuation);
    }

    /* renamed from: g */
    public static final <T, V extends AbstractC29607vf> Object m10135g(C26565nf<T, V> c26565nf, InterfaceC43340jV0<T> interfaceC43340jV0, boolean z, Function1<? super C25201kf<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        long j;
        Object coroutine_suspended;
        C42747iV0 c42747iV0 = new C42747iV0(interfaceC43340jV0, c26565nf.m23360f(), c26565nf.getValue(), c26565nf.m23358i());
        if (z) {
            j = c26565nf.m23361e();
        } else {
            j = Long.MIN_VALUE;
        }
        Object m10139c = m10139c(c26565nf, c42747iV0, j, function1, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m10139c == coroutine_suspended) {
            return m10139c;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static /* synthetic */ Object m10134h(C26565nf c26565nf, InterfaceC43340jV0 interfaceC43340jV0, boolean z, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = C29240g.f112574g;
        }
        return m10135g(c26565nf, interfaceC43340jV0, z, function1, continuation);
    }

    /* renamed from: i */
    public static final <T, V extends AbstractC29607vf> Object m10133i(C26565nf<T, V> c26565nf, T t, InterfaceC25753lf<T> interfaceC25753lf, boolean z, Function1<? super C25201kf<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        long j;
        Object coroutine_suspended;
        QY5 qy5 = new QY5(interfaceC25753lf, c26565nf.m23360f(), c26565nf.getValue(), t, c26565nf.m23358i());
        if (z) {
            j = c26565nf.m23361e();
        } else {
            j = Long.MIN_VALUE;
        }
        Object m10139c = m10139c(c26565nf, qy5, j, function1, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m10139c == coroutine_suspended) {
            return m10139c;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static /* synthetic */ Object m10132j(C26565nf c26565nf, Object obj, InterfaceC25753lf interfaceC25753lf, boolean z, Function1 function1, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            interfaceC25753lf = C26160mf.m25221i(0.0f, 0.0f, null, 7, null);
        }
        InterfaceC25753lf interfaceC25753lf2 = interfaceC25753lf;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = C29241h.f112575g;
        }
        return m10133i(c26565nf, obj, interfaceC25753lf2, z2, function1, continuation);
    }

    /* renamed from: k */
    public static final <R, T, V extends AbstractC29607vf> Object m10131k(InterfaceC20082ef<T, V> interfaceC20082ef, Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        if (interfaceC20082ef.mo33860a()) {
            return H12.m104498a(function1, continuation);
        }
        return JV2.m100318b(new C29242i(function1), continuation);
    }

    /* renamed from: l */
    public static final <T, V extends AbstractC29607vf> void m10130l(C25201kf<T, V> c25201kf, long j, long j2, InterfaceC20082ef<T, V> interfaceC20082ef, C26565nf<T, V> c26565nf, Function1<? super C25201kf<T, V>, Unit> function1) {
        c25201kf.m28692j(j);
        c25201kf.m28690l(interfaceC20082ef.mo33857e(j2));
        c25201kf.m28689m(interfaceC20082ef.mo33855g(j2));
        if (interfaceC20082ef.m42661b(j2)) {
            c25201kf.m28693i(c25201kf.m28699c());
            c25201kf.m28691k(false);
        }
        m10127o(c25201kf, c26565nf);
        function1.invoke(c25201kf);
    }

    /* renamed from: m */
    public static final <T, V extends AbstractC29607vf> void m10129m(C25201kf<T, V> c25201kf, long j, float f, InterfaceC20082ef<T, V> interfaceC20082ef, C26565nf<T, V> c26565nf, Function1<? super C25201kf<T, V>, Unit> function1) {
        boolean z;
        long m28698d;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m28698d = interfaceC20082ef.mo33859c();
        } else {
            m28698d = ((float) (j - c25201kf.m28698d())) / f;
        }
        m10130l(c25201kf, j, m28698d, interfaceC20082ef, c26565nf, function1);
    }

    /* renamed from: n */
    public static final float m10128n(CoroutineContext coroutineContext) {
        float f;
        boolean z;
        Intrinsics.checkNotNullParameter(coroutineContext, "<this>");
        PV2 pv2 = (PV2) coroutineContext.get(PV2.f28583d0);
        if (pv2 != null) {
            f = pv2.mo40807I();
        } else {
            f = 1.0f;
        }
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return f;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: o */
    public static final <T, V extends AbstractC29607vf> void m10127o(C25201kf<T, V> c25201kf, C26565nf<T, V> state) {
        Intrinsics.checkNotNullParameter(c25201kf, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        state.m23353n(c25201kf.m28697e());
        C29932wf.m6543c(state.m23358i(), c25201kf.m28695g());
        state.m23356k(c25201kf.m28700b());
        state.m23355l(c25201kf.m28699c());
        state.m23354m(c25201kf.m28694h());
    }
}
