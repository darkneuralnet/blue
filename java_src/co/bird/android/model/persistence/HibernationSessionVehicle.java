package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.VehicleHibernationCategory;
import co.bird.android.model.persistence.nestedstructures.HibernationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/persistence/HibernationSessionVehicle;", "", "birdId", "", "category", "Lco/bird/android/model/constant/VehicleHibernationCategory;", "title", "retryMessage", "infoMessage", "Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;", "(Ljava/lang/String;Lco/bird/android/model/constant/VehicleHibernationCategory;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;)V", "getBirdId", "()Ljava/lang/String;", "getCategory", "()Lco/bird/android/model/constant/VehicleHibernationCategory;", "getInfoMessage", "()Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;", "getRetryMessage", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class HibernationSessionVehicle {
    private final String birdId;
    private final VehicleHibernationCategory category;
    private final HibernationMessage infoMessage;
    private final String retryMessage;
    private final String title;

    public HibernationSessionVehicle(String birdId, VehicleHibernationCategory category, String title, String str, HibernationMessage hibernationMessage) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(title, "title");
        this.birdId = birdId;
        this.category = category;
        this.title = title;
        this.retryMessage = str;
        this.infoMessage = hibernationMessage;
    }

    public static /* synthetic */ HibernationSessionVehicle copy$default(HibernationSessionVehicle hibernationSessionVehicle, String str, VehicleHibernationCategory vehicleHibernationCategory, String str2, String str3, HibernationMessage hibernationMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hibernationSessionVehicle.birdId;
        }
        if ((i & 2) != 0) {
            vehicleHibernationCategory = hibernationSessionVehicle.category;
        }
        VehicleHibernationCategory vehicleHibernationCategory2 = vehicleHibernationCategory;
        if ((i & 4) != 0) {
            str2 = hibernationSessionVehicle.title;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = hibernationSessionVehicle.retryMessage;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            hibernationMessage = hibernationSessionVehicle.infoMessage;
        }
        return hibernationSessionVehicle.copy(str, vehicleHibernationCategory2, str4, str5, hibernationMessage);
    }

    public final String component1() {
        return this.birdId;
    }

    public final VehicleHibernationCategory component2() {
        return this.category;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.retryMessage;
    }

    public final HibernationMessage component5() {
        return this.infoMessage;
    }

    public final HibernationSessionVehicle copy(String birdId, VehicleHibernationCategory category, String title, String str, HibernationMessage hibernationMessage) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(title, "title");
        return new HibernationSessionVehicle(birdId, category, title, str, hibernationMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HibernationSessionVehicle) {
            HibernationSessionVehicle hibernationSessionVehicle = (HibernationSessionVehicle) obj;
            return Intrinsics.areEqual(this.birdId, hibernationSessionVehicle.birdId) && this.category == hibernationSessionVehicle.category && Intrinsics.areEqual(this.title, hibernationSessionVehicle.title) && Intrinsics.areEqual(this.retryMessage, hibernationSessionVehicle.retryMessage) && Intrinsics.areEqual(this.infoMessage, hibernationSessionVehicle.infoMessage);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final VehicleHibernationCategory getCategory() {
        return this.category;
    }

    public final HibernationMessage getInfoMessage() {
        return this.infoMessage;
    }

    public final String getRetryMessage() {
        return this.retryMessage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((this.birdId.hashCode() * 31) + this.category.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.retryMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        HibernationMessage hibernationMessage = this.infoMessage;
        return hashCode2 + (hibernationMessage != null ? hibernationMessage.hashCode() : 0);
    }

    public String toString() {
        String str = this.birdId;
        VehicleHibernationCategory vehicleHibernationCategory = this.category;
        String str2 = this.title;
        String str3 = this.retryMessage;
        HibernationMessage hibernationMessage = this.infoMessage;
        return "HibernationSessionVehicle(birdId=" + str + ", category=" + vehicleHibernationCategory + ", title=" + str2 + ", retryMessage=" + str3 + ", infoMessage=" + hibernationMessage + ")";
    }
}
