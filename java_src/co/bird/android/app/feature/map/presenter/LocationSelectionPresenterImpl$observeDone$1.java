package co.bird.android.app.feature.map.presenter;

import android.location.Address;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.model.wire.WireLocation;
import io.reactivex.InterfaceC23434B;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "", "Landroid/location/Address;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl$observeDone$1 extends Lambda implements Function1<Unit, InterfaceC23434B<? extends List<? extends Address>>> {
    final /* synthetic */ LocationSelectionPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionPresenterImpl$observeDone$1(LocationSelectionPresenterImpl locationSelectionPresenterImpl) {
        super(1);
        this.this$0 = locationSelectionPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23434B<? extends List<Address>> invoke(Unit it) {
        LocationSelectionUi locationSelectionUi;
        InterfaceC40001dr4 interfaceC40001dr4;
        Intrinsics.checkNotNullParameter(it, "it");
        locationSelectionUi = this.this$0.f61616ui;
        WireLocation location = locationSelectionUi.getLocation();
        interfaceC40001dr4 = this.this$0.reactiveLocationManager;
        return interfaceC40001dr4.mo43606z(location.getLatitude(), location.getLongitude());
    }
}
