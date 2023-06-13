package co.bird.android.app.feature.map.presenter;

import android.location.Address;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "addressList", "", "Landroid/location/Address;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLocationSelectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationSelectionPresenter.kt\nco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n1#2:225\n*E\n"})
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl$observeDone$3 extends Lambda implements Function1<List<? extends Address>, String> {
    final /* synthetic */ LocationSelectionPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionPresenterImpl$observeDone$3(LocationSelectionPresenterImpl locationSelectionPresenterImpl) {
        super(1);
        this.this$0 = locationSelectionPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(List<? extends Address> addressList) {
        LocationSelectionUi locationSelectionUi;
        Intrinsics.checkNotNullParameter(addressList, "addressList");
        String m109850a = C32472Dr4.m109850a(addressList);
        if (m109850a.length() == 0) {
            m109850a = null;
        }
        if (m109850a == null) {
            locationSelectionUi = this.this$0.f61616ui;
            return locationSelectionUi.getAddress();
        }
        return m109850a;
    }
}
