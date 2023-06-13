package bo.app;

import bo.app.C12614f;
import bo.app.C12896m0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.events.IEventSubscriber;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B1\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bJ\u0006\u0010\u0010\u001a\u00020\u0006R\u0014\u0010\u0013\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0012¨\u0006\u001f"}, m28432d2 = {"Lbo/app/f;", "Lbo/app/e2;", "Lzh2;", "c", "Lbo/app/z1;", "request", "", C17296a.f69688o, "b", "Lbo/app/u1;", "event", "Lbo/app/g2;", "internalEventPublisher", "Lbo/app/f5;", "sessionId", "eventMessenger", DateTokenConverter.CONVERTER_KEY, "Lbo/app/g0;", "()Lbo/app/g0;", "dataSyncRequest", "LX10;", "appConfigurationProvider", "internalIEventMessenger", "Lbo/app/m2;", "requestExecutor", "Lbo/app/o0;", "dispatchManager", "", "mockAllNetworkRequests", "<init>", "(LX10;Lbo/app/g2;Lbo/app/m2;Lbo/app/o0;Z)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.f */
/* loaded from: classes.dex */
public final class C12614f implements InterfaceC12599e2 {

    /* renamed from: i */
    public static final C12615a f58400i = new C12615a(null);

    /* renamed from: j */
    private static final String f58401j = C43664k20.m29433n(C12614f.class);

    /* renamed from: a */
    private final X10 f58402a;

    /* renamed from: b */
    private final InterfaceC12909m2 f58403b;

    /* renamed from: c */
    private final C12943o0 f58404c;

    /* renamed from: d */
    private final boolean f58405d;

    /* renamed from: e */
    private final ReentrantLock f58406e;

    /* renamed from: f */
    private final C13041q0 f58407f;

    /* renamed from: g */
    private volatile boolean f58408g;

    /* renamed from: h */
    private volatile InterfaceC52943zh2 f58409h;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lbo/app/f$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f$a */
    /* loaded from: classes.dex */
    public static final class C12615a {
        public /* synthetic */ C12615a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12615a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: bo.app.f$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C12616b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58410a;

        static {
            int[] iArr = new int[C12896m0.EnumC12899b.values().length];
            iArr[C12896m0.EnumC12899b.ADD_PENDING_BRAZE_EVENT.ordinal()] = 1;
            iArr[C12896m0.EnumC12899b.ADD_BRAZE_EVENT.ordinal()] = 2;
            iArr[C12896m0.EnumC12899b.FLUSH_PENDING_BRAZE_EVENTS.ordinal()] = 3;
            iArr[C12896m0.EnumC12899b.ADD_REQUEST.ordinal()] = 4;
            f58410a = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.dispatch.AutomaticDispatchDecorator$kickoffDispatchJob$1", m28418f = "AutomaticDispatchDecorator.kt", m28417i = {0}, m28416l = {128}, m28415m = "invokeSuspend", m28414n = {"$this$launch"}, m28413s = {"L$0"})
    /* renamed from: bo.app.f$c */
    /* loaded from: classes.dex */
    public static final class C12617c extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f58411b;

        /* renamed from: c */
        private /* synthetic */ Object f58412c;

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.f$c$a */
        /* loaded from: classes.dex */
        public static final class C12618a extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ Exception f58414b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12618a(Exception exc) {
                super(0);
                this.f58414b = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Automatic thread interrupted! This is usually the result of calling changeUser(). [" + this.f58414b + ']';
            }
        }

        public C12617c(Continuation<? super C12617c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C12617c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12617c c12617c = new C12617c(continuation);
            c12617c.f58412c = obj;
            return c12617c;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:4|(3:5|6|7)|8|9|10|(6:12|(1:14)|8|9|10|(2:16|17)(0))(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
            r7 = r3;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: Exception -> 0x0049, TRY_ENTER, TryCatch #0 {Exception -> 0x0049, blocks: (B:18:0x0041, B:15:0x0030), top: B:25:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:25:0x0041). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            ZC0 zc0;
            C12617c c12617c;
            Object m63259a;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f58411b;
            if (i != 0) {
                if (i == 1) {
                    zc0 = (ZC0) this.f58412c;
                    try {
                        ResultKt.throwOnFailure(obj);
                        m63259a = obj;
                        c12617c = this;
                    } catch (Exception e) {
                        Exception exc = e;
                        c12617c = this;
                        C43664k20.m29441f(C43664k20.f93782a, C12614f.f58401j, C43664k20.EnumC25082a.V, exc, false, new C12618a(exc), 8, null);
                        if (C37824aD0.m71785f(zc0)) {
                        }
                    }
                    C12614f.this.m63794a((InterfaceC13280z1) m63259a);
                    if (C37824aD0.m71785f(zc0)) {
                        C12943o0 c12943o0 = C12614f.this.f58404c;
                        c12617c.f58412c = zc0;
                        c12617c.f58411b = 1;
                        m63259a = c12943o0.m63259a(c12617c);
                        if (m63259a == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        C12614f.this.m63794a((InterfaceC13280z1) m63259a);
                        if (C37824aD0.m71785f(zc0)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                zc0 = (ZC0) this.f58412c;
                c12617c = this;
                if (C37824aD0.m71785f(zc0)) {
                }
            }
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f$d */
    /* loaded from: classes.dex */
    public static final class C12619d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12619d f58415b = new C12619d();

        public C12619d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Automatic request execution start was previously requested, continuing without action.";
        }
    }

    public C12614f(X10 appConfigurationProvider, final InterfaceC12658g2 internalIEventMessenger, InterfaceC12909m2 requestExecutor, C12943o0 dispatchManager, boolean z) {
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "internalIEventMessenger");
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(dispatchManager, "dispatchManager");
        this.f58402a = appConfigurationProvider;
        this.f58403b = requestExecutor;
        this.f58404c = dispatchManager;
        this.f58405d = z;
        this.f58406e = new ReentrantLock();
        this.f58407f = new C13041q0(internalIEventMessenger, z);
        internalIEventMessenger.mo63714b(new IEventSubscriber() { // from class: oN6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C12614f.m63798a(C12614f.this, internalIEventMessenger, (C12896m0) obj);
            }
        }, C12896m0.class);
    }

    /* renamed from: c */
    private final InterfaceC52943zh2 m63789c() {
        InterfaceC52943zh2 m73800d;
        m73800d = Z30.m73800d(Z10.f47750b, null, null, new C12617c(null), 3, null);
        return m73800d;
    }

    /* renamed from: d */
    public final void m63788d() {
        ReentrantLock reentrantLock = this.f58406e;
        reentrantLock.lock();
        try {
            if (this.f58408g) {
                C43664k20.m29441f(C43664k20.f93782a, f58401j, null, null, false, C12619d.f58415b, 14, null);
                return;
            }
            this.f58409h = m63789c();
            this.f58408g = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    private final C12652g0 m63793b() {
        return new C12652g0(this.f58402a.getBaseUrlForRequests(), null, 2, null);
    }

    /* renamed from: b */
    public void m63791b(InterfaceC13160u1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f58404c.m63257b(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63798a(C12614f this$0, InterfaceC12658g2 internalIEventMessenger, C12896m0 c12896m0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "$internalIEventMessenger");
        C12896m0.EnumC12899b m63329a = c12896m0.m63329a();
        InterfaceC13160u1 m63328b = c12896m0.m63328b();
        C12648f5 m63327c = c12896m0.m63327c();
        InterfaceC13280z1 m63326d = c12896m0.m63326d();
        int i = C12616b.f58410a[m63329a.ordinal()];
        if (i == 1) {
            if (m63328b == null) {
                return;
            }
            this$0.m63791b(m63328b);
        } else if (i == 2) {
            if (m63328b == null) {
                return;
            }
            this$0.mo63261a(m63328b);
        } else if (i == 3) {
            if (m63327c == null) {
                return;
            }
            this$0.m63800a(m63327c);
        } else if (i == 4 && m63326d != null) {
            this$0.m63795a(internalIEventMessenger, m63326d);
        }
    }

    /* renamed from: b */
    private final void m63790b(InterfaceC13280z1 interfaceC13280z1) {
        if (!interfaceC13280z1.mo62594b() && !this.f58405d) {
            this.f58403b.mo63105a(interfaceC13280z1);
        } else {
            this.f58407f.mo63105a(interfaceC13280z1);
        }
    }

    @Override // bo.app.InterfaceC12599e2
    /* renamed from: a */
    public void mo63261a(InterfaceC13160u1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f58404c.mo63261a(event);
    }

    /* renamed from: a */
    public void m63795a(InterfaceC12658g2 internalEventPublisher, InterfaceC13280z1 request) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f58404c.m63262a(internalEventPublisher, request);
    }

    /* renamed from: a */
    public void m63800a(C12648f5 sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f58404c.m63263a(sessionId);
    }

    /* renamed from: a */
    public final void m63796a(InterfaceC12658g2 eventMessenger) {
        Intrinsics.checkNotNullParameter(eventMessenger, "eventMessenger");
        ReentrantLock reentrantLock = this.f58406e;
        reentrantLock.lock();
        try {
            InterfaceC52943zh2 interfaceC52943zh2 = this.f58409h;
            if (interfaceC52943zh2 != null) {
                InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
            }
            this.f58409h = null;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (!this.f58404c.m63258b()) {
                this.f58404c.m63262a(eventMessenger, m63793b());
            }
            InterfaceC13280z1 m63254d = this.f58404c.m63254d();
            if (m63254d != null) {
                m63790b(m63254d);
            }
            eventMessenger.mo63717a();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m63794a(InterfaceC13280z1 interfaceC13280z1) {
        if (!interfaceC13280z1.mo62594b() && !this.f58405d) {
            this.f58403b.mo63104b(interfaceC13280z1);
        } else {
            this.f58407f.mo63104b(interfaceC13280z1);
        }
    }
}
