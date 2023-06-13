package co.bird.android.app.feature.map.presenter;

import co.bird.android.model.wire.WireLocation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "location", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$onResume$16 extends Lambda implements Function1<WireLocation, Unit> {
    final /* synthetic */ MapPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$onResume$16(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WireLocation wireLocation) {
        invoke2(wireLocation);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(WireLocation location) {
        InterfaceC40001dr4 interfaceC40001dr4;
        InterfaceC12495bn interfaceC12495bn;
        interfaceC40001dr4 = this.this$0.locationManager;
        Intrinsics.checkNotNullExpressionValue(location, "location");
        interfaceC40001dr4.mo43617o(location);
        interfaceC12495bn = this.this$0.areaManager;
        interfaceC12495bn.mo64007T();
    }
}
