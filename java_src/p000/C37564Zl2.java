package p000;

import co.bird.android.model.wire.WireOrderItemView;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¨\u0006\u0003"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireOrderItemView;", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLandingConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingConverter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingConverterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,123:1\n1477#2:124\n1502#2,3:125\n1505#2,3:135\n1045#2:138\n1549#2:139\n1620#2,3:140\n361#3,7:128\n*S KotlinDebug\n*F\n+ 1 LandingConverter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingConverterKt\n*L\n112#1:124\n112#1:125,3\n112#1:135,3\n120#1:138\n121#1:139\n121#1:140,3\n112#1:128,7\n*E\n"})
/* renamed from: Zl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37564Zl2 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LandingConverter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingConverterKt\n*L\n1#1,328:1\n120#2:329\n*E\n"})
    /* renamed from: Zl2$a */
    /* loaded from: classes3.dex */
    public static final class C10369a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((Number) ((Map.Entry) t).getKey()).intValue()), Integer.valueOf(((Number) ((Map.Entry) t2).getKey()).intValue()));
            return compareValues;
        }
    }

    /* renamed from: a */
    public static final List<List<WireOrderItemView>> m72551a(List<WireOrderItemView> list) {
        List sortedWith;
        int collectionSizeOrDefault;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            WireOrderItemView wireOrderItemView = (WireOrderItemView) obj;
            Integer valueOf = Integer.valueOf((wireOrderItemView.getDate().getYear() * 10000) + (wireOrderItemView.getDate().getMonthOfYear() * 100) + wireOrderItemView.getDate().getDayOfMonth());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(linkedHashMap.entrySet(), new C10369a());
        List<Map.Entry> list2 = sortedWith;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Map.Entry entry : list2) {
            arrayList.add((List) entry.getValue());
        }
        return arrayList;
    }
}
