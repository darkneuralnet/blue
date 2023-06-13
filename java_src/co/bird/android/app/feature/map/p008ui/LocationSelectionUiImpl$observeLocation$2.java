package co.bird.android.app.feature.map.p008ui;

import co.bird.android.app.feature.map.p008ui.LocationSelectionUiImpl;
import co.bird.android.model.wire.WireLocation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl$observeLocation$2 */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImpl$observeLocation$2 extends Lambda implements Function1<LocationSelectionUiImpl.LocationUpdate, WireLocation> {
    public static final LocationSelectionUiImpl$observeLocation$2 INSTANCE = new LocationSelectionUiImpl$observeLocation$2();

    public LocationSelectionUiImpl$observeLocation$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final WireLocation invoke(LocationSelectionUiImpl.LocationUpdate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getLocation();
    }
}
