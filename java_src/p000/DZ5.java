package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC36779Wc0;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m28432d2 = {"T", "Lcom/google/android/gms/tasks/Task;", C17296a.f69688o, "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "cancellationTokenSource", "b", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: DZ5 */
/* loaded from: classes8.dex */
public final class DZ5 {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "Lcom/google/android/gms/tasks/Task;", "kotlin.jvm.PlatformType", "onComplete"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: DZ5$a */
    /* loaded from: classes8.dex */
    public static final class C1543a<TResult> implements OnCompleteListener {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC36779Wc0<T> f5957b;

        /* JADX WARN: Multi-variable type inference failed */
        public C1543a(InterfaceC36779Wc0<? super T> interfaceC36779Wc0) {
            this.f5957b = interfaceC36779Wc0;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    InterfaceC36779Wc0.C9110a.m78140a(this.f5957b, null, 1, null);
                    return;
                }
                Continuation continuation = this.f5957b;
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m116783constructorimpl(task.getResult()));
                return;
            }
            Continuation continuation2 = this.f5957b;
            Result.Companion companion2 = Result.Companion;
            continuation2.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(exception)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: DZ5$b */
    /* loaded from: classes8.dex */
    public static final class C1544b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ CancellationTokenSource f5958g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1544b(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f5958g = cancellationTokenSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f5958g.cancel();
        }
    }

    /* renamed from: a */
    public static final <T> Object m110169a(Task<T> task, Continuation<? super T> continuation) {
        return m110168b(task, null, continuation);
    }

    /* renamed from: b */
    public static final <T> Object m110168b(Task<T> task, CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (!task.isCanceled()) {
                    return task.getResult();
                }
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            throw exception;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        task.addOnCompleteListener(ExecutorC41906h41.f84678b, new C1543a(c37013Xc0));
        if (cancellationTokenSource != null) {
            c37013Xc0.mo76794H(new C1544b(cancellationTokenSource));
        }
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }
}
