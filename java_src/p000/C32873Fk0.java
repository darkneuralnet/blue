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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010+JN\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"LFk0;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "lastForegroundedAt", "lastBackgroundedAt", "", "inBackground", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)LFk0;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getLastForegroundedAt", "e", "getLastBackgroundedAt", "f", "Ljava/lang/Boolean;", "getInBackground", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fk0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32873Fk0 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f10050a;

    /* renamed from: b */
    public final DateTime f10051b;

    /* renamed from: c */
    public final DateTime f10052c;

    /* renamed from: d */
    public final DateTime f10053d;

    /* renamed from: e */
    public final DateTime f10054e;

    /* renamed from: f */
    public final Boolean f10055f;

    public C32873Fk0(String eventId, DateTime eventTime, DateTime clientTime, DateTime lastForegroundedAt, DateTime lastBackgroundedAt, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(lastForegroundedAt, "lastForegroundedAt");
        Intrinsics.checkNotNullParameter(lastBackgroundedAt, "lastBackgroundedAt");
        this.f10050a = eventId;
        this.f10051b = eventTime;
        this.f10052c = clientTime;
        this.f10053d = lastForegroundedAt;
        this.f10054e = lastBackgroundedAt;
        this.f10055f = bool;
    }

    public static /* synthetic */ C32873Fk0 copy$default(C32873Fk0 c32873Fk0, String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c32873Fk0.f10050a;
        }
        if ((i & 2) != 0) {
            dateTime = c32873Fk0.f10051b;
        }
        DateTime dateTime5 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c32873Fk0.f10052c;
        }
        DateTime dateTime6 = dateTime2;
        if ((i & 8) != 0) {
            dateTime3 = c32873Fk0.f10053d;
        }
        DateTime dateTime7 = dateTime3;
        if ((i & 16) != 0) {
            dateTime4 = c32873Fk0.f10054e;
        }
        DateTime dateTime8 = dateTime4;
        if ((i & 32) != 0) {
            bool = c32873Fk0.f10055f;
        }
        return c32873Fk0.m106632a(str, dateTime5, dateTime6, dateTime7, dateTime8, bool);
    }

    /* renamed from: a */
    public final C32873Fk0 m106632a(String eventId, DateTime eventTime, DateTime clientTime, DateTime lastForegroundedAt, DateTime lastBackgroundedAt, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(lastForegroundedAt, "lastForegroundedAt");
        Intrinsics.checkNotNullParameter(lastBackgroundedAt, "lastBackgroundedAt");
        return new C32873Fk0(eventId, eventTime, clientTime, lastForegroundedAt, lastBackgroundedAt, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32873Fk0) {
            C32873Fk0 c32873Fk0 = (C32873Fk0) obj;
            return Intrinsics.areEqual(this.f10050a, c32873Fk0.f10050a) && Intrinsics.areEqual(this.f10051b, c32873Fk0.f10051b) && Intrinsics.areEqual(this.f10052c, c32873Fk0.f10052c) && Intrinsics.areEqual(this.f10053d, c32873Fk0.f10053d) && Intrinsics.areEqual(this.f10054e, c32873Fk0.f10054e) && Intrinsics.areEqual(this.f10055f, c32873Fk0.f10055f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ClientCrashed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f10050a), TuplesKt.m28425to("event_time", this.f10051b), TuplesKt.m28425to("client_time", this.f10052c), TuplesKt.m28425to("last_foregrounded_at", this.f10053d), TuplesKt.m28425to("last_backgrounded_at", this.f10054e), TuplesKt.m28425to("in_background", this.f10055f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f10050a.hashCode() * 31) + this.f10051b.hashCode()) * 31) + this.f10052c.hashCode()) * 31) + this.f10053d.hashCode()) * 31) + this.f10054e.hashCode()) * 31;
        Boolean bool = this.f10055f;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.f10050a;
        DateTime dateTime = this.f10051b;
        DateTime dateTime2 = this.f10052c;
        DateTime dateTime3 = this.f10053d;
        DateTime dateTime4 = this.f10054e;
        Boolean bool = this.f10055f;
        return "ClientCrashed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", lastForegroundedAt=" + dateTime3 + ", lastBackgroundedAt=" + dateTime4 + ", inBackground=" + bool + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C32873Fk0(String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, dateTime3, dateTime4, (i & 32) != 0 ? null : bool);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str2 = str;
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime5 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
