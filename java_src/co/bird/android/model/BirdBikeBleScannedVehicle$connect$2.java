package co.bird.android.model;

import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "connection", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Lke5;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdBikeBleScannedVehicle$connect$2 extends Lambda implements Function1<InterfaceC44023ke5, InterfaceC23434B<? extends InterfaceC44023ke5>> {
    final /* synthetic */ BirdBikeBleScannedVehicle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdBikeBleScannedVehicle$connect$2(BirdBikeBleScannedVehicle birdBikeBleScannedVehicle) {
        super(1);
        this.this$0 = birdBikeBleScannedVehicle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23434B<? extends InterfaceC44023ke5> invoke(InterfaceC44023ke5 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (this.this$0.isEMEABike()) {
            C41318g46.m40163a("detected EMEA (C5/C6) bird bike", new Object[0]);
        } else {
            C41318g46.m40163a("detected US (C1/C2) bird bike", new Object[0]);
        }
        return Observable.just(connection);
    }
}