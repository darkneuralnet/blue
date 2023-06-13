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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+JW\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"LDQ2;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "merchantId", "merchantSiteId", "merchantName", "openUrlString", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getMerchantId", "e", "getMerchantSiteId", "f", "getMerchantName", "g", "getOpenUrlString", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DQ2 */
/* loaded from: classes4.dex */
public final class DQ2 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f5648a;

    /* renamed from: b */
    public final DateTime f5649b;

    /* renamed from: c */
    public final DateTime f5650c;

    /* renamed from: d */
    public final String f5651d;

    /* renamed from: e */
    public final String f5652e;

    /* renamed from: f */
    public final String f5653f;

    /* renamed from: g */
    public final String f5654g;

    public DQ2() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ DQ2 copy$default(DQ2 dq2, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dq2.f5648a;
        }
        if ((i & 2) != 0) {
            dateTime = dq2.f5649b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = dq2.f5650c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = dq2.f5651d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = dq2.f5652e;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = dq2.f5653f;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = dq2.f5654g;
        }
        return dq2.m110497a(str, dateTime3, dateTime4, str6, str7, str8, str5);
    }

    /* renamed from: a */
    public final DQ2 m110497a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new DQ2(eventId, eventTime, clientTime, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DQ2) {
            DQ2 dq2 = (DQ2) obj;
            return Intrinsics.areEqual(this.f5648a, dq2.f5648a) && Intrinsics.areEqual(this.f5649b, dq2.f5649b) && Intrinsics.areEqual(this.f5650c, dq2.f5650c) && Intrinsics.areEqual(this.f5651d, dq2.f5651d) && Intrinsics.areEqual(this.f5652e, dq2.f5652e) && Intrinsics.areEqual(this.f5653f, dq2.f5653f) && Intrinsics.areEqual(this.f5654g, dq2.f5654g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.MerchantDetailsAccessorizedActionButtonTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f5648a), TuplesKt.m28425to("event_time", this.f5649b), TuplesKt.m28425to("client_time", this.f5650c), TuplesKt.m28425to("merchant_id", this.f5651d), TuplesKt.m28425to("merchant_site_id", this.f5652e), TuplesKt.m28425to("merchant_name", this.f5653f), TuplesKt.m28425to("open_url_string", this.f5654g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f5648a.hashCode() * 31) + this.f5649b.hashCode()) * 31) + this.f5650c.hashCode()) * 31;
        String str = this.f5651d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5652e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5653f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5654g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f5648a;
        DateTime dateTime = this.f5649b;
        DateTime dateTime2 = this.f5650c;
        String str2 = this.f5651d;
        String str3 = this.f5652e;
        String str4 = this.f5653f;
        String str5 = this.f5654g;
        return "MerchantDetailsAccessorizedActionButtonTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", merchantId=" + str2 + ", merchantSiteId=" + str3 + ", merchantName=" + str4 + ", openUrlString=" + str5 + ")";
    }

    public DQ2(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f5648a = eventId;
        this.f5649b = eventTime;
        this.f5650c = clientTime;
        this.f5651d = str;
        this.f5652e = str2;
        this.f5653f = str3;
        this.f5654g = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DQ2(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0, r1, r3, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? str5 : null);
        String str6;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            str6 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str6, "randomUUID().toString()");
        } else {
            str6 = str;
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
