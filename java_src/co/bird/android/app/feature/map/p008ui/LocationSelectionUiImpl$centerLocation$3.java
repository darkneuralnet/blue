package co.bird.android.app.feature.map.p008ui;

import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lcom/google/android/gms/maps/model/LatLng;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl$centerLocation$3 */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImpl$centerLocation$3 extends Lambda implements Function1<Unit, LatLng> {
    final /* synthetic */ C39011cD1 $map;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionUiImpl$centerLocation$3(C39011cD1 c39011cD1) {
        super(1);
        this.$map = c39011cD1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final LatLng invoke(Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$map.m61679i().f71394b;
    }
}
