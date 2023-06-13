package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.model.wire.WireLocation;
import io.reactivex.InterfaceC23434B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireLocation;", "location", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Lco/bird/android/model/wire/WireLocation;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MapPresenterImpl$onResume$14 extends Lambda implements Function1<WireLocation, InterfaceC23434B<? extends WireLocation>> {
    final /* synthetic */ MapPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$onResume$14(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23434B<? extends WireLocation> invoke(WireLocation location) {
        MapUi mapUi;
        Intrinsics.checkNotNullParameter(location, "location");
        mapUi = this.this$0.f61617ui;
        return mapUi.showTeleportMarker(location);
    }
}
