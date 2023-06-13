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
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b5\u00106Jm\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0018¨\u00067"}, m28432d2 = {"LkQ1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "birdId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "partKind", "", "partKinds", "flow", "", "success", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getBirdId", "c", "getSessionId", DateTokenConverter.CONVERTER_KEY, "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "e", "getClientTime", "f", "getPartKind", "g", "Ljava/util/List;", "getPartKinds", "()Ljava/util/List;", "h", "getFlow", "i", "Z", "getSuccess", "()Z", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kQ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43889kQ1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f94360a;

    /* renamed from: b */
    public final String f94361b;

    /* renamed from: c */
    public final String f94362c;

    /* renamed from: d */
    public final DateTime f94363d;

    /* renamed from: e */
    public final DateTime f94364e;

    /* renamed from: f */
    public final String f94365f;

    /* renamed from: g */
    public final List<String> f94366g;

    /* renamed from: h */
    public final String f94367h;

    /* renamed from: i */
    public final boolean f94368i;

    public C43889kQ1(String eventId, String birdId, String sessionId, DateTime eventTime, DateTime clientTime, String str, List<String> list, String flow, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f94360a = eventId;
        this.f94361b = birdId;
        this.f94362c = sessionId;
        this.f94363d = eventTime;
        this.f94364e = clientTime;
        this.f94365f = str;
        this.f94366g = list;
        this.f94367h = flow;
        this.f94368i = z;
    }

    /* renamed from: a */
    public final C43889kQ1 m28993a(String eventId, String birdId, String sessionId, DateTime eventTime, DateTime clientTime, String str, List<String> list, String flow, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(flow, "flow");
        return new C43889kQ1(eventId, birdId, sessionId, eventTime, clientTime, str, list, flow, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43889kQ1) {
            C43889kQ1 c43889kQ1 = (C43889kQ1) obj;
            return Intrinsics.areEqual(this.f94360a, c43889kQ1.f94360a) && Intrinsics.areEqual(this.f94361b, c43889kQ1.f94361b) && Intrinsics.areEqual(this.f94362c, c43889kQ1.f94362c) && Intrinsics.areEqual(this.f94363d, c43889kQ1.f94363d) && Intrinsics.areEqual(this.f94364e, c43889kQ1.f94364e) && Intrinsics.areEqual(this.f94365f, c43889kQ1.f94365f) && Intrinsics.areEqual(this.f94366g, c43889kQ1.f94366g) && Intrinsics.areEqual(this.f94367h, c43889kQ1.f94367h) && this.f94368i == c43889kQ1.f94368i;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.IdToolsActionCompleted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f94360a), TuplesKt.m28425to("bird_id", this.f94361b), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f94362c), TuplesKt.m28425to("event_time", this.f94363d), TuplesKt.m28425to("client_time", this.f94364e), TuplesKt.m28425to("part_kind", this.f94365f), TuplesKt.m28425to("part_kinds", this.f94366g), TuplesKt.m28425to("flow", this.f94367h), TuplesKt.m28425to("success", Boolean.valueOf(this.f94368i)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f94360a.hashCode() * 31) + this.f94361b.hashCode()) * 31) + this.f94362c.hashCode()) * 31) + this.f94363d.hashCode()) * 31) + this.f94364e.hashCode()) * 31;
        String str = this.f94365f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.f94366g;
        int hashCode3 = (((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.f94367h.hashCode()) * 31;
        boolean z = this.f94368i;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f94360a;
        String str2 = this.f94361b;
        String str3 = this.f94362c;
        DateTime dateTime = this.f94363d;
        DateTime dateTime2 = this.f94364e;
        String str4 = this.f94365f;
        List<String> list = this.f94366g;
        String str5 = this.f94367h;
        boolean z = this.f94368i;
        return "IdToolsActionCompleted(eventId=" + str + ", birdId=" + str2 + ", sessionId=" + str3 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", partKind=" + str4 + ", partKinds=" + list + ", flow=" + str5 + ", success=" + z + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C43889kQ1(String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4, List list, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, str2, str3, r6, r7, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : list, str5, z);
        String str6;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str6 = uuid;
        } else {
            str6 = str;
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
