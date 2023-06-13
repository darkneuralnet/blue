package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"LUu;", "LRg3;", "", C17296a.f69688o, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnm2;", "coordinates", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", "b", "Z", "wasPositioned", "Lkotlin/coroutines/Continuation;", "c", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/AwaitFirstLayoutModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1#2:458\n*E\n"})
/* renamed from: Uu */
/* loaded from: classes.dex */
public final class C8494Uu implements InterfaceC35648Rg3 {

    /* renamed from: b */
    public boolean f38226b;

    /* renamed from: c */
    public Continuation<? super Unit> f38227c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.AwaitFirstLayoutModifier", m28418f = "LazyListState.kt", m28417i = {0, 0}, m28416l = {445}, m28415m = "waitForFirstLayout", m28414n = {"this", "oldContinuation"}, m28413s = {"L$0", "L$1"})
    /* renamed from: Uu$a */
    /* loaded from: classes.dex */
    public static final class C8495a extends ContinuationImpl {

        /* renamed from: h */
        public Object f38228h;

        /* renamed from: i */
        public Object f38229i;

        /* renamed from: j */
        public /* synthetic */ Object f38230j;

        /* renamed from: l */
        public int f38232l;

        public C8495a(Continuation<? super C8495a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38230j = obj;
            this.f38232l |= Integer.MIN_VALUE;
            return C8494Uu.this.m80654a(this);
        }
    }

    @Override // p000.InterfaceC35648Rg3
    /* renamed from: C */
    public void mo44810C(InterfaceC45879nm2 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        if (!this.f38226b) {
            this.f38226b = true;
            Continuation<? super Unit> continuation = this.f38227c;
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
            }
            this.f38227c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m80654a(Continuation<? super Unit> continuation) {
        C8495a c8495a;
        Object coroutine_suspended;
        int i;
        Continuation intercepted;
        Object coroutine_suspended2;
        Continuation<? super Unit> continuation2;
        if (continuation instanceof C8495a) {
            c8495a = (C8495a) continuation;
            int i2 = c8495a.f38232l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c8495a.f38232l = i2 - Integer.MIN_VALUE;
                Object obj = c8495a.f38230j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c8495a.f38232l;
                if (i == 0) {
                    if (i == 1) {
                        continuation2 = (Continuation) c8495a.f38229i;
                        C8494Uu c8494Uu = (C8494Uu) c8495a.f38228h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (!this.f38226b) {
                        Continuation<? super Unit> continuation3 = this.f38227c;
                        c8495a.f38228h = this;
                        c8495a.f38229i = continuation3;
                        c8495a.f38232l = 1;
                        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(c8495a);
                        SafeContinuation safeContinuation = new SafeContinuation(intercepted);
                        this.f38227c = safeContinuation;
                        Object orThrow = safeContinuation.getOrThrow();
                        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (orThrow == coroutine_suspended2) {
                            DebugProbesKt.probeCoroutineSuspended(c8495a);
                        }
                        if (orThrow == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        continuation2 = continuation3;
                    }
                    return Unit.INSTANCE;
                }
                if (continuation2 != null) {
                    Result.Companion companion = Result.Companion;
                    continuation2.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
                }
                return Unit.INSTANCE;
            }
        }
        c8495a = new C8495a(continuation);
        Object obj2 = c8495a.f38230j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c8495a.f38232l;
        if (i == 0) {
        }
        if (continuation2 != null) {
        }
        return Unit.INSTANCE;
    }
}
