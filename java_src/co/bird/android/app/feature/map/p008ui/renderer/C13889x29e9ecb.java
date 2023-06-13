package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.p008ui.renderer.MapPolygonableRenderer;
import co.bird.android.model.Point;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$polygonableSize$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,518:1\n11335#2:519\n11670#2,3:520\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$polygonableSize$2\n*L\n133#1:519\n133#1:520,3\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3$filterVisiblePolygonables$1$polygonableSize$2 */
/* loaded from: classes2.dex */
public final class C13889x29e9ecb extends Lambda implements Function0<Double> {
    final /* synthetic */ Lazy<CX3> $geom$delegate;
    final /* synthetic */ Point[] $points;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13889x29e9ecb(Point[] pointArr, Lazy<? extends CX3> lazy) {
        super(0);
        this.$points = pointArr;
        this.$geom$delegate = lazy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Double invoke() {
        CX3 invoke$filterVisiblePolygonables$lambda$8$lambda$2;
        double m86796b;
        invoke$filterVisiblePolygonables$lambda$8$lambda$2 = MapPolygonableRenderer.C138773.invoke$filterVisiblePolygonables$lambda$8$lambda$2(this.$geom$delegate);
        if (invoke$filterVisiblePolygonables$lambda$8$lambda$2 != null) {
            m86796b = invoke$filterVisiblePolygonables$lambda$8$lambda$2.mo77242M();
        } else {
            Point[] points = this.$points;
            Intrinsics.checkNotNullExpressionValue(points, "points");
            ArrayList arrayList = new ArrayList(points.length);
            for (Point point : points) {
                Intrinsics.checkNotNullExpressionValue(point, "point");
                arrayList.add(GoogleMap_Kt.toLatLng(point));
            }
            m86796b = RN5.m86796b(arrayList);
        }
        return Double.valueOf(m86796b);
    }
}
