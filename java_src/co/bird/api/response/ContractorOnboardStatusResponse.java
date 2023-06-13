package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/api/response/ContractorOnboardStatusResponse;", "", "version", "Lco/bird/api/response/ContractorOnboardRequired;", "(Lco/bird/api/response/ContractorOnboardRequired;)V", "getVersion", "()Lco/bird/api/response/ContractorOnboardRequired;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorOnboardStatusResponse {
    @JsonProperty("version")
    @InterfaceC41208ft5("version")
    private final ContractorOnboardRequired version;

    public ContractorOnboardStatusResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ ContractorOnboardStatusResponse copy$default(ContractorOnboardStatusResponse contractorOnboardStatusResponse, ContractorOnboardRequired contractorOnboardRequired, int i, Object obj) {
        if ((i & 1) != 0) {
            contractorOnboardRequired = contractorOnboardStatusResponse.version;
        }
        return contractorOnboardStatusResponse.copy(contractorOnboardRequired);
    }

    public final ContractorOnboardRequired component1() {
        return this.version;
    }

    public final ContractorOnboardStatusResponse copy(ContractorOnboardRequired contractorOnboardRequired) {
        return new ContractorOnboardStatusResponse(contractorOnboardRequired);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContractorOnboardStatusResponse) && this.version == ((ContractorOnboardStatusResponse) obj).version;
    }

    public final ContractorOnboardRequired getVersion() {
        return this.version;
    }

    public int hashCode() {
        ContractorOnboardRequired contractorOnboardRequired = this.version;
        if (contractorOnboardRequired == null) {
            return 0;
        }
        return contractorOnboardRequired.hashCode();
    }

    public String toString() {
        ContractorOnboardRequired contractorOnboardRequired = this.version;
        return "ContractorOnboardStatusResponse(version=" + contractorOnboardRequired + ")";
    }

    public ContractorOnboardStatusResponse(ContractorOnboardRequired contractorOnboardRequired) {
        this.version = contractorOnboardRequired;
    }

    public /* synthetic */ ContractorOnboardStatusResponse(ContractorOnboardRequired contractorOnboardRequired, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contractorOnboardRequired);
    }
}
