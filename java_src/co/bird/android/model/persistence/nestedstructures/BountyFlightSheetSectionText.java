package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;", "", "title", "", "body", "action", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "autoDetectLinks", "", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;Z)V", "getAction", "()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "getAutoDetectLinks", "()Z", "getBody", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BountyFlightSheetSectionText {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final BountyFlightSheetAction action;
    @JsonProperty("auto_detect_links")
    @InterfaceC41208ft5("auto_detect_links")
    private final boolean autoDetectLinks;
    @JsonProperty("body")
    @InterfaceC41208ft5("body")
    private final String body;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public BountyFlightSheetSectionText() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ BountyFlightSheetSectionText copy$default(BountyFlightSheetSectionText bountyFlightSheetSectionText, String str, String str2, BountyFlightSheetAction bountyFlightSheetAction, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bountyFlightSheetSectionText.title;
        }
        if ((i & 2) != 0) {
            str2 = bountyFlightSheetSectionText.body;
        }
        if ((i & 4) != 0) {
            bountyFlightSheetAction = bountyFlightSheetSectionText.action;
        }
        if ((i & 8) != 0) {
            z = bountyFlightSheetSectionText.autoDetectLinks;
        }
        return bountyFlightSheetSectionText.copy(str, str2, bountyFlightSheetAction, z);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final BountyFlightSheetAction component3() {
        return this.action;
    }

    public final boolean component4() {
        return this.autoDetectLinks;
    }

    public final BountyFlightSheetSectionText copy(String str, String str2, BountyFlightSheetAction bountyFlightSheetAction, boolean z) {
        return new BountyFlightSheetSectionText(str, str2, bountyFlightSheetAction, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BountyFlightSheetSectionText) {
            BountyFlightSheetSectionText bountyFlightSheetSectionText = (BountyFlightSheetSectionText) obj;
            return Intrinsics.areEqual(this.title, bountyFlightSheetSectionText.title) && Intrinsics.areEqual(this.body, bountyFlightSheetSectionText.body) && Intrinsics.areEqual(this.action, bountyFlightSheetSectionText.action) && this.autoDetectLinks == bountyFlightSheetSectionText.autoDetectLinks;
        }
        return false;
    }

    public final BountyFlightSheetAction getAction() {
        return this.action;
    }

    public final boolean getAutoDetectLinks() {
        return this.autoDetectLinks;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.body;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BountyFlightSheetAction bountyFlightSheetAction = this.action;
        int hashCode3 = (hashCode2 + (bountyFlightSheetAction != null ? bountyFlightSheetAction.hashCode() : 0)) * 31;
        boolean z = this.autoDetectLinks;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        BountyFlightSheetAction bountyFlightSheetAction = this.action;
        boolean z = this.autoDetectLinks;
        return "BountyFlightSheetSectionText(title=" + str + ", body=" + str2 + ", action=" + bountyFlightSheetAction + ", autoDetectLinks=" + z + ")";
    }

    public BountyFlightSheetSectionText(String str, String str2, BountyFlightSheetAction bountyFlightSheetAction, boolean z) {
        this.title = str;
        this.body = str2;
        this.action = bountyFlightSheetAction;
        this.autoDetectLinks = z;
    }

    public /* synthetic */ BountyFlightSheetSectionText(String str, String str2, BountyFlightSheetAction bountyFlightSheetAction, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bountyFlightSheetAction, (i & 8) != 0 ? false : z);
    }
}
