package p000;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC52943zh2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJZ\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002R(\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0011j\n\u0012\u0006\u0012\u0004\u0018\u00010\r`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m28432d2 = {"LRX2;", "", "T", "R", "receiver", "LOX2;", "priority", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;LOX2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LRX2$b;", "mutator", "", "e", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/AtomicReference;", C17296a.f69688o, "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "LSX2;", "b", "LSX2;", "mutex", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RX2 */
/* loaded from: classes.dex */
public final class RX2 {

    /* renamed from: a */
    public final AtomicReference<C7188b> f32144a = new AtomicReference<>(null);

    /* renamed from: b */
    public final SX2 f32145b = UX2.m81380b(false, 1, null);

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m28432d2 = {"T", "R", "LZC0;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", m28418f = "MutatorMutex.kt", m28417i = {0, 0, 1, 1}, m28416l = {173, SyslogConstants.LOG_LOCAL4}, m28415m = "invokeSuspend", m28414n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, m28413s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,167:1\n107#2,10:168\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n*L\n158#1:168,10\n*E\n"})
    /* renamed from: RX2$a */
    /* loaded from: classes.dex */
    public static final class C7187a extends SuspendLambda implements Function2<ZC0, Continuation<? super R>, Object> {

        /* renamed from: h */
        public Object f32146h;

        /* renamed from: i */
        public Object f32147i;

        /* renamed from: j */
        public Object f32148j;

        /* renamed from: k */
        public Object f32149k;

        /* renamed from: l */
        public int f32150l;

        /* renamed from: m */
        public /* synthetic */ Object f32151m;

        /* renamed from: n */
        public final /* synthetic */ OX2 f32152n;

        /* renamed from: o */
        public final /* synthetic */ RX2 f32153o;

        /* renamed from: p */
        public final /* synthetic */ Function2<T, Continuation<? super R>, Object> f32154p;

        /* renamed from: q */
        public final /* synthetic */ T f32155q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7187a(OX2 ox2, RX2 rx2, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, T t, Continuation<? super C7187a> continuation) {
            super(2, continuation);
            this.f32152n = ox2;
            this.f32153o = rx2;
            this.f32154p = function2;
            this.f32155q = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C7187a c7187a = new C7187a(this.f32152n, this.f32153o, this.f32154p, this.f32155q, continuation);
            c7187a.f32151m = obj;
            return c7187a;
        }

        public final Object invoke(ZC0 zc0, Continuation<? super R> continuation) {
            return ((C7187a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [SX2, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            SX2 sx2;
            Function2 function2;
            Object obj2;
            C7188b c7188b;
            RX2 rx2;
            C7188b c7188b2;
            Throwable th;
            RX2 rx22;
            SX2 sx22;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f32150l;
            try {
                try {
                    if (r1 != 0) {
                        if (r1 != 1) {
                            if (r1 == 2) {
                                rx22 = (RX2) this.f32147i;
                                sx22 = (SX2) this.f32146h;
                                c7188b2 = (C7188b) this.f32151m;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    C42482i24.m35337a(rx22.f32144a, c7188b2, null);
                                    sx22.mo83451b(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    C42482i24.m35337a(rx22.f32144a, c7188b2, null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rx2 = (RX2) this.f32149k;
                        obj2 = this.f32148j;
                        function2 = (Function2) this.f32147i;
                        c7188b = (C7188b) this.f32151m;
                        ResultKt.throwOnFailure(obj);
                        sx2 = (SX2) this.f32146h;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        OX2 ox2 = this.f32152n;
                        CoroutineContext.Element element = ((ZC0) this.f32151m).mo18342K().get(InterfaceC52943zh2.f122077a0);
                        Intrinsics.checkNotNull(element);
                        C7188b c7188b3 = new C7188b(ox2, (InterfaceC52943zh2) element);
                        this.f32153o.m86634e(c7188b3);
                        sx2 = this.f32153o.f32145b;
                        function2 = this.f32154p;
                        Object obj3 = this.f32155q;
                        RX2 rx23 = this.f32153o;
                        this.f32151m = c7188b3;
                        this.f32146h = sx2;
                        this.f32147i = function2;
                        this.f32148j = obj3;
                        this.f32149k = rx23;
                        this.f32150l = 1;
                        if (sx2.mo83452a(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = obj3;
                        c7188b = c7188b3;
                        rx2 = rx23;
                    }
                    this.f32151m = c7188b;
                    this.f32146h = sx2;
                    this.f32147i = rx2;
                    this.f32148j = null;
                    this.f32149k = null;
                    this.f32150l = 2;
                    Object invoke = function2.invoke(obj2, this);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    rx22 = rx2;
                    sx22 = sx2;
                    obj = invoke;
                    c7188b2 = c7188b;
                    C42482i24.m35337a(rx22.f32144a, c7188b2, null);
                    sx22.mo83451b(null);
                    return obj;
                } catch (Throwable th3) {
                    c7188b2 = c7188b;
                    th = th3;
                    rx22 = rx2;
                    C42482i24.m35337a(rx22.f32144a, c7188b2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.mo83451b(null);
                throw th4;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Object obj) {
            return invoke(zc0, (Continuation) obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LRX2$b;", "", LegacyRepairType.OTHER_KEY, "", C17296a.f69688o, "", "b", "LOX2;", "LOX2;", "getPriority", "()LOX2;", "priority", "Lzh2;", "Lzh2;", "getJob", "()Lzh2;", "job", "<init>", "(LOX2;Lzh2;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: RX2$b */
    /* loaded from: classes.dex */
    public static final class C7188b {

        /* renamed from: a */
        public final OX2 f32156a;

        /* renamed from: b */
        public final InterfaceC52943zh2 f32157b;

        public C7188b(OX2 priority, InterfaceC52943zh2 job) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Intrinsics.checkNotNullParameter(job, "job");
            this.f32156a = priority;
            this.f32157b = job;
        }

        /* renamed from: a */
        public final boolean m86633a(C7188b other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (this.f32156a.compareTo(other.f32156a) >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void m86632b() {
            InterfaceC52943zh2.C31478a.m550a(this.f32157b, null, 1, null);
        }
    }

    static {
    }

    public RX2() {
    }

    /* renamed from: d */
    public final <T, R> Object m86635d(T t, OX2 ox2, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return C37824aD0.m71786e(new C7187a(ox2, this, function2, t, null), continuation);
    }

    /* renamed from: e */
    public final void m86634e(C7188b c7188b) {
        C7188b c7188b2;
        do {
            c7188b2 = this.f32144a.get();
            if (c7188b2 != null && !c7188b.m86633a(c7188b2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C42482i24.m35337a(this.f32144a, c7188b2, c7188b));
        if (c7188b2 != null) {
            c7188b2.m86632b();
        }
    }
}
