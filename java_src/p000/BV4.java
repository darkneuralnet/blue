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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b/\u00100J\\\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\n\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0017¨\u00061"}, m28432d2 = {"LBV4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "linkCode", "upsellContext", "", "isDetailDive", "", "siblingRidePassCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)LBV4;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getLinkCode", "e", "getUpsellContext", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "g", "Ljava/lang/Long;", "getSiblingRidePassCount", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: BV4 */
/* loaded from: classes4.dex */
public final class BV4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f2421a;

    /* renamed from: b */
    public final DateTime f2422b;

    /* renamed from: c */
    public final DateTime f2423c;

    /* renamed from: d */
    public final String f2424d;

    /* renamed from: e */
    public final String f2425e;

    /* renamed from: f */
    public final Boolean f2426f;

    /* renamed from: g */
    public final Long f2427g;

    public BV4(String eventId, DateTime eventTime, DateTime clientTime, String linkCode, String str, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        this.f2421a = eventId;
        this.f2422b = eventTime;
        this.f2423c = clientTime;
        this.f2424d = linkCode;
        this.f2425e = str;
        this.f2426f = bool;
        this.f2427g = l;
    }

    public static /* synthetic */ BV4 copy$default(BV4 bv4, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, Boolean bool, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bv4.f2421a;
        }
        if ((i & 2) != 0) {
            dateTime = bv4.f2422b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = bv4.f2423c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = bv4.f2424d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = bv4.f2425e;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            bool = bv4.f2426f;
        }
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            l = bv4.f2427g;
        }
        return bv4.m113963a(str, dateTime3, dateTime4, str4, str5, bool2, l);
    }

    /* renamed from: a */
    public final BV4 m113963a(String eventId, DateTime eventTime, DateTime clientTime, String linkCode, String str, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        return new BV4(eventId, eventTime, clientTime, linkCode, str, bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BV4) {
            BV4 bv4 = (BV4) obj;
            return Intrinsics.areEqual(this.f2421a, bv4.f2421a) && Intrinsics.areEqual(this.f2422b, bv4.f2422b) && Intrinsics.areEqual(this.f2423c, bv4.f2423c) && Intrinsics.areEqual(this.f2424d, bv4.f2424d) && Intrinsics.areEqual(this.f2425e, bv4.f2425e) && Intrinsics.areEqual(this.f2426f, bv4.f2426f) && Intrinsics.areEqual(this.f2427g, bv4.f2427g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RidePassPromoDetailDisplayed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f2421a), TuplesKt.m28425to("event_time", this.f2422b), TuplesKt.m28425to("client_time", this.f2423c), TuplesKt.m28425to("link_code", this.f2424d), TuplesKt.m28425to("upsell_context", this.f2425e), TuplesKt.m28425to("is_detail_dive", this.f2426f), TuplesKt.m28425to("sibling_ride_pass_count", this.f2427g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f2421a.hashCode() * 31) + this.f2422b.hashCode()) * 31) + this.f2423c.hashCode()) * 31) + this.f2424d.hashCode()) * 31;
        String str = this.f2425e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f2426f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.f2427g;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f2421a;
        DateTime dateTime = this.f2422b;
        DateTime dateTime2 = this.f2423c;
        String str2 = this.f2424d;
        String str3 = this.f2425e;
        Boolean bool = this.f2426f;
        Long l = this.f2427g;
        return "RidePassPromoDetailDisplayed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", linkCode=" + str2 + ", upsellContext=" + str3 + ", isDetailDive=" + bool + ", siblingRidePassCount=" + l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BV4(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str;
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
