package co.bird.api.request;

import co.bird.android.model.InaccessibleReason;
import co.bird.android.model.InaccessibleReportSource;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008a\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0010HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, m28432d2 = {"Lco/bird/api/request/CannotAccessReportRequest;", "", "birdId", "", "bountyId", "reason", "Lco/bird/android/model/InaccessibleReason;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/InaccessibleReportSource;", "role", "nearbyIdentifiers", "", "notes", "photoUrls", "birdCount", "scanTimeInSeconds", "", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/InaccessibleReason;Lco/bird/android/model/InaccessibleReportSource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "getBirdCount", "()Ljava/lang/String;", "getBirdId", "getBountyId", "getNearbyIdentifiers", "()Ljava/util/List;", "getNotes", "getPhotoUrls", "getReason", "()Lco/bird/android/model/InaccessibleReason;", "getRole", "getScanTimeInSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSource", "()Lco/bird/android/model/InaccessibleReportSource;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/InaccessibleReason;Lco/bird/android/model/InaccessibleReportSource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lco/bird/api/request/CannotAccessReportRequest;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CannotAccessReportRequest {
    @JsonProperty("bird_count")
    @InterfaceC41208ft5("bird_count")
    private final String birdCount;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("bounty_id")
    @InterfaceC41208ft5("bounty_id")
    private final String bountyId;
    @JsonProperty("nearby_identifiers")
    @InterfaceC41208ft5("nearby_identifiers")
    private final List<String> nearbyIdentifiers;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("photo_urls")
    @InterfaceC41208ft5("photo_urls")
    private final List<String> photoUrls;
    @JsonProperty("reason")
    @InterfaceC41208ft5("reason")
    private final InaccessibleReason reason;
    @JsonProperty("role")
    @InterfaceC41208ft5("role")
    private final String role;
    @JsonProperty("scan_time_in_seconds")
    @InterfaceC41208ft5("scan_time_in_seconds")
    private final Integer scanTimeInSeconds;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final InaccessibleReportSource source;

    public CannotAccessReportRequest(String birdId, String str, InaccessibleReason reason, InaccessibleReportSource source, String str2, List<String> nearbyIdentifiers, String str3, List<String> list, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(nearbyIdentifiers, "nearbyIdentifiers");
        this.birdId = birdId;
        this.bountyId = str;
        this.reason = reason;
        this.source = source;
        this.role = str2;
        this.nearbyIdentifiers = nearbyIdentifiers;
        this.notes = str3;
        this.photoUrls = list;
        this.birdCount = str4;
        this.scanTimeInSeconds = num;
    }

    public final String component1() {
        return this.birdId;
    }

    public final Integer component10() {
        return this.scanTimeInSeconds;
    }

    public final String component2() {
        return this.bountyId;
    }

    public final InaccessibleReason component3() {
        return this.reason;
    }

    public final InaccessibleReportSource component4() {
        return this.source;
    }

    public final String component5() {
        return this.role;
    }

    public final List<String> component6() {
        return this.nearbyIdentifiers;
    }

    public final String component7() {
        return this.notes;
    }

    public final List<String> component8() {
        return this.photoUrls;
    }

    public final String component9() {
        return this.birdCount;
    }

    public final CannotAccessReportRequest copy(String birdId, String str, InaccessibleReason reason, InaccessibleReportSource source, String str2, List<String> nearbyIdentifiers, String str3, List<String> list, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(nearbyIdentifiers, "nearbyIdentifiers");
        return new CannotAccessReportRequest(birdId, str, reason, source, str2, nearbyIdentifiers, str3, list, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CannotAccessReportRequest) {
            CannotAccessReportRequest cannotAccessReportRequest = (CannotAccessReportRequest) obj;
            return Intrinsics.areEqual(this.birdId, cannotAccessReportRequest.birdId) && Intrinsics.areEqual(this.bountyId, cannotAccessReportRequest.bountyId) && this.reason == cannotAccessReportRequest.reason && this.source == cannotAccessReportRequest.source && Intrinsics.areEqual(this.role, cannotAccessReportRequest.role) && Intrinsics.areEqual(this.nearbyIdentifiers, cannotAccessReportRequest.nearbyIdentifiers) && Intrinsics.areEqual(this.notes, cannotAccessReportRequest.notes) && Intrinsics.areEqual(this.photoUrls, cannotAccessReportRequest.photoUrls) && Intrinsics.areEqual(this.birdCount, cannotAccessReportRequest.birdCount) && Intrinsics.areEqual(this.scanTimeInSeconds, cannotAccessReportRequest.scanTimeInSeconds);
        }
        return false;
    }

    public final String getBirdCount() {
        return this.birdCount;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getBountyId() {
        return this.bountyId;
    }

    public final List<String> getNearbyIdentifiers() {
        return this.nearbyIdentifiers;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final List<String> getPhotoUrls() {
        return this.photoUrls;
    }

    public final InaccessibleReason getReason() {
        return this.reason;
    }

    public final String getRole() {
        return this.role;
    }

    public final Integer getScanTimeInSeconds() {
        return this.scanTimeInSeconds;
    }

    public final InaccessibleReportSource getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode = this.birdId.hashCode() * 31;
        String str = this.bountyId;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.reason.hashCode()) * 31) + this.source.hashCode()) * 31;
        String str2 = this.role;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.nearbyIdentifiers.hashCode()) * 31;
        String str3 = this.notes;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.photoUrls;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.birdCount;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.scanTimeInSeconds;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.bountyId;
        InaccessibleReason inaccessibleReason = this.reason;
        InaccessibleReportSource inaccessibleReportSource = this.source;
        String str3 = this.role;
        List<String> list = this.nearbyIdentifiers;
        String str4 = this.notes;
        List<String> list2 = this.photoUrls;
        String str5 = this.birdCount;
        Integer num = this.scanTimeInSeconds;
        return "CannotAccessReportRequest(birdId=" + str + ", bountyId=" + str2 + ", reason=" + inaccessibleReason + ", source=" + inaccessibleReportSource + ", role=" + str3 + ", nearbyIdentifiers=" + list + ", notes=" + str4 + ", photoUrls=" + list2 + ", birdCount=" + str5 + ", scanTimeInSeconds=" + num + ")";
    }

    public /* synthetic */ CannotAccessReportRequest(String str, String str2, InaccessibleReason inaccessibleReason, InaccessibleReportSource inaccessibleReportSource, String str3, List list, String str4, List list2, String str5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, inaccessibleReason, inaccessibleReportSource, (i & 16) != 0 ? null : str3, list, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : num);
    }
}
