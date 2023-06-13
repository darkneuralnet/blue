package co.bird.android.app.feature.map.presenter;

import android.location.Address;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Landroid/location/Address;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl$onResume$9 extends Lambda implements Function1<List<? extends Address>, Boolean> {
    public static final LocationSelectionPresenterImpl$onResume$9 INSTANCE = new LocationSelectionPresenterImpl$onResume$9();

    public LocationSelectionPresenterImpl$onResume$9() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<? extends Address> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isEmpty());
    }
}
