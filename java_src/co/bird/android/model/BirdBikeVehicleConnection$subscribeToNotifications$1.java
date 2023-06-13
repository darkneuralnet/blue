package co.bird.android.model;

import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdBikeVehicleConnection$subscribeToNotifications$1 extends Lambda implements Function1<Observable<byte[]>, Unit> {
    public static final BirdBikeVehicleConnection$subscribeToNotifications$1 INSTANCE = new BirdBikeVehicleConnection$subscribeToNotifications$1();

    public BirdBikeVehicleConnection$subscribeToNotifications$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Observable<byte[]> observable) {
        invoke2(observable);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Observable<byte[]> observable) {
        C41318g46.m40163a("subscribed to notifications for bird bike char (I think) " + observable, new Object[0]);
    }
}
