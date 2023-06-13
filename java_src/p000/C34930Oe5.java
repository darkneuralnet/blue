package p000;

import ch.qos.logback.core.CoreConstants;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\t"}, m28432d2 = {"", "T", "LEu1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/Observable;", "c", "Lio/reactivex/k;", "b", "kotlinx-coroutines-rx2"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Oe5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34930Oe5 {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, m28432d2 = {"", "T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", m28418f = "RxConvert.kt", m28417i = {0}, m28416l = {114}, m28415m = "invokeSuspend", m28414n = {"$this$launch"}, m28413s = {"L$0"})
    /* renamed from: Oe5$a */
    /* loaded from: classes8.dex */
    public static final class C6086a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f26985h;

        /* renamed from: i */
        public /* synthetic */ Object f26986i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC32730Eu1 f26987j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC24578y f26988k;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: Oe5$a$a */
        /* loaded from: classes8.dex */
        public static final class C6087a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC24578y<T> f26989b;

            public C6087a(InterfaceC24578y<T> interfaceC24578y) {
                this.f26989b = interfaceC24578y;
            }

            @Override // p000.InterfaceC33198Gu1
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                this.f26989b.onNext(t);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6086a(InterfaceC32730Eu1 interfaceC32730Eu1, InterfaceC24578y interfaceC24578y, Continuation continuation) {
            super(2, continuation);
            this.f26987j = interfaceC32730Eu1;
            this.f26988k = interfaceC24578y;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C6086a c6086a = new C6086a(this.f26987j, this.f26988k, continuation);
            c6086a.f26986i = obj;
            return c6086a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C6086a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            ZC0 zc0;
            Throwable th;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26985h;
            if (i != 0) {
                if (i == 1) {
                    zc0 = (ZC0) this.f26986i;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        if (th instanceof CancellationException) {
                            if (!this.f26988k.mo11914c(th)) {
                                C33994Ke5.m98628a(th, zc0.mo18342K());
                            }
                        } else {
                            this.f26988k.onComplete();
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc02 = (ZC0) this.f26986i;
                try {
                    InterfaceC32730Eu1 interfaceC32730Eu1 = this.f26987j;
                    C6087a c6087a = new C6087a(this.f26988k);
                    this.f26986i = zc02;
                    this.f26985h = 1;
                    if (interfaceC32730Eu1.collect(c6087a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zc0 = zc02;
                } catch (Throwable th3) {
                    zc0 = zc02;
                    th = th3;
                    if (th instanceof CancellationException) {
                    }
                    return Unit.INSTANCE;
                }
            }
            this.f26988k.onComplete();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public static final <T> AbstractC24490k<T> m91747b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, CoroutineContext coroutineContext) {
        return AbstractC24490k.m32138j0(C39409cr4.m44968a(interfaceC32730Eu1, coroutineContext));
    }

    /* renamed from: c */
    public static final <T> Observable<T> m91746c(final InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, final CoroutineContext coroutineContext) {
        return Observable.create(new InterfaceC24579z() { // from class: Ne5
            @Override // io.reactivex.InterfaceC24579z
            public final void subscribe(InterfaceC24578y interfaceC24578y) {
                C34930Oe5.m91744e(CoroutineContext.this, interfaceC32730Eu1, interfaceC24578y);
            }
        });
    }

    /* renamed from: d */
    public static /* synthetic */ Observable m91745d(InterfaceC32730Eu1 interfaceC32730Eu1, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return m91746c(interfaceC32730Eu1, coroutineContext);
    }

    /* renamed from: e */
    public static final void m91744e(CoroutineContext coroutineContext, InterfaceC32730Eu1 interfaceC32730Eu1, InterfaceC24578y interfaceC24578y) {
        interfaceC24578y.mo11916a(new C33760Je5(X30.m77508c(VC1.f38731b, T41.m84375d().plus(coroutineContext), EnumC38417bD0.ATOMIC, new C6086a(interfaceC32730Eu1, interfaceC24578y, null))));
    }
}
