package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "it", "Lco/bird/android/model/VehicleConnection;", "kotlin.jvm.PlatformType", "invoke", "(Lke5;)Lco/bird/android/model/VehicleConnection;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdFlexBleScannedVehicle$connect$1 extends Lambda implements Function1<InterfaceC44023ke5, VehicleConnection> {
    final /* synthetic */ BirdFlexBleScannedVehicle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdFlexBleScannedVehicle$connect$1(BirdFlexBleScannedVehicle birdFlexBleScannedVehicle) {
        super(1);
        this.this$0 = birdFlexBleScannedVehicle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final VehicleConnection invoke(InterfaceC44023ke5 it) {
        InterfaceC45802ne5 interfaceC45802ne5;
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC45802ne5 = this.this$0.rxBleDevice;
        return new BirdFlexVehicleConnection(it, interfaceC45802ne5, this.this$0.payloadEncryptor());
    }
}
