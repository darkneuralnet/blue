package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.FleetListSection;
import co.bird.android.model.persistence.FleetListVehicle;
import co.bird.android.model.persistence.nestedstructures.Facet;
import co.bird.android.model.persistence.nestedstructures.FleetListMessage;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00050\u00042\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J*\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u0014"}, m28432d2 = {"Lvo1;", "", "Lco/bird/android/model/persistence/nestedstructures/FleetListMessage;", "message", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/FleetListSection;", "Lco/bird/android/model/persistence/FleetListVehicle;", "sections", "LuN5;", "sortOrdering", "LH6;", C17296a.f69688o, "vehicles", "b", "c", "section", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetListConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListConverter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1549#2:53\n1620#2,3:54\n1549#2:59\n1620#2,3:60\n1045#2:63\n1054#2:64\n1549#2:65\n1620#2,3:66\n37#3,2:57\n1#4:69\n*S KotlinDebug\n*F\n+ 1 FleetListConverter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListConverter\n*L\n17#1:53\n17#1:54,3\n22#1:59\n22#1:60,3\n40#1:63\n42#1:64\n44#1:65\n44#1:66,3\n17#1:57,2\n*E\n"})
/* renamed from: vo1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50640vo1 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FleetListConverter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListConverter\n*L\n1#1,328:1\n40#2:329\n*E\n"})
    /* renamed from: vo1$a */
    /* loaded from: classes3.dex */
    public static final class C29643a<T> implements Comparator {

        /* renamed from: b */
        public final /* synthetic */ FleetListSection f114695b;

        public C29643a(FleetListSection fleetListSection) {
            this.f114695b = fleetListSection;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Object first;
            Object first2;
            int compareValues;
            Map<String, Integer> facetIndex = ((FleetListVehicle) t).getFacetIndex();
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f114695b.getFacets());
            Map<String, Integer> facetIndex2 = ((FleetListVehicle) t2).getFacetIndex();
            first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f114695b.getFacets());
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(facetIndex.get(((Facet) first).getName()), facetIndex2.get(((Facet) first2).getName()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 FleetListConverter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListConverter\n*L\n1#1,328:1\n42#2:329\n*E\n"})
    /* renamed from: vo1$b */
    /* loaded from: classes3.dex */
    public static final class C29644b<T> implements Comparator {

        /* renamed from: b */
        public final /* synthetic */ FleetListSection f114696b;

        public C29644b(FleetListSection fleetListSection) {
            this.f114696b = fleetListSection;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Object first;
            Object first2;
            int compareValues;
            Map<String, Integer> facetIndex = ((FleetListVehicle) t2).getFacetIndex();
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f114696b.getFacets());
            Map<String, Integer> facetIndex2 = ((FleetListVehicle) t).getFacetIndex();
            first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f114696b.getFacets());
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(facetIndex.get(((Facet) first).getName()), facetIndex2.get(((Facet) first2).getName()));
            return compareValues;
        }
    }

    /* renamed from: a */
    public final List<C3023H6> m8020a(FleetListMessage fleetListMessage, List<? extends Pair<FleetListSection, ? extends List<FleetListVehicle>>> sections, EnumC49795uN5 sortOrdering) {
        int collectionSizeOrDefault;
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(sortOrdering, "sortOrdering");
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(m8018c(fleetListMessage));
        List<? extends Pair<FleetListSection, ? extends List<FleetListVehicle>>> list = sections;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(m8017d((FleetListSection) pair.component1(), (List) pair.component2(), sortOrdering));
        }
        spreadBuilder.addSpread(arrayList.toArray(new C3023H6[0]));
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
        return listOfNotNull;
    }

    /* renamed from: b */
    public final List<C3023H6> m8019b(List<FleetListVehicle> vehicles) {
        int collectionSizeOrDefault;
        List mutableList;
        Object firstOrNull;
        String str;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        List<FleetListVehicle> list = vehicles;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FleetListVehicle fleetListVehicle : list) {
            arrayList.add(new C2637G6(fleetListVehicle, C38125aj4.item_fleet_list_vehicle, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) vehicles);
        FleetListVehicle fleetListVehicle2 = (FleetListVehicle) firstOrNull;
        if (fleetListVehicle2 != null) {
            str = fleetListVehicle2.getSection();
        } else {
            str = null;
        }
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, new C2637G6(str, C38125aj4.item_fleet_list_title, false, 4, null), null, 4, null));
        return listOf;
    }

    /* renamed from: c */
    public final C3023H6 m8018c(FleetListMessage fleetListMessage) {
        List mutableListOf;
        if (fleetListMessage != null) {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(fleetListMessage, C38125aj4.item_fleet_list_message, false, 4, null));
            return new C3023H6(mutableListOf, null, null, 6, null);
        }
        return null;
    }

    /* renamed from: d */
    public final C3023H6 m8017d(FleetListSection fleetListSection, List<FleetListVehicle> list, EnumC49795uN5 enumC49795uN5) {
        List<FleetListVehicle> list2;
        int collectionSizeOrDefault;
        List mutableList;
        if (enumC49795uN5 != null && !fleetListSection.getFacets().isEmpty()) {
            if (enumC49795uN5 == EnumC49795uN5.DESCENDING) {
                list2 = CollectionsKt___CollectionsKt.sortedWith(list, new C29643a(fleetListSection));
            } else {
                list2 = CollectionsKt___CollectionsKt.sortedWith(list, new C29644b(fleetListSection));
            }
        } else {
            list2 = list;
        }
        List<FleetListVehicle> list3 = list2;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FleetListVehicle fleetListVehicle : list3) {
            arrayList.add(new C2637G6(fleetListVehicle, C38125aj4.item_fleet_list_vehicle, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, new C2637G6(TuplesKt.m28425to(fleetListSection.getTitle(), enumC49795uN5), C38125aj4.item_fleet_list_title, false, 4, null), null, 4, null);
    }
}
