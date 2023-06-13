package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0005B!\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0013"}, m28432d2 = {"Lbo/app/y0;", "", "", "eventId", "", C17296a.f69688o, "eventKey", "", "b", "Lbo/app/u1;", "event", "", "expiresAt", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.y0 */
/* loaded from: classes.dex */
public final class C13227y0 {

    /* renamed from: b */
    public static final C13228a f59445b = new C13228a(null);

    /* renamed from: c */
    private static final long f59446c = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    private final SharedPreferences f59447a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"Lbo/app/y0$a;", "", "Lbo/app/u1;", "event", "", C17296a.f69688o, "", "CACHE_EXPIRATION", "J", "STORAGE_PREFIX", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y0$a */
    /* loaded from: classes.dex */
    public static final class C13228a {
        public /* synthetic */ C13228a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m62763a(InterfaceC13160u1 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            String m63710a = C12660g4.f58490j.m63710a(event);
            return event.mo62897j() + m63710a;
        }

        private C13228a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y0$b */
    /* loaded from: classes.dex */
    public static final class C13229b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Map.Entry<String, ? extends Object> f59448b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13229b(Map.Entry<String, ? extends Object> entry) {
            super(0);
            this.f59448b = entry;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to get expiration time. Deleting entry: ", this.f59448b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y0$c */
    /* loaded from: classes.dex */
    public static final class C13230c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13160u1 f59449b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13230c(InterfaceC13160u1 interfaceC13160u1) {
            super(0);
            this.f59449b = interfaceC13160u1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Event already seen in cache. Ignoring duplicate: ", this.f59449b);
        }
    }

    public C13227y0(Context context, String str, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.event_data_validator", C43318jS5.m30601c(context, str, apiKey)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f59447a = sharedPreferences;
        m62768a();
    }

    /* renamed from: b */
    private final boolean m62764b(String str) {
        return this.f59447a.contains(str);
    }

    /* renamed from: a */
    public boolean m62766a(InterfaceC13160u1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.mo62897j() != EnumC12577d1.PUSH_CLICKED) {
            return true;
        }
        m62768a();
        String m62763a = f59445b.m62763a(event);
        if (m62764b(m62763a)) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13230c(event), 7, null);
            return false;
        }
        m62767a(C46287oT0.m21028h() + f59446c, m62763a);
        return true;
    }

    /* renamed from: a */
    private final void m62765a(String str) {
        this.f59447a.edit().remove(str).apply();
    }

    /* renamed from: a */
    public final void m62767a(long j, String eventKey) {
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        this.f59447a.edit().putLong(eventKey, j).apply();
    }

    /* renamed from: a */
    public final void m62768a() {
        Object value;
        long m21028h = C46287oT0.m21028h();
        for (Map.Entry<String, ?> entry : this.f59447a.getAll().entrySet()) {
            try {
                value = entry.getValue();
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C13229b(entry), 4, null);
                String key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                m62765a(key);
            }
            if (value == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                break;
            } else if (m21028h >= ((Long) value).longValue()) {
                String key2 = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key2, "entry.key");
                m62765a(key2);
            }
        }
    }
}
