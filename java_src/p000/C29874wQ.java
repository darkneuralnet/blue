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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+JU\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"LwQ;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "codename", "subscriptionPlanId", "userSubscriptionId", "warningDisplayType", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getCodename", "e", "getSubscriptionPlanId", "f", "getUserSubscriptionId", "g", "getWarningDisplayType", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wQ */
/* loaded from: classes4.dex */
public final class C29874wQ implements AnalyticsEvent {

    /* renamed from: a */
    public final String f115929a;

    /* renamed from: b */
    public final DateTime f115930b;

    /* renamed from: c */
    public final DateTime f115931c;

    /* renamed from: d */
    public final String f115932d;

    /* renamed from: e */
    public final String f115933e;

    /* renamed from: f */
    public final String f115934f;

    /* renamed from: g */
    public final String f115935g;

    public C29874wQ(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String warningDisplayType) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(warningDisplayType, "warningDisplayType");
        this.f115929a = eventId;
        this.f115930b = eventTime;
        this.f115931c = clientTime;
        this.f115932d = str;
        this.f115933e = str2;
        this.f115934f = str3;
        this.f115935g = warningDisplayType;
    }

    public static /* synthetic */ C29874wQ copy$default(C29874wQ c29874wQ, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c29874wQ.f115929a;
        }
        if ((i & 2) != 0) {
            dateTime = c29874wQ.f115930b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c29874wQ.f115931c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c29874wQ.f115932d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = c29874wQ.f115933e;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = c29874wQ.f115934f;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = c29874wQ.f115935g;
        }
        return c29874wQ.m6861a(str, dateTime3, dateTime4, str6, str7, str8, str5);
    }

    /* renamed from: a */
    public final C29874wQ m6861a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String warningDisplayType) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(warningDisplayType, "warningDisplayType");
        return new C29874wQ(eventId, eventTime, clientTime, str, str2, str3, warningDisplayType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C29874wQ) {
            C29874wQ c29874wQ = (C29874wQ) obj;
            return Intrinsics.areEqual(this.f115929a, c29874wQ.f115929a) && Intrinsics.areEqual(this.f115930b, c29874wQ.f115930b) && Intrinsics.areEqual(this.f115931c, c29874wQ.f115931c) && Intrinsics.areEqual(this.f115932d, c29874wQ.f115932d) && Intrinsics.areEqual(this.f115933e, c29874wQ.f115933e) && Intrinsics.areEqual(this.f115934f, c29874wQ.f115934f) && Intrinsics.areEqual(this.f115935g, c29874wQ.f115935g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BirdPlusIneligibleWarningDisplayed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f115929a), TuplesKt.m28425to("event_time", this.f115930b), TuplesKt.m28425to("client_time", this.f115931c), TuplesKt.m28425to("codename", this.f115932d), TuplesKt.m28425to("subscription_plan_id", this.f115933e), TuplesKt.m28425to("user_subscription_id", this.f115934f), TuplesKt.m28425to("warning_display_type", this.f115935g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f115929a.hashCode() * 31) + this.f115930b.hashCode()) * 31) + this.f115931c.hashCode()) * 31;
        String str = this.f115932d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f115933e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f115934f;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f115935g.hashCode();
    }

    public String toString() {
        String str = this.f115929a;
        DateTime dateTime = this.f115930b;
        DateTime dateTime2 = this.f115931c;
        String str2 = this.f115932d;
        String str3 = this.f115933e;
        String str4 = this.f115934f;
        String str5 = this.f115935g;
        return "BirdPlusIneligibleWarningDisplayed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", codename=" + str2 + ", subscriptionPlanId=" + str3 + ", userSubscriptionId=" + str4 + ", warningDisplayType=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C29874wQ(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, str5);
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
