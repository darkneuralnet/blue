package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.configs.MobileMapConfigView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J,\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u001a\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001a\u0010\u0015\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0013J\u001a\u0010\u0016\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0013J\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0002J\u001a\u0010\u001e\u001a\u00020\u00112\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0013R \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010&\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/RichPolygonAreaBiMap;", "", "", "LZO4;", "shapes", "Lco/bird/android/app/feature/map/ui/RichPolygonArea;", "getAreasForShapes", "Lco/bird/android/model/persistence/Area;", "area", "getShapeForArea", "areas", "Lkotlin/Pair;", "", "removeMissingAreas", "", "Lzp0;", "map", "", "addAll", "Lkotlin/Function1;", "action", "forEach", "forEachOperationalArea", "Lco/bird/android/model/wire/configs/MobileMapConfigView;", "mapConfig", "Lcom/google/android/gms/maps/model/LatLng;", "boundingAreaPoints", "LWO4;", "invertedOperational", "cleanUp", "clear", "", "richPolygonsToAreas", "Ljava/util/Map;", "areasToRichPolygons", "Lg46$b;", "getLogger", "()Lg46$b;", "logger", "<init>", "()V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMapAreasUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/RichPolygonAreaBiMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,681:1\n1603#2,9:682\n1855#2:691\n1856#2:694\n1612#2:695\n1549#2:696\n1620#2,3:697\n1549#2:706\n1620#2,3:707\n1#3:692\n1#3:693\n215#4,2:700\n215#4,2:702\n215#4,2:704\n215#4,2:710\n215#4,2:712\n*S KotlinDebug\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/RichPolygonAreaBiMap\n*L\n603#1:682,9\n603#1:691\n603#1:694\n603#1:695\n624#1:696\n624#1:697,3\n664#1:706\n664#1:707,3\n603#1:693\n641#1:700,2\n650#1:702,2\n655#1:704,2\n666#1:710,2\n676#1:712,2\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.RichPolygonAreaBiMap */
/* loaded from: classes2.dex */
final class RichPolygonAreaBiMap {
    private final Map<WO4, RichPolygonArea> richPolygonsToAreas = new LinkedHashMap();
    private final Map<Area, RichPolygonArea> areasToRichPolygons = new LinkedHashMap();

