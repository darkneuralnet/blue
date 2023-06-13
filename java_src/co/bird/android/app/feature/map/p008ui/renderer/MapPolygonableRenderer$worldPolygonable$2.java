package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.model.LinearRing;
import co.bird.android.model.Polygon;
import co.bird.android.model.Polygonable;
import co.bird.android.model.wire.configs.MobileColorConfig;
import co.bird.android.model.wire.configs.MobileMapConfigView;
import co.bird.android.model.wire.configs.ZoneColorConfig;
import co.bird.android.model.wire.configs.ZoneColorOverrideConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.UStringsKt;
@Metadata(m28433d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "co/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1", "invoke", "()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$worldPolygonable$2 */
/* loaded from: classes2.dex */
public final class MapPolygonableRenderer$worldPolygonable$2 extends Lambda implements Function0<C138941> {
    final /* synthetic */ MapPolygonableRenderer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPolygonableRenderer$worldPolygonable$2(MapPolygonableRenderer mapPolygonableRenderer) {
        super(0);
        this.this$0 = mapPolygonableRenderer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$worldPolygonable$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final C138941 invoke() {
        return new Polygonable(this.this$0) { // from class: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$worldPolygonable$2.1
            private final int borderColor;
            private final int color;

            /* renamed from: id */
            private final String f61634id = MapPolygonableRenderer.WORLD_POLYGONABLE_ID;
            private final Polygon region;

            {
                int uInt;
                int uInt2;
                LinearRing linearRing;
                ZoneColorOverrideConfig zoneColorOverride;
                ZoneColorConfig operationalInverse;
                MobileColorConfig borderColor;
                Integer lightMode;
                ZoneColorOverrideConfig zoneColorOverride2;
                ZoneColorConfig operationalInverse2;
                MobileColorConfig fillColor;
                Integer lightMode2;
                MobileMapConfigView mobileMapConfigView = r4.mapConfig;
                if (mobileMapConfigView != null && (zoneColorOverride2 = mobileMapConfigView.getZoneColorOverride()) != null && (operationalInverse2 = zoneColorOverride2.getOperationalInverse()) != null && (fillColor = operationalInverse2.getFillColor()) != null && (lightMode2 = fillColor.getLightMode()) != null) {
                    uInt = lightMode2.intValue();
                } else {
                    uInt = UStringsKt.toUInt("23FF0010", 16);
                }
                this.color = uInt;
                MobileMapConfigView mobileMapConfigView2 = r4.mapConfig;
                if (mobileMapConfigView2 != null && (zoneColorOverride = mobileMapConfigView2.getZoneColorOverride()) != null && (operationalInverse = zoneColorOverride.getOperationalInverse()) != null && (borderColor = operationalInverse.getBorderColor()) != null && (lightMode = borderColor.getLightMode()) != null) {
                    uInt2 = lightMode.intValue();
                } else {
                    uInt2 = UStringsKt.toUInt("FFFFFFFF", 16);
                }
                this.borderColor = uInt2;
                linearRing = MapPolygonableRenderer.WORLD_RING;
                this.region = new Polygon(new LinearRing[]{linearRing});
            }

            @Override // co.bird.android.model.Polygonable
            public int getBorderColor() {
                return this.borderColor;
            }

            @Override // co.bird.android.model.Polygonable
            public int getColor() {
                return this.color;
            }

            @Override // co.bird.android.model.Polygonable
            public String getId() {
                return this.f61634id;
            }

            @Override // co.bird.android.model.Polygonable
            public Polygon getRegion() {
                return this.region;
            }
        };
    }
}
