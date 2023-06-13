package co.bird.android.app.feature.map.renderer;

import co.bird.android.app.feature.map.cluster.zonemarker.ZoneMarkerClusterItem;
import co.bird.android.model.Detail;
import co.bird.android.model.persistence.nestedstructures.Icon;
import co.bird.android.model.persistence.nestedstructures.ZoneAnnotationLabel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"cacheKey", "", "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;", "getCacheKey", "(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)Ljava/lang/String;", "Lco/bird/android/model/persistence/nestedstructures/Icon;", "(Lco/bird/android/model/persistence/nestedstructures/Icon;)Ljava/lang/String;", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nZoneMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
/* loaded from: classes2.dex */
public final class ZoneMarkerClusterRendererKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheKey(Icon icon) {
        String name = icon.getIcon().name();
        int lightMode = icon.getColor().getLightMode();
        return name + Detail.EMPTY_CHAR + lightMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (r1 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getCacheKey(ZoneMarkerClusterItem zoneMarkerClusterItem) {
        Object coloredIcon;
        String str;
        boolean selected = zoneMarkerClusterItem.getSelected();
        Icon icon = zoneMarkerClusterItem.getMarker().getZoneAnnotation().getIcon();
        if (icon != null) {
            coloredIcon = icon.getIcon() + Detail.EMPTY_CHAR + icon.getColor().getLightMode();
        }
        coloredIcon = zoneMarkerClusterItem.getMarker().getZoneAnnotation().getColoredIcon();
        ZoneAnnotationLabel label = zoneMarkerClusterItem.getMarker().getZoneAnnotation().getLabel();
        if (label != null) {
            str = label.getText() + Detail.EMPTY_CHAR + label.getColor().getLightMode();
        } else {
            str = null;
        }
        return selected + Detail.EMPTY_CHAR + coloredIcon + Detail.EMPTY_CHAR + str + Detail.EMPTY_CHAR + zoneMarkerClusterItem.getMarker().getZoneAnnotation().getColor().getLightMode() + Detail.EMPTY_CHAR + zoneMarkerClusterItem.getMarker().getZoneAnnotation().getBorderColor().getLightMode();
    }
}
