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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+JS\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"Lkc5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "birdId", RequestHeadersFactory.MODEL, "nestId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getSessionId", "e", "getBirdId", "f", "getModel", "g", "getNestId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kc5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44003kc5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f94638a;

    /* renamed from: b */
    public final DateTime f94639b;

    /* renamed from: c */
    public final DateTime f94640c;

    /* renamed from: d */
    public final String f94641d;

    /* renamed from: e */
    public final String f94642e;

    /* renamed from: f */
    public final String f94643f;

    /* renamed from: g */
    public final String f94644g;

    public C44003kc5(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, String birdId, String str, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f94638a = eventId;
        this.f94639b = eventTime;
        this.f94640c = clientTime;
        this.f94641d = sessionId;
        this.f94642e = birdId;
        this.f94643f = str;
        this.f94644g = str2;
    }

    public static /* synthetic */ C44003kc5 copy$default(C44003kc5 c44003kc5, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c44003kc5.f94638a;
        }
        if ((i & 2) != 0) {
            dateTime = c44003kc5.f94639b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c44003kc5.f94640c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c44003kc5.f94641d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = c44003kc5.f94642e;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = c44003kc5.f94643f;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = c44003kc5.f94644g;
        }
        return c44003kc5.m28792a(str, dateTime3, dateTime4, str6, str7, str8, str5);
    }

    /* renamed from: a */
    public final C44003kc5 m28792a(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, String birdId, String str, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new C44003kc5(eventId, eventTime, clientTime, sessionId, birdId, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44003kc5) {
            C44003kc5 c44003kc5 = (C44003kc5) obj;
            return Intrinsics.areEqual(this.f94638a, c44003kc5.f94638a) && Intrinsics.areEqual(this.f94639b, c44003kc5.f94639b) && Intrinsics.areEqual(this.f94640c, c44003kc5.f94640c) && Intrinsics.areEqual(this.f94641d, c44003kc5.f94641d) && Intrinsics.areEqual(this.f94642e, c44003kc5.f94642e) && Intrinsics.areEqual(this.f94643f, c44003kc5.f94643f) && Intrinsics.areEqual(this.f94644g, c44003kc5.f94644g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RoutingAbandoned";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f94638a), TuplesKt.m28425to("event_time", this.f94639b), TuplesKt.m28425to("client_time", this.f94640c), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f94641d), TuplesKt.m28425to("bird_id", this.f94642e), TuplesKt.m28425to(RequestHeadersFactory.MODEL, this.f94643f), TuplesKt.m28425to("nest_id", this.f94644g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f94638a.hashCode() * 31) + this.f94639b.hashCode()) * 31) + this.f94640c.hashCode()) * 31) + this.f94641d.hashCode()) * 31) + this.f94642e.hashCode()) * 31;
        String str = this.f94643f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94644g;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f94638a;
        DateTime dateTime = this.f94639b;
        DateTime dateTime2 = this.f94640c;
        String str2 = this.f94641d;
        String str3 = this.f94642e;
        String str4 = this.f94643f;
        String str5 = this.f94644g;
        return "RoutingAbandoned(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str2 + ", birdId=" + str3 + ", model=" + str4 + ", nestId=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C44003kc5(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
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
        if ((i & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}