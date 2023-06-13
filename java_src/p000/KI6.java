package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.ZoneFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.ZoneDetail;
import co.bird.android.model.persistence.nestedstructures.ZoneDetails;
import co.bird.android.model.persistence.nestedstructures.ZoneFlightSheetSection;
import co.bird.android.model.persistence.nestedstructures.ZoneStatus;
import co.bird.android.model.persistence.nestedstructures.ZoneSummary;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u0012"}, m28432d2 = {"LKI6;", "", "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;", "zoneFlightSheetDetails", "", "LH6;", C17296a.f69688o, "Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;", "summary", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;", "status", "c", "Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;", "details", "b", "<init>", "()V", "zone-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZoneFlightSheetConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetConverter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1549#2:67\n1620#2,3:68\n1045#2:73\n1603#2,9:74\n1855#2:83\n1856#2:85\n1612#2:86\n1549#2:87\n1620#2,3:88\n37#3,2:71\n1#4:84\n*S KotlinDebug\n*F\n+ 1 ZoneFlightSheetConverter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetConverter\n*L\n17#1:67\n17#1:68,3\n19#1:73\n20#1:74,9\n20#1:83\n20#1:85\n20#1:86\n49#1:87\n49#1:88,3\n17#1:71,2\n20#1:84\n*E\n"})
/* renamed from: KI6 */
/* loaded from: classes3.dex */
public final class KI6 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ZoneFlightSheetConverter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetConverter\n*L\n1#1,328:1\n19#2:329\n*E\n"})
    /* renamed from: KI6$a */
    /* loaded from: classes3.dex */
    public static final class C4393a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((ZoneFlightSheetSection) t).getIdx()), Integer.valueOf(((ZoneFlightSheetSection) t2).getIdx()));
            return compareValues;
        }
    }

    /* renamed from: a */
    public final List<C3023H6> m99023a(ZoneFlightSheetDetails zoneFlightSheetDetails) {
        int collectionSizeOrDefault;
        List listOf;
        List<ZoneFlightSheetSection> sortedWith;
        C3023H6 c3023h6;
        Intrinsics.checkNotNullParameter(zoneFlightSheetDetails, "zoneFlightSheetDetails");
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.add(zoneFlightSheetDetails.getZoneSummary());
        spreadBuilder.add(zoneFlightSheetDetails.getZoneStatus());
        List<ZoneDetails> detailSections = zoneFlightSheetDetails.getDetailSections();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(detailSections, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ZoneDetails zoneDetails : detailSections) {
            arrayList.add(zoneDetails);
        }
        spreadBuilder.addSpread(arrayList.toArray(new ZoneDetails[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new ZoneFlightSheetSection[spreadBuilder.size()]));
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(listOf, new C4393a());
        ArrayList arrayList2 = new ArrayList();
        for (ZoneFlightSheetSection zoneFlightSheetSection : sortedWith) {
            if (zoneFlightSheetSection instanceof ZoneSummary) {
                c3023h6 = m99020d((ZoneSummary) zoneFlightSheetSection);
            } else if (zoneFlightSheetSection instanceof ZoneStatus) {
                c3023h6 = m99021c((ZoneStatus) zoneFlightSheetSection);
            } else if (zoneFlightSheetSection instanceof ZoneDetails) {
                c3023h6 = m99022b((ZoneDetails) zoneFlightSheetSection);
            } else {
                c3023h6 = null;
            }
            if (c3023h6 != null) {
                arrayList2.add(c3023h6);
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    public final C3023H6 m99022b(ZoneDetails zoneDetails) {
        int collectionSizeOrDefault;
        List mutableList;
        List<ZoneDetail> details = zoneDetails.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ZoneDetail zoneDetail : details) {
            arrayList.add(new C2637G6(zoneDetail, C37314Yj4.item_zone_flight_sheet_detail, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, new C2637G6(zoneDetails, C37314Yj4.item_zone_flight_sheet_details_title, false, 4, null), null, 4, null);
    }

    /* renamed from: c */
    public final C3023H6 m99021c(ZoneStatus zoneStatus) {
        return new C3023H6(new ArrayList(), new C2637G6(zoneStatus, C37314Yj4.item_zone_flight_sheet_status, false, 4, null), null, 4, null);
    }

    /* renamed from: d */
    public final C3023H6 m99020d(ZoneSummary zoneSummary) {
        return new C3023H6(new ArrayList(), new C2637G6(zoneSummary, C37314Yj4.item_zone_flight_sheet_summary, false, 4, null), null, 4, null);
    }
}
