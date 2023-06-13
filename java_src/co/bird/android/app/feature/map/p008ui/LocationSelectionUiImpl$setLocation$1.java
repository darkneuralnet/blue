package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.wire.WireLocation;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LcD1;", "map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl$setLocation$1 */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImpl$setLocation$1 extends Lambda implements Function1<C39011cD1, Unit> {
    final /* synthetic */ boolean $animate;
    final /* synthetic */ WireLocation $location;
    final /* synthetic */ LocationSelectionUiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionUiImpl$setLocation$1(WireLocation wireLocation, LocationSelectionUiImpl locationSelectionUiImpl, boolean z) {
        super(1);
        this.$location = wireLocation;
        this.this$0 = locationSelectionUiImpl;
        this.$animate = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
        invoke2(c39011cD1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C39011cD1 map) {
        C40889fM2 c40889fM2;
        C40889fM2 c40889fM22;
        C40889fM2 c40889fM23;
        Intrinsics.checkNotNullParameter(map, "map");
        LatLng latLng = new LatLng(this.$location.getLatitude(), this.$location.getLongitude());
        c40889fM2 = this.this$0.marker;
        if (c40889fM2 == null) {
            this.this$0.marker = map.m61685c(new MarkerOptions().m50643u1(latLng).m50657N0(C40788fB0.m41777e(this.this$0.getActivity(), C34479Mg4.marker_nest)).m50642v(true).m50658L1(this.this$0.getActivity().getString(C45871nl4.create_nest_marker_instruction)));
            c40889fM23 = this.this$0.marker;
            if (c40889fM23 != null) {
                c40889fM23.m41514t();
            }
        } else {
            c40889fM22 = this.this$0.marker;
            if (c40889fM22 != null) {
                c40889fM22.m41521m(latLng);
            }
        }
        if (this.$animate) {
            map.m61682f(C48149rc0.m15705e(latLng, 17.0f));
        } else {
            map.m61675m(C48149rc0.m15705e(new LatLng(this.$location.getLatitude(), this.$location.getLongitude()), 18.0f));
        }
    }
}
