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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010+JN\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"Lz40;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "entryPoint", "", "demandLevel", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Integer;)Lz40;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getSessionId", "c", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "getClientTime", "e", "getEntryPoint", "f", "Ljava/lang/Integer;", "getDemandLevel", "()Ljava/lang/Integer;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Integer;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: z40  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52577z40 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f120734a;

    /* renamed from: b */
    public final String f120735b;

    /* renamed from: c */
    public final DateTime f120736c;

    /* renamed from: d */
    public final DateTime f120737d;

    /* renamed from: e */
    public final String f120738e;

    /* renamed from: f */
    public final Integer f120739f;

    public C52577z40(String eventId, String sessionId, DateTime eventTime, DateTime clientTime, String entryPoint, Integer num) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f120734a = eventId;
        this.f120735b = sessionId;
        this.f120736c = eventTime;
        this.f120737d = clientTime;
        this.f120738e = entryPoint;
        this.f120739f = num;
    }

    public static /* synthetic */ C52577z40 copy$default(C52577z40 c52577z40, String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c52577z40.f120734a;
        }
        if ((i & 2) != 0) {
            str2 = c52577z40.f120735b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            dateTime = c52577z40.f120736c;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 8) != 0) {
            dateTime2 = c52577z40.f120737d;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 16) != 0) {
            str3 = c52577z40.f120738e;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            num = c52577z40.f120739f;
        }
        return c52577z40.m1854a(str, str4, dateTime3, dateTime4, str5, num);
    }

    /* renamed from: a */
    public final C52577z40 m1854a(String eventId, String sessionId, DateTime eventTime, DateTime clientTime, String entryPoint, Integer num) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new C52577z40(eventId, sessionId, eventTime, clientTime, entryPoint, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52577z40) {
            C52577z40 c52577z40 = (C52577z40) obj;
            return Intrinsics.areEqual(this.f120734a, c52577z40.f120734a) && Intrinsics.areEqual(this.f120735b, c52577z40.f120735b) && Intrinsics.areEqual(this.f120736c, c52577z40.f120736c) && Intrinsics.areEqual(this.f120737d, c52577z40.f120737d) && Intrinsics.areEqual(this.f120738e, c52577z40.f120738e) && Intrinsics.areEqual(this.f120739f, c52577z40.f120739f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BulkScannerViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f120734a), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f120735b), TuplesKt.m28425to("event_time", this.f120736c), TuplesKt.m28425to("client_time", this.f120737d), TuplesKt.m28425to("entry_point", this.f120738e), TuplesKt.m28425to("demand_level", this.f120739f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f120734a.hashCode() * 31) + this.f120735b.hashCode()) * 31) + this.f120736c.hashCode()) * 31) + this.f120737d.hashCode()) * 31) + this.f120738e.hashCode()) * 31;
        Integer num = this.f120739f;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.f120734a;
        String str2 = this.f120735b;
        DateTime dateTime = this.f120736c;
        DateTime dateTime2 = this.f120737d;
        String str3 = this.f120738e;
        Integer num = this.f120739f;
        return "BulkScannerViewed(eventId=" + str + ", sessionId=" + str2 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", entryPoint=" + str3 + ", demandLevel=" + num + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C52577z40(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, str2, r3, dateTime2, str3, (i & 32) != 0 ? null : num);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str4 = str;
        if ((i & 4) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i & 8) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
