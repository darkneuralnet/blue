package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLegacyAsset;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/wire/configs/BirdPayTutorialStep;", "", "kind", "", "index", "", "titleText", "bodyText", "asset", "Lco/bird/android/model/wire/WireLegacyAsset;", "actionButtonText", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;)V", "getActionButtonText", "()Ljava/lang/String;", "getAsset", "()Lco/bird/android/model/wire/WireLegacyAsset;", "getBodyText", "getIndex", "()I", "getKind", "getTitleText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPayTutorialStep {
    @JsonProperty("action_button_text")
    @InterfaceC41208ft5("action_button_text")
    private final String actionButtonText;
    @JsonProperty("asset")
    @InterfaceC41208ft5("asset")
    private final WireLegacyAsset asset;
    @JsonProperty("body_text")
    @InterfaceC41208ft5("body_text")
    private final String bodyText;
    @JsonProperty("step")
    @InterfaceC41208ft5("step")
    private final int index;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final String kind;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String titleText;

    public BirdPayTutorialStep(String kind, int i, String titleText, String bodyText, WireLegacyAsset asset, String actionButtonText) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        this.kind = kind;
        this.index = i;
        this.titleText = titleText;
        this.bodyText = bodyText;
        this.asset = asset;
        this.actionButtonText = actionButtonText;
    }

    public static /* synthetic */ BirdPayTutorialStep copy$default(BirdPayTutorialStep birdPayTutorialStep, String str, int i, String str2, String str3, WireLegacyAsset wireLegacyAsset, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = birdPayTutorialStep.kind;
        }
        if ((i2 & 2) != 0) {
            i = birdPayTutorialStep.index;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = birdPayTutorialStep.titleText;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = birdPayTutorialStep.bodyText;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            wireLegacyAsset = birdPayTutorialStep.asset;
        }
        WireLegacyAsset wireLegacyAsset2 = wireLegacyAsset;
        if ((i2 & 32) != 0) {
            str4 = birdPayTutorialStep.actionButtonText;
        }
        return birdPayTutorialStep.copy(str, i3, str5, str6, wireLegacyAsset2, str4);
    }

    public final String component1() {
        return this.kind;
    }

    public final int component2() {
        return this.index;
    }

    public final String component3() {
        return this.titleText;
    }

    public final String component4() {
        return this.bodyText;
    }

    public final WireLegacyAsset component5() {
        return this.asset;
    }

    public final String component6() {
        return this.actionButtonText;
    }

    public final BirdPayTutorialStep copy(String kind, int i, String titleText, String bodyText, WireLegacyAsset asset, String actionButtonText) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        return new BirdPayTutorialStep(kind, i, titleText, bodyText, asset, actionButtonText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdPayTutorialStep) {
            BirdPayTutorialStep birdPayTutorialStep = (BirdPayTutorialStep) obj;
            return Intrinsics.areEqual(this.kind, birdPayTutorialStep.kind) && this.index == birdPayTutorialStep.index && Intrinsics.areEqual(this.titleText, birdPayTutorialStep.titleText) && Intrinsics.areEqual(this.bodyText, birdPayTutorialStep.bodyText) && Intrinsics.areEqual(this.asset, birdPayTutorialStep.asset) && Intrinsics.areEqual(this.actionButtonText, birdPayTutorialStep.actionButtonText);
        }
        return false;
    }

    public final String getActionButtonText() {
        return this.actionButtonText;
    }

    public final WireLegacyAsset getAsset() {
        return this.asset;
    }

    public final String getBodyText() {
        return this.bodyText;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        return (((((((((this.kind.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.titleText.hashCode()) * 31) + this.bodyText.hashCode()) * 31) + this.asset.hashCode()) * 31) + this.actionButtonText.hashCode();
    }

    public String toString() {
        String str = this.kind;
        int i = this.index;
        String str2 = this.titleText;
        String str3 = this.bodyText;
        WireLegacyAsset wireLegacyAsset = this.asset;
        String str4 = this.actionButtonText;
        return "BirdPayTutorialStep(kind=" + str + ", index=" + i + ", titleText=" + str2 + ", bodyText=" + str3 + ", asset=" + wireLegacyAsset + ", actionButtonText=" + str4 + ")";
    }

    public /* synthetic */ BirdPayTutorialStep(String str, int i, String str2, String str3, WireLegacyAsset wireLegacyAsset, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, wireLegacyAsset, (i2 & 32) != 0 ? "" : str4);
    }
}
