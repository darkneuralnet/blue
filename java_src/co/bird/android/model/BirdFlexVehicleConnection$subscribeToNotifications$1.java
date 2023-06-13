package co.bird.android.model;

import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/B;", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdFlexVehicleConnection$subscribeToNotifications$1 extends Lambda implements Function1<Observable<byte[]>, InterfaceC23434B<? extends byte[]>> {
    public static final BirdFlexVehicleConnection$subscribeToNotifications$1 INSTANCE = new BirdFlexVehicleConnection$subscribeToNotifications$1();

    public BirdFlexVehicleConnection$subscribeToNotifications$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23434B<? extends byte[]> invoke(Observable<byte[]> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }
}
