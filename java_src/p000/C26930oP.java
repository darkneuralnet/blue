package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b3\u00104Jt\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\"\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0018¨\u00065"}, m28432d2 = {"LoP;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "codename", "subscriptionPlanId", "userSubscriptionId", "", "errorCode", "errorMessage", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)LoP;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getSessionId", "e", "getCodename", "f", "getSubscriptionPlanId", "g", "getUserSubscriptionId", "h", "Ljava/lang/Integer;", "getErrorCode", "()Ljava/lang/Integer;", "i", "getErrorMessage", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oP */
/* loaded from: classes4.dex */
public final class C26930oP implements AnalyticsEvent {

    /* renamed from: a */
    public final String f101869a;

    /* renamed from: b */
    public final DateTime f101870b;

    /* renamed from: c */
    public final DateTime f101871c;

    /* renamed from: d */
    public final String f101872d;

    /* renamed from: e */
    public final String f101873e;

    /* renamed from: f */
    public final String f101874f;

    /* renamed from: g */
    public final String f101875g;

    /* renamed from: h */
    public final Integer f101876h;

    /* renamed from: i */
    public final String f101877i;

    public C26930oP(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, String str, String str2, String str3, Integer num, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f101869a = eventId;
        this.f101870b = eventTime;
        this.f101871c = clientTime;
        this.f101872d = sessionId;
        this.f101873e = str;
        this.f101874f = str2;
        this.f101875g = str3;
        this.f101876h = num;
        this.f101877i = str4;
    }

    /* renamed from: a */
    public final C26930oP m21225a(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, String str, String str2, String str3, Integer num, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new C26930oP(eventId, eventTime, clientTime, sessionId, str, str2, str3, num, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C26930oP) {
            C26930oP c26930oP = (C26930oP) obj;
            return Intrinsics.areEqual(this.f101869a, c26930oP.f101869a) && Intrinsics.areEqual(this.f101870b, c26930oP.f101870b) && Intrinsics.areEqual(this.f101871c, c26930oP.f101871c) && Intrinsics.areEqual(this.f101872d, c26930oP.f101872d) && Intrinsics.areEqual(this.f101873e, c26930oP.f101873e) && Intrinsics.areEqual(this.f101874f, c26930oP.f101874f) && Intrinsics.areEqual(this.f101875g, c26930oP.f101875g) && Intrinsics.areEqual(this.f101876h, c26930oP.f101876h) && Intrinsics.areEqual(this.f101877i, c26930oP.f101877i);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BirdPlusCancelFailed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f101869a), TuplesKt.m28425to("event_time", this.f101870b), TuplesKt.m28425to("client_time", this.f101871c), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f101872d), TuplesKt.m28425to("codename", this.f101873e), TuplesKt.m28425to("subscription_plan_id", this.f101874f), TuplesKt.m28425to("user_subscription_id", this.f101875g), TuplesKt.m28425to("error_code", this.f101876h), TuplesKt.m28425to("error_message", this.f101877i));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f101869a.hashCode() * 31) + this.f101870b.hashCode()) * 31) + this.f101871c.hashCode()) * 31) + this.f101872d.hashCode()) * 31;
        String str = this.f101873e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101874f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f101875g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f101876h;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f101877i;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f101869a;
        DateTime dateTime = this.f101870b;
        DateTime dateTime2 = this.f101871c;
        String str2 = this.f101872d;
        String str3 = this.f101873e;
        String str4 = this.f101874f;
        String str5 = this.f101875g;
        Integer num = this.f101876h;
        String str6 = this.f101877i;
        return "BirdPlusCancelFailed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str2 + ", codename=" + str3 + ", subscriptionPlanId=" + str4 + ", userSubscriptionId=" + str5 + ", errorCode=" + num + ", errorMessage=" + str6 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C26930oP(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, Integer num, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str6);
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
