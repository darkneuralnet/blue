package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+JQ\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"LjF6;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "workOrderId", RequestHeadersFactory.MODEL, C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getSessionId", "c", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "getClientTime", "e", "getBirdId", "f", "getWorkOrderId", "g", "getModel", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jF6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43202jF6 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f92395a;

    /* renamed from: b */
    public final String f92396b;

    /* renamed from: c */
    public final DateTime f92397c;

    /* renamed from: d */
    public final DateTime f92398d;

    /* renamed from: e */
    public final String f92399e;

    /* renamed from: f */
    public final String f92400f;

    /* renamed from: g */
    public final String f92401g;

    public C43202jF6(String eventId, String sessionId, DateTime eventTime, DateTime clientTime, String birdId, String workOrderId, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        this.f92395a = eventId;
        this.f92396b = sessionId;
        this.f92397c = eventTime;
        this.f92398d = clientTime;
        this.f92399e = birdId;
        this.f92400f = workOrderId;
        this.f92401g = str;
    }

    public static /* synthetic */ C43202jF6 copy$default(C43202jF6 c43202jF6, String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c43202jF6.f92395a;
        }
        if ((i & 2) != 0) {
            str2 = c43202jF6.f92396b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            dateTime = c43202jF6.f92397c;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 8) != 0) {
            dateTime2 = c43202jF6.f92398d;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 16) != 0) {
            str3 = c43202jF6.f92399e;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = c43202jF6.f92400f;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = c43202jF6.f92401g;
        }
        return c43202jF6.m30917a(str, str6, dateTime3, dateTime4, str7, str8, str5);
    }

    /* renamed from: a */
    public final C43202jF6 m30917a(String eventId, String sessionId, DateTime eventTime, DateTime clientTime, String birdId, String workOrderId, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        return new C43202jF6(eventId, sessionId, eventTime, clientTime, birdId, workOrderId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43202jF6) {
            C43202jF6 c43202jF6 = (C43202jF6) obj;
            return Intrinsics.areEqual(this.f92395a, c43202jF6.f92395a) && Intrinsics.areEqual(this.f92396b, c43202jF6.f92396b) && Intrinsics.areEqual(this.f92397c, c43202jF6.f92397c) && Intrinsics.areEqual(this.f92398d, c43202jF6.f92398d) && Intrinsics.areEqual(this.f92399e, c43202jF6.f92399e) && Intrinsics.areEqual(this.f92400f, c43202jF6.f92400f) && Intrinsics.areEqual(this.f92401g, c43202jF6.f92401g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.WorkOrderInspectionStarted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f92395a), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f92396b), TuplesKt.m28425to("event_time", this.f92397c), TuplesKt.m28425to("client_time", this.f92398d), TuplesKt.m28425to("bird_id", this.f92399e), TuplesKt.m28425to("work_order_id", this.f92400f), TuplesKt.m28425to(RequestHeadersFactory.MODEL, this.f92401g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f92395a.hashCode() * 31) + this.f92396b.hashCode()) * 31) + this.f92397c.hashCode()) * 31) + this.f92398d.hashCode()) * 31) + this.f92399e.hashCode()) * 31) + this.f92400f.hashCode()) * 31;
        String str = this.f92401g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f92395a;
        String str2 = this.f92396b;
        DateTime dateTime = this.f92397c;
        DateTime dateTime2 = this.f92398d;
        String str3 = this.f92399e;
        String str4 = this.f92400f;
        String str5 = this.f92401g;
        return "WorkOrderInspectionStarted(eventId=" + str + ", sessionId=" + str2 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str3 + ", workOrderId=" + str4 + ", model=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C43202jF6(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, str2, r5, r6, str3, str4, (i & 64) != 0 ? null : str5);
        String str6;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str6 = uuid;
        } else {
            str6 = str;
        }
        if ((i & 4) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 8) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
