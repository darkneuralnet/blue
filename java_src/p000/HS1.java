package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b3\u00104Jm\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\"\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0018¨\u00065"}, m28432d2 = {"LHS1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "birdId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "partKind", "", "partKinds", "identifyingMethod", "flow", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getBirdId", "c", "getSessionId", DateTokenConverter.CONVERTER_KEY, "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "e", "getClientTime", "f", "getPartKind", "g", "Ljava/util/List;", "getPartKinds", "()Ljava/util/List;", "h", "getIdentifyingMethod", "i", "getFlow", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HS1 */
/* loaded from: classes4.dex */
public final class HS1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f13405a;

    /* renamed from: b */
    public final String f13406b;

    /* renamed from: c */
    public final String f13407c;

    /* renamed from: d */
    public final DateTime f13408d;

    /* renamed from: e */
    public final DateTime f13409e;

    /* renamed from: f */
    public final String f13410f;

    /* renamed from: g */
    public final List<String> f13411g;

    /* renamed from: h */
    public final String f13412h;

    /* renamed from: i */
    public final String f13413i;

    public HS1(String eventId, String birdId, String sessionId, DateTime eventTime, DateTime clientTime, String str, List<String> list, String identifyingMethod, String flow) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(identifyingMethod, "identifyingMethod");
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f13405a = eventId;
        this.f13406b = birdId;
        this.f13407c = sessionId;
        this.f13408d = eventTime;
        this.f13409e = clientTime;
        this.f13410f = str;
        this.f13411g = list;
        this.f13412h = identifyingMethod;
        this.f13413i = flow;
    }

    /* renamed from: a */
    public final HS1 m103850a(String eventId, String birdId, String sessionId, DateTime eventTime, DateTime clientTime, String str, List<String> list, String identifyingMethod, String flow) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(identifyingMethod, "identifyingMethod");
        Intrinsics.checkNotNullParameter(flow, "flow");
        return new HS1(eventId, birdId, sessionId, eventTime, clientTime, str, list, identifyingMethod, flow);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HS1) {
            HS1 hs1 = (HS1) obj;
            return Intrinsics.areEqual(this.f13405a, hs1.f13405a) && Intrinsics.areEqual(this.f13406b, hs1.f13406b) && Intrinsics.areEqual(this.f13407c, hs1.f13407c) && Intrinsics.areEqual(this.f13408d, hs1.f13408d) && Intrinsics.areEqual(this.f13409e, hs1.f13409e) && Intrinsics.areEqual(this.f13410f, hs1.f13410f) && Intrinsics.areEqual(this.f13411g, hs1.f13411g) && Intrinsics.areEqual(this.f13412h, hs1.f13412h) && Intrinsics.areEqual(this.f13413i, hs1.f13413i);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.IdToolsVehicleIdentified";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f13405a), TuplesKt.m28425to("bird_id", this.f13406b), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f13407c), TuplesKt.m28425to("event_time", this.f13408d), TuplesKt.m28425to("client_time", this.f13409e), TuplesKt.m28425to("part_kind", this.f13410f), TuplesKt.m28425to("part_kinds", this.f13411g), TuplesKt.m28425to("identifying_method", this.f13412h), TuplesKt.m28425to("flow", this.f13413i));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f13405a.hashCode() * 31) + this.f13406b.hashCode()) * 31) + this.f13407c.hashCode()) * 31) + this.f13408d.hashCode()) * 31) + this.f13409e.hashCode()) * 31;
        String str = this.f13410f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.f13411g;
        return ((((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.f13412h.hashCode()) * 31) + this.f13413i.hashCode();
    }

    public String toString() {
        String str = this.f13405a;
        String str2 = this.f13406b;
        String str3 = this.f13407c;
        DateTime dateTime = this.f13408d;
        DateTime dateTime2 = this.f13409e;
        String str4 = this.f13410f;
        List<String> list = this.f13411g;
        String str5 = this.f13412h;
        String str6 = this.f13413i;
        return "IdToolsVehicleIdentified(eventId=" + str + ", birdId=" + str2 + ", sessionId=" + str3 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", partKind=" + str4 + ", partKinds=" + list + ", identifyingMethod=" + str5 + ", flow=" + str6 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HS1(String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4, List list, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, str2, str3, r6, r7, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : list, str5, str6);
        String str7;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str7 = uuid;
        } else {
            str7 = str;
        }
        if ((i & 8) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 16) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
