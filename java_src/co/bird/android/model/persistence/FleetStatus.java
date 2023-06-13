package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.FleetStatusContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u0006."}, m28432d2 = {"Lco/bird/android/model/persistence/FleetStatus;", "", "id", "", "fleetId", "", "title", "predictionId", "label", "showBackButton", "", "backButtonLabel", "content", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusContent;", "createdAt", "Lorg/joda/time/DateTime;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FleetStatusContent;Lorg/joda/time/DateTime;)V", "getBackButtonLabel", "()Ljava/lang/String;", "getContent", "()Lco/bird/android/model/persistence/nestedstructures/FleetStatusContent;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getFleetId", "getId", "()J", "getLabel", "getPredictionId", "getShowBackButton", "()Z", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetStatus {
    private final String backButtonLabel;
    private final FleetStatusContent content;
    private final DateTime createdAt;
    private final String fleetId;

    /* renamed from: id */
    private final long f66676id;
    private final String label;
    private final String predictionId;
    private final boolean showBackButton;
    private final String title;

    public FleetStatus(long j, String fleetId, String str, String str2, String str3, boolean z, String str4, FleetStatusContent fleetStatusContent, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66676id = j;
        this.fleetId = fleetId;
        this.title = str;
        this.predictionId = str2;
        this.label = str3;
        this.showBackButton = z;
        this.backButtonLabel = str4;
        this.content = fleetStatusContent;
        this.createdAt = createdAt;
    }

    public final long component1() {
        return this.f66676id;
    }

    public final String component2() {
        return this.fleetId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.predictionId;
    }

    public final String component5() {
        return this.label;
    }

    public final boolean component6() {
        return this.showBackButton;
    }

    public final String component7() {
        return this.backButtonLabel;
    }

    public final FleetStatusContent component8() {
        return this.content;
    }

    public final DateTime component9() {
        return this.createdAt;
    }

    public final FleetStatus copy(long j, String fleetId, String str, String str2, String str3, boolean z, String str4, FleetStatusContent fleetStatusContent, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new FleetStatus(j, fleetId, str, str2, str3, z, str4, fleetStatusContent, createdAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetStatus) {
            FleetStatus fleetStatus = (FleetStatus) obj;
            return this.f66676id == fleetStatus.f66676id && Intrinsics.areEqual(this.fleetId, fleetStatus.fleetId) && Intrinsics.areEqual(this.title, fleetStatus.title) && Intrinsics.areEqual(this.predictionId, fleetStatus.predictionId) && Intrinsics.areEqual(this.label, fleetStatus.label) && this.showBackButton == fleetStatus.showBackButton && Intrinsics.areEqual(this.backButtonLabel, fleetStatus.backButtonLabel) && Intrinsics.areEqual(this.content, fleetStatus.content) && Intrinsics.areEqual(this.createdAt, fleetStatus.createdAt);
        }
        return false;
    }

    public final String getBackButtonLabel() {
        return this.backButtonLabel;
    }

    public final FleetStatusContent getContent() {
        return this.content;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getFleetId() {
        return this.fleetId;
    }

    public final long getId() {
        return this.f66676id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPredictionId() {
        return this.predictionId;
    }

    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Long.hashCode(this.f66676id) * 31) + this.fleetId.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.predictionId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.showBackButton;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        String str4 = this.backButtonLabel;
        int hashCode5 = (i2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FleetStatusContent fleetStatusContent = this.content;
        return ((hashCode5 + (fleetStatusContent != null ? fleetStatusContent.hashCode() : 0)) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        long j = this.f66676id;
        String str = this.fleetId;
        String str2 = this.title;
        String str3 = this.predictionId;
        String str4 = this.label;
        boolean z = this.showBackButton;
        String str5 = this.backButtonLabel;
        FleetStatusContent fleetStatusContent = this.content;
        DateTime dateTime = this.createdAt;
        return "FleetStatus(id=" + j + ", fleetId=" + str + ", title=" + str2 + ", predictionId=" + str3 + ", label=" + str4 + ", showBackButton=" + z + ", backButtonLabel=" + str5 + ", content=" + fleetStatusContent + ", createdAt=" + dateTime + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FleetStatus(long j, String str, String str2, String str3, String str4, boolean z, String str5, FleetStatusContent fleetStatusContent, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, str, r7, r8, r9, r10, r11, r12, r13);
        DateTime dateTime2;
        long j2 = (i & 1) != 0 ? 0L : j;
        String str6 = (i & 4) != 0 ? null : str2;
        String str7 = (i & 8) != 0 ? null : str3;
        String str8 = (i & 16) != 0 ? null : str4;
        boolean z2 = (i & 32) != 0 ? false : z;
        String str9 = (i & 64) != 0 ? null : str5;
        FleetStatusContent fleetStatusContent2 = (i & 128) != 0 ? null : fleetStatusContent;
        if ((i & 256) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime2 = now;
        } else {
            dateTime2 = dateTime;
        }
    }
}
