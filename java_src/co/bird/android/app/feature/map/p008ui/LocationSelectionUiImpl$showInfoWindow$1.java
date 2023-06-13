package co.bird.android.app.feature.map.p008ui;

import com.google.android.gms.maps.model.MarkerOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LcD1;", "map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl$showInfoWindow$1 */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImpl$showInfoWindow$1 extends Lambda implements Function1<C39011cD1, Unit> {
    final /* synthetic */ MarkerOptions $markerOptions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionUiImpl$showInfoWindow$1(MarkerOptions markerOptions) {
        super(1);
        this.$markerOptions = markerOptions;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
        invoke2(c39011cD1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        C40889fM2 m61685c = map.m61685c(this.$markerOptions);
        if (m61685c != null) {
            m61685c.m41514t();
        }
    }
}
