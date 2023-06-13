package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b1\u00102Jd\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0018¨\u00063"}, m28432d2 = {"LJm3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "viewportWkt", "", "LFm3;", "multiSelectFiltersToClear", "rangeSelectFiltersToClear", "", "fancyMultiselectEnabled", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)LJm3;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getViewportWkt", "e", "Ljava/util/List;", "getMultiSelectFiltersToClear", "()Ljava/util/List;", "f", "getRangeSelectFiltersToClear", "g", "Ljava/lang/Boolean;", "getFancyMultiselectEnabled", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorMapFiltersClearClicked.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorMapFiltersClearClicked.kt\nco/bird/data/event/clientanalytics/OperatorMapFiltersClearClicked\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1549#2:42\n1620#2,3:43\n1549#2:46\n1620#2,3:47\n*S KotlinDebug\n*F\n+ 1 OperatorMapFiltersClearClicked.kt\nco/bird/data/event/clientanalytics/OperatorMapFiltersClearClicked\n*L\n35#1:42\n35#1:43,3\n36#1:46\n36#1:47,3\n*E\n"})
/* renamed from: Jm3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33830Jm3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f18203a;

    /* renamed from: b */
    public final DateTime f18204b;

    /* renamed from: c */
    public final DateTime f18205c;

    /* renamed from: d */
    public final String f18206d;

    /* renamed from: e */
    public final List<C32894Fm3> f18207e;

    /* renamed from: f */
    public final List<C32894Fm3> f18208f;

    /* renamed from: g */
    public final Boolean f18209g;

    public C33830Jm3(String eventId, DateTime eventTime, DateTime clientTime, String viewportWkt, List<C32894Fm3> multiSelectFiltersToClear, List<C32894Fm3> rangeSelectFiltersToClear, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(viewportWkt, "viewportWkt");
        Intrinsics.checkNotNullParameter(multiSelectFiltersToClear, "multiSelectFiltersToClear");
        Intrinsics.checkNotNullParameter(rangeSelectFiltersToClear, "rangeSelectFiltersToClear");
        this.f18203a = eventId;
        this.f18204b = eventTime;
        this.f18205c = clientTime;
        this.f18206d = viewportWkt;
        this.f18207e = multiSelectFiltersToClear;
        this.f18208f = rangeSelectFiltersToClear;
        this.f18209g = bool;
    }

    public static /* synthetic */ C33830Jm3 copy$default(C33830Jm3 c33830Jm3, String str, DateTime dateTime, DateTime dateTime2, String str2, List list, List list2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c33830Jm3.f18203a;
        }
        if ((i & 2) != 0) {
            dateTime = c33830Jm3.f18204b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c33830Jm3.f18205c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c33830Jm3.f18206d;
        }
        String str3 = str2;
        List<C32894Fm3> list3 = list;
        if ((i & 16) != 0) {
            list3 = c33830Jm3.f18207e;
        }
        List list4 = list3;
        List<C32894Fm3> list5 = list2;
        if ((i & 32) != 0) {
            list5 = c33830Jm3.f18208f;
        }
        List list6 = list5;
        if ((i & 64) != 0) {
            bool = c33830Jm3.f18209g;
        }
        return c33830Jm3.m99715a(str, dateTime3, dateTime4, str3, list4, list6, bool);
    }

    /* renamed from: a */
    public final C33830Jm3 m99715a(String eventId, DateTime eventTime, DateTime clientTime, String viewportWkt, List<C32894Fm3> multiSelectFiltersToClear, List<C32894Fm3> rangeSelectFiltersToClear, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(viewportWkt, "viewportWkt");
        Intrinsics.checkNotNullParameter(multiSelectFiltersToClear, "multiSelectFiltersToClear");
        Intrinsics.checkNotNullParameter(rangeSelectFiltersToClear, "rangeSelectFiltersToClear");
        return new C33830Jm3(eventId, eventTime, clientTime, viewportWkt, multiSelectFiltersToClear, rangeSelectFiltersToClear, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33830Jm3) {
            C33830Jm3 c33830Jm3 = (C33830Jm3) obj;
            return Intrinsics.areEqual(this.f18203a, c33830Jm3.f18203a) && Intrinsics.areEqual(this.f18204b, c33830Jm3.f18204b) && Intrinsics.areEqual(this.f18205c, c33830Jm3.f18205c) && Intrinsics.areEqual(this.f18206d, c33830Jm3.f18206d) && Intrinsics.areEqual(this.f18207e, c33830Jm3.f18207e) && Intrinsics.areEqual(this.f18208f, c33830Jm3.f18208f) && Intrinsics.areEqual(this.f18209g, c33830Jm3.f18209g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.OperatorMapFiltersClearClicked";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Map<String, Object> mapOf;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f18203a);
        pairArr[1] = TuplesKt.m28425to("event_time", this.f18204b);
        pairArr[2] = TuplesKt.m28425to("client_time", this.f18205c);
        pairArr[3] = TuplesKt.m28425to("viewport_wkt", this.f18206d);
        List<C32894Fm3> list = this.f18207e;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (C32894Fm3 c32894Fm3 : list) {
            arrayList.add(c32894Fm3.m106592b());
        }
        pairArr[4] = TuplesKt.m28425to("multi_select_filters_to_clear", arrayList);
        List<C32894Fm3> list2 = this.f18208f;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (C32894Fm3 c32894Fm32 : list2) {
            arrayList2.add(c32894Fm32.m106592b());
        }
        pairArr[5] = TuplesKt.m28425to("range_select_filters_to_clear", arrayList2);
        pairArr[6] = TuplesKt.m28425to("fancy_multiselect_enabled", this.f18209g);
        mapOf = MapsKt__MapsKt.mapOf(pairArr);
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f18203a.hashCode() * 31) + this.f18204b.hashCode()) * 31) + this.f18205c.hashCode()) * 31) + this.f18206d.hashCode()) * 31) + this.f18207e.hashCode()) * 31) + this.f18208f.hashCode()) * 31;
        Boolean bool = this.f18209g;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.f18203a;
        DateTime dateTime = this.f18204b;
        DateTime dateTime2 = this.f18205c;
        String str2 = this.f18206d;
        List<C32894Fm3> list = this.f18207e;
        List<C32894Fm3> list2 = this.f18208f;
        Boolean bool = this.f18209g;
        return "OperatorMapFiltersClearClicked(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", viewportWkt=" + str2 + ", multiSelectFiltersToClear=" + list + ", rangeSelectFiltersToClear=" + list2 + ", fancyMultiselectEnabled=" + bool + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C33830Jm3(String str, DateTime dateTime, DateTime dateTime2, String str2, List list, List list2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, list, list2, (i & 64) != 0 ? null : bool);
        String str3;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str3 = uuid;
        } else {
            str3 = str;
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
