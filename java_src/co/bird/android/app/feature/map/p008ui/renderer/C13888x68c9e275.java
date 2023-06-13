package co.bird.android.app.feature.map.p008ui.renderer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3$filterVisiblePolygonables$1$polygonZoomMet$2 */
/* loaded from: classes2.dex */
public final class C13888x68c9e275 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ float $zoom;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13888x68c9e275(float f) {
        super(0);
        this.$zoom = f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$zoom >= 15.0f);
    }
}
