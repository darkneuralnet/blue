package co.bird.android.app.feature.map.renderer;

import co.bird.android.model.persistence.BountyMapMarker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LPT;", "invoke", "()LPT;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.renderer.BountyMarkerWithTimerOptionProvider$bitmapDescriptorFlashing$descriptor$2 */
/* loaded from: classes2.dex */
public final class C13842xd9294f8d extends Lambda implements Function0<C6378PT> {
    final /* synthetic */ BountyMapMarker $marker;
    final /* synthetic */ boolean $showTimer;
    final /* synthetic */ boolean $withIcon;
    final /* synthetic */ BountyMarkerWithTimerOptionProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13842xd9294f8d(BountyMarkerWithTimerOptionProvider bountyMarkerWithTimerOptionProvider, BountyMapMarker bountyMapMarker, boolean z, boolean z2) {
        super(0);
        this.this$0 = bountyMarkerWithTimerOptionProvider;
        this.$marker = bountyMapMarker;
        this.$withIcon = z;
        this.$showTimer = z2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C6378PT invoke() {
        C6378PT createBitmapDescriptor;
        createBitmapDescriptor = this.this$0.createBitmapDescriptor(this.$marker, this.$withIcon, this.$showTimer);
        return createBitmapDescriptor;
    }
}
