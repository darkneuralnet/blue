package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.model.Polygonable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LCX3;", "invoke", "()LCX3;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$geom$2\n+ 2 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt\n*L\n1#1,518:1\n45#2,2:519\n35#2:521\n47#2,3:522\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$geom$2\n*L\n132#1:519,2\n132#1:521\n132#1:522,3\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3$filterVisiblePolygonables$1$geom$2 */
/* loaded from: classes2.dex */
public final class MapPolygonableRenderer$3$filterVisiblePolygonables$1$geom$2 extends Lambda implements Function0<CX3> {
    final /* synthetic */ Polygonable $polygonable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPolygonableRenderer$3$filterVisiblePolygonables$1$geom$2(Polygonable polygonable) {
        super(0);
        this.$polygonable = polygonable;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CX3 invoke() {
        try {
            WB1 wb1 = C32866Fj2.m106642d().get(this.$polygonable.getRegion());
            if (wb1 != null) {
                return (CX3) wb1;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.locationtech.jts.geom.Polygon");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
