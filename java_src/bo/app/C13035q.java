package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m28432d2 = {"Lbo/app/q;", "", "", "b", "c", "", C17296a.f69688o, "()Z", "isNewMessagingSessionCriteriaMet", "Landroid/content/Context;", "applicationContext", "Lbo/app/g2;", "eventPublisher", "Lbo/app/a5;", "serverConfigStorageProvider", "<init>", "(Landroid/content/Context;Lbo/app/g2;Lbo/app/a5;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.q */
/* loaded from: classes.dex */
public final class C13035q {

    /* renamed from: e */
    public static final C13036a f59106e = new C13036a(null);

    /* renamed from: a */
    private final InterfaceC12658g2 f59107a;

    /* renamed from: b */
    private final C12521a5 f59108b;

    /* renamed from: c */
    public final SharedPreferences f59109c;

    /* renamed from: d */
    public boolean f59110d;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lbo/app/q$a;", "", "", "MESSAGING_SESSION_END_TIMESTAMP_KEY", "Ljava/lang/String;", "MESSAGING_SESSION_PREFS_FILE", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q$a */
    /* loaded from: classes.dex */
    public static final class C13036a {
        public /* synthetic */ C13036a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13036a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q$b */
    /* loaded from: classes.dex */
    public static final class C13037b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f59111b;

        /* renamed from: c */
        final /* synthetic */ long f59112c;

        /* renamed from: d */
        final /* synthetic */ long f59113d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13037b(long j, long j2, long j3) {
            super(0);
            this.f59111b = j;
            this.f59112c = j2;
            this.f59113d = j3;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Messaging session timeout: " + this.f59111b + ", current diff: " + (this.f59112c - this.f59113d);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q$c */
    /* loaded from: classes.dex */
    public static final class C13038c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13038c f59114b = new C13038c();

        public C13038c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Publishing new messaging session event.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q$d */
    /* loaded from: classes.dex */
    public static final class C13039d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13039d f59115b = new C13039d();

        public C13039d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Messaging session not started.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q$e */
    /* loaded from: classes.dex */
    public static final class C13040e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f59116b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13040e(long j) {
            super(0);
            this.f59116b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Messaging session stopped. Adding new messaging session timestamp: ", Long.valueOf(this.f59116b));
        }
    }

    public C13035q(Context applicationContext, InterfaceC12658g2 eventPublisher, C12521a5 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f59107a = eventPublisher;
        this.f59108b = serverConfigStorageProvider;
        this.f59109c = applicationContext.getSharedPreferences("com.appboy.storage.sessions.messaging_session", 0);
    }

    /* renamed from: a */
    public final boolean m63112a() {
        long m63934g = this.f59108b.m63934g();
        if (m63934g == -1 || this.f59110d) {
            return false;
        }
        long j = this.f59109c.getLong("messaging_session_timestamp", -1L);
        long m21027i = C46287oT0.m21027i();
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13037b(m63934g, m21027i, j), 7, null);
        if (j + m63934g >= m21027i) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void m63111b() {
        if (m63112a()) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13038c.f59114b, 7, null);
            this.f59107a.mo63715a((InterfaceC12658g2) C12818k3.f58756b, (Class<InterfaceC12658g2>) C12818k3.class);
            this.f59110d = true;
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13039d.f59115b, 7, null);
    }

    /* renamed from: c */
    public final void m63110c() {
        long m21027i = C46287oT0.m21027i();
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13040e(m21027i), 7, null);
        this.f59109c.edit().putLong("messaging_session_timestamp", m21027i).apply();
        this.f59110d = false;
    }
}
