package co.bird.android.model.itemlease;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;", "", "signedUrl", "", "(Ljava/lang/String;)V", "getSignedUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LeaseSubmitAssetResponse {
    private final String signedUrl;

    public LeaseSubmitAssetResponse(String signedUrl) {
        Intrinsics.checkNotNullParameter(signedUrl, "signedUrl");
        this.signedUrl = signedUrl;
    }

    public static /* synthetic */ LeaseSubmitAssetResponse copy$default(LeaseSubmitAssetResponse leaseSubmitAssetResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leaseSubmitAssetResponse.signedUrl;
        }
        return leaseSubmitAssetResponse.copy(str);
    }

    public final String component1() {
        return this.signedUrl;
    }

    public final LeaseSubmitAssetResponse copy(String signedUrl) {
        Intrinsics.checkNotNullParameter(signedUrl, "signedUrl");
        return new LeaseSubmitAssetResponse(signedUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LeaseSubmitAssetResponse) && Intrinsics.areEqual(this.signedUrl, ((LeaseSubmitAssetResponse) obj).signedUrl);
    }

    public final String getSignedUrl() {
        return this.signedUrl;
    }

    public int hashCode() {
        return this.signedUrl.hashCode();
    }

    public String toString() {
        String str = this.signedUrl;
        return "LeaseSubmitAssetResponse(signedUrl=" + str + ")";
    }
}
