package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.reactivex.AbstractC23437E;
import io.reactivex.disposables.C23466d;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.plugins.C24508a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001aQ\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072,\u0010\r\u001a(\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012\b\u0012\u00060\u0004j\u0002`\u00050\tH\u0002ø\u0001\u0000*8\b\u0002\u0010\u0010\"\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t2\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"Lio/reactivex/E;", "LSC0;", DateTokenConverter.CONVERTER_KEY, "LZC0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "delayMillis", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "adaptForScheduling", "Lio/reactivex/disposables/c;", "e", "Task", "kotlinx-coroutines-rx2"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: bf5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C38679bf5 {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.rx2.RxSchedulerKt", m28418f = "RxScheduler.kt", m28417i = {0}, m28416l = {126}, m28415m = "scheduleTask$task", m28414n = {"ctx"}, m28413s = {"L$0"})
    /* renamed from: bf5$a */
    /* loaded from: classes8.dex */
    public static final class C12467a extends ContinuationImpl {

        /* renamed from: h */
        public Object f57842h;

        /* renamed from: i */
        public /* synthetic */ Object f57843i;

        /* renamed from: j */
        public int f57844j;

        public C12467a(Continuation<? super C12467a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57843i = obj;
            this.f57844j |= Integer.MIN_VALUE;
            return C38679bf5.m64194g(null, null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: bf5$b */
    /* loaded from: classes8.dex */
    public static final class C12468b extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Runnable f57845g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12468b(Runnable runnable) {
            super(0);
            this.f57845g = runnable;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f57845g.run();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: bf5$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C12469c extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object>, SuspendFunction {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC23465c f57846b;

        /* renamed from: c */
        public final /* synthetic */ CoroutineContext f57847c;

        /* renamed from: d */
        public final /* synthetic */ Runnable f57848d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12469c(InterfaceC23465c interfaceC23465c, CoroutineContext coroutineContext, Runnable runnable) {
            super(1, Intrinsics.Kotlin.class, "task", "scheduleTask$task(Lio/reactivex/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            this.f57846b = interfaceC23465c;
            this.f57847c = coroutineContext;
            this.f57848d = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return C38679bf5.m64194g(this.f57846b, this.f57847c, this.f57848d, continuation);
        }
    }

    /* renamed from: d */
    public static final SC0 m64197d(AbstractC23437E abstractC23437E) {
        if (abstractC23437E instanceof S41) {
            return ((S41) abstractC23437E).f33104d;
        }
        return new C32194Cm5(abstractC23437E);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, o51] */
    /* renamed from: e */
    public static final InterfaceC23465c m64196e(ZC0 zc0, Runnable runnable, long j, Function1<? super Function1<? super Continuation<? super Unit>, ? extends Object>, ? extends Runnable> function1) {
        CoroutineContext mo18342K = zc0.mo18342K();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        InterfaceC23465c m33020d = C23466d.m33020d(new Runnable() { // from class: af5
            @Override // java.lang.Runnable
            public final void run() {
                C38679bf5.m64195f(Ref.ObjectRef.this);
            }
        });
        Runnable invoke = function1.invoke(new C12469c(m33020d, mo18342K, C24508a.m31986w(runnable)));
        if (!C37824aD0.m71785f(zc0)) {
            return C23466d.m33023a();
        }
        if (j <= 0) {
            invoke.run();
        } else {
            objectRef.element = C48120rZ0.m15766c(mo18342K).mo14151t(j, invoke, mo18342K);
        }
        return m33020d;
    }

    /* renamed from: f */
    public static final void m64195f(Ref.ObjectRef objectRef) {
        InterfaceC46067o51 interfaceC46067o51 = (InterfaceC46067o51) objectRef.element;
        if (interfaceC46067o51 != null) {
            interfaceC46067o51.dispose();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:21|22)(2:23|(1:25)))|12|13|14))|28|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        p000.C33994Ke5.m98628a(r4, r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m64194g(InterfaceC23465c interfaceC23465c, CoroutineContext coroutineContext, Runnable runnable, Continuation<? super Unit> continuation) {
        C12467a c12467a;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof C12467a) {
            c12467a = (C12467a) continuation;
            int i2 = c12467a.f57844j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c12467a.f57844j = i2 - Integer.MIN_VALUE;
                Object obj = c12467a.f57843i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c12467a.f57844j;
                if (i == 0) {
                    if (i == 1) {
                        coroutineContext = (CoroutineContext) c12467a.f57842h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (interfaceC23465c.mo1769e()) {
                        return Unit.INSTANCE;
                    }
                    C12468b c12468b = new C12468b(runnable);
                    c12467a.f57842h = coroutineContext;
                    c12467a.f57844j = 1;
                    if (M62.m95822c(null, c12468b, c12467a, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c12467a = new C12467a(continuation);
        Object obj2 = c12467a.f57843i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c12467a.f57844j;
        if (i == 0) {
        }
        return Unit.INSTANCE;
    }
}
