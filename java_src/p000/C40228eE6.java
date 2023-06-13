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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b,\u0010-JQ\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0015¨\u0006."}, m28432d2 = {"LeE6;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "workOrderId", "", "numIssuesAdded", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getSessionId", "c", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "getClientTime", "e", "getBirdId", "f", "getWorkOrderId", "g", "I", "getNumIssuesAdded", "()I", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;I)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eE6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40228eE6 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f78150a;

    /* renamed from: b */
    public final String f78151b;

    /* renamed from: c */
    public final DateTime f78152c;

    /* renamed from: d */
    public final DateTime f78153d;

    /* renamed from: e */
    public final String f78154e;

    /* renamed from: f */
    public final String f78155f;

    /* renamed from: g */
    public final int f78156g;

    public C40228eE6(String eventId, String str, DateTime eventTime, DateTime clientTime, String birdId, String workOrderId, int i) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        this.f78150a = eventId;
        this.f78151b = str;
        this.f78152c = eventTime;
        this.f78153d = clientTime;
        this.f78154e = birdId;
        this.f78155f = workOrderId;
        this.f78156g = i;
    }

    public static /* synthetic */ C40228eE6 copy$default(C40228eE6 c40228eE6, String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c40228eE6.f78150a;
        }
        if ((i2 & 2) != 0) {
            str2 = c40228eE6.f78151b;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            dateTime = c40228eE6.f78152c;
        }
        DateTime dateTime3 = dateTime;
        if ((i2 & 8) != 0) {
            dateTime2 = c40228eE6.f78153d;
        }
        DateTime dateTime4 = dateTime2;
        if ((i2 & 16) != 0) {
            str3 = c40228eE6.f78154e;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = c40228eE6.f78155f;
        }
        String str7 = str4;
        if ((i2 & 64) != 0) {
            i = c40228eE6.f78156g;
        }
        return c40228eE6.m43085a(str, str5, dateTime3, dateTime4, str6, str7, i);
    }

    /* renamed from: a */
    public final C40228eE6 m43085a(String eventId, String str, DateTime eventTime, DateTime clientTime, String birdId, String workOrderId, int i) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        return new C40228eE6(eventId, str, eventTime, clientTime, birdId, workOrderId, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40228eE6) {
            C40228eE6 c40228eE6 = (C40228eE6) obj;
            return Intrinsics.areEqual(this.f78150a, c40228eE6.f78150a) && Intrinsics.areEqual(this.f78151b, c40228eE6.f78151b) && Intrinsics.areEqual(this.f78152c, c40228eE6.f78152c) && Intrinsics.areEqual(this.f78153d, c40228eE6.f78153d) && Intrinsics.areEqual(this.f78154e, c40228eE6.f78154e) && Intrinsics.areEqual(this.f78155f, c40228eE6.f78155f) && this.f78156g == c40228eE6.f78156g;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.WorkOrderInspectionCompleted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f78150a), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f78151b), TuplesKt.m28425to("event_time", this.f78152c), TuplesKt.m28425to("client_time", this.f78153d), TuplesKt.m28425to("bird_id", this.f78154e), TuplesKt.m28425to("work_order_id", this.f78155f), TuplesKt.m28425to("num_issues_added", Integer.valueOf(this.f78156g)));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = this.f78150a.hashCode() * 31;
        String str = this.f78151b;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f78152c.hashCode()) * 31) + this.f78153d.hashCode()) * 31) + this.f78154e.hashCode()) * 31) + this.f78155f.hashCode()) * 31) + Integer.hashCode(this.f78156g);
    }

    public String toString() {
        String str = this.f78150a;
        String str2 = this.f78151b;
        DateTime dateTime = this.f78152c;
        DateTime dateTime2 = this.f78153d;
        String str3 = this.f78154e;
        String str4 = this.f78155f;
        int i = this.f78156g;
        return "WorkOrderInspectionCompleted(eventId=" + str + ", sessionId=" + str2 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str3 + ", workOrderId=" + str4 + ", numIssuesAdded=" + i + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C40228eE6(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, r6, str3, str4, i);
        String str5;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i2 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str5 = uuid;
        } else {
            str5 = str;
        }
        String str6 = (i2 & 2) != 0 ? null : str2;
        if ((i2 & 4) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i2 & 8) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
