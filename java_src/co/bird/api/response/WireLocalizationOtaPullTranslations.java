package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012&\b\u0002\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0003\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J'\u0010\n\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0003\u0018\u00010\u0003HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002&\b\u0002\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0003\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R4\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0003\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, m28432d2 = {"Lco/bird/api/response/WireLocalizationOtaPullTranslations;", "", "translations", "", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "(Ljava/util/Map;)V", "getTranslations", "()Ljava/util/Map;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLocalizationOtaPullTranslations {
    @JsonProperty("translations")
    @InterfaceC41208ft5("translations")
    private final Map<String, Map<String, StringBuilder>> translations;

    public WireLocalizationOtaPullTranslations() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireLocalizationOtaPullTranslations copy$default(WireLocalizationOtaPullTranslations wireLocalizationOtaPullTranslations, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = wireLocalizationOtaPullTranslations.translations;
        }
        return wireLocalizationOtaPullTranslations.copy(map);
    }

    public final Map<String, Map<String, StringBuilder>> component1() {
        return this.translations;
    }

    public final WireLocalizationOtaPullTranslations copy(Map<String, ? extends Map<String, StringBuilder>> map) {
        return new WireLocalizationOtaPullTranslations(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WireLocalizationOtaPullTranslations) && Intrinsics.areEqual(this.translations, ((WireLocalizationOtaPullTranslations) obj).translations);
    }

    public final Map<String, Map<String, StringBuilder>> getTranslations() {
        return this.translations;
    }

    public int hashCode() {
        Map<String, Map<String, StringBuilder>> map = this.translations;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        Map<String, Map<String, StringBuilder>> map = this.translations;
        return "WireLocalizationOtaPullTranslations(translations=" + map + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WireLocalizationOtaPullTranslations(Map<String, ? extends Map<String, StringBuilder>> map) {
        this.translations = map;
    }

    public /* synthetic */ WireLocalizationOtaPullTranslations(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }
}
