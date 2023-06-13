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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J=\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\"\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0013¨\u0006("}, m28432d2 = {"LtP3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "paypalShown", "preloadFlow", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Z", "getPaypalShown", "()Z", "e", "getPreloadFlow", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tP3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49218tP3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f110431a;

    /* renamed from: b */
    public final DateTime f110432b;

    /* renamed from: c */
    public final DateTime f110433c;

    /* renamed from: d */
    public final boolean f110434d;

    /* renamed from: e */
    public final String f110435e;

    public C49218tP3(String eventId, DateTime eventTime, DateTime clientTime, boolean z, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f110431a = eventId;
        this.f110432b = eventTime;
        this.f110433c = clientTime;
        this.f110434d = z;
        this.f110435e = str;
    }

    public static /* synthetic */ C49218tP3 copy$default(C49218tP3 c49218tP3, String str, DateTime dateTime, DateTime dateTime2, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c49218tP3.f110431a;
        }
        if ((i & 2) != 0) {
            dateTime = c49218tP3.f110432b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c49218tP3.f110433c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            z = c49218tP3.f110434d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str2 = c49218tP3.f110435e;
        }
        return c49218tP3.m12412a(str, dateTime3, dateTime4, z2, str2);
    }

    /* renamed from: a */
    public final C49218tP3 m12412a(String eventId, DateTime eventTime, DateTime clientTime, boolean z, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C49218tP3(eventId, eventTime, clientTime, z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49218tP3) {
            C49218tP3 c49218tP3 = (C49218tP3) obj;
            return Intrinsics.areEqual(this.f110431a, c49218tP3.f110431a) && Intrinsics.areEqual(this.f110432b, c49218tP3.f110432b) && Intrinsics.areEqual(this.f110433c, c49218tP3.f110433c) && this.f110434d == c49218tP3.f110434d && Intrinsics.areEqual(this.f110435e, c49218tP3.f110435e);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PaymentQuickOnboardingScreenShown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f110431a), TuplesKt.m28425to("event_time", this.f110432b), TuplesKt.m28425to("client_time", this.f110433c), TuplesKt.m28425to("paypal_shown", Boolean.valueOf(this.f110434d)), TuplesKt.m28425to("preload_flow", this.f110435e));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f110431a.hashCode() * 31) + this.f110432b.hashCode()) * 31) + this.f110433c.hashCode()) * 31;
        boolean z = this.f110434d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.f110435e;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f110431a;
        DateTime dateTime = this.f110432b;
        DateTime dateTime2 = this.f110433c;
        boolean z = this.f110434d;
        String str2 = this.f110435e;
        return "PaymentQuickOnboardingScreenShown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", paypalShown=" + z + ", preloadFlow=" + str2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C49218tP3(String str, DateTime dateTime, DateTime dateTime2, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, z, (i & 16) != 0 ? null : str2);
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
