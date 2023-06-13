package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u0005\u001a\u00020\u000bR$\u0010\t\u001a\u0004\u0018\u00010\b8G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u0005\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010&R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0011\u0010,\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0011R\u0011\u0010.\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0011¨\u00066"}, m28432d2 = {"Lbo/app/a5;", "", "", "storageKey", "", C17296a.f69688o, "", "p", "Lbo/app/y4;", "serverConfig", "b", "", "Lbo/app/y4;", "j", "()Lbo/app/y4;", "(Lbo/app/y4;)V", "l", "()Z", "isEphemeralEventsEnabled", "n", "isGeofencesEnabledSet", "m", "isGeofencesEnabled", "", "i", "()I", "minTimeSinceLastRequest", "h", "minTimeSinceLastReport", "f", "maxNumToRegister", "", "g", "()J", "messagingSessionTimeout", "e", "configTime", "c", "()Ljava/util/Set;", "blocklistedEvents", "blocklistedAttributes", DateTokenConverter.CONVERTER_KEY, "blocklistedPurchases", "k", "isContentCardsEnabled", "o", "isTestUserDeviceLoggingEnabled", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "apiKey", "Lbo/app/p2;", "serverConfigUpdateListener", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lbo/app/p2;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.a5 */
/* loaded from: classes.dex */
public final class C12521a5 {

    /* renamed from: f */
    public static final C12522a f58229f = new C12522a(null);

    /* renamed from: a */
    private final InterfaceC13018p2 f58230a;

    /* renamed from: b */
    private String f58231b;

    /* renamed from: c */
    private final SharedPreferences f58232c;

    /* renamed from: d */
    private final ReentrantLock f58233d;

    /* renamed from: e */
    private C13235y4 f58234e;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u0019J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u0017\u0010\n\u0012\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\n¨\u0006\u001d"}, m28432d2 = {"Lbo/app/a5$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "apiKey", "currentSdkVersion", "Landroid/content/SharedPreferences;", C17296a.f69688o, "BLOCKLISTED_ATTRIBUTES_KEY", "Ljava/lang/String;", "BLOCKLISTED_EVENTS_KEY", "BLOCKLISTED_PURCHASES_KEY", "CONFIG_TIME_KEY", "CONTENT_CARDS_ENABLED_KEY", "EMPTY_BLOCKLIST", "EPHEMERAL_EVENTS_ENABLED", "FILE_NAME_BASE", "GEOFENCES_ENABLED_KEY", "GEOFENCES_ENABLED_SET_KEY", "GEOFENCES_MAX_NUM_TO_REGISTER_KEY", "GEOFENCES_MIN_TIME_REPORT_KEY", "GEOFENCES_MIN_TIME_REQUEST_KEY", "LAST_ACCESSED_SDK_VERSION", "getLAST_ACCESSED_SDK_VERSION$annotations", "()V", "MESSAGING_SESSION_TIMEOUT_KEY", "TEST_USER_DEVICE_LOGGING_ENABLED_SET_KEY", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a5$a */
    /* loaded from: classes.dex */
    public static final class C12522a {

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.a5$a$a */
        /* loaded from: classes.dex */
        public static final class C12523a extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f58235b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12523a(String str) {
                super(0);
                this.f58235b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Detected SDK update. Clearing config storage. Last SDK version detected: ", this.f58235b);
            }
        }

