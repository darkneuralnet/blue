package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b2\u00103Jc\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0017¨\u00064"}, m28432d2 = {"LLy4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "birdId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "workOrderId", "", "numResolvedIssues", "numDisputedIssues", "numRepairsCompleted", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getBirdId", "c", "getSessionId", DateTokenConverter.CONVERTER_KEY, "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "e", "getClientTime", "f", "getWorkOrderId", "g", "I", "getNumResolvedIssues", "()I", "h", "getNumDisputedIssues", "i", "getNumRepairsCompleted", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;III)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ly4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34407Ly4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f22348a;

    /* renamed from: b */
    public final String f22349b;

    /* renamed from: c */
    public final String f22350c;

    /* renamed from: d */
    public final DateTime f22351d;

    /* renamed from: e */
    public final DateTime f22352e;

    /* renamed from: f */
    public final String f22353f;

    /* renamed from: g */
    public final int f22354g;

    /* renamed from: h */
    public final int f22355h;

    /* renamed from: i */
    public final int f22356i;

    public C34407Ly4(String eventId, String birdId, String sessionId, DateTime eventTime, DateTime clientTime, String workOrderId, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        this.f22348a = eventId;
        this.f22349b = birdId;
        this.f22350c = sessionId;
        this.f22351d = eventTime;
        this.f22352e = clientTime;
        this.f22353f = workOrderId;
        this.f22354g = i;
        this.f22355h = i2;
        this.f22356i = i3;
    }

    /* renamed from: a */
    public final C34407Ly4 m96053a(String eventId, String birdId, String sessionId, DateTime eventTime, DateTime clientTime, String workOrderId, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        return new C34407Ly4(eventId, birdId, sessionId, eventTime, clientTime, workOrderId, i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34407Ly4) {
            C34407Ly4 c34407Ly4 = (C34407Ly4) obj;
            return Intrinsics.areEqual(this.f22348a, c34407Ly4.f22348a) && Intrinsics.areEqual(this.f22349b, c34407Ly4.f22349b) && Intrinsics.areEqual(this.f22350c, c34407Ly4.f22350c) && Intrinsics.areEqual(this.f22351d, c34407Ly4.f22351d) && Intrinsics.areEqual(this.f22352e, c34407Ly4.f22352e) && Intrinsics.areEqual(this.f22353f, c34407Ly4.f22353f) && this.f22354g == c34407Ly4.f22354g && this.f22355h == c34407Ly4.f22355h && this.f22356i == c34407Ly4.f22356i;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RepairCompleted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f22348a), TuplesKt.m28425to("bird_id", this.f22349b), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f22350c), TuplesKt.m28425to("event_time", this.f22351d), TuplesKt.m28425to("client_time", this.f22352e), TuplesKt.m28425to("work_order_id", this.f22353f), TuplesKt.m28425to("num_resolved_issues", Integer.valueOf(this.f22354g)), TuplesKt.m28425to("num_disputed_issues", Integer.valueOf(this.f22355h)), TuplesKt.m28425to("num_repairs_completed", Integer.valueOf(this.f22356i)));
        return mapOf;
    }

    public int hashCode() {
        return (((((((((((((((this.f22348a.hashCode() * 31) + this.f22349b.hashCode()) * 31) + this.f22350c.hashCode()) * 31) + this.f22351d.hashCode()) * 31) + this.f22352e.hashCode()) * 31) + this.f22353f.hashCode()) * 31) + Integer.hashCode(this.f22354g)) * 31) + Integer.hashCode(this.f22355h)) * 31) + Integer.hashCode(this.f22356i);
    }

    public String toString() {
        String str = this.f22348a;
        String str2 = this.f22349b;
        String str3 = this.f22350c;
        DateTime dateTime = this.f22351d;
        DateTime dateTime2 = this.f22352e;
        String str4 = this.f22353f;
        int i = this.f22354g;
        int i2 = this.f22355h;
        int i3 = this.f22356i;
        return "RepairCompleted(eventId=" + str + ", birdId=" + str2 + ", sessionId=" + str3 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", workOrderId=" + str4 + ", numResolvedIssues=" + i + ", numDisputedIssues=" + i2 + ", numRepairsCompleted=" + i3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C34407Ly4(String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, str2, str3, r6, r7, str4, i, i2, i3);
        String str5;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i4 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str5 = uuid;
        } else {
            str5 = str;
        }
        if ((i4 & 8) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i4 & 16) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
