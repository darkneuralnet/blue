package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.contractor.ContractorDataField;
import co.bird.android.model.contractor.ContractorOnboardData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/ContractorOnboardDataResponse;", "", MessageExtension.FIELD_DATA, "", "Lco/bird/android/model/contractor/ContractorOnboardData;", "fields", "Lco/bird/android/model/contractor/ContractorDataField;", "(Ljava/util/List;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getFields", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorOnboardDataResponse {
    @JsonProperty(MessageExtension.FIELD_DATA)
    @InterfaceC41208ft5(MessageExtension.FIELD_DATA)
    private final List<ContractorOnboardData> data;
    @JsonProperty("fields")
    @InterfaceC41208ft5("fields")
    private final List<ContractorDataField> fields;

    public ContractorOnboardDataResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContractorOnboardDataResponse copy$default(ContractorOnboardDataResponse contractorOnboardDataResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = contractorOnboardDataResponse.data;
        }
        if ((i & 2) != 0) {
            list2 = contractorOnboardDataResponse.fields;
        }
        return contractorOnboardDataResponse.copy(list, list2);
    }

    public final List<ContractorOnboardData> component1() {
        return this.data;
    }

    public final List<ContractorDataField> component2() {
        return this.fields;
    }

    public final ContractorOnboardDataResponse copy(List<ContractorOnboardData> data, List<ContractorDataField> fields) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new ContractorOnboardDataResponse(data, fields);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractorOnboardDataResponse) {
            ContractorOnboardDataResponse contractorOnboardDataResponse = (ContractorOnboardDataResponse) obj;
            return Intrinsics.areEqual(this.data, contractorOnboardDataResponse.data) && Intrinsics.areEqual(this.fields, contractorOnboardDataResponse.fields);
        }
        return false;
    }

    public final List<ContractorOnboardData> getData() {
        return this.data;
    }

    public final List<ContractorDataField> getFields() {
        return this.fields;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.fields.hashCode();
    }

    public String toString() {
        List<ContractorOnboardData> list = this.data;
        List<ContractorDataField> list2 = this.fields;
        return "ContractorOnboardDataResponse(data=" + list + ", fields=" + list2 + ")";
    }

    public ContractorOnboardDataResponse(List<ContractorOnboardData> data, List<ContractorDataField> fields) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.data = data;
        this.fields = fields;
    }

    public /* synthetic */ ContractorOnboardDataResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
