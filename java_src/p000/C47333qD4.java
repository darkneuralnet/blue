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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b-\u0010.JZ\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"LqD4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "birdId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "workOrderId", "", "numOpenIssues", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Integer;)LqD4;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getBirdId", "c", "getSessionId", DateTokenConverter.CONVERTER_KEY, "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "e", "getClientTime", "f", "getWorkOrderId", "g", "Ljava/lang/Integer;", "getNumOpenIssues", "()Ljava/lang/Integer;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Integer;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qD4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47333qD4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f104924a;

    /* renamed from: b */
    public final String f104925b;

    /* renamed from: c */
    public final String f104926c;

    /* renamed from: d */
    public final DateTime f104927d;

    /* renamed from: e */
    public final DateTime f104928e;

    /* renamed from: f */
    public final String f104929f;

    /* renamed from: g */
    public final Integer f104930g;

    public C47333qD4(String eventId, String birdId, String sessionId, DateTime eventTime, DateTime clientTime, String str, Integer num) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f104924a = eventId;
        this.f104925b = birdId;
        this.f104926c = sessionId;
        this.f104927d = eventTime;
        this.f104928e = clientTime;
        this.f104929f = str;
        this.f104930g = num;
    }

    public static /* synthetic */ C47333qD4 copy$default(C47333qD4 c47333qD4, String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c47333qD4.f104924a;
        }
        if ((i & 2) != 0) {
            str2 = c47333qD4.f104925b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c47333qD4.f104926c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            dateTime = c47333qD4.f104927d;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 16) != 0) {
            dateTime2 = c47333qD4.f104928e;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 32) != 0) {
            str4 = c47333qD4.f104929f;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            num = c47333qD4.f104930g;
        }
        return c47333qD4.m17895a(str, str5, str6, dateTime3, dateTime4, str7, num);
    }

    /* renamed from: a */
    public final C47333qD4 m17895a(String eventId, String birdId, String sessionId, DateTime eventTime, DateTime clientTime, String str, Integer num) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C47333qD4(eventId, birdId, sessionId, eventTime, clientTime, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C47333qD4) {
            C47333qD4 c47333qD4 = (C47333qD4) obj;
            return Intrinsics.areEqual(this.f104924a, c47333qD4.f104924a) && Intrinsics.areEqual(this.f104925b, c47333qD4.f104925b) && Intrinsics.areEqual(this.f104926c, c47333qD4.f104926c) && Intrinsics.areEqual(this.f104927d, c47333qD4.f104927d) && Intrinsics.areEqual(this.f104928e, c47333qD4.f104928e) && Intrinsics.areEqual(this.f104929f, c47333qD4.f104929f) && Intrinsics.areEqual(this.f104930g, c47333qD4.f104930g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RepairStarted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f104924a), TuplesKt.m28425to("bird_id", this.f104925b), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f104926c), TuplesKt.m28425to("event_time", this.f104927d), TuplesKt.m28425to("client_time", this.f104928e), TuplesKt.m28425to("work_order_id", this.f104929f), TuplesKt.m28425to("num_open_issues", this.f104930g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f104924a.hashCode() * 31) + this.f104925b.hashCode()) * 31) + this.f104926c.hashCode()) * 31) + this.f104927d.hashCode()) * 31) + this.f104928e.hashCode()) * 31;
        String str = this.f104929f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f104930g;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.f104924a;
        String str2 = this.f104925b;
        String str3 = this.f104926c;
        DateTime dateTime = this.f104927d;
        DateTime dateTime2 = this.f104928e;
        String str4 = this.f104929f;
        Integer num = this.f104930g;
        return "RepairStarted(eventId=" + str + ", birdId=" + str2 + ", sessionId=" + str3 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", workOrderId=" + str4 + ", numOpenIssues=" + num + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C47333qD4(String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, str2, str3, r6, r7, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num);
        String str5;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str5 = uuid;
        } else {
            str5 = str;
        }
        if ((i & 8) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 16) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
