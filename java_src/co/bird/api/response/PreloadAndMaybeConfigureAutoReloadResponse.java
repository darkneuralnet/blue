package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.api.request.PaymentAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;", "Lco/bird/api/response/WirePaymentActionRequiredResponse;", "action", "Lco/bird/api/request/PaymentAction;", "(Lco/bird/api/request/PaymentAction;)V", "getAction", "()Lco/bird/api/request/PaymentAction;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PreloadAndMaybeConfigureAutoReloadResponse implements WirePaymentActionRequiredResponse {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final PaymentAction action;

    public PreloadAndMaybeConfigureAutoReloadResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ PreloadAndMaybeConfigureAutoReloadResponse copy$default(PreloadAndMaybeConfigureAutoReloadResponse preloadAndMaybeConfigureAutoReloadResponse, PaymentAction paymentAction, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentAction = preloadAndMaybeConfigureAutoReloadResponse.action;
        }
        return preloadAndMaybeConfigureAutoReloadResponse.copy(paymentAction);
    }

    public final PaymentAction component1() {
        return this.action;
    }

    public final PreloadAndMaybeConfigureAutoReloadResponse copy(PaymentAction paymentAction) {
        return new PreloadAndMaybeConfigureAutoReloadResponse(paymentAction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreloadAndMaybeConfigureAutoReloadResponse) && Intrinsics.areEqual(this.action, ((PreloadAndMaybeConfigureAutoReloadResponse) obj).action);
    }

    @Override // co.bird.api.response.WirePaymentActionRequiredResponse
    public PaymentAction getAction() {
        return this.action;
    }

    public int hashCode() {
        PaymentAction paymentAction = this.action;
        if (paymentAction == null) {
            return 0;
        }
        return paymentAction.hashCode();
    }

    public String toString() {
        PaymentAction paymentAction = this.action;
        return "PreloadAndMaybeConfigureAutoReloadResponse(action=" + paymentAction + ")";
    }

    public PreloadAndMaybeConfigureAutoReloadResponse(PaymentAction paymentAction) {
        this.action = paymentAction;
    }

    public /* synthetic */ PreloadAndMaybeConfigureAutoReloadResponse(PaymentAction paymentAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentAction);
    }
}
