package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b-\u0010.JP\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"Lyg3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "deliveryTimeSeconds", "baseCost", "perMinuteCost", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;JLjava/lang/Long;Ljava/lang/Long;)Lyg3;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "J", "getDeliveryTimeSeconds", "()J", "e", "Ljava/lang/Long;", "getBaseCost", "()Ljava/lang/Long;", "f", "getPerMinuteCost", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;JLjava/lang/Long;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yg3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52341yg3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f119969a;

    /* renamed from: b */
    public final DateTime f119970b;

    /* renamed from: c */
    public final DateTime f119971c;

    /* renamed from: d */
    public final long f119972d;

    /* renamed from: e */
    public final Long f119973e;

    /* renamed from: f */
    public final Long f119974f;

    public C52341yg3(String eventId, DateTime eventTime, DateTime clientTime, long j, Long l, Long l2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f119969a = eventId;
        this.f119970b = eventTime;
        this.f119971c = clientTime;
        this.f119972d = j;
        this.f119973e = l;
        this.f119974f = l2;
    }

    public static /* synthetic */ C52341yg3 copy$default(C52341yg3 c52341yg3, String str, DateTime dateTime, DateTime dateTime2, long j, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c52341yg3.f119969a;
        }
        if ((i & 2) != 0) {
            dateTime = c52341yg3.f119970b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c52341yg3.f119971c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            j = c52341yg3.f119972d;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            l = c52341yg3.f119973e;
        }
        Long l3 = l;
        if ((i & 32) != 0) {
            l2 = c52341yg3.f119974f;
        }
        return c52341yg3.m2973a(str, dateTime3, dateTime4, j2, l3, l2);
    }

    /* renamed from: a */
    public final C52341yg3 m2973a(String eventId, DateTime eventTime, DateTime clientTime, long j, Long l, Long l2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C52341yg3(eventId, eventTime, clientTime, j, l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52341yg3) {
            C52341yg3 c52341yg3 = (C52341yg3) obj;
            return Intrinsics.areEqual(this.f119969a, c52341yg3.f119969a) && Intrinsics.areEqual(this.f119970b, c52341yg3.f119970b) && Intrinsics.areEqual(this.f119971c, c52341yg3.f119971c) && this.f119972d == c52341yg3.f119972d && Intrinsics.areEqual(this.f119973e, c52341yg3.f119973e) && Intrinsics.areEqual(this.f119974f, c52341yg3.f119974f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.OnDemandViabilitySendFeedbackClick";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f119969a), TuplesKt.m28425to("event_time", this.f119970b), TuplesKt.m28425to("client_time", this.f119971c), TuplesKt.m28425to("delivery_time_seconds", Long.valueOf(this.f119972d)), TuplesKt.m28425to("base_cost", this.f119973e), TuplesKt.m28425to("per_minute_cost", this.f119974f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f119969a.hashCode() * 31) + this.f119970b.hashCode()) * 31) + this.f119971c.hashCode()) * 31) + Long.hashCode(this.f119972d)) * 31;
        Long l = this.f119973e;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f119974f;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f119969a;
        DateTime dateTime = this.f119970b;
        DateTime dateTime2 = this.f119971c;
        long j = this.f119972d;
        Long l = this.f119973e;
        Long l2 = this.f119974f;
        return "OnDemandViabilitySendFeedbackClick(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", deliveryTimeSeconds=" + j + ", baseCost=" + l + ", perMinuteCost=" + l2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C52341yg3(String str, DateTime dateTime, DateTime dateTime2, long j, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, j, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2);
        String str2;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str2 = uuid;
        } else {
            str2 = str;
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