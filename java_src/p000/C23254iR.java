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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b0\u00101J_\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0017¨\u00062"}, m28432d2 = {"LiR;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "codename", "subscriptionPlanId", "userSubscriptionId", "", "transfersRemaining", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getSessionId", "e", "getCodename", "f", "getSubscriptionPlanId", "g", "getUserSubscriptionId", "h", "J", "getTransfersRemaining", "()J", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iR */
/* loaded from: classes4.dex */
public final class C23254iR implements AnalyticsEvent {

    /* renamed from: a */
    public final String f87306a;

    /* renamed from: b */
    public final DateTime f87307b;

    /* renamed from: c */
    public final DateTime f87308c;

    /* renamed from: d */
    public final String f87309d;

    /* renamed from: e */
    public final String f87310e;

    /* renamed from: f */
    public final String f87311f;

    /* renamed from: g */
    public final String f87312g;

    /* renamed from: h */
    public final long f87313h;

    public C23254iR(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, String str, String str2, String str3, long j) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f87306a = eventId;
        this.f87307b = eventTime;
        this.f87308c = clientTime;
        this.f87309d = sessionId;
        this.f87310e = str;
        this.f87311f = str2;
        this.f87312g = str3;
        this.f87313h = j;
    }

    /* renamed from: a */
    public final C23254iR m33933a(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, String str, String str2, String str3, long j) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new C23254iR(eventId, eventTime, clientTime, sessionId, str, str2, str3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23254iR) {
            C23254iR c23254iR = (C23254iR) obj;
            return Intrinsics.areEqual(this.f87306a, c23254iR.f87306a) && Intrinsics.areEqual(this.f87307b, c23254iR.f87307b) && Intrinsics.areEqual(this.f87308c, c23254iR.f87308c) && Intrinsics.areEqual(this.f87309d, c23254iR.f87309d) && Intrinsics.areEqual(this.f87310e, c23254iR.f87310e) && Intrinsics.areEqual(this.f87311f, c23254iR.f87311f) && Intrinsics.areEqual(this.f87312g, c23254iR.f87312g) && this.f87313h == c23254iR.f87313h;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BirdPlusTransferStarted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f87306a), TuplesKt.m28425to("event_time", this.f87307b), TuplesKt.m28425to("client_time", this.f87308c), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f87309d), TuplesKt.m28425to("codename", this.f87310e), TuplesKt.m28425to("subscription_plan_id", this.f87311f), TuplesKt.m28425to("user_subscription_id", this.f87312g), TuplesKt.m28425to("transfers_remaining", Long.valueOf(this.f87313h)));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f87306a.hashCode() * 31) + this.f87307b.hashCode()) * 31) + this.f87308c.hashCode()) * 31) + this.f87309d.hashCode()) * 31;
        String str = this.f87310e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f87311f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f87312g;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.f87313h);
    }

    public String toString() {
        String str = this.f87306a;
        DateTime dateTime = this.f87307b;
        DateTime dateTime2 = this.f87308c;
        String str2 = this.f87309d;
        String str3 = this.f87310e;
        String str4 = this.f87311f;
        String str5 = this.f87312g;
        long j = this.f87313h;
        return "BirdPlusTransferStarted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str2 + ", codename=" + str3 + ", subscriptionPlanId=" + str4 + ", userSubscriptionId=" + str5 + ", transfersRemaining=" + j + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C23254iR(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, j);
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
