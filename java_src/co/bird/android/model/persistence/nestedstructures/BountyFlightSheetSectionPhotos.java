package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J%\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionPhotos;", "", "title", "", "photoUrls", "", "(Ljava/lang/String;Ljava/util/List;)V", "getPhotoUrls", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BountyFlightSheetSectionPhotos {
    @JsonProperty("photo_urls")
    @InterfaceC41208ft5("photo_urls")
    private final List<String> photoUrls;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public BountyFlightSheetSectionPhotos() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BountyFlightSheetSectionPhotos copy$default(BountyFlightSheetSectionPhotos bountyFlightSheetSectionPhotos, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bountyFlightSheetSectionPhotos.title;
        }
        if ((i & 2) != 0) {
            list = bountyFlightSheetSectionPhotos.photoUrls;
        }
        return bountyFlightSheetSectionPhotos.copy(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<String> component2() {
        return this.photoUrls;
    }

    public final BountyFlightSheetSectionPhotos copy(String str, List<String> photoUrls) {
        Intrinsics.checkNotNullParameter(photoUrls, "photoUrls");
        return new BountyFlightSheetSectionPhotos(str, photoUrls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BountyFlightSheetSectionPhotos) {
            BountyFlightSheetSectionPhotos bountyFlightSheetSectionPhotos = (BountyFlightSheetSectionPhotos) obj;
            return Intrinsics.areEqual(this.title, bountyFlightSheetSectionPhotos.title) && Intrinsics.areEqual(this.photoUrls, bountyFlightSheetSectionPhotos.photoUrls);
        }
        return false;
    }

    public final List<String> getPhotoUrls() {
        return this.photoUrls;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.photoUrls.hashCode();
    }

    public String toString() {
        String str = this.title;
        List<String> list = this.photoUrls;
        return "BountyFlightSheetSectionPhotos(title=" + str + ", photoUrls=" + list + ")";
    }

    public BountyFlightSheetSectionPhotos(String str, List<String> photoUrls) {
        Intrinsics.checkNotNullParameter(photoUrls, "photoUrls");
        this.title = str;
        this.photoUrls = photoUrls;
    }

    public /* synthetic */ BountyFlightSheetSectionPhotos(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
