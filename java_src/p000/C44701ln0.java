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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(JE\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014¨\u0006)"}, m28432d2 = {"Lln0;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "birdId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "buttonAction", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getBirdId", "c", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "getClientTime", "e", "getSessionId", "f", "getButtonAction", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ln0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44701ln0 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f96680a;

    /* renamed from: b */
    public final String f96681b;

    /* renamed from: c */
    public final DateTime f96682c;

    /* renamed from: d */
    public final DateTime f96683d;

    /* renamed from: e */
    public final String f96684e;

    /* renamed from: f */
    public final String f96685f;

    public C44701ln0(String eventId, String birdId, DateTime eventTime, DateTime clientTime, String sessionId, String buttonAction) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(buttonAction, "buttonAction");
        this.f96680a = eventId;
        this.f96681b = birdId;
        this.f96682c = eventTime;
        this.f96683d = clientTime;
        this.f96684e = sessionId;
        this.f96685f = buttonAction;
    }

    public static /* synthetic */ C44701ln0 copy$default(C44701ln0 c44701ln0, String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c44701ln0.f96680a;
        }
        if ((i & 2) != 0) {
            str2 = c44701ln0.f96681b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            dateTime = c44701ln0.f96682c;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 8) != 0) {
            dateTime2 = c44701ln0.f96683d;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 16) != 0) {
            str3 = c44701ln0.f96684e;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = c44701ln0.f96685f;
        }
        return c44701ln0.m26839a(str, str5, dateTime3, dateTime4, str6, str4);
    }

    /* renamed from: a */
    public final C44701ln0 m26839a(String eventId, String birdId, DateTime eventTime, DateTime clientTime, String sessionId, String buttonAction) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(buttonAction, "buttonAction");
        return new C44701ln0(eventId, birdId, eventTime, clientTime, sessionId, buttonAction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44701ln0) {
            C44701ln0 c44701ln0 = (C44701ln0) obj;
            return Intrinsics.areEqual(this.f96680a, c44701ln0.f96680a) && Intrinsics.areEqual(this.f96681b, c44701ln0.f96681b) && Intrinsics.areEqual(this.f96682c, c44701ln0.f96682c) && Intrinsics.areEqual(this.f96683d, c44701ln0.f96683d) && Intrinsics.areEqual(this.f96684e, c44701ln0.f96684e) && Intrinsics.areEqual(this.f96685f, c44701ln0.f96685f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.CommandCenterCtaClicked";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f96680a), TuplesKt.m28425to("bird_id", this.f96681b), TuplesKt.m28425to("event_time", this.f96682c), TuplesKt.m28425to("client_time", this.f96683d), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f96684e), TuplesKt.m28425to("button_action", this.f96685f));
        return mapOf;
    }

    public int hashCode() {
        return (((((((((this.f96680a.hashCode() * 31) + this.f96681b.hashCode()) * 31) + this.f96682c.hashCode()) * 31) + this.f96683d.hashCode()) * 31) + this.f96684e.hashCode()) * 31) + this.f96685f.hashCode();
    }

    public String toString() {
        String str = this.f96680a;
        String str2 = this.f96681b;
        DateTime dateTime = this.f96682c;
        DateTime dateTime2 = this.f96683d;
        String str3 = this.f96684e;
        String str4 = this.f96685f;
        return "CommandCenterCtaClicked(eventId=" + str + ", birdId=" + str2 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str3 + ", buttonAction=" + str4 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C44701ln0(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, str2, r3, dateTime2, str3, str4);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str5 = str;
        if ((i & 4) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i & 8) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
