package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m28432d2 = {"R", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "onFrame", C17296a.f69688o, "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animation-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: H12 */
/* loaded from: classes.dex */
public final class H12 {

    @Metadata(m28433d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\u008a@"}, m28432d2 = {"R", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m28418f = "InfiniteAnimationPolicy.kt", m28417i = {}, m28416l = {31}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: H12$a */
    /* loaded from: classes.dex */
    public static final class C3005a extends SuspendLambda implements Function1<Continuation<? super R>, Object> {

        /* renamed from: h */
        public int f12728h;

        /* renamed from: i */
        public final /* synthetic */ Function1<Long, R> f12729i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3005a(Function1<? super Long, ? extends R> function1, Continuation<? super C3005a> continuation) {
            super(1, continuation);
            this.f12729i = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C3005a(this.f12729i, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f12728h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function1<Long, R> function1 = this.f12729i;
                this.f12728h = 1;
                obj = JV2.m100318b(function1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super R> continuation) {
            return ((C3005a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: a */
    public static final <R> Object m104498a(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        F12 f12 = (F12) continuation.getContext().get(F12.f8435V);
        if (f12 == null) {
            return JV2.m100318b(function1, continuation);
        }
        return f12.m108110x(new C3005a(function1, null), continuation);
    }
}
