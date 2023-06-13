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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b5\u00106Jq\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0018¨\u00067"}, m28432d2 = {"Lhg;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "announcementId", "analyticsTitle", "experimentId", CoreConstants.CONTEXT_SCOPE_VALUE, "displayType", "contentType", "", "seenCount", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getAnnouncementId", "e", "getAnalyticsTitle", "f", "getExperimentId", "g", "getContext", "h", "getDisplayType", "i", "getContentType", "j", "I", "getSeenCount", "()I", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hg */
/* loaded from: classes4.dex */
public final class C22706hg implements AnalyticsEvent {

    /* renamed from: a */
    public final String f85643a;

    /* renamed from: b */
    public final DateTime f85644b;

    /* renamed from: c */
    public final DateTime f85645c;

    /* renamed from: d */
    public final String f85646d;

    /* renamed from: e */
    public final String f85647e;

    /* renamed from: f */
    public final String f85648f;

    /* renamed from: g */
    public final String f85649g;

    /* renamed from: h */
    public final String f85650h;

    /* renamed from: i */
    public final String f85651i;

    /* renamed from: j */
    public final int f85652j;

    public C22706hg(String eventId, DateTime eventTime, DateTime clientTime, String announcementId, String str, String str2, String context, String displayType, String contentType, int i) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(announcementId, "announcementId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f85643a = eventId;
        this.f85644b = eventTime;
        this.f85645c = clientTime;
        this.f85646d = announcementId;
        this.f85647e = str;
        this.f85648f = str2;
        this.f85649g = context;
        this.f85650h = displayType;
        this.f85651i = contentType;
        this.f85652j = i;
    }

    /* renamed from: a */
    public final C22706hg m36104a(String eventId, DateTime eventTime, DateTime clientTime, String announcementId, String str, String str2, String context, String displayType, String contentType, int i) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(announcementId, "announcementId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new C22706hg(eventId, eventTime, clientTime, announcementId, str, str2, context, displayType, contentType, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C22706hg) {
            C22706hg c22706hg = (C22706hg) obj;
            return Intrinsics.areEqual(this.f85643a, c22706hg.f85643a) && Intrinsics.areEqual(this.f85644b, c22706hg.f85644b) && Intrinsics.areEqual(this.f85645c, c22706hg.f85645c) && Intrinsics.areEqual(this.f85646d, c22706hg.f85646d) && Intrinsics.areEqual(this.f85647e, c22706hg.f85647e) && Intrinsics.areEqual(this.f85648f, c22706hg.f85648f) && Intrinsics.areEqual(this.f85649g, c22706hg.f85649g) && Intrinsics.areEqual(this.f85650h, c22706hg.f85650h) && Intrinsics.areEqual(this.f85651i, c22706hg.f85651i) && this.f85652j == c22706hg.f85652j;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.AnnouncementDismissed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f85643a), TuplesKt.m28425to("event_time", this.f85644b), TuplesKt.m28425to("client_time", this.f85645c), TuplesKt.m28425to("announcement_id", this.f85646d), TuplesKt.m28425to("analytics_title", this.f85647e), TuplesKt.m28425to("experiment_id", this.f85648f), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f85649g), TuplesKt.m28425to("display_type", this.f85650h), TuplesKt.m28425to("content_type", this.f85651i), TuplesKt.m28425to("seen_count", Integer.valueOf(this.f85652j)));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f85643a.hashCode() * 31) + this.f85644b.hashCode()) * 31) + this.f85645c.hashCode()) * 31) + this.f85646d.hashCode()) * 31;
        String str = this.f85647e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f85648f;
        return ((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f85649g.hashCode()) * 31) + this.f85650h.hashCode()) * 31) + this.f85651i.hashCode()) * 31) + Integer.hashCode(this.f85652j);
    }

    public String toString() {
        String str = this.f85643a;
        DateTime dateTime = this.f85644b;
        DateTime dateTime2 = this.f85645c;
        String str2 = this.f85646d;
        String str3 = this.f85647e;
        String str4 = this.f85648f;
        String str5 = this.f85649g;
        String str6 = this.f85650h;
        String str7 = this.f85651i;
        int i = this.f85652j;
        return "AnnouncementDismissed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", announcementId=" + str2 + ", analyticsTitle=" + str3 + ", experimentId=" + str4 + ", context=" + str5 + ", displayType=" + str6 + ", contentType=" + str7 + ", seenCount=" + i + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C22706hg(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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
