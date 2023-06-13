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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b,\u0010-JQ\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0015¨\u0006."}, m28432d2 = {"LPj2;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sku", "", "updatedBinCount", "binCountDelta", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getSessionId", "c", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "getClientTime", "e", "getSku", "f", "I", "getUpdatedBinCount", "()I", "g", "getBinCountDelta", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;II)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35206Pj2 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f28954a;

    /* renamed from: b */
    public final String f28955b;

    /* renamed from: c */
    public final DateTime f28956c;

    /* renamed from: d */
    public final DateTime f28957d;

    /* renamed from: e */
    public final String f28958e;

    /* renamed from: f */
    public final int f28959f;

    /* renamed from: g */
    public final int f28960g;

    public C35206Pj2(String eventId, String str, DateTime eventTime, DateTime clientTime, String sku, int i, int i2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.f28954a = eventId;
        this.f28955b = str;
        this.f28956c = eventTime;
        this.f28957d = clientTime;
        this.f28958e = sku;
        this.f28959f = i;
        this.f28960g = i2;
    }

    public static /* synthetic */ C35206Pj2 copy$default(C35206Pj2 c35206Pj2, String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = c35206Pj2.f28954a;
        }
        if ((i3 & 2) != 0) {
            str2 = c35206Pj2.f28955b;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            dateTime = c35206Pj2.f28956c;
        }
        DateTime dateTime3 = dateTime;
        if ((i3 & 8) != 0) {
            dateTime2 = c35206Pj2.f28957d;
        }
        DateTime dateTime4 = dateTime2;
        if ((i3 & 16) != 0) {
            str3 = c35206Pj2.f28958e;
        }
        String str5 = str3;
        if ((i3 & 32) != 0) {
            i = c35206Pj2.f28959f;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = c35206Pj2.f28960g;
        }
        return c35206Pj2.m89890a(str, str4, dateTime3, dateTime4, str5, i4, i2);
    }

    /* renamed from: a */
    public final C35206Pj2 m89890a(String eventId, String str, DateTime eventTime, DateTime clientTime, String sku, int i, int i2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new C35206Pj2(eventId, str, eventTime, clientTime, sku, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35206Pj2) {
            C35206Pj2 c35206Pj2 = (C35206Pj2) obj;
            return Intrinsics.areEqual(this.f28954a, c35206Pj2.f28954a) && Intrinsics.areEqual(this.f28955b, c35206Pj2.f28955b) && Intrinsics.areEqual(this.f28956c, c35206Pj2.f28956c) && Intrinsics.areEqual(this.f28957d, c35206Pj2.f28957d) && Intrinsics.areEqual(this.f28958e, c35206Pj2.f28958e) && this.f28959f == c35206Pj2.f28959f && this.f28960g == c35206Pj2.f28960g;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.KanbanInventoryUpdated";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f28954a), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f28955b), TuplesKt.m28425to("event_time", this.f28956c), TuplesKt.m28425to("client_time", this.f28957d), TuplesKt.m28425to("sku", this.f28958e), TuplesKt.m28425to("updated_bin_count", Integer.valueOf(this.f28959f)), TuplesKt.m28425to("bin_count_delta", Integer.valueOf(this.f28960g)));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = this.f28954a.hashCode() * 31;
        String str = this.f28955b;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f28956c.hashCode()) * 31) + this.f28957d.hashCode()) * 31) + this.f28958e.hashCode()) * 31) + Integer.hashCode(this.f28959f)) * 31) + Integer.hashCode(this.f28960g);
    }

    public String toString() {
        String str = this.f28954a;
        String str2 = this.f28955b;
        DateTime dateTime = this.f28956c;
        DateTime dateTime2 = this.f28957d;
        String str3 = this.f28958e;
        int i = this.f28959f;
        int i2 = this.f28960g;
        return "KanbanInventoryUpdated(eventId=" + str + ", sessionId=" + str2 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sku=" + str3 + ", updatedBinCount=" + i + ", binCountDelta=" + i2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C35206Pj2(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, r6, str3, i, i2);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i3 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str;
        }
        String str5 = (i3 & 2) != 0 ? null : str2;
        if ((i3 & 4) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i3 & 8) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
