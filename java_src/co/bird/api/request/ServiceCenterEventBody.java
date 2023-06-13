package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ServiceCenterStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, m28432d2 = {"Lco/bird/api/request/ServiceCenterEventBody;", "", "status", "Lco/bird/android/model/constant/ServiceCenterStatus;", "birdId", "", "nestId", "warehouseId", "birdModel", "notes", "(Lco/bird/android/model/constant/ServiceCenterStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getBirdModel", "getNestId", "getNotes", "getStatus", "()Lco/bird/android/model/constant/ServiceCenterStatus;", "getWarehouseId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ServiceCenterEventBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("bird_model")
    @InterfaceC41208ft5("bird_model")
    private final String birdModel;
    @JsonProperty("nest_id")
    @InterfaceC41208ft5("nest_id")
    private final String nestId;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final ServiceCenterStatus status;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    public ServiceCenterEventBody(ServiceCenterStatus status, String birdId, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.status = status;
        this.birdId = birdId;
        this.nestId = str;
        this.warehouseId = str2;
        this.birdModel = str3;
        this.notes = str4;
    }

    public static /* synthetic */ ServiceCenterEventBody copy$default(ServiceCenterEventBody serviceCenterEventBody, ServiceCenterStatus serviceCenterStatus, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            serviceCenterStatus = serviceCenterEventBody.status;
        }
        if ((i & 2) != 0) {
            str = serviceCenterEventBody.birdId;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = serviceCenterEventBody.nestId;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = serviceCenterEventBody.warehouseId;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = serviceCenterEventBody.birdModel;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = serviceCenterEventBody.notes;
        }
        return serviceCenterEventBody.copy(serviceCenterStatus, str6, str7, str8, str9, str5);
    }

    public final ServiceCenterStatus component1() {
        return this.status;
    }

    public final String component2() {
        return this.birdId;
    }

    public final String component3() {
        return this.nestId;
    }

    public final String component4() {
        return this.warehouseId;
    }

    public final String component5() {
        return this.birdModel;
    }

    public final String component6() {
        return this.notes;
    }

    public final ServiceCenterEventBody copy(ServiceCenterStatus status, String birdId, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new ServiceCenterEventBody(status, birdId, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ServiceCenterEventBody) {
            ServiceCenterEventBody serviceCenterEventBody = (ServiceCenterEventBody) obj;
            return this.status == serviceCenterEventBody.status && Intrinsics.areEqual(this.birdId, serviceCenterEventBody.birdId) && Intrinsics.areEqual(this.nestId, serviceCenterEventBody.nestId) && Intrinsics.areEqual(this.warehouseId, serviceCenterEventBody.warehouseId) && Intrinsics.areEqual(this.birdModel, serviceCenterEventBody.birdModel) && Intrinsics.areEqual(this.notes, serviceCenterEventBody.notes);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getBirdModel() {
        return this.birdModel;
    }

    public final String getNestId() {
        return this.nestId;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final ServiceCenterStatus getStatus() {
        return this.status;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        int hashCode = ((this.status.hashCode() * 31) + this.birdId.hashCode()) * 31;
        String str = this.nestId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.warehouseId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birdModel;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.notes;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        ServiceCenterStatus serviceCenterStatus = this.status;
        String str = this.birdId;
        String str2 = this.nestId;
        String str3 = this.warehouseId;
        String str4 = this.birdModel;
        String str5 = this.notes;
        return "ServiceCenterEventBody(status=" + serviceCenterStatus + ", birdId=" + str + ", nestId=" + str2 + ", warehouseId=" + str3 + ", birdModel=" + str4 + ", notes=" + str5 + ")";
    }

    public /* synthetic */ ServiceCenterEventBody(ServiceCenterStatus serviceCenterStatus, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serviceCenterStatus, str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
