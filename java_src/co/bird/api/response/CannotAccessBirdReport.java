package co.bird.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.InaccessibleReason;
import co.bird.android.model.InaccessibleReportSource;
import co.bird.android.model.InaccessibleReportStatus;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0014HÆ\u0003J\t\u00106\u001a\u00020\u0016HÆ\u0003J\t\u00107\u001a\u00020\u0016HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003JÁ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\t\u0010B\u001a\u00020CHÖ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020CHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\u0019\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020CHÖ\u0001R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001b¨\u0006O"}, m28432d2 = {"Lco/bird/api/response/CannotAccessBirdReport;", "Landroid/os/Parcelable;", "id", "", "userId", "birdId", "bountyId", "role", "nearbyBirdIds", "", "notes", "location", "Lco/bird/android/model/wire/WireLocation;", "photoUrls", "reason", "Lco/bird/android/model/InaccessibleReason;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/InaccessibleReportSource;", "birdCount", "status", "Lco/bird/android/model/InaccessibleReportStatus;", "createdAt", "Lorg/joda/time/DateTime;", "updatedAt", "resolvedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/util/List;Lco/bird/android/model/InaccessibleReason;Lco/bird/android/model/InaccessibleReportSource;Ljava/lang/String;Lco/bird/android/model/InaccessibleReportStatus;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getBirdCount", "()Ljava/lang/String;", "getBirdId", "getBountyId", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getNearbyBirdIds", "()Ljava/util/List;", "getNotes", "getPhotoUrls", "getReason", "()Lco/bird/android/model/InaccessibleReason;", "getResolvedAt", "getRole", "getSource", "()Lco/bird/android/model/InaccessibleReportSource;", "getStatus", "()Lco/bird/android/model/InaccessibleReportStatus;", "getUpdatedAt", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CannotAccessBirdReport implements Parcelable {
    public static final Parcelable.Creator<CannotAccessBirdReport> CREATOR = new Creator();
    @JsonProperty("bird_count")
    @InterfaceC41208ft5("bird_count")
    private final String birdCount;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("bounty_id")
    @InterfaceC41208ft5("bounty_id")
    private final String bountyId;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68210id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("nearby_bird_ids")
    @InterfaceC41208ft5("nearby_bird_ids")
    private final List<String> nearbyBirdIds;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("photo_urls")
    @InterfaceC41208ft5("photo_urls")
    private final List<String> photoUrls;
    @JsonProperty("reason")
    @InterfaceC41208ft5("reason")
    private final InaccessibleReason reason;
    @JsonProperty("resolved_at")
    @InterfaceC41208ft5("resolved_at")
    private final DateTime resolvedAt;
    @JsonProperty("role")
    @InterfaceC41208ft5("role")
    private final String role;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final InaccessibleReportSource source;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final InaccessibleReportStatus status;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<CannotAccessBirdReport> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CannotAccessBirdReport createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CannotAccessBirdReport(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), (WireLocation) parcel.readParcelable(CannotAccessBirdReport.class.getClassLoader()), parcel.createStringArrayList(), InaccessibleReason.valueOf(parcel.readString()), (InaccessibleReportSource) parcel.readParcelable(CannotAccessBirdReport.class.getClassLoader()), parcel.readString(), InaccessibleReportStatus.valueOf(parcel.readString()), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CannotAccessBirdReport[] newArray(int i) {
            return new CannotAccessBirdReport[i];
        }
    }

    public CannotAccessBirdReport(String id, String userId, String birdId, String str, String str2, List<String> nearbyBirdIds, String str3, WireLocation location, List<String> list, InaccessibleReason reason, InaccessibleReportSource source, String str4, InaccessibleReportStatus status, DateTime createdAt, DateTime updatedAt, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(nearbyBirdIds, "nearbyBirdIds");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f68210id = id;
        this.userId = userId;
        this.birdId = birdId;
        this.bountyId = str;
        this.role = str2;
        this.nearbyBirdIds = nearbyBirdIds;
        this.notes = str3;
        this.location = location;
        this.photoUrls = list;
        this.reason = reason;
        this.source = source;
        this.birdCount = str4;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.resolvedAt = dateTime;
    }

    public final String component1() {
        return this.f68210id;
    }

    public final InaccessibleReason component10() {
        return this.reason;
    }

    public final InaccessibleReportSource component11() {
        return this.source;
    }

    public final String component12() {
        return this.birdCount;
    }

    public final InaccessibleReportStatus component13() {
        return this.status;
    }

    public final DateTime component14() {
        return this.createdAt;
    }

    public final DateTime component15() {
        return this.updatedAt;
    }

    public final DateTime component16() {
        return this.resolvedAt;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.birdId;
    }

    public final String component4() {
        return this.bountyId;
    }

    public final String component5() {
        return this.role;
    }

    public final List<String> component6() {
        return this.nearbyBirdIds;
    }

    public final String component7() {
        return this.notes;
    }

    public final WireLocation component8() {
        return this.location;
    }

    public final List<String> component9() {
        return this.photoUrls;
    }

    public final CannotAccessBirdReport copy(String id, String userId, String birdId, String str, String str2, List<String> nearbyBirdIds, String str3, WireLocation location, List<String> list, InaccessibleReason reason, InaccessibleReportSource source, String str4, InaccessibleReportStatus status, DateTime createdAt, DateTime updatedAt, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(nearbyBirdIds, "nearbyBirdIds");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new CannotAccessBirdReport(id, userId, birdId, str, str2, nearbyBirdIds, str3, location, list, reason, source, str4, status, createdAt, updatedAt, dateTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CannotAccessBirdReport) {
            CannotAccessBirdReport cannotAccessBirdReport = (CannotAccessBirdReport) obj;
            return Intrinsics.areEqual(this.f68210id, cannotAccessBirdReport.f68210id) && Intrinsics.areEqual(this.userId, cannotAccessBirdReport.userId) && Intrinsics.areEqual(this.birdId, cannotAccessBirdReport.birdId) && Intrinsics.areEqual(this.bountyId, cannotAccessBirdReport.bountyId) && Intrinsics.areEqual(this.role, cannotAccessBirdReport.role) && Intrinsics.areEqual(this.nearbyBirdIds, cannotAccessBirdReport.nearbyBirdIds) && Intrinsics.areEqual(this.notes, cannotAccessBirdReport.notes) && Intrinsics.areEqual(this.location, cannotAccessBirdReport.location) && Intrinsics.areEqual(this.photoUrls, cannotAccessBirdReport.photoUrls) && this.reason == cannotAccessBirdReport.reason && this.source == cannotAccessBirdReport.source && Intrinsics.areEqual(this.birdCount, cannotAccessBirdReport.birdCount) && this.status == cannotAccessBirdReport.status && Intrinsics.areEqual(this.createdAt, cannotAccessBirdReport.createdAt) && Intrinsics.areEqual(this.updatedAt, cannotAccessBirdReport.updatedAt) && Intrinsics.areEqual(this.resolvedAt, cannotAccessBirdReport.resolvedAt);
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

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f68210id;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final List<String> getNearbyBirdIds() {
        return this.nearbyBirdIds;
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

    public final DateTime getResolvedAt() {
        return this.resolvedAt;
    }

    public final String getRole() {
        return this.role;
    }

    public final InaccessibleReportSource getSource() {
        return this.source;
    }

    public final InaccessibleReportStatus getStatus() {
        return this.status;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((this.f68210id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.birdId.hashCode()) * 31;
        String str = this.bountyId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.role;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.nearbyBirdIds.hashCode()) * 31;
        String str3 = this.notes;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.location.hashCode()) * 31;
        List<String> list = this.photoUrls;
        int hashCode5 = (((((hashCode4 + (list == null ? 0 : list.hashCode())) * 31) + this.reason.hashCode()) * 31) + this.source.hashCode()) * 31;
        String str4 = this.birdCount;
        int hashCode6 = (((((((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.status.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31;
        DateTime dateTime = this.resolvedAt;
        return hashCode6 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        String str = this.f68210id;
        String str2 = this.userId;
        String str3 = this.birdId;
        String str4 = this.bountyId;
        String str5 = this.role;
        List<String> list = this.nearbyBirdIds;
        String str6 = this.notes;
        WireLocation wireLocation = this.location;
        List<String> list2 = this.photoUrls;
        InaccessibleReason inaccessibleReason = this.reason;
        InaccessibleReportSource inaccessibleReportSource = this.source;
        String str7 = this.birdCount;
        InaccessibleReportStatus inaccessibleReportStatus = this.status;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.updatedAt;
        DateTime dateTime3 = this.resolvedAt;
        return "CannotAccessBirdReport(id=" + str + ", userId=" + str2 + ", birdId=" + str3 + ", bountyId=" + str4 + ", role=" + str5 + ", nearbyBirdIds=" + list + ", notes=" + str6 + ", location=" + wireLocation + ", photoUrls=" + list2 + ", reason=" + inaccessibleReason + ", source=" + inaccessibleReportSource + ", birdCount=" + str7 + ", status=" + inaccessibleReportStatus + ", createdAt=" + dateTime + ", updatedAt=" + dateTime2 + ", resolvedAt=" + dateTime3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f68210id);
        out.writeString(this.userId);
        out.writeString(this.birdId);
        out.writeString(this.bountyId);
        out.writeString(this.role);
        out.writeStringList(this.nearbyBirdIds);
        out.writeString(this.notes);
        out.writeParcelable(this.location, i);
        out.writeStringList(this.photoUrls);
        out.writeString(this.reason.name());
        out.writeParcelable(this.source, i);
        out.writeString(this.birdCount);
        out.writeString(this.status.name());
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.updatedAt);
        out.writeSerializable(this.resolvedAt);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CannotAccessBirdReport(String str, String str2, String str3, String str4, String str5, List list, String str6, WireLocation wireLocation, List list2, InaccessibleReason inaccessibleReason, InaccessibleReportSource inaccessibleReportSource, String str7, InaccessibleReportStatus inaccessibleReportStatus, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, r7, r8, r9, r10, wireLocation, r12, inaccessibleReason, inaccessibleReportSource, r15, inaccessibleReportStatus, r17, r18, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : dateTime3);
        List list3;
        DateTime dateTime4;
        DateTime dateTime5;
        List emptyList;
        String str8 = (i & 1) != 0 ? "" : str;
        String str9 = (i & 2) != 0 ? "" : str2;
        String str10 = (i & 4) != 0 ? "" : str3;
        String str11 = (i & 8) != 0 ? null : str4;
        String str12 = (i & 16) != 0 ? null : str5;
        if ((i & 32) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list3 = emptyList;
        } else {
            list3 = list;
        }
        String str13 = (i & 64) != 0 ? null : str6;
        List list4 = (i & 256) != 0 ? null : list2;
        String str14 = (i & 2048) != 0 ? null : str7;
        if ((i & 8192) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime4 = now;
        } else {
            dateTime4 = dateTime;
        }
        if ((i & 16384) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime5 = now2;
        } else {
            dateTime5 = dateTime2;
        }
    }
}
