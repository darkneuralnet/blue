package bo.app;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.Appboy;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\bB/\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u0005\u001a\u00020\rJ\u0013\u0010\b\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0007R\u0011\u0010\u0013\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"Lbo/app/o0;", "Lbo/app/e2;", "Lbo/app/u1;", "event", "", "b", "Lbo/app/f5;", "sessionId", C17296a.f69688o, "Lbo/app/g2;", "internalEventPublisher", "Lbo/app/z1;", "request", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "brazeRequest", "Lbo/app/k;", "()Lbo/app/k;", "brazeEventsForDispatch", "c", "()Z", "isNetworkRequestsOffline", "Lbo/app/p6;", "userCache", "Lbo/app/c2;", "deviceDataProvider", "LX10;", "configurationProvider", "Lbo/app/u4;", "sdkAuthenticationCache", "Lbo/app/w4;", "sdkMetadataCache", "<init>", "(Lbo/app/p6;Lbo/app/c2;LX10;Lbo/app/u4;Lbo/app/w4;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.o0 */
/* loaded from: classes.dex */
public final class C12943o0 implements InterfaceC12599e2 {

    /* renamed from: i */
    public static final C12944a f58975i = new C12944a(null);

    /* renamed from: a */
    private final C13023p6 f58976a;

    /* renamed from: b */
    private final InterfaceC12565c2 f58977b;

    /* renamed from: c */
    private final X10 f58978c;

    /* renamed from: d */
    private final C13165u4 f58979d;

    /* renamed from: e */
    private final C13192w4 f58980e;

    /* renamed from: f */
    private final InterfaceC32846Fh0<InterfaceC13280z1> f58981f;

    /* renamed from: g */
    private final ConcurrentHashMap<String, InterfaceC13160u1> f58982g;

    /* renamed from: h */
    private final ConcurrentHashMap<String, InterfaceC13160u1> f58983h;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0010J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087T¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u0012\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lbo/app/o0$a;", "", "Lbo/app/c2;", "deviceDataProvider", "LX10;", "configurationProvider", "Lbo/app/u4;", "sdkAuthenticationCache", "Lbo/app/z1;", "brazeRequest", "", C17296a.f69688o, "", "MAX_EVENTS_PER_DISPATCH", "I", "getMAX_EVENTS_PER_DISPATCH$annotations", "()V", "REQUEST_QUEUE_SIZE", "getREQUEST_QUEUE_SIZE$annotations", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o0$a */
    /* loaded from: classes.dex */
    public static final class C12944a {

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.o0$a$a */
        /* loaded from: classes.dex */
        public static final class C12945a extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ C13165u4 f58984b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12945a(C13165u4 c13165u4) {
                super(0);
                this.f58984b = c13165u4;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Adding SDK Auth token to request '" + ((Object) this.f58984b.m62888a()) + CoreConstants.SINGLE_QUOTE_CHAR;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.o0$a$b */
        /* loaded from: classes.dex */
        public static final class C12946b extends Lambda implements Function0<String> {

            /* renamed from: b */
            public static final C12946b f58985b = new C12946b();

            public C12946b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "SDK Auth is disabled, not adding token to request";
            }
        }

