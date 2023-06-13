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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J1\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0012¨\u0006#"}, m28432d2 = {"Lj04;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "paymentMethod", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getPaymentMethod", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: j04  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43055j04 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f91999a;

    /* renamed from: b */
    public final DateTime f92000b;

    /* renamed from: c */
    public final DateTime f92001c;

    /* renamed from: d */
    public final String f92002d;

    public C43055j04(String eventId, DateTime eventTime, DateTime clientTime, String paymentMethod) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f91999a = eventId;
        this.f92000b = eventTime;
        this.f92001c = clientTime;
        this.f92002d = paymentMethod;
    }

    public static /* synthetic */ C43055j04 copy$default(C43055j04 c43055j04, String str, DateTime dateTime, DateTime dateTime2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c43055j04.f91999a;
        }
        if ((i & 2) != 0) {
            dateTime = c43055j04.f92000b;
        }
        if ((i & 4) != 0) {
            dateTime2 = c43055j04.f92001c;
        }
        if ((i & 8) != 0) {
            str2 = c43055j04.f92002d;
        }
        return c43055j04.m31271a(str, dateTime, dateTime2, str2);
    }

    /* renamed from: a */
    public final C43055j04 m31271a(String eventId, DateTime eventTime, DateTime clientTime, String paymentMethod) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        return new C43055j04(eventId, eventTime, clientTime, paymentMethod);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43055j04) {
            C43055j04 c43055j04 = (C43055j04) obj;
            return Intrinsics.areEqual(this.f91999a, c43055j04.f91999a) && Intrinsics.areEqual(this.f92000b, c43055j04.f92000b) && Intrinsics.areEqual(this.f92001c, c43055j04.f92001c) && Intrinsics.areEqual(this.f92002d, c43055j04.f92002d);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PreloadPaymentMethodTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f91999a), TuplesKt.m28425to("event_time", this.f92000b), TuplesKt.m28425to("client_time", this.f92001c), TuplesKt.m28425to("payment_method", this.f92002d));
        return mapOf;
    }

    public int hashCode() {
        return (((((this.f91999a.hashCode() * 31) + this.f92000b.hashCode()) * 31) + this.f92001c.hashCode()) * 31) + this.f92002d.hashCode();
    }

    public String toString() {
        String str = this.f91999a;
        DateTime dateTime = this.f92000b;
        DateTime dateTime2 = this.f92001c;
        String str2 = this.f92002d;
        return "PreloadPaymentMethodTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", paymentMethod=" + str2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C43055j04(String str, DateTime dateTime, DateTime dateTime2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dateTime, dateTime2, str2);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        if ((i & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}