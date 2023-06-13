package bo.app;

import com.appboy.events.FeedUpdatedEvent;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
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
import org.json.JSONArray;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007BG\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u001b"}, m28432d2 = {"Lbo/app/s;", "", "", "c", "Lbo/app/d;", "b", "apiResponse", C17296a.f69688o, "Lbo/app/n2;", "responseError", "Lbo/app/z1;", "request", "Lbo/app/h2;", "httpConnector", "Lbo/app/g2;", "internalPublisher", "externalPublisher", "Lbo/app/g1;", "feedStorageProvider", "Lbo/app/y1;", "brazeManager", "Lbo/app/a5;", "serverConfigStorage", "Lbo/app/y;", "contentCardsStorage", "<init>", "(Lbo/app/z1;Lbo/app/h2;Lbo/app/g2;Lbo/app/g2;Lbo/app/g1;Lbo/app/y1;Lbo/app/a5;Lbo/app/y;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.s */
/* loaded from: classes.dex */
public final class C13091s {

    /* renamed from: j */
    public static final C13092a f59233j = new C13092a(null);

    /* renamed from: k */
    private static final String f59234k = C43664k20.m29433n(C13091s.class);

    /* renamed from: a */
    private final InterfaceC13280z1 f59235a;

    /* renamed from: b */
    private final InterfaceC12715h2 f59236b;

    /* renamed from: c */
    private final InterfaceC12658g2 f59237c;

    /* renamed from: d */
    private final InterfaceC12658g2 f59238d;

    /* renamed from: e */
    private final C12656g1 f59239e;

    /* renamed from: f */
    private final InterfaceC13231y1 f59240f;

    /* renamed from: g */
    private final C12521a5 f59241g;

    /* renamed from: h */
    private final C13205y f59242h;

    /* renamed from: i */
    private final Map<String, String> f59243i;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0005\u001a\u00020\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lbo/app/s$a;", "", "Lkotlin/Function0;", "", "block", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$a */
    /* loaded from: classes.dex */
    public static final class C13092a {

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.s$a$a */
        /* loaded from: classes.dex */
        public static final class C13093a extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ Object f59244b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13093a(Object obj) {
                super(0);
                this.f59244b = obj;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Encountered exception while parsing server response for ", this.f59244b);
            }
        }

        public /* synthetic */ C13092a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13092a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public final void m63004a(Object obj, Function0<Unit> function0) {
            try {
                function0.invoke();
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, obj, C43664k20.EnumC25082a.E, e, false, new C13093a(obj), 4, null);
            }
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$b */
    /* loaded from: classes.dex */
    public static final class C13094b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ C13082r4 f59245b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13094b(C13082r4 c13082r4) {
            super(0);
            this.f59245b = c13082r4;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Could not parse request parameters for POST request to " + this.f59245b + ", cancelling request.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$c */
    /* loaded from: classes.dex */
    public static final class C13095c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Exception f59246b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13095c(Exception exc) {
            super(0);
            this.f59246b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Experienced network communication exception processing API response. Sending network error event. ", this.f59246b.getMessage());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$d */
    /* loaded from: classes.dex */
    public static final class C13096d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13096d f59247b = new C13096d();

        public C13096d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Experienced exception processing API response. Failing task.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$e */
    /* loaded from: classes.dex */
    public static final class C13097e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13097e(String str) {
            super(0);
            this.f59248b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Processing server response payload for user with id: ", this.f59248b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$f */
    /* loaded from: classes.dex */
    public static final class C13098f extends Lambda implements Function0<Unit> {

        /* renamed from: c */
        final /* synthetic */ C12570d f59250c;

        /* renamed from: d */
        final /* synthetic */ String f59251d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13098f(C12570d c12570d, String str) {
            super(0);
            this.f59250c = c12570d;
            this.f59251d = str;
        }

        /* renamed from: a */
        public final void m62998a() {
            FeedUpdatedEvent m63722a = C13091s.this.f59239e.m63722a(this.f59250c.m63865c(), this.f59251d);
            if (m63722a != null) {
                C13091s.this.f59238d.mo63715a((InterfaceC12658g2) m63722a, (Class<InterfaceC12658g2>) FeedUpdatedEvent.class);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m62998a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$g */
    /* loaded from: classes.dex */
    public static final class C13099g extends Lambda implements Function0<Unit> {

        /* renamed from: c */
        final /* synthetic */ C12570d f59253c;

        /* renamed from: d */
        final /* synthetic */ String f59254d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13099g(C12570d c12570d, String str) {
            super(0);
            this.f59253c = c12570d;
            this.f59254d = str;
        }

        /* renamed from: a */
        public final void m62997a() {
            C40779fA0 m62815a = C13091s.this.f59242h.m62815a(this.f59253c.m63867a(), this.f59254d);
            if (m62815a != null) {
                C13091s.this.f59238d.mo63715a((InterfaceC12658g2) m62815a, (Class<InterfaceC12658g2>) C40779fA0.class);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m62997a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$h */
    /* loaded from: classes.dex */
    public static final class C13100h extends Lambda implements Function0<Unit> {

        /* renamed from: c */
        final /* synthetic */ C12570d f59256c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13100h(C12570d c12570d) {
            super(0);
            this.f59256c = c12570d;
        }

        /* renamed from: a */
        public final void m62996a() {
            C13091s.this.f59241g.m63939b(this.f59256c.m63863e());
            C13091s.this.f59237c.mo63715a((InterfaceC12658g2) new C13283z4(this.f59256c.m63863e()), (Class<InterfaceC12658g2>) C13283z4.class);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m62996a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$i */
    /* loaded from: classes.dex */
    public static final class C13101i extends Lambda implements Function0<Unit> {

        /* renamed from: c */
        final /* synthetic */ C12570d f59258c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13101i(C12570d c12570d) {
            super(0);
            this.f59258c = c12570d;
        }

        /* renamed from: a */
        public final void m62995a() {
            C13091s.this.f59237c.mo63715a((InterfaceC12658g2) new C12926n6(this.f59258c.m63861g()), (Class<InterfaceC12658g2>) C12926n6.class);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m62995a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$j */
    /* loaded from: classes.dex */
    public static final class C13102j extends Lambda implements Function0<Unit> {

        /* renamed from: c */
        final /* synthetic */ C12570d f59260c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13102j(C12570d c12570d) {
            super(0);
            this.f59260c = c12570d;
        }

        /* renamed from: a */
        public final void m62994a() {
            C13091s.this.f59237c.mo63715a((InterfaceC12658g2) new C12917n1(this.f59260c.m63864d()), (Class<InterfaceC12658g2>) C12917n1.class);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m62994a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$k */
    /* loaded from: classes.dex */
    public static final class C13103k extends Lambda implements Function0<Unit> {

        /* renamed from: c */
        final /* synthetic */ C12570d f59262c;

        /* renamed from: d */
        final /* synthetic */ String f59263d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13103k(C12570d c12570d, String str) {
            super(0);
            this.f59262c = c12570d;
            this.f59263d = str;
        }

        /* renamed from: a */
        public final void m62993a() {
            if (C13091s.this.f59235a instanceof C13083r5) {
                this.f59262c.m63862f().mo6938k0(((C13083r5) C13091s.this.f59235a).m63029u());
                C13091s.this.f59237c.mo63715a((InterfaceC12658g2) new C12566c3(((C13083r5) C13091s.this.f59235a).m63028v(), ((C13083r5) C13091s.this.f59235a).m63027w(), this.f59262c.m63862f(), this.f59263d), (Class<InterfaceC12658g2>) C12566c3.class);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m62993a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$l */
    /* loaded from: classes.dex */
    public static final class C13104l extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC12918n2 f59264b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13104l(InterfaceC12918n2 interfaceC12918n2) {
            super(0);
            this.f59264b = interfaceC12918n2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Received server error from request: ", this.f59264b.mo62921a());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$m */
    /* loaded from: classes.dex */
    public static final class C13105m extends Lambda implements Function0<String> {

        /* renamed from: c */
        final /* synthetic */ int f59266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13105m(int i) {
            super(0);
            this.f59266c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Retrying request: " + C13091s.this.f59235a + " after delay of " + this.f59266c + " ms";
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.requests.BrazeRequestTask$processResponseError$3", m28418f = "BrazeRequestTask.kt", m28417i = {}, m28416l = {195}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: bo.app.s$n */
    /* loaded from: classes.dex */
    public static final class C13106n extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f59267b;

        /* renamed from: c */
        final /* synthetic */ int f59268c;

        /* renamed from: d */
        final /* synthetic */ C13091s f59269d;

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.s$n$a */
        /* loaded from: classes.dex */
        public static final class C13107a extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ C13091s f59270b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13107a(C13091s c13091s) {
                super(0);
                this.f59270b = c13091s;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Adding retried request to dispatch: ", this.f59270b.f59235a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13106n(int i, C13091s c13091s, Continuation<? super C13106n> continuation) {
            super(2, continuation);
            this.f59268c = i;
            this.f59269d = c13091s;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C13106n) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C13106n(this.f59268c, this.f59269d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f59267b;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f59267b = 1;
                if (C48120rZ0.m15768a(this.f59268c, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C43664k20.m29441f(C43664k20.f93782a, C13091s.f59234k, C43664k20.EnumC25082a.V, null, false, new C13107a(this.f59269d), 12, null);
            this.f59269d.f59240f.mo62753a(this.f59269d.f59235a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s$o */
    /* loaded from: classes.dex */
    public static final class C13108o extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13108o f59271b = new C13108o();

        public C13108o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Api response was null, failing task.";
        }
    }

    public C13091s(InterfaceC13280z1 request, InterfaceC12715h2 httpConnector, InterfaceC12658g2 internalPublisher, InterfaceC12658g2 externalPublisher, C12656g1 feedStorageProvider, InterfaceC13231y1 brazeManager, C12521a5 serverConfigStorage, C13205y contentCardsStorage) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(feedStorageProvider, "feedStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(serverConfigStorage, "serverConfigStorage");
        Intrinsics.checkNotNullParameter(contentCardsStorage, "contentCardsStorage");
        this.f59235a = request;
        this.f59236b = httpConnector;
        this.f59237c = internalPublisher;
        this.f59238d = externalPublisher;
        this.f59239e = feedStorageProvider;
        this.f59240f = brazeManager;
        this.f59241g = serverConfigStorage;
        this.f59242h = contentCardsStorage;
        Map<String, String> m63197a = C12983o4.m63197a();
        this.f59243i = m63197a;
        request.mo62595a(m63197a);
    }

    /* renamed from: b */
    public final C12570d m63014b() {
        try {
            C13082r4 mo63062h = this.f59235a.mo63062h();
            JSONObject mo62580l = this.f59235a.mo62580l();
            if (mo62580l == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C13094b(mo63062h), 6, null);
                return null;
            }
            return new C12570d(this.f59236b.mo63101a(mo63062h, this.f59243i, mo62580l), this.f59235a, this.f59240f);
        } catch (Exception e) {
            if (e instanceof C12910m3) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C13095c(e), 4, null);
                this.f59237c.mo63715a((InterfaceC12658g2) new C13020p4(this.f59235a), (Class<InterfaceC12658g2>) C13020p4.class);
                this.f59238d.mo63715a((InterfaceC12658g2) new C45443n20(e, this.f59235a), (Class<InterfaceC12658g2>) C45443n20.class);
            }
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13096d.f59247b, 4, null);
            return null;
        }
    }

    /* renamed from: c */
    public final void m63011c() {
        C12570d m63014b = m63014b();
        if (m63014b != null) {
            m63017a(m63014b);
            this.f59237c.mo63715a((InterfaceC12658g2) new C13053q4(this.f59235a), (Class<InterfaceC12658g2>) C13053q4.class);
            if (m63014b.m63866b() instanceof C13147t4) {
                this.f59237c.mo63715a((InterfaceC12658g2) new C12916n0(this.f59235a), (Class<InterfaceC12658g2>) C12916n0.class);
            } else {
                this.f59237c.mo63715a((InterfaceC12658g2) new C13013p0(this.f59235a), (Class<InterfaceC12658g2>) C13013p0.class);
            }
        } else {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C13108o.f59271b, 6, null);
            C12919n3 c12919n3 = new C12919n3("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", this.f59235a);
            this.f59235a.mo63034a(this.f59237c, this.f59238d, c12919n3);
            this.f59237c.mo63715a((InterfaceC12658g2) new C12916n0(this.f59235a), (Class<InterfaceC12658g2>) C12916n0.class);
            m63016a(c12919n3);
        }
        this.f59235a.mo63063b(this.f59237c);
    }

    /* renamed from: a */
    public final void m63017a(C12570d apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        if (apiResponse.m63866b() == null) {
            this.f59235a.mo62660a(this.f59238d, apiResponse);
        } else {
            m63016a(apiResponse.m63866b());
            this.f59235a.mo63034a(this.f59237c, this.f59238d, apiResponse.m63866b());
        }
        m63013b(apiResponse);
    }

    /* renamed from: a */
    public final void m63016a(InterfaceC12918n2 responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.W, null, false, new C13104l(responseError), 6, null);
        this.f59237c.mo63715a((InterfaceC12658g2) new C12568c5(responseError), (Class<InterfaceC12658g2>) C12568c5.class);
        if (this.f59235a.mo63033a(responseError)) {
            int mo62925a = this.f59235a.mo63031m().mo62925a();
            C43664k20.m29442e(c43664k20, this, null, null, false, new C13105m(mo62925a), 7, null);
            Z30.m73800d(Z10.f47750b, null, null, new C13106n(mo62925a, this, null), 3, null);
        }
    }

    /* renamed from: b */
    public final void m63013b(C12570d apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        String mo62760a = this.f59240f.mo62760a();
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C13097e(mo62760a), 6, null);
        JSONArray m63865c = apiResponse.m63865c();
        if (m63865c != null) {
            f59233j.m63004a(m63865c, new C13098f(apiResponse, mo62760a));
        }
        C13197x m63867a = apiResponse.m63867a();
        if (m63867a != null) {
            f59233j.m63004a(m63867a, new C13099g(apiResponse, mo62760a));
        }
        C13235y4 m63863e = apiResponse.m63863e();
        if (m63863e != null) {
            f59233j.m63004a(m63863e, new C13100h(apiResponse));
        }
        List<InterfaceC13232y2> m63861g = apiResponse.m63861g();
        if (m63861g != null) {
            f59233j.m63004a(m63861g, new C13101i(apiResponse));
        }
        List<C39514d20> m63864d = apiResponse.m63864d();
        if (m63864d != null) {
            f59233j.m63004a(m63864d, new C13102j(apiResponse));
        }
        InterfaceC50985wO1 m63862f = apiResponse.m63862f();
        if (m63862f == null) {
            return;
        }
        f59233j.m63004a(m63862f, new C13103k(apiResponse, mo62760a));
    }
}
