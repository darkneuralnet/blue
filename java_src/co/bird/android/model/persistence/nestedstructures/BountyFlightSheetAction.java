package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Point;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "", "AcceptDesignation", "CancelDesignation", "Capture", "Navigate", "RecheckSurplus", "ResolveComplaint", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$Capture;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$Navigate;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$RecheckSurplus;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$ResolveComplaint;", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public interface BountyFlightSheetAction {

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "acceptDestinationConfirmationTitle", "", "acceptDestinationConfirmationBody", "bountyIds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAcceptDestinationConfirmationBody", "()Ljava/lang/String;", "getAcceptDestinationConfirmationTitle", "getBountyIds", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class AcceptDesignation implements BountyFlightSheetAction {
        @JsonProperty("accept_designation_confirmation_body")
        @InterfaceC41208ft5("accept_designation_confirmation_body")
        private final String acceptDestinationConfirmationBody;
        @JsonProperty("accept_designation_confirmation_title")
        @InterfaceC41208ft5("accept_designation_confirmation_title")
        private final String acceptDestinationConfirmationTitle;
        @JsonProperty("bounty_ids")
        @InterfaceC41208ft5("bounty_ids")
        private final List<String> bountyIds;

        public AcceptDesignation(String acceptDestinationConfirmationTitle, String acceptDestinationConfirmationBody, List<String> bountyIds) {
            Intrinsics.checkNotNullParameter(acceptDestinationConfirmationTitle, "acceptDestinationConfirmationTitle");
            Intrinsics.checkNotNullParameter(acceptDestinationConfirmationBody, "acceptDestinationConfirmationBody");
            Intrinsics.checkNotNullParameter(bountyIds, "bountyIds");
            this.acceptDestinationConfirmationTitle = acceptDestinationConfirmationTitle;
            this.acceptDestinationConfirmationBody = acceptDestinationConfirmationBody;
            this.bountyIds = bountyIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AcceptDesignation copy$default(AcceptDesignation acceptDesignation, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = acceptDesignation.acceptDestinationConfirmationTitle;
            }
            if ((i & 2) != 0) {
                str2 = acceptDesignation.acceptDestinationConfirmationBody;
            }
            if ((i & 4) != 0) {
                list = acceptDesignation.bountyIds;
            }
            return acceptDesignation.copy(str, str2, list);
        }

        public final String component1() {
            return this.acceptDestinationConfirmationTitle;
        }

        public final String component2() {
            return this.acceptDestinationConfirmationBody;
        }

        public final List<String> component3() {
            return this.bountyIds;
        }

        public final AcceptDesignation copy(String acceptDestinationConfirmationTitle, String acceptDestinationConfirmationBody, List<String> bountyIds) {
            Intrinsics.checkNotNullParameter(acceptDestinationConfirmationTitle, "acceptDestinationConfirmationTitle");
            Intrinsics.checkNotNullParameter(acceptDestinationConfirmationBody, "acceptDestinationConfirmationBody");
            Intrinsics.checkNotNullParameter(bountyIds, "bountyIds");
            return new AcceptDesignation(acceptDestinationConfirmationTitle, acceptDestinationConfirmationBody, bountyIds);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AcceptDesignation) {
                AcceptDesignation acceptDesignation = (AcceptDesignation) obj;
                return Intrinsics.areEqual(this.acceptDestinationConfirmationTitle, acceptDesignation.acceptDestinationConfirmationTitle) && Intrinsics.areEqual(this.acceptDestinationConfirmationBody, acceptDesignation.acceptDestinationConfirmationBody) && Intrinsics.areEqual(this.bountyIds, acceptDesignation.bountyIds);
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

        public int hashCode() {
            return (((this.acceptDestinationConfirmationTitle.hashCode() * 31) + this.acceptDestinationConfirmationBody.hashCode()) * 31) + this.bountyIds.hashCode();
        }

        public String toString() {
            String str = this.acceptDestinationConfirmationTitle;
            String str2 = this.acceptDestinationConfirmationBody;
            List<String> list = this.bountyIds;
            return "AcceptDesignation(acceptDestinationConfirmationTitle=" + str + ", acceptDestinationConfirmationBody=" + str2 + ", bountyIds=" + list + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "bountyIds", "", "", "(Ljava/util/List;)V", "getBountyIds", "()Ljava/util/List;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class CancelDesignation implements BountyFlightSheetAction {
        @JsonProperty("bounty_ids")
        @InterfaceC41208ft5("bounty_ids")
        private final List<String> bountyIds;

        public CancelDesignation(List<String> bountyIds) {
            Intrinsics.checkNotNullParameter(bountyIds, "bountyIds");
            this.bountyIds = bountyIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CancelDesignation copy$default(CancelDesignation cancelDesignation, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = cancelDesignation.bountyIds;
            }
            return cancelDesignation.copy(list);
        }

        public final List<String> component1() {
            return this.bountyIds;
        }

        public final CancelDesignation copy(List<String> bountyIds) {
            Intrinsics.checkNotNullParameter(bountyIds, "bountyIds");
            return new CancelDesignation(bountyIds);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CancelDesignation) && Intrinsics.areEqual(this.bountyIds, ((CancelDesignation) obj).bountyIds);
        }

        public final List<String> getBountyIds() {
            return this.bountyIds;
        }

        public int hashCode() {
            return this.bountyIds.hashCode();
        }

        public String toString() {
            List<String> list = this.bountyIds;
            return "CancelDesignation(bountyIds=" + list + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$Capture;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "()V", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Capture implements BountyFlightSheetAction {
        public static final Capture INSTANCE = new Capture();

        private Capture() {
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$Navigate;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "navigationLocation", "Lco/bird/android/model/Point;", "(Lco/bird/android/model/Point;)V", "getNavigationLocation", "()Lco/bird/android/model/Point;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Navigate implements BountyFlightSheetAction {
        @JsonProperty("navigation_location")
        @InterfaceC41208ft5("navigation_location")
        private final Point navigationLocation;

        public Navigate(Point navigationLocation) {
            Intrinsics.checkNotNullParameter(navigationLocation, "navigationLocation");
            this.navigationLocation = navigationLocation;
        }

        public static /* synthetic */ Navigate copy$default(Navigate navigate, Point point, int i, Object obj) {
            if ((i & 1) != 0) {
                point = navigate.navigationLocation;
            }
            return navigate.copy(point);
        }

        public final Point component1() {
            return this.navigationLocation;
        }

        public final Navigate copy(Point navigationLocation) {
            Intrinsics.checkNotNullParameter(navigationLocation, "navigationLocation");
            return new Navigate(navigationLocation);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Navigate) && Intrinsics.areEqual(this.navigationLocation, ((Navigate) obj).navigationLocation);
        }

        public final Point getNavigationLocation() {
            return this.navigationLocation;
        }

        public int hashCode() {
            return this.navigationLocation.hashCode();
        }

        public String toString() {
            Point point = this.navigationLocation;
            return "Navigate(navigationLocation=" + point + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$RecheckSurplus;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "surplusId", "", "(Ljava/lang/String;)V", "getSurplusId", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class RecheckSurplus implements BountyFlightSheetAction {
        @JsonProperty("surplus_id")
        @InterfaceC41208ft5("surplus_id")
        private final String surplusId;

        public RecheckSurplus(String surplusId) {
            Intrinsics.checkNotNullParameter(surplusId, "surplusId");
            this.surplusId = surplusId;
        }

        public static /* synthetic */ RecheckSurplus copy$default(RecheckSurplus recheckSurplus, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = recheckSurplus.surplusId;
            }
            return recheckSurplus.copy(str);
        }

        public final String component1() {
            return this.surplusId;
        }

        public final RecheckSurplus copy(String surplusId) {
            Intrinsics.checkNotNullParameter(surplusId, "surplusId");
            return new RecheckSurplus(surplusId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecheckSurplus) && Intrinsics.areEqual(this.surplusId, ((RecheckSurplus) obj).surplusId);
        }

        public final String getSurplusId() {
            return this.surplusId;
        }

        public int hashCode() {
            return this.surplusId.hashCode();
        }

        public String toString() {
            String str = this.surplusId;
            return "RecheckSurplus(surplusId=" + str + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$ResolveComplaint;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "complaintIds", "", "", "(Ljava/util/List;)V", "getComplaintIds", "()Ljava/util/List;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class ResolveComplaint implements BountyFlightSheetAction {
        @JsonProperty("complaint_ids")
        @InterfaceC41208ft5("complaint_ids")
        private final List<String> complaintIds;

        public ResolveComplaint(List<String> complaintIds) {
            Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
            this.complaintIds = complaintIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ResolveComplaint copy$default(ResolveComplaint resolveComplaint, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = resolveComplaint.complaintIds;
            }
            return resolveComplaint.copy(list);
        }

        public final List<String> component1() {
            return this.complaintIds;
        }

        public final ResolveComplaint copy(List<String> complaintIds) {
            Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
            return new ResolveComplaint(complaintIds);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResolveComplaint) && Intrinsics.areEqual(this.complaintIds, ((ResolveComplaint) obj).complaintIds);
        }

        public final List<String> getComplaintIds() {
            return this.complaintIds;
        }

        public int hashCode() {
            return this.complaintIds.hashCode();
        }

        public String toString() {
            List<String> list = this.complaintIds;
            return "ResolveComplaint(complaintIds=" + list + ")";
        }
    }
}
