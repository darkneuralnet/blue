package co.bird.api.request;

import co.bird.android.model.ContractorLevel;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m28432d2 = {"Lco/bird/api/request/ContractorNextOnboardStepBody;", "", "rootFieldId", "", "fields", "", "country", "contractorLevel", "Lco/bird/android/model/ContractorLevel;", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lco/bird/android/model/ContractorLevel;)V", "getContractorLevel", "()Lco/bird/android/model/ContractorLevel;", "getCountry", "()Ljava/lang/String;", "getFields", "()Ljava/util/Map;", "getRootFieldId", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorNextOnboardStepBody {
    @JsonProperty("contractor_level")
    @InterfaceC41208ft5("contractor_level")
    private final ContractorLevel contractorLevel;
    @JsonProperty("country")
    @InterfaceC41208ft5("country")
    private final String country;
    @JsonProperty("fields")
    @InterfaceC41208ft5("fields")
    private final Map<String, String> fields;
    @JsonProperty("root_field_id")
    @InterfaceC41208ft5("root_field_id")
    private final String rootFieldId;

    public ContractorNextOnboardStepBody(String str, Map<String, String> fields, String country, ContractorLevel contractorLevel) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(country, "country");
        this.rootFieldId = str;
        this.fields = fields;
        this.country = country;
        this.contractorLevel = contractorLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContractorNextOnboardStepBody copy$default(ContractorNextOnboardStepBody contractorNextOnboardStepBody, String str, Map map, String str2, ContractorLevel contractorLevel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractorNextOnboardStepBody.rootFieldId;
        }
        if ((i & 2) != 0) {
            map = contractorNextOnboardStepBody.fields;
        }
        if ((i & 4) != 0) {
            str2 = contractorNextOnboardStepBody.country;
        }
        if ((i & 8) != 0) {
            contractorLevel = contractorNextOnboardStepBody.contractorLevel;
        }
        return contractorNextOnboardStepBody.copy(str, map, str2, contractorLevel);
    }

    public final String component1() {
        return this.rootFieldId;
    }

    public final Map<String, String> component2() {
        return this.fields;
    }

    public final String component3() {
        return this.country;
    }

    public final ContractorLevel component4() {
        return this.contractorLevel;
    }

    public final ContractorNextOnboardStepBody copy(String str, Map<String, String> fields, String country, ContractorLevel contractorLevel) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(country, "country");
        return new ContractorNextOnboardStepBody(str, fields, country, contractorLevel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractorNextOnboardStepBody) {
            ContractorNextOnboardStepBody contractorNextOnboardStepBody = (ContractorNextOnboardStepBody) obj;
            return Intrinsics.areEqual(this.rootFieldId, contractorNextOnboardStepBody.rootFieldId) && Intrinsics.areEqual(this.fields, contractorNextOnboardStepBody.fields) && Intrinsics.areEqual(this.country, contractorNextOnboardStepBody.country) && this.contractorLevel == contractorNextOnboardStepBody.contractorLevel;
        }
        return false;
    }

    public final ContractorLevel getContractorLevel() {
        return this.contractorLevel;
    }

    public final String getCountry() {
        return this.country;
    }

    public final Map<String, String> getFields() {
        return this.fields;
    }

    public final String getRootFieldId() {
        return this.rootFieldId;
    }

    public int hashCode() {
        String str = this.rootFieldId;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.fields.hashCode()) * 31) + this.country.hashCode()) * 31;
        ContractorLevel contractorLevel = this.contractorLevel;
        return hashCode + (contractorLevel != null ? contractorLevel.hashCode() : 0);
    }

    public String toString() {
        String str = this.rootFieldId;
        Map<String, String> map = this.fields;
        String str2 = this.country;
        ContractorLevel contractorLevel = this.contractorLevel;
        return "ContractorNextOnboardStepBody(rootFieldId=" + str + ", fields=" + map + ", country=" + str2 + ", contractorLevel=" + contractorLevel + ")";
    }

    public /* synthetic */ ContractorNextOnboardStepBody(String str, Map map, String str2, ContractorLevel contractorLevel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? MapsKt__MapsKt.emptyMap() : map, str2, contractorLevel);
    }
}
