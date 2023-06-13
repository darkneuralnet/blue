package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, m28432d2 = {"Lco/bird/api/request/DamageReportBody;", "", "birdId", "", "qrCodeDamaged", "", "damaged", "comments", "birdPhotoUrl", "location", "Lco/bird/android/model/wire/WireLocation;", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;)V", "getBirdId", "()Ljava/lang/String;", "getBirdPhotoUrl", "getComments", "getDamaged", "()Z", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getQrCodeDamaged", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DamageReportBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("bird_photo_url")
    @InterfaceC41208ft5("bird_photo_url")
    private final String birdPhotoUrl;
    @JsonProperty("comments")
    @InterfaceC41208ft5("comments")
    private final String comments;
    @JsonProperty("damaged")
    @InterfaceC41208ft5("damaged")
    private final boolean damaged;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("qr_code_damaged")
    @InterfaceC41208ft5("qr_code_damaged")
    private final boolean qrCodeDamaged;

    public DamageReportBody(String birdId, boolean z, boolean z2, String str, String str2, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.birdId = birdId;
        this.qrCodeDamaged = z;
        this.damaged = z2;
        this.comments = str;
        this.birdPhotoUrl = str2;
        this.location = wireLocation;
    }

    public static /* synthetic */ DamageReportBody copy$default(DamageReportBody damageReportBody, String str, boolean z, boolean z2, String str2, String str3, WireLocation wireLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = damageReportBody.birdId;
        }
        if ((i & 2) != 0) {
            z = damageReportBody.qrCodeDamaged;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = damageReportBody.damaged;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            str2 = damageReportBody.comments;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = damageReportBody.birdPhotoUrl;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            wireLocation = damageReportBody.location;
        }
        return damageReportBody.copy(str, z3, z4, str4, str5, wireLocation);
    }

    public final String component1() {
        return this.birdId;
    }

    public final boolean component2() {
        return this.qrCodeDamaged;
    }

    public final boolean component3() {
        return this.damaged;
    }

    public final String component4() {
        return this.comments;
    }

    public final String component5() {
        return this.birdPhotoUrl;
    }

    public final WireLocation component6() {
        return this.location;
    }

    public final DamageReportBody copy(String birdId, boolean z, boolean z2, String str, String str2, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new DamageReportBody(birdId, z, z2, str, str2, wireLocation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DamageReportBody) {
            DamageReportBody damageReportBody = (DamageReportBody) obj;
            return Intrinsics.areEqual(this.birdId, damageReportBody.birdId) && this.qrCodeDamaged == damageReportBody.qrCodeDamaged && this.damaged == damageReportBody.damaged && Intrinsics.areEqual(this.comments, damageReportBody.comments) && Intrinsics.areEqual(this.birdPhotoUrl, damageReportBody.birdPhotoUrl) && Intrinsics.areEqual(this.location, damageReportBody.location);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getBirdPhotoUrl() {
        return this.birdPhotoUrl;
    }

    public final String getComments() {
        return this.comments;
    }

    public final boolean getDamaged() {
        return this.damaged;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final boolean getQrCodeDamaged() {
        return this.qrCodeDamaged;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.birdId.hashCode() * 31;
        boolean z = this.qrCodeDamaged;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.damaged;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str = this.comments;
        int hashCode2 = (i3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.birdPhotoUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WireLocation wireLocation = this.location;
        return hashCode3 + (wireLocation != null ? wireLocation.hashCode() : 0);
    }

    public String toString() {
        String str = this.birdId;
        boolean z = this.qrCodeDamaged;
        boolean z2 = this.damaged;
        String str2 = this.comments;
        String str3 = this.birdPhotoUrl;
        WireLocation wireLocation = this.location;
        return "DamageReportBody(birdId=" + str + ", qrCodeDamaged=" + z + ", damaged=" + z2 + ", comments=" + str2 + ", birdPhotoUrl=" + str3 + ", location=" + wireLocation + ")";
    }

    public /* synthetic */ DamageReportBody(String str, boolean z, boolean z2, String str2, String str3, WireLocation wireLocation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) == 0 ? z2 : false, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? wireLocation : null);
    }
}
