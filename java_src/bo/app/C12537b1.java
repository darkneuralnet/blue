package bo.app;

import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0016"}, m28432d2 = {"Lbo/app/b1;", "Lbo/app/v1;", "", "throwable", "", C17296a.f69688o, "", "id", "Lkotlin/Function0;", "block", "Lbo/app/u1;", "event", "", "events", "", "()Ljava/util/Collection;", "allEvents", "storage", "Lbo/app/g2;", "eventPublisher", "<init>", "(Lbo/app/v1;Lbo/app/g2;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.b1 */
/* loaded from: classes.dex */
public final class C12537b1 implements InterfaceC13174v1 {

    /* renamed from: a */
    private final InterfaceC13174v1 f58250a;

    /* renamed from: b */
    private final InterfaceC12658g2 f58251b;

    /* renamed from: c */
    private boolean f58252c;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b1$a */
    /* loaded from: classes.dex */
    public static final class C12538a extends Lambda implements Function0<Unit> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13160u1 f58254c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12538a(InterfaceC13160u1 interfaceC13160u1) {
            super(0);
            this.f58254c = interfaceC13160u1;
        }

        /* renamed from: a */
        public final void m63902a() {
            C12537b1.this.f58250a.mo62877a(this.f58254c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m63902a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b1$b */
    /* loaded from: classes.dex */
    public static final class C12539b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12539b f58255b = new C12539b();

        public C12539b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Storage provider is closed. Not getting all events.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b1$c */
    /* loaded from: classes.dex */
    public static final class C12540c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12540c f58256b = new C12540c();

        public C12540c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get all events from storage.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b1$d */
    /* loaded from: classes.dex */
    public static final class C12541d extends Lambda implements Function0<Unit> {

        /* renamed from: c */
        final /* synthetic */ Set<InterfaceC13160u1> f58258c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12541d(Set<? extends InterfaceC13160u1> set) {
            super(0);
            this.f58258c = set;
        }

        /* renamed from: a */
        public final void m63899a() {
            C12537b1.this.f58250a.mo62876a(this.f58258c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m63899a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b1$e */
    /* loaded from: classes.dex */
    public static final class C12542e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58259b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12542e(String str) {
            super(0);
            this.f58259b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Storage provider is closed. Failed to ", this.f58259b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.storage.EventStorageDecorator$doCall$2", m28418f = "EventStorageDecorator.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: bo.app.b1$f */
    /* loaded from: classes.dex */
    public static final class C12543f extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f58260b;

        /* renamed from: c */
        private /* synthetic */ Object f58261c;

        /* renamed from: d */
        final /* synthetic */ Function0<Unit> f58262d;

        /* renamed from: e */
        final /* synthetic */ C12537b1 f58263e;

        /* renamed from: f */
        final /* synthetic */ String f58264f;

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.b1$f$a */
        /* loaded from: classes.dex */
        public static final class C12544a extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f58265b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12544a(String str) {
                super(0);
                this.f58265b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Failed to ", this.f58265b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12543f(Function0<Unit> function0, C12537b1 c12537b1, String str, Continuation<? super C12543f> continuation) {
            super(2, continuation);
            this.f58262d = function0;
            this.f58263e = c12537b1;
            this.f58264f = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C12543f) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12543f c12543f = new C12543f(this.f58262d, this.f58263e, this.f58264f, continuation);
            c12543f.f58261c = obj;
            return c12543f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f58260b == 0) {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.f58261c;
                try {
                    this.f58262d.invoke();
                } catch (Exception e) {
                    C43664k20.m29442e(C43664k20.f93782a, zc0, C43664k20.EnumC25082a.E, e, false, new C12544a(this.f58264f), 4, null);
                    this.f58263e.m63903a(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b1$g */
    /* loaded from: classes.dex */
    public static final class C12545g extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12545g f58266b = new C12545g();

        public C12545g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log storage exception";
        }
    }

    public C12537b1(InterfaceC13174v1 storage, InterfaceC12658g2 eventPublisher) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        this.f58250a = storage;
        this.f58251b = eventPublisher;
    }

    @Override // bo.app.InterfaceC13174v1
    /* renamed from: a */
    public Collection<InterfaceC13160u1> mo62878a() {
        Set emptySet;
        Set emptySet2;
        if (this.f58252c) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C12539b.f58255b, 6, null);
            emptySet2 = SetsKt__SetsKt.emptySet();
            return emptySet2;
        }
        try {
            return this.f58250a.mo62878a();
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12540c.f58256b, 4, null);
            m63903a(e);
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        }
    }

    @Override // bo.app.InterfaceC13174v1
    /* renamed from: a */
    public void mo62877a(InterfaceC13160u1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m63904a(Intrinsics.stringPlus("add event ", event), new C12538a(event));
    }

    @Override // bo.app.InterfaceC13174v1
    /* renamed from: a */
    public void mo62876a(Set<? extends InterfaceC13160u1> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        m63904a(Intrinsics.stringPlus("delete events ", events), new C12541d(events));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m63903a(Throwable th) {
        try {
            this.f58251b.mo63715a((InterfaceC12658g2) new C12912m5("A storage exception has occurred!", th), (Class<InterfaceC12658g2>) C12912m5.class);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12545g.f58266b, 4, null);
        }
    }

    /* renamed from: a */
    private final void m63904a(String str, Function0<Unit> function0) {
        if (this.f58252c) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12542e(str), 6, null);
        } else {
            Z30.m73800d(Z10.f47750b, null, null, new C12543f(function0, this, str, null), 3, null);
        }
    }
}
