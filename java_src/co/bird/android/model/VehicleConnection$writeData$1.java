package co.bird.android.model;

import co.bird.android.model.VehicleConnection;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class VehicleConnection$writeData$1 extends Lambda implements Function1<Long, InterfaceC23447K<? extends byte[]>> {
    final /* synthetic */ UUID $characteristicUuid;
    final /* synthetic */ byte[] $data;
    final /* synthetic */ Ref.IntRef $dataIndex;
    final /* synthetic */ Ref.IntRef $writeLength;
    final /* synthetic */ VehicleConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleConnection$writeData$1(VehicleConnection vehicleConnection, byte[] bArr, Ref.IntRef intRef, Ref.IntRef intRef2, UUID uuid) {
        super(1);
        this.this$0 = vehicleConnection;
        this.$data = bArr;
        this.$dataIndex = intRef;
        this.$writeLength = intRef2;
        this.$characteristicUuid = uuid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23447K<? extends byte[]> invoke(Long it) {
        byte[] subBytes;
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(it, "it");
        subBytes = VehicleConnection.DefaultImpls.subBytes(this.this$0, this.$data, this.$dataIndex.element, this.$writeLength.element);
        AbstractC23442F<byte[]> mo27056c = this.this$0.getRxBleConnection().mo27056c(this.$characteristicUuid, subBytes);
        List<String> hex = this.this$0.toHex(subBytes);
        C41318g46.m40163a("writing chunk: " + hex, new Object[0]);
        Ref.IntRef intRef = this.$dataIndex;
        int i = intRef.element;
        Ref.IntRef intRef2 = this.$writeLength;
        int i2 = i + intRef2.element;
        intRef.element = i2;
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(this.$data.length - i2, 16);
        intRef2.element = coerceAtMost;
        return mo27056c;
    }
}
