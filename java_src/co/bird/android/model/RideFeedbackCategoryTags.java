package co.bird.android.model;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0002\u0010\u0007J\u001b\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001b\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003JA\u0010\r\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R#\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/RideFeedbackCategoryTags;", "", "vehicleTags", "", "", "", "otherTags", "(Ljava/util/List;Ljava/util/List;)V", "getOtherTags", "()Ljava/util/List;", "getVehicleTags", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideFeedbackCategoryTags {
    private final List<Map<String, String>> otherTags;
    private final List<Map<String, String>> vehicleTags;

    public RideFeedbackCategoryTags() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RideFeedbackCategoryTags copy$default(RideFeedbackCategoryTags rideFeedbackCategoryTags, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rideFeedbackCategoryTags.vehicleTags;
        }
        if ((i & 2) != 0) {
            list2 = rideFeedbackCategoryTags.otherTags;
        }
        return rideFeedbackCategoryTags.copy(list, list2);
    }

    public final List<Map<String, String>> component1() {
        return this.vehicleTags;
    }

    public final List<Map<String, String>> component2() {
        return this.otherTags;
    }

    public final RideFeedbackCategoryTags copy(List<? extends Map<String, String>> vehicleTags, List<? extends Map<String, String>> otherTags) {
        Intrinsics.checkNotNullParameter(vehicleTags, "vehicleTags");
        Intrinsics.checkNotNullParameter(otherTags, "otherTags");
        return new RideFeedbackCategoryTags(vehicleTags, otherTags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideFeedbackCategoryTags) {
            RideFeedbackCategoryTags rideFeedbackCategoryTags = (RideFeedbackCategoryTags) obj;
            return Intrinsics.areEqual(this.vehicleTags, rideFeedbackCategoryTags.vehicleTags) && Intrinsics.areEqual(this.otherTags, rideFeedbackCategoryTags.otherTags);
        }
        return false;
    }

    public final List<Map<String, String>> getOtherTags() {
        return this.otherTags;
    }

    public final List<Map<String, String>> getVehicleTags() {
        return this.vehicleTags;
    }

    public int hashCode() {
        return (this.vehicleTags.hashCode() * 31) + this.otherTags.hashCode();
    }

    public String toString() {
        List<Map<String, String>> list = this.vehicleTags;
        List<Map<String, String>> list2 = this.otherTags;
        return "RideFeedbackCategoryTags(vehicleTags=" + list + ", otherTags=" + list2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RideFeedbackCategoryTags(List<? extends Map<String, String>> vehicleTags, List<? extends Map<String, String>> otherTags) {
        Intrinsics.checkNotNullParameter(vehicleTags, "vehicleTags");
        Intrinsics.checkNotNullParameter(otherTags, "otherTags");
        this.vehicleTags = vehicleTags;
        this.otherTags = otherTags;
    }

    public /* synthetic */ RideFeedbackCategoryTags(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
