package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.model.LocationSelectionModel;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Lco/bird/android/model/LocationSelectionModel;", "kotlin.jvm.PlatformType", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl$observeDone$4 extends Lambda implements Function1<String, LocationSelectionModel> {
    final /* synthetic */ LocationSelectionPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionPresenterImpl$observeDone$4(LocationSelectionPresenterImpl locationSelectionPresenterImpl) {
        super(1);
        this.this$0 = locationSelectionPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final LocationSelectionModel invoke(String address) {
        LocationSelectionUi locationSelectionUi;
        Intrinsics.checkNotNullParameter(address, "address");
        locationSelectionUi = this.this$0.f61616ui;
        return new LocationSelectionModel(locationSelectionUi.getLocation(), address);
    }
}
