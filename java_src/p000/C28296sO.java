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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b9\u0010:J\u0080\u0001\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b2\u0010\u001aR\"\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0015038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001a¨\u0006;"}, m28432d2 = {"LsO;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "funnelSource", "", "passthroughChargeEnabled", "merchantId", "merchantSiteId", "placardId", "", "couponAmount", "currency", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)LsO;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getFunnelSource", "e", "Ljava/lang/Boolean;", "getPassthroughChargeEnabled", "()Ljava/lang/Boolean;", "f", "getMerchantId", "g", "getMerchantSiteId", "h", "getPlacardId", "i", "Ljava/lang/Long;", "getCouponAmount", "()Ljava/lang/Long;", "j", "getCurrency", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sO */
/* loaded from: classes4.dex */
public final class C28296sO implements AnalyticsEvent {

    /* renamed from: a */
    public final String f108710a;

    /* renamed from: b */
    public final DateTime f108711b;

    /* renamed from: c */
    public final DateTime f108712c;

    /* renamed from: d */
    public final String f108713d;

    /* renamed from: e */
    public final Boolean f108714e;

    /* renamed from: f */
    public final String f108715f;

    /* renamed from: g */
    public final String f108716g;

    /* renamed from: h */
    public final String f108717h;

    /* renamed from: i */
    public final Long f108718i;

    /* renamed from: j */
    public final String f108719j;

    public C28296sO(String eventId, DateTime eventTime, DateTime clientTime, String funnelSource, Boolean bool, String str, String str2, String str3, Long l, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(funnelSource, "funnelSource");
        this.f108710a = eventId;
        this.f108711b = eventTime;
        this.f108712c = clientTime;
        this.f108713d = funnelSource;
        this.f108714e = bool;
        this.f108715f = str;
        this.f108716g = str2;
        this.f108717h = str3;
        this.f108718i = l;
        this.f108719j = str4;
    }

    /* renamed from: a */
    public final C28296sO m14248a(String eventId, DateTime eventTime, DateTime clientTime, String funnelSource, Boolean bool, String str, String str2, String str3, Long l, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(funnelSource, "funnelSource");
        return new C28296sO(eventId, eventTime, clientTime, funnelSource, bool, str, str2, str3, l, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28296sO) {
            C28296sO c28296sO = (C28296sO) obj;
            return Intrinsics.areEqual(this.f108710a, c28296sO.f108710a) && Intrinsics.areEqual(this.f108711b, c28296sO.f108711b) && Intrinsics.areEqual(this.f108712c, c28296sO.f108712c) && Intrinsics.areEqual(this.f108713d, c28296sO.f108713d) && Intrinsics.areEqual(this.f108714e, c28296sO.f108714e) && Intrinsics.areEqual(this.f108715f, c28296sO.f108715f) && Intrinsics.areEqual(this.f108716g, c28296sO.f108716g) && Intrinsics.areEqual(this.f108717h, c28296sO.f108717h) && Intrinsics.areEqual(this.f108718i, c28296sO.f108718i) && Intrinsics.areEqual(this.f108719j, c28296sO.f108719j);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BirdPayPaymentEntryShown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f108710a), TuplesKt.m28425to("event_time", this.f108711b), TuplesKt.m28425to("client_time", this.f108712c), TuplesKt.m28425to("funnel_source", this.f108713d), TuplesKt.m28425to("passthrough_charge_enabled", this.f108714e), TuplesKt.m28425to("merchant_id", this.f108715f), TuplesKt.m28425to("merchant_site_id", this.f108716g), TuplesKt.m28425to("placard_id", this.f108717h), TuplesKt.m28425to("coupon_amount", this.f108718i), TuplesKt.m28425to("currency", this.f108719j));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f108710a.hashCode() * 31) + this.f108711b.hashCode()) * 31) + this.f108712c.hashCode()) * 31) + this.f108713d.hashCode()) * 31;
        Boolean bool = this.f108714e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f108715f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f108716g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f108717h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f108718i;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.f108719j;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f108710a;
        DateTime dateTime = this.f108711b;
        DateTime dateTime2 = this.f108712c;
        String str2 = this.f108713d;
        Boolean bool = this.f108714e;
        String str3 = this.f108715f;
        String str4 = this.f108716g;
        String str5 = this.f108717h;
        Long l = this.f108718i;
        String str6 = this.f108719j;
        return "BirdPayPaymentEntryShown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", funnelSource=" + str2 + ", passthroughChargeEnabled=" + bool + ", merchantId=" + str3 + ", merchantSiteId=" + str4 + ", placardId=" + str5 + ", couponAmount=" + l + ", currency=" + str6 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C28296sO(String str, DateTime dateTime, DateTime dateTime2, String str2, Boolean bool, String str3, String str4, String str5, Long l, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : str6);
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
