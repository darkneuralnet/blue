package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b@\u0010AJ\u0094\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\f\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u001cR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\"\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00170:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001c¨\u0006B"}, m28432d2 = {"LNO;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", Stripe3ds2AuthParams.FIELD_SOURCE, "", "amount", "currency", "", "isBirdPayWinner", "merchantId", "merchantSiteId", "placardId", "tipPercentage", "tipAmount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)LNO;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getSource", "e", "J", "getAmount", "()J", "f", "getCurrency", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "h", "getMerchantId", "i", "getMerchantSiteId", "j", "getPlacardId", "k", "Ljava/lang/Long;", "getTipPercentage", "()Ljava/lang/Long;", "l", "getTipAmount", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: NO */
/* loaded from: classes4.dex */
public final class C5564NO implements AnalyticsEvent {

    /* renamed from: a */
    public final String f24500a;

    /* renamed from: b */
    public final DateTime f24501b;

    /* renamed from: c */
    public final DateTime f24502c;

    /* renamed from: d */
    public final String f24503d;

    /* renamed from: e */
    public final long f24504e;

    /* renamed from: f */
    public final String f24505f;

    /* renamed from: g */
    public final Boolean f24506g;

    /* renamed from: h */
    public final String f24507h;

    /* renamed from: i */
    public final String f24508i;

    /* renamed from: j */
    public final String f24509j;

    /* renamed from: k */
    public final Long f24510k;

    /* renamed from: l */
    public final Long f24511l;

    public C5564NO(String eventId, DateTime eventTime, DateTime clientTime, String source, long j, String currency, Boolean bool, String str, String str2, String str3, Long l, Long l2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f24500a = eventId;
        this.f24501b = eventTime;
        this.f24502c = clientTime;
        this.f24503d = source;
        this.f24504e = j;
        this.f24505f = currency;
        this.f24506g = bool;
        this.f24507h = str;
        this.f24508i = str2;
        this.f24509j = str3;
        this.f24510k = l;
        this.f24511l = l2;
    }

    /* renamed from: a */
    public final C5564NO m93983a(String eventId, DateTime eventTime, DateTime clientTime, String source, long j, String currency, Boolean bool, String str, String str2, String str3, Long l, Long l2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new C5564NO(eventId, eventTime, clientTime, source, j, currency, bool, str, str2, str3, l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5564NO) {
            C5564NO c5564no = (C5564NO) obj;
            return Intrinsics.areEqual(this.f24500a, c5564no.f24500a) && Intrinsics.areEqual(this.f24501b, c5564no.f24501b) && Intrinsics.areEqual(this.f24502c, c5564no.f24502c) && Intrinsics.areEqual(this.f24503d, c5564no.f24503d) && this.f24504e == c5564no.f24504e && Intrinsics.areEqual(this.f24505f, c5564no.f24505f) && Intrinsics.areEqual(this.f24506g, c5564no.f24506g) && Intrinsics.areEqual(this.f24507h, c5564no.f24507h) && Intrinsics.areEqual(this.f24508i, c5564no.f24508i) && Intrinsics.areEqual(this.f24509j, c5564no.f24509j) && Intrinsics.areEqual(this.f24510k, c5564no.f24510k) && Intrinsics.areEqual(this.f24511l, c5564no.f24511l);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BirdPayReceiptShown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f24500a), TuplesKt.m28425to("event_time", this.f24501b), TuplesKt.m28425to("client_time", this.f24502c), TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, this.f24503d), TuplesKt.m28425to("amount", Long.valueOf(this.f24504e)), TuplesKt.m28425to("currency", this.f24505f), TuplesKt.m28425to("is_bird_pay_winner", this.f24506g), TuplesKt.m28425to("merchant_id", this.f24507h), TuplesKt.m28425to("merchant_site_id", this.f24508i), TuplesKt.m28425to("placard_id", this.f24509j), TuplesKt.m28425to("tip_percentage", this.f24510k), TuplesKt.m28425to("tip_amount", this.f24511l));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f24500a.hashCode() * 31) + this.f24501b.hashCode()) * 31) + this.f24502c.hashCode()) * 31) + this.f24503d.hashCode()) * 31) + Long.hashCode(this.f24504e)) * 31) + this.f24505f.hashCode()) * 31;
        Boolean bool = this.f24506g;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f24507h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24508i;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24509j;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f24510k;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f24511l;
        return hashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f24500a;
        DateTime dateTime = this.f24501b;
        DateTime dateTime2 = this.f24502c;
        String str2 = this.f24503d;
        long j = this.f24504e;
        String str3 = this.f24505f;
        Boolean bool = this.f24506g;
        String str4 = this.f24507h;
        String str5 = this.f24508i;
        String str6 = this.f24509j;
        Long l = this.f24510k;
        Long l2 = this.f24511l;
        return "BirdPayReceiptShown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", source=" + str2 + ", amount=" + j + ", currency=" + str3 + ", isBirdPayWinner=" + bool + ", merchantId=" + str4 + ", merchantSiteId=" + str5 + ", placardId=" + str6 + ", tipPercentage=" + l + ", tipAmount=" + l2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C5564NO(String str, DateTime dateTime, DateTime dateTime2, String str2, long j, String str3, Boolean bool, String str4, String str5, String str6, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, j, str3, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : l, (i & 2048) != 0 ? null : l2);
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
