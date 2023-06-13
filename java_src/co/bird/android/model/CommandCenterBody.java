package co.bird.android.model;

import co.bird.android.model.constant.ServiceCenterStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003JU\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/CommandCenterBody;", "", "damageTracks", "", "Lco/bird/android/model/DamageTrack;", "serviceCenterDetails", "Lco/bird/android/model/Detail;", "details", "repairLogs", "Lco/bird/android/model/RepairLog;", "status", "Lco/bird/android/model/constant/ServiceCenterStatus;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/constant/ServiceCenterStatus;)V", "getDamageTracks", "()Ljava/util/List;", "getDetails", "getRepairLogs", "getServiceCenterDetails", "getStatus", "()Lco/bird/android/model/constant/ServiceCenterStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CommandCenterBody {
    @JsonProperty("damage_tracks")
    @InterfaceC41208ft5("damage_tracks")
    private final List<DamageTrack> damageTracks;
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final List<Detail> details;
    @JsonProperty("repair_logs")
    @InterfaceC41208ft5("repair_logs")
    private final List<RepairLog> repairLogs;
    @JsonProperty("service_center_details")
    @InterfaceC41208ft5("service_center_details")
    private final List<Detail> serviceCenterDetails;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final ServiceCenterStatus status;

    public CommandCenterBody() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CommandCenterBody copy$default(CommandCenterBody commandCenterBody, List list, List list2, List list3, List list4, ServiceCenterStatus serviceCenterStatus, int i, Object obj) {
        List<DamageTrack> list5 = list;
        if ((i & 1) != 0) {
            list5 = commandCenterBody.damageTracks;
        }
        List<Detail> list6 = list2;
        if ((i & 2) != 0) {
            list6 = commandCenterBody.serviceCenterDetails;
        }
        List list7 = list6;
        List<Detail> list8 = list3;
        if ((i & 4) != 0) {
            list8 = commandCenterBody.details;
        }
        List list9 = list8;
        List<RepairLog> list10 = list4;
        if ((i & 8) != 0) {
            list10 = commandCenterBody.repairLogs;
        }
        List list11 = list10;
        if ((i & 16) != 0) {
            serviceCenterStatus = commandCenterBody.status;
        }
        return commandCenterBody.copy(list5, list7, list9, list11, serviceCenterStatus);
    }

    public final List<DamageTrack> component1() {
        return this.damageTracks;
    }

    public final List<Detail> component2() {
        return this.serviceCenterDetails;
    }

    public final List<Detail> component3() {
        return this.details;
    }

    public final List<RepairLog> component4() {
        return this.repairLogs;
    }

    public final ServiceCenterStatus component5() {
        return this.status;
    }

    public final CommandCenterBody copy(List<DamageTrack> damageTracks, List<Detail> serviceCenterDetails, List<Detail> details, List<RepairLog> repairLogs, ServiceCenterStatus serviceCenterStatus) {
        Intrinsics.checkNotNullParameter(damageTracks, "damageTracks");
        Intrinsics.checkNotNullParameter(serviceCenterDetails, "serviceCenterDetails");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(repairLogs, "repairLogs");
        return new CommandCenterBody(damageTracks, serviceCenterDetails, details, repairLogs, serviceCenterStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommandCenterBody) {
            CommandCenterBody commandCenterBody = (CommandCenterBody) obj;
            return Intrinsics.areEqual(this.damageTracks, commandCenterBody.damageTracks) && Intrinsics.areEqual(this.serviceCenterDetails, commandCenterBody.serviceCenterDetails) && Intrinsics.areEqual(this.details, commandCenterBody.details) && Intrinsics.areEqual(this.repairLogs, commandCenterBody.repairLogs) && this.status == commandCenterBody.status;
        }
        return false;
    }

    public final List<DamageTrack> getDamageTracks() {
        return this.damageTracks;
    }

    public final List<Detail> getDetails() {
        return this.details;
    }

    public final List<RepairLog> getRepairLogs() {
        return this.repairLogs;
    }

    public final List<Detail> getServiceCenterDetails() {
        return this.serviceCenterDetails;
    }

    public final ServiceCenterStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = ((((((this.damageTracks.hashCode() * 31) + this.serviceCenterDetails.hashCode()) * 31) + this.details.hashCode()) * 31) + this.repairLogs.hashCode()) * 31;
        ServiceCenterStatus serviceCenterStatus = this.status;
        return hashCode + (serviceCenterStatus == null ? 0 : serviceCenterStatus.hashCode());
    }

    public String toString() {
        List<DamageTrack> list = this.damageTracks;
        List<Detail> list2 = this.serviceCenterDetails;
        List<Detail> list3 = this.details;
        List<RepairLog> list4 = this.repairLogs;
        ServiceCenterStatus serviceCenterStatus = this.status;
        return "CommandCenterBody(damageTracks=" + list + ", serviceCenterDetails=" + list2 + ", details=" + list3 + ", repairLogs=" + list4 + ", status=" + serviceCenterStatus + ")";
    }

    public CommandCenterBody(List<DamageTrack> damageTracks, List<Detail> serviceCenterDetails, List<Detail> details, List<RepairLog> repairLogs, ServiceCenterStatus serviceCenterStatus) {
        Intrinsics.checkNotNullParameter(damageTracks, "damageTracks");
        Intrinsics.checkNotNullParameter(serviceCenterDetails, "serviceCenterDetails");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(repairLogs, "repairLogs");
        this.damageTracks = damageTracks;
        this.serviceCenterDetails = serviceCenterDetails;
        this.details = details;
        this.repairLogs = repairLogs;
        this.status = serviceCenterStatus;
    }

    public /* synthetic */ CommandCenterBody(List list, List list2, List list3, List list4, ServiceCenterStatus serviceCenterStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i & 16) != 0 ? null : serviceCenterStatus);
    }
}
