package p000;

import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.OperatorToggleFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.persistence.nestedstructures.OperatorMapMultiSelectFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorMapRangeSelectFilter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005H\u0002¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "availableOperatorFilters", C17296a.f69688o, "Lco/bird/android/model/Polygon;", "Lco/bird/android/model/Point;", "c", "co.bird.android.feature.fleet-status"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetStatusPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1549#2:299\n1620#2,2:300\n288#2,2:302\n1549#2:304\n1620#2,3:305\n766#2:308\n857#2:309\n2624#2,3:310\n858#2:313\n1549#2:314\n1620#2,3:315\n1549#2:318\n1620#2,3:319\n1622#2:322\n1603#2,9:323\n1855#2:332\n288#2,2:333\n350#2,7:335\n378#2,7:342\n1559#2:349\n1590#2,4:350\n1856#2:355\n1612#2:356\n1603#2,9:357\n1855#2:366\n288#2,2:367\n1856#2:370\n1612#2:371\n1549#2:372\n1620#2,3:373\n1#3:354\n1#3:369\n*S KotlinDebug\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenterKt\n*L\n252#1:299\n252#1:300,2\n255#1:302,2\n257#1:304\n257#1:305,3\n262#1:308\n262#1:309\n263#1:310,3\n262#1:313\n265#1:314\n265#1:315,3\n273#1:318\n273#1:319,3\n252#1:322\n275#1:323,9\n275#1:332\n278#1:333,2\n280#1:335,7\n281#1:342,7\n283#1:349\n283#1:350,4\n275#1:355\n275#1:356\n287#1:357,9\n287#1:366\n290#1:367,2\n287#1:370\n287#1:371\n296#1:372\n296#1:373,3\n275#1:354\n287#1:369\n*E\n"})
/* renamed from: dr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39998dr1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final List<OperatorFilter> m43637a(OperatorMapFilterBundle operatorMapFilterBundle, List<? extends OperatorFilter> list) {
        int collectionSizeOrDefault;
        List plus;
        List<OperatorFilter> plus2;
        List filterIsInstance;
        Object obj;
        OperatorToggleFilter operatorToggleFilter;
        List filterIsInstance2;
        Object obj2;
        OperatorOptionFilter operatorOptionFilter;
        int i;
        int collectionSizeOrDefault2;
        boolean z;
        List filterIsInstance3;
        int collectionSizeOrDefault3;
        OperatorOptionFilter operatorOptionFilter2;
        int collectionSizeOrDefault4;
        int collectionSizeOrDefault5;
        List plus3;
        boolean z2;
        List<OperatorMapMultiSelectFilter> multiSelectFilters = operatorMapFilterBundle.getMultiSelectFilters();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(multiSelectFilters, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = multiSelectFilters.iterator();
        while (true) {
            OperatorOptionFilter operatorOptionFilter3 = null;
            if (!it.hasNext()) {
                break;
            }
            OperatorMapMultiSelectFilter operatorMapMultiSelectFilter = (OperatorMapMultiSelectFilter) it.next();
            filterIsInstance3 = CollectionsKt___CollectionsJvmKt.filterIsInstance(list, OperatorOptionFilter.class);
            Iterator it2 = filterIsInstance3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.areEqual(((OperatorOptionFilter) next).getId(), operatorMapMultiSelectFilter.getId())) {
                    operatorOptionFilter3 = next;
                    break;
                }
            }
            OperatorOptionFilter operatorOptionFilter4 = operatorOptionFilter3;
            if (operatorOptionFilter4 != null) {
                List<OperatorFilterOption> options = operatorOptionFilter4.getOptions();
                collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(options, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault4);
                for (OperatorFilterOption operatorFilterOption : options) {
                    arrayList2.add(OperatorFilterOption.copy$default(operatorFilterOption, null, null, null, operatorMapMultiSelectFilter.getOptions().getSelections().contains(operatorFilterOption.getValue()), null, null, 55, null));
                }
                ArrayList<String> arrayList3 = new ArrayList();
                for (Object obj3 : operatorMapMultiSelectFilter.getOptions().getSelections()) {
                    String str = (String) obj3;
                    List<OperatorFilterOption> options2 = operatorOptionFilter4.getOptions();
                    if (!(options2 instanceof Collection) || !options2.isEmpty()) {
                        for (OperatorFilterOption operatorFilterOption2 : options2) {
                            if (Intrinsics.areEqual(operatorFilterOption2.getValue(), str)) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        arrayList3.add(obj3);
                    }
                }
                collectionSizeOrDefault5 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
                ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault5);
                for (String str2 : arrayList3) {
                    arrayList4.add(m43636b(str2));
                }
                plus3 = CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
                operatorOptionFilter2 = operatorOptionFilter4.copy((r24 & 1) != 0 ? operatorOptionFilter4.f66683id : null, (r24 & 2) != 0 ? operatorOptionFilter4.kind : null, (r24 & 4) != 0 ? operatorOptionFilter4.ordinal : 0, (r24 & 8) != 0 ? operatorOptionFilter4.type : null, (r24 & 16) != 0 ? operatorOptionFilter4.label : null, (r24 & 32) != 0 ? operatorOptionFilter4.options : plus3, (r24 & 64) != 0 ? operatorOptionFilter4.logicOperator : null, (r24 & 128) != 0 ? operatorOptionFilter4.icon : null, (r24 & 256) != 0 ? operatorOptionFilter4.iconColor : null, (r24 & 512) != 0 ? operatorOptionFilter4.coloredIcon : null, (r24 & 1024) != 0 ? operatorOptionFilter4.iconBackgroundColor : null);
                if (operatorOptionFilter2 != null) {
                    arrayList.add(operatorOptionFilter2);
                }
            }
            String id = operatorMapMultiSelectFilter.getId();
            OperatorFilterType operatorFilterType = OperatorFilterType.MULTI_SELECT;
            List<String> selections = operatorMapMultiSelectFilter.getOptions().getSelections();
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(selections, 10);
            ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault3);
            for (String str3 : selections) {
                arrayList5.add(m43636b(str3));
            }
            operatorOptionFilter2 = new OperatorOptionFilter(id, null, 0, operatorFilterType, null, arrayList5, null, null, null, null, null, 2006, null);
            arrayList.add(operatorOptionFilter2);
        }
        ArrayList arrayList6 = new ArrayList();
        for (OperatorMapRangeSelectFilter operatorMapRangeSelectFilter : operatorMapFilterBundle.getRangeSelectFilters()) {
            filterIsInstance2 = CollectionsKt___CollectionsJvmKt.filterIsInstance(list, OperatorOptionFilter.class);
            Iterator it3 = filterIsInstance2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    if (Intrinsics.areEqual(((OperatorOptionFilter) obj2).getId(), operatorMapRangeSelectFilter.getId())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            OperatorOptionFilter operatorOptionFilter5 = (OperatorOptionFilter) obj2;
            if (operatorOptionFilter5 != null) {
                Iterator<OperatorFilterOption> it4 = operatorOptionFilter5.getOptions().iterator();
                int i2 = 0;
                while (true) {
                    i = -1;
                    if (it4.hasNext()) {
                        if (Intrinsics.areEqual(it4.next().getValue(), operatorMapRangeSelectFilter.getOptions().getStart())) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                List<OperatorFilterOption> options3 = operatorOptionFilter5.getOptions();
                ListIterator<OperatorFilterOption> listIterator = options3.listIterator(options3.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (Intrinsics.areEqual(listIterator.previous().getValue(), operatorMapRangeSelectFilter.getOptions().getEnd())) {
                            i = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                List<OperatorFilterOption> options4 = operatorOptionFilter5.getOptions();
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(options4, 10);
                ArrayList arrayList7 = new ArrayList(collectionSizeOrDefault2);
                int i3 = 0;
                for (Object obj4 : options4) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    OperatorFilterOption operatorFilterOption3 = (OperatorFilterOption) obj4;
                    if (i2 <= i3 && i3 <= i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList7.add(OperatorFilterOption.copy$default(operatorFilterOption3, null, null, null, z, null, null, 55, null));
                    i3 = i4;
                }
                operatorOptionFilter = operatorOptionFilter5.copy((r24 & 1) != 0 ? operatorOptionFilter5.f66683id : null, (r24 & 2) != 0 ? operatorOptionFilter5.kind : null, (r24 & 4) != 0 ? operatorOptionFilter5.ordinal : 0, (r24 & 8) != 0 ? operatorOptionFilter5.type : null, (r24 & 16) != 0 ? operatorOptionFilter5.label : null, (r24 & 32) != 0 ? operatorOptionFilter5.options : arrayList7, (r24 & 64) != 0 ? operatorOptionFilter5.logicOperator : null, (r24 & 128) != 0 ? operatorOptionFilter5.icon : null, (r24 & 256) != 0 ? operatorOptionFilter5.iconColor : null, (r24 & 512) != 0 ? operatorOptionFilter5.coloredIcon : null, (r24 & 1024) != 0 ? operatorOptionFilter5.iconBackgroundColor : null);
            } else {
                operatorOptionFilter = null;
            }
            if (operatorOptionFilter != null) {
                arrayList6.add(operatorOptionFilter);
            }
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList6);
        List list2 = plus;
        ArrayList arrayList8 = new ArrayList();
        for (String str4 : operatorMapFilterBundle.getToggleFilters()) {
            filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(list, OperatorToggleFilter.class);
            Iterator it5 = filterIsInstance.iterator();
            while (true) {
                if (it5.hasNext()) {
                    obj = it5.next();
                    if (Intrinsics.areEqual(((OperatorToggleFilter) obj).getId(), str4)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            OperatorToggleFilter operatorToggleFilter2 = (OperatorToggleFilter) obj;
            if (operatorToggleFilter2 != null) {
                operatorToggleFilter = operatorToggleFilter2.copy((r24 & 1) != 0 ? operatorToggleFilter2.f66684id : null, (r24 & 2) != 0 ? operatorToggleFilter2.kind : null, (r24 & 4) != 0 ? operatorToggleFilter2.ordinal : 0, (r24 & 8) != 0 ? operatorToggleFilter2.type : null, (r24 & 16) != 0 ? operatorToggleFilter2.title : null, (r24 & 32) != 0 ? operatorToggleFilter2.toggleTitle : null, (r24 & 64) != 0 ? operatorToggleFilter2.enabled : true, (r24 & 128) != 0 ? operatorToggleFilter2.icon : null, (r24 & 256) != 0 ? operatorToggleFilter2.iconColor : null, (r24 & 512) != 0 ? operatorToggleFilter2.coloredIcon : null, (r24 & 1024) != 0 ? operatorToggleFilter2.iconBackgroundColor : null);
            } else {
                operatorToggleFilter = null;
            }
            if (operatorToggleFilter != null) {
                arrayList8.add(operatorToggleFilter);
            }
        }
        plus2 = CollectionsKt___CollectionsKt.plus((Collection) list2, (Iterable) arrayList8);
        return plus2;
    }

    /* renamed from: b */
    public static final OperatorFilterOption m43636b(String str) {
        return new OperatorFilterOption("", null, str, true, null, null, 50, null);
    }

    /* renamed from: c */
    public static final List<Point> m43635c(Polygon polygon) {
        IntRange until;
        int collectionSizeOrDefault;
        until = RangesKt___RangesKt.until(0, polygon.numPoints());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(polygon.getPoint(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }
}