        public /* synthetic */ C12522a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final SharedPreferences m63924a(Context context, String apiKey, String currentSdkVersion) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            Intrinsics.checkNotNullParameter(currentSdkVersion, "currentSdkVersion");
            SharedPreferences prefs = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.serverconfigstorageprovider", apiKey), 0);
            String string = prefs.getString("last_accessed_sdk_version", "");
            SharedPreferences.Editor edit = prefs.edit();
            if (!Intrinsics.areEqual(currentSdkVersion, string)) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C12523a(string), 6, null);
                edit.clear().apply();
            }
            edit.putString("last_accessed_sdk_version", currentSdkVersion).apply();
            Intrinsics.checkNotNullExpressionValue(prefs, "prefs");
            return prefs;
        }

        private C12522a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "", "it", "", C17296a.f69688o, "(I)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a5$b */
    /* loaded from: classes.dex */
    public static final class C12524b extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f58236b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12524b(JSONArray jSONArray) {
            super(1);
            this.f58236b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean m63922a(int i) {
            return Boolean.valueOf(this.f58236b.opt(i) instanceof String);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return m63922a(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "", "it", C17296a.f69688o, "(I)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a5$c */
    /* loaded from: classes.dex */
    public static final class C12525c extends Lambda implements Function1<Integer, String> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f58237b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12525c(JSONArray jSONArray) {
            super(1);
            this.f58237b = jSONArray;
        }

        /* renamed from: a */
        public final String m63921a(int i) {
            Object obj = this.f58237b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return m63921a(num.intValue());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a5$d */
    /* loaded from: classes.dex */
    public static final class C12526d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12526d f58238b = new C12526d();

        public C12526d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Experienced exception retrieving blocklisted strings from local storage. Returning null.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a5$e */
    /* loaded from: classes.dex */
    public static final class C12527e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12527e f58239b = new C12527e();

        public C12527e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Server config updated for Content Cards from disabled to enabled";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a5$f */
    /* loaded from: classes.dex */
    public static final class C12528f extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12528f f58240b = new C12528f();

        public C12528f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Could not persist server config to shared preferences.";
        }
    }

    public C12521a5(Context context, String apiKey, InterfaceC13018p2 serverConfigUpdateListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(serverConfigUpdateListener, "serverConfigUpdateListener");
        this.f58230a = serverConfigUpdateListener;
        String stringPlus = Intrinsics.stringPlus(InstructionFileId.DOT, apiKey);
        this.f58231b = stringPlus;
        this.f58232c = f58229f.m63924a(context, stringPlus, "21.0.0");
        this.f58233d = new ReentrantLock();
        m63925p();
    }

    /* renamed from: p */
    private final void m63925p() {
        C13235y4 c13235y4 = new C13235y4(0L, null, null, null, 0, 0, 0, false, false, false, 0L, false, false, 8191, null);
        c13235y4.m62728a(m63940b());
        c13235y4.m62721b(m63938c());
        c13235y4.m62716c(m63937d());
        c13235y4.m62729a(m63936e());
        c13235y4.m62722b(m63934g());
        c13235y4.m62717c(m63932i());
        c13235y4.m62723b(m63933h());
        c13235y4.m62730a(m63935f());
        c13235y4.m62714c(m63928m());
        c13235y4.m62711d(m63927n());
        c13235y4.m62708e(m63926o());
        c13235y4.m62725a(m63930k());
        c13235y4.m62719b(m63929l());
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            m63942a(c13235y4);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public final void m63942a(C13235y4 c13235y4) {
        this.f58234e = c13235y4;
    }

    /* renamed from: b */
    public final Set<String> m63940b() {
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            Set<String> m62731a = m63931j == null ? null : m63931j.m62731a();
            if (m62731a == null) {
                m62731a = m63941a("blacklisted_attributes");
            }
            return m62731a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public final Set<String> m63938c() {
        Set<String> m62724b;
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            if (m63931j == null) {
                m62724b = null;
            } else {
                m62724b = m63931j.m62724b();
            }
            if (m62724b == null) {
                m62724b = m63941a("blacklisted_events");
            }
            return m62724b;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public final Set<String> m63937d() {
        Set<String> m62718c;
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            if (m63931j == null) {
                m62718c = null;
            } else {
                m62718c = m63931j.m62718c();
            }
            if (m62718c == null) {
                m62718c = m63941a("blacklisted_purchases");
            }
            return m62718c;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final long m63936e() {
        Long valueOf;
        long longValue;
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            if (m63931j == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(m63931j.m62713d());
            }
            if (valueOf == null) {
                longValue = this.f58232c.getLong("config_time", 0L);
            } else {
                longValue = valueOf.longValue();
            }
            return longValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: f */
    public final int m63935f() {
        Integer valueOf;
        int intValue;
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            if (m63931j == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(m63931j.m62705h());
            }
            if (valueOf == null) {
                intValue = this.f58232c.getInt("geofences_max_num_to_register", -1);
            } else {
                intValue = valueOf.intValue();
            }
            return intValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public final long m63934g() {
        Long valueOf;
        long longValue;
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            if (m63931j == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(m63931j.m62704i());
            }
            if (valueOf == null) {
                longValue = this.f58232c.getLong("messaging_session_timeout", -1L);
            } else {
                longValue = valueOf.longValue();
            }
            return longValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public final int m63933h() {
        Integer valueOf;
        int intValue;
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            if (m63931j == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(m63931j.m62703j());
            }
            if (valueOf == null) {
                intValue = this.f58232c.getInt("geofences_min_time_since_last_report", -1);
            } else {
                intValue = valueOf.intValue();
            }
            return intValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: i */
    public final int m63932i() {
        Integer valueOf;
        int intValue;
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            if (m63931j == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(m63931j.m62702k());
            }
            if (valueOf == null) {
                intValue = this.f58232c.getInt("geofences_min_time_since_last_request", -1);
            } else {
                intValue = valueOf.intValue();
            }
            return intValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: j */
    public final C13235y4 m63931j() {
        return this.f58234e;
    }

    /* renamed from: k */
    public final boolean m63930k() {
        Boolean valueOf;
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            if (m63931j == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(m63931j.m62700m());
            }
            if (valueOf == null) {
                booleanValue = this.f58232c.getBoolean("content_cards_enabled", false);
            } else {
                booleanValue = valueOf.booleanValue();
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: l */
    public final boolean m63929l() {
        Boolean valueOf;
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            if (m63931j == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(m63931j.m62710e());
            }
            if (valueOf == null) {
                booleanValue = this.f58232c.getBoolean("ephemeral_events_enabled", false);
            } else {
                booleanValue = valueOf.booleanValue();
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: m */
    public final boolean m63928m() {
        Boolean valueOf;
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            if (m63931j == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(m63931j.m62707f());
            }
            if (valueOf == null) {
                booleanValue = this.f58232c.getBoolean("geofences_enabled", false);
            } else {
                booleanValue = valueOf.booleanValue();
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: n */
    public final boolean m63927n() {
        Boolean valueOf;
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            if (m63931j == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(m63931j.m62706g());
            }
            if (valueOf == null) {
                booleanValue = this.f58232c.getBoolean("geofences_enabled_set", false);
            } else {
                booleanValue = valueOf.booleanValue();
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: o */
    public final boolean m63926o() {
        Boolean valueOf;
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            C13235y4 m63931j = m63931j();
            if (m63931j == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(m63931j.m62701l());
            }
            if (valueOf == null) {
                booleanValue = this.f58232c.getBoolean("test_user_device_logging_enabled", false);
            } else {
                booleanValue = valueOf.booleanValue();
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public final boolean m63943a() {
        return m63936e() <= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[Catch: Exception -> 0x0053, TryCatch #0 {Exception -> 0x0053, blocks: (B:2:0x0000, B:4:0x0010, B:10:0x001c, B:11:0x0043, B:13:0x0049), top: B:18:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Set<String> m63941a(String str) {
        boolean z;
        IntRange until;
        Sequence asSequence;
        Sequence filter;
        Sequence<String> map;
        boolean isBlank;
        try {
            String string = this.f58232c.getString(str, "");
            HashSet hashSet = new HashSet();
            if (string != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(string);
                if (!isBlank) {
                    z = false;
                    if (z) {
                        JSONArray jSONArray = new JSONArray(string);
                        until = RangesKt___RangesKt.until(0, jSONArray.length());
                        asSequence = CollectionsKt___CollectionsKt.asSequence(until);
                        filter = SequencesKt___SequencesKt.filter(asSequence, new C12524b(jSONArray));
                        map = SequencesKt___SequencesKt.map(filter, new C12525c(jSONArray));
                        for (String str2 : map) {
                            hashSet.add(str2);
                        }
                        return hashSet;
                    }
                    return hashSet;
                }
            }
            z = true;
            if (z) {
            }
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12526d.f58238b, 4, null);
            return new HashSet();
        }
    }

    /* renamed from: b */
    public final void m63939b(C13235y4 serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        boolean z = !m63930k() && serverConfig.m62700m();
        ReentrantLock reentrantLock = this.f58233d;
        reentrantLock.lock();
        try {
            m63942a(serverConfig);
            Unit unit = Unit.INSTANCE;
            if (z) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12527e.f58239b, 7, null);
                this.f58230a.mo63152a();
            }
            try {
                SharedPreferences.Editor edit = this.f58232c.edit();
                if (serverConfig.m62724b() != null) {
                    edit.putString("blacklisted_events", new JSONArray((Collection) serverConfig.m62724b()).toString());
                }
                if (serverConfig.m62731a() != null) {
                    edit.putString("blacklisted_attributes", new JSONArray((Collection) serverConfig.m62731a()).toString());
                }
                if (serverConfig.m62718c() != null) {
                    edit.putString("blacklisted_purchases", new JSONArray((Collection) serverConfig.m62718c()).toString());
                }
                edit.putLong("config_time", serverConfig.m62713d());
                edit.putInt("geofences_min_time_since_last_request", serverConfig.m62702k());
                edit.putInt("geofences_min_time_since_last_report", serverConfig.m62703j());
                edit.putInt("geofences_max_num_to_register", serverConfig.m62705h());
                edit.putBoolean("geofences_enabled", serverConfig.m62707f());
                edit.putBoolean("geofences_enabled_set", serverConfig.m62706g());
                edit.putLong("messaging_session_timeout", serverConfig.m62704i());
                edit.putBoolean("test_user_device_logging_enabled", serverConfig.m62701l());
                edit.putBoolean("content_cards_enabled", serverConfig.m62700m());
                edit.putBoolean("ephemeral_events_enabled", serverConfig.m62710e());
                edit.apply();
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12528f.f58240b, 4, null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
