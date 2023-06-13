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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b-\u0010.J]\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"LCn5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "birdId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", RequestHeadersFactory.MODEL, "requestId", "requestReason", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getBirdId", "c", "getSessionId", DateTokenConverter.CONVERTER_KEY, "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "e", "getClientTime", "f", "getModel", "g", "getRequestId", "h", "getRequestReason", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Cn5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32203Cn5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f4672a;

    /* renamed from: b */
    public final String f4673b;

    /* renamed from: c */
    public final String f4674c;

    /* renamed from: d */
    public final DateTime f4675d;

    /* renamed from: e */
    public final DateTime f4676e;

    /* renamed from: f */
    public final String f4677f;

    /* renamed from: g */
    public final String f4678g;

    /* renamed from: h */
    public final String f4679h;

    public C32203Cn5(String eventId, String birdId, String sessionId, DateTime eventTime, DateTime clientTime, String str, String requestId, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f4672a = eventId;
        this.f4673b = birdId;
        this.f4674c = sessionId;
        this.f4675d = eventTime;
        this.f4676e = clientTime;
        this.f4677f = str;
        this.f4678g = requestId;
        this.f4679h = str2;
    }

    /* renamed from: a */
    public final C32203Cn5 m111687a(String eventId, String birdId, String sessionId, DateTime eventTime, DateTime clientTime, String str, String requestId, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return new C32203Cn5(eventId, birdId, sessionId, eventTime, clientTime, str, requestId, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32203Cn5) {
            C32203Cn5 c32203Cn5 = (C32203Cn5) obj;
            return Intrinsics.areEqual(this.f4672a, c32203Cn5.f4672a) && Intrinsics.areEqual(this.f4673b, c32203Cn5.f4673b) && Intrinsics.areEqual(this.f4674c, c32203Cn5.f4674c) && Intrinsics.areEqual(this.f4675d, c32203Cn5.f4675d) && Intrinsics.areEqual(this.f4676e, c32203Cn5.f4676e) && Intrinsics.areEqual(this.f4677f, c32203Cn5.f4677f) && Intrinsics.areEqual(this.f4678g, c32203Cn5.f4678g) && Intrinsics.areEqual(this.f4679h, c32203Cn5.f4679h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ScrapInspectionCompleted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f4672a), TuplesKt.m28425to("bird_id", this.f4673b), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f4674c), TuplesKt.m28425to("event_time", this.f4675d), TuplesKt.m28425to("client_time", this.f4676e), TuplesKt.m28425to(RequestHeadersFactory.MODEL, this.f4677f), TuplesKt.m28425to("request_id", this.f4678g), TuplesKt.m28425to("request_reason", this.f4679h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f4672a.hashCode() * 31) + this.f4673b.hashCode()) * 31) + this.f4674c.hashCode()) * 31) + this.f4675d.hashCode()) * 31) + this.f4676e.hashCode()) * 31;
        String str = this.f4677f;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f4678g.hashCode()) * 31;
        String str2 = this.f4679h;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f4672a;
        String str2 = this.f4673b;
        String str3 = this.f4674c;
        DateTime dateTime = this.f4675d;
        DateTime dateTime2 = this.f4676e;
        String str4 = this.f4677f;
        String str5 = this.f4678g;
        String str6 = this.f4679h;
        return "ScrapInspectionCompleted(eventId=" + str + ", birdId=" + str2 + ", sessionId=" + str3 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", model=" + str4 + ", requestId=" + str5 + ", requestReason=" + str6 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C32203Cn5(String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, str2, str3, r7, r8, (i & 32) != 0 ? null : str4, str5, (i & 128) != 0 ? null : str6);
        String str7;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str7 = uuid;
        } else {
            str7 = str;
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
