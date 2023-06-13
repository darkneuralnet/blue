package bo.app;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\f¨\u0006\u0011"}, m28432d2 = {"Lbo/app/u0;", "Lbo/app/q2;", "Lbo/app/d5;", "session", "", C17296a.f69688o, "", "sessionId", "Lbo/app/g2;", "eventPublisher", "", "throwable", "()Lbo/app/d5;", "storedOpenSession", "sessionStorageManager", "<init>", "(Lbo/app/q2;Lbo/app/g2;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.u0 */
/* loaded from: classes.dex */
public final class C13155u0 implements InterfaceC13047q2 {

    /* renamed from: a */
    private final InterfaceC13047q2 f59345a;

    /* renamed from: b */
    private final InterfaceC12658g2 f59346b;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.u0$a */
    /* loaded from: classes.dex */
    public static final class C13156a extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13156a f59347b = new C13156a();

        public C13156a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to delete the sealed session from the storage.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.u0$b */
    /* loaded from: classes.dex */
    public static final class C13157b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13157b f59348b = new C13157b();

        public C13157b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Error occured while publishing exception.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.u0$c */
    /* loaded from: classes.dex */
    public static final class C13158c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13158c f59349b = new C13158c();

        public C13158c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get the active session from the storage.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.u0$d */
    /* loaded from: classes.dex */
    public static final class C13159d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13159d f59350b = new C13159d();

        public C13159d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to upsert active session in the storage.";
        }
    }

    public C13155u0(InterfaceC13047q2 sessionStorageManager, InterfaceC12658g2 eventPublisher) {
        Intrinsics.checkNotNullParameter(sessionStorageManager, "sessionStorageManager");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        this.f59345a = sessionStorageManager;
        this.f59346b = eventPublisher;
    }

    @Override // bo.app.InterfaceC13047q2
    /* renamed from: a */
    public C12584d5 mo62908a() {
        try {
            return this.f59345a.mo62908a();
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13158c.f59349b, 4, null);
            m62906a(this.f59346b, e);
            return null;
        }
    }

    @Override // bo.app.InterfaceC13047q2
    /* renamed from: a */
    public void mo62907a(C12584d5 session) {
        Intrinsics.checkNotNullParameter(session, "session");
        try {
            this.f59345a.mo62907a(session);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13159d.f59350b, 4, null);
            m62906a(this.f59346b, e);
        }
    }

    @Override // bo.app.InterfaceC13047q2
    /* renamed from: a */
    public void mo62905a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        try {
            this.f59345a.mo62905a(sessionId);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13156a.f59347b, 4, null);
            m62906a(this.f59346b, e);
        }
    }

    /* renamed from: a */
    public final void m62906a(InterfaceC12658g2 eventPublisher, Throwable throwable) {
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            eventPublisher.mo63715a((InterfaceC12658g2) new C12912m5("A storage exception has occurred. Please view the stack trace for more details.", throwable), (Class<InterfaceC12658g2>) C12912m5.class);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13157b.f59348b, 4, null);
        }
    }
}
