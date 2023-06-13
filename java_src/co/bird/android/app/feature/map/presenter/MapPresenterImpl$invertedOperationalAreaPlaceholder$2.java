package co.bird.android.app.feature.map.presenter;

import co.bird.android.model.Polygon;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.constant.ZoomBehavior;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.configs.MobileColorConfig;
import co.bird.android.model.wire.configs.ZoneColorConfig;
import co.bird.android.model.wire.configs.ZoneColorOverrideConfig;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.UStringsKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lco/bird/android/model/persistence/Area;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPresenter.kt\nco/bird/android/app/feature/map/presenter/MapPresenterImpl$invertedOperationalAreaPlaceholder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,623:1\n1#2:624\n*E\n"})
/* loaded from: classes2.dex */
public final class MapPresenterImpl$invertedOperationalAreaPlaceholder$2 extends Lambda implements Function0<Area> {
    final /* synthetic */ MapPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$invertedOperationalAreaPlaceholder$2(MapPresenterImpl mapPresenterImpl) {
        super(0);
        this.this$0 = mapPresenterImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Area invoke() {
        ZoneColorOverrideConfig zoneColorConfig;
        ZoneColorOverrideConfig zoneColorConfig2;
        ZoneColorOverrideConfig zoneColorConfig3;
        ZoneColorConfig operationalInverse;
        MobileColorConfig titleColor;
        Integer lightMode;
        ZoneColorConfig operationalInverse2;
        MobileColorConfig borderColor;
        Integer lightMode2;
        ZoneColorConfig operationalInverse3;
        MobileColorConfig fillColor;
        Integer lightMode3;
        String uuid = UUID.randomUUID().toString();
        Polygon m100293f = JX3.m100293f(Reflection.getOrCreateKotlinClass(Polygon.class));
        zoneColorConfig = this.this$0.getZoneColorConfig();
        int uInt = (zoneColorConfig == null || (operationalInverse3 = zoneColorConfig.getOperationalInverse()) == null || (fillColor = operationalInverse3.getFillColor()) == null || (lightMode3 = fillColor.getLightMode()) == null) ? UStringsKt.toUInt("23FF0010", 16) : lightMode3.intValue();
        zoneColorConfig2 = this.this$0.getZoneColorConfig();
        int uInt2 = (zoneColorConfig2 == null || (operationalInverse2 = zoneColorConfig2.getOperationalInverse()) == null || (borderColor = operationalInverse2.getBorderColor()) == null || (lightMode2 = borderColor.getLightMode()) == null) ? UStringsKt.toUInt("FFFFFFFF", 16) : lightMode2.intValue();
        zoneColorConfig3 = this.this$0.getZoneColorConfig();
        int intValue = (zoneColorConfig3 == null || (operationalInverse = zoneColorConfig3.getOperationalInverse()) == null || (titleColor = operationalInverse.getTitleColor()) == null || (lightMode = titleColor.getLightMode()) == null) ? 0 : lightMode.intValue();
        ZoomBehavior zoomBehavior = ZoomBehavior.ALWAYS_VISIBLE;
        AreaIconType areaIconType = AreaIconType.UNKNOWN;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString()");
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        Area area = new Area(uuid, null, null, null, false, false, false, false, false, false, false, false, null, null, null, null, null, null, m100293f, uInt, null, uInt2, null, intValue, null, zoomBehavior, true, null, null, null, null, null, null, null, null, areaIconType, areaIconType, areaIconType, null, null, null, true, null, null, null, null, null, null, "", now, null, Boolean.FALSE, -133959666, 327111, null);
        area.setOperationalInverse(true);
        return area;
    }
}
