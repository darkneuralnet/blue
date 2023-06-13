package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.app.feature.map.p008ui.renderer.MapPolygonableRenderer;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3$visibleSize$2 */
/* loaded from: classes2.dex */
public final class MapPolygonableRenderer$3$visibleSize$2 extends Lambda implements Function0<Double> {
    final /* synthetic */ VisibleRegion $visibleRegion;
    final /* synthetic */ Lazy<CX3> $visibleRegionGeom$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapPolygonableRenderer$3$visibleSize$2(VisibleRegion visibleRegion, Lazy<? extends CX3> lazy) {
        super(0);
        this.$visibleRegion = visibleRegion;
        this.$visibleRegionGeom$delegate = lazy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Double invoke() {
        CX3 invoke$lambda$0;
        List points;
        double m86796b;
        invoke$lambda$0 = MapPolygonableRenderer.C138773.invoke$lambda$0(this.$visibleRegionGeom$delegate);
        if (invoke$lambda$0 != null) {
            m86796b = invoke$lambda$0.mo77242M();
        } else {
            LatLngBounds latLngBounds = this.$visibleRegion.f71509f;
            Intrinsics.checkNotNullExpressionValue(latLngBounds, "visibleRegion.latLngBounds");
            points = MapPolygonableRendererKt.getPoints(latLngBounds);
            m86796b = RN5.m86796b(points);
        }
        return Double.valueOf(m86796b);
    }
}
