package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Point;
import co.bird.android.model.constant.BountyFlightSheetActionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jg\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, m28432d2 = {"Lco/bird/android/model/wire/WireBountyFlightSheetAction;", "", "type", "Lco/bird/android/model/constant/BountyFlightSheetActionType;", "surplusId", "", "complaintIds", "", "bountyIds", "navigationLocation", "Lco/bird/android/model/Point;", "acceptDestinationConfirmationTitle", "acceptDestinationConfirmationBody", "(Lco/bird/android/model/constant/BountyFlightSheetActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/Point;Ljava/lang/String;Ljava/lang/String;)V", "getAcceptDestinationConfirmationBody", "()Ljava/lang/String;", "getAcceptDestinationConfirmationTitle", "getBountyIds", "()Ljava/util/List;", "getComplaintIds", "getNavigationLocation", "()Lco/bird/android/model/Point;", "getSurplusId", "getType", "()Lco/bird/android/model/constant/BountyFlightSheetActionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBountyFlightSheetAction {
    @JsonProperty("accept_designation_confirmation_body")
    @InterfaceC41208ft5("accept_designation_confirmation_body")
    private final String acceptDestinationConfirmationBody;
    @JsonProperty("accept_designation_confirmation_title")
    @InterfaceC41208ft5("accept_designation_confirmation_title")
    private final String acceptDestinationConfirmationTitle;
    @JsonProperty("bounty_ids")
    @InterfaceC41208ft5("bounty_ids")
    private final List<String> bountyIds;
    @JsonProperty("complaint_ids")
    @InterfaceC41208ft5("complaint_ids")
    private final List<String> complaintIds;
    @JsonProperty("navigation_location")
    @InterfaceC41208ft5("navigation_location")
    private final Point navigationLocation;
    @JsonProperty("surplus_id")
    @InterfaceC41208ft5("surplus_id")
    private final String surplusId;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final BountyFlightSheetActionType type;

    public WireBountyFlightSheetAction(BountyFlightSheetActionType type, String str, List<String> list, List<String> list2, Point point, String str2, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.surplusId = str;
        this.complaintIds = list;
        this.bountyIds = list2;
        this.navigationLocation = point;
        this.acceptDestinationConfirmationTitle = str2;
        this.acceptDestinationConfirmationBody = str3;
    }

    public static /* synthetic */ WireBountyFlightSheetAction copy$default(WireBountyFlightSheetAction wireBountyFlightSheetAction, BountyFlightSheetActionType bountyFlightSheetActionType, String str, List list, List list2, Point point, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bountyFlightSheetActionType = wireBountyFlightSheetAction.type;
        }
        if ((i & 2) != 0) {
            str = wireBountyFlightSheetAction.surplusId;
        }
        String str4 = str;
        List<String> list3 = list;
        if ((i & 4) != 0) {
            list3 = wireBountyFlightSheetAction.complaintIds;
        }
        List list4 = list3;
        List<String> list5 = list2;
        if ((i & 8) != 0) {
            list5 = wireBountyFlightSheetAction.bountyIds;
        }
        List list6 = list5;
        if ((i & 16) != 0) {
            point = wireBountyFlightSheetAction.navigationLocation;
        }
        Point point2 = point;
        if ((i & 32) != 0) {
            str2 = wireBountyFlightSheetAction.acceptDestinationConfirmationTitle;
        }
        String str5 = str2;
        if ((i & 64) != 0) {
            str3 = wireBountyFlightSheetAction.acceptDestinationConfirmationBody;
        }
        return wireBountyFlightSheetAction.copy(bountyFlightSheetActionType, str4, list4, list6, point2, str5, str3);
    }

    public final BountyFlightSheetActionType component1() {
        return this.type;
    }

    public final String component2() {
        return this.surplusId;
    }

    public final List<String> component3() {
        return this.complaintIds;
    }

    public final List<String> component4() {
        return this.bountyIds;
    }

    public final Point component5() {
        return this.navigationLocation;
    }

    public final String component6() {
        return this.acceptDestinationConfirmationTitle;
    }

    public final String component7() {
        return this.acceptDestinationConfirmationBody;
    }

    public final WireBountyFlightSheetAction copy(BountyFlightSheetActionType type, String str, List<String> list, List<String> list2, Point point, String str2, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new WireBountyFlightSheetAction(type, str, list, list2, point, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBountyFlightSheetAction) {
            WireBountyFlightSheetAction wireBountyFlightSheetAction = (WireBountyFlightSheetAction) obj;
            return this.type == wireBountyFlightSheetAction.type && Intrinsics.areEqual(this.surplusId, wireBountyFlightSheetAction.surplusId) && Intrinsics.areEqual(this.complaintIds, wireBountyFlightSheetAction.complaintIds) && Intrinsics.areEqual(this.bountyIds, wireBountyFlightSheetAction.bountyIds) && Intrinsics.areEqual(this.navigationLocation, wireBountyFlightSheetAction.navigationLocation) && Intrinsics.areEqual(this.acceptDestinationConfirmationTitle, wireBountyFlightSheetAction.acceptDestinationConfirmationTitle) && Intrinsics.areEqual(this.acceptDestinationConfirmationBody, wireBountyFlightSheetAction.acceptDestinationConfirmationBody);
        }
        return false;
    }

    public final String getAcceptDestinationConfirmationBody() {
        return this.acceptDestinationConfirmationBody;
    }

    public final String getAcceptDestinationConfirmationTitle() {
        return this.acceptDestinationConfirmationTitle;
    }

    public final List<String> getBountyIds() {
        return this.bountyIds;
    }

    public final List<String> getComplaintIds() {
        return this.complaintIds;
    }

    public final Point getNavigationLocation() {
        return this.navigationLocation;
    }

    public final String getSurplusId() {
        return this.surplusId;
    }

    public final BountyFlightSheetActionType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.surplusId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.complaintIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.bountyIds;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Point point = this.navigationLocation;
        int hashCode5 = (hashCode4 + (point == null ? 0 : point.hashCode())) * 31;
        String str2 = this.acceptDestinationConfirmationTitle;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.acceptDestinationConfirmationBody;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        BountyFlightSheetActionType bountyFlightSheetActionType = this.type;
        String str = this.surplusId;
        List<String> list = this.complaintIds;
        List<String> list2 = this.bountyIds;
        Point point = this.navigationLocation;
        String str2 = this.acceptDestinationConfirmationTitle;
        String str3 = this.acceptDestinationConfirmationBody;
        return "WireBountyFlightSheetAction(type=" + bountyFlightSheetActionType + ", surplusId=" + str + ", complaintIds=" + list + ", bountyIds=" + list2 + ", navigationLocation=" + point + ", acceptDestinationConfirmationTitle=" + str2 + ", acceptDestinationConfirmationBody=" + str3 + ")";
    }

    public /* synthetic */ WireBountyFlightSheetAction(BountyFlightSheetActionType bountyFlightSheetActionType, String str, List list, List list2, Point point, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bountyFlightSheetActionType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : point, (i & 32) != 0 ? null : str2, (i & 64) == 0 ? str3 : null);
    }
}
