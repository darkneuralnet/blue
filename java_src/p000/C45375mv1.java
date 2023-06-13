package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.LongCompanionObject;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B-\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"Lmv1;", "T", "LoT5;", "Lq0;", "", "cancel", "()V", "", "n", "o", "(J)V", "Lkotlin/coroutines/Continuation;", "h1", "()Lkotlin/coroutines/Continuation;", "i1", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g1", "LEu1;", DateTokenConverter.CONVERTER_KEY, "LEu1;", "flow", "LhT5;", "e", "LhT5;", "subscriber", "", "cancellationRequested", "Z", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(LEu1;LhT5;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-reactive"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: mv1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45375mv1<T> extends AbstractC27449q0<Unit> implements InterfaceC46292oT5 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f99028f = AtomicLongFieldUpdater.newUpdater(C45375mv1.class, "requested");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f99029g = AtomicReferenceFieldUpdater.newUpdater(C45375mv1.class, Object.class, "producer");
    private volatile boolean cancellationRequested;
    @JvmField

    /* renamed from: d */
    public final InterfaceC32730Eu1<T> f99030d;
    @JvmField

    /* renamed from: e */
    public final InterfaceC42141hT5<? super T> f99031e;
    volatile /* synthetic */ Object producer;
    volatile /* synthetic */ long requested;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: mv1$a */
    /* loaded from: classes8.dex */
    public static final class C26290a<T> implements InterfaceC33198Gu1 {

        /* renamed from: b */
        public final /* synthetic */ C45375mv1<T> f99032b;

        public C26290a(C45375mv1<T> c45375mv1) {
            this.f99032b = c45375mv1;
        }

        @Override // p000.InterfaceC33198Gu1
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            Continuation intercepted;
            Object coroutine_suspended;
            Object coroutine_suspended2;
            this.f99032b.f99031e.onNext(t);
            if (C45375mv1.f99028f.decrementAndGet(this.f99032b) <= 0) {
                C45375mv1<T> c45375mv1 = this.f99032b;
                intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
                C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
                c37013Xc0.m76766u();
                c45375mv1.producer = c37013Xc0;
                Object m76770q = c37013Xc0.m76770q();
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (m76770q == coroutine_suspended) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (m76770q == coroutine_suspended2) {
                    return m76770q;
                }
                return Unit.INSTANCE;
            }
            C34018Kh2.m98499m(this.f99032b.mo18342K());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J \u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b¸\u0006\u0000"}, m28432d2 = {"kotlin/coroutines/ContinuationKt$Continuation$1", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "kotlin-stdlib"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: mv1$b */
    /* loaded from: classes8.dex */
    public static final class C26291b implements Continuation<Unit> {

        /* renamed from: b */
        public final /* synthetic */ CoroutineContext f99033b;

        /* renamed from: c */
        public final /* synthetic */ C45375mv1 f99034c;

        public C26291b(CoroutineContext coroutineContext, C45375mv1 c45375mv1) {
            this.f99033b = coroutineContext;
            this.f99034c = c45375mv1;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.f99033b;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            C38061ad0.m70998c(new C26292c(this.f99034c), this.f99034c);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: mv1$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C26292c extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object>, SuspendFunction {
        public C26292c(Object obj) {
            super(1, obj, C45375mv1.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C45375mv1) this.receiver).m24705i1(continuation);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.reactive.FlowSubscription", m28418f = "ReactiveFlow.kt", m28417i = {0}, m28416l = {209}, m28415m = "flowProcessing", m28414n = {"this"}, m28413s = {"L$0"})
    /* renamed from: mv1$d */
    /* loaded from: classes8.dex */
    public static final class C26293d extends ContinuationImpl {

        /* renamed from: h */
        public Object f99035h;

        /* renamed from: i */
        public /* synthetic */ Object f99036i;

        /* renamed from: j */
        public final /* synthetic */ C45375mv1<T> f99037j;

        /* renamed from: k */
        public int f99038k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26293d(C45375mv1<T> c45375mv1, Continuation<? super C26293d> continuation) {
            super(continuation);
            this.f99037j = c45375mv1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f99036i = obj;
            this.f99038k |= Integer.MIN_VALUE;
            return this.f99037j.m24705i1(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45375mv1(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, InterfaceC42141hT5<? super T> interfaceC42141hT5, CoroutineContext coroutineContext) {
        super(coroutineContext, false, true);
        this.f99030d = interfaceC32730Eu1;
        this.f99031e = interfaceC42141hT5;
        this.requested = 0L;
        this.producer = m24706h1();
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
        this.cancellationRequested = true;
        mo552f(null);
    }

    /* renamed from: g1 */
    public final Object m24707g1(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object collect = this.f99030d.collect(new C26290a(this), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : Unit.INSTANCE;
    }

    /* renamed from: h1 */
    public final Continuation<Unit> m24706h1() {
        return new C26291b(mo18342K(), this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|(1:(3:9|10|11)(2:35|36))(4:37|38|39|(1:41)(1:42))|12|13|14|15))|46|6|(0)(0)|12|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        p000.VC0.m80237a(r0.mo18342K(), r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* renamed from: i1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m24705i1(Continuation<? super Unit> continuation) {
        C26293d c26293d;
        Object coroutine_suspended;
        int i;
        C45375mv1<T> c45375mv1;
        if (continuation instanceof C26293d) {
            c26293d = (C26293d) continuation;
            int i2 = c26293d.f99038k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c26293d.f99038k = i2 - Integer.MIN_VALUE;
                Object obj = c26293d.f99036i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c26293d.f99038k;
                if (i == 0) {
                    if (i == 1) {
                        c45375mv1 = (C45375mv1) c26293d.f99035h;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th) {
                            th = th;
                            if (c45375mv1.cancellationRequested) {
                            }
                            try {
                                c45375mv1.f99031e.onError(th);
                            } catch (Throwable th2) {
                                ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
                                VC0.m80237a(c45375mv1.mo18342K(), th);
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        c26293d.f99035h = this;
                        c26293d.f99038k = 1;
                        if (m24707g1(c26293d) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c45375mv1 = this;
                    } catch (Throwable th3) {
                        th = th3;
                        c45375mv1 = this;
                        if (c45375mv1.cancellationRequested || c45375mv1.mo555b() || th != c45375mv1.mo558F()) {
                            c45375mv1.f99031e.onError(th);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c45375mv1.f99031e.onComplete();
                return Unit.INSTANCE;
            }
        }
        c26293d = new C26293d(this, continuation);
        Object obj2 = c26293d.f99036i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c26293d.f99038k;
        if (i == 0) {
        }
        c45375mv1.f99031e.onComplete();
        return Unit.INSTANCE;
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
        long j2;
        long j3;
        Continuation continuation;
        if (j <= 0) {
            return;
        }
        do {
            j2 = this.requested;
            j3 = j2 + j;
            if (j3 <= 0) {
                j3 = LongCompanionObject.MAX_VALUE;
            }
        } while (!f99028f.compareAndSet(this, j2, j3));
        if (j2 <= 0) {
            do {
                continuation = (Continuation) f99029g.getAndSet(this, null);
            } while (continuation == null);
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
        }
    }
}
