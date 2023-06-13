package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetStatus;", "", "title", "", "predictionId", "label", "showBackButton", "", "backButtonLabel", "content", "Lco/bird/android/model/wire/WireFleetStatusContent;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lco/bird/android/model/wire/WireFleetStatusContent;)V", "getBackButtonLabel", "()Ljava/lang/String;", "getContent", "()Lco/bird/android/model/wire/WireFleetStatusContent;", "getLabel", "getPredictionId", "getShowBackButton", "()Z", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetStatus {
    @JsonProperty("back_button_label")
    @InterfaceC41208ft5("back_button_label")
    private final String backButtonLabel;
    @JsonProperty("content")
    @InterfaceC41208ft5("content")
    private final WireFleetStatusContent content;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("prediction_id")
    @InterfaceC41208ft5("prediction_id")
    private final String predictionId;
    @JsonProperty("show_back_button")
    @InterfaceC41208ft5("show_back_button")
    private final boolean showBackButton;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireFleetStatus() {
        this(null, null, null, false, null, null, 63, null);
    }

    public static /* synthetic */ WireFleetStatus copy$default(WireFleetStatus wireFleetStatus, String str, String str2, String str3, boolean z, String str4, WireFleetStatusContent wireFleetStatusContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireFleetStatus.title;
        }
        if ((i & 2) != 0) {
            str2 = wireFleetStatus.predictionId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = wireFleetStatus.label;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = wireFleetStatus.showBackButton;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = wireFleetStatus.backButtonLabel;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            wireFleetStatusContent = wireFleetStatus.content;
        }
        return wireFleetStatus.copy(str, str5, str6, z2, str7, wireFleetStatusContent);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.predictionId;
    }

    public final String component3() {
        return this.label;
    }

    public final boolean component4() {
        return this.showBackButton;
    }

    public final String component5() {
        return this.backButtonLabel;
    }

    public final WireFleetStatusContent component6() {
        return this.content;
    }

    public final WireFleetStatus copy(String str, String str2, String str3, boolean z, String str4, WireFleetStatusContent wireFleetStatusContent) {
        return new WireFleetStatus(str, str2, str3, z, str4, wireFleetStatusContent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetStatus) {
            WireFleetStatus wireFleetStatus = (WireFleetStatus) obj;
            return Intrinsics.areEqual(this.title, wireFleetStatus.title) && Intrinsics.areEqual(this.predictionId, wireFleetStatus.predictionId) && Intrinsics.areEqual(this.label, wireFleetStatus.label) && this.showBackButton == wireFleetStatus.showBackButton && Intrinsics.areEqual(this.backButtonLabel, wireFleetStatus.backButtonLabel) && Intrinsics.areEqual(this.content, wireFleetStatus.content);
        }
        return false;
    }

    public final String getBackButtonLabel() {
        return this.backButtonLabel;
    }

    public final WireFleetStatusContent getContent() {
        return this.content;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPredictionId() {
        return this.predictionId;
    }

    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.predictionId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.showBackButton;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        String str4 = this.backButtonLabel;
        int hashCode4 = (i2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        WireFleetStatusContent wireFleetStatusContent = this.content;
        return hashCode4 + (wireFleetStatusContent != null ? wireFleetStatusContent.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.predictionId;
        String str3 = this.label;
        boolean z = this.showBackButton;
        String str4 = this.backButtonLabel;
        WireFleetStatusContent wireFleetStatusContent = this.content;
        return "WireFleetStatus(title=" + str + ", predictionId=" + str2 + ", label=" + str3 + ", showBackButton=" + z + ", backButtonLabel=" + str4 + ", content=" + wireFleetStatusContent + ")";
    }

    public WireFleetStatus(String str, String str2, String str3, boolean z, String str4, WireFleetStatusContent wireFleetStatusContent) {
        this.title = str;
        this.predictionId = str2;
        this.label = str3;
        this.showBackButton = z;
        this.backButtonLabel = str4;
        this.content = wireFleetStatusContent;
    }

    public /* synthetic */ WireFleetStatus(String str, String str2, String str3, boolean z, String str4, WireFleetStatusContent wireFleetStatusContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : wireFleetStatusContent);
    }
}
