package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.constant.PopupInvocationMethod;
import co.bird.android.model.constant.PopupType;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.OperatorConfig;
import co.bird.android.model.wire.configs.OperatorFeatureConfig;
import co.bird.android.model.wire.configs.OperatorMapConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a>\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u0016\u0010\u000b\u001a\u00020\n*\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\f"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Area;", "", "", "previous", "Lkotlin/Pair;", "", "splitNewAndExisting", "LTq4;", "reactiveConfig", "", "canShowBottomSheetViaPolygonTap", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMapAreasUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/MapAreasUiKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,681:1\n1549#2:682\n1620#2,3:683\n3190#2,10:686\n1#3:696\n*S KotlinDebug\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/MapAreasUiKt\n*L\n574#1:682\n574#1:683,3\n575#1:686,10\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiKt */
/* loaded from: classes2.dex */
public final class MapAreasUiKt {
    public static final /* synthetic */ boolean access$canShowBottomSheetViaPolygonTap(Area area, C36207Tq4 c36207Tq4) {
        return canShowBottomSheetViaPolygonTap(area, c36207Tq4);
    }

    public static final boolean canShowBottomSheetViaPolygonTap(Area area, C36207Tq4 c36207Tq4) {
        boolean z;
        Z84<Config> m82623f8;
        Config m73665a;
        OperatorConfig operatorConfig;
        OperatorFeatureConfig features;
        OperatorMapConfig map;
        if (Intrinsics.areEqual(area.getFeeModified(), Boolean.TRUE)) {
            return true;
        }
        if (area.popupType() == PopupType.BOTTOM_SHEET) {
            if (area.popupInvocationMethod() == PopupInvocationMethod.POLYGON_TAP) {
                return true;
            }
            if (c36207Tq4 != null && (m82623f8 = c36207Tq4.m82623f8()) != null && (m73665a = m82623f8.m73665a()) != null && (operatorConfig = m73665a.getOperatorConfig()) != null && (features = operatorConfig.getFeatures()) != null && (map = features.getMap()) != null && map.getAllowAreaTapToSelectMarkerAreas()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static final Pair<List<Area>, Set<Area>> splitNewAndExisting(List<Area> list, Map<Area, ? extends Object> map) {
        int collectionSizeOrDefault;
        Set set;
        Set set2;
        Set<Area> keySet = map.keySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Area area : keySet) {
            arrayList.add(area.getId());
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (!set.contains(((Area) obj).getId())) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        set2 = CollectionsKt___CollectionsKt.toSet((List) pair.component2());
        return TuplesKt.m28425to((List) pair.component1(), set2);
    }
}
