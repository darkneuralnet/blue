package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantAction;", "", "priority", "", "uri", "", "buttonTitle", "title", "subtitle", "layoutKind", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonTitle", "()Ljava/lang/String;", "getLayoutKind", "getPriority", "()I", "getSubtitle", "getTitle", "getUri", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireMerchantAction {
    @JsonProperty("button_title")
    @InterfaceC41208ft5("button_title")
    private final String buttonTitle;
    @JsonProperty("layout_kind")
    @InterfaceC41208ft5("layout_kind")
    private final String layoutKind;
    @JsonProperty("priority")
    @InterfaceC41208ft5("priority")
    private final int priority;
    @JsonProperty("row_subtitle")
    @InterfaceC41208ft5("row_subtitle")
    private final String subtitle;
    @JsonProperty("row_title")
    @InterfaceC41208ft5("row_title")
    private final String title;
    @JsonProperty("uri")
    @InterfaceC41208ft5("uri")
    private final String uri;

    public WireMerchantAction() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ WireMerchantAction copy$default(WireMerchantAction wireMerchantAction, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireMerchantAction.priority;
        }
        if ((i2 & 2) != 0) {
            str = wireMerchantAction.uri;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            str2 = wireMerchantAction.buttonTitle;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = wireMerchantAction.title;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            str4 = wireMerchantAction.subtitle;
        }
        String str9 = str4;
        if ((i2 & 32) != 0) {
            str5 = wireMerchantAction.layoutKind;
        }
        return wireMerchantAction.copy(i, str6, str7, str8, str9, str5);
    }

    public final int component1() {
        return this.priority;
    }

    public final String component2() {
        return this.uri;
    }

    public final String component3() {
        return this.buttonTitle;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final String component6() {
        return this.layoutKind;
    }

    public final WireMerchantAction copy(int i, String str, String buttonTitle, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        return new WireMerchantAction(i, str, buttonTitle, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireMerchantAction) {
            WireMerchantAction wireMerchantAction = (WireMerchantAction) obj;
            return this.priority == wireMerchantAction.priority && Intrinsics.areEqual(this.uri, wireMerchantAction.uri) && Intrinsics.areEqual(this.buttonTitle, wireMerchantAction.buttonTitle) && Intrinsics.areEqual(this.title, wireMerchantAction.title) && Intrinsics.areEqual(this.subtitle, wireMerchantAction.subtitle) && Intrinsics.areEqual(this.layoutKind, wireMerchantAction.layoutKind);
        }
        return false;
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getLayoutKind() {
        return this.layoutKind;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.priority) * 31;
        String str = this.uri;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.buttonTitle.hashCode()) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.layoutKind;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = this.priority;
        String str = this.uri;
        String str2 = this.buttonTitle;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.layoutKind;
        return "WireMerchantAction(priority=" + i + ", uri=" + str + ", buttonTitle=" + str2 + ", title=" + str3 + ", subtitle=" + str4 + ", layoutKind=" + str5 + ")";
    }

    public WireMerchantAction(int i, String str, String buttonTitle, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.priority = i;
        this.uri = str;
        this.buttonTitle = buttonTitle;
        this.title = str2;
        this.subtitle = str3;
        this.layoutKind = str4;
    }

    public /* synthetic */ WireMerchantAction(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) == 0 ? str5 : null);
    }
}
