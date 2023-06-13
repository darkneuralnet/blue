package bo.app;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001e"}, m28432d2 = {"Lbo/app/s4;", "Lbo/app/o2;", "Lorg/json/JSONObject;", "e", "", "startTime", "J", "c", "()J", "endTime", "h", "", "priority", "I", "u", "()I", "delayInSeconds", "g", "timeoutInMilliseconds", C17296a.f69688o, "Lbo/app/k2;", "reEligibilityConfig", "Lbo/app/k2;", "t", "()Lbo/app/k2;", "minSecondsSinceLastTrigger", "l", "json", "<init>", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.s4 */
/* loaded from: classes.dex */
public final class C13114s4 implements InterfaceC12981o2 {

    /* renamed from: i */
    public static final C13115a f59274i = new C13115a(null);

    /* renamed from: b */
    private final long f59275b;

    /* renamed from: c */
    private final long f59276c;

    /* renamed from: d */
    private final int f59277d;

    /* renamed from: e */
    private final int f59278e;

    /* renamed from: f */
    private final int f59279f;

    /* renamed from: g */
    private final InterfaceC12817k2 f59280g;

    /* renamed from: h */
    private final int f59281h;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0016"}, m28432d2 = {"Lbo/app/s4$a;", "", "", "DEFAULT_DELAY", "I", "", "DEFAULT_END_TIME", "J", "DEFAULT_MIN_SECONDS_SINCE_LAST", "DEFAULT_PRIORITY", "DEFAULT_START_TIME", "DEFAULT_TIMEOUT", "", "DELAY", "Ljava/lang/String;", "END_TIME", "MIN_SECONDS_SINCE_LAST", "PRIORITY", "START_TIME", "TIMEOUT", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s4$a */
    /* loaded from: classes.dex */
    public static final class C13115a {
        public /* synthetic */ C13115a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13115a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s4$b */
    /* loaded from: classes.dex */
    public static final class C13116b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13116b f59282b = new C13116b();

        public C13116b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Could not convert ScheduleConfig to JSON";
        }
    }

    public C13114s4(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f59275b = json.optLong("start_time", -1L);
        this.f59276c = json.optLong("end_time", -1L);
        this.f59277d = json.optInt("priority", 0);
        this.f59281h = json.optInt("min_seconds_since_last_trigger", -1);
        this.f59278e = json.optInt("delay", 0);
        this.f59279f = json.optInt("timeout", -1);
        this.f59280g = new C12744i4(json);
    }

    @Override // bo.app.InterfaceC12981o2
    /* renamed from: a */
    public int mo62982a() {
        return this.f59279f;
    }

    @Override // bo.app.InterfaceC12981o2
    /* renamed from: c */
    public long mo62981c() {
        return this.f59275b;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject forJsonPut = mo62976t().forJsonPut();
            if (forJsonPut == null) {
                return null;
            }
            forJsonPut.put("start_time", mo62981c());
            forJsonPut.put("end_time", mo62978h());
            forJsonPut.put("priority", mo62975u());
            forJsonPut.put("min_seconds_since_last_trigger", mo62977l());
            forJsonPut.put("timeout", mo62982a());
            forJsonPut.put("delay", mo62979g());
            return forJsonPut;
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13116b.f59282b, 4, null);
            return null;
        }
    }

    @Override // bo.app.InterfaceC12981o2
    /* renamed from: g */
    public int mo62979g() {
        return this.f59278e;
    }

    @Override // bo.app.InterfaceC12981o2
    /* renamed from: h */
    public long mo62978h() {
        return this.f59276c;
    }

    @Override // bo.app.InterfaceC12981o2
    /* renamed from: l */
    public int mo62977l() {
        return this.f59281h;
    }

    @Override // bo.app.InterfaceC12981o2
    /* renamed from: t */
    public InterfaceC12817k2 mo62976t() {
        return this.f59280g;
    }

    @Override // bo.app.InterfaceC12981o2
    /* renamed from: u */
    public int mo62975u() {
        return this.f59277d;
    }
}
