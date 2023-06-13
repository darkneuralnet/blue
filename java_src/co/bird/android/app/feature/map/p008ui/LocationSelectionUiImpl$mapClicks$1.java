package co.bird.android.app.feature.map.p008ui;

import io.reactivex.InterfaceC23434B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LcD1;", "it", "Lio/reactivex/B;", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "kotlin.jvm.PlatformType", "invoke", "(LcD1;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl$mapClicks$1 */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImpl$mapClicks$1 extends Lambda implements Function1<C39011cD1, InterfaceC23434B<? extends ReactiveMapEvent>> {
    final /* synthetic */ LocationSelectionUiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionUiImpl$mapClicks$1(LocationSelectionUiImpl locationSelectionUiImpl) {
        super(1);
        this.this$0 = locationSelectionUiImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23434B<? extends ReactiveMapEvent> invoke(C39011cD1 it) {
        C0058AG c0058ag;
        Intrinsics.checkNotNullParameter(it, "it");
        c0058ag = this.this$0.reactiveMapEventRelay;
        return c0058ag;
    }
}
