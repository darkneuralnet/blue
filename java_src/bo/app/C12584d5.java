package bo.app;

import bo.app.C12648f5;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0016\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0018B3\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010$\u001a\u00020\u000e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010&\u001a\u00020\u001a¢\u0006\u0004\b'\u0010(B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b'\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R.\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001a8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0018\u0010\u001fR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006+"}, m28432d2 = {"Lbo/app/d5;", "LaP1;", "Lorg/json/JSONObject;", "e", "Lbo/app/l3;", "z", "()Lbo/app/l3;", "", "toString", "Lbo/app/f5;", "sessionId", "Lbo/app/f5;", "n", "()Lbo/app/f5;", "", "startTime", "D", "x", "()D", "<set-?>", "endTime", "Ljava/lang/Double;", "w", "()Ljava/lang/Double;", C17296a.f69688o, "(Ljava/lang/Double;)V", "", "isSealed", "Z", "y", "()Z", "(Z)V", "", "v", "()J", "duration", "startTimeSeconds", "endTimeSeconds", "sealed", "<init>", "(Lbo/app/f5;DLjava/lang/Double;Z)V", "sessionData", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.d5 */
/* loaded from: classes.dex */
public class C12584d5 implements InterfaceC37933aP1<JSONObject> {

    /* renamed from: f */
    public static final C12585a f58354f = new C12585a(null);

    /* renamed from: b */
    private final C12648f5 f58355b;

    /* renamed from: c */
    private final double f58356c;

    /* renamed from: d */
    private volatile Double f58357d;

    /* renamed from: e */
    private volatile boolean f58358e;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, m28432d2 = {"Lbo/app/d5$a;", "", "", "END_TIME_KEY", "Ljava/lang/String;", "IS_SEALED_KEY", "", "NIL_DURATION", "J", "SESSION_ID_KEY", "START_TIME_KEY", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.d5$a */
    /* loaded from: classes.dex */
    public static final class C12585a {
        public /* synthetic */ C12585a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12585a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.d5$b */
    /* loaded from: classes.dex */
    public static final class C12586b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ double f58359b;

        /* renamed from: c */
        final /* synthetic */ C12584d5 f58360c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12586b(double d, C12584d5 c12584d5) {
            super(0);
            this.f58359b = d;
            this.f58360c = c12584d5;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "End time '" + this.f58359b + "' for session is less than the start time '" + this.f58360c.m63837x() + "' for this session.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.d5$c */
    /* loaded from: classes.dex */
    public static final class C12587c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12587c f58361b = new C12587c();

        public C12587c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating Session Json.";
        }
    }

    public C12584d5(C12648f5 sessionId, double d, Double d2, boolean z) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f58355b = sessionId;
        this.f58356c = d;
        mo63365a(d2);
        this.f58358e = z;
    }

    /* renamed from: a */
    public void mo63365a(Double d) {
        this.f58357d = d;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AnalyticsFields.SESSION_ID, this.f58355b);
            jSONObject.put("start_time", this.f58356c);
            jSONObject.put("is_sealed", this.f58358e);
            if (mo63364w() != null) {
                jSONObject.put("end_time", mo63364w());
            }
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12587c.f58361b, 4, null);
        }
        return jSONObject;
    }

    /* renamed from: n */
    public final C12648f5 m63839n() {
        return this.f58355b;
    }

    public String toString() {
        return "\nSession(sessionId=" + this.f58355b + ", startTime=" + this.f58356c + ", endTime=" + mo63364w() + ", isSealed=" + this.f58358e + ", duration=" + m63838v() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: v */
    public final long m63838v() {
        Double mo63364w = mo63364w();
        if (mo63364w == null) {
            return -1L;
        }
        double doubleValue = mo63364w.doubleValue();
        long j = (long) (doubleValue - this.f58356c);
        if (j < 0) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12586b(doubleValue, this), 6, null);
        }
        return j;
    }

    /* renamed from: w */
    public Double mo63364w() {
        return this.f58357d;
    }

    /* renamed from: x */
    public final double m63837x() {
        return this.f58356c;
    }

    /* renamed from: y */
    public final boolean m63836y() {
        return this.f58358e;
    }

    /* renamed from: z */
    public final C12869l3 m63835z() {
        return new C12869l3(this.f58355b, this.f58356c, mo63364w(), this.f58358e);
    }

    /* renamed from: a */
    public final void m63841a(boolean z) {
        this.f58358e = z;
    }

    public C12584d5(JSONObject sessionData) {
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        C12648f5.C12649a c12649a = C12648f5.f58467d;
        String string = sessionData.getString(AnalyticsFields.SESSION_ID);
        Intrinsics.checkNotNullExpressionValue(string, "sessionData.getString(SESSION_ID_KEY)");
        this.f58355b = c12649a.m63732a(string);
        this.f58356c = sessionData.getDouble("start_time");
        this.f58358e = sessionData.getBoolean("is_sealed");
        mo63365a(C31696Aj2.m115352g(sessionData, "end_time"));
    }
}
