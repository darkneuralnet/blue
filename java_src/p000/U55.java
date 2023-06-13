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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b0\u00101JZ\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\t\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\n\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0017¨\u00062"}, m28432d2 = {"LU55;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "description", "", "isNetworkConnectivityError", "isScanToRideEnabled", "", "concurrentRideCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Long;)LU55;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getDescription", "e", "Z", "()Z", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "g", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: U55 */
/* loaded from: classes4.dex */
public final class U55 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f36836a;

    /* renamed from: b */
    public final DateTime f36837b;

    /* renamed from: c */
    public final DateTime f36838c;

    /* renamed from: d */
    public final String f36839d;

    /* renamed from: e */
    public final boolean f36840e;

    /* renamed from: f */
    public final Boolean f36841f;

    /* renamed from: g */
    public final Long f36842g;

    public U55(String eventId, DateTime eventTime, DateTime clientTime, String description, boolean z, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f36836a = eventId;
        this.f36837b = eventTime;
        this.f36838c = clientTime;
        this.f36839d = description;
        this.f36840e = z;
        this.f36841f = bool;
        this.f36842g = l;
    }

    public static /* synthetic */ U55 copy$default(U55 u55, String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, Boolean bool, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = u55.f36836a;
        }
        if ((i & 2) != 0) {
            dateTime = u55.f36837b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = u55.f36838c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = u55.f36839d;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            z = u55.f36840e;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            bool = u55.f36841f;
        }
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            l = u55.f36842g;
        }
        return u55.m81991a(str, dateTime3, dateTime4, str3, z2, bool2, l);
    }

    /* renamed from: a */
    public final U55 m81991a(String eventId, DateTime eventTime, DateTime clientTime, String description, boolean z, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(description, "description");
        return new U55(eventId, eventTime, clientTime, description, z, bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof U55) {
            U55 u55 = (U55) obj;
            return Intrinsics.areEqual(this.f36836a, u55.f36836a) && Intrinsics.areEqual(this.f36837b, u55.f36837b) && Intrinsics.areEqual(this.f36838c, u55.f36838c) && Intrinsics.areEqual(this.f36839d, u55.f36839d) && this.f36840e == u55.f36840e && Intrinsics.areEqual(this.f36841f, u55.f36841f) && Intrinsics.areEqual(this.f36842g, u55.f36842g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideScanError";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f36836a), TuplesKt.m28425to("event_time", this.f36837b), TuplesKt.m28425to("client_time", this.f36838c), TuplesKt.m28425to("description", this.f36839d), TuplesKt.m28425to("is_network_connectivity_error", Boolean.valueOf(this.f36840e)), TuplesKt.m28425to("is_scan_to_ride_enabled", this.f36841f), TuplesKt.m28425to("concurrent_ride_count", this.f36842g));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f36836a.hashCode() * 31) + this.f36837b.hashCode()) * 31) + this.f36838c.hashCode()) * 31) + this.f36839d.hashCode()) * 31;
        boolean z = this.f36840e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Boolean bool = this.f36841f;
        int hashCode2 = (i2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.f36842g;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f36836a;
        DateTime dateTime = this.f36837b;
        DateTime dateTime2 = this.f36838c;
        String str2 = this.f36839d;
        boolean z = this.f36840e;
        Boolean bool = this.f36841f;
        Long l = this.f36842g;
        return "RideScanError(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", description=" + str2 + ", isNetworkConnectivityError=" + z + ", isScanToRideEnabled=" + bool + ", concurrentRideCount=" + l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ U55(String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, z, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l);
        String str3;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str3 = uuid;
        } else {
            str3 = str;
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
