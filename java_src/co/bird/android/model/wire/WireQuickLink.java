package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.QuickLinkBehavior;
import co.bird.android.model.constant.QuickLinkIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006)"}, m28432d2 = {"Lco/bird/android/model/wire/WireQuickLink;", "Landroid/os/Parcelable;", "linkBehavior", "Lco/bird/android/model/constant/QuickLinkBehavior;", "linkType", "", "icon", "Lco/bird/android/model/constant/QuickLinkIcon;", "display", "description", "url", "(Lco/bird/android/model/constant/QuickLinkBehavior;Ljava/lang/String;Lco/bird/android/model/constant/QuickLinkIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getDisplay", "getIcon", "()Lco/bird/android/model/constant/QuickLinkIcon;", "getLinkBehavior", "()Lco/bird/android/model/constant/QuickLinkBehavior;", "getLinkType", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireQuickLink implements Parcelable {
    public static final Parcelable.Creator<WireQuickLink> CREATOR = new Creator();
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final QuickLinkIcon icon;
    @JsonProperty("link_behavior")
    @InterfaceC41208ft5("link_behavior")
    private final QuickLinkBehavior linkBehavior;
    @JsonProperty("link_type")
    @InterfaceC41208ft5("link_type")
    private final String linkType;
    @JsonProperty("url")
    @InterfaceC41208ft5("url")
    private final String url;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireQuickLink> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireQuickLink createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireQuickLink(QuickLinkBehavior.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : QuickLinkIcon.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireQuickLink[] newArray(int i) {
            return new WireQuickLink[i];
        }
    }

    public WireQuickLink(QuickLinkBehavior linkBehavior, String str, QuickLinkIcon quickLinkIcon, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(linkBehavior, "linkBehavior");
        this.linkBehavior = linkBehavior;
        this.linkType = str;
        this.icon = quickLinkIcon;
        this.display = str2;
        this.description = str3;
        this.url = str4;
    }

    public static /* synthetic */ WireQuickLink copy$default(WireQuickLink wireQuickLink, QuickLinkBehavior quickLinkBehavior, String str, QuickLinkIcon quickLinkIcon, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            quickLinkBehavior = wireQuickLink.linkBehavior;
        }
        if ((i & 2) != 0) {
            str = wireQuickLink.linkType;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            quickLinkIcon = wireQuickLink.icon;
        }
        QuickLinkIcon quickLinkIcon2 = quickLinkIcon;
        if ((i & 8) != 0) {
            str2 = wireQuickLink.display;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = wireQuickLink.description;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = wireQuickLink.url;
        }
        return wireQuickLink.copy(quickLinkBehavior, str5, quickLinkIcon2, str6, str7, str4);
    }

    public final QuickLinkBehavior component1() {
        return this.linkBehavior;
    }

    public final String component2() {
        return this.linkType;
    }

    public final QuickLinkIcon component3() {
        return this.icon;
    }

    public final String component4() {
        return this.display;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.url;
    }

    public final WireQuickLink copy(QuickLinkBehavior linkBehavior, String str, QuickLinkIcon quickLinkIcon, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(linkBehavior, "linkBehavior");
        return new WireQuickLink(linkBehavior, str, quickLinkIcon, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireQuickLink) {
            WireQuickLink wireQuickLink = (WireQuickLink) obj;
            return this.linkBehavior == wireQuickLink.linkBehavior && Intrinsics.areEqual(this.linkType, wireQuickLink.linkType) && this.icon == wireQuickLink.icon && Intrinsics.areEqual(this.display, wireQuickLink.display) && Intrinsics.areEqual(this.description, wireQuickLink.description) && Intrinsics.areEqual(this.url, wireQuickLink.url);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final QuickLinkIcon getIcon() {
        return this.icon;
    }

    public final QuickLinkBehavior getLinkBehavior() {
        return this.linkBehavior;
    }

    public final String getLinkType() {
        return this.linkType;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.linkBehavior.hashCode() * 31;
        String str = this.linkType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        QuickLinkIcon quickLinkIcon = this.icon;
        int hashCode3 = (hashCode2 + (quickLinkIcon == null ? 0 : quickLinkIcon.hashCode())) * 31;
        String str2 = this.display;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        QuickLinkBehavior quickLinkBehavior = this.linkBehavior;
        String str = this.linkType;
        QuickLinkIcon quickLinkIcon = this.icon;
        String str2 = this.display;
        String str3 = this.description;
        String str4 = this.url;
        return "WireQuickLink(linkBehavior=" + quickLinkBehavior + ", linkType=" + str + ", icon=" + quickLinkIcon + ", display=" + str2 + ", description=" + str3 + ", url=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.linkBehavior.name());
        out.writeString(this.linkType);
        QuickLinkIcon quickLinkIcon = this.icon;
        if (quickLinkIcon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(quickLinkIcon.name());
        }
        out.writeString(this.display);
        out.writeString(this.description);
        out.writeString(this.url);
    }

    public /* synthetic */ WireQuickLink(QuickLinkBehavior quickLinkBehavior, String str, QuickLinkIcon quickLinkIcon, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(quickLinkBehavior, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : quickLinkIcon, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null);
    }
}
