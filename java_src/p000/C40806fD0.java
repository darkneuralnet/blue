package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.AN2;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000e*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0011B!\u0012\u0006\u0010+\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b,\u0010-J\u001c\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J!\u0010\n\u001a\u00020\u00052\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\bH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0013\u0010\u000e\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0002R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R+\u0010\u0018\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0011\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, m28432d2 = {"LfD0;", "LAN2;", "S", "LEN2;", "Lkotlin/Function1;", "", "block", "b", "Lkotlin/ExtensionFunctionType;", "stateReducer", "c", "LZC0;", Action.SCOPE_ATTRIBUTE, "l", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", C17296a.f69688o, "LZC0;", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "contextOverride", "LFh0;", "LFh0;", "setStateChannel", DateTokenConverter.CONVERTER_KEY, "withStateChannel", "LBX2;", "e", "LBX2;", "stateSharedFlow", "f", "LAN2;", "j", "()LAN2;", "k", "(LAN2;)V", TransferTable.COLUMN_STATE, "LEu1;", "g", "LEu1;", "()LEu1;", "flow", "initialState", "<init>", "(LAN2;LZC0;Lkotlin/coroutines/CoroutineContext;)V", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: fD0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40806fD0<S extends AN2> implements EN2<S> {

    /* renamed from: h */
    public static final C20314a f79667h = new C20314a(null);

    /* renamed from: i */
    public static final AbstractC32613Eh1 f79668i;

    /* renamed from: a */
    public final ZC0 f79669a;

    /* renamed from: b */
    public final CoroutineContext f79670b;

    /* renamed from: c */
    public final InterfaceC32846Fh0<Function1<S, S>> f79671c;

    /* renamed from: d */
    public final InterfaceC32846Fh0<Function1<S, Unit>> f79672d;

    /* renamed from: e */
    public final BX2<S> f79673e;

    /* renamed from: f */
    public volatile S f79674f;

    /* renamed from: g */
    public final InterfaceC32730Eu1<S> f79675g;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m28432d2 = {"LfD0$a;", "", "", "SubscriberBufferSize", "I", "getSubscriberBufferSize$annotations", "()V", "LEh1;", "flushDispatcher", "LEh1;", "<init>", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: fD0$a */
    /* loaded from: classes2.dex */
    public static final class C20314a {
        public /* synthetic */ C20314a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20314a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\b\u0003H\u008a@"}, m28432d2 = {"LAN2;", "S", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "reducer", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.CoroutinesStateStore$flushQueuesOnce$2$1", m28418f = "CoroutinesStateStore.kt", m28417i = {}, m28416l = {87}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: fD0$b */
    /* loaded from: classes2.dex */
    public static final class C20315b extends SuspendLambda implements Function2<Function1<? super S, ? extends S>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f79676h;

        /* renamed from: i */
        public /* synthetic */ Object f79677i;

        /* renamed from: j */
        public final /* synthetic */ C40806fD0<S> f79678j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20315b(C40806fD0<S> c40806fD0, Continuation<? super C20315b> continuation) {
            super(2, continuation);
            this.f79678j = c40806fD0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20315b c20315b = new C20315b(this.f79678j, continuation);
            c20315b.f79677i = obj;
            return c20315b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(Function1<? super S, ? extends S> function1, Continuation<? super Unit> continuation) {
            return ((C20315b) create(function1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f79676h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AN2 an2 = (AN2) ((Function1) this.f79677i).invoke(this.f79678j.getState());
                if (!Intrinsics.areEqual(an2, this.f79678j.getState())) {
                    this.f79678j.m41733k(an2);
                    BX2 bx2 = this.f79678j.f79673e;
                    this.f79676h = 1;
                    if (bx2.emit(an2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m28432d2 = {"LAN2;", "S", "Lkotlin/Function1;", "", "block", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.CoroutinesStateStore$flushQueuesOnce$2$2", m28418f = "CoroutinesStateStore.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: fD0$c */
    /* loaded from: classes2.dex */
    public static final class C20316c extends SuspendLambda implements Function2<Function1<? super S, ? extends Unit>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f79679h;

        /* renamed from: i */
        public /* synthetic */ Object f79680i;

        /* renamed from: j */
        public final /* synthetic */ C40806fD0<S> f79681j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20316c(C40806fD0<S> c40806fD0, Continuation<? super C20316c> continuation) {
            super(2, continuation);
            this.f79681j = c40806fD0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20316c c20316c = new C20316c(this.f79681j, continuation);
            c20316c.f79680i = obj;
            return c20316c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(Function1<? super S, Unit> function1, Continuation<? super Unit> continuation) {
            return ((C20316c) create(function1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f79679h == 0) {
                ResultKt.throwOnFailure(obj);
                ((Function1) this.f79680i).invoke(this.f79681j.getState());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, m28432d2 = {"LAN2;", "S", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.CoroutinesStateStore$flushQueuesOnceBlocking$1", m28418f = "CoroutinesStateStore.kt", m28417i = {}, m28416l = {98}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: fD0$d */
    /* loaded from: classes2.dex */
    public static final class C20317d extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f79682h;

        /* renamed from: i */
        public final /* synthetic */ C40806fD0<S> f79683i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20317d(C40806fD0<S> c40806fD0, Continuation<? super C20317d> continuation) {
            super(2, continuation);
            this.f79683i = c40806fD0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20317d(this.f79683i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C20317d) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f79682h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C40806fD0<S> c40806fD0 = this.f79683i;
                this.f79682h = 1;
                if (c40806fD0.m41736h(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, m28432d2 = {"LAN2;", "S", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.CoroutinesStateStore$setupTriggerFlushQueues$1", m28418f = "CoroutinesStateStore.kt", m28417i = {0}, m28416l = {59}, m28415m = "invokeSuspend", m28414n = {"$this$launch"}, m28413s = {"L$0"})
    /* renamed from: fD0$e */
    /* loaded from: classes2.dex */
    public static final class C20318e extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f79684h;

        /* renamed from: i */
        public /* synthetic */ Object f79685i;

        /* renamed from: j */
        public final /* synthetic */ C40806fD0<S> f79686j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20318e(C40806fD0<S> c40806fD0, Continuation<? super C20318e> continuation) {
            super(2, continuation);
            this.f79686j = c40806fD0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20318e c20318e = new C20318e(this.f79686j, continuation);
            c20318e.f79685i = obj;
            return c20318e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C20318e) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            ZC0 zc0;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f79684h;
            if (i != 0) {
                if (i == 1) {
                    zc0 = (ZC0) this.f79685i;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                zc0 = (ZC0) this.f79685i;
            }
            while (C37824aD0.m71785f(zc0)) {
                C40806fD0<S> c40806fD0 = this.f79686j;
                this.f79685i = zc0;
                this.f79684h = 1;
                if (c40806fD0.m41736h(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Intrinsics.checkNotNullExpressionValue(newCachedThreadPool, "newCachedThreadPool()");
        f79668i = C34017Kh1.m98512b(newCachedThreadPool);
    }

    public C40806fD0(S initialState, ZC0 scope, CoroutineContext contextOverride) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(contextOverride, "contextOverride");
        this.f79669a = scope;
        this.f79670b = contextOverride;
        this.f79671c = C35186Ph0.m89918b(Integer.MAX_VALUE, null, null, 6, null);
        this.f79672d = C35186Ph0.m89918b(Integer.MAX_VALUE, null, null, 6, null);
        BX2<S> m79032a = C36748Vy5.m79032a(1, 63, EnumC43674k30.SUSPEND);
        m79032a.mo10357b(initialState);
        this.f79673e = m79032a;
        this.f79674f = initialState;
        this.f79675g = C36708Vu1.m79270a(m79032a);
        m41732l(scope);
    }

    @Override // p000.EN2
    /* renamed from: a */
    public InterfaceC32730Eu1<S> mo41743a() {
        return this.f79675g;
    }

    @Override // p000.EN2
    /* renamed from: b */
    public void mo41742b(Function1<? super S, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f79672d.mo2349h(block);
        if (FN2.f9264b) {
            m41735i();
        }
    }

    @Override // p000.EN2
    /* renamed from: c */
    public void mo41741c(Function1<? super S, ? extends S> stateReducer) {
        Intrinsics.checkNotNullParameter(stateReducer, "stateReducer");
        this.f79671c.mo2349h(stateReducer);
        if (FN2.f9264b) {
            m41735i();
        }
    }

    /* renamed from: h */
    public final Object m41736h(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        C41781gr5 c41781gr5 = new C41781gr5(continuation);
        try {
            c41781gr5.mo37384k(this.f79671c.mo28257E(), new C20315b(this, null));
            c41781gr5.mo37384k(this.f79672d.mo28257E(), new C20316c(this, null));
        } catch (Throwable th) {
            c41781gr5.m37387W(th);
        }
        Object m37388V = c41781gr5.m37388V();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m37388V == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m37388V == coroutine_suspended2) {
            return m37388V;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public final void m41735i() {
        if (C37824aD0.m71785f(this.f79669a)) {
            Y30.m75794b(null, new C20317d(this, null), 1, null);
        }
    }

    @Override // p000.EN2
    /* renamed from: j */
    public S getState() {
        return this.f79674f;
    }

    /* renamed from: k */
    public void m41733k(S s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.f79674f = s;
    }

    /* renamed from: l */
    public final void m41732l(ZC0 zc0) {
        if (FN2.f9264b) {
            return;
        }
        Z30.m73800d(zc0, f79668i.plus(this.f79670b), null, new C20318e(this, null), 2, null);
    }
}
