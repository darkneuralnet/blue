package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.p008ui.MapUi;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class MapPresenterImpl$onResume$9 extends FunctionReferenceImpl implements Function1<LatLng, Unit> {
    public MapPresenterImpl$onResume$9(Object obj) {
        super(1, obj, MapUi.class, "showInfoWindowForNonOperationalArea", "showInfoWindowForNonOperationalArea(Lcom/google/android/gms/maps/model/LatLng;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LatLng latLng) {
        invoke2(latLng);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LatLng p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((MapUi) this.receiver).showInfoWindowForNonOperationalArea(p0);
    }
}
