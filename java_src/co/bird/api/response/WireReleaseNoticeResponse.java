package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ReleaseNoticeAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m28432d2 = {"Lco/bird/api/response/WireReleaseNoticeResponse;", "", "title", "", "message", "primaryButtonAction", "Lco/bird/android/model/constant/ReleaseNoticeAction;", "allowReleaseAnyway", "", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ReleaseNoticeAction;Z)V", "getAllowReleaseAnyway", "()Z", "getMessage", "()Ljava/lang/String;", "getPrimaryButtonAction", "()Lco/bird/android/model/constant/ReleaseNoticeAction;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireReleaseNoticeResponse {
    @JsonProperty("allow_release_anyway")
    @InterfaceC41208ft5("allow_release_anyway")
    private final boolean allowReleaseAnyway;
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;
    @JsonProperty("primary_button_action")
    @InterfaceC41208ft5("primary_button_action")
    private final ReleaseNoticeAction primaryButtonAction;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireReleaseNoticeResponse() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ WireReleaseNoticeResponse copy$default(WireReleaseNoticeResponse wireReleaseNoticeResponse, String str, String str2, ReleaseNoticeAction releaseNoticeAction, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireReleaseNoticeResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = wireReleaseNoticeResponse.message;
        }
        if ((i & 4) != 0) {
            releaseNoticeAction = wireReleaseNoticeResponse.primaryButtonAction;
        }
        if ((i & 8) != 0) {
            z = wireReleaseNoticeResponse.allowReleaseAnyway;
        }
        return wireReleaseNoticeResponse.copy(str, str2, releaseNoticeAction, z);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.message;
    }

    public final ReleaseNoticeAction component3() {
        return this.primaryButtonAction;
    }

    public final boolean component4() {
        return this.allowReleaseAnyway;
    }

    public final WireReleaseNoticeResponse copy(String title, String message, ReleaseNoticeAction releaseNoticeAction, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        return new WireReleaseNoticeResponse(title, message, releaseNoticeAction, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireReleaseNoticeResponse) {
            WireReleaseNoticeResponse wireReleaseNoticeResponse = (WireReleaseNoticeResponse) obj;
            return Intrinsics.areEqual(this.title, wireReleaseNoticeResponse.title) && Intrinsics.areEqual(this.message, wireReleaseNoticeResponse.message) && this.primaryButtonAction == wireReleaseNoticeResponse.primaryButtonAction && this.allowReleaseAnyway == wireReleaseNoticeResponse.allowReleaseAnyway;
        }
        return false;
    }

    public final boolean getAllowReleaseAnyway() {
        return this.allowReleaseAnyway;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ReleaseNoticeAction getPrimaryButtonAction() {
        return this.primaryButtonAction;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + this.message.hashCode()) * 31;
        ReleaseNoticeAction releaseNoticeAction = this.primaryButtonAction;
        int hashCode2 = (hashCode + (releaseNoticeAction == null ? 0 : releaseNoticeAction.hashCode())) * 31;
        boolean z = this.allowReleaseAnyway;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.message;
        ReleaseNoticeAction releaseNoticeAction = this.primaryButtonAction;
        boolean z = this.allowReleaseAnyway;
        return "WireReleaseNoticeResponse(title=" + str + ", message=" + str2 + ", primaryButtonAction=" + releaseNoticeAction + ", allowReleaseAnyway=" + z + ")";
    }

    public WireReleaseNoticeResponse(String title, String message, ReleaseNoticeAction releaseNoticeAction, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.title = title;
        this.message = message;
        this.primaryButtonAction = releaseNoticeAction;
        this.allowReleaseAnyway = z;
    }

    public /* synthetic */ WireReleaseNoticeResponse(String str, String str2, ReleaseNoticeAction releaseNoticeAction, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : releaseNoticeAction, (i & 8) != 0 ? true : z);
    }
}
