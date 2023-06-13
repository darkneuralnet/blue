package p000;

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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002R(\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000ej\n\u0012\u0006\u0012\u0004\u0018\u00010\n`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"LQX2;", "", "R", "LPX2;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", DateTokenConverter.CONVERTER_KEY, "(LPX2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LQX2$a;", "mutator", "", "f", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/animation/core/AtomicReference;", C17296a.f69688o, "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "LSX2;", "b", "LSX2;", "mutex", "<init>", "()V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QX2 */
/* loaded from: classes.dex */
public final class QX2 {

    /* renamed from: a */
    public final AtomicReference<C6791a> f30477a = new AtomicReference<>(null);

    /* renamed from: b */
    public final SX2 f30478b = UX2.m81380b(false, 1, null);

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LQX2$a;", "", LegacyRepairType.OTHER_KEY, "", C17296a.f69688o, "", "b", "LPX2;", "LPX2;", "getPriority", "()LPX2;", "priority", "Lzh2;", "Lzh2;", "getJob", "()Lzh2;", "job", "<init>", "(LPX2;Lzh2;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: QX2$a */
    /* loaded from: classes.dex */
    public static final class C6791a {

        /* renamed from: a */
        public final PX2 f30479a;

        /* renamed from: b */
        public final InterfaceC52943zh2 f30480b;

        public C6791a(PX2 priority, InterfaceC52943zh2 job) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Intrinsics.checkNotNullParameter(job, "job");
            this.f30479a = priority;
            this.f30480b = job;
        }

        /* renamed from: a */
        public final boolean m88428a(C6791a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (this.f30479a.compareTo(other.f30479a) >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void m88427b() {
            InterfaceC52943zh2.C31478a.m550a(this.f30480b, null, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"R", "LZC0;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.animation.core.MutatorMutex$mutate$2", m28418f = "InternalMutatorMutex.kt", m28417i = {0, 0, 1, 1}, m28416l = {171, 119}, m28415m = "invokeSuspend", m28414n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, m28413s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,165:1\n107#2,10:166\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n*L\n117#1:166,10\n*E\n"})
    /* renamed from: QX2$b */
    /* loaded from: classes.dex */
    public static final class C6792b extends SuspendLambda implements Function2<ZC0, Continuation<? super R>, Object> {

        /* renamed from: h */
        public Object f30481h;

        /* renamed from: i */
        public Object f30482i;

        /* renamed from: j */
        public Object f30483j;

        /* renamed from: k */
        public int f30484k;

        /* renamed from: l */
        public /* synthetic */ Object f30485l;

        /* renamed from: m */
        public final /* synthetic */ PX2 f30486m;

        /* renamed from: n */
        public final /* synthetic */ QX2 f30487n;

        /* renamed from: o */
        public final /* synthetic */ Function1<Continuation<? super R>, Object> f30488o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6792b(PX2 px2, QX2 qx2, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super C6792b> continuation) {
            super(2, continuation);
            this.f30486m = px2;
            this.f30487n = qx2;
            this.f30488o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C6792b c6792b = new C6792b(this.f30486m, this.f30487n, this.f30488o, continuation);
            c6792b.f30485l = obj;
            return c6792b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super R> continuation) {
            return ((C6792b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [SX2, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            SX2 sx2;
            Function1 function1;
            C6791a c6791a;
            QX2 qx2;
            C6791a c6791a2;
            Throwable th;
            QX2 qx22;
            SX2 sx22;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f30484k;
            try {
                try {
                    if (r1 != 0) {
                        if (r1 != 1) {
                            if (r1 == 2) {
                                qx22 = (QX2) this.f30482i;
                                sx22 = (SX2) this.f30481h;
                                c6791a2 = (C6791a) this.f30485l;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    C42482i24.m35337a(qx22.f30477a, c6791a2, null);
                                    sx22.mo83451b(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    C42482i24.m35337a(qx22.f30477a, c6791a2, null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        qx2 = (QX2) this.f30483j;
                        function1 = (Function1) this.f30482i;
                        c6791a = (C6791a) this.f30485l;
                        ResultKt.throwOnFailure(obj);
                        sx2 = (SX2) this.f30481h;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        PX2 px2 = this.f30486m;
                        CoroutineContext.Element element = ((ZC0) this.f30485l).mo18342K().get(InterfaceC52943zh2.f122077a0);
                        Intrinsics.checkNotNull(element);
                        C6791a c6791a3 = new C6791a(px2, (InterfaceC52943zh2) element);
                        this.f30487n.m88429f(c6791a3);
                        sx2 = this.f30487n.f30478b;
                        Function1 function12 = this.f30488o;
                        QX2 qx23 = this.f30487n;
                        this.f30485l = c6791a3;
                        this.f30481h = sx2;
                        this.f30482i = function12;
                        this.f30483j = qx23;
                        this.f30484k = 1;
                        if (sx2.mo83452a(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function1 = function12;
                        c6791a = c6791a3;
                        qx2 = qx23;
                    }
                    this.f30485l = c6791a;
                    this.f30481h = sx2;
                    this.f30482i = qx2;
                    this.f30483j = null;
                    this.f30484k = 2;
                    Object invoke = function1.invoke(this);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    qx22 = qx2;
                    sx22 = sx2;
                    obj = invoke;
                    c6791a2 = c6791a;
                    C42482i24.m35337a(qx22.f30477a, c6791a2, null);
                    sx22.mo83451b(null);
                    return obj;
                } catch (Throwable th3) {
                    c6791a2 = c6791a;
                    th = th3;
                    qx22 = qx2;
                    C42482i24.m35337a(qx22.f30477a, c6791a2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.mo83451b(null);
                throw th4;
            }
        }
    }

    /* renamed from: e */
    public static /* synthetic */ Object m88430e(QX2 qx2, PX2 px2, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            px2 = PX2.Default;
        }
        return qx2.m88431d(px2, function1, continuation);
    }

    /* renamed from: d */
    public final <R> Object m88431d(PX2 px2, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        return C37824aD0.m71786e(new C6792b(px2, this, function1, null), continuation);
    }

    /* renamed from: f */
    public final void m88429f(C6791a c6791a) {
        C6791a c6791a2;
        do {
            c6791a2 = this.f30477a.get();
            if (c6791a2 != null && !c6791a.m88428a(c6791a2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C42482i24.m35337a(this.f30477a, c6791a2, c6791a));
        if (c6791a2 != null) {
            c6791a2.m88427b();
        }
    }
}
