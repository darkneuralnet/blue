package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m28432d2 = {"Lco/bird/api/response/BeginnerModeRiderMapResponse;", "", "navigationTitle", "", "bottomSheetNavigationTitle", "actions", "", "Lco/bird/api/response/BeginnerModeRiderMapAction;", "selectedAccelerationLevel", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getActions", "()Ljava/util/List;", "getBottomSheetNavigationTitle", "()Ljava/lang/String;", "getNavigationTitle", "getSelectedAccelerationLevel", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BeginnerModeRiderMapResponse {
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<BeginnerModeRiderMapAction> actions;
    @JsonProperty("bottom_sheet_navigation_title")
    @InterfaceC41208ft5("bottom_sheet_navigation_title")
    private final String bottomSheetNavigationTitle;
    @JsonProperty("navigation_title")
    @InterfaceC41208ft5("navigation_title")
    private final String navigationTitle;
    @JsonProperty("selected_acceleration_level")
    @InterfaceC41208ft5("selected_acceleration_level")
    private final String selectedAccelerationLevel;

    public BeginnerModeRiderMapResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeginnerModeRiderMapResponse copy$default(BeginnerModeRiderMapResponse beginnerModeRiderMapResponse, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beginnerModeRiderMapResponse.navigationTitle;
        }
        if ((i & 2) != 0) {
            str2 = beginnerModeRiderMapResponse.bottomSheetNavigationTitle;
        }
        if ((i & 4) != 0) {
            list = beginnerModeRiderMapResponse.actions;
        }
        if ((i & 8) != 0) {
            str3 = beginnerModeRiderMapResponse.selectedAccelerationLevel;
        }
        return beginnerModeRiderMapResponse.copy(str, str2, list, str3);
    }

    public final String component1() {
        return this.navigationTitle;
    }

    public final String component2() {
        return this.bottomSheetNavigationTitle;
    }

    public final List<BeginnerModeRiderMapAction> component3() {
        return this.actions;
    }

    public final String component4() {
        return this.selectedAccelerationLevel;
    }

    public final BeginnerModeRiderMapResponse copy(String navigationTitle, String bottomSheetNavigationTitle, List<BeginnerModeRiderMapAction> actions, String selectedAccelerationLevel) {
        Intrinsics.checkNotNullParameter(navigationTitle, "navigationTitle");
        Intrinsics.checkNotNullParameter(bottomSheetNavigationTitle, "bottomSheetNavigationTitle");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(selectedAccelerationLevel, "selectedAccelerationLevel");
        return new BeginnerModeRiderMapResponse(navigationTitle, bottomSheetNavigationTitle, actions, selectedAccelerationLevel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BeginnerModeRiderMapResponse) {
            BeginnerModeRiderMapResponse beginnerModeRiderMapResponse = (BeginnerModeRiderMapResponse) obj;
            return Intrinsics.areEqual(this.navigationTitle, beginnerModeRiderMapResponse.navigationTitle) && Intrinsics.areEqual(this.bottomSheetNavigationTitle, beginnerModeRiderMapResponse.bottomSheetNavigationTitle) && Intrinsics.areEqual(this.actions, beginnerModeRiderMapResponse.actions) && Intrinsics.areEqual(this.selectedAccelerationLevel, beginnerModeRiderMapResponse.selectedAccelerationLevel);
        }
        return false;
    }

    public final List<BeginnerModeRiderMapAction> getActions() {
        return this.actions;
    }

    public final String getBottomSheetNavigationTitle() {
        return this.bottomSheetNavigationTitle;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final String getSelectedAccelerationLevel() {
        return this.selectedAccelerationLevel;
    }

    public int hashCode() {
        return (((((this.navigationTitle.hashCode() * 31) + this.bottomSheetNavigationTitle.hashCode()) * 31) + this.actions.hashCode()) * 31) + this.selectedAccelerationLevel.hashCode();
    }

    public String toString() {
        String str = this.navigationTitle;
        String str2 = this.bottomSheetNavigationTitle;
        List<BeginnerModeRiderMapAction> list = this.actions;
        String str3 = this.selectedAccelerationLevel;
        return "BeginnerModeRiderMapResponse(navigationTitle=" + str + ", bottomSheetNavigationTitle=" + str2 + ", actions=" + list + ", selectedAccelerationLevel=" + str3 + ")";
    }

    public BeginnerModeRiderMapResponse(String navigationTitle, String bottomSheetNavigationTitle, List<BeginnerModeRiderMapAction> actions, String selectedAccelerationLevel) {
        Intrinsics.checkNotNullParameter(navigationTitle, "navigationTitle");
        Intrinsics.checkNotNullParameter(bottomSheetNavigationTitle, "bottomSheetNavigationTitle");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(selectedAccelerationLevel, "selectedAccelerationLevel");
        this.navigationTitle = navigationTitle;
        this.bottomSheetNavigationTitle = bottomSheetNavigationTitle;
        this.actions = actions;
        this.selectedAccelerationLevel = selectedAccelerationLevel;
    }

    public /* synthetic */ BeginnerModeRiderMapResponse(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3);
    }
}
