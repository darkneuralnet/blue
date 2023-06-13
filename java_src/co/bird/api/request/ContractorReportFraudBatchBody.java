package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/request/ContractorReportFraudBatchBody;", "", "birdIds", "", "", Entry.TYPE_TEXT, "(Ljava/util/List;Ljava/lang/String;)V", "getBirdIds", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorReportFraudBatchBody {
    @JsonProperty("bird_ids")
    @InterfaceC41208ft5("bird_ids")
    private final List<String> birdIds;
    @JsonProperty(Entry.TYPE_TEXT)
    @InterfaceC41208ft5(Entry.TYPE_TEXT)
    private final String text;

    public ContractorReportFraudBatchBody(List<String> birdIds, String str) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        this.birdIds = birdIds;
        this.text = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContractorReportFraudBatchBody copy$default(ContractorReportFraudBatchBody contractorReportFraudBatchBody, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = contractorReportFraudBatchBody.birdIds;
        }
        if ((i & 2) != 0) {
            str = contractorReportFraudBatchBody.text;
        }
        return contractorReportFraudBatchBody.copy(list, str);
    }

    public final List<String> component1() {
        return this.birdIds;
    }

    public final String component2() {
        return this.text;
    }

    public final ContractorReportFraudBatchBody copy(List<String> birdIds, String str) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        return new ContractorReportFraudBatchBody(birdIds, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractorReportFraudBatchBody) {
            ContractorReportFraudBatchBody contractorReportFraudBatchBody = (ContractorReportFraudBatchBody) obj;
            return Intrinsics.areEqual(this.birdIds, contractorReportFraudBatchBody.birdIds) && Intrinsics.areEqual(this.text, contractorReportFraudBatchBody.text);
        }
        return false;
    }

    public final List<String> getBirdIds() {
        return this.birdIds;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.birdIds.hashCode() * 31;
        String str = this.text;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<String> list = this.birdIds;
        String str = this.text;
        return "ContractorReportFraudBatchBody(birdIds=" + list + ", text=" + str + ")";
    }

    public /* synthetic */ ContractorReportFraudBatchBody(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
