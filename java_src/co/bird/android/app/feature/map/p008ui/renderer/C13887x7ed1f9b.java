package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.app.feature.map.p008ui.renderer.MapPolygonableRenderer;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3$filterVisiblePolygonables$1$polygonRelativeSizeMet$2 */
/* loaded from: classes2.dex */
public final class C13887x7ed1f9b extends Lambda implements Function0<Boolean> {
    final /* synthetic */ Lazy<Double> $polygonableSize$delegate;
    final /* synthetic */ Lazy<Double> $visibleSize$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13887x7ed1f9b(Lazy<Double> lazy, Lazy<Double> lazy2) {
        super(0);
        this.$polygonableSize$delegate = lazy;
        this.$visibleSize$delegate = lazy2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        double invoke$filterVisiblePolygonables$lambda$8$lambda$3;
        double invoke$lambda$1;
        invoke$filterVisiblePolygonables$lambda$8$lambda$3 = MapPolygonableRenderer.C138773.invoke$filterVisiblePolygonables$lambda$8$lambda$3(this.$polygonableSize$delegate);
        invoke$lambda$1 = MapPolygonableRenderer.C138773.invoke$lambda$1(this.$visibleSize$delegate);
        return Boolean.valueOf(invoke$filterVisiblePolygonables$lambda$8$lambda$3 / invoke$lambda$1 > 5.0E-4d);
    }
}
