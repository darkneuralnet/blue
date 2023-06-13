package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PartnerBirdState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m28432d2 = {"Lco/bird/api/response/OperatorBirdResponse;", "", "id", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "partnerBirdState", "Lco/bird/android/model/constant/PartnerBirdState;", "battery", "", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PartnerBirdState;I)V", "getBattery", "()I", "getCode", "()Ljava/lang/String;", "getId", "getPartnerBirdState", "()Lco/bird/android/model/constant/PartnerBirdState;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorBirdResponse {
    @JsonProperty("battery")
    @InterfaceC41208ft5("battery")
    private final int battery;
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68221id;
    @JsonProperty("partner_bird_state")
    @InterfaceC41208ft5("partner_bird_state")
    private final PartnerBirdState partnerBirdState;

    public OperatorBirdResponse() {
        this(null, null, null, 0, 15, null);
    }

    public static /* synthetic */ OperatorBirdResponse copy$default(OperatorBirdResponse operatorBirdResponse, String str, String str2, PartnerBirdState partnerBirdState, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = operatorBirdResponse.f68221id;
        }
        if ((i2 & 2) != 0) {
            str2 = operatorBirdResponse.code;
        }
        if ((i2 & 4) != 0) {
            partnerBirdState = operatorBirdResponse.partnerBirdState;
        }
        if ((i2 & 8) != 0) {
            i = operatorBirdResponse.battery;
        }
        return operatorBirdResponse.copy(str, str2, partnerBirdState, i);
    }

    public final String component1() {
        return this.f68221id;
    }

    public final String component2() {
        return this.code;
    }

    public final PartnerBirdState component3() {
        return this.partnerBirdState;
    }

    public final int component4() {
        return this.battery;
    }

    public final OperatorBirdResponse copy(String id, String code, PartnerBirdState partnerBirdState, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        return new OperatorBirdResponse(id, code, partnerBirdState, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorBirdResponse) {
            OperatorBirdResponse operatorBirdResponse = (OperatorBirdResponse) obj;
            return Intrinsics.areEqual(this.f68221id, operatorBirdResponse.f68221id) && Intrinsics.areEqual(this.code, operatorBirdResponse.code) && this.partnerBirdState == operatorBirdResponse.partnerBirdState && this.battery == operatorBirdResponse.battery;
        }
        return false;
    }

    public final int getBattery() {
        return this.battery;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getId() {
        return this.f68221id;
    }

    public final PartnerBirdState getPartnerBirdState() {
        return this.partnerBirdState;
    }

    public int hashCode() {
        int hashCode = ((this.f68221id.hashCode() * 31) + this.code.hashCode()) * 31;
        PartnerBirdState partnerBirdState = this.partnerBirdState;
        return ((hashCode + (partnerBirdState == null ? 0 : partnerBirdState.hashCode())) * 31) + Integer.hashCode(this.battery);
    }

    public String toString() {
        String str = this.f68221id;
        String str2 = this.code;
        PartnerBirdState partnerBirdState = this.partnerBirdState;
        int i = this.battery;
        return "OperatorBirdResponse(id=" + str + ", code=" + str2 + ", partnerBirdState=" + partnerBirdState + ", battery=" + i + ")";
    }

    public OperatorBirdResponse(String id, String code, PartnerBirdState partnerBirdState, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f68221id = id;
        this.code = code;
        this.partnerBirdState = partnerBirdState;
        this.battery = i;
    }

    public /* synthetic */ OperatorBirdResponse(String str, String str2, PartnerBirdState partnerBirdState, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : partnerBirdState, (i2 & 8) != 0 ? 0 : i);
    }
}
