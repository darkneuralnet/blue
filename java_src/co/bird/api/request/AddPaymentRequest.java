package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PaymentGatewayKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m28432d2 = {"Lco/bird/api/request/AddPaymentRequest;", "", "userId", "", "actionPayload", "", "gatewayKind", "Lco/bird/android/model/constant/PaymentGatewayKind;", "makeDefault", "", "(Ljava/lang/String;Ljava/util/Map;Lco/bird/android/model/constant/PaymentGatewayKind;Z)V", "getActionPayload", "()Ljava/util/Map;", "getGatewayKind", "()Lco/bird/android/model/constant/PaymentGatewayKind;", "getMakeDefault", "()Z", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AddPaymentRequest {
    @InterfaceC41208ft5("payload")
    private final Map<String, String> actionPayload;
    @InterfaceC41208ft5("gateway_kind")
    private final PaymentGatewayKind gatewayKind;
    @InterfaceC41208ft5("make_default")
    private final boolean makeDefault;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public AddPaymentRequest(String userId, @JsonProperty("payload") Map<String, String> actionPayload, @JsonProperty("gateway_kind") PaymentGatewayKind gatewayKind, @JsonProperty("make_default") boolean z) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(actionPayload, "actionPayload");
        Intrinsics.checkNotNullParameter(gatewayKind, "gatewayKind");
        this.userId = userId;
        this.actionPayload = actionPayload;
        this.gatewayKind = gatewayKind;
        this.makeDefault = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddPaymentRequest copy$default(AddPaymentRequest addPaymentRequest, String str, Map map, PaymentGatewayKind paymentGatewayKind, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addPaymentRequest.userId;
        }
        if ((i & 2) != 0) {
            map = addPaymentRequest.actionPayload;
        }
        if ((i & 4) != 0) {
            paymentGatewayKind = addPaymentRequest.gatewayKind;
        }
        if ((i & 8) != 0) {
            z = addPaymentRequest.makeDefault;
        }
        return addPaymentRequest.copy(str, map, paymentGatewayKind, z);
    }

    public final String component1() {
        return this.userId;
    }

    public final Map<String, String> component2() {
        return this.actionPayload;
    }

    public final PaymentGatewayKind component3() {
        return this.gatewayKind;
    }

    public final boolean component4() {
        return this.makeDefault;
    }

    public final AddPaymentRequest copy(String userId, @JsonProperty("payload") Map<String, String> actionPayload, @JsonProperty("gateway_kind") PaymentGatewayKind gatewayKind, @JsonProperty("make_default") boolean z) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(actionPayload, "actionPayload");
        Intrinsics.checkNotNullParameter(gatewayKind, "gatewayKind");
        return new AddPaymentRequest(userId, actionPayload, gatewayKind, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddPaymentRequest) {
            AddPaymentRequest addPaymentRequest = (AddPaymentRequest) obj;
            return Intrinsics.areEqual(this.userId, addPaymentRequest.userId) && Intrinsics.areEqual(this.actionPayload, addPaymentRequest.actionPayload) && this.gatewayKind == addPaymentRequest.gatewayKind && this.makeDefault == addPaymentRequest.makeDefault;
        }
        return false;
    }

    public final Map<String, String> getActionPayload() {
        return this.actionPayload;
    }

    public final PaymentGatewayKind getGatewayKind() {
        return this.gatewayKind;
    }

    public final boolean getMakeDefault() {
        return this.makeDefault;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.userId.hashCode() * 31) + this.actionPayload.hashCode()) * 31) + this.gatewayKind.hashCode()) * 31;
        boolean z = this.makeDefault;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.userId;
        Map<String, String> map = this.actionPayload;
        PaymentGatewayKind paymentGatewayKind = this.gatewayKind;
        boolean z = this.makeDefault;
        return "AddPaymentRequest(userId=" + str + ", actionPayload=" + map + ", gatewayKind=" + paymentGatewayKind + ", makeDefault=" + z + ")";
    }

    public /* synthetic */ AddPaymentRequest(String str, Map map, PaymentGatewayKind paymentGatewayKind, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, paymentGatewayKind, (i & 8) != 0 ? true : z);
    }
}