    private final C41318g46.AbstractC20723b getLogger() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("Area Rendering Pipeline");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"Area Rendering Pipeline\")");
        return m40153k;
    }

    public final synchronized void addAll(Map<Area, ? extends C53021zp0> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        for (Map.Entry<Area, ? extends C53021zp0> entry : map.entrySet()) {
            Area key = entry.getKey();
            C53021zp0 value = entry.getValue();
            RichPolygonArea richPolygonArea = new RichPolygonArea(value, key);
            this.areasToRichPolygons.put(key, richPolygonArea);
            Map<WO4, RichPolygonArea> map2 = this.richPolygonsToAreas;
            WO4 wo4 = value.f122273a;
            Intrinsics.checkNotNullExpressionValue(wo4, "commonRichPolygon.polygon");
            map2.put(wo4, richPolygonArea);
        }
    }

    public final synchronized void clear(Function1<? super RichPolygonArea, Unit> cleanUp) {
        Intrinsics.checkNotNullParameter(cleanUp, "cleanUp");
        for (Map.Entry<WO4, RichPolygonArea> entry : this.richPolygonsToAreas.entrySet()) {
            cleanUp.invoke(entry.getValue());
        }
        this.richPolygonsToAreas.clear();
        this.areasToRichPolygons.clear();
    }

    public final synchronized void forEach(Function1<? super RichPolygonArea, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        for (Map.Entry<WO4, RichPolygonArea> entry : this.richPolygonsToAreas.entrySet()) {
            action.invoke(entry.getValue());
        }
    }

    public final synchronized void forEachOperationalArea(Function1<? super RichPolygonArea, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        for (Map.Entry<WO4, RichPolygonArea> entry : this.richPolygonsToAreas.entrySet()) {
            RichPolygonArea value = entry.getValue();
            if (value.getArea().getOperational()) {
                action.invoke(value);
            }
        }
    }

    public final synchronized List<RichPolygonArea> getAreasForShapes(List<? extends ZO4> shapes) {
        ArrayList arrayList;
        WO4 wo4;
        Intrinsics.checkNotNullParameter(shapes, "shapes");
        arrayList = new ArrayList();
        for (ZO4 zo4 : shapes) {
            RichPolygonArea richPolygonArea = null;
            if (zo4 instanceof WO4) {
                wo4 = (WO4) zo4;
            } else {
                wo4 = null;
            }
            if (wo4 != null) {
                richPolygonArea = this.richPolygonsToAreas.get(wo4);
            }
            if (richPolygonArea != null) {
                arrayList.add(richPolygonArea);
            }
        }
        return arrayList;
    }

    public final synchronized RichPolygonArea getShapeForArea(Area area) {
        Intrinsics.checkNotNullParameter(area, "area");
        return this.areasToRichPolygons.get(area);
    }

    public final synchronized WO4 invertedOperational(MobileMapConfigView mobileMapConfigView, List<LatLng> list) {
        int collectionSizeOrDefault;
        if (list == null) {
            return null;
        }
        XO4 xo4 = new XO4(null);
        List<LatLng> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (LatLng latLng : list2) {
            arrayList.add(new VO4(latLng));
        }
        WO4 m77034d = xo4.m77036b(arrayList).m77034d();
        for (Map.Entry<WO4, RichPolygonArea> entry : this.richPolygonsToAreas.entrySet()) {
            WO4 key = entry.getKey();
            RichPolygonArea value = entry.getValue();
            if (value.getArea().getOperational() && !value.getArea().isOperationalInverse() && m77034d != null) {
                m77034d.m78500k(key.m73212f());
            }
        }
        return m77034d;
    }

    public final synchronized Pair<List<Area>, Set<RichPolygonArea>> removeMissingAreas(List<Area> areas) {
        Pair splitNewAndExisting;
        List list;
        LinkedHashSet linkedHashSet;
        int collectionSizeOrDefault;
        Set set;
        Intrinsics.checkNotNullParameter(areas, "areas");
        long currentTimeMillis = System.currentTimeMillis();
        splitNewAndExisting = MapAreasUiKt.splitNewAndExisting(areas, this.areasToRichPolygons);
        list = (List) splitNewAndExisting.component1();
        Set<Area> set2 = (Set) splitNewAndExisting.component2();
        linkedHashSet = new LinkedHashSet();
        C41318g46.AbstractC20723b logger = getLogger();
        Thread currentThread = Thread.currentThread();
        int size = areas.size();
        int size2 = set2.size();
        int size3 = list.size();
        logger.mo7228a("Thread: " + currentThread + " " + size + " | Existing: " + size2 + " | New: " + size3, new Object[0]);
        Iterator<Map.Entry<Area, RichPolygonArea>> it = this.areasToRichPolygons.entrySet().iterator();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Area area : set2) {
            arrayList.add(area.getId());
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        while (it.hasNext()) {
            Map.Entry<Area, RichPolygonArea> next = it.next();
            RichPolygonArea value = next.getValue();
            if (!set.contains(next.getKey().getId())) {
                linkedHashSet.add(value);
                it.remove();
                this.richPolygonsToAreas.remove(value.getCommonPolygon().f122273a);
            }
        }
        C41318g46.AbstractC20723b logger2 = getLogger();
        Thread currentThread2 = Thread.currentThread();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        logger2.mo7228a("Thread: " + currentThread2 + " time sort existing from new: " + currentTimeMillis2, new Object[0]);
        return TuplesKt.m28425to(list, linkedHashSet);
    }
}
