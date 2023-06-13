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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J=\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013¨\u0006&"}, m28432d2 = {"LUP1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "helpArticle", "screen", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getHelpArticle", "e", "getScreen", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UP1 */
/* loaded from: classes4.dex */
public final class UP1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f37333a;

    /* renamed from: b */
    public final DateTime f37334b;

    /* renamed from: c */
    public final DateTime f37335c;

    /* renamed from: d */
    public final String f37336d;

    /* renamed from: e */
    public final String f37337e;

    public UP1(String eventId, DateTime eventTime, DateTime clientTime, String str, String screen) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f37333a = eventId;
        this.f37334b = eventTime;
        this.f37335c = clientTime;
        this.f37336d = str;
        this.f37337e = screen;
    }

    public static /* synthetic */ UP1 copy$default(UP1 up1, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = up1.f37333a;
        }
        if ((i & 2) != 0) {
            dateTime = up1.f37334b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = up1.f37335c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = up1.f37336d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = up1.f37337e;
        }
        return up1.m81563a(str, dateTime3, dateTime4, str4, str3);
    }

    /* renamed from: a */
    public final UP1 m81563a(String eventId, DateTime eventTime, DateTime clientTime, String str, String screen) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new UP1(eventId, eventTime, clientTime, str, screen);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UP1) {
            UP1 up1 = (UP1) obj;
            return Intrinsics.areEqual(this.f37333a, up1.f37333a) && Intrinsics.areEqual(this.f37334b, up1.f37334b) && Intrinsics.areEqual(this.f37335c, up1.f37335c) && Intrinsics.areEqual(this.f37336d, up1.f37336d) && Intrinsics.areEqual(this.f37337e, up1.f37337e);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.IdHelpRequested";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f37333a), TuplesKt.m28425to("event_time", this.f37334b), TuplesKt.m28425to("client_time", this.f37335c), TuplesKt.m28425to("help_article", this.f37336d), TuplesKt.m28425to("screen", this.f37337e));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f37333a.hashCode() * 31) + this.f37334b.hashCode()) * 31) + this.f37335c.hashCode()) * 31;
        String str = this.f37336d;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f37337e.hashCode();
    }

    public String toString() {
        String str = this.f37333a;
        DateTime dateTime = this.f37334b;
        DateTime dateTime2 = this.f37335c;
        String str2 = this.f37336d;
        String str3 = this.f37337e;
        return "IdHelpRequested(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", helpArticle=" + str2 + ", screen=" + str3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UP1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, (i & 8) != 0 ? null : str2, str3);
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