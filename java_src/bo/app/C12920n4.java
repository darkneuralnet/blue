package bo.app;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0018"}, m28432d2 = {"Lbo/app/n4;", "Lbo/app/m2;", "Lbo/app/z1;", "brazeRequest", "", C17296a.f69688o, "Lbo/app/l2;", "request", "b", "Lbo/app/h2;", "httpConnector", "Lbo/app/g2;", "internalEventPublisher", "externalEventPublisher", "Lbo/app/g1;", "feedStorageProvider", "Lbo/app/a5;", "serverConfigStorageProvider", "Lbo/app/y;", "contentCardsStorageProvider", "Lbo/app/y1;", "brazeManager", "<init>", "(Lbo/app/h2;Lbo/app/g2;Lbo/app/g2;Lbo/app/g1;Lbo/app/a5;Lbo/app/y;Lbo/app/y1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.n4 */
/* loaded from: classes.dex */
public final class C12920n4 implements InterfaceC12909m2 {

    /* renamed from: a */
    private final InterfaceC12715h2 f58934a;

    /* renamed from: b */
    private final InterfaceC12658g2 f58935b;

    /* renamed from: c */
    private final InterfaceC12658g2 f58936c;

    /* renamed from: d */
    private final C12656g1 f58937d;

    /* renamed from: e */
    private final C12521a5 f58938e;

    /* renamed from: f */
    private final C13205y f58939f;

    /* renamed from: g */
    private final InterfaceC13231y1 f58940g;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.n4$a */
    /* loaded from: classes.dex */
    public static final class C12921a extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12921a f58941b = new C12921a();

        public C12921a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Request is null. Cannot execute request.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.requests.RequestExecutor$execute$2", m28418f = "RequestExecutor.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: bo.app.n4$b */
    /* loaded from: classes.dex */
    public static final class C12922b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f58942b;

        /* renamed from: d */
        final /* synthetic */ InterfaceC13280z1 f58944d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12922b(InterfaceC13280z1 interfaceC13280z1, Continuation<? super C12922b> continuation) {
            super(2, continuation);
            this.f58944d = interfaceC13280z1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C12922b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12922b(this.f58944d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f58942b == 0) {
                ResultKt.throwOnFailure(obj);
                C12920n4.this.m63297a(this.f58944d);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.n4$c */
    /* loaded from: classes.dex */
    public static final class C12923c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12923c f58945b = new C12923c();

        public C12923c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Request is null. Cannot execute request.";
        }
    }

    public C12920n4(InterfaceC12715h2 httpConnector, InterfaceC12658g2 internalEventPublisher, InterfaceC12658g2 externalEventPublisher, C12656g1 feedStorageProvider, C12521a5 serverConfigStorageProvider, C13205y contentCardsStorageProvider, InterfaceC13231y1 brazeManager) {
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(feedStorageProvider, "feedStorageProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(contentCardsStorageProvider, "contentCardsStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f58934a = httpConnector;
        this.f58935b = internalEventPublisher;
        this.f58936c = externalEventPublisher;
        this.f58937d = feedStorageProvider;
        this.f58938e = serverConfigStorageProvider;
        this.f58939f = contentCardsStorageProvider;
        this.f58940g = brazeManager;
    }

    @Override // bo.app.InterfaceC12909m2
    /* renamed from: b */
    public void mo63104b(InterfaceC12868l2 request) {
        InterfaceC13280z1 interfaceC13280z1;
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof InterfaceC13280z1) {
            interfaceC13280z1 = (InterfaceC13280z1) request;
        } else {
            interfaceC13280z1 = null;
        }
        if (interfaceC13280z1 == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C12921a.f58941b, 6, null);
        } else {
            Z30.m73800d(Z10.f47750b, null, null, new C12922b(interfaceC13280z1, null), 3, null);
        }
    }

    @Override // bo.app.InterfaceC12909m2
    /* renamed from: a */
    public void mo63105a(InterfaceC12868l2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC13280z1 interfaceC13280z1 = request instanceof InterfaceC13280z1 ? (InterfaceC13280z1) request : null;
        if (interfaceC13280z1 == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C12923c.f58945b, 6, null);
        } else {
            m63297a(interfaceC13280z1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m63297a(InterfaceC13280z1 interfaceC13280z1) {
        new C13091s(interfaceC13280z1, this.f58934a, this.f58935b, this.f58936c, this.f58937d, this.f58940g, this.f58938e, this.f58939f).m63011c();
    }
}
