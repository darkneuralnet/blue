package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireUserGuest;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J+\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/request/AgreementAgreeBody;", "", "agreementIds", "", "", "userGuests", "Lco/bird/android/model/wire/WireUserGuest;", "(Ljava/util/List;Ljava/util/List;)V", "getAgreementIds", "()Ljava/util/List;", "getUserGuests", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AgreementAgreeBody {
    @JsonProperty("agreement_content_ids")
    @InterfaceC41208ft5("agreement_content_ids")
    private final List<String> agreementIds;
    @JsonProperty("user_guests")
    @InterfaceC41208ft5("user_guests")
    private final List<WireUserGuest> userGuests;

    public AgreementAgreeBody(List<String> agreementIds, List<WireUserGuest> list) {
        Intrinsics.checkNotNullParameter(agreementIds, "agreementIds");
        this.agreementIds = agreementIds;
        this.userGuests = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgreementAgreeBody copy$default(AgreementAgreeBody agreementAgreeBody, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = agreementAgreeBody.agreementIds;
        }
        if ((i & 2) != 0) {
            list2 = agreementAgreeBody.userGuests;
        }
        return agreementAgreeBody.copy(list, list2);
    }

    public final List<String> component1() {
        return this.agreementIds;
    }

    public final List<WireUserGuest> component2() {
        return this.userGuests;
    }

    public final AgreementAgreeBody copy(List<String> agreementIds, List<WireUserGuest> list) {
        Intrinsics.checkNotNullParameter(agreementIds, "agreementIds");
        return new AgreementAgreeBody(agreementIds, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AgreementAgreeBody) {
            AgreementAgreeBody agreementAgreeBody = (AgreementAgreeBody) obj;
            return Intrinsics.areEqual(this.agreementIds, agreementAgreeBody.agreementIds) && Intrinsics.areEqual(this.userGuests, agreementAgreeBody.userGuests);
        }
        return false;
    }

    public final List<String> getAgreementIds() {
        return this.agreementIds;
    }

    public final List<WireUserGuest> getUserGuests() {
        return this.userGuests;
    }

    public int hashCode() {
        int hashCode = this.agreementIds.hashCode() * 31;
        List<WireUserGuest> list = this.userGuests;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        List<String> list = this.agreementIds;
        List<WireUserGuest> list2 = this.userGuests;
        return "AgreementAgreeBody(agreementIds=" + list + ", userGuests=" + list2 + ")";
    }

    public /* synthetic */ AgreementAgreeBody(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
