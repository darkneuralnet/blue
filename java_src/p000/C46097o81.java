package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b,\u0010-JX\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\b\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0016¨\u0006."}, m28432d2 = {"Lo81;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isInRegistration", "", "agreementContentIds", "agreementRole", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)Lo81;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "Ljava/util/List;", "getAgreementContentIds", "()Ljava/util/List;", "f", "getAgreementRole", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: o81  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46097o81 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f101426a;

    /* renamed from: b */
    public final DateTime f101427b;

    /* renamed from: c */
    public final DateTime f101428c;

    /* renamed from: d */
    public final Boolean f101429d;

    /* renamed from: e */
    public final List<String> f101430e;

    /* renamed from: f */
    public final String f101431f;

    public C46097o81() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ C46097o81 copy$default(C46097o81 c46097o81, String str, DateTime dateTime, DateTime dateTime2, Boolean bool, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c46097o81.f101426a;
        }
        if ((i & 2) != 0) {
            dateTime = c46097o81.f101427b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c46097o81.f101428c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            bool = c46097o81.f101429d;
        }
        Boolean bool2 = bool;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = c46097o81.f101430e;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str2 = c46097o81.f101431f;
        }
        return c46097o81.m21726a(str, dateTime3, dateTime4, bool2, list3, str2);
    }

    /* renamed from: a */
    public final C46097o81 m21726a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, List<String> list, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C46097o81(eventId, eventTime, clientTime, bool, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46097o81) {
            C46097o81 c46097o81 = (C46097o81) obj;
            return Intrinsics.areEqual(this.f101426a, c46097o81.f101426a) && Intrinsics.areEqual(this.f101427b, c46097o81.f101427b) && Intrinsics.areEqual(this.f101428c, c46097o81.f101428c) && Intrinsics.areEqual(this.f101429d, c46097o81.f101429d) && Intrinsics.areEqual(this.f101430e, c46097o81.f101430e) && Intrinsics.areEqual(this.f101431f, c46097o81.f101431f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.DynamicAgreementScreenViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f101426a), TuplesKt.m28425to("event_time", this.f101427b), TuplesKt.m28425to("client_time", this.f101428c), TuplesKt.m28425to("is_in_registration", this.f101429d), TuplesKt.m28425to("agreement_content_ids", this.f101430e), TuplesKt.m28425to("agreement_role", this.f101431f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f101426a.hashCode() * 31) + this.f101427b.hashCode()) * 31) + this.f101428c.hashCode()) * 31;
        Boolean bool = this.f101429d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.f101430e;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f101431f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.f101426a;
        DateTime dateTime = this.f101427b;
        DateTime dateTime2 = this.f101428c;
        Boolean bool = this.f101429d;
        List<String> list = this.f101430e;
        String str2 = this.f101431f;
        return "DynamicAgreementScreenViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isInRegistration=" + bool + ", agreementContentIds=" + list + ", agreementRole=" + str2 + ")";
    }

    public C46097o81(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, List<String> list, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f101426a = eventId;
        this.f101427b = eventTime;
        this.f101428c = clientTime;
        this.f101429d = bool;
        this.f101430e = list;
        this.f101431f = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C46097o81(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str2);
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
