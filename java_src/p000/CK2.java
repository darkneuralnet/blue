package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.places.Place;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b8\u00109J\u0082\u0001\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u000b\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\"\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0015028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001a¨\u0006:"}, m28432d2 = {"LCK2;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "merchantId", "merchantName", "merchantSiteId", "", "isInRegistration", "", "distanceToMerchant", "walkingDistance", "walkingTime", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)LCK2;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getMerchantId", "e", "getMerchantName", "f", "getMerchantSiteId", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "h", "Ljava/lang/Long;", "getDistanceToMerchant", "()Ljava/lang/Long;", "i", "getWalkingDistance", "j", "getWalkingTime", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CK2 */
/* loaded from: classes4.dex */
public final class CK2 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f3941a;

    /* renamed from: b */
    public final DateTime f3942b;

    /* renamed from: c */
    public final DateTime f3943c;

    /* renamed from: d */
    public final String f3944d;

    /* renamed from: e */
    public final String f3945e;

    /* renamed from: f */
    public final String f3946f;

    /* renamed from: g */
    public final Boolean f3947g;

    /* renamed from: h */
    public final Long f3948h;

    /* renamed from: i */
    public final Long f3949i;

    /* renamed from: j */
    public final Long f3950j;

    public CK2() {
        this(null, null, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    /* renamed from: a */
    public final CK2 m112337a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, Boolean bool, Long l, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new CK2(eventId, eventTime, clientTime, str, str2, str3, bool, l, l2, l3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CK2) {
            CK2 ck2 = (CK2) obj;
            return Intrinsics.areEqual(this.f3941a, ck2.f3941a) && Intrinsics.areEqual(this.f3942b, ck2.f3942b) && Intrinsics.areEqual(this.f3943c, ck2.f3943c) && Intrinsics.areEqual(this.f3944d, ck2.f3944d) && Intrinsics.areEqual(this.f3945e, ck2.f3945e) && Intrinsics.areEqual(this.f3946f, ck2.f3946f) && Intrinsics.areEqual(this.f3947g, ck2.f3947g) && Intrinsics.areEqual(this.f3948h, ck2.f3948h) && Intrinsics.areEqual(this.f3949i, ck2.f3949i) && Intrinsics.areEqual(this.f3950j, ck2.f3950j);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.MapMerchantPinTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f3941a), TuplesKt.m28425to("event_time", this.f3942b), TuplesKt.m28425to("client_time", this.f3943c), TuplesKt.m28425to("merchant_id", this.f3944d), TuplesKt.m28425to("merchant_name", this.f3945e), TuplesKt.m28425to("merchant_site_id", this.f3946f), TuplesKt.m28425to("is_in_registration", this.f3947g), TuplesKt.m28425to("distance_to_merchant", this.f3948h), TuplesKt.m28425to("walking_distance", this.f3949i), TuplesKt.m28425to("walking_time", this.f3950j));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f3941a.hashCode() * 31) + this.f3942b.hashCode()) * 31) + this.f3943c.hashCode()) * 31;
        String str = this.f3944d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3945e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3946f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f3947g;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.f3948h;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f3949i;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f3950j;
        return hashCode7 + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f3941a;
        DateTime dateTime = this.f3942b;
        DateTime dateTime2 = this.f3943c;
        String str2 = this.f3944d;
        String str3 = this.f3945e;
        String str4 = this.f3946f;
        Boolean bool = this.f3947g;
        Long l = this.f3948h;
        Long l2 = this.f3949i;
        Long l3 = this.f3950j;
        return "MapMerchantPinTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", merchantId=" + str2 + ", merchantName=" + str3 + ", merchantSiteId=" + str4 + ", isInRegistration=" + bool + ", distanceToMerchant=" + l + ", walkingDistance=" + l2 + ", walkingTime=" + l3 + ")";
    }

    public CK2(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, Boolean bool, Long l, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f3941a = eventId;
        this.f3942b = eventTime;
        this.f3943c = clientTime;
        this.f3944d = str;
        this.f3945e = str2;
        this.f3946f = str3;
        this.f3947g = bool;
        this.f3948h = l;
        this.f3949i = l2;
        this.f3950j = l3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CK2(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, Boolean bool, Long l, Long l2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r4, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : l2, (i & 512) == 0 ? l3 : null);
        String str5;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            str5 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str5, "randomUUID().toString()");
        } else {
            str5 = str;
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
