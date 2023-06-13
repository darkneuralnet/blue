package co.bird.api.response;

import co.bird.android.model.ComplaintSection;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JY\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lco/bird/api/response/ComplaintSchemaResponse;", "", "damaged", "", "Lco/bird/android/model/ComplaintSection;", "largePile", "allIdMissing", "badParking", "badRiding", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAllIdMissing", "()Ljava/util/List;", "getBadParking", "getBadRiding", "getDamaged", "getLargePile", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ComplaintSchemaResponse {
    @JsonProperty("all_id_missing")
    @InterfaceC41208ft5("all_id_missing")
    private final List<ComplaintSection> allIdMissing;
    @JsonProperty("bad_parking")
    @InterfaceC41208ft5("bad_parking")
    private final List<ComplaintSection> badParking;
    @JsonProperty("bad_riding")
    @InterfaceC41208ft5("bad_riding")
    private final List<ComplaintSection> badRiding;
    @JsonProperty("damaged")
    @InterfaceC41208ft5("damaged")
    private final List<ComplaintSection> damaged;
    @JsonProperty("large_pile")
    @InterfaceC41208ft5("large_pile")
    private final List<ComplaintSection> largePile;

    public ComplaintSchemaResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ComplaintSchemaResponse copy$default(ComplaintSchemaResponse complaintSchemaResponse, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        List<ComplaintSection> list6 = list;
        if ((i & 1) != 0) {
            list6 = complaintSchemaResponse.damaged;
        }
        List<ComplaintSection> list7 = list2;
        if ((i & 2) != 0) {
            list7 = complaintSchemaResponse.largePile;
        }
        List list8 = list7;
        List<ComplaintSection> list9 = list3;
        if ((i & 4) != 0) {
            list9 = complaintSchemaResponse.allIdMissing;
        }
        List list10 = list9;
        List<ComplaintSection> list11 = list4;
        if ((i & 8) != 0) {
            list11 = complaintSchemaResponse.badParking;
        }
        List list12 = list11;
        List<ComplaintSection> list13 = list5;
        if ((i & 16) != 0) {
            list13 = complaintSchemaResponse.badRiding;
        }
        return complaintSchemaResponse.copy(list6, list8, list10, list12, list13);
    }

    public final List<ComplaintSection> component1() {
        return this.damaged;
    }

    public final List<ComplaintSection> component2() {
        return this.largePile;
    }

    public final List<ComplaintSection> component3() {
        return this.allIdMissing;
    }

    public final List<ComplaintSection> component4() {
        return this.badParking;
    }

    public final List<ComplaintSection> component5() {
        return this.badRiding;
    }

    public final ComplaintSchemaResponse copy(List<ComplaintSection> damaged, List<ComplaintSection> largePile, List<ComplaintSection> allIdMissing, List<ComplaintSection> badParking, List<ComplaintSection> badRiding) {
        Intrinsics.checkNotNullParameter(damaged, "damaged");
        Intrinsics.checkNotNullParameter(largePile, "largePile");
        Intrinsics.checkNotNullParameter(allIdMissing, "allIdMissing");
        Intrinsics.checkNotNullParameter(badParking, "badParking");
        Intrinsics.checkNotNullParameter(badRiding, "badRiding");
        return new ComplaintSchemaResponse(damaged, largePile, allIdMissing, badParking, badRiding);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComplaintSchemaResponse) {
            ComplaintSchemaResponse complaintSchemaResponse = (ComplaintSchemaResponse) obj;
            return Intrinsics.areEqual(this.damaged, complaintSchemaResponse.damaged) && Intrinsics.areEqual(this.largePile, complaintSchemaResponse.largePile) && Intrinsics.areEqual(this.allIdMissing, complaintSchemaResponse.allIdMissing) && Intrinsics.areEqual(this.badParking, complaintSchemaResponse.badParking) && Intrinsics.areEqual(this.badRiding, complaintSchemaResponse.badRiding);
        }
        return false;
    }

    public final List<ComplaintSection> getAllIdMissing() {
        return this.allIdMissing;
    }

    public final List<ComplaintSection> getBadParking() {
        return this.badParking;
    }

    public final List<ComplaintSection> getBadRiding() {
        return this.badRiding;
    }

    public final List<ComplaintSection> getDamaged() {
        return this.damaged;
    }

    public final List<ComplaintSection> getLargePile() {
        return this.largePile;
    }

    public int hashCode() {
        return (((((((this.damaged.hashCode() * 31) + this.largePile.hashCode()) * 31) + this.allIdMissing.hashCode()) * 31) + this.badParking.hashCode()) * 31) + this.badRiding.hashCode();
    }

    public String toString() {
        List<ComplaintSection> list = this.damaged;
        List<ComplaintSection> list2 = this.largePile;
        List<ComplaintSection> list3 = this.allIdMissing;
        List<ComplaintSection> list4 = this.badParking;
        List<ComplaintSection> list5 = this.badRiding;
        return "ComplaintSchemaResponse(damaged=" + list + ", largePile=" + list2 + ", allIdMissing=" + list3 + ", badParking=" + list4 + ", badRiding=" + list5 + ")";
    }

    public ComplaintSchemaResponse(List<ComplaintSection> damaged, List<ComplaintSection> largePile, List<ComplaintSection> allIdMissing, List<ComplaintSection> badParking, List<ComplaintSection> badRiding) {
        Intrinsics.checkNotNullParameter(damaged, "damaged");
        Intrinsics.checkNotNullParameter(largePile, "largePile");
        Intrinsics.checkNotNullParameter(allIdMissing, "allIdMissing");
        Intrinsics.checkNotNullParameter(badParking, "badParking");
        Intrinsics.checkNotNullParameter(badRiding, "badRiding");
        this.damaged = damaged;
        this.largePile = largePile;
        this.allIdMissing = allIdMissing;
        this.badParking = badParking;
        this.badRiding = badRiding;
    }

    public /* synthetic */ ComplaintSchemaResponse(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list5);
    }
}
