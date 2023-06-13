package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b2\u00103J\u008a\u0001\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b!\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010(R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00140,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001a¨\u00064"}, m28432d2 = {"LKY;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "birdId", "birdModel", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "bulkAttemptId", "mode", "", "numberInBulk", "firmwareVersion", "rssi", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)LKY;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "e", "getClientTime", "f", "h", "g", "i", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "j", "k", "getRssi", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KY */
/* loaded from: classes4.dex */
public final class C4464KY implements AnalyticsEvent {

    /* renamed from: a */
    public final String f19728a;

    /* renamed from: b */
    public final String f19729b;

    /* renamed from: c */
    public final String f19730c;

    /* renamed from: d */
    public final DateTime f19731d;

    /* renamed from: e */
    public final DateTime f19732e;

    /* renamed from: f */
    public final String f19733f;

    /* renamed from: g */
    public final String f19734g;

    /* renamed from: h */
    public final String f19735h;

    /* renamed from: i */
    public final Integer f19736i;

    /* renamed from: j */
    public final Integer f19737j;

    /* renamed from: k */
    public final Integer f19738k;

    public C4464KY(String eventId, String str, String str2, DateTime eventTime, DateTime clientTime, String sessionId, String str3, String mode, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f19728a = eventId;
        this.f19729b = str;
        this.f19730c = str2;
        this.f19731d = eventTime;
        this.f19732e = clientTime;
        this.f19733f = sessionId;
        this.f19734g = str3;
        this.f19735h = mode;
        this.f19736i = num;
        this.f19737j = num2;
        this.f19738k = num3;
    }

    /* renamed from: a */
    public final C4464KY m98792a(String eventId, String str, String str2, DateTime eventTime, DateTime clientTime, String sessionId, String str3, String mode, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new C4464KY(eventId, str, str2, eventTime, clientTime, sessionId, str3, mode, num, num2, num3);
    }

    /* renamed from: b */
    public final String m98791b() {
        return this.f19729b;
    }

    /* renamed from: c */
    public final String m98790c() {
        return this.f19730c;
    }

    /* renamed from: d */
    public final String m98789d() {
        return this.f19734g;
    }

    /* renamed from: e */
    public final Integer m98788e() {
        return this.f19737j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4464KY) {
            C4464KY c4464ky = (C4464KY) obj;
            return Intrinsics.areEqual(this.f19728a, c4464ky.f19728a) && Intrinsics.areEqual(this.f19729b, c4464ky.f19729b) && Intrinsics.areEqual(this.f19730c, c4464ky.f19730c) && Intrinsics.areEqual(this.f19731d, c4464ky.f19731d) && Intrinsics.areEqual(this.f19732e, c4464ky.f19732e) && Intrinsics.areEqual(this.f19733f, c4464ky.f19733f) && Intrinsics.areEqual(this.f19734g, c4464ky.f19734g) && Intrinsics.areEqual(this.f19735h, c4464ky.f19735h) && Intrinsics.areEqual(this.f19736i, c4464ky.f19736i) && Intrinsics.areEqual(this.f19737j, c4464ky.f19737j) && Intrinsics.areEqual(this.f19738k, c4464ky.f19738k);
        }
        return false;
    }

    /* renamed from: f */
    public final String m98787f() {
        return this.f19735h;
    }

    /* renamed from: g */
    public final Integer m98786g() {
        return this.f19736i;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BluetoothWakeStarted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f19728a), TuplesKt.m28425to("bird_id", this.f19729b), TuplesKt.m28425to("bird_model", this.f19730c), TuplesKt.m28425to("event_time", this.f19731d), TuplesKt.m28425to("client_time", this.f19732e), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f19733f), TuplesKt.m28425to("bulk_attempt_id", this.f19734g), TuplesKt.m28425to("mode", this.f19735h), TuplesKt.m28425to("number_in_bulk", this.f19736i), TuplesKt.m28425to("firmware_version", this.f19737j), TuplesKt.m28425to("rssi", this.f19738k));
        return mapOf;
    }

    /* renamed from: h */
    public final String m98785h() {
        return this.f19733f;
    }

    public int hashCode() {
        int hashCode = this.f19728a.hashCode() * 31;
        String str = this.f19729b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19730c;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f19731d.hashCode()) * 31) + this.f19732e.hashCode()) * 31) + this.f19733f.hashCode()) * 31;
        String str3 = this.f19734g;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f19735h.hashCode()) * 31;
        Integer num = this.f19736i;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f19737j;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f19738k;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f19728a;
        String str2 = this.f19729b;
        String str3 = this.f19730c;
        DateTime dateTime = this.f19731d;
        DateTime dateTime2 = this.f19732e;
        String str4 = this.f19733f;
        String str5 = this.f19734g;
        String str6 = this.f19735h;
        Integer num = this.f19736i;
        Integer num2 = this.f19737j;
        Integer num3 = this.f19738k;
        return "BluetoothWakeStarted(eventId=" + str + ", birdId=" + str2 + ", birdModel=" + str3 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str4 + ", bulkAttemptId=" + str5 + ", mode=" + str6 + ", numberInBulk=" + num + ", firmwareVersion=" + num2 + ", rssi=" + num3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C4464KY(String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, r7, r8, str4, (i & 64) != 0 ? null : str5, str6, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : num3);
        String str7;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str7 = uuid;
        } else {
            str7 = str;
        }
        String str8 = (i & 2) != 0 ? null : str2;
        String str9 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 16) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
