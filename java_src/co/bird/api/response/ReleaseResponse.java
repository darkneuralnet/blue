package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireReleaseItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/ReleaseResponse;", "", "releases", "", "Lco/bird/android/model/wire/WireReleaseItem;", "releasePhotoUrl", "", "(Ljava/util/List;Ljava/lang/String;)V", "getReleasePhotoUrl", "()Ljava/lang/String;", "getReleases", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReleaseResponse {
    @JsonProperty("release_photo_url")
    @InterfaceC41208ft5("release_photo_url")
    private final String releasePhotoUrl;
    @JsonProperty("releases")
    @InterfaceC41208ft5("releases")
    private final List<WireReleaseItem> releases;

    public ReleaseResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReleaseResponse copy$default(ReleaseResponse releaseResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = releaseResponse.releases;
        }
        if ((i & 2) != 0) {
            str = releaseResponse.releasePhotoUrl;
        }
        return releaseResponse.copy(list, str);
    }

    public final List<WireReleaseItem> component1() {
        return this.releases;
    }

    public final String component2() {
        return this.releasePhotoUrl;
    }

    public final ReleaseResponse copy(List<WireReleaseItem> releases, String str) {
        Intrinsics.checkNotNullParameter(releases, "releases");
        return new ReleaseResponse(releases, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReleaseResponse) {
            ReleaseResponse releaseResponse = (ReleaseResponse) obj;
            return Intrinsics.areEqual(this.releases, releaseResponse.releases) && Intrinsics.areEqual(this.releasePhotoUrl, releaseResponse.releasePhotoUrl);
        }
        return false;
    }

    public final String getReleasePhotoUrl() {
        return this.releasePhotoUrl;
    }

    public final List<WireReleaseItem> getReleases() {
        return this.releases;
    }

    public int hashCode() {
        int hashCode = this.releases.hashCode() * 31;
        String str = this.releasePhotoUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<WireReleaseItem> list = this.releases;
        String str = this.releasePhotoUrl;
        return "ReleaseResponse(releases=" + list + ", releasePhotoUrl=" + str + ")";
    }

    public ReleaseResponse(List<WireReleaseItem> releases, String str) {
        Intrinsics.checkNotNullParameter(releases, "releases");
        this.releases = releases;
        this.releasePhotoUrl = str;
    }

    public /* synthetic */ ReleaseResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : str);
    }
}
