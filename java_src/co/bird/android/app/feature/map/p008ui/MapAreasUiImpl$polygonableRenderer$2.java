package co.bird.android.app.feature.map.p008ui;

import co.bird.android.app.feature.map.p008ui.renderer.MapPolygonableRenderer;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.configs.MobileMapConfigView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$polygonableRenderer$2 */
/* loaded from: classes2.dex */
public final class MapAreasUiImpl$polygonableRenderer$2 extends Lambda implements Function0<MapPolygonableRenderer> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ ReactiveMapEvent $reactiveMapEvent;
    final /* synthetic */ MapAreasUiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAreasUiImpl$polygonableRenderer$2(MapAreasUiImpl mapAreasUiImpl, ReactiveMapEvent reactiveMapEvent, BaseActivity baseActivity) {
        super(0);
        this.this$0 = mapAreasUiImpl;
        this.$reactiveMapEvent = reactiveMapEvent;
        this.$activity = baseActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MapPolygonableRenderer invoke() {
        MobileMapConfigView mapConfig;
        InterfaceC40001dr4 interfaceC40001dr4;
        C39011cD1 c39011cD1 = this.this$0.map;
        ReactiveMapEvent reactiveMapEvent = this.$reactiveMapEvent;
        BaseActivity baseActivity = this.$activity;
        mapConfig = this.this$0.getMapConfig();
        interfaceC40001dr4 = this.this$0.locationManager;
        return new MapPolygonableRenderer(c39011cD1, reactiveMapEvent, baseActivity, mapConfig, interfaceC40001dr4);
    }
}
