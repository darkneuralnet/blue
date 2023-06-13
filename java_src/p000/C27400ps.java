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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J1\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012¨\u0006%"}, m28432d2 = {"Lps;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "paypalShown", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Z", "getPaypalShown", "()Z", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ps */
/* loaded from: classes4.dex */
public final class C27400ps implements AnalyticsEvent {

    /* renamed from: a */
    public final String f104193a;

    /* renamed from: b */
    public final DateTime f104194b;

    /* renamed from: c */
    public final DateTime f104195c;

    /* renamed from: d */
    public final boolean f104196d;

    public C27400ps(String eventId, DateTime eventTime, DateTime clientTime, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f104193a = eventId;
        this.f104194b = eventTime;
        this.f104195c = clientTime;
        this.f104196d = z;
    }

    public static /* synthetic */ C27400ps copy$default(C27400ps c27400ps, String str, DateTime dateTime, DateTime dateTime2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c27400ps.f104193a;
        }
        if ((i & 2) != 0) {
            dateTime = c27400ps.f104194b;
        }
        if ((i & 4) != 0) {
            dateTime2 = c27400ps.f104195c;
        }
        if ((i & 8) != 0) {
            z = c27400ps.f104196d;
        }
        return c27400ps.m18631a(str, dateTime, dateTime2, z);
    }

    /* renamed from: a */
    public final C27400ps m18631a(String eventId, DateTime eventTime, DateTime clientTime, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C27400ps(eventId, eventTime, clientTime, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27400ps) {
            C27400ps c27400ps = (C27400ps) obj;
            return Intrinsics.areEqual(this.f104193a, c27400ps.f104193a) && Intrinsics.areEqual(this.f104194b, c27400ps.f104194b) && Intrinsics.areEqual(this.f104195c, c27400ps.f104195c) && this.f104196d == c27400ps.f104196d;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.AutoPayV2Shown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f104193a), TuplesKt.m28425to("event_time", this.f104194b), TuplesKt.m28425to("client_time", this.f104195c), TuplesKt.m28425to("paypal_shown", Boolean.valueOf(this.f104196d)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f104193a.hashCode() * 31) + this.f104194b.hashCode()) * 31) + this.f104195c.hashCode()) * 31;
        boolean z = this.f104196d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f104193a;
        DateTime dateTime = this.f104194b;
        DateTime dateTime2 = this.f104195c;
        boolean z = this.f104196d;
        return "AutoPayV2Shown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", paypalShown=" + z + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C27400ps(String str, DateTime dateTime, DateTime dateTime2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dateTime, dateTime2, z);
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