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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J]\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"LwC4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "issueId", "url", "linkType", "linkBehavior", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "getIssueId", "f", "getUrl", "g", "getLinkType", "h", "getLinkBehavior", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wC4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50880wC4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f115487a;

    /* renamed from: b */
    public final DateTime f115488b;

    /* renamed from: c */
    public final DateTime f115489c;

    /* renamed from: d */
    public final String f115490d;

    /* renamed from: e */
    public final String f115491e;

    /* renamed from: f */
    public final String f115492f;

    /* renamed from: g */
    public final String f115493g;

    /* renamed from: h */
    public final String f115494h;

    public C50880wC4(String eventId, DateTime eventTime, DateTime clientTime, String birdId, String str, String str2, String linkType, String linkBehavior) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Intrinsics.checkNotNullParameter(linkBehavior, "linkBehavior");
        this.f115487a = eventId;
        this.f115488b = eventTime;
        this.f115489c = clientTime;
        this.f115490d = birdId;
        this.f115491e = str;
        this.f115492f = str2;
        this.f115493g = linkType;
        this.f115494h = linkBehavior;
    }

    /* renamed from: a */
    public final C50880wC4 m7263a(String eventId, DateTime eventTime, DateTime clientTime, String birdId, String str, String str2, String linkType, String linkBehavior) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Intrinsics.checkNotNullParameter(linkBehavior, "linkBehavior");
        return new C50880wC4(eventId, eventTime, clientTime, birdId, str, str2, linkType, linkBehavior);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50880wC4) {
            C50880wC4 c50880wC4 = (C50880wC4) obj;
            return Intrinsics.areEqual(this.f115487a, c50880wC4.f115487a) && Intrinsics.areEqual(this.f115488b, c50880wC4.f115488b) && Intrinsics.areEqual(this.f115489c, c50880wC4.f115489c) && Intrinsics.areEqual(this.f115490d, c50880wC4.f115490d) && Intrinsics.areEqual(this.f115491e, c50880wC4.f115491e) && Intrinsics.areEqual(this.f115492f, c50880wC4.f115492f) && Intrinsics.areEqual(this.f115493g, c50880wC4.f115493g) && Intrinsics.areEqual(this.f115494h, c50880wC4.f115494h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RepairQuickLinkSelected";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f115487a), TuplesKt.m28425to("event_time", this.f115488b), TuplesKt.m28425to("client_time", this.f115489c), TuplesKt.m28425to("bird_id", this.f115490d), TuplesKt.m28425to("issue_id", this.f115491e), TuplesKt.m28425to("url", this.f115492f), TuplesKt.m28425to("link_type", this.f115493g), TuplesKt.m28425to("link_behavior", this.f115494h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f115487a.hashCode() * 31) + this.f115488b.hashCode()) * 31) + this.f115489c.hashCode()) * 31) + this.f115490d.hashCode()) * 31;
        String str = this.f115491e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f115492f;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f115493g.hashCode()) * 31) + this.f115494h.hashCode();
    }

    public String toString() {
        String str = this.f115487a;
        DateTime dateTime = this.f115488b;
        DateTime dateTime2 = this.f115489c;
        String str2 = this.f115490d;
        String str3 = this.f115491e;
        String str4 = this.f115492f;
        String str5 = this.f115493g;
        String str6 = this.f115494h;
        return "RepairQuickLinkSelected(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", issueId=" + str3 + ", url=" + str4 + ", linkType=" + str5 + ", linkBehavior=" + str6 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C50880wC4(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, str5, str6);
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
