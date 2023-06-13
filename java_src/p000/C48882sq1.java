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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+JW\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"Lsq1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "fleetId", "predictionId", "fleetStatusActionKind", "substateKind", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getFleetId", "e", "getPredictionId", "f", "getFleetStatusActionKind", "g", "getSubstateKind", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48882sq1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f109394a;

    /* renamed from: b */
    public final DateTime f109395b;

    /* renamed from: c */
    public final DateTime f109396c;

    /* renamed from: d */
    public final String f109397d;

    /* renamed from: e */
    public final String f109398e;

    /* renamed from: f */
    public final String f109399f;

    /* renamed from: g */
    public final String f109400g;

    public C48882sq1() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ C48882sq1 copy$default(C48882sq1 c48882sq1, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c48882sq1.f109394a;
        }
        if ((i & 2) != 0) {
            dateTime = c48882sq1.f109395b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c48882sq1.f109396c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c48882sq1.f109397d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = c48882sq1.f109398e;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = c48882sq1.f109399f;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = c48882sq1.f109400g;
        }
        return c48882sq1.m13593a(str, dateTime3, dateTime4, str6, str7, str8, str5);
    }

    /* renamed from: a */
    public final C48882sq1 m13593a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C48882sq1(eventId, eventTime, clientTime, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C48882sq1) {
            C48882sq1 c48882sq1 = (C48882sq1) obj;
            return Intrinsics.areEqual(this.f109394a, c48882sq1.f109394a) && Intrinsics.areEqual(this.f109395b, c48882sq1.f109395b) && Intrinsics.areEqual(this.f109396c, c48882sq1.f109396c) && Intrinsics.areEqual(this.f109397d, c48882sq1.f109397d) && Intrinsics.areEqual(this.f109398e, c48882sq1.f109398e) && Intrinsics.areEqual(this.f109399f, c48882sq1.f109399f) && Intrinsics.areEqual(this.f109400g, c48882sq1.f109400g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.FleetStatusActionSelected";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f109394a), TuplesKt.m28425to("event_time", this.f109395b), TuplesKt.m28425to("client_time", this.f109396c), TuplesKt.m28425to("fleet_id", this.f109397d), TuplesKt.m28425to("prediction_id", this.f109398e), TuplesKt.m28425to("fleetStatusActionKind", this.f109399f), TuplesKt.m28425to("substateKind", this.f109400g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f109394a.hashCode() * 31) + this.f109395b.hashCode()) * 31) + this.f109396c.hashCode()) * 31;
        String str = this.f109397d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f109398e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f109399f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f109400g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f109394a;
        DateTime dateTime = this.f109395b;
        DateTime dateTime2 = this.f109396c;
        String str2 = this.f109397d;
        String str3 = this.f109398e;
        String str4 = this.f109399f;
        String str5 = this.f109400g;
        return "FleetStatusActionSelected(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", fleetId=" + str2 + ", predictionId=" + str3 + ", fleetStatusActionKind=" + str4 + ", substateKind=" + str5 + ")";
    }

    public C48882sq1(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f109394a = eventId;
        this.f109395b = eventTime;
        this.f109396c = clientTime;
        this.f109397d = str;
        this.f109398e = str2;
        this.f109399f = str3;
        this.f109400g = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C48882sq1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0, r1, r3, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? str5 : null);
        String str6;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            str6 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str6, "randomUUID().toString()");
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            dateTime3 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime3, "now()");
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 4) != 0) {
            dateTime4 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime4, "now()");
        } else {
            dateTime4 = dateTime2;
        }
    }
}
