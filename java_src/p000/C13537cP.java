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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(JK\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014¨\u0006)"}, m28432d2 = {"LcP;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "codename", "subscriptionPlanId", "userSubscriptionId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getCodename", "e", "getSubscriptionPlanId", "f", "getUserSubscriptionId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cP */
/* loaded from: classes4.dex */
public final class C13537cP implements AnalyticsEvent {

    /* renamed from: a */
    public final String f60527a;

    /* renamed from: b */
    public final DateTime f60528b;

    /* renamed from: c */
    public final DateTime f60529c;

    /* renamed from: d */
    public final String f60530d;

    /* renamed from: e */
    public final String f60531e;

    /* renamed from: f */
    public final String f60532f;

    public C13537cP() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ C13537cP copy$default(C13537cP c13537cP, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c13537cP.f60527a;
        }
        if ((i & 2) != 0) {
            dateTime = c13537cP.f60528b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c13537cP.f60529c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c13537cP.f60530d;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = c13537cP.f60531e;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = c13537cP.f60532f;
        }
        return c13537cP.m61439a(str, dateTime3, dateTime4, str5, str6, str4);
    }

    /* renamed from: a */
    public final C13537cP m61439a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C13537cP(eventId, eventTime, clientTime, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13537cP) {
            C13537cP c13537cP = (C13537cP) obj;
            return Intrinsics.areEqual(this.f60527a, c13537cP.f60527a) && Intrinsics.areEqual(this.f60528b, c13537cP.f60528b) && Intrinsics.areEqual(this.f60529c, c13537cP.f60529c) && Intrinsics.areEqual(this.f60530d, c13537cP.f60530d) && Intrinsics.areEqual(this.f60531e, c13537cP.f60531e) && Intrinsics.areEqual(this.f60532f, c13537cP.f60532f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BirdPlusBannerDisplayed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f60527a), TuplesKt.m28425to("event_time", this.f60528b), TuplesKt.m28425to("client_time", this.f60529c), TuplesKt.m28425to("codename", this.f60530d), TuplesKt.m28425to("subscription_plan_id", this.f60531e), TuplesKt.m28425to("user_subscription_id", this.f60532f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f60527a.hashCode() * 31) + this.f60528b.hashCode()) * 31) + this.f60529c.hashCode()) * 31;
        String str = this.f60530d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60531e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60532f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f60527a;
        DateTime dateTime = this.f60528b;
        DateTime dateTime2 = this.f60529c;
        String str2 = this.f60530d;
        String str3 = this.f60531e;
        String str4 = this.f60532f;
        return "BirdPlusBannerDisplayed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", codename=" + str2 + ", subscriptionPlanId=" + str3 + ", userSubscriptionId=" + str4 + ")";
    }

    public C13537cP(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f60527a = eventId;
        this.f60528b = eventTime;
        this.f60529c = clientTime;
        this.f60530d = str;
        this.f60531e = str2;
        this.f60532f = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C13537cP(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str5 = str;
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
