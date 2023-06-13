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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b,\u0010-JR\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u000b\u0010%R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0016¨\u0006."}, m28432d2 = {"LtO;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "tipPercentage", "tipAmount", "", "isInitialSelection", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LtO;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "getTipPercentage", "()Ljava/lang/Long;", "e", "getTipAmount", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tO */
/* loaded from: classes4.dex */
public final class C28695tO implements AnalyticsEvent {

    /* renamed from: a */
    public final String f110386a;

    /* renamed from: b */
    public final DateTime f110387b;

    /* renamed from: c */
    public final DateTime f110388c;

    /* renamed from: d */
    public final Long f110389d;

    /* renamed from: e */
    public final Long f110390e;

    /* renamed from: f */
    public final Boolean f110391f;

    public C28695tO() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ C28695tO copy$default(C28695tO c28695tO, String str, DateTime dateTime, DateTime dateTime2, Long l, Long l2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c28695tO.f110386a;
        }
        if ((i & 2) != 0) {
            dateTime = c28695tO.f110387b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c28695tO.f110388c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            l = c28695tO.f110389d;
        }
        Long l3 = l;
        if ((i & 16) != 0) {
            l2 = c28695tO.f110390e;
        }
        Long l4 = l2;
        if ((i & 32) != 0) {
            bool = c28695tO.f110391f;
        }
        return c28695tO.m12471a(str, dateTime3, dateTime4, l3, l4, bool);
    }

    /* renamed from: a */
    public final C28695tO m12471a(String eventId, DateTime eventTime, DateTime clientTime, Long l, Long l2, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C28695tO(eventId, eventTime, clientTime, l, l2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28695tO) {
            C28695tO c28695tO = (C28695tO) obj;
            return Intrinsics.areEqual(this.f110386a, c28695tO.f110386a) && Intrinsics.areEqual(this.f110387b, c28695tO.f110387b) && Intrinsics.areEqual(this.f110388c, c28695tO.f110388c) && Intrinsics.areEqual(this.f110389d, c28695tO.f110389d) && Intrinsics.areEqual(this.f110390e, c28695tO.f110390e) && Intrinsics.areEqual(this.f110391f, c28695tO.f110391f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BirdPayPaymentEntryTipTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f110386a), TuplesKt.m28425to("event_time", this.f110387b), TuplesKt.m28425to("client_time", this.f110388c), TuplesKt.m28425to("tip_percentage", this.f110389d), TuplesKt.m28425to("tip_amount", this.f110390e), TuplesKt.m28425to("is_initial_selection", this.f110391f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f110386a.hashCode() * 31) + this.f110387b.hashCode()) * 31) + this.f110388c.hashCode()) * 31;
        Long l = this.f110389d;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f110390e;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.f110391f;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.f110386a;
        DateTime dateTime = this.f110387b;
        DateTime dateTime2 = this.f110388c;
        Long l = this.f110389d;
        Long l2 = this.f110390e;
        Boolean bool = this.f110391f;
        return "BirdPayPaymentEntryTipTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", tipPercentage=" + l + ", tipAmount=" + l2 + ", isInitialSelection=" + bool + ")";
    }

    public C28695tO(String eventId, DateTime eventTime, DateTime clientTime, Long l, Long l2, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f110386a = eventId;
        this.f110387b = eventTime;
        this.f110388c = clientTime;
        this.f110389d = l;
        this.f110390e = l2;
        this.f110391f = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C28695tO(String str, DateTime dateTime, DateTime dateTime2, Long l, Long l2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : bool);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str2 = str;
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
