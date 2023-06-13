package co.bird.android.app.feature.map.cluster;

import co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23450a;
import io.reactivex.functions.InterfaceC23480c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\f\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \t*\u0004\u0018\u00018\u00018\u0001 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00018\u00018\u0001\u0018\u00010\b0\b \t*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \t*\u0004\u0018\u00018\u00018\u0001 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00018\u00018\u0001\u0018\u00010\b0\b\u0018\u00010\u00070\u0007\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"K", "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "T", "Lkotlin/Pair;", "", "Lcom/google/android/gms/maps/model/VisibleRegion;", "<name for destructuring parameter 0>", "Lna4;", "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lna4;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAbstractMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1549#2:226\n1620#2,3:227\n766#2:230\n857#2,2:231\n1222#2,4:233\n766#2:237\n857#2,2:238\n1603#2,9:240\n1855#2:249\n1856#2:251\n1612#2:252\n1855#2,2:253\n1549#2:255\n1620#2,3:256\n1549#2:259\n1620#2,3:260\n1549#2:263\n1620#2,3:264\n1#3:250\n*S KotlinDebug\n*F\n+ 1 AbstractMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5\n*L\n137#1:226\n137#1:227,3\n139#1:230\n139#1:231,2\n140#1:233,4\n142#1:237\n142#1:238,2\n144#1:240,9\n144#1:249\n144#1:251\n144#1:252\n164#1:253,2\n165#1:255\n165#1:256,3\n178#1:259\n178#1:260,3\n179#1:263\n179#1:264,3\n144#1:250\n*E\n"})
/* loaded from: classes2.dex */
public final class AbstractMarkerClusterManager$init$5 extends Lambda implements Function1<Pair<? extends List<? extends K>, ? extends VisibleRegion>, InterfaceC45761na4<? extends AbstractMarkerClusterManager.MarkerAction<T>>> {
    final /* synthetic */ AbstractMarkerClusterManager<K, T> this$0;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0004\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"<anonymous>", "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;", "T", "kotlin.jvm.PlatformType", "K", "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "markerActions", "<anonymous parameter 1>", "", "invoke", "(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;Ljava/lang/Long;)Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager$init$5$2 */
    /* loaded from: classes2.dex */
    public static final class C137962 extends Lambda implements Function2<AbstractMarkerClusterManager.MarkerAction<T>, Long, AbstractMarkerClusterManager.MarkerAction<T>> {
        public static final C137962 INSTANCE = new C137962();

