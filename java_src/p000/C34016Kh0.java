package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0014R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m28432d2 = {"LKh0;", "T", "LHh0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lk30;", "onBufferOverflow", "h", "LZC0;", Action.SCOPE_ATTRIBUTE, "Lks4;", "l", "Ln74;", "", "g", "(Ln74;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "e", "LEu1;", "LEu1;", "flow", "f", "I", "concurrency", "<init>", "(LEu1;ILkotlin/coroutines/CoroutineContext;ILk30;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Kh0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34016Kh0<T> extends AbstractC33314Hh0<T> {

    /* renamed from: e */
    public final InterfaceC32730Eu1<InterfaceC32730Eu1<T>> f20057e;

    /* renamed from: f */
    public final int f20058f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "LEu1;", "inner", "", "c", "(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Kh0$a */
    /* loaded from: classes8.dex */
    public static final class C4549a<T> implements InterfaceC33198Gu1 {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC52943zh2 f20059b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC49499ts5 f20060c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC45497n74<T> f20061d;

        /* renamed from: e */
        public final /* synthetic */ C32248Cs5<T> f20062e;

        @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", m28418f = "Merge.kt", m28417i = {}, m28416l = {69}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: Kh0$a$a */
        /* loaded from: classes8.dex */
        public static final class C4550a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f20063h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC32730Eu1<T> f20064i;

            /* renamed from: j */
            public final /* synthetic */ C32248Cs5<T> f20065j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC49499ts5 f20066k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4550a(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, C32248Cs5<T> c32248Cs5, InterfaceC49499ts5 interfaceC49499ts5, Continuation<? super C4550a> continuation) {
                super(2, continuation);
                this.f20064i = interfaceC32730Eu1;
                this.f20065j = c32248Cs5;
                this.f20066k = interfaceC49499ts5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C4550a(this.f20064i, this.f20065j, this.f20066k, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C4550a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f20063h;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC32730Eu1<T> interfaceC32730Eu1 = this.f20064i;
                        C32248Cs5<T> c32248Cs5 = this.f20065j;
                        this.f20063h = 1;
                        if (interfaceC32730Eu1.collect(c32248Cs5, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    this.f20066k.release();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    this.f20066k.release();
                    throw th;
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", m28418f = "Merge.kt", m28417i = {0, 0}, m28416l = {66}, m28415m = "emit", m28414n = {"this", "inner"}, m28413s = {"L$0", "L$1"})
        /* renamed from: Kh0$a$b */
        /* loaded from: classes8.dex */
        public static final class C4551b extends ContinuationImpl {

            /* renamed from: h */
            public Object f20067h;

            /* renamed from: i */
            public Object f20068i;

            /* renamed from: j */
            public /* synthetic */ Object f20069j;

            /* renamed from: k */
            public final /* synthetic */ C4549a<T> f20070k;

            /* renamed from: l */
            public int f20071l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4551b(C4549a<? super T> c4549a, Continuation<? super C4551b> continuation) {
                super(continuation);
                this.f20070k = c4549a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f20069j = obj;
                this.f20071l |= Integer.MIN_VALUE;
                return this.f20070k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C4549a(InterfaceC52943zh2 interfaceC52943zh2, InterfaceC49499ts5 interfaceC49499ts5, InterfaceC45497n74<? super T> interfaceC45497n74, C32248Cs5<T> c32248Cs5) {
            this.f20059b = interfaceC52943zh2;
            this.f20060c = interfaceC49499ts5;
            this.f20061d = interfaceC45497n74;
            this.f20062e = c32248Cs5;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        @Override // p000.InterfaceC33198Gu1
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Continuation<? super Unit> continuation) {
            C4551b c4551b;
            Object coroutine_suspended;
            int i;
            C4549a<T> c4549a;
            if (continuation instanceof C4551b) {
                c4551b = (C4551b) continuation;
                int i2 = c4551b.f20071l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4551b.f20071l = i2 - Integer.MIN_VALUE;
                    Object obj = c4551b.f20069j;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4551b.f20071l;
                    if (i == 0) {
                        if (i == 1) {
                            interfaceC32730Eu1 = (InterfaceC32730Eu1) c4551b.f20068i;
                            c4549a = (C4549a) c4551b.f20067h;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC52943zh2 interfaceC52943zh2 = this.f20059b;
                        if (interfaceC52943zh2 != null) {
                            C34018Kh2.m98500l(interfaceC52943zh2);
                        }
                        InterfaceC49499ts5 interfaceC49499ts5 = this.f20060c;
                        c4551b.f20067h = this;
                        c4551b.f20068i = interfaceC32730Eu1;
                        c4551b.f20071l = 1;
                        if (interfaceC49499ts5.mo9628c(c4551b) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c4549a = this;
                    }
                    Z30.m73800d(c4549a.f20061d, null, null, new C4550a(interfaceC32730Eu1, c4549a.f20062e, c4549a.f20060c, null), 3, null);
                    return Unit.INSTANCE;
                }
            }
            c4551b = new C4551b(this, continuation);
            Object obj2 = c4551b.f20069j;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c4551b.f20071l;
            if (i == 0) {
            }
            Z30.m73800d(c4549a.f20061d, null, null, new C4550a(interfaceC32730Eu1, c4549a.f20062e, c4549a.f20060c, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C34016Kh0(InterfaceC32730Eu1 interfaceC32730Eu1, int i, CoroutineContext coroutineContext, int i2, EnumC43674k30 enumC43674k30, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC32730Eu1, i, (i3 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? EnumC43674k30.SUSPEND : enumC43674k30);
    }

    @Override // p000.AbstractC33314Hh0
    /* renamed from: e */
    public String mo98516e() {
        return "concurrency=" + this.f20058f;
    }

    @Override // p000.AbstractC33314Hh0
    /* renamed from: g */
    public Object mo96437g(InterfaceC45497n74<? super T> interfaceC45497n74, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object collect = this.f20057e.collect(new C4549a((InterfaceC52943zh2) continuation.getContext().get(InterfaceC52943zh2.f122077a0), C50684vs5.m7887b(this.f20058f, 0, 2, null), interfaceC45497n74, new C32248Cs5(interfaceC45497n74)), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (collect == coroutine_suspended) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    @Override // p000.AbstractC33314Hh0
    /* renamed from: h */
    public AbstractC33314Hh0<T> mo93575h(CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        return new C34016Kh0(this.f20057e, this.f20058f, coroutineContext, i, enumC43674k30);
    }

    @Override // p000.AbstractC33314Hh0
    /* renamed from: l */
    public InterfaceC44162ks4<T> mo98515l(ZC0 zc0) {
        return C43125j74.m31070c(zc0, this.f13760b, this.f13761c, m103529j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34016Kh0(InterfaceC32730Eu1<? extends InterfaceC32730Eu1<? extends T>> interfaceC32730Eu1, int i, CoroutineContext coroutineContext, int i2, EnumC43674k30 enumC43674k30) {
        super(coroutineContext, i2, enumC43674k30);
        this.f20057e = interfaceC32730Eu1;
        this.f20058f = i;
    }
}
