package co.bird.android.app.feature.map.renderer;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LPT;", "invoke", "()LPT;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FleetMarkerOptionProvider$bitmapDescriptor$1 extends Lambda implements Function0<C6378PT> {
    final /* synthetic */ Lazy<C6378PT> $descriptor$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetMarkerOptionProvider$bitmapDescriptor$1(Lazy<C6378PT> lazy) {
        super(0);
        this.$descriptor$delegate = lazy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C6378PT invoke() {
        C6378PT bitmapDescriptor$lambda$1;
        bitmapDescriptor$lambda$1 = FleetMarkerOptionProvider.bitmapDescriptor$lambda$1(this.$descriptor$delegate);
        return bitmapDescriptor$lambda$1;
    }
}
