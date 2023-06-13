package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.CampaignPriority;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;", "Landroid/os/Parcelable;", "priority", "Lco/bird/android/model/constant/CampaignPriority;", "color", "", "sortWeight", "campaignIssueMessage", "", "campaignRepairMessage", "(Lco/bird/android/model/constant/CampaignPriority;IILjava/lang/String;Ljava/lang/String;)V", "getCampaignIssueMessage", "()Ljava/lang/String;", "getCampaignRepairMessage", "getColor", "()I", "getPriority", "()Lco/bird/android/model/constant/CampaignPriority;", "getSortWeight", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireServiceCenterCampaignPriority implements Parcelable {
    public static final Parcelable.Creator<WireServiceCenterCampaignPriority> CREATOR = new Creator();
    @JsonProperty("campaign_issue_message")
    @InterfaceC41208ft5("campaign_issue_message")
    private final String campaignIssueMessage;
    @JsonProperty("campaign_repair_message")
    @InterfaceC41208ft5("campaign_repair_message")
    private final String campaignRepairMessage;
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final int color;
    @JsonProperty("priority")
    @InterfaceC41208ft5("priority")
    private final CampaignPriority priority;
    @JsonProperty("sort_weight")
    @InterfaceC41208ft5("sort_weight")
    private final int sortWeight;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireServiceCenterCampaignPriority> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireServiceCenterCampaignPriority createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireServiceCenterCampaignPriority(CampaignPriority.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireServiceCenterCampaignPriority[] newArray(int i) {
            return new WireServiceCenterCampaignPriority[i];
        }
    }

    public WireServiceCenterCampaignPriority() {
        this(null, 0, 0, null, null, 31, null);
    }

    public static /* synthetic */ WireServiceCenterCampaignPriority copy$default(WireServiceCenterCampaignPriority wireServiceCenterCampaignPriority, CampaignPriority campaignPriority, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            campaignPriority = wireServiceCenterCampaignPriority.priority;
        }
        if ((i3 & 2) != 0) {
            i = wireServiceCenterCampaignPriority.color;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = wireServiceCenterCampaignPriority.sortWeight;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = wireServiceCenterCampaignPriority.campaignIssueMessage;
        }
        String str3 = str;
        if ((i3 & 16) != 0) {
            str2 = wireServiceCenterCampaignPriority.campaignRepairMessage;
        }
        return wireServiceCenterCampaignPriority.copy(campaignPriority, i4, i5, str3, str2);
    }

    public final CampaignPriority component1() {
        return this.priority;
    }

    public final int component2() {
        return this.color;
    }

    public final int component3() {
        return this.sortWeight;
    }

    public final String component4() {
        return this.campaignIssueMessage;
    }

    public final String component5() {
        return this.campaignRepairMessage;
    }

    public final WireServiceCenterCampaignPriority copy(CampaignPriority priority, int i, int i2, String campaignIssueMessage, String campaignRepairMessage) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(campaignIssueMessage, "campaignIssueMessage");
        Intrinsics.checkNotNullParameter(campaignRepairMessage, "campaignRepairMessage");
        return new WireServiceCenterCampaignPriority(priority, i, i2, campaignIssueMessage, campaignRepairMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireServiceCenterCampaignPriority) {
            WireServiceCenterCampaignPriority wireServiceCenterCampaignPriority = (WireServiceCenterCampaignPriority) obj;
            return this.priority == wireServiceCenterCampaignPriority.priority && this.color == wireServiceCenterCampaignPriority.color && this.sortWeight == wireServiceCenterCampaignPriority.sortWeight && Intrinsics.areEqual(this.campaignIssueMessage, wireServiceCenterCampaignPriority.campaignIssueMessage) && Intrinsics.areEqual(this.campaignRepairMessage, wireServiceCenterCampaignPriority.campaignRepairMessage);
        }
        return false;
    }

    public final String getCampaignIssueMessage() {
        return this.campaignIssueMessage;
    }

    public final String getCampaignRepairMessage() {
        return this.campaignRepairMessage;
    }

    public final int getColor() {
        return this.color;
    }

    public final CampaignPriority getPriority() {
        return this.priority;
    }

    public final int getSortWeight() {
        return this.sortWeight;
    }

    public int hashCode() {
        return (((((((this.priority.hashCode() * 31) + Integer.hashCode(this.color)) * 31) + Integer.hashCode(this.sortWeight)) * 31) + this.campaignIssueMessage.hashCode()) * 31) + this.campaignRepairMessage.hashCode();
    }

    public String toString() {
        CampaignPriority campaignPriority = this.priority;
        int i = this.color;
        int i2 = this.sortWeight;
        String str = this.campaignIssueMessage;
        String str2 = this.campaignRepairMessage;
        return "WireServiceCenterCampaignPriority(priority=" + campaignPriority + ", color=" + i + ", sortWeight=" + i2 + ", campaignIssueMessage=" + str + ", campaignRepairMessage=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.priority.name());
        out.writeInt(this.color);
        out.writeInt(this.sortWeight);
        out.writeString(this.campaignIssueMessage);
        out.writeString(this.campaignRepairMessage);
    }

    public WireServiceCenterCampaignPriority(CampaignPriority priority, int i, int i2, String campaignIssueMessage, String campaignRepairMessage) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(campaignIssueMessage, "campaignIssueMessage");
        Intrinsics.checkNotNullParameter(campaignRepairMessage, "campaignRepairMessage");
        this.priority = priority;
        this.color = i;
        this.sortWeight = i2;
        this.campaignIssueMessage = campaignIssueMessage;
        this.campaignRepairMessage = campaignRepairMessage;
    }

    public /* synthetic */ WireServiceCenterCampaignPriority(CampaignPriority campaignPriority, int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? CampaignPriority.INFO : campaignPriority, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2);
    }
}
