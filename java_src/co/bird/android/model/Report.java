package co.bird.android.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003HÆ\u0003J\u0017\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/Report;", "", "selectedOptions", "", "", "message", "(Ljava/util/Map;Ljava/util/Map;)V", "getMessage", "()Ljava/util/Map;", "getSelectedOptions", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Report {
    private final Map<String, String> message;
    private final Map<String, Object> selectedOptions;

    public Report(Map<String, ? extends Object> selectedOptions, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        this.selectedOptions = selectedOptions;
        this.message = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Report copy$default(Report report, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = report.selectedOptions;
        }
        if ((i & 2) != 0) {
            map2 = report.message;
        }
        return report.copy(map, map2);
    }

    public final Map<String, Object> component1() {
        return this.selectedOptions;
    }

    public final Map<String, String> component2() {
        return this.message;
    }

    public final Report copy(Map<String, ? extends Object> selectedOptions, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        return new Report(selectedOptions, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Report) {
            Report report = (Report) obj;
            return Intrinsics.areEqual(this.selectedOptions, report.selectedOptions) && Intrinsics.areEqual(this.message, report.message);
        }
        return false;
    }

    public final Map<String, String> getMessage() {
        return this.message;
    }

    public final Map<String, Object> getSelectedOptions() {
        return this.selectedOptions;
    }

    public int hashCode() {
        int hashCode = this.selectedOptions.hashCode() * 31;
        Map<String, String> map = this.message;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        Map<String, Object> map = this.selectedOptions;
        Map<String, String> map2 = this.message;
        return "Report(selectedOptions=" + map + ", message=" + map2 + ")";
    }

    public /* synthetic */ Report(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : map2);
    }
}
