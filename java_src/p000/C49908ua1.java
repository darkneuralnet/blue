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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J:\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\b\u0010\u001cR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013¨\u0006%"}, m28432d2 = {"Lua1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isNewUser", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)Lua1;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ua1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49908ua1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f112629a;

    /* renamed from: b */
    public final DateTime f112630b;

    /* renamed from: c */
    public final DateTime f112631c;

    /* renamed from: d */
    public final Boolean f112632d;

    public C49908ua1() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ C49908ua1 copy$default(C49908ua1 c49908ua1, String str, DateTime dateTime, DateTime dateTime2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c49908ua1.f112629a;
        }
        if ((i & 2) != 0) {
            dateTime = c49908ua1.f112630b;
        }
        if ((i & 4) != 0) {
            dateTime2 = c49908ua1.f112631c;
        }
        if ((i & 8) != 0) {
            bool = c49908ua1.f112632d;
        }
        return c49908ua1.m10052a(str, dateTime, dateTime2, bool);
    }

    /* renamed from: a */
    public final C49908ua1 m10052a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C49908ua1(eventId, eventTime, clientTime, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49908ua1) {
            C49908ua1 c49908ua1 = (C49908ua1) obj;
            return Intrinsics.areEqual(this.f112629a, c49908ua1.f112629a) && Intrinsics.areEqual(this.f112630b, c49908ua1.f112630b) && Intrinsics.areEqual(this.f112631c, c49908ua1.f112631c) && Intrinsics.areEqual(this.f112632d, c49908ua1.f112632d);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.EmailScreenViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f112629a), TuplesKt.m28425to("event_time", this.f112630b), TuplesKt.m28425to("client_time", this.f112631c), TuplesKt.m28425to("is_new_user", this.f112632d));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f112629a.hashCode() * 31) + this.f112630b.hashCode()) * 31) + this.f112631c.hashCode()) * 31;
        Boolean bool = this.f112632d;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.f112629a;
        DateTime dateTime = this.f112630b;
        DateTime dateTime2 = this.f112631c;
        Boolean bool = this.f112632d;
        return "EmailScreenViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isNewUser=" + bool + ")";
    }

    public C49908ua1(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f112629a = eventId;
        this.f112630b = eventTime;
        this.f112631c = clientTime;
        this.f112632d = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C49908ua1(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dateTime, dateTime2, (i & 8) != 0 ? null : bool);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        if ((i & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
