package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003Jg\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006("}, m28432d2 = {"Lco/bird/api/request/IssueBody;", "", "issues", "", "Lco/bird/api/request/IssueFlowWithKind;", "birdId", "", "feedback", "photoUrls", "qrReplacementNeeded", "", "canTestRide", "testRideSuccess", "location", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getCanTestRide", "()Z", "getFeedback", "getIssues", "()Ljava/util/List;", "getLocation", "getPhotoUrls", "getQrReplacementNeeded", "getTestRideSuccess", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IssueBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("can_test_ride")
    @InterfaceC41208ft5("can_test_ride")
    private final boolean canTestRide;
    @JsonProperty("feedback")
    @InterfaceC41208ft5("feedback")
    private final String feedback;
    @JsonProperty("issues")
    @InterfaceC41208ft5("issues")
    private final List<IssueFlowWithKind> issues;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final String location;
    @JsonProperty("photo_urls")
    @InterfaceC41208ft5("photo_urls")
    private final List<String> photoUrls;
    @JsonProperty("qr_replacement_needed")
    @InterfaceC41208ft5("qr_replacement_needed")
    private final boolean qrReplacementNeeded;
    @JsonProperty("test_ride_success")
    @InterfaceC41208ft5("test_ride_success")
    private final boolean testRideSuccess;

    public IssueBody(List<IssueFlowWithKind> issues, String birdId, String str, List<String> photoUrls, boolean z, boolean z2, boolean z3, String location) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(photoUrls, "photoUrls");
        Intrinsics.checkNotNullParameter(location, "location");
        this.issues = issues;
        this.birdId = birdId;
        this.feedback = str;
        this.photoUrls = photoUrls;
        this.qrReplacementNeeded = z;
        this.canTestRide = z2;
        this.testRideSuccess = z3;
        this.location = location;
    }

    public final List<IssueFlowWithKind> component1() {
        return this.issues;
    }

    public final String component2() {
        return this.birdId;
    }

    public final String component3() {
        return this.feedback;
    }

    public final List<String> component4() {
        return this.photoUrls;
    }

    public final boolean component5() {
        return this.qrReplacementNeeded;
    }

    public final boolean component6() {
        return this.canTestRide;
    }

    public final boolean component7() {
        return this.testRideSuccess;
    }

    public final String component8() {
        return this.location;
    }

    public final IssueBody copy(List<IssueFlowWithKind> issues, String birdId, String str, List<String> photoUrls, boolean z, boolean z2, boolean z3, String location) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(photoUrls, "photoUrls");
        Intrinsics.checkNotNullParameter(location, "location");
        return new IssueBody(issues, birdId, str, photoUrls, z, z2, z3, location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IssueBody) {
            IssueBody issueBody = (IssueBody) obj;
            return Intrinsics.areEqual(this.issues, issueBody.issues) && Intrinsics.areEqual(this.birdId, issueBody.birdId) && Intrinsics.areEqual(this.feedback, issueBody.feedback) && Intrinsics.areEqual(this.photoUrls, issueBody.photoUrls) && this.qrReplacementNeeded == issueBody.qrReplacementNeeded && this.canTestRide == issueBody.canTestRide && this.testRideSuccess == issueBody.testRideSuccess && Intrinsics.areEqual(this.location, issueBody.location);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final boolean getCanTestRide() {
        return this.canTestRide;
    }

    public final String getFeedback() {
        return this.feedback;
    }

    public final List<IssueFlowWithKind> getIssues() {
        return this.issues;
    }

    public final String getLocation() {
        return this.location;
    }

    public final List<String> getPhotoUrls() {
        return this.photoUrls;
    }

    public final boolean getQrReplacementNeeded() {
        return this.qrReplacementNeeded;
    }

    public final boolean getTestRideSuccess() {
        return this.testRideSuccess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.issues.hashCode() * 31) + this.birdId.hashCode()) * 31;
        String str = this.feedback;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.photoUrls.hashCode()) * 31;
        boolean z = this.qrReplacementNeeded;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.canTestRide;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.testRideSuccess;
        return ((i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + this.location.hashCode();
    }

    public String toString() {
        List<IssueFlowWithKind> list = this.issues;
        String str = this.birdId;
        String str2 = this.feedback;
        List<String> list2 = this.photoUrls;
        boolean z = this.qrReplacementNeeded;
        boolean z2 = this.canTestRide;
        boolean z3 = this.testRideSuccess;
        String str3 = this.location;
        return "IssueBody(issues=" + list + ", birdId=" + str + ", feedback=" + str2 + ", photoUrls=" + list2 + ", qrReplacementNeeded=" + z + ", canTestRide=" + z2 + ", testRideSuccess=" + z3 + ", location=" + str3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IssueBody(List list, String str, String str2, List list2, boolean z, boolean z2, boolean z3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r2, str, r4, r5, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, str3);
        List list3;
        List list4;
        List emptyList;
        List emptyList2;
        if ((i & 1) != 0) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            list3 = emptyList2;
        } else {
            list3 = list;
        }
        String str4 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list4 = emptyList;
        } else {
            list4 = list2;
        }
    }
}
