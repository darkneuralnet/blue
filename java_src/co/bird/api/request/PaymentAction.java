package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PaymentActionKind;
import co.bird.android.model.constant.PaymentGatewayKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m28432d2 = {"Lco/bird/api/request/PaymentAction;", "", "actionKind", "Lco/bird/android/model/constant/PaymentActionKind;", "actionPayload", "", "", "gatewayKind", "Lco/bird/android/model/constant/PaymentGatewayKind;", "(Lco/bird/android/model/constant/PaymentActionKind;Ljava/util/Map;Lco/bird/android/model/constant/PaymentGatewayKind;)V", "getActionKind", "()Lco/bird/android/model/constant/PaymentActionKind;", "getActionPayload", "()Ljava/util/Map;", "getGatewayKind", "()Lco/bird/android/model/constant/PaymentGatewayKind;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PaymentAction {
    @InterfaceC41208ft5("action_kind")
    private final PaymentActionKind actionKind;
    @InterfaceC41208ft5("action_payload")
    private final Map<String, String> actionPayload;
    @InterfaceC41208ft5("gateway_kind")
    private final PaymentGatewayKind gatewayKind;

    public PaymentAction(@JsonProperty("action_kind") PaymentActionKind actionKind, @JsonProperty("action_payload") Map<String, String> actionPayload, @JsonProperty("gateway_kind") PaymentGatewayKind gatewayKind) {
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(actionPayload, "actionPayload");
        Intrinsics.checkNotNullParameter(gatewayKind, "gatewayKind");
        this.actionKind = actionKind;
        this.actionPayload = actionPayload;
        this.gatewayKind = gatewayKind;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentAction copy$default(PaymentAction paymentAction, PaymentActionKind paymentActionKind, Map map, PaymentGatewayKind paymentGatewayKind, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentActionKind = paymentAction.actionKind;
        }
        if ((i & 2) != 0) {
            map = paymentAction.actionPayload;
        }
        if ((i & 4) != 0) {
            paymentGatewayKind = paymentAction.gatewayKind;
        }
        return paymentAction.copy(paymentActionKind, map, paymentGatewayKind);
    }

    public final PaymentActionKind component1() {
        return this.actionKind;
    }

    public final Map<String, String> component2() {
        return this.actionPayload;
    }

    public final PaymentGatewayKind component3() {
        return this.gatewayKind;
    }

    public final PaymentAction copy(@JsonProperty("action_kind") PaymentActionKind actionKind, @JsonProperty("action_payload") Map<String, String> actionPayload, @JsonProperty("gateway_kind") PaymentGatewayKind gatewayKind) {
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(actionPayload, "actionPayload");
        Intrinsics.checkNotNullParameter(gatewayKind, "gatewayKind");
        return new PaymentAction(actionKind, actionPayload, gatewayKind);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentAction) {
            PaymentAction paymentAction = (PaymentAction) obj;
            return this.actionKind == paymentAction.actionKind && Intrinsics.areEqual(this.actionPayload, paymentAction.actionPayload) && this.gatewayKind == paymentAction.gatewayKind;
        }
        return false;
    }

    public final PaymentActionKind getActionKind() {
        return this.actionKind;
    }

    public final Map<String, String> getActionPayload() {
        return this.actionPayload;
    }

    public final PaymentGatewayKind getGatewayKind() {
        return this.gatewayKind;
    }

    public int hashCode() {
        return (((this.actionKind.hashCode() * 31) + this.actionPayload.hashCode()) * 31) + this.gatewayKind.hashCode();
    }

    public String toString() {
        PaymentActionKind paymentActionKind = this.actionKind;
        Map<String, String> map = this.actionPayload;
        PaymentGatewayKind paymentGatewayKind = this.gatewayKind;
        return "PaymentAction(actionKind=" + paymentActionKind + ", actionPayload=" + map + ", gatewayKind=" + paymentGatewayKind + ")";
    }
}
