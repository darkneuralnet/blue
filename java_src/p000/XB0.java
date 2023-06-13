package p000;

import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.api.request.VehicleInventoryScanRequest;
import co.bird.api.response.VehicleInventoryScanResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LXB0;", "LWB0;", "", "", "vehicleIds", "Lco/bird/android/model/constant/VehicleInventoryAction;", "action", "", "validateOnly", "Lio/reactivex/F;", "Lco/bird/api/response/VehicleInventoryScanResponse;", "t0", "Lio/reactivex/c;", "clear", "LOB0;", C17296a.f69688o, "LOB0;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "<init>", "(LOB0;)V", "co.bird.android.repository.core-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XB0 */
/* loaded from: classes4.dex */
public final class XB0 implements WB0 {

    /* renamed from: a */
    public final OB0 f42768a;

    public XB0(OB0 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f42768a = client;
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
        return m33039p;
    }

    @Override // p000.WB0
    /* renamed from: t0 */
    public AbstractC23442F<VehicleInventoryScanResponse> mo77245t0(List<String> vehicleIds, VehicleInventoryAction action, boolean z) {
        Intrinsics.checkNotNullParameter(vehicleIds, "vehicleIds");
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f42768a.m92640a(new VehicleInventoryScanRequest(vehicleIds, action, z));
    }
}
