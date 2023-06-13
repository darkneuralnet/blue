package p000;

import ch.qos.logback.core.CoreConstants;
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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b)\u0010*JR\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0015¨\u0006+"}, m28432d2 = {"LMt4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isInRegistration", "registrationBannerStep", CoreConstants.CONTEXT_SCOPE_VALUE, C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)LMt4;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "getRegistrationBannerStep", "f", "getContext", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mt4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34596Mt4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f23732a;

    /* renamed from: b */
    public final DateTime f23733b;

    /* renamed from: c */
    public final DateTime f23734c;

    /* renamed from: d */
    public final Boolean f23735d;

    /* renamed from: e */
    public final String f23736e;

    /* renamed from: f */
    public final String f23737f;

    public C34596Mt4() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ C34596Mt4 copy$default(C34596Mt4 c34596Mt4, String str, DateTime dateTime, DateTime dateTime2, Boolean bool, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c34596Mt4.f23732a;
        }
        if ((i & 2) != 0) {
            dateTime = c34596Mt4.f23733b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c34596Mt4.f23734c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            bool = c34596Mt4.f23735d;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            str2 = c34596Mt4.f23736e;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            str3 = c34596Mt4.f23737f;
        }
        return c34596Mt4.m94634a(str, dateTime3, dateTime4, bool2, str4, str3);
    }

    /* renamed from: a */
    public final C34596Mt4 m94634a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, String str, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C34596Mt4(eventId, eventTime, clientTime, bool, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34596Mt4) {
            C34596Mt4 c34596Mt4 = (C34596Mt4) obj;
            return Intrinsics.areEqual(this.f23732a, c34596Mt4.f23732a) && Intrinsics.areEqual(this.f23733b, c34596Mt4.f23733b) && Intrinsics.areEqual(this.f23734c, c34596Mt4.f23734c) && Intrinsics.areEqual(this.f23735d, c34596Mt4.f23735d) && Intrinsics.areEqual(this.f23736e, c34596Mt4.f23736e) && Intrinsics.areEqual(this.f23737f, c34596Mt4.f23737f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RegistrationBannerTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f23732a), TuplesKt.m28425to("event_time", this.f23733b), TuplesKt.m28425to("client_time", this.f23734c), TuplesKt.m28425to("is_in_registration", this.f23735d), TuplesKt.m28425to("registration_banner_step", this.f23736e), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f23737f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f23732a.hashCode() * 31) + this.f23733b.hashCode()) * 31) + this.f23734c.hashCode()) * 31;
        Boolean bool = this.f23735d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f23736e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23737f;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f23732a;
        DateTime dateTime = this.f23733b;
        DateTime dateTime2 = this.f23734c;
        Boolean bool = this.f23735d;
        String str2 = this.f23736e;
        String str3 = this.f23737f;
        return "RegistrationBannerTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isInRegistration=" + bool + ", registrationBannerStep=" + str2 + ", context=" + str3 + ")";
    }

    public C34596Mt4(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, String str, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f23732a = eventId;
        this.f23733b = eventTime;
        this.f23734c = clientTime;
        this.f23735d = bool;
        this.f23736e = str;
        this.f23737f = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C34596Mt4(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
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
