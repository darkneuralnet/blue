package co.bird.android.model;

import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/K;", "Lco/bird/android/model/VehicleConnection;", "kotlin.jvm.PlatformType", "invoke", "([B)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdVehicleConnection$deepSleep$1 extends Lambda implements Function1<byte[], InterfaceC23447K<? extends VehicleConnection>> {
    final /* synthetic */ BirdVehicleConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdVehicleConnection$deepSleep$1(BirdVehicleConnection birdVehicleConnection) {
        super(1);
        this.this$0 = birdVehicleConnection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r3[1] == 49) goto L5;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC23447K<? extends VehicleConnection> invoke(byte[] result) {
        AbstractC23442F m33100x;
        String str;
        Intrinsics.checkNotNullParameter(result, "result");
        boolean z = result.length == 2;
        if (z) {
            m33100x = AbstractC23442F.m33158H(this.this$0);
            str = "just(this)";
        } else {
            m33100x = AbstractC23442F.m33100x(new Throwable("Could not wake up vehicle, bluetooth write failed."));
            str = "error(Throwable(\"Could n…luetooth write failed.\"))";
        }
        Intrinsics.checkNotNullExpressionValue(m33100x, str);
        return m33100x;
    }
}
