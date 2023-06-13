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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b,\u0010-JS\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0015¨\u0006."}, m28432d2 = {"LoO;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "presentedReason", "merchantId", "merchantSiteId", "", "hasLearnMore", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getPresentedReason", "e", "getMerchantId", "f", "getMerchantSiteId", "g", "Z", "getHasLearnMore", "()Z", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oO */
/* loaded from: classes4.dex */
public final class C26929oO implements AnalyticsEvent {

    /* renamed from: a */
    public final String f101857a;

    /* renamed from: b */
    public final DateTime f101858b;

    /* renamed from: c */
    public final DateTime f101859c;

    /* renamed from: d */
    public final String f101860d;

    /* renamed from: e */
    public final String f101861e;

    /* renamed from: f */
    public final String f101862f;

    /* renamed from: g */
    public final boolean f101863g;

    public C26929oO(String eventId, DateTime eventTime, DateTime clientTime, String str, String merchantId, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        this.f101857a = eventId;
        this.f101858b = eventTime;
        this.f101859c = clientTime;
        this.f101860d = str;
        this.f101861e = merchantId;
        this.f101862f = str2;
        this.f101863g = z;
    }

    public static /* synthetic */ C26929oO copy$default(C26929oO c26929oO, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c26929oO.f101857a;
        }
        if ((i & 2) != 0) {
            dateTime = c26929oO.f101858b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c26929oO.f101859c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c26929oO.f101860d;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = c26929oO.f101861e;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = c26929oO.f101862f;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            z = c26929oO.f101863g;
        }
        return c26929oO.m21245a(str, dateTime3, dateTime4, str5, str6, str7, z);
    }

    /* renamed from: a */
    public final C26929oO m21245a(String eventId, DateTime eventTime, DateTime clientTime, String str, String merchantId, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        return new C26929oO(eventId, eventTime, clientTime, str, merchantId, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C26929oO) {
            C26929oO c26929oO = (C26929oO) obj;
            return Intrinsics.areEqual(this.f101857a, c26929oO.f101857a) && Intrinsics.areEqual(this.f101858b, c26929oO.f101858b) && Intrinsics.areEqual(this.f101859c, c26929oO.f101859c) && Intrinsics.areEqual(this.f101860d, c26929oO.f101860d) && Intrinsics.areEqual(this.f101861e, c26929oO.f101861e) && Intrinsics.areEqual(this.f101862f, c26929oO.f101862f) && this.f101863g == c26929oO.f101863g;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BirdPayMerchantScreenShown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f101857a), TuplesKt.m28425to("event_time", this.f101858b), TuplesKt.m28425to("client_time", this.f101859c), TuplesKt.m28425to("presented_reason", this.f101860d), TuplesKt.m28425to("merchant_id", this.f101861e), TuplesKt.m28425to("merchant_site_id", this.f101862f), TuplesKt.m28425to("has_learn_more", Boolean.valueOf(this.f101863g)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f101857a.hashCode() * 31) + this.f101858b.hashCode()) * 31) + this.f101859c.hashCode()) * 31;
        String str = this.f101860d;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f101861e.hashCode()) * 31;
        String str2 = this.f101862f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f101863g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f101857a;
        DateTime dateTime = this.f101858b;
        DateTime dateTime2 = this.f101859c;
        String str2 = this.f101860d;
        String str3 = this.f101861e;
        String str4 = this.f101862f;
        boolean z = this.f101863g;
        return "BirdPayMerchantScreenShown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", presentedReason=" + str2 + ", merchantId=" + str3 + ", merchantSiteId=" + str4 + ", hasLearnMore=" + z + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C26929oO(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, (i & 8) != 0 ? null : str2, str3, (i & 32) != 0 ? null : str4, z);
        String str5;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str5 = uuid;
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
