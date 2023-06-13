package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/NestImages;", "Lco/bird/android/model/persistence/nestedstructures/NestFlightSheetSection;", "idx", "", "imageUrls", "", "", "(ILjava/util/List;)V", "getIdx", "()I", "getImageUrls", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestImages implements NestFlightSheetSection {
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("image_urls")
    @InterfaceC41208ft5("image_urls")
    private final List<String> imageUrls;

    public NestImages(int i, List<String> imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        this.idx = i;
        this.imageUrls = imageUrls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NestImages copy$default(NestImages nestImages, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nestImages.idx;
        }
        if ((i2 & 2) != 0) {
            list = nestImages.imageUrls;
        }
        return nestImages.copy(i, list);
    }

    public final int component1() {
        return this.idx;
    }

    public final List<String> component2() {
        return this.imageUrls;
    }

    public final NestImages copy(int i, List<String> imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        return new NestImages(i, imageUrls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestImages) {
            NestImages nestImages = (NestImages) obj;
            return this.idx == nestImages.idx && Intrinsics.areEqual(this.imageUrls, nestImages.imageUrls);
        }
        return false;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.NestFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final List<String> getImageUrls() {
        return this.imageUrls;
    }

    public int hashCode() {
        return (Integer.hashCode(this.idx) * 31) + this.imageUrls.hashCode();
    }

    public String toString() {
        int i = this.idx;
        List<String> list = this.imageUrls;
        return "NestImages(idx=" + i + ", imageUrls=" + list + ")";
    }
}
