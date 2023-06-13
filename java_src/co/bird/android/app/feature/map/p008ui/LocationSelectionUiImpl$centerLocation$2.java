package co.bird.android.app.feature.map.p008ui;

import io.reactivex.InterfaceC23434B;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl$centerLocation$2 */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImpl$centerLocation$2 extends Lambda implements Function1<ReactiveMapEvent, InterfaceC23434B<? extends Unit>> {
    public static final LocationSelectionUiImpl$centerLocation$2 INSTANCE = new LocationSelectionUiImpl$centerLocation$2();

    public LocationSelectionUiImpl$centerLocation$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23434B<? extends Unit> invoke(ReactiveMapEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.cameraIdles();
    }
}