        public C137962() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final AbstractMarkerClusterManager.MarkerAction<T> invoke(AbstractMarkerClusterManager.MarkerAction<T> markerActions, Long l) {
            Intrinsics.checkNotNullParameter(markerActions, "markerActions");
            Intrinsics.checkNotNullParameter(l, "<anonymous parameter 1>");
            return markerActions;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMarkerClusterManager$init$5(AbstractMarkerClusterManager<K, T> abstractMarkerClusterManager) {
        super(1);
        this.this$0 = abstractMarkerClusterManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractMarkerClusterManager.MarkerAction invoke$lambda$9(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (AbstractMarkerClusterManager.MarkerAction) tmp0.invoke(obj, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c0 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC45761na4<? extends AbstractMarkerClusterManager.MarkerAction<T>> invoke(Pair<? extends List<? extends K>, VisibleRegion> pair) {
        int collectionSizeOrDefault;
        Set set;
        Map map;
        int collectionSizeOrDefault2;
        C41318g46.AbstractC20723b logger;
        C41318g46.AbstractC20723b logger2;
        C41318g46.AbstractC20723b logger3;
        List plus;
        List chunked;
        int collectionSizeOrDefault3;
        List plus2;
        List chunked2;
        int collectionSizeOrDefault4;
        List plus3;
        boolean z;
        boolean contains;
        boolean contains2;
        C41318g46.AbstractC20723b logger4;
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        List markers = (List) pair.component1();
        VisibleRegion viewport = pair.component2();
        if (markers.isEmpty()) {
            logger4 = this.this$0.getLogger();
            logger4.mo7228a("Clearing items", new Object[0]);
            return AbstractC24490k.m32123o0(new AbstractMarkerClusterManager.MarkerAction.ClearMarkers());
        }
        Intrinsics.checkNotNullExpressionValue(markers, "markers");
        List<Object> list = markers;
        AbstractMarkerClusterManager<K, T> abstractMarkerClusterManager = this.this$0;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Object obj : list) {
            arrayList.add(abstractMarkerClusterManager.mo60514id(obj));
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        AbstractMarkerClusterManager<K, T> abstractMarkerClusterManager2 = this.this$0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            Intrinsics.checkNotNullExpressionValue(viewport, "viewport");
            contains2 = AbstractMarkerClusterManagerKt.contains(viewport, abstractMarkerClusterManager2.latLng(obj2));
            if (contains2) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractMarkerClusterManager<K, T> abstractMarkerClusterManager3 = this.this$0;
        for (Object obj3 : arrayList2) {
            linkedHashMap.put(abstractMarkerClusterManager3.mo60514id(obj3), obj3);
        }
        Collection mo72963b = this.this$0.getClusterManager().m104801k().mo72963b();
        Intrinsics.checkNotNullExpressionValue(mo72963b, "clusterManager.algorithm.items");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : mo72963b) {
            MarkerClusterItem markerClusterItem = (MarkerClusterItem) obj4;
            if (set.contains(markerClusterItem.getId())) {
                Intrinsics.checkNotNullExpressionValue(viewport, "viewport");
                LatLng position = markerClusterItem.getPosition();
                Intrinsics.checkNotNullExpressionValue(position, "item.position");
                contains = AbstractMarkerClusterManagerKt.contains(viewport, position);
                if (contains) {
                    z = false;
                    if (!z) {
                        arrayList3.add(obj4);
                    }
                }
            }
            z = true;
            if (!z) {
            }
        }
        Collection mo72963b2 = this.this$0.getClusterManager().m104801k().mo72963b();
        Intrinsics.checkNotNullExpressionValue(mo72963b2, "clusterManager.algorithm.items");
        AbstractMarkerClusterManager<K, T> abstractMarkerClusterManager4 = this.this$0;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = mo72963b2.iterator();
        while (true) {
            Pair pair2 = null;
            if (!it.hasNext()) {
                break;
            }
            MarkerClusterItem existingClusterItem = (MarkerClusterItem) it.next();
            Object obj5 = linkedHashMap.get(existingClusterItem.getId());
            if (obj5 != null) {
                linkedHashMap.remove(existingClusterItem.getId());
                if (!Intrinsics.areEqual(obj5, existingClusterItem.getMarker())) {
                    Intrinsics.checkNotNullExpressionValue(existingClusterItem, "existingClusterItem");
                    pair2 = TuplesKt.m28425to(existingClusterItem, abstractMarkerClusterManager4.updateMarker(obj5, existingClusterItem));
                }
            }
            if (pair2 != null) {
                arrayList4.add(pair2);
            }
        }
        map = MapsKt__MapsKt.toMap(arrayList4);
        Set keySet = map.keySet();
        Collection<MarkerClusterItem> values = map.values();
        AbstractMarkerClusterManager<K, T> abstractMarkerClusterManager5 = this.this$0;
        for (MarkerClusterItem markerClusterItem2 : values) {
            abstractMarkerClusterManager5.safeUpdateItem(markerClusterItem2);
        }
        Collection<Object> values2 = linkedHashMap.values();
        AbstractMarkerClusterManager<K, T> abstractMarkerClusterManager6 = this.this$0;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(values2, 10);
        ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault2);
        for (Object obj6 : values2) {
            arrayList5.add(abstractMarkerClusterManager6.newMarker(obj6));
        }
        if (keySet.isEmpty() && arrayList3.isEmpty() && arrayList5.isEmpty()) {
            return AbstractC24490k.m32181P();
        }
        logger = this.this$0.getLogger();
        logger.mo7228a("Num items updated: " + keySet.size(), new Object[0]);
        logger2 = this.this$0.getLogger();
        logger2.mo7228a("Num items removed: " + arrayList3.size(), new Object[0]);
        logger3 = this.this$0.getLogger();
        logger3.mo7228a("Num items added: " + arrayList5.size(), new Object[0]);
        AbstractC24490k<Long> m32176R0 = AbstractC24490k.m32126n0(100L, TimeUnit.MILLISECONDS).m32176R0();
        plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList3, (Iterable) keySet);
        chunked = CollectionsKt___CollectionsKt.chunked(plus, 50);
        List<List> list2 = chunked;
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault3);
        for (List list3 : list2) {
            arrayList6.add(new AbstractMarkerClusterManager.MarkerAction.RemoveMarkers(list3));
        }
        plus2 = CollectionsKt___CollectionsKt.plus((Collection) arrayList5, (Iterable) values);
        chunked2 = CollectionsKt___CollectionsKt.chunked(plus2, 50);
        List<List> list4 = chunked2;
        collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10);
        ArrayList arrayList7 = new ArrayList(collectionSizeOrDefault4);
        for (List list5 : list4) {
            arrayList7.add(new AbstractMarkerClusterManager.MarkerAction.AddMarkers(list5));
        }
        plus3 = CollectionsKt___CollectionsKt.plus((Collection) arrayList6, (Iterable) arrayList7);
        AbstractC24490k m32141i0 = AbstractC24490k.m32141i0(plus3);
        final C137962 c137962 = C137962.INSTANCE;
        return AbstractC24490k.m32104u1(m32141i0, m32176R0, new InterfaceC23480c() { // from class: co.bird.android.app.feature.map.cluster.a
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj7, Object obj8) {
                AbstractMarkerClusterManager.MarkerAction invoke$lambda$9;
                invoke$lambda$9 = AbstractMarkerClusterManager$init$5.invoke$lambda$9(Function2.this, obj7, obj8);
                return invoke$lambda$9;
            }
        }).m32100w0(10L, null, EnumC23450a.DROP_OLDEST);
    }
}
