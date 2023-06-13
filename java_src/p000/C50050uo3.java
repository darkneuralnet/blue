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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J;\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013¨\u0006&"}, m28432d2 = {"Luo3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "category", "kind", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getCategory", "e", "getKind", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uo3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50050uo3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f113006a;

    /* renamed from: b */
    public final DateTime f113007b;

    /* renamed from: c */
    public final DateTime f113008c;

    /* renamed from: d */
    public final String f113009d;

    /* renamed from: e */
    public final String f113010e;

    public C50050uo3(String eventId, DateTime eventTime, DateTime clientTime, String category, String kind) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f113006a = eventId;
        this.f113007b = eventTime;
        this.f113008c = clientTime;
        this.f113009d = category;
        this.f113010e = kind;
    }

    public static /* synthetic */ C50050uo3 copy$default(C50050uo3 c50050uo3, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c50050uo3.f113006a;
        }
        if ((i & 2) != 0) {
            dateTime = c50050uo3.f113007b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c50050uo3.f113008c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c50050uo3.f113009d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = c50050uo3.f113010e;
        }
        return c50050uo3.m9717a(str, dateTime3, dateTime4, str4, str3);
    }

    /* renamed from: a */
    public final C50050uo3 m9717a(String eventId, DateTime eventTime, DateTime clientTime, String category, String kind) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new C50050uo3(eventId, eventTime, clientTime, category, kind);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50050uo3) {
            C50050uo3 c50050uo3 = (C50050uo3) obj;
            return Intrinsics.areEqual(this.f113006a, c50050uo3.f113006a) && Intrinsics.areEqual(this.f113007b, c50050uo3.f113007b) && Intrinsics.areEqual(this.f113008c, c50050uo3.f113008c) && Intrinsics.areEqual(this.f113009d, c50050uo3.f113009d) && Intrinsics.areEqual(this.f113010e, c50050uo3.f113010e);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.OperatorNotificationGroupViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f113006a), TuplesKt.m28425to("event_time", this.f113007b), TuplesKt.m28425to("client_time", this.f113008c), TuplesKt.m28425to("category", this.f113009d), TuplesKt.m28425to("kind", this.f113010e));
        return mapOf;
    }

    public int hashCode() {
        return (((((((this.f113006a.hashCode() * 31) + this.f113007b.hashCode()) * 31) + this.f113008c.hashCode()) * 31) + this.f113009d.hashCode()) * 31) + this.f113010e.hashCode();
    }

    public String toString() {
        String str = this.f113006a;
        DateTime dateTime = this.f113007b;
        DateTime dateTime2 = this.f113008c;
        String str2 = this.f113009d;
        String str3 = this.f113010e;
        return "OperatorNotificationGroupViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", category=" + str2 + ", kind=" + str3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C50050uo3(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, str2, str3);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str4 = str;
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