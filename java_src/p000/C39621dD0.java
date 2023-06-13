package p000;

import android.os.CancellationSignal;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"LdD0;", "", "<init>", "()V", C17296a.f69688o, "room-ktx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: dD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39621dD0 {

    /* renamed from: a */
    public static final C19692a f76265a = new C19692a(null);

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ?\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"LdD0$a;", "", "R", "LEb5;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "b", "(LEb5;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", C17296a.f69688o, "(LEb5;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "room-ktx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: dD0$a */
    /* loaded from: classes.dex */
    public static final class C19692a {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"R", "LZC0;", "kotlin.jvm.PlatformType", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        @DebugMetadata(m28419c = "androidx.room.CoroutinesRoom$Companion$execute$2", m28418f = "CoroutinesRoom.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: dD0$a$a */
        /* loaded from: classes.dex */
        public static final class C19693a extends SuspendLambda implements Function2<ZC0, Continuation<? super R>, Object> {

            /* renamed from: h */
            public int f76266h;

            /* renamed from: i */
            public final /* synthetic */ Callable<R> f76267i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19693a(Callable<R> callable, Continuation<? super C19693a> continuation) {
                super(2, continuation);
                this.f76267i = callable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C19693a(this.f76267i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super R> continuation) {
                return ((C19693a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f76266h == 0) {
                    ResultKt.throwOnFailure(obj);
                    return this.f76267i.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: dD0$a$b */
        /* loaded from: classes.dex */
        public static final class C19694b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ CancellationSignal f76268g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC52943zh2 f76269h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19694b(CancellationSignal cancellationSignal, InterfaceC52943zh2 interfaceC52943zh2) {
                super(1);
                this.f76268g = cancellationSignal;
                this.f76269h = interfaceC52943zh2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C40973fV5.m41270a(this.f76268g);
                InterfaceC52943zh2.C31478a.m550a(this.f76269h, null, 1, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"R", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        @DebugMetadata(m28419c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", m28418f = "CoroutinesRoom.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: dD0$a$c */
        /* loaded from: classes.dex */
        public static final class C19695c extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f76270h;

            /* renamed from: i */
            public final /* synthetic */ Callable<R> f76271i;

            /* renamed from: j */
            public final /* synthetic */ InterfaceC36779Wc0<R> f76272j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C19695c(Callable<R> callable, InterfaceC36779Wc0<? super R> interfaceC36779Wc0, Continuation<? super C19695c> continuation) {
                super(2, continuation);
                this.f76271i = callable;
                this.f76272j = interfaceC36779Wc0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C19695c(this.f76271i, this.f76272j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C19695c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f76270h == 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        this.f76272j.resumeWith(Result.m116783constructorimpl(this.f76271i.call()));
                    } catch (Throwable th) {
                        Continuation continuation = this.f76272j;
                        Result.Companion companion = Result.Companion;
                        continuation.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(th)));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public /* synthetic */ C19692a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final <R> Object m44537a(AbstractC32563Eb5 abstractC32563Eb5, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
            SC0 m43101a;
            ContinuationInterceptor continuationInterceptor;
            Continuation intercepted;
            InterfaceC52943zh2 m73800d;
            Object coroutine_suspended;
            if (abstractC32563Eb5.m108715w() && abstractC32563Eb5.m108721q()) {
                return callable.call();
            }
            O66 o66 = (O66) continuation.getContext().get(O66.f25904c);
            if (o66 == null || (continuationInterceptor = o66.m92901e()) == null) {
                if (z) {
                    m43101a = C40213eD0.m43100b(abstractC32563Eb5);
                } else {
                    m43101a = C40213eD0.m43101a(abstractC32563Eb5);
                }
                continuationInterceptor = m43101a;
            }
            ContinuationInterceptor continuationInterceptor2 = continuationInterceptor;
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
            C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
            c37013Xc0.m76766u();
            m73800d = Z30.m73800d(VC1.f38731b, continuationInterceptor2, null, new C19695c(callable, c37013Xc0, null), 2, null);
            c37013Xc0.mo76794H(new C19694b(cancellationSignal, m73800d));
            Object m76770q = c37013Xc0.m76770q();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m76770q == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return m76770q;
        }

        @JvmStatic
        /* renamed from: b */
        public final <R> Object m44536b(AbstractC32563Eb5 abstractC32563Eb5, boolean z, Callable<R> callable, Continuation<? super R> continuation) {
            SC0 m43101a;
            ContinuationInterceptor continuationInterceptor;
            if (abstractC32563Eb5.m108715w() && abstractC32563Eb5.m108721q()) {
                return callable.call();
            }
            O66 o66 = (O66) continuation.getContext().get(O66.f25904c);
            if (o66 == null || (continuationInterceptor = o66.m92901e()) == null) {
                if (z) {
                    m43101a = C40213eD0.m43100b(abstractC32563Eb5);
                } else {
                    m43101a = C40213eD0.m43101a(abstractC32563Eb5);
                }
                continuationInterceptor = m43101a;
            }
            return X30.m77504g(continuationInterceptor, new C19693a(callable, null), continuation);
        }

        private C19692a() {
        }
    }

    private C39621dD0() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final <R> Object m44539a(AbstractC32563Eb5 abstractC32563Eb5, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
        return f76265a.m44537a(abstractC32563Eb5, z, cancellationSignal, callable, continuation);
    }

    @JvmStatic
    /* renamed from: b */
    public static final <R> Object m44538b(AbstractC32563Eb5 abstractC32563Eb5, boolean z, Callable<R> callable, Continuation<? super R> continuation) {
        return f76265a.m44536b(abstractC32563Eb5, z, callable, continuation);
    }
}
