package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/BirdModelFilter;", "", RequestHeadersFactory.MODEL, "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getModel", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdModelFilter {
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final String model;

    public BirdModelFilter() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ BirdModelFilter copy$default(BirdModelFilter birdModelFilter, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = birdModelFilter.model;
        }
        if ((i & 2) != 0) {
            str2 = birdModelFilter.description;
        }
        return birdModelFilter.copy(str, str2);
    }

    public final String component1() {
        return this.model;
    }

    public final String component2() {
        return this.description;
    }

    public final BirdModelFilter copy(String model, String description) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(description, "description");
        return new BirdModelFilter(model, description);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdModelFilter) {
            BirdModelFilter birdModelFilter = (BirdModelFilter) obj;
            return Intrinsics.areEqual(this.model, birdModelFilter.model) && Intrinsics.areEqual(this.description, birdModelFilter.description);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        return (this.model.hashCode() * 31) + this.description.hashCode();
    }

    public String toString() {
        String str = this.model;
        String str2 = this.description;
        return "BirdModelFilter(model=" + str + ", description=" + str2 + ")";
    }

    public BirdModelFilter(String model, String description) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(description, "description");
        this.model = model;
        this.description = description;
    }

    public /* synthetic */ BirdModelFilter(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
