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
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b4\u00105Jt\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00140.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0019¨\u00066"}, m28432d2 = {"LKm3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "viewportWkt", "", "LFm3;", "multiSelectFiltersActive", "multiSelectFiltersInactive", "rangeSelectFilters", "", "fancyMultiselectEnabled", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)LKm3;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getViewportWkt", "e", "Ljava/util/List;", "getMultiSelectFiltersActive", "()Ljava/util/List;", "f", "getMultiSelectFiltersInactive", "g", "getRangeSelectFilters", "h", "Ljava/lang/Boolean;", "getFancyMultiselectEnabled", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorMapFiltersUpdated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorMapFiltersUpdated.kt\nco/bird/data/event/clientanalytics/OperatorMapFiltersUpdated\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1549#2:46\n1620#2,3:47\n1549#2:50\n1620#2,3:51\n1549#2:54\n1620#2,3:55\n*S KotlinDebug\n*F\n+ 1 OperatorMapFiltersUpdated.kt\nco/bird/data/event/clientanalytics/OperatorMapFiltersUpdated\n*L\n38#1:46\n38#1:47,3\n39#1:50\n39#1:51,3\n40#1:54\n40#1:55,3\n*E\n"})
/* renamed from: Km3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34064Km3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f20207a;

    /* renamed from: b */
    public final DateTime f20208b;

    /* renamed from: c */
    public final DateTime f20209c;

    /* renamed from: d */
    public final String f20210d;

    /* renamed from: e */
    public final List<C32894Fm3> f20211e;

    /* renamed from: f */
    public final List<C32894Fm3> f20212f;

    /* renamed from: g */
    public final List<C32894Fm3> f20213g;

    /* renamed from: h */
    public final Boolean f20214h;

    public C34064Km3(String eventId, DateTime eventTime, DateTime clientTime, String viewportWkt, List<C32894Fm3> multiSelectFiltersActive, List<C32894Fm3> multiSelectFiltersInactive, List<C32894Fm3> rangeSelectFilters, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(viewportWkt, "viewportWkt");
        Intrinsics.checkNotNullParameter(multiSelectFiltersActive, "multiSelectFiltersActive");
        Intrinsics.checkNotNullParameter(multiSelectFiltersInactive, "multiSelectFiltersInactive");
        Intrinsics.checkNotNullParameter(rangeSelectFilters, "rangeSelectFilters");
        this.f20207a = eventId;
        this.f20208b = eventTime;
        this.f20209c = clientTime;
        this.f20210d = viewportWkt;
        this.f20211e = multiSelectFiltersActive;
        this.f20212f = multiSelectFiltersInactive;
        this.f20213g = rangeSelectFilters;
        this.f20214h = bool;
    }

    /* renamed from: a */
    public final C34064Km3 m98296a(String eventId, DateTime eventTime, DateTime clientTime, String viewportWkt, List<C32894Fm3> multiSelectFiltersActive, List<C32894Fm3> multiSelectFiltersInactive, List<C32894Fm3> rangeSelectFilters, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(viewportWkt, "viewportWkt");
        Intrinsics.checkNotNullParameter(multiSelectFiltersActive, "multiSelectFiltersActive");
        Intrinsics.checkNotNullParameter(multiSelectFiltersInactive, "multiSelectFiltersInactive");
        Intrinsics.checkNotNullParameter(rangeSelectFilters, "rangeSelectFilters");
        return new C34064Km3(eventId, eventTime, clientTime, viewportWkt, multiSelectFiltersActive, multiSelectFiltersInactive, rangeSelectFilters, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34064Km3) {
            C34064Km3 c34064Km3 = (C34064Km3) obj;
            return Intrinsics.areEqual(this.f20207a, c34064Km3.f20207a) && Intrinsics.areEqual(this.f20208b, c34064Km3.f20208b) && Intrinsics.areEqual(this.f20209c, c34064Km3.f20209c) && Intrinsics.areEqual(this.f20210d, c34064Km3.f20210d) && Intrinsics.areEqual(this.f20211e, c34064Km3.f20211e) && Intrinsics.areEqual(this.f20212f, c34064Km3.f20212f) && Intrinsics.areEqual(this.f20213g, c34064Km3.f20213g) && Intrinsics.areEqual(this.f20214h, c34064Km3.f20214h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.OperatorMapFiltersUpdated";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        Map<String, Object> mapOf;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f20207a);
        pairArr[1] = TuplesKt.m28425to("event_time", this.f20208b);
        pairArr[2] = TuplesKt.m28425to("client_time", this.f20209c);
        pairArr[3] = TuplesKt.m28425to("viewport_wkt", this.f20210d);
        List<C32894Fm3> list = this.f20211e;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (C32894Fm3 c32894Fm3 : list) {
            arrayList.add(c32894Fm3.m106592b());
        }
        pairArr[4] = TuplesKt.m28425to("multi_select_filters_active", arrayList);
        List<C32894Fm3> list2 = this.f20212f;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (C32894Fm3 c32894Fm32 : list2) {
            arrayList2.add(c32894Fm32.m106592b());
        }
        pairArr[5] = TuplesKt.m28425to("multi_select_filters_inactive", arrayList2);
        List<C32894Fm3> list3 = this.f20213g;
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
        for (C32894Fm3 c32894Fm33 : list3) {
            arrayList3.add(c32894Fm33.m106592b());
        }
        pairArr[6] = TuplesKt.m28425to("range_select_filters", arrayList3);
        pairArr[7] = TuplesKt.m28425to("fancy_multiselect_enabled", this.f20214h);
        mapOf = MapsKt__MapsKt.mapOf(pairArr);
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f20207a.hashCode() * 31) + this.f20208b.hashCode()) * 31) + this.f20209c.hashCode()) * 31) + this.f20210d.hashCode()) * 31) + this.f20211e.hashCode()) * 31) + this.f20212f.hashCode()) * 31) + this.f20213g.hashCode()) * 31;
        Boolean bool = this.f20214h;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.f20207a;
        DateTime dateTime = this.f20208b;
        DateTime dateTime2 = this.f20209c;
        String str2 = this.f20210d;
        List<C32894Fm3> list = this.f20211e;
        List<C32894Fm3> list2 = this.f20212f;
        List<C32894Fm3> list3 = this.f20213g;
        Boolean bool = this.f20214h;
        return "OperatorMapFiltersUpdated(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", viewportWkt=" + str2 + ", multiSelectFiltersActive=" + list + ", multiSelectFiltersInactive=" + list2 + ", rangeSelectFilters=" + list3 + ", fancyMultiselectEnabled=" + bool + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C34064Km3(String str, DateTime dateTime, DateTime dateTime2, String str2, List list, List list2, List list3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, list, list2, list3, (i & 128) != 0 ? null : bool);
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
