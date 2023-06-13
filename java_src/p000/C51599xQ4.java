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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b)\u0010*JI\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0014¨\u0006+"}, m28432d2 = {"LxQ4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "visible", "nearestNestId", "nestStatus", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Z", "getVisible", "()Z", "e", "getNearestNestId", "f", "getNestStatus", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xQ4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51599xQ4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f117592a;

    /* renamed from: b */
    public final DateTime f117593b;

    /* renamed from: c */
    public final DateTime f117594c;

    /* renamed from: d */
    public final boolean f117595d;

    /* renamed from: e */
    public final String f117596e;

    /* renamed from: f */
    public final String f117597f;

    public C51599xQ4(String eventId, DateTime eventTime, DateTime clientTime, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f117592a = eventId;
        this.f117593b = eventTime;
        this.f117594c = clientTime;
        this.f117595d = z;
        this.f117596e = str;
        this.f117597f = str2;
    }

    public static /* synthetic */ C51599xQ4 copy$default(C51599xQ4 c51599xQ4, String str, DateTime dateTime, DateTime dateTime2, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c51599xQ4.f117592a;
        }
        if ((i & 2) != 0) {
            dateTime = c51599xQ4.f117593b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c51599xQ4.f117594c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            z = c51599xQ4.f117595d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str2 = c51599xQ4.f117596e;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            str3 = c51599xQ4.f117597f;
        }
        return c51599xQ4.m5280a(str, dateTime3, dateTime4, z2, str4, str3);
    }

    /* renamed from: a */
    public final C51599xQ4 m5280a(String eventId, DateTime eventTime, DateTime clientTime, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C51599xQ4(eventId, eventTime, clientTime, z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C51599xQ4) {
            C51599xQ4 c51599xQ4 = (C51599xQ4) obj;
            return Intrinsics.areEqual(this.f117592a, c51599xQ4.f117592a) && Intrinsics.areEqual(this.f117593b, c51599xQ4.f117593b) && Intrinsics.areEqual(this.f117594c, c51599xQ4.f117594c) && this.f117595d == c51599xQ4.f117595d && Intrinsics.areEqual(this.f117596e, c51599xQ4.f117596e) && Intrinsics.areEqual(this.f117597f, c51599xQ4.f117597f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideEndButtonVisibilityChanged";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f117592a), TuplesKt.m28425to("event_time", this.f117593b), TuplesKt.m28425to("client_time", this.f117594c), TuplesKt.m28425to("visible", Boolean.valueOf(this.f117595d)), TuplesKt.m28425to("nearest_nest_id", this.f117596e), TuplesKt.m28425to("nest_status", this.f117597f));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f117592a.hashCode() * 31) + this.f117593b.hashCode()) * 31) + this.f117594c.hashCode()) * 31;
        boolean z = this.f117595d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.f117596e;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f117597f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f117592a;
        DateTime dateTime = this.f117593b;
        DateTime dateTime2 = this.f117594c;
        boolean z = this.f117595d;
        String str2 = this.f117596e;
        String str3 = this.f117597f;
        return "RideEndButtonVisibilityChanged(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", visible=" + z + ", nearestNestId=" + str2 + ", nestStatus=" + str3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C51599xQ4(String str, DateTime dateTime, DateTime dateTime2, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
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
