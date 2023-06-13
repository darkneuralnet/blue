package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetMapButtonOverrides;", "", "title", "", "action", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;)V", "getAction", "()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BountyFlightSheetMapButtonOverrides {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final BountyFlightSheetAction action;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public BountyFlightSheetMapButtonOverrides(String title, BountyFlightSheetAction bountyFlightSheetAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.action = bountyFlightSheetAction;
    }

    public static /* synthetic */ BountyFlightSheetMapButtonOverrides copy$default(BountyFlightSheetMapButtonOverrides bountyFlightSheetMapButtonOverrides, String str, BountyFlightSheetAction bountyFlightSheetAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bountyFlightSheetMapButtonOverrides.title;
        }
        if ((i & 2) != 0) {
            bountyFlightSheetAction = bountyFlightSheetMapButtonOverrides.action;
        }
        return bountyFlightSheetMapButtonOverrides.copy(str, bountyFlightSheetAction);
    }

    public final String component1() {
        return this.title;
    }

    public final BountyFlightSheetAction component2() {
        return this.action;
    }

    public final BountyFlightSheetMapButtonOverrides copy(String title, BountyFlightSheetAction bountyFlightSheetAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new BountyFlightSheetMapButtonOverrides(title, bountyFlightSheetAction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BountyFlightSheetMapButtonOverrides) {
            BountyFlightSheetMapButtonOverrides bountyFlightSheetMapButtonOverrides = (BountyFlightSheetMapButtonOverrides) obj;
            return Intrinsics.areEqual(this.title, bountyFlightSheetMapButtonOverrides.title) && Intrinsics.areEqual(this.action, bountyFlightSheetMapButtonOverrides.action);
        }
        return false;
    }

    public final BountyFlightSheetAction getAction() {
        return this.action;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        BountyFlightSheetAction bountyFlightSheetAction = this.action;
        return hashCode + (bountyFlightSheetAction == null ? 0 : bountyFlightSheetAction.hashCode());
    }

    public String toString() {
        String str = this.title;
        BountyFlightSheetAction bountyFlightSheetAction = this.action;
        return "BountyFlightSheetMapButtonOverrides(title=" + str + ", action=" + bountyFlightSheetAction + ")";
    }
}
