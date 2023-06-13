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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b5\u00106Jq\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0018¨\u00067"}, m28432d2 = {"Log;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "announcementId", "analyticsTitle", "experimentId", CoreConstants.CONTEXT_SCOPE_VALUE, "displayType", "contentType", "", "seenCount", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getAnnouncementId", "e", "getAnalyticsTitle", "f", "getExperimentId", "g", "getContext", "h", "getDisplayType", "i", "getContentType", "j", "I", "getSeenCount", "()I", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: og */
/* loaded from: classes4.dex */
public final class C27023og implements AnalyticsEvent {

    /* renamed from: a */
    public final String f102286a;

    /* renamed from: b */
    public final DateTime f102287b;

    /* renamed from: c */
    public final DateTime f102288c;

    /* renamed from: d */
    public final String f102289d;

    /* renamed from: e */
    public final String f102290e;

    /* renamed from: f */
    public final String f102291f;

    /* renamed from: g */
    public final String f102292g;

    /* renamed from: h */
    public final String f102293h;

    /* renamed from: i */
    public final String f102294i;

    /* renamed from: j */
    public final int f102295j;

    public C27023og(String eventId, DateTime eventTime, DateTime clientTime, String announcementId, String str, String str2, String context, String displayType, String contentType, int i) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(announcementId, "announcementId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f102286a = eventId;
        this.f102287b = eventTime;
        this.f102288c = clientTime;
        this.f102289d = announcementId;
        this.f102290e = str;
        this.f102291f = str2;
        this.f102292g = context;
        this.f102293h = displayType;
        this.f102294i = contentType;
        this.f102295j = i;
    }

    /* renamed from: a */
    public final C27023og m20679a(String eventId, DateTime eventTime, DateTime clientTime, String announcementId, String str, String str2, String context, String displayType, String contentType, int i) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(announcementId, "announcementId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new C27023og(eventId, eventTime, clientTime, announcementId, str, str2, context, displayType, contentType, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27023og) {
            C27023og c27023og = (C27023og) obj;
            return Intrinsics.areEqual(this.f102286a, c27023og.f102286a) && Intrinsics.areEqual(this.f102287b, c27023og.f102287b) && Intrinsics.areEqual(this.f102288c, c27023og.f102288c) && Intrinsics.areEqual(this.f102289d, c27023og.f102289d) && Intrinsics.areEqual(this.f102290e, c27023og.f102290e) && Intrinsics.areEqual(this.f102291f, c27023og.f102291f) && Intrinsics.areEqual(this.f102292g, c27023og.f102292g) && Intrinsics.areEqual(this.f102293h, c27023og.f102293h) && Intrinsics.areEqual(this.f102294i, c27023og.f102294i) && this.f102295j == c27023og.f102295j;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.AnnouncementShown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f102286a), TuplesKt.m28425to("event_time", this.f102287b), TuplesKt.m28425to("client_time", this.f102288c), TuplesKt.m28425to("announcement_id", this.f102289d), TuplesKt.m28425to("analytics_title", this.f102290e), TuplesKt.m28425to("experiment_id", this.f102291f), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f102292g), TuplesKt.m28425to("display_type", this.f102293h), TuplesKt.m28425to("content_type", this.f102294i), TuplesKt.m28425to("seen_count", Integer.valueOf(this.f102295j)));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f102286a.hashCode() * 31) + this.f102287b.hashCode()) * 31) + this.f102288c.hashCode()) * 31) + this.f102289d.hashCode()) * 31;
        String str = this.f102290e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f102291f;
        return ((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f102292g.hashCode()) * 31) + this.f102293h.hashCode()) * 31) + this.f102294i.hashCode()) * 31) + Integer.hashCode(this.f102295j);
    }

    public String toString() {
        String str = this.f102286a;
        DateTime dateTime = this.f102287b;
        DateTime dateTime2 = this.f102288c;
        String str2 = this.f102289d;
        String str3 = this.f102290e;
        String str4 = this.f102291f;
        String str5 = this.f102292g;
        String str6 = this.f102293h;
        String str7 = this.f102294i;
        int i = this.f102295j;
        return "AnnouncementShown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", announcementId=" + str2 + ", analyticsTitle=" + str3 + ", experimentId=" + str4 + ", context=" + str5 + ", displayType=" + str6 + ", contentType=" + str7 + ", seenCount=" + i + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C27023og(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, str5, str6, str7, i);
        String str8;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i2 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str8 = uuid;
        } else {
            str8 = str;
        }
        if ((i2 & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i2 & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
