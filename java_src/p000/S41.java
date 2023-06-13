package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23437E;
import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC52463ys5;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001 J+\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, m28432d2 = {"LS41;", "Lio/reactivex/E;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "delay", "Ljava/util/concurrent/TimeUnit;", "unit", "Lio/reactivex/disposables/c;", "e", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;", "Lio/reactivex/E$c;", "b", "()Lio/reactivex/E$c;", "", "shutdown", "()V", "", "toString", "()Ljava/lang/String;", "LSC0;", DateTokenConverter.CONVERTER_KEY, "LSC0;", "dispatcher", "Lms0;", "Lms0;", "schedulerJob", "LZC0;", "f", "LZC0;", Action.SCOPE_ATTRIBUTE, C17296a.f69688o, "kotlinx-coroutines-rx2"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: S41 */
/* loaded from: classes8.dex */
public final class S41 extends AbstractC23437E {

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f33103g = AtomicLongFieldUpdater.newUpdater(S41.class, "workerCounter");
    @JvmField

    /* renamed from: d */
    public final SC0 f33104d;

    /* renamed from: e */
    public final InterfaceC45344ms0 f33105e;

    /* renamed from: f */
    public final ZC0 f33106f;
    private volatile /* synthetic */ long workerCounter;

    @Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J$\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR3\u0010$\u001a\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001f0\u001e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m28432d2 = {"LS41$a;", "Lio/reactivex/E$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "delay", "Ljava/util/concurrent/TimeUnit;", "unit", "Lio/reactivex/disposables/c;", "c", "", "e", "", "dispose", "", "toString", "b", "J", "counter", "LSC0;", "LSC0;", "dispatcher", "Lms0;", DateTokenConverter.CONVERTER_KEY, "Lms0;", "workerJob", "LZC0;", "LZC0;", "workerScope", "LFh0;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "f", "LFh0;", "blockChannel", "Lzh2;", "parentJob", "<init>", "(JLSC0;Lzh2;)V", "kotlinx-coroutines-rx2"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: S41$a */
    /* loaded from: classes8.dex */
    public static final class C7322a extends AbstractC23437E.AbstractC23440c {

        /* renamed from: b */
        public final long f33107b;

        /* renamed from: c */
        public final SC0 f33108c;

        /* renamed from: d */
        public final InterfaceC45344ms0 f33109d;

        /* renamed from: e */
        public final ZC0 f33110e;

        /* renamed from: f */
        public final InterfaceC32846Fh0<Function1<Continuation<? super Unit>, Object>> f33111f;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$1", m28418f = "RxScheduler.kt", m28417i = {0, 1}, m28416l = {189, 82}, m28415m = "invokeSuspend", m28414n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, m28413s = {"L$0", "L$0"})
        /* renamed from: S41$a$a */
        /* loaded from: classes8.dex */
        public static final class C7323a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public Object f33112h;

            /* renamed from: i */
            public Object f33113i;

            /* renamed from: j */
            public int f33114j;

            public C7323a(Continuation<? super C7323a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C7323a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C7323a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:21:0x0051, B:23:0x0059), top: B:36:0x0051 }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006c -> B:17:0x003f). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                InterfaceC44162ks4 interfaceC44162ks4;
                InterfaceC34952Oh0 it;
                C7323a c7323a;
                Object mo31286a;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f33114j;
                try {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                InterfaceC34952Oh0 interfaceC34952Oh0 = (InterfaceC34952Oh0) this.f33113i;
                                interfaceC44162ks4 = (InterfaceC44162ks4) this.f33112h;
                                ResultKt.throwOnFailure(obj);
                                it = interfaceC34952Oh0;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            InterfaceC34952Oh0 interfaceC34952Oh02 = (InterfaceC34952Oh0) this.f33113i;
                            InterfaceC44162ks4 interfaceC44162ks42 = (InterfaceC44162ks4) this.f33112h;
                            ResultKt.throwOnFailure(obj);
                            InterfaceC44162ks4 interfaceC44162ks43 = interfaceC44162ks42;
                            C7323a c7323a2 = this;
                            try {
                                if (!((Boolean) obj).booleanValue()) {
                                    c7323a2.f33112h = interfaceC44162ks43;
                                    c7323a2.f33113i = interfaceC34952Oh02;
                                    c7323a2.f33114j = 2;
                                    if (((Function1) interfaceC34952Oh02.next()).invoke(c7323a2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    it = interfaceC34952Oh02;
                                    c7323a = c7323a2;
                                    interfaceC44162ks4 = interfaceC44162ks43;
                                    c7323a.f33112h = interfaceC44162ks4;
                                    c7323a.f33113i = it;
                                    c7323a.f33114j = 1;
                                    mo31286a = it.mo31286a(c7323a);
                                    if (mo31286a != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    C7323a c7323a3 = c7323a;
                                    interfaceC34952Oh02 = it;
                                    obj = mo31286a;
                                    interfaceC44162ks43 = interfaceC44162ks4;
                                    c7323a2 = c7323a3;
                                    if (!((Boolean) obj).booleanValue()) {
                                        C35654Rh0.m86443a(interfaceC44162ks43, null);
                                        return Unit.INSTANCE;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                interfaceC44162ks4 = interfaceC44162ks43;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    C35654Rh0.m86443a(interfaceC44162ks4, th);
                                    throw th2;
                                }
                            }
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        interfaceC44162ks4 = C7322a.this.f33111f;
                        it = interfaceC44162ks4.iterator();
                    }
                    c7323a = this;
                    c7323a.f33112h = interfaceC44162ks4;
                    c7323a.f33113i = it;
                    c7323a.f33114j = 1;
                    mo31286a = it.mo31286a(c7323a);
                    if (mo31286a != coroutine_suspended) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "task", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", C17296a.f69688o, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Runnable;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: S41$a$b */
        /* loaded from: classes8.dex */
        public static final class C7324b extends Lambda implements Function1<Function1<? super Continuation<? super Unit>, ? extends Object>, Runnable> {

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "run", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
            /* renamed from: S41$a$b$a */
            /* loaded from: classes8.dex */
            public static final class RunnableC7325a implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ C7322a f33117b;

                /* renamed from: c */
                public final /* synthetic */ Function1 f33118c;

                public RunnableC7325a(C7322a c7322a, Function1 function1) {
                    this.f33117b = c7322a;
                    this.f33118c = function1;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f33117b.f33111f.mo2349h(this.f33118c);
                }
            }

            public C7324b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Runnable invoke(Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
                return new RunnableC7325a(C7322a.this, function1);
            }
        }

        public C7322a(long j, SC0 sc0, InterfaceC52943zh2 interfaceC52943zh2) {
            this.f33107b = j;
            this.f33108c = sc0;
            InterfaceC45344ms0 m76947a = XU5.m76947a(interfaceC52943zh2);
            this.f33109d = m76947a;
            ZC0 m71790a = C37824aD0.m71790a(m76947a.plus(sc0));
            this.f33110e = m71790a;
            this.f33111f = C35186Ph0.m89918b(Integer.MAX_VALUE, null, null, 6, null);
            Z30.m73800d(m71790a, null, null, new C7323a(null), 3, null);
        }

        @Override // io.reactivex.AbstractC23437E.AbstractC23440c
        /* renamed from: c */
        public InterfaceC23465c mo32319c(Runnable runnable, long j, TimeUnit timeUnit) {
            InterfaceC23465c m64196e;
            m64196e = C38679bf5.m64196e(this.f33110e, runnable, timeUnit.toMillis(j), new C7324b());
            return m64196e;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            InterfaceC52463ys5.C30763a.m2348a(this.f33111f, null, 1, null);
            InterfaceC52943zh2.C31478a.m550a(this.f33109d, null, 1, null);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return !C37824aD0.m71785f(this.f33110e);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f33108c);
            sb.append(" (worker ");
            sb.append(this.f33107b);
            sb.append(", ");
            sb.append(mo1769e() ? "disposed" : "active");
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "task", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", C17296a.f69688o, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Runnable;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: S41$b */
    /* loaded from: classes8.dex */
    public static final class C7326b extends Lambda implements Function1<Function1<? super Continuation<? super Unit>, ? extends Object>, Runnable> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "kotlinx.coroutines.rx2.DispatcherScheduler$scheduleDirect$1$1$1", m28418f = "RxScheduler.kt", m28417i = {}, m28416l = {60}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: S41$b$a */
        /* loaded from: classes8.dex */
        public static final class C7327a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f33120h;

            /* renamed from: i */
            public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f33121i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C7327a(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super C7327a> continuation) {
                super(2, continuation);
                this.f33121i = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C7327a(this.f33121i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C7327a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f33120h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Function1<Continuation<? super Unit>, Object> function1 = this.f33121i;
                    this.f33120h = 1;
                    if (function1.invoke(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "run", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: S41$b$b */
        /* loaded from: classes8.dex */
        public static final class RunnableC7328b implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ S41 f33122b;

            /* renamed from: c */
            public final /* synthetic */ Function1 f33123c;

            public RunnableC7328b(S41 s41, Function1 function1) {
                this.f33122b = s41;
                this.f33123c = function1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Z30.m73800d(this.f33122b.f33106f, null, null, new C7327a(this.f33123c, null), 3, null);
            }
        }

        public C7326b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Runnable invoke(Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
            return new RunnableC7328b(S41.this, function1);
        }
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: b */
    public AbstractC23437E.AbstractC23440c mo8041b() {
        return new C7322a(f33103g.getAndIncrement(this), this.f33104d, this.f33105e);
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: e */
    public InterfaceC23465c mo32323e(Runnable runnable, long j, TimeUnit timeUnit) {
        InterfaceC23465c m64196e;
        m64196e = C38679bf5.m64196e(this.f33106f, runnable, timeUnit.toMillis(j), new C7326b());
        return m64196e;
    }

    @Override // io.reactivex.AbstractC23437E
    public void shutdown() {
        InterfaceC52943zh2.C31478a.m550a(this.f33105e, null, 1, null);
    }

    public String toString() {
        return this.f33104d.toString();
    }
}
