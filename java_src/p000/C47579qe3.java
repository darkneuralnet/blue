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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b-\u0010.Ja\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"Lqe3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "campaignId", "offerStage", "kind", "merchantId", "merchantSiteId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getCampaignId", "e", "getOfferStage", "f", "getKind", "g", "getMerchantId", "h", "getMerchantSiteId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qe3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47579qe3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f105554a;

    /* renamed from: b */
    public final DateTime f105555b;

    /* renamed from: c */
    public final DateTime f105556c;

    /* renamed from: d */
    public final String f105557d;

    /* renamed from: e */
    public final String f105558e;

    /* renamed from: f */
    public final String f105559f;

    /* renamed from: g */
    public final String f105560g;

    /* renamed from: h */
    public final String f105561h;

    public C47579qe3(String eventId, DateTime eventTime, DateTime clientTime, String str, String offerStage, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(offerStage, "offerStage");
        this.f105554a = eventId;
        this.f105555b = eventTime;
        this.f105556c = clientTime;
        this.f105557d = str;
        this.f105558e = offerStage;
        this.f105559f = str2;
        this.f105560g = str3;
        this.f105561h = str4;
    }

    /* renamed from: a */
    public final C47579qe3 m17285a(String eventId, DateTime eventTime, DateTime clientTime, String str, String offerStage, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(offerStage, "offerStage");
        return new C47579qe3(eventId, eventTime, clientTime, str, offerStage, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C47579qe3) {
            C47579qe3 c47579qe3 = (C47579qe3) obj;
            return Intrinsics.areEqual(this.f105554a, c47579qe3.f105554a) && Intrinsics.areEqual(this.f105555b, c47579qe3.f105555b) && Intrinsics.areEqual(this.f105556c, c47579qe3.f105556c) && Intrinsics.areEqual(this.f105557d, c47579qe3.f105557d) && Intrinsics.areEqual(this.f105558e, c47579qe3.f105558e) && Intrinsics.areEqual(this.f105559f, c47579qe3.f105559f) && Intrinsics.areEqual(this.f105560g, c47579qe3.f105560g) && Intrinsics.areEqual(this.f105561h, c47579qe3.f105561h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.OfferBannerShown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f105554a), TuplesKt.m28425to("event_time", this.f105555b), TuplesKt.m28425to("client_time", this.f105556c), TuplesKt.m28425to("campaign_id", this.f105557d), TuplesKt.m28425to("offer_stage", this.f105558e), TuplesKt.m28425to("kind", this.f105559f), TuplesKt.m28425to("merchant_id", this.f105560g), TuplesKt.m28425to("merchant_site_id", this.f105561h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f105554a.hashCode() * 31) + this.f105555b.hashCode()) * 31) + this.f105556c.hashCode()) * 31;
        String str = this.f105557d;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f105558e.hashCode()) * 31;
        String str2 = this.f105559f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f105560g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f105561h;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f105554a;
        DateTime dateTime = this.f105555b;
        DateTime dateTime2 = this.f105556c;
        String str2 = this.f105557d;
        String str3 = this.f105558e;
        String str4 = this.f105559f;
        String str5 = this.f105560g;
        String str6 = this.f105561h;
        return "OfferBannerShown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", campaignId=" + str2 + ", offerStage=" + str3 + ", kind=" + str4 + ", merchantId=" + str5 + ", merchantSiteId=" + str6 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C47579qe3(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i & 8) != 0 ? null : str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6);
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
