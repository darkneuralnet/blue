package bo.app;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0005B¡\u0001\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u0012\b\b\u0002\u0010 \u001a\u00020\u0018\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010(\u001a\u00020\"\u0012\b\b\u0002\u0010*\u001a\u00020\"\u0012\b\b\u0002\u0010,\u001a\u00020\r\u0012\b\b\u0002\u0010.\u001a\u00020\"\u0012\b\b\u0002\u00100\u001a\u00020\"¢\u0006\u0004\b1\u00102B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b1\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\b\u0010\u0010\"\u0004\b\u0005\u0010\u0011R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0007\u0010\u0015R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014\"\u0004\b\u0005\u0010\u0015R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014\"\u0004\b\u0006\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u0006\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b\u0007\u0010\u001dR\"\u0010 \u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\u0005\u0010\u001dR\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b\b\u0010'R\"\u0010(\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&\"\u0004\b\u0006\u0010'R\"\u0010*\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b\u0005\u0010'R\"\u0010,\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u000f\u001a\u0004\b-\u0010\u0010\"\u0004\b\u0007\u0010\u0011R\"\u0010.\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&\"\u0004\b\t\u0010'R\"\u00100\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010$\u001a\u0004\b\t\u0010&\"\u0004\b\u0007\u0010'¨\u00064"}, m28432d2 = {"Lbo/app/y4;", "", "Lorg/json/JSONObject;", "jsonObject", "", C17296a.f69688o, "c", "b", DateTokenConverter.CONVERTER_KEY, "e", "", "blocklistKey", "", "", "configTime", "J", "()J", "(J)V", "blocklistedEvents", "Ljava/util/Set;", "()Ljava/util/Set;", "(Ljava/util/Set;)V", "blocklistedAttributes", "blocklistedPurchases", "", "minTimeSinceLastRequest", "I", "k", "()I", "(I)V", "minTimeSinceLastReport", "j", "maxNumToRegister", "h", "", "geofencesEnabledSet", "Z", "g", "()Z", "(Z)V", "geofencesEnabled", "f", "isContentCardsFeatureEnabled", "m", "messagingSessionTimeout", "i", "testUserDeviceLoggingEnabled", "l", "ephemeralEventsEnabled", "<init>", "(JLjava/util/Set;Ljava/util/Set;Ljava/util/Set;IIIZZZJZZ)V", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.y4 */
/* loaded from: classes.dex */
public final class C13235y4 {

    /* renamed from: n */
    public static final C13236a f59456n = new C13236a(null);

    /* renamed from: a */
    private long f59457a;

    /* renamed from: b */
    private Set<String> f59458b;

    /* renamed from: c */
    private Set<String> f59459c;

    /* renamed from: d */
    private Set<String> f59460d;

    /* renamed from: e */
    private int f59461e;

    /* renamed from: f */
    private int f59462f;

    /* renamed from: g */
    private int f59463g;

    /* renamed from: h */
    private boolean f59464h;

    /* renamed from: i */
    private boolean f59465i;

    /* renamed from: j */
    private boolean f59466j;

    /* renamed from: k */
    private long f59467k;

    /* renamed from: l */
    private boolean f59468l;

    /* renamed from: m */
    private boolean f59469m;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u0012\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0017"}, m28432d2 = {"Lbo/app/y4$a;", "", "", "ATTRIBUTES_BLOCKLIST", "Ljava/lang/String;", "getATTRIBUTES_BLOCKLIST$annotations", "()V", "CONFIG_TIME", "CONTENT_CARDS", "ENABLED", "EPHEMERAL_EVENTS", "EVENTS_BLOCKLIST", "getEVENTS_BLOCKLIST$annotations", "GEOFENCES", "GEOFENCES_MAX_NUM_TO_REGISTER", "GEOFENCES_MIN_TIME_REPORT", "GEOFENCES_MIN_TIME_REQUEST", "MESSAGING_SESSION_TIMEOUT", "PURCHASES_BLOCKLIST", "getPURCHASES_BLOCKLIST$annotations", "TEST_USER_DEVICE_LOGGING_ENABLED", "TEST_USER_OBJECT", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y4$a */
    /* loaded from: classes.dex */
    public static final class C13236a {
        public /* synthetic */ C13236a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13236a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y4$b */
    /* loaded from: classes.dex */
    public static final class C13237b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13237b f59470b = new C13237b();

        public C13237b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Error getting required content cards fields. Using defaults.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y4$c */
    /* loaded from: classes.dex */
    public static final class C13238c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13238c f59471b = new C13238c();

        public C13238c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Error getting required ephemeral events fields. Using defaults.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y4$d */
    /* loaded from: classes.dex */
    public static final class C13239d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13239d f59472b = new C13239d();

        public C13239d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Error getting required geofence fields. Using defaults.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y4$e */
    /* loaded from: classes.dex */
    public static final class C13240e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13240e f59473b = new C13240e();

        public C13240e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Error getting required test user fields. Using defaults";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "", "it", "", C17296a.f69688o, "(I)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y4$f */
    /* loaded from: classes.dex */
    public static final class C13241f extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f59474b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13241f(JSONArray jSONArray) {
            super(1);
            this.f59474b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean m62695a(int i) {
            return Boolean.valueOf(this.f59474b.opt(i) instanceof String);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return m62695a(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "", "it", C17296a.f69688o, "(I)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y4$g */
    /* loaded from: classes.dex */
    public static final class C13242g extends Lambda implements Function1<Integer, String> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f59475b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13242g(JSONArray jSONArray) {
            super(1);
            this.f59475b = jSONArray;
        }

        /* renamed from: a */
        public final String m62694a(int i) {
            Object obj = this.f59475b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return m62694a(num.intValue());
        }
    }

    public C13235y4(long j, Set<String> set, Set<String> set2, Set<String> set3, int i, int i2, int i3, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5) {
        this.f59457a = j;
        this.f59458b = set;
        this.f59459c = set2;
        this.f59460d = set3;
        this.f59461e = i;
        this.f59462f = i2;
        this.f59463g = i3;
        this.f59464h = z;
        this.f59465i = z2;
        this.f59466j = z3;
        this.f59467k = j2;
        this.f59468l = z4;
        this.f59469m = z5;
    }

    /* renamed from: a */
    public final void m62729a(long j) {
        this.f59457a = j;
    }

    /* renamed from: b */
    public final Set<String> m62724b() {
        return this.f59458b;
    }

    /* renamed from: c */
    public final Set<String> m62718c() {
        return this.f59460d;
    }

    /* renamed from: d */
    public final long m62713d() {
        return this.f59457a;
    }

    /* renamed from: e */
    public final void m62708e(boolean z) {
        this.f59468l = z;
    }

    /* renamed from: f */
    public final boolean m62707f() {
        return this.f59465i;
    }

    /* renamed from: g */
    public final boolean m62706g() {
        return this.f59464h;
    }

    /* renamed from: h */
    public final int m62705h() {
        return this.f59463g;
    }

    /* renamed from: i */
    public final long m62704i() {
        return this.f59467k;
    }

    /* renamed from: j */
    public final int m62703j() {
        return this.f59462f;
    }

    /* renamed from: k */
    public final int m62702k() {
        return this.f59461e;
    }

    /* renamed from: l */
    public final boolean m62701l() {
        return this.f59468l;
    }

    /* renamed from: m */
    public final boolean m62700m() {
        return this.f59466j;
    }

    /* renamed from: a */
    public final Set<String> m62731a() {
        return this.f59459c;
    }

    /* renamed from: b */
    public final void m62721b(Set<String> set) {
        this.f59458b = set;
    }

    /* renamed from: c */
    public final void m62716c(Set<String> set) {
        this.f59460d = set;
    }

    /* renamed from: d */
    public final void m62711d(boolean z) {
        this.f59464h = z;
    }

    /* renamed from: e */
    public final boolean m62710e() {
        return this.f59469m;
    }

    /* renamed from: d */
    private final void m62712d(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("geofences");
        if (optJSONObject != null) {
            try {
                this.f59461e = optJSONObject.getInt("min_time_since_last_request");
                this.f59462f = optJSONObject.getInt("min_time_since_last_report");
                this.f59465i = optJSONObject.getBoolean("enabled");
                this.f59464h = true;
                this.f59463g = optJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13239d.f59472b, 4, null);
                this.f59461e = -1;
                this.f59462f = -1;
                this.f59463g = -1;
                this.f59465i = false;
                this.f59464h = false;
            }
        }
    }

    /* renamed from: e */
    private final void m62709e(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("test_user");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("device_logging_enabled");
            } catch (JSONException e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13240e.f59473b, 4, null);
                z = false;
            }
            this.f59468l = z;
        }
    }

    /* renamed from: a */
    public final void m62728a(Set<String> set) {
        this.f59459c = set;
    }

    /* renamed from: b */
    public final void m62723b(int i) {
        this.f59462f = i;
    }

    /* renamed from: c */
    public final void m62717c(int i) {
        this.f59461e = i;
    }

    /* renamed from: a */
    public final void m62730a(int i) {
        this.f59463g = i;
    }

    /* renamed from: b */
    public final void m62722b(long j) {
        this.f59467k = j;
    }

    /* renamed from: c */
    public final void m62714c(boolean z) {
        this.f59465i = z;
    }

    /* renamed from: c */
    private final void m62715c(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (optJSONObject == null) {
            return;
        }
        try {
            z = optJSONObject.getBoolean("enabled");
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13238c.f59471b, 4, null);
            z = false;
        }
        m62719b(z);
    }

    /* renamed from: a */
    public final void m62725a(boolean z) {
        this.f59466j = z;
    }

    /* renamed from: b */
    public final void m62719b(boolean z) {
        this.f59469m = z;
    }

    /* renamed from: a */
    private final void m62727a(JSONObject jSONObject) {
        this.f59458b = m62726a(jSONObject, "events_blacklist");
        this.f59459c = m62726a(jSONObject, "attributes_blacklist");
        this.f59460d = m62726a(jSONObject, "purchases_blacklist");
    }

    /* renamed from: b */
    private final void m62720b(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("content_cards");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
            } catch (JSONException e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13237b.f59470b, 4, null);
                z = false;
            }
            this.f59466j = z;
        }
    }

    /* renamed from: a */
    private final Set<String> m62726a(JSONObject jSONObject, String str) {
        IntRange until;
        Sequence asSequence;
        Sequence filter;
        Sequence map;
        Iterator it;
        List emptyList;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                it = emptyList.iterator();
            } else {
                until = RangesKt___RangesKt.until(0, optJSONArray.length());
                asSequence = CollectionsKt___CollectionsKt.asSequence(until);
                filter = SequencesKt___SequencesKt.filter(asSequence, new C13241f(optJSONArray));
                map = SequencesKt___SequencesKt.map(filter, new C13242g(optJSONArray));
                it = map.iterator();
            }
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
        }
        return hashSet;
    }

    public /* synthetic */ C13235y4(long j, Set set, Set set2, Set set3, int i, int i2, int i3, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? null : set, (i4 & 4) != 0 ? null : set2, (i4 & 8) == 0 ? set3 : null, (i4 & 16) != 0 ? -1 : i, (i4 & 32) != 0 ? -1 : i2, (i4 & 64) == 0 ? i3 : -1, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? false : z3, (i4 & 1024) != 0 ? -1L : j2, (i4 & 2048) != 0 ? false : z4, (i4 & 4096) == 0 ? z5 : false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13235y4(JSONObject jsonObject) {
        this(0L, null, null, null, 0, 0, 0, false, false, false, 0L, false, false, 8191, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f59457a = jsonObject.optLong("time", 0L);
        this.f59467k = jsonObject.optLong("messaging_session_timeout", -1L);
        m62727a(jsonObject);
        m62720b(jsonObject);
        m62712d(jsonObject);
        m62709e(jsonObject);
        m62715c(jsonObject);
    }
}
