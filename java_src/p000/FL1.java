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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b9\u0010:J\u0080\u0001\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0018\u001a\u0004\b0\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b2\u0010\u001aR\"\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0014038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001a¨\u0006;"}, m28432d2 = {"LFL1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "currency", "", "incentiveAmount", "fineAmount", "", "minConfidence", "selfieSessionId", "rideId", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)LFL1;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "getCurrency", "f", "Ljava/lang/Integer;", "getIncentiveAmount", "()Ljava/lang/Integer;", "g", "getFineAmount", "h", "Ljava/lang/Double;", "getMinConfidence", "()Ljava/lang/Double;", "i", "getSelfieSessionId", "j", "getRideId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FL1 */
/* loaded from: classes4.dex */
public final class FL1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f9204a;

    /* renamed from: b */
    public final DateTime f9205b;

    /* renamed from: c */
    public final DateTime f9206c;

    /* renamed from: d */
    public final String f9207d;

    /* renamed from: e */
    public final String f9208e;

    /* renamed from: f */
    public final Integer f9209f;

    /* renamed from: g */
    public final Integer f9210g;

    /* renamed from: h */
    public final Double f9211h;

    /* renamed from: i */
    public final String f9212i;

    /* renamed from: j */
    public final String f9213j;

    public FL1(String eventId, DateTime eventTime, DateTime clientTime, String str, String currency, Integer num, Integer num2, Double d, String str2, String str3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f9204a = eventId;
        this.f9205b = eventTime;
        this.f9206c = clientTime;
        this.f9207d = str;
        this.f9208e = currency;
        this.f9209f = num;
        this.f9210g = num2;
        this.f9211h = d;
        this.f9212i = str2;
        this.f9213j = str3;
    }

    /* renamed from: a */
    public final FL1 m107303a(String eventId, DateTime eventTime, DateTime clientTime, String str, String currency, Integer num, Integer num2, Double d, String str2, String str3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new FL1(eventId, eventTime, clientTime, str, currency, num, num2, d, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FL1) {
            FL1 fl1 = (FL1) obj;
            return Intrinsics.areEqual(this.f9204a, fl1.f9204a) && Intrinsics.areEqual(this.f9205b, fl1.f9205b) && Intrinsics.areEqual(this.f9206c, fl1.f9206c) && Intrinsics.areEqual(this.f9207d, fl1.f9207d) && Intrinsics.areEqual(this.f9208e, fl1.f9208e) && Intrinsics.areEqual(this.f9209f, fl1.f9209f) && Intrinsics.areEqual(this.f9210g, fl1.f9210g) && Intrinsics.areEqual((Object) this.f9211h, (Object) fl1.f9211h) && Intrinsics.areEqual(this.f9212i, fl1.f9212i) && Intrinsics.areEqual(this.f9213j, fl1.f9213j);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.HelmetSelfieScreenShown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f9204a), TuplesKt.m28425to("event_time", this.f9205b), TuplesKt.m28425to("client_time", this.f9206c), TuplesKt.m28425to("bird_id", this.f9207d), TuplesKt.m28425to("currency", this.f9208e), TuplesKt.m28425to("incentive_amount", this.f9209f), TuplesKt.m28425to("fine_amount", this.f9210g), TuplesKt.m28425to("min_confidence", this.f9211h), TuplesKt.m28425to("selfie_session_id", this.f9212i), TuplesKt.m28425to("ride_id", this.f9213j));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f9204a.hashCode() * 31) + this.f9205b.hashCode()) * 31) + this.f9206c.hashCode()) * 31;
        String str = this.f9207d;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f9208e.hashCode()) * 31;
        Integer num = this.f9209f;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9210g;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.f9211h;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f9212i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9213j;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f9204a;
        DateTime dateTime = this.f9205b;
        DateTime dateTime2 = this.f9206c;
        String str2 = this.f9207d;
        String str3 = this.f9208e;
        Integer num = this.f9209f;
        Integer num2 = this.f9210g;
        Double d = this.f9211h;
        String str4 = this.f9212i;
        String str5 = this.f9213j;
        return "HelmetSelfieScreenShown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", currency=" + str3 + ", incentiveAmount=" + num + ", fineAmount=" + num2 + ", minConfidence=" + d + ", selfieSessionId=" + str4 + ", rideId=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FL1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, Integer num, Integer num2, Double d, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i & 8) != 0 ? null : str2, str3, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5);
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
