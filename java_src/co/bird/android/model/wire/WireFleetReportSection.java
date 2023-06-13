package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetReportSection;", "", "title", "", "panels", "", "Lco/bird/android/model/wire/WireFleetReportPanel;", "(Ljava/lang/String;Ljava/util/List;)V", "getPanels", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetReportSection {
    @JsonProperty("panels")
    @InterfaceC41208ft5("panels")
    private final List<WireFleetReportPanel> panels;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireFleetReportSection(String title, List<WireFleetReportPanel> panels) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(panels, "panels");
        this.title = title;
        this.panels = panels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireFleetReportSection copy$default(WireFleetReportSection wireFleetReportSection, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireFleetReportSection.title;
        }
        if ((i & 2) != 0) {
            list = wireFleetReportSection.panels;
        }
        return wireFleetReportSection.copy(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<WireFleetReportPanel> component2() {
        return this.panels;
    }

    public final WireFleetReportSection copy(String title, List<WireFleetReportPanel> panels) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(panels, "panels");
        return new WireFleetReportSection(title, panels);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetReportSection) {
            WireFleetReportSection wireFleetReportSection = (WireFleetReportSection) obj;
            return Intrinsics.areEqual(this.title, wireFleetReportSection.title) && Intrinsics.areEqual(this.panels, wireFleetReportSection.panels);
        }
        return false;
    }

    public final List<WireFleetReportPanel> getPanels() {
        return this.panels;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.panels.hashCode();
    }

    public String toString() {
        String str = this.title;
        List<WireFleetReportPanel> list = this.panels;
        return "WireFleetReportSection(title=" + str + ", panels=" + list + ")";
    }
}
