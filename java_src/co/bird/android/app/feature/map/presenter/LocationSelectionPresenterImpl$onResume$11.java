package co.bird.android.app.feature.map.presenter;

import android.location.Address;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.model.wire.WireLocation;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/location/Address;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl$onResume$11 extends Lambda implements Function1<Address, Unit> {
    final /* synthetic */ LocationSelectionPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionPresenterImpl$onResume$11(LocationSelectionPresenterImpl locationSelectionPresenterImpl) {
        super(1);
        this.this$0 = locationSelectionPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Address address) {
        invoke2(address);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Address address) {
        C0058AG c0058ag;
        List listOf;
        LocationSelectionUi locationSelectionUi;
        c0058ag = this.this$0.completeAddress;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(address);
        c0058ag.accept(C32472Dr4.m109850a(listOf));
        locationSelectionUi = this.this$0.f61616ui;
        locationSelectionUi.setLocation(new WireLocation(address.getLatitude(), address.getLongitude(), null, null, null, null, false, null, null, 508, null), true, true);
    }
}
