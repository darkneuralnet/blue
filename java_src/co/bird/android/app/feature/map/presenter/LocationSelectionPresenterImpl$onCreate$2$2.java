package co.bird.android.app.feature.map.presenter;

import android.location.Location;
import io.reactivex.InterfaceC23434B;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/location/Location;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Landroid/location/Location;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl$onCreate$2$2 extends Lambda implements Function1<Location, InterfaceC23434B<? extends String>> {
    final /* synthetic */ LocationSelectionPresenterImpl $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionPresenterImpl$onCreate$2$2(LocationSelectionPresenterImpl locationSelectionPresenterImpl) {
        super(1);
        this.$this_run = locationSelectionPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23434B<? extends String> invoke(Location it) {
        InterfaceC40001dr4 interfaceC40001dr4;
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC40001dr4 = this.$this_run.reactiveLocationManager;
        return interfaceC40001dr4.mo43614r(it.getLatitude(), it.getLongitude()).subscribeOn(C24542a.m31932c());
    }
}