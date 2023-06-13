package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.wire.WireLocation;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LcD1;", "map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl$setCurrentLocation$1 */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImpl$setCurrentLocation$1 extends Lambda implements Function1<C39011cD1, Unit> {
    final /* synthetic */ WireLocation $location;
    final /* synthetic */ double $radius;
    final /* synthetic */ LocationSelectionUiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionUiImpl$setCurrentLocation$1(WireLocation wireLocation, LocationSelectionUiImpl locationSelectionUiImpl, double d) {
        super(1);
        this.$location = wireLocation;
        this.this$0 = locationSelectionUiImpl;
        this.$radius = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
        invoke2(c39011cD1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C39011cD1 map) {
        C51775xj0 c51775xj0;
        C40889fM2 c40889fM2;
        C51775xj0 c51775xj02;
        C33463Hx5 c33463Hx5;
        Intrinsics.checkNotNullParameter(map, "map");
        LatLng latLng = new LatLng(this.$location.getLatitude(), this.$location.getLongitude());
        c51775xj0 = this.this$0.circleMarker;
        if (c51775xj0 == null) {
            this.this$0.locationMarker = map.m61685c(new MarkerOptions().m50643u1(latLng).m50644u(0.5f, 0.5f).m50657N0(C40788fB0.m41777e(this.this$0.getActivity(), C48193rg4.ic_user_location)).m50651Y1(100.0f));
            LocationSelectionUiImpl locationSelectionUiImpl = this.this$0;
            CircleOptions m50695m0 = new CircleOptions().m50693s(latLng).m50695m0(this.$radius);
            LocationSelectionUiImpl locationSelectionUiImpl2 = this.this$0;
            int i = C32364Df4.transparentLightPurple;
            locationSelectionUiImpl.circleMarker = map.m61687a(m50695m0.m50694p0(locationSelectionUiImpl2.getColor(i)).m50692u(this.this$0.getColor(i)).m50702E0(100.0f));
        } else {
            c40889fM2 = this.this$0.locationMarker;
            if (c40889fM2 != null) {
                c40889fM2.m41521m(latLng);
            }
            c51775xj02 = this.this$0.circleMarker;
            if (c51775xj02 != null) {
                c51775xj02.m4797a(latLng);
            }
        }
        c33463Hx5 = this.this$0.binding;
        map.m61688F(0, 0, 0, c33463Hx5.f14216c.getHeight());
    }
}
