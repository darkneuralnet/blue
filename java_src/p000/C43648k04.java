package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)JR\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\"\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0015¨\u0006*"}, m28432d2 = {"Lk04;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isInRegistration", "isOptOutAvailable", Stripe3ds2AuthParams.FIELD_SOURCE, C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lk04;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "f", "getSource", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: k04  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43648k04 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f93749a;

    /* renamed from: b */
    public final DateTime f93750b;

    /* renamed from: c */
    public final DateTime f93751c;

    /* renamed from: d */
    public final Boolean f93752d;

    /* renamed from: e */
    public final Boolean f93753e;

    /* renamed from: f */
    public final String f93754f;

    public C43648k04() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ C43648k04 copy$default(C43648k04 c43648k04, String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Boolean bool2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c43648k04.f93749a;
        }
        if ((i & 2) != 0) {
            dateTime = c43648k04.f93750b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c43648k04.f93751c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            bool = c43648k04.f93752d;
        }
        Boolean bool3 = bool;
        if ((i & 16) != 0) {
            bool2 = c43648k04.f93753e;
        }
        Boolean bool4 = bool2;
        if ((i & 32) != 0) {
            str2 = c43648k04.f93754f;
        }
        return c43648k04.m29480a(str, dateTime3, dateTime4, bool3, bool4, str2);
    }

    /* renamed from: a */
    public final C43648k04 m29480a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C43648k04(eventId, eventTime, clientTime, bool, bool2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43648k04) {
            C43648k04 c43648k04 = (C43648k04) obj;
            return Intrinsics.areEqual(this.f93749a, c43648k04.f93749a) && Intrinsics.areEqual(this.f93750b, c43648k04.f93750b) && Intrinsics.areEqual(this.f93751c, c43648k04.f93751c) && Intrinsics.areEqual(this.f93752d, c43648k04.f93752d) && Intrinsics.areEqual(this.f93753e, c43648k04.f93753e) && Intrinsics.areEqual(this.f93754f, c43648k04.f93754f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PreloadScreenViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f93749a), TuplesKt.m28425to("event_time", this.f93750b), TuplesKt.m28425to("client_time", this.f93751c), TuplesKt.m28425to("is_in_registration", this.f93752d), TuplesKt.m28425to("is_opt_out_available", this.f93753e), TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, this.f93754f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f93749a.hashCode() * 31) + this.f93750b.hashCode()) * 31) + this.f93751c.hashCode()) * 31;
        Boolean bool = this.f93752d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f93753e;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f93754f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.f93749a;
        DateTime dateTime = this.f93750b;
        DateTime dateTime2 = this.f93751c;
        Boolean bool = this.f93752d;
        Boolean bool2 = this.f93753e;
        String str2 = this.f93754f;
        return "PreloadScreenViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isInRegistration=" + bool + ", isOptOutAvailable=" + bool2 + ", source=" + str2 + ")";
    }

    public C43648k04(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f93749a = eventId;
        this.f93750b = eventTime;
        this.f93751c = clientTime;
        this.f93752d = bool;
        this.f93753e = bool2;
        this.f93754f = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C43648k04(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Boolean bool2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str2);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str3 = str;
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
