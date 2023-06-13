package co.bird.android.model;

import io.reactivex.InterfaceC23496h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "count", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdAirVehicleConnection$firmwareInquiry$1 extends Lambda implements Function1<Long, InterfaceC23496h> {
    final /* synthetic */ BirdAirVehicleConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdAirVehicleConnection$firmwareInquiry$1(BirdAirVehicleConnection birdAirVehicleConnection) {
        super(1);
        this.this$0 = birdAirVehicleConnection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23496h invoke(Long count) {
        byte[] data;
        Intrinsics.checkNotNullParameter(count, "count");
        if (count.longValue() == 0) {
            data = Command.BIRD_AIR_DASH_FIRMWARE_VERSION_INQUIRY.getData();
        } else {
            data = Command.BIRD_AIR_PCM_FIRMWARE_VERSION_INQUIRY.getData();
        }
        return this.this$0.writeData(data, GattUuid.BIRD_AIR_COMMAND_UUID.getUuid());
    }
}
