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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b0\u00101J\\\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0017¨\u00062"}, m28432d2 = {"LMm3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "intent", "", "nearestDemandAreaMeters", "", "demandLevel", "lifetimeFrictionCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)LMm3;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getIntent", "e", "Ljava/lang/Double;", "getNearestDemandAreaMeters", "()Ljava/lang/Double;", "f", "Ljava/lang/Integer;", "getDemandLevel", "()Ljava/lang/Integer;", "g", "getLifetimeFrictionCount", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mm3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34532Mm3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f23532a;

    /* renamed from: b */
    public final DateTime f23533b;

    /* renamed from: c */
    public final DateTime f23534c;

    /* renamed from: d */
    public final String f23535d;

    /* renamed from: e */
    public final Double f23536e;

    /* renamed from: f */
    public final Integer f23537f;

    /* renamed from: g */
    public final Integer f23538g;

    public C34532Mm3(String eventId, DateTime eventTime, DateTime clientTime, String intent, Double d, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f23532a = eventId;
        this.f23533b = eventTime;
        this.f23534c = clientTime;
        this.f23535d = intent;
        this.f23536e = d;
        this.f23537f = num;
        this.f23538g = num2;
    }

    public static /* synthetic */ C34532Mm3 copy$default(C34532Mm3 c34532Mm3, String str, DateTime dateTime, DateTime dateTime2, String str2, Double d, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c34532Mm3.f23532a;
        }
        if ((i & 2) != 0) {
            dateTime = c34532Mm3.f23533b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c34532Mm3.f23534c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c34532Mm3.f23535d;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            d = c34532Mm3.f23536e;
        }
        Double d2 = d;
        if ((i & 32) != 0) {
            num = c34532Mm3.f23537f;
        }
        Integer num3 = num;
        if ((i & 64) != 0) {
            num2 = c34532Mm3.f23538g;
        }
        return c34532Mm3.m94879a(str, dateTime3, dateTime4, str3, d2, num3, num2);
    }

    /* renamed from: a */
    public final C34532Mm3 m94879a(String eventId, DateTime eventTime, DateTime clientTime, String intent, Double d, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new C34532Mm3(eventId, eventTime, clientTime, intent, d, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34532Mm3) {
            C34532Mm3 c34532Mm3 = (C34532Mm3) obj;
            return Intrinsics.areEqual(this.f23532a, c34532Mm3.f23532a) && Intrinsics.areEqual(this.f23533b, c34532Mm3.f23533b) && Intrinsics.areEqual(this.f23534c, c34532Mm3.f23534c) && Intrinsics.areEqual(this.f23535d, c34532Mm3.f23535d) && Intrinsics.areEqual((Object) this.f23536e, (Object) c34532Mm3.f23536e) && Intrinsics.areEqual(this.f23537f, c34532Mm3.f23537f) && Intrinsics.areEqual(this.f23538g, c34532Mm3.f23538g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.OperatorMapScanButtonTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f23532a), TuplesKt.m28425to("event_time", this.f23533b), TuplesKt.m28425to("client_time", this.f23534c), TuplesKt.m28425to("intent", this.f23535d), TuplesKt.m28425to("nearest_demand_area_meters", this.f23536e), TuplesKt.m28425to("demand_level", this.f23537f), TuplesKt.m28425to("lifetime_friction_count", this.f23538g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f23532a.hashCode() * 31) + this.f23533b.hashCode()) * 31) + this.f23534c.hashCode()) * 31) + this.f23535d.hashCode()) * 31;
        Double d = this.f23536e;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f23537f;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f23538g;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f23532a;
        DateTime dateTime = this.f23533b;
        DateTime dateTime2 = this.f23534c;
        String str2 = this.f23535d;
        Double d = this.f23536e;
        Integer num = this.f23537f;
        Integer num2 = this.f23538g;
        return "OperatorMapScanButtonTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", intent=" + str2 + ", nearestDemandAreaMeters=" + d + ", demandLevel=" + num + ", lifetimeFrictionCount=" + num2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C34532Mm3(String str, DateTime dateTime, DateTime dateTime2, String str2, Double d, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2);
        String str3;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str3 = uuid;
        } else {
            str3 = str;
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