        public /* synthetic */ C12944a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void m63253a(InterfaceC12565c2 deviceDataProvider, X10 configurationProvider, C13165u4 sdkAuthenticationCache, InterfaceC13280z1 brazeRequest) {
            Intrinsics.checkNotNullParameter(deviceDataProvider, "deviceDataProvider");
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            Intrinsics.checkNotNullParameter(sdkAuthenticationCache, "sdkAuthenticationCache");
            Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
            String deviceId = deviceDataProvider.getDeviceId();
            if (deviceId != null) {
                brazeRequest.mo62593b(deviceId);
            }
            brazeRequest.mo62585f(configurationProvider.getBrazeApiKey().toString());
            brazeRequest.mo62583g("21.0.0");
            brazeRequest.mo62598a(Long.valueOf(C46287oT0.m21027i()));
            if (configurationProvider.isSdkAuthenticationEnabled()) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12945a(sdkAuthenticationCache), 6, null);
                brazeRequest.mo62589d(sdkAuthenticationCache.m62888a());
                return;
            }
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C12946b.f58985b, 6, null);
        }

        private C12944a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o0$b */
    /* loaded from: classes.dex */
    public static final class C12947b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12947b f58986b = new C12947b();

        public C12947b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Network requests are offline, not adding request to queue.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o0$c */
    /* loaded from: classes.dex */
    public static final class C12948c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58987b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12948c(String str) {
            super(0);
            this.f58987b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Added request to dispatcher with parameters: \n", this.f58987b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o0$d */
    /* loaded from: classes.dex */
    public static final class C12949d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58988b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12949d(String str) {
            super(0);
            this.f58988b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not add request to dispatcher as queue is full or closed. Marking as complete. Incoming Request: \n", this.f58988b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o0$e */
    /* loaded from: classes.dex */
    public static final class C12950e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13160u1 f58989b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12950e(InterfaceC13160u1 interfaceC13160u1) {
            super(0);
            this.f58989b = interfaceC13160u1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Event dispatched: " + this.f58989b.forJsonPut() + " with uid: " + this.f58989b.mo62893r();
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o0$f */
    /* loaded from: classes.dex */
    public static final class C12951f extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12951f f58990b = new C12951f();

        public C12951f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o0$g */
    /* loaded from: classes.dex */
    public static final class C12952g extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12952g f58991b = new C12952g();

        public C12952g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Flushing pending events to dispatcher map";
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.braze.dispatch.DispatchManager", m28418f = "DispatchManager.kt", m28417i = {0}, m28416l = {SyslogConstants.LOG_LOCAL2}, m28415m = "takeRequest", m28414n = {"this"}, m28413s = {"L$0"})
    /* renamed from: bo.app.o0$h */
    /* loaded from: classes.dex */
    public static final class C12953h extends ContinuationImpl {

        /* renamed from: b */
        Object f58992b;

        /* renamed from: c */
        /* synthetic */ Object f58993c;

        /* renamed from: e */
        int f58995e;

        public C12953h(Continuation<? super C12953h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58993c = obj;
            this.f58995e |= Integer.MIN_VALUE;
            return C12943o0.this.m63259a(this);
        }
    }

    public C12943o0(C13023p6 userCache, InterfaceC12565c2 deviceDataProvider, X10 configurationProvider, C13165u4 sdkAuthenticationCache, C13192w4 sdkMetadataCache) {
        Intrinsics.checkNotNullParameter(userCache, "userCache");
        Intrinsics.checkNotNullParameter(deviceDataProvider, "deviceDataProvider");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(sdkAuthenticationCache, "sdkAuthenticationCache");
        Intrinsics.checkNotNullParameter(sdkMetadataCache, "sdkMetadataCache");
        this.f58976a = userCache;
        this.f58977b = deviceDataProvider;
        this.f58978c = configurationProvider;
        this.f58979d = sdkAuthenticationCache;
        this.f58980e = sdkMetadataCache;
        this.f58981f = C35186Ph0.m89918b(1000, null, null, 6, null);
        this.f58982g = new ConcurrentHashMap<>();
        this.f58983h = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final synchronized C12810k m63264a() {
        LinkedHashSet linkedHashSet;
        Collection<InterfaceC13160u1> values = this.f58982g.values();
        Intrinsics.checkNotNullExpressionValue(values, "brazeEventMap.values");
        linkedHashSet = new LinkedHashSet();
        Iterator<InterfaceC13160u1> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC13160u1 event = it.next();
            Intrinsics.checkNotNullExpressionValue(event, "event");
            linkedHashSet.add(event);
            values.remove(event);
            C43664k20 c43664k20 = C43664k20.f93782a;
            C43664k20.m29442e(c43664k20, this, null, null, false, new C12950e(event), 7, null);
            if (linkedHashSet.size() >= 32) {
                C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.I, null, false, C12951f.f58990b, 6, null);
                break;
            }
        }
        return new C12810k(linkedHashSet);
    }

    /* renamed from: b */
    public synchronized void m63257b(InterfaceC13160u1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f58983h.putIfAbsent(event.mo62893r(), event);
    }

    /* renamed from: c */
    public final boolean m63255c() {
        return Appboy.getOutboundNetworkRequestsOffline();
    }

    /* renamed from: d */
    public final InterfaceC13280z1 m63254d() {
        InterfaceC13280z1 interfaceC13280z1 = (InterfaceC13280z1) C35420Qh0.m88184f(this.f58981f.mo28254l());
        if (interfaceC13280z1 == null) {
            return null;
        }
        m63256b(interfaceC13280z1);
        return interfaceC13280z1;
    }

    /* renamed from: b */
    public final boolean m63258b() {
        return !this.f58981f.isEmpty();
    }

    /* renamed from: b */
    public final synchronized InterfaceC13280z1 m63256b(InterfaceC13280z1 brazeRequest) {
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        brazeRequest.mo62597a(this.f58976a.m63130f());
        f58975i.m63253a(this.f58977b, this.f58978c, this.f58979d, brazeRequest);
        if (brazeRequest.mo62584g()) {
            m63260a(brazeRequest);
        }
        return brazeRequest;
    }

    /* renamed from: a */
    public synchronized void m63263a(C12648f5 sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        if (this.f58983h.isEmpty()) {
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12952g.f58991b, 7, null);
        Collection<InterfaceC13160u1> values = this.f58983h.values();
        Intrinsics.checkNotNullExpressionValue(values, "pendingBrazeEventMap.values");
        for (InterfaceC13160u1 interfaceC13160u1 : values) {
            interfaceC13160u1.mo62900a(sessionId);
        }
        this.f58982g.putAll(this.f58983h);
        this.f58983h.clear();
    }

    @Override // bo.app.InterfaceC12599e2
    /* renamed from: a */
    public synchronized void mo63261a(InterfaceC13160u1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f58982g.putIfAbsent(event.mo62893r(), event);
    }

    /* renamed from: a */
    public void m63262a(InterfaceC12658g2 internalEventPublisher, InterfaceC13280z1 request) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(request, "request");
        if (m63255c()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C12947b.f58986b, 6, null);
            return;
        }
        String m115350i = C31696Aj2.m115350i(request.mo62580l());
        request.mo63064a(internalEventPublisher);
        if (C35420Qh0.m88180j(this.f58981f.mo2349h(request))) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12948c(m115350i), 6, null);
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, null, false, new C12949d(m115350i), 6, null);
        request.mo63063b(internalEventPublisher);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m63259a(Continuation<? super InterfaceC13280z1> continuation) {
        C12953h c12953h;
        Object coroutine_suspended;
        int i;
        C12943o0 c12943o0;
        if (continuation instanceof C12953h) {
            c12953h = (C12953h) continuation;
            int i2 = c12953h.f58995e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c12953h.f58995e = i2 - Integer.MIN_VALUE;
                Object obj = c12953h.f58993c;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c12953h.f58995e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC32846Fh0<InterfaceC13280z1> interfaceC32846Fh0 = this.f58981f;
                    c12953h.f58992b = this;
                    c12953h.f58995e = 1;
                    obj = interfaceC32846Fh0.mo28256G(c12953h);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c12943o0 = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    c12943o0 = (C12943o0) c12953h.f58992b;
                    ResultKt.throwOnFailure(obj);
                }
                return c12943o0.m63256b((InterfaceC13280z1) obj);
            }
        }
        c12953h = new C12953h(continuation);
        Object obj2 = c12953h.f58993c;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c12953h.f58995e;
        if (i != 0) {
        }
        return c12943o0.m63256b((InterfaceC13280z1) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x0038, B:12:0x003d, B:14:0x0055, B:6:0x002d), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x0038, B:12:0x003d, B:14:0x0055, B:6:0x002d), top: B:20:0x0001 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m63260a(InterfaceC13280z1 brazeRequest) {
        boolean z;
        C12810k m63264a;
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        brazeRequest.mo62591c(this.f58977b.mo63508c());
        brazeRequest.mo62599a(this.f58978c.getSdkFlavor());
        brazeRequest.mo62587e(this.f58977b.mo63510a());
        C12697h0 mo63509b = this.f58977b.mo63509b();
        brazeRequest.mo62602a(mo63509b);
        if (mo63509b != null) {
            z = true;
            if (mo63509b.m63652v()) {
                if (z) {
                    this.f58976a.m63126h();
                }
                brazeRequest.mo62600a(this.f58976a.m63972a());
                m63264a = m63264a();
                brazeRequest.mo62601a(m63264a);
                if (m63264a.m63468a()) {
                    brazeRequest.mo62596a(this.f58980e.m62841b(this.f58978c.getSdkMetadata()));
                }
            }
        }
        z = false;
        if (z) {
        }
        brazeRequest.mo62600a(this.f58976a.m63972a());
        m63264a = m63264a();
        brazeRequest.mo62601a(m63264a);
        if (m63264a.m63468a()) {
        }
    }
}
