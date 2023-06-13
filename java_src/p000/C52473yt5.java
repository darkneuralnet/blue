package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.FilterLogicToggleOption;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.OperatorToggleFilter;
import co.bird.android.model.persistence.nestedstructures.MultiSelectFilterOption;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.persistence.nestedstructures.OperatorMapMultiSelectFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorMapRangeSelectFilter;
import co.bird.android.model.persistence.nestedstructures.RangeSelectFilterOption;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00040\u0000\u001a\u0012\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00070\u0000H\u0002\u001a\u0012\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00070\u0000H\u0002¨\u0006\f"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorOptionFilter;", "LHm3;", C17296a.f69688o, "Lco/bird/android/model/persistence/OperatorFilter;", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "c", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;", "b", "core-interface_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nServerDrivenFilterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerDrivenFilterManager.kt\nco/bird/android/coreinterface/manager/ServerDrivenFilterManagerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1855#2:170\n766#2:172\n857#2,2:173\n1549#2:175\n1620#2,3:176\n766#2:179\n857#2,2:180\n1549#2:182\n1620#2,3:183\n1856#2:186\n766#2:187\n857#2,2:188\n1549#2:190\n1620#2,3:191\n766#2:194\n857#2,2:195\n800#2,11:197\n800#2,11:208\n1549#2:219\n1620#2,3:220\n288#2,2:223\n533#2,6:225\n766#2:231\n857#2,2:232\n1549#2:234\n1620#2,3:235\n1#3:171\n*S KotlinDebug\n*F\n+ 1 ServerDrivenFilterManager.kt\nco/bird/android/coreinterface/manager/ServerDrivenFilterManagerKt\n*L\n78#1:170\n96#1:172\n96#1:173,2\n96#1:175\n96#1:176,3\n97#1:179\n97#1:180,2\n97#1:182\n97#1:183,3\n78#1:186\n123#1:187\n123#1:188,2\n124#1:190\n124#1:191,3\n148#1:194\n148#1:195,2\n151#1:197,11\n152#1:208,11\n153#1:219\n153#1:220,3\n159#1:223,2\n160#1:225,6\n166#1:231\n166#1:232,2\n166#1:234\n166#1:235,3\n*E\n"})
/* renamed from: yt5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52473yt5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yt5$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C30768a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OperatorFilterType.values().length];
            try {
                iArr[OperatorFilterType.RANGE_SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OperatorFilterType.MULTI_SELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OperatorFilterType.TOGGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OperatorFilterType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final C33362Hm3 m2325a(List<OperatorOptionFilter> list) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List listOf;
        List listOf2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        C33362Hm3 c33362Hm3 = new C33362Hm3(null, null, null, null, 15, null);
        for (OperatorOptionFilter operatorOptionFilter : list) {
            int i = C30768a.$EnumSwitchMapping$0[operatorOptionFilter.getType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ArrayList<OperatorFilterOption> arrayList = new ArrayList();
                    for (Object obj : operatorOptionFilter.getOptions()) {
                        if (((OperatorFilterOption) obj).getEnabled()) {
                            arrayList.add(obj);
                        }
                    }
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                    for (OperatorFilterOption operatorFilterOption : arrayList) {
                        arrayList2.add(operatorFilterOption.getValue());
                    }
                    ArrayList<OperatorFilterOption> arrayList3 = new ArrayList();
                    for (Object obj2 : operatorOptionFilter.getOptions()) {
                        if (!((OperatorFilterOption) obj2).getEnabled()) {
                            arrayList3.add(obj2);
                        }
                    }
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
                    ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
                    for (OperatorFilterOption operatorFilterOption2 : arrayList3) {
                        arrayList4.add(operatorFilterOption2.getValue());
                    }
                    if (!arrayList2.isEmpty()) {
                        c33362Hm3.m103437d().add(new C32894Fm3(operatorOptionFilter.getId(), arrayList2, null, 4, null));
                    }
                    if (!arrayList4.isEmpty()) {
                        c33362Hm3.m103439b().add(new C32894Fm3(operatorOptionFilter.getId(), arrayList4, null, 4, null));
                    }
                }
            } else {
                String str = null;
                if (operatorOptionFilter.isSet()) {
                    List<C32894Fm3> m103436e = c33362Hm3.m103436e();
                    String id = operatorOptionFilter.getId();
                    RangeSelectFilterOption m2322d = m2322d(operatorOptionFilter.getOptions());
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{m2322d.getStart(), m2322d.getEnd()});
                    FilterLogicToggleOption logicOperator = operatorOptionFilter.getLogicOperator();
                    if (logicOperator != null) {
                        str = logicOperator.toString();
                    }
                    m103436e.add(new C32894Fm3(id, listOf, str));
                } else {
                    List<C32894Fm3> m103438c = c33362Hm3.m103438c();
                    String id2 = operatorOptionFilter.getId();
                    RangeSelectFilterOption m2322d2 = m2322d(operatorOptionFilter.getOptions());
                    listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{m2322d2.getStart(), m2322d2.getEnd()});
                    FilterLogicToggleOption logicOperator2 = operatorOptionFilter.getLogicOperator();
                    if (logicOperator2 != null) {
                        str = logicOperator2.toString();
                    }
                    m103438c.add(new C32894Fm3(id2, listOf2, str));
                }
            }
        }
        return c33362Hm3;
    }

    /* renamed from: b */
    public static final MultiSelectFilterOption m2324b(List<OperatorFilterOption> list) {
        int collectionSizeOrDefault;
        ArrayList<OperatorFilterOption> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((OperatorFilterOption) obj).getEnabled()) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (OperatorFilterOption operatorFilterOption : arrayList) {
            arrayList2.add(operatorFilterOption.getValue());
        }
        return new MultiSelectFilterOption(arrayList2);
    }

    /* renamed from: c */
    public static final OperatorMapFilterBundle m2323c(List<? extends OperatorFilter> list) {
        List filterIsInstance;
        int collectionSizeOrDefault;
        List filterIsInstance2;
        int collectionSizeOrDefault2;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<? extends OperatorFilter> list2 = list;
        filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(list2, OperatorOptionFilter.class);
        ArrayList<OperatorOptionFilter> arrayList = new ArrayList();
        for (Object obj3 : filterIsInstance) {
            if (((OperatorOptionFilter) obj3).isSet()) {
                arrayList.add(obj3);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (OperatorOptionFilter operatorOptionFilter : arrayList) {
            int i = C30768a.$EnumSwitchMapping$0[operatorOptionFilter.getType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    String id = operatorOptionFilter.getId();
                    String name = operatorOptionFilter.getType().name();
                    C41318g46.m40160d("Filter '" + id + "' of type " + name + " passed to toOperatorMapRequest is not yet implemented, ignoring for now", new Object[0]);
                    obj2 = Unit.INSTANCE;
                    arrayList2.add(obj2);
                } else {
                    obj = new OperatorMapMultiSelectFilter(operatorOptionFilter.getId(), m2324b(operatorOptionFilter.getOptions()));
                }
            } else {
                obj = new OperatorMapRangeSelectFilter(operatorOptionFilter.getId(), m2322d(operatorOptionFilter.getOptions()), operatorOptionFilter.getLogicOperator());
            }
            obj2 = obj;
            arrayList2.add(obj2);
        }
        filterIsInstance2 = CollectionsKt___CollectionsJvmKt.filterIsInstance(list2, OperatorToggleFilter.class);
        ArrayList<OperatorToggleFilter> arrayList3 = new ArrayList();
        for (Object obj4 : filterIsInstance2) {
            if (((OperatorToggleFilter) obj4).getEnabled()) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : arrayList2) {
            if (obj5 instanceof OperatorMapMultiSelectFilter) {
                arrayList4.add(obj5);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj6 : arrayList2) {
            if (obj6 instanceof OperatorMapRangeSelectFilter) {
                arrayList5.add(obj6);
            }
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
        ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault2);
        for (OperatorToggleFilter operatorToggleFilter : arrayList3) {
            arrayList6.add(operatorToggleFilter.getId());
        }
        return new OperatorMapFilterBundle(arrayList4, arrayList5, arrayList6);
    }

    /* renamed from: d */
    public static final RangeSelectFilterOption m2322d(List<OperatorFilterOption> list) {
        OperatorFilterOption operatorFilterOption;
        Object obj;
        Object first;
        String value;
        Object last;
        String value2;
        Iterator<T> it = list.iterator();
        while (true) {
            operatorFilterOption = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((OperatorFilterOption) obj).getEnabled()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        OperatorFilterOption operatorFilterOption2 = (OperatorFilterOption) obj;
        if (operatorFilterOption2 == null || (value = operatorFilterOption2.getValue()) == null) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
            value = ((OperatorFilterOption) first).getValue();
        }
        ListIterator<OperatorFilterOption> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            OperatorFilterOption previous = listIterator.previous();
            if (previous.getEnabled()) {
                operatorFilterOption = previous;
                break;
            }
        }
        OperatorFilterOption operatorFilterOption3 = operatorFilterOption;
        if (operatorFilterOption3 == null || (value2 = operatorFilterOption3.getValue()) == null) {
            last = CollectionsKt___CollectionsKt.last((List<? extends Object>) list);
            value2 = ((OperatorFilterOption) last).getValue();
        }
        return new RangeSelectFilterOption(value, value2);
    }
}
