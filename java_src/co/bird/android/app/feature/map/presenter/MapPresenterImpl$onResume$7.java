package co.bird.android.app.feature.map.presenter;

import co.bird.android.model.RideMapState;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/maps/model/LatLng;", "invoke", "(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$onResume$7 extends Lambda implements Function1<LatLng, Boolean> {
    final /* synthetic */ MapPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$onResume$7(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LatLng it) {
        InterfaceC46893pU4 interfaceC46893pU4;
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC46893pU4 = this.this$0.rideMapStateManager;
        return Boolean.valueOf(interfaceC46893pU4.mo15897l().m73665a() == RideMapState.NONE);
    }
}
