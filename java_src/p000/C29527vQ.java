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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J_\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"LvQ;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "codename", "subscriptionPlanId", "userSubscriptionId", "warningDisplayType", "ackType", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getCodename", "e", "getSubscriptionPlanId", "f", "getUserSubscriptionId", "g", "getWarningDisplayType", "h", "getAckType", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vQ */
/* loaded from: classes4.dex */
public final class C29527vQ implements AnalyticsEvent {

    /* renamed from: a */
    public final String f114021a;

    /* renamed from: b */
    public final DateTime f114022b;

    /* renamed from: c */
    public final DateTime f114023c;

    /* renamed from: d */
    public final String f114024d;

    /* renamed from: e */
    public final String f114025e;

    /* renamed from: f */
    public final String f114026f;

    /* renamed from: g */
    public final String f114027g;

    /* renamed from: h */
    public final String f114028h;

    public C29527vQ(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String warningDisplayType, String ackType) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(warningDisplayType, "warningDisplayType");
        Intrinsics.checkNotNullParameter(ackType, "ackType");
        this.f114021a = eventId;
        this.f114022b = eventTime;
        this.f114023c = clientTime;
        this.f114024d = str;
        this.f114025e = str2;
        this.f114026f = str3;
        this.f114027g = warningDisplayType;
        this.f114028h = ackType;
    }

    /* renamed from: a */
    public final C29527vQ m8736a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String warningDisplayType, String ackType) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(warningDisplayType, "warningDisplayType");
        Intrinsics.checkNotNullParameter(ackType, "ackType");
        return new C29527vQ(eventId, eventTime, clientTime, str, str2, str3, warningDisplayType, ackType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C29527vQ) {
            C29527vQ c29527vQ = (C29527vQ) obj;
            return Intrinsics.areEqual(this.f114021a, c29527vQ.f114021a) && Intrinsics.areEqual(this.f114022b, c29527vQ.f114022b) && Intrinsics.areEqual(this.f114023c, c29527vQ.f114023c) && Intrinsics.areEqual(this.f114024d, c29527vQ.f114024d) && Intrinsics.areEqual(this.f114025e, c29527vQ.f114025e) && Intrinsics.areEqual(this.f114026f, c29527vQ.f114026f) && Intrinsics.areEqual(this.f114027g, c29527vQ.f114027g) && Intrinsics.areEqual(this.f114028h, c29527vQ.f114028h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BirdPlusIneligibleWarningAcked";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f114021a), TuplesKt.m28425to("event_time", this.f114022b), TuplesKt.m28425to("client_time", this.f114023c), TuplesKt.m28425to("codename", this.f114024d), TuplesKt.m28425to("subscription_plan_id", this.f114025e), TuplesKt.m28425to("user_subscription_id", this.f114026f), TuplesKt.m28425to("warning_display_type", this.f114027g), TuplesKt.m28425to("ack_type", this.f114028h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f114021a.hashCode() * 31) + this.f114022b.hashCode()) * 31) + this.f114023c.hashCode()) * 31;
        String str = this.f114024d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f114025e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f114026f;
        return ((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f114027g.hashCode()) * 31) + this.f114028h.hashCode();
    }

    public String toString() {
        String str = this.f114021a;
        DateTime dateTime = this.f114022b;
        DateTime dateTime2 = this.f114023c;
        String str2 = this.f114024d;
        String str3 = this.f114025e;
        String str4 = this.f114026f;
        String str5 = this.f114027g;
        String str6 = this.f114028h;
        return "BirdPlusIneligibleWarningAcked(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", codename=" + str2 + ", subscriptionPlanId=" + str3 + ", userSubscriptionId=" + str4 + ", warningDisplayType=" + str5 + ", ackType=" + str6 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C29527vQ(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, str5, str6);
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
