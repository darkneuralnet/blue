package co.bird.android.app.feature.map.p008ui.renderer;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LCX3;", "kotlin.jvm.PlatformType", "invoke", "()LCX3;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3$visibleRegionGeom$2 */
/* loaded from: classes2.dex */
public final class MapPolygonableRenderer$3$visibleRegionGeom$2 extends Lambda implements Function0<CX3> {
    final /* synthetic */ VisibleRegion $visibleRegion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPolygonableRenderer$3$visibleRegionGeom$2(VisibleRegion visibleRegion) {
        super(0);
        this.$visibleRegion = visibleRegion;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CX3 invoke() {
        VisibleRegion visibleRegion = this.$visibleRegion;
        LatLng latLng = visibleRegion.f71507d;
        LatLng latLng2 = visibleRegion.f71508e;
        LatLng latLng3 = visibleRegion.f71506c;
        LatLng latLng4 = visibleRegion.f71505b;
        LatLng latLng5 = visibleRegion.f71507d;
        return new C38409bC1().m64832w(AB0.m116035d().mo107445c(new C52053yB0[]{new C52053yB0(latLng.f71431c, latLng.f71430b), new C52053yB0(latLng2.f71431c, latLng2.f71430b), new C52053yB0(latLng3.f71431c, latLng3.f71430b), new C52053yB0(latLng4.f71431c, latLng4.f71430b), new C52053yB0(latLng5.f71431c, latLng5.f71430b)}));
    }
}
