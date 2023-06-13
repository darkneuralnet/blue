package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;", "", "imageUrl", "", "title", "body", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getImageUrl", "getTitle", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PhysicalLockTutorialStep {
    @JsonProperty("body")
    @InterfaceC41208ft5("body")
    private final String body;
    @JsonProperty("image_url")
    @InterfaceC41208ft5("image_url")
    private final String imageUrl;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public PhysicalLockTutorialStep() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PhysicalLockTutorialStep copy$default(PhysicalLockTutorialStep physicalLockTutorialStep, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = physicalLockTutorialStep.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = physicalLockTutorialStep.title;
        }
        if ((i & 4) != 0) {
            str3 = physicalLockTutorialStep.body;
        }
        return physicalLockTutorialStep.copy(str, str2, str3);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.body;
    }

    public final PhysicalLockTutorialStep copy(String imageUrl, String title, String body) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new PhysicalLockTutorialStep(imageUrl, title, body);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhysicalLockTutorialStep) {
            PhysicalLockTutorialStep physicalLockTutorialStep = (PhysicalLockTutorialStep) obj;
            return Intrinsics.areEqual(this.imageUrl, physicalLockTutorialStep.imageUrl) && Intrinsics.areEqual(this.title, physicalLockTutorialStep.title) && Intrinsics.areEqual(this.body, physicalLockTutorialStep.body);
        }
        return false;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.imageUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.body.hashCode();
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.body;
        return "PhysicalLockTutorialStep(imageUrl=" + str + ", title=" + str2 + ", body=" + str3 + ")";
    }

    public PhysicalLockTutorialStep(String imageUrl, String title, String body) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.imageUrl = imageUrl;
        this.title = title;
        this.body = body;
    }

    public /* synthetic */ PhysicalLockTutorialStep(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
