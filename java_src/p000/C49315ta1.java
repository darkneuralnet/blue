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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b)\u0010*JR\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001eR\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0015¨\u0006+"}, m28432d2 = {"Lta1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isNewUser", "emailAddress", "marketingOptIn", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lta1;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "getEmailAddress", "f", "getMarketingOptIn", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ta1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49315ta1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f110758a;

    /* renamed from: b */
    public final DateTime f110759b;

    /* renamed from: c */
    public final DateTime f110760c;

    /* renamed from: d */
    public final Boolean f110761d;

    /* renamed from: e */
    public final String f110762e;

    /* renamed from: f */
    public final Boolean f110763f;

    public C49315ta1() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ C49315ta1 copy$default(C49315ta1 c49315ta1, String str, DateTime dateTime, DateTime dateTime2, Boolean bool, String str2, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c49315ta1.f110758a;
        }
        if ((i & 2) != 0) {
            dateTime = c49315ta1.f110759b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c49315ta1.f110760c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            bool = c49315ta1.f110761d;
        }
        Boolean bool3 = bool;
        if ((i & 16) != 0) {
            str2 = c49315ta1.f110762e;
        }
        String str3 = str2;
        if ((i & 32) != 0) {
            bool2 = c49315ta1.f110763f;
        }
        return c49315ta1.m12037a(str, dateTime3, dateTime4, bool3, str3, bool2);
    }

    /* renamed from: a */
    public final C49315ta1 m12037a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, String str, Boolean bool2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C49315ta1(eventId, eventTime, clientTime, bool, str, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49315ta1) {
            C49315ta1 c49315ta1 = (C49315ta1) obj;
            return Intrinsics.areEqual(this.f110758a, c49315ta1.f110758a) && Intrinsics.areEqual(this.f110759b, c49315ta1.f110759b) && Intrinsics.areEqual(this.f110760c, c49315ta1.f110760c) && Intrinsics.areEqual(this.f110761d, c49315ta1.f110761d) && Intrinsics.areEqual(this.f110762e, c49315ta1.f110762e) && Intrinsics.areEqual(this.f110763f, c49315ta1.f110763f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.EmailScreenInputEntered";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f110758a), TuplesKt.m28425to("event_time", this.f110759b), TuplesKt.m28425to("client_time", this.f110760c), TuplesKt.m28425to("is_new_user", this.f110761d), TuplesKt.m28425to("email_address", this.f110762e), TuplesKt.m28425to("marketing_opt_in", this.f110763f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f110758a.hashCode() * 31) + this.f110759b.hashCode()) * 31) + this.f110760c.hashCode()) * 31;
        Boolean bool = this.f110761d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f110762e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.f110763f;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f110758a;
        DateTime dateTime = this.f110759b;
        DateTime dateTime2 = this.f110760c;
        Boolean bool = this.f110761d;
        String str2 = this.f110762e;
        Boolean bool2 = this.f110763f;
        return "EmailScreenInputEntered(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isNewUser=" + bool + ", emailAddress=" + str2 + ", marketingOptIn=" + bool2 + ")";
    }

    public C49315ta1(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, String str, Boolean bool2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f110758a = eventId;
        this.f110759b = eventTime;
        this.f110760c = clientTime;
        this.f110761d = bool;
        this.f110762e = str;
        this.f110763f = bool2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C49315ta1(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, String str2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : bool2);
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
