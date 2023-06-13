package co.bird.android.app.feature.map.p008ui;

import co.bird.android.core.mvp.BaseActivity;
import com.google.android.gms.maps.model.MarkerOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LfM2;", "invoke", "()LfM2;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl$destinationMarker$2 */
/* loaded from: classes2.dex */
public final class MapUiImpl$destinationMarker$2 extends Lambda implements Function0<C40889fM2> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ MapUiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapUiImpl$destinationMarker$2(MapUiImpl mapUiImpl, BaseActivity baseActivity) {
        super(0);
        this.this$0 = mapUiImpl;
        this.$activity = baseActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C40889fM2 invoke() {
        C39011cD1 map = this.this$0.getMap();
        MarkerOptions markerOptions = new MarkerOptions();
        MapUiImpl mapUiImpl = this.this$0;
        BaseActivity baseActivity = this.$activity;
        markerOptions.m50655R1(false);
        markerOptions.m50642v(false);
        markerOptions.m50643u1(mapUiImpl.getCenterLocation());
        markerOptions.m50644u(0.5f, 1.0f);
        markerOptions.m50651Y1(150.0f);
        markerOptions.m50657N0(C40788fB0.icon$default(baseActivity, C33309Hg4.ic_receipt_ride_end, null, null, 6, null));
        C40889fM2 m61685c = map.m61685c(markerOptions);
        Intrinsics.checkNotNull(m61685c);
        return m61685c;
    }
}
