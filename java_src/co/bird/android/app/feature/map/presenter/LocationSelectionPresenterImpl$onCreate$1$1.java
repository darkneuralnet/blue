package co.bird.android.app.feature.map.presenter;

import android.location.Location;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireLocationKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "currentLocation", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl$onCreate$1$1 extends Lambda implements Function1<Location, Unit> {
    final /* synthetic */ LocationSelectionPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionPresenterImpl$onCreate$1$1(LocationSelectionPresenterImpl locationSelectionPresenterImpl) {
        super(1);
        this.this$0 = locationSelectionPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Location location) {
        invoke2(location);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Location currentLocation) {
        LocationSelectionUi locationSelectionUi;
        double d;
        locationSelectionUi = this.this$0.f61616ui;
        Intrinsics.checkNotNullExpressionValue(currentLocation, "currentLocation");
        WireLocation location$default = WireLocationKt.toLocation$default(currentLocation, null, 1, null);
        d = this.this$0.createRadius;
        locationSelectionUi.setCurrentLocation(location$default, d);
    }
}
