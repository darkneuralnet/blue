package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0003J!\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/wire/WireTutorialResponse;", "", "tutorials", "", "Lco/bird/android/model/constant/ConfigurableTutorialContext;", "Lco/bird/android/model/wire/WireTutorials;", "(Ljava/util/Map;)V", "getTutorials", "()Ljava/util/Map;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireTutorialResponse {
    @JsonProperty("tutorials")
    @InterfaceC41208ft5("tutorials")
    private final Map<ConfigurableTutorialContext, WireTutorials> tutorials;

    public WireTutorialResponse(Map<ConfigurableTutorialContext, WireTutorials> tutorials) {
        Intrinsics.checkNotNullParameter(tutorials, "tutorials");
        this.tutorials = tutorials;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireTutorialResponse copy$default(WireTutorialResponse wireTutorialResponse, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = wireTutorialResponse.tutorials;
        }
        return wireTutorialResponse.copy(map);
    }

    public final Map<ConfigurableTutorialContext, WireTutorials> component1() {
        return this.tutorials;
    }

    public final WireTutorialResponse copy(Map<ConfigurableTutorialContext, WireTutorials> tutorials) {
        Intrinsics.checkNotNullParameter(tutorials, "tutorials");
        return new WireTutorialResponse(tutorials);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WireTutorialResponse) && Intrinsics.areEqual(this.tutorials, ((WireTutorialResponse) obj).tutorials);
    }

    public final Map<ConfigurableTutorialContext, WireTutorials> getTutorials() {
        return this.tutorials;
    }

    public int hashCode() {
        return this.tutorials.hashCode();
    }

    public String toString() {
        Map<ConfigurableTutorialContext, WireTutorials> map = this.tutorials;
        return "WireTutorialResponse(tutorials=" + map + ")";
    }
}
