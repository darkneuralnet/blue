package p000;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p000.IV2;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J<\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"LaL3;", "LIV2;", "", "e", "h", "R", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "onFrame", "m", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "LIV2;", "frameClock", "Ldm2;", "c", "Ldm2;", "latch", "<init>", "(LIV2;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aL3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37899aL3 implements IV2 {

    /* renamed from: b */
    public final IV2 f50317b;

    /* renamed from: c */
    public final C39950dm2 f50318c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.runtime.PausableMonotonicFrameClock", m28418f = "PausableMonotonicFrameClock.kt", m28417i = {0, 0}, m28416l = {62, 63}, m28415m = "withFrameNanos", m28414n = {"this", "onFrame"}, m28413s = {"L$0", "L$1"})
    /* renamed from: aL3$a */
    /* loaded from: classes.dex */
    public static final class C10635a<R> extends ContinuationImpl {

        /* renamed from: h */
        public Object f50319h;

        /* renamed from: i */
        public Object f50320i;

        /* renamed from: j */
        public /* synthetic */ Object f50321j;

        /* renamed from: l */
        public int f50323l;

        public C10635a(Continuation<? super C10635a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50321j = obj;
            this.f50323l |= Integer.MIN_VALUE;
            return C37899aL3.this.mo40754m(null, this);
        }
    }

    public C37899aL3(IV2 frameClock) {
        Intrinsics.checkNotNullParameter(frameClock, "frameClock");
        this.f50317b = frameClock;
        this.f50318c = new C39950dm2();
    }

    /* renamed from: e */
    public final void m71616e() {
        this.f50318c.m43727d();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) IV2.C3691a.m101973a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) IV2.C3691a.m101972b(this, key);
    }

    /* renamed from: h */
    public final void m71615h() {
        this.f50318c.m43725f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r7 
      PHI: (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0060, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // p000.IV2
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> Object mo40754m(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        C10635a c10635a;
        Object obj;
        Object coroutine_suspended;
        int i;
        C37899aL3 c37899aL3;
        if (continuation instanceof C10635a) {
            c10635a = (C10635a) continuation;
            int i2 = c10635a.f50323l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c10635a.f50323l = i2 - Integer.MIN_VALUE;
                obj = c10635a.f50321j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c10635a.f50323l;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (Function1) c10635a.f50320i;
                    c37899aL3 = (C37899aL3) c10635a.f50319h;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    C39950dm2 c39950dm2 = this.f50318c;
                    c10635a.f50319h = this;
                    c10635a.f50320i = function1;
                    c10635a.f50323l = 1;
                    if (c39950dm2.m43728c(c10635a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c37899aL3 = this;
                }
                IV2 iv2 = c37899aL3.f50317b;
                c10635a.f50319h = null;
                c10635a.f50320i = null;
                c10635a.f50323l = 2;
                obj = iv2.mo40754m(function1, c10635a);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                return obj;
            }
        }
        c10635a = new C10635a(continuation);
        obj = c10635a.f50321j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c10635a.f50323l;
        if (i == 0) {
        }
        IV2 iv22 = c37899aL3.f50317b;
        c10635a.f50319h = null;
        c10635a.f50320i = null;
        c10635a.f50323l = 2;
        obj = iv22.mo40754m(function1, c10635a);
        if (obj != coroutine_suspended) {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return IV2.C3691a.m101971c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return IV2.C3691a.m101970d(this, coroutineContext);
    }
}
