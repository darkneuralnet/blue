package bo.app;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006,"}, m28432d2 = {"Lbo/app/d;", "", "Lbo/app/x;", "contentCardsResponse", "Lbo/app/x;", C17296a.f69688o, "()Lbo/app/x;", "LwO1;", "templatedInAppMessage", "LwO1;", "f", "()LwO1;", "", "Lbo/app/y2;", "triggeredActions", "Ljava/util/List;", "g", "()Ljava/util/List;", "Lbo/app/y4;", "serverConfig", "Lbo/app/y4;", "e", "()Lbo/app/y4;", "Ld20;", "geofences", DateTokenConverter.CONVERTER_KEY, "Lorg/json/JSONArray;", "feedJson", "Lorg/json/JSONArray;", "c", "()Lorg/json/JSONArray;", "Lbo/app/n2;", "error", "Lbo/app/n2;", "b", "()Lbo/app/n2;", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/z1;", "request", "Lbo/app/y1;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lbo/app/z1;Lbo/app/y1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.d */
/* loaded from: classes.dex */
public final class C12570d {

    /* renamed from: h */
    public static final C12575e f58294h = new C12575e(null);

    /* renamed from: a */
    private final C13197x f58295a;

    /* renamed from: b */
    private final InterfaceC50985wO1 f58296b;

    /* renamed from: c */
    private final List<InterfaceC13232y2> f58297c;

    /* renamed from: d */
    private final C13235y4 f58298d;

    /* renamed from: e */
    private final List<C39514d20> f58299e;

    /* renamed from: f */
    private final JSONArray f58300f;

    /* renamed from: g */
    private final InterfaceC12918n2 f58301g;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.d$a */
    /* loaded from: classes.dex */
    public static final class C12571a extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f58302b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12571a(JSONObject jSONObject) {
            super(0);
            this.f58302b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Encountered Exception processing Content Cards response: ", this.f58302b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.d$b */
    /* loaded from: classes.dex */
    public static final class C12572b extends Lambda implements Function0<String> {
        public C12572b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Found " + C12570d.this.m63861g().size() + " triggered actions in server response.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.d$c */
    /* loaded from: classes.dex */
    public static final class C12573c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f58304b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12573c(JSONObject jSONObject) {
            super(0);
            this.f58304b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Got server config: ", C31696Aj2.m115350i(this.f58304b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.d$d */
    /* loaded from: classes.dex */
    public static final class C12574d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f58305b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12574d(JSONObject jSONObject) {
            super(0);
            this.f58305b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Encountered Exception processing server config: ", this.f58305b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lbo/app/d$e;", "", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/z1;", "request", "Lbo/app/n2;", C17296a.f69688o, "", "CONFIG_KEY", "Ljava/lang/String;", "ERROR_KEY", "FEED_KEY", "GEOFENCES", "SDK_AUTH_ERROR_CODE_KEY", "SDK_AUTH_ERROR_KEY", "SDK_AUTH_ERROR_REASON_KEY", "TEMPLATED_MESSAGE_KEY", "TRIGGERS_KEY", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.d$e */
    /* loaded from: classes.dex */
    public static final class C12575e {
        public /* synthetic */ C12575e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC12918n2 m63856a(JSONObject jsonObject, InterfaceC13280z1 request) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            Intrinsics.checkNotNullParameter(request, "request");
            String m115351h = C31696Aj2.m115351h(jsonObject, "error");
            JSONObject optJSONObject = jsonObject.optJSONObject("auth_error");
            if (optJSONObject != null) {
                return new C13147t4(request, optJSONObject.optInt("error_code", -1), C31696Aj2.m115351h(optJSONObject, "reason"), m115351h);
            } else if (m115351h != null) {
                return new C12651g(m115351h, request);
            } else {
                return null;
            }
        }

        private C12575e() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12570d(JSONObject jsonObject, InterfaceC13280z1 request, InterfaceC13231y1 brazeManager) {
        C13197x c13197x;
        List<InterfaceC13232y2> m63586a;
        JSONObject optJSONObject;
        Exception e;
        C13235y4 c13235y4;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f58300f = jsonObject.optJSONArray("feed");
        InterfaceC12918n2 m63856a = f58294h.m63856a(jsonObject, request);
        this.f58301g = m63856a;
        if (m63856a == null && (request instanceof C13268z)) {
            try {
                c13197x = new C13197x(jsonObject);
            } catch (Exception e2) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e2, false, new C12571a(jsonObject), 4, null);
            }
            this.f58295a = c13197x;
            m63586a = C12748i6.m63586a(jsonObject.optJSONArray("triggers"), brazeManager);
            this.f58297c = m63586a;
            if (m63586a != null) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12572b(), 6, null);
            }
            optJSONObject = jsonObject.optJSONObject("config");
            if (optJSONObject == null) {
                try {
                    c13235y4 = new C13235y4(optJSONObject);
                } catch (Exception e3) {
                    e = e3;
                    c13235y4 = null;
                }
                try {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12573c(optJSONObject), 6, null);
                } catch (Exception e4) {
                    e = e4;
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C12574d(optJSONObject), 4, null);
                    this.f58298d = c13235y4;
                    this.f58296b = C12748i6.m63585a(jsonObject.optJSONObject("templated_message"), brazeManager);
                    JSONArray optJSONArray = jsonObject.optJSONArray("geofences");
                    this.f58299e = optJSONArray != null ? C12738i1.m63595a(optJSONArray) : null;
                }
            } else {
                c13235y4 = null;
            }
            this.f58298d = c13235y4;
            this.f58296b = C12748i6.m63585a(jsonObject.optJSONObject("templated_message"), brazeManager);
            JSONArray optJSONArray2 = jsonObject.optJSONArray("geofences");
            this.f58299e = optJSONArray2 != null ? C12738i1.m63595a(optJSONArray2) : null;
        }
        c13197x = null;
        this.f58295a = c13197x;
        m63586a = C12748i6.m63586a(jsonObject.optJSONArray("triggers"), brazeManager);
        this.f58297c = m63586a;
        if (m63586a != null) {
        }
        optJSONObject = jsonObject.optJSONObject("config");
        if (optJSONObject == null) {
        }
        this.f58298d = c13235y4;
        this.f58296b = C12748i6.m63585a(jsonObject.optJSONObject("templated_message"), brazeManager);
        JSONArray optJSONArray22 = jsonObject.optJSONArray("geofences");
        this.f58299e = optJSONArray22 != null ? C12738i1.m63595a(optJSONArray22) : null;
    }

    /* renamed from: a */
    public final C13197x m63867a() {
        return this.f58295a;
    }

    /* renamed from: b */
    public final InterfaceC12918n2 m63866b() {
        return this.f58301g;
    }

    /* renamed from: c */
    public final JSONArray m63865c() {
        return this.f58300f;
    }

    /* renamed from: d */
    public final List<C39514d20> m63864d() {
        return this.f58299e;
    }

    /* renamed from: e */
    public final C13235y4 m63863e() {
        return this.f58298d;
    }

    /* renamed from: f */
    public final InterfaceC50985wO1 m63862f() {
        return this.f58296b;
    }

    /* renamed from: g */
    public final List<InterfaceC13232y2> m63861g() {
        return this.f58297c;
    }
}
