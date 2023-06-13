package co.bird.android.app.feature.map.presenter;

import android.location.Address;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Landroid/location/Address;", "kotlin.jvm.PlatformType", "addressList", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl$onResume$10 extends Lambda implements Function1<List<? extends Address>, Address> {
    public static final LocationSelectionPresenterImpl$onResume$10 INSTANCE = new LocationSelectionPresenterImpl$onResume$10();

    public LocationSelectionPresenterImpl$onResume$10() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Address invoke(List<? extends Address> addressList) {
        Object first;
        Intrinsics.checkNotNullParameter(addressList, "addressList");
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) addressList);
        return (Address) first;
    }
}
