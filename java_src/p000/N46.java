package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.TimeoutCancellationException;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aL\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aa\u0010\u000e\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0011H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28432d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "LZC0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "U", "LM46;", "coroutine", "b", "(LM46;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "time", "Lzh2;", "Lkotlinx/coroutines/TimeoutCancellationException;", C17296a.f69688o, "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: N46 */
/* loaded from: classes8.dex */
public final class N46 {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.TimeoutKt", m28418f = "Timeout.kt", m28417i = {0, 0, 0}, m28416l = {100}, m28415m = "withTimeoutOrNull", m28414n = {"block", "coroutine", "timeMillis"}, m28413s = {"L$0", "L$1", "J$0"})
    /* renamed from: N46$a */
    /* loaded from: classes8.dex */
    public static final class C5473a<T> extends ContinuationImpl {

        /* renamed from: h */
        public long f24105h;

        /* renamed from: i */
        public Object f24106i;

        /* renamed from: j */
        public Object f24107j;

        /* renamed from: k */
        public /* synthetic */ Object f24108k;

        /* renamed from: l */
        public int f24109l;

        public C5473a(Continuation<? super C5473a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f24108k = obj;
            this.f24109l |= Integer.MIN_VALUE;
            return N46.m94393c(0L, null, this);
        }
    }

    /* renamed from: a */
    public static final TimeoutCancellationException m94395a(long j, InterfaceC52943zh2 interfaceC52943zh2) {
        return new TimeoutCancellationException("Timed out waiting for " + j + " ms", interfaceC52943zh2);
    }

    /* renamed from: b */
    public static final <U, T extends U> Object m94394b(M46<U, ? super T> m46, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2) {
        C34018Kh2.m98501k(m46, C48120rZ0.m15766c(m46.f37977d.getContext()).mo14151t(m46.f22605e, m46, m46.getContext()));
        return C32816Fd6.m106835d(m46, m46, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, M46] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m94393c(long j, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        C5473a c5473a;
        Object coroutine_suspended;
        int i;
        Ref.ObjectRef objectRef;
        Object coroutine_suspended2;
        if (continuation instanceof C5473a) {
            c5473a = (C5473a) continuation;
            int i2 = c5473a.f24109l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c5473a.f24109l = i2 - Integer.MIN_VALUE;
                Object obj = c5473a.f24108k;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c5473a.f24109l;
                if (i == 0) {
                    if (i == 1) {
                        objectRef = (Ref.ObjectRef) c5473a.f24107j;
                        Function2 function22 = (Function2) c5473a.f24106i;
                        try {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (j <= 0) {
                        return null;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        c5473a.f24106i = function2;
                        c5473a.f24107j = objectRef2;
                        c5473a.f24105h = j;
                        c5473a.f24109l = 1;
                        ?? r2 = (T) new M46(j, c5473a);
                        objectRef2.element = r2;
                        Object m94394b = m94394b(r2, function2);
                        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (m94394b == coroutine_suspended2) {
                            DebugProbesKt.probeCoroutineSuspended(c5473a);
                        }
                        if (m94394b == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return m94394b;
                    } catch (TimeoutCancellationException e2) {
                        e = e2;
                        objectRef = objectRef2;
                    }
                }
                if (e.f95028b != objectRef.element) {
                    return null;
                }
                throw e;
            }
        }
        c5473a = new C5473a(continuation);
        Object obj2 = c5473a.f24108k;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c5473a.f24109l;
        if (i == 0) {
        }
        if (e.f95028b != objectRef.element) {
        }
    }
}
