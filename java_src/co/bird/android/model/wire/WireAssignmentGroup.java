package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/wire/WireAssignmentGroup;", "", "title", "", "description", "emptyText", "assignments", "", "Lco/bird/android/model/wire/WireReleaseAssignment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAssignments", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getEmptyText", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireAssignmentGroup {
    @JsonProperty("assignments")
    @InterfaceC41208ft5("assignments")
    private final List<WireReleaseAssignment> assignments;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("empty_text")
    @InterfaceC41208ft5("empty_text")
    private final String emptyText;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireAssignmentGroup() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireAssignmentGroup copy$default(WireAssignmentGroup wireAssignmentGroup, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireAssignmentGroup.title;
        }
        if ((i & 2) != 0) {
            str2 = wireAssignmentGroup.description;
        }
        if ((i & 4) != 0) {
            str3 = wireAssignmentGroup.emptyText;
        }
        if ((i & 8) != 0) {
            list = wireAssignmentGroup.assignments;
        }
        return wireAssignmentGroup.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.emptyText;
    }

    public final List<WireReleaseAssignment> component4() {
        return this.assignments;
    }

    public final WireAssignmentGroup copy(String title, String str, String str2, List<WireReleaseAssignment> assignments) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        return new WireAssignmentGroup(title, str, str2, assignments);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireAssignmentGroup) {
            WireAssignmentGroup wireAssignmentGroup = (WireAssignmentGroup) obj;
            return Intrinsics.areEqual(this.title, wireAssignmentGroup.title) && Intrinsics.areEqual(this.description, wireAssignmentGroup.description) && Intrinsics.areEqual(this.emptyText, wireAssignmentGroup.emptyText) && Intrinsics.areEqual(this.assignments, wireAssignmentGroup.assignments);
        }
        return false;
    }

    public final List<WireReleaseAssignment> getAssignments() {
        return this.assignments;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmptyText() {
        return this.emptyText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.emptyText;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.assignments.hashCode();
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.emptyText;
        List<WireReleaseAssignment> list = this.assignments;
        return "WireAssignmentGroup(title=" + str + ", description=" + str2 + ", emptyText=" + str3 + ", assignments=" + list + ")";
    }

    public WireAssignmentGroup(String title, String str, String str2, List<WireReleaseAssignment> assignments) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        this.title = title;
        this.description = str;
        this.emptyText = str2;
        this.assignments = assignments;
    }

    public /* synthetic */ WireAssignmentGroup(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
