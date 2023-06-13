package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.IssueStatusReason;
import co.bird.android.model.wire.WireServiceCenterCampaign;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00000\u0018HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jð\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010NJ\t\u0010O\u001a\u00020\fHÖ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0003J\t\u0010T\u001a\u00020\fHÖ\u0001J\t\u0010U\u001a\u00020\u0003HÖ\u0001J\u0019\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001f¨\u0006["}, m28432d2 = {"Lco/bird/android/model/Issue;", "Landroid/os/Parcelable;", "id", "", "workOrderId", "issueTypeId", "display", "description", "status", "Lco/bird/android/model/IssueStatus;", "statusDisplay", "statusColor", "", "statusReasonDisplay", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/IssueCreateSource;", "sourceDisplay", "createdBy", "createdAt", "Lorg/joda/time/DateTime;", "updatedAt", "parentId", "assetId", "subtypes", "", "wireCampaign", "Lco/bird/android/model/wire/WireServiceCenterCampaign;", "statusReason", "Lco/bird/android/model/constant/IssueStatusReason;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/IssueStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/IssueCreateSource;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/wire/WireServiceCenterCampaign;Lco/bird/android/model/constant/IssueStatusReason;)V", "getAssetId", "()Ljava/lang/String;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getCreatedBy", "getDescription", "getDisplay", "getId", "getIssueTypeId", "getParentId", "getSource", "()Lco/bird/android/model/IssueCreateSource;", "getSourceDisplay", "getStatus", "()Lco/bird/android/model/IssueStatus;", "getStatusColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatusDisplay", "getStatusReason", "()Lco/bird/android/model/constant/IssueStatusReason;", "getStatusReasonDisplay", "getSubtypes", "()Ljava/util/List;", "getUpdatedAt", "getWireCampaign", "()Lco/bird/android/model/wire/WireServiceCenterCampaign;", "getWorkOrderId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/IssueStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/IssueCreateSource;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/wire/WireServiceCenterCampaign;Lco/bird/android/model/constant/IssueStatusReason;)Lco/bird/android/model/Issue;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Issue implements Parcelable {
    public static final Parcelable.Creator<Issue> CREATOR = new Creator();
    private final transient String assetId;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("created_by")
    @InterfaceC41208ft5("created_by")
    private final String createdBy;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66598id;
    @JsonProperty("issue_type_id")
    @InterfaceC41208ft5("issue_type_id")
    private final String issueTypeId;
    private final transient String parentId;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final IssueCreateSource source;
    @JsonProperty("source_display")
    @InterfaceC41208ft5("source_display")
    private final String sourceDisplay;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final IssueStatus status;
    @JsonProperty("status_text_color")
    @InterfaceC41208ft5("status_text_color")
    private final Integer statusColor;
    @JsonProperty("status_display")
    @InterfaceC41208ft5("status_display")
    private final String statusDisplay;
    private final transient IssueStatusReason statusReason;
    @JsonProperty("status_reason_display")
    @InterfaceC41208ft5("status_reason_display")
    private final String statusReasonDisplay;
    private final transient List<Issue> subtypes;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;
    private final transient WireServiceCenterCampaign wireCampaign;
    @JsonProperty("work_order_id")
    @InterfaceC41208ft5("work_order_id")
    private final String workOrderId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Issue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Issue createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            IssueStatus valueOf = parcel.readInt() == 0 ? null : IssueStatus.valueOf(parcel.readString());
            String readString6 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString7 = parcel.readString();
            IssueCreateSource valueOf3 = parcel.readInt() == 0 ? null : IssueCreateSource.valueOf(parcel.readString());
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                arrayList.add(Issue.CREATOR.createFromParcel(parcel));
                i++;
                readInt = readInt;
            }
            return new Issue(readString, readString2, readString3, readString4, readString5, valueOf, readString6, valueOf2, readString7, valueOf3, readString8, readString9, dateTime, dateTime2, readString10, readString11, arrayList, (WireServiceCenterCampaign) parcel.readParcelable(Issue.class.getClassLoader()), parcel.readInt() == 0 ? null : IssueStatusReason.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Issue[] newArray(int i) {
            return new Issue[i];
        }
    }

    public Issue() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public final String component1() {
        return this.f66598id;
    }

    public final IssueCreateSource component10() {
        return this.source;
    }

    public final String component11() {
        return this.sourceDisplay;
    }

    public final String component12() {
        return this.createdBy;
    }

    public final DateTime component13() {
        return this.createdAt;
    }

    public final DateTime component14() {
        return this.updatedAt;
    }

    public final String component15() {
        return this.parentId;
    }

    public final String component16() {
        return this.assetId;
    }

    public final List<Issue> component17() {
        return this.subtypes;
    }

    public final WireServiceCenterCampaign component18() {
        return this.wireCampaign;
    }

    public final IssueStatusReason component19() {
        return this.statusReason;
    }

    public final String component2() {
        return this.workOrderId;
    }

    public final String component3() {
        return this.issueTypeId;
    }

    public final String component4() {
        return this.display;
    }

    public final String component5() {
        return this.description;
    }

    public final IssueStatus component6() {
        return this.status;
    }

    public final String component7() {
        return this.statusDisplay;
    }

    public final Integer component8() {
        return this.statusColor;
    }

    public final String component9() {
        return this.statusReasonDisplay;
    }

    public final Issue copy(String id, String workOrderId, String issueTypeId, String str, String str2, IssueStatus issueStatus, String str3, Integer num, String str4, IssueCreateSource issueCreateSource, String str5, String str6, DateTime dateTime, DateTime dateTime2, String str7, String str8, List<Issue> subtypes, WireServiceCenterCampaign wireServiceCenterCampaign, IssueStatusReason issueStatusReason) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(issueTypeId, "issueTypeId");
        Intrinsics.checkNotNullParameter(subtypes, "subtypes");
        return new Issue(id, workOrderId, issueTypeId, str, str2, issueStatus, str3, num, str4, issueCreateSource, str5, str6, dateTime, dateTime2, str7, str8, subtypes, wireServiceCenterCampaign, issueStatusReason);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Issue) {
            Issue issue = (Issue) obj;
            return Intrinsics.areEqual(this.f66598id, issue.f66598id) && Intrinsics.areEqual(this.workOrderId, issue.workOrderId) && Intrinsics.areEqual(this.issueTypeId, issue.issueTypeId) && Intrinsics.areEqual(this.display, issue.display) && Intrinsics.areEqual(this.description, issue.description) && this.status == issue.status && Intrinsics.areEqual(this.statusDisplay, issue.statusDisplay) && Intrinsics.areEqual(this.statusColor, issue.statusColor) && Intrinsics.areEqual(this.statusReasonDisplay, issue.statusReasonDisplay) && this.source == issue.source && Intrinsics.areEqual(this.sourceDisplay, issue.sourceDisplay) && Intrinsics.areEqual(this.createdBy, issue.createdBy) && Intrinsics.areEqual(this.createdAt, issue.createdAt) && Intrinsics.areEqual(this.updatedAt, issue.updatedAt) && Intrinsics.areEqual(this.parentId, issue.parentId) && Intrinsics.areEqual(this.assetId, issue.assetId) && Intrinsics.areEqual(this.subtypes, issue.subtypes) && Intrinsics.areEqual(this.wireCampaign, issue.wireCampaign) && this.statusReason == issue.statusReason;
        }
        return false;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getId() {
        return this.f66598id;
    }

    public final String getIssueTypeId() {
        return this.issueTypeId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final IssueCreateSource getSource() {
        return this.source;
    }

    public final String getSourceDisplay() {
        return this.sourceDisplay;
    }

    public final IssueStatus getStatus() {
        return this.status;
    }

    public final Integer getStatusColor() {
        return this.statusColor;
    }

    public final String getStatusDisplay() {
        return this.statusDisplay;
    }

    public final IssueStatusReason getStatusReason() {
        return this.statusReason;
    }

    public final String getStatusReasonDisplay() {
        return this.statusReasonDisplay;
    }

    public final List<Issue> getSubtypes() {
        return this.subtypes;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final WireServiceCenterCampaign getWireCampaign() {
        return this.wireCampaign;
    }

    public final String getWorkOrderId() {
        return this.workOrderId;
    }

    public int hashCode() {
        int hashCode = ((((this.f66598id.hashCode() * 31) + this.workOrderId.hashCode()) * 31) + this.issueTypeId.hashCode()) * 31;
        String str = this.display;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IssueStatus issueStatus = this.status;
        int hashCode4 = (hashCode3 + (issueStatus == null ? 0 : issueStatus.hashCode())) * 31;
        String str3 = this.statusDisplay;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.statusColor;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.statusReasonDisplay;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        IssueCreateSource issueCreateSource = this.source;
        int hashCode8 = (hashCode7 + (issueCreateSource == null ? 0 : issueCreateSource.hashCode())) * 31;
        String str5 = this.sourceDisplay;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.createdBy;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode11 = (hashCode10 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.updatedAt;
        int hashCode12 = (hashCode11 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        String str7 = this.parentId;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.assetId;
        int hashCode14 = (((hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.subtypes.hashCode()) * 31;
        WireServiceCenterCampaign wireServiceCenterCampaign = this.wireCampaign;
        int hashCode15 = (hashCode14 + (wireServiceCenterCampaign == null ? 0 : wireServiceCenterCampaign.hashCode())) * 31;
        IssueStatusReason issueStatusReason = this.statusReason;
        return hashCode15 + (issueStatusReason != null ? issueStatusReason.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66598id;
        String str2 = this.workOrderId;
        String str3 = this.issueTypeId;
        String str4 = this.display;
        String str5 = this.description;
        IssueStatus issueStatus = this.status;
        String str6 = this.statusDisplay;
        Integer num = this.statusColor;
        String str7 = this.statusReasonDisplay;
        IssueCreateSource issueCreateSource = this.source;
        String str8 = this.sourceDisplay;
        String str9 = this.createdBy;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.updatedAt;
        String str10 = this.parentId;
        String str11 = this.assetId;
        List<Issue> list = this.subtypes;
        WireServiceCenterCampaign wireServiceCenterCampaign = this.wireCampaign;
        IssueStatusReason issueStatusReason = this.statusReason;
        return "Issue(id=" + str + ", workOrderId=" + str2 + ", issueTypeId=" + str3 + ", display=" + str4 + ", description=" + str5 + ", status=" + issueStatus + ", statusDisplay=" + str6 + ", statusColor=" + num + ", statusReasonDisplay=" + str7 + ", source=" + issueCreateSource + ", sourceDisplay=" + str8 + ", createdBy=" + str9 + ", createdAt=" + dateTime + ", updatedAt=" + dateTime2 + ", parentId=" + str10 + ", assetId=" + str11 + ", subtypes=" + list + ", wireCampaign=" + wireServiceCenterCampaign + ", statusReason=" + issueStatusReason + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66598id);
        out.writeString(this.workOrderId);
        out.writeString(this.issueTypeId);
        out.writeString(this.display);
        out.writeString(this.description);
        IssueStatus issueStatus = this.status;
        if (issueStatus == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(issueStatus.name());
        }
        out.writeString(this.statusDisplay);
        Integer num = this.statusColor;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.statusReasonDisplay);
        IssueCreateSource issueCreateSource = this.source;
        if (issueCreateSource == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(issueCreateSource.name());
        }
        out.writeString(this.sourceDisplay);
        out.writeString(this.createdBy);
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.updatedAt);
        out.writeString(this.parentId);
        out.writeString(this.assetId);
        List<Issue> list = this.subtypes;
        out.writeInt(list.size());
        for (Issue issue : list) {
            issue.writeToParcel(out, i);
        }
        out.writeParcelable(this.wireCampaign, i);
        IssueStatusReason issueStatusReason = this.statusReason;
        if (issueStatusReason == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeString(issueStatusReason.name());
    }

    public Issue(String id, String workOrderId, String issueTypeId, String str, String str2, IssueStatus issueStatus, String str3, Integer num, String str4, IssueCreateSource issueCreateSource, String str5, String str6, DateTime dateTime, DateTime dateTime2, String str7, String str8, List<Issue> subtypes, WireServiceCenterCampaign wireServiceCenterCampaign, IssueStatusReason issueStatusReason) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(issueTypeId, "issueTypeId");
        Intrinsics.checkNotNullParameter(subtypes, "subtypes");
        this.f66598id = id;
        this.workOrderId = workOrderId;
        this.issueTypeId = issueTypeId;
        this.display = str;
        this.description = str2;
        this.status = issueStatus;
        this.statusDisplay = str3;
        this.statusColor = num;
        this.statusReasonDisplay = str4;
        this.source = issueCreateSource;
        this.sourceDisplay = str5;
        this.createdBy = str6;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.parentId = str7;
        this.assetId = str8;
        this.subtypes = subtypes;
        this.wireCampaign = wireServiceCenterCampaign;
        this.statusReason = issueStatusReason;
    }

    public /* synthetic */ Issue(String str, String str2, String str3, String str4, String str5, IssueStatus issueStatus, String str6, Integer num, String str7, IssueCreateSource issueCreateSource, String str8, String str9, DateTime dateTime, DateTime dateTime2, String str10, String str11, List list, WireServiceCenterCampaign wireServiceCenterCampaign, IssueStatusReason issueStatusReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : issueStatus, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : issueCreateSource, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : dateTime, (i & 8192) != 0 ? null : dateTime2, (i & 16384) != 0 ? null : str10, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : str11, (i & 65536) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : wireServiceCenterCampaign, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : issueStatusReason);
    }
}
