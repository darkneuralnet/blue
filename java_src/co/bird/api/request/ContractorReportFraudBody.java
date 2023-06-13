package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/api/request/ContractorReportFraudBody;", "", "birdId", "", Entry.TYPE_TEXT, "(Ljava/lang/String;Ljava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorReportFraudBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty(Entry.TYPE_TEXT)
    @InterfaceC41208ft5(Entry.TYPE_TEXT)
    private final String text;

    public ContractorReportFraudBody(String birdId, String str) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.birdId = birdId;
        this.text = str;
    }

    public static /* synthetic */ ContractorReportFraudBody copy$default(ContractorReportFraudBody contractorReportFraudBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractorReportFraudBody.birdId;
        }
        if ((i & 2) != 0) {
            str2 = contractorReportFraudBody.text;
        }
        return contractorReportFraudBody.copy(str, str2);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.text;
    }

    public final ContractorReportFraudBody copy(String birdId, String str) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new ContractorReportFraudBody(birdId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractorReportFraudBody) {
            ContractorReportFraudBody contractorReportFraudBody = (ContractorReportFraudBody) obj;
            return Intrinsics.areEqual(this.birdId, contractorReportFraudBody.birdId) && Intrinsics.areEqual(this.text, contractorReportFraudBody.text);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.birdId.hashCode() * 31;
        String str = this.text;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.text;
        return "ContractorReportFraudBody(birdId=" + str + ", text=" + str2 + ")";
    }

    public /* synthetic */ ContractorReportFraudBody(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
