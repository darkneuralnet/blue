package p000;

import android.annotation.SuppressLint;
import androidx.lifecycle.C11714c;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"LWs2;", "T", "LVs2;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/c;", C17296a.f69688o, "Landroidx/lifecycle/c;", "()Landroidx/lifecycle/c;", "setTarget$lifecycle_livedata_ktx_release", "(Landroidx/lifecycle/c;)V", "target", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroidx/lifecycle/c;Lkotlin/coroutines/CoroutineContext;)V", "lifecycle-livedata-ktx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ws2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36925Ws2<T> implements InterfaceC36691Vs2<T> {

    /* renamed from: a */
    public C11714c<T> f42223a;

    /* renamed from: b */
    public final CoroutineContext f42224b;

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", m28418f = "CoroutineLiveData.kt", m28417i = {}, m28416l = {99}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Ws2$a */
    /* loaded from: classes.dex */
    public static final class C9192a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f42225h;

        /* renamed from: i */
        public final /* synthetic */ C36925Ws2<T> f42226i;

        /* renamed from: j */
        public final /* synthetic */ T f42227j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9192a(C36925Ws2<T> c36925Ws2, T t, Continuation<? super C9192a> continuation) {
            super(2, continuation);
            this.f42226i = c36925Ws2;
            this.f42227j = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9192a(this.f42226i, this.f42227j, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C9192a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f42225h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C11714c<T> m77766a = this.f42226i.m77766a();
                this.f42225h = 1;
                if (m77766a.m67023e(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f42226i.m77766a().setValue(this.f42227j);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, continuation);
        }
    }

    public C36925Ws2(C11714c<T> target, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42223a = target;
        this.f42224b = context.plus(T41.m84376c().mo14156G());
    }

    /* renamed from: a */
    public final C11714c<T> m77766a() {
        return this.f42223a;
    }

    @Override // p000.InterfaceC36691Vs2
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m77504g = X30.m77504g(this.f42224b, new C9192a(this, t, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m77504g == coroutine_suspended ? m77504g : Unit.INSTANCE;
    }
}
