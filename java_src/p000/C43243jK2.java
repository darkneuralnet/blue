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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b=\u0010>J\u009a\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\b\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b\u0010\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u001a\u001a\u0004\b6\u0010\u001cR\"\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0017078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u001c¨\u0006?"}, m28432d2 = {"LjK2;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isInRegistration", "birdId", "", "distanceToVehicle", "walkingDistance", "walkingTime", "adjustedBatteryLevel", "range", "isRiderRebalance", "partnerId", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)LjK2;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "getBirdId", "f", "Ljava/lang/Long;", "getDistanceToVehicle", "()Ljava/lang/Long;", "g", "getWalkingDistance", "h", "getWalkingTime", "i", "getAdjustedBatteryLevel", "j", "getRange", "k", "l", "getPartnerId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jK2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43243jK2 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f92557a;

    /* renamed from: b */
    public final DateTime f92558b;

    /* renamed from: c */
    public final DateTime f92559c;

    /* renamed from: d */
    public final Boolean f92560d;

    /* renamed from: e */
    public final String f92561e;

    /* renamed from: f */
    public final Long f92562f;

    /* renamed from: g */
    public final Long f92563g;

    /* renamed from: h */
    public final Long f92564h;

    /* renamed from: i */
    public final Long f92565i;

    /* renamed from: j */
    public final Long f92566j;

    /* renamed from: k */
    public final Boolean f92567k;

    /* renamed from: l */
    public final String f92568l;

    public C43243jK2() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* renamed from: a */
    public final C43243jK2 m30770a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, String str, Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool2, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C43243jK2(eventId, eventTime, clientTime, bool, str, l, l2, l3, l4, l5, bool2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43243jK2) {
            C43243jK2 c43243jK2 = (C43243jK2) obj;
            return Intrinsics.areEqual(this.f92557a, c43243jK2.f92557a) && Intrinsics.areEqual(this.f92558b, c43243jK2.f92558b) && Intrinsics.areEqual(this.f92559c, c43243jK2.f92559c) && Intrinsics.areEqual(this.f92560d, c43243jK2.f92560d) && Intrinsics.areEqual(this.f92561e, c43243jK2.f92561e) && Intrinsics.areEqual(this.f92562f, c43243jK2.f92562f) && Intrinsics.areEqual(this.f92563g, c43243jK2.f92563g) && Intrinsics.areEqual(this.f92564h, c43243jK2.f92564h) && Intrinsics.areEqual(this.f92565i, c43243jK2.f92565i) && Intrinsics.areEqual(this.f92566j, c43243jK2.f92566j) && Intrinsics.areEqual(this.f92567k, c43243jK2.f92567k) && Intrinsics.areEqual(this.f92568l, c43243jK2.f92568l);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.MapBirdPinTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f92557a), TuplesKt.m28425to("event_time", this.f92558b), TuplesKt.m28425to("client_time", this.f92559c), TuplesKt.m28425to("is_in_registration", this.f92560d), TuplesKt.m28425to("bird_id", this.f92561e), TuplesKt.m28425to("distance_to_vehicle", this.f92562f), TuplesKt.m28425to("walking_distance", this.f92563g), TuplesKt.m28425to("walking_time", this.f92564h), TuplesKt.m28425to("adjusted_battery_level", this.f92565i), TuplesKt.m28425to("range", this.f92566j), TuplesKt.m28425to("is_rider_rebalance", this.f92567k), TuplesKt.m28425to("partner_id", this.f92568l));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f92557a.hashCode() * 31) + this.f92558b.hashCode()) * 31) + this.f92559c.hashCode()) * 31;
        Boolean bool = this.f92560d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f92561e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f92562f;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f92563g;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f92564h;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f92565i;
        int hashCode7 = (hashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f92566j;
        int hashCode8 = (hashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool2 = this.f92567k;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f92568l;
        return hashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f92557a;
        DateTime dateTime = this.f92558b;
        DateTime dateTime2 = this.f92559c;
        Boolean bool = this.f92560d;
        String str2 = this.f92561e;
        Long l = this.f92562f;
        Long l2 = this.f92563g;
        Long l3 = this.f92564h;
        Long l4 = this.f92565i;
        Long l5 = this.f92566j;
        Boolean bool2 = this.f92567k;
        String str3 = this.f92568l;
        return "MapBirdPinTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isInRegistration=" + bool + ", birdId=" + str2 + ", distanceToVehicle=" + l + ", walkingDistance=" + l2 + ", walkingTime=" + l3 + ", adjustedBatteryLevel=" + l4 + ", range=" + l5 + ", isRiderRebalance=" + bool2 + ", partnerId=" + str3 + ")";
    }

    public C43243jK2(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, String str, Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool2, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f92557a = eventId;
        this.f92558b = eventTime;
        this.f92559c = clientTime;
        this.f92560d = bool;
        this.f92561e = str;
        this.f92562f = l;
        this.f92563g = l2;
        this.f92564h = l3;
        this.f92565i = l4;
        this.f92566j = l5;
        this.f92567k = bool2;
        this.f92568l = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C43243jK2(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, String str2, Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r4, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : l3, (i & 256) != 0 ? null : l4, (i & 512) != 0 ? null : l5, (i & 1024) != 0 ? null : bool2, (i & 2048) == 0 ? str3 : null);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            str4 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str4, "randomUUID().toString()");
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            dateTime3 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime3, "now()");
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 4) != 0) {
            dateTime4 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime4, "now()");
        } else {
            dateTime4 = dateTime2;
        }
    }
}
