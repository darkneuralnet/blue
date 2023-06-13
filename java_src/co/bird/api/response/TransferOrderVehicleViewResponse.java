package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.TransferOrderVehicleAcceptAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/response/TransferOrderVehicleViewResponse;", "", "acceptTitle", "", "acceptButtonTitle", "actions", "", "Lco/bird/android/model/constant/TransferOrderVehicleAcceptAction;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAcceptButtonTitle", "()Ljava/lang/String;", "getAcceptTitle", "getActions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TransferOrderVehicleViewResponse {
    @JsonProperty("accept_button_title")
    @InterfaceC41208ft5("accept_button_title")
    private final String acceptButtonTitle;
    @JsonProperty("accept_title")
    @InterfaceC41208ft5("accept_title")
    private final String acceptTitle;
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<TransferOrderVehicleAcceptAction> actions;

    public TransferOrderVehicleViewResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferOrderVehicleViewResponse copy$default(TransferOrderVehicleViewResponse transferOrderVehicleViewResponse, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferOrderVehicleViewResponse.acceptTitle;
        }
        if ((i & 2) != 0) {
            str2 = transferOrderVehicleViewResponse.acceptButtonTitle;
        }
        if ((i & 4) != 0) {
            list = transferOrderVehicleViewResponse.actions;
        }
        return transferOrderVehicleViewResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.acceptTitle;
    }

    public final String component2() {
        return this.acceptButtonTitle;
    }

    public final List<TransferOrderVehicleAcceptAction> component3() {
        return this.actions;
    }

    public final TransferOrderVehicleViewResponse copy(String str, String str2, List<? extends TransferOrderVehicleAcceptAction> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new TransferOrderVehicleViewResponse(str, str2, actions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransferOrderVehicleViewResponse) {
            TransferOrderVehicleViewResponse transferOrderVehicleViewResponse = (TransferOrderVehicleViewResponse) obj;
            return Intrinsics.areEqual(this.acceptTitle, transferOrderVehicleViewResponse.acceptTitle) && Intrinsics.areEqual(this.acceptButtonTitle, transferOrderVehicleViewResponse.acceptButtonTitle) && Intrinsics.areEqual(this.actions, transferOrderVehicleViewResponse.actions);
        }
        return false;
    }

    public final String getAcceptButtonTitle() {
        return this.acceptButtonTitle;
    }

    public final String getAcceptTitle() {
        return this.acceptTitle;
    }

    public final List<TransferOrderVehicleAcceptAction> getActions() {
        return this.actions;
    }

    public int hashCode() {
        String str = this.acceptTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acceptButtonTitle;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.actions.hashCode();
    }

    public String toString() {
        String str = this.acceptTitle;
        String str2 = this.acceptButtonTitle;
        List<TransferOrderVehicleAcceptAction> list = this.actions;
        return "TransferOrderVehicleViewResponse(acceptTitle=" + str + ", acceptButtonTitle=" + str2 + ", actions=" + list + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransferOrderVehicleViewResponse(String str, String str2, List<? extends TransferOrderVehicleAcceptAction> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.acceptTitle = str;
        this.acceptButtonTitle = str2;
        this.actions = actions;
    }

    public /* synthetic */ TransferOrderVehicleViewResponse(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
