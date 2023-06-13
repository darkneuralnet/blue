package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLegacyAsset;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, m28432d2 = {"Lco/bird/api/response/BeginnerModeOnboardingResponse;", "", "navigationTitle", "", "contentTitle", "contentSubtitle", "asset", "Lco/bird/android/model/wire/WireLegacyAsset;", "actions", "", "Lco/bird/api/response/BeginnerModeOnboardingAction;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getAsset", "()Lco/bird/android/model/wire/WireLegacyAsset;", "getContentSubtitle", "()Ljava/lang/String;", "getContentTitle", "getNavigationTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BeginnerModeOnboardingResponse {
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<BeginnerModeOnboardingAction> actions;
    @JsonProperty("asset")
    @InterfaceC41208ft5("asset")
    private final WireLegacyAsset asset;
    @JsonProperty("content_subtitle")
    @InterfaceC41208ft5("content_subtitle")
    private final String contentSubtitle;
    @JsonProperty("content_title")
    @InterfaceC41208ft5("content_title")
    private final String contentTitle;
    @JsonProperty("navigation_title")
    @InterfaceC41208ft5("navigation_title")
    private final String navigationTitle;

    public BeginnerModeOnboardingResponse(String navigationTitle, String contentTitle, String contentSubtitle, WireLegacyAsset asset, List<BeginnerModeOnboardingAction> actions) {
        Intrinsics.checkNotNullParameter(navigationTitle, "navigationTitle");
        Intrinsics.checkNotNullParameter(contentTitle, "contentTitle");
        Intrinsics.checkNotNullParameter(contentSubtitle, "contentSubtitle");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.navigationTitle = navigationTitle;
        this.contentTitle = contentTitle;
        this.contentSubtitle = contentSubtitle;
        this.asset = asset;
        this.actions = actions;
    }

    public static /* synthetic */ BeginnerModeOnboardingResponse copy$default(BeginnerModeOnboardingResponse beginnerModeOnboardingResponse, String str, String str2, String str3, WireLegacyAsset wireLegacyAsset, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beginnerModeOnboardingResponse.navigationTitle;
        }
        if ((i & 2) != 0) {
            str2 = beginnerModeOnboardingResponse.contentTitle;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = beginnerModeOnboardingResponse.contentSubtitle;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            wireLegacyAsset = beginnerModeOnboardingResponse.asset;
        }
        WireLegacyAsset wireLegacyAsset2 = wireLegacyAsset;
        List<BeginnerModeOnboardingAction> list2 = list;
        if ((i & 16) != 0) {
            list2 = beginnerModeOnboardingResponse.actions;
        }
        return beginnerModeOnboardingResponse.copy(str, str4, str5, wireLegacyAsset2, list2);
    }

    public final String component1() {
        return this.navigationTitle;
    }

    public final String component2() {
        return this.contentTitle;
    }

    public final String component3() {
        return this.contentSubtitle;
    }

    public final WireLegacyAsset component4() {
        return this.asset;
    }

    public final List<BeginnerModeOnboardingAction> component5() {
        return this.actions;
    }

    public final BeginnerModeOnboardingResponse copy(String navigationTitle, String contentTitle, String contentSubtitle, WireLegacyAsset asset, List<BeginnerModeOnboardingAction> actions) {
        Intrinsics.checkNotNullParameter(navigationTitle, "navigationTitle");
        Intrinsics.checkNotNullParameter(contentTitle, "contentTitle");
        Intrinsics.checkNotNullParameter(contentSubtitle, "contentSubtitle");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new BeginnerModeOnboardingResponse(navigationTitle, contentTitle, contentSubtitle, asset, actions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BeginnerModeOnboardingResponse) {
            BeginnerModeOnboardingResponse beginnerModeOnboardingResponse = (BeginnerModeOnboardingResponse) obj;
            return Intrinsics.areEqual(this.navigationTitle, beginnerModeOnboardingResponse.navigationTitle) && Intrinsics.areEqual(this.contentTitle, beginnerModeOnboardingResponse.contentTitle) && Intrinsics.areEqual(this.contentSubtitle, beginnerModeOnboardingResponse.contentSubtitle) && Intrinsics.areEqual(this.asset, beginnerModeOnboardingResponse.asset) && Intrinsics.areEqual(this.actions, beginnerModeOnboardingResponse.actions);
        }
        return false;
    }

    public final List<BeginnerModeOnboardingAction> getActions() {
        return this.actions;
    }

    public final WireLegacyAsset getAsset() {
        return this.asset;
    }

    public final String getContentSubtitle() {
        return this.contentSubtitle;
    }

    public final String getContentTitle() {
        return this.contentTitle;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public int hashCode() {
        return (((((((this.navigationTitle.hashCode() * 31) + this.contentTitle.hashCode()) * 31) + this.contentSubtitle.hashCode()) * 31) + this.asset.hashCode()) * 31) + this.actions.hashCode();
    }

    public String toString() {
        String str = this.navigationTitle;
        String str2 = this.contentTitle;
        String str3 = this.contentSubtitle;
        WireLegacyAsset wireLegacyAsset = this.asset;
        List<BeginnerModeOnboardingAction> list = this.actions;
        return "BeginnerModeOnboardingResponse(navigationTitle=" + str + ", contentTitle=" + str2 + ", contentSubtitle=" + str3 + ", asset=" + wireLegacyAsset + ", actions=" + list + ")";
    }

    public /* synthetic */ BeginnerModeOnboardingResponse(String str, String str2, String str3, WireLegacyAsset wireLegacyAsset, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, wireLegacyAsset, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
