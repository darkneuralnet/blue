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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b&\u0010'J;\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0013¨\u0006("}, m28432d2 = {"LSx4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "rentalKind", "", "hasExistingRental", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getRentalKind", "e", "Z", "getHasExistingRental", "()Z", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Z)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Sx4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36036Sx4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f34538a;

    /* renamed from: b */
    public final DateTime f34539b;

    /* renamed from: c */
    public final DateTime f34540c;

    /* renamed from: d */
    public final String f34541d;

    /* renamed from: e */
    public final boolean f34542e;

    public C36036Sx4(String eventId, DateTime eventTime, DateTime clientTime, String rentalKind, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(rentalKind, "rentalKind");
        this.f34538a = eventId;
        this.f34539b = eventTime;
        this.f34540c = clientTime;
        this.f34541d = rentalKind;
        this.f34542e = z;
    }

    public static /* synthetic */ C36036Sx4 copy$default(C36036Sx4 c36036Sx4, String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c36036Sx4.f34538a;
        }
        if ((i & 2) != 0) {
            dateTime = c36036Sx4.f34539b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c36036Sx4.f34540c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c36036Sx4.f34541d;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            z = c36036Sx4.f34542e;
        }
        return c36036Sx4.m84574a(str, dateTime3, dateTime4, str3, z);
    }

    /* renamed from: a */
    public final C36036Sx4 m84574a(String eventId, DateTime eventTime, DateTime clientTime, String rentalKind, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(rentalKind, "rentalKind");
        return new C36036Sx4(eventId, eventTime, clientTime, rentalKind, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36036Sx4) {
            C36036Sx4 c36036Sx4 = (C36036Sx4) obj;
            return Intrinsics.areEqual(this.f34538a, c36036Sx4.f34538a) && Intrinsics.areEqual(this.f34539b, c36036Sx4.f34539b) && Intrinsics.areEqual(this.f34540c, c36036Sx4.f34540c) && Intrinsics.areEqual(this.f34541d, c36036Sx4.f34541d) && this.f34542e == c36036Sx4.f34542e;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RentalMenuItemTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f34538a), TuplesKt.m28425to("event_time", this.f34539b), TuplesKt.m28425to("client_time", this.f34540c), TuplesKt.m28425to("rental_kind", this.f34541d), TuplesKt.m28425to("has_existing_rental", Boolean.valueOf(this.f34542e)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f34538a.hashCode() * 31) + this.f34539b.hashCode()) * 31) + this.f34540c.hashCode()) * 31) + this.f34541d.hashCode()) * 31;
        boolean z = this.f34542e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f34538a;
        DateTime dateTime = this.f34539b;
        DateTime dateTime2 = this.f34540c;
        String str2 = this.f34541d;
        boolean z = this.f34542e;
        return "RentalMenuItemTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", rentalKind=" + str2 + ", hasExistingRental=" + z + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C36036Sx4(String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, str2, z);
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
