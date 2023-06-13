package co.bird.android.model;

import co.bird.android.model.VehicleConnection;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.InterfaceC23496h;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", MessageExtension.FIELD_DATA, "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "([B)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdBikeVehicleConnection$writeData$1 extends Lambda implements Function1<byte[], InterfaceC23496h> {
    final /* synthetic */ UUID $characteristicUuid;
    final /* synthetic */ BirdBikeVehicleConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdBikeVehicleConnection$writeData$1(BirdBikeVehicleConnection birdBikeVehicleConnection, UUID uuid) {
        super(1);
        this.this$0 = birdBikeVehicleConnection;
        this.$characteristicUuid = uuid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23496h invoke(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        List<String> hex = this.this$0.toHex(data);
        C41318g46.m40163a("received encrypted data from server to send via BLE " + hex, new Object[0]);
        return VehicleConnection.DefaultImpls.writeData(this.this$0, data, this.$characteristicUuid);
    }
}
