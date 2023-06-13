package p000;

import co.bird.android.model.wire.WireVehicleDiagnostics;
import co.bird.api.request.BluetoothHealthCheckRequestBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lul6;", "Ltl6;", "", "birdId", "imei", "iccid", "stmVersion", "vehicleFault", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireVehicleDiagnostics;", C17296a.f69688o, "Lsl6;", "Lsl6;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "<init>", "(Lsl6;)V", "vehiclediagnostics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ul6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50023ul6 implements InterfaceC49430tl6 {

    /* renamed from: a */
    public final InterfaceC48837sl6 f112882a;

    public C50023ul6(InterfaceC48837sl6 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f112882a = client;
    }

    @Override // p000.InterfaceC49430tl6
    /* renamed from: a */
    public AbstractC23442F<WireVehicleDiagnostics> mo9799a(String birdId, String str, String str2, String str3, String vehicleFault) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(vehicleFault, "vehicleFault");
        return this.f112882a.m13704a(new BluetoothHealthCheckRequestBody(birdId, str, str2, str3, vehicleFault));
    }
}
