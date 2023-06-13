package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetList;", "", "title", "", "message", "Lco/bird/android/model/wire/WireFleetListMessage;", "sections", "", "Lco/bird/android/model/wire/WireFleetListSection;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireFleetListMessage;Ljava/util/List;)V", "getMessage", "()Lco/bird/android/model/wire/WireFleetListMessage;", "getSections", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetList {
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final WireFleetListMessage message;
    @JsonProperty("sections")
    @InterfaceC41208ft5("sections")
    private final List<WireFleetListSection> sections;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireFleetList() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireFleetList copy$default(WireFleetList wireFleetList, String str, WireFleetListMessage wireFleetListMessage, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireFleetList.title;
        }
        if ((i & 2) != 0) {
            wireFleetListMessage = wireFleetList.message;
        }
        if ((i & 4) != 0) {
            list = wireFleetList.sections;
        }
        return wireFleetList.copy(str, wireFleetListMessage, list);
    }

    public final String component1() {
        return this.title;
    }

    public final WireFleetListMessage component2() {
        return this.message;
    }

    public final List<WireFleetListSection> component3() {
        return this.sections;
    }

    public final WireFleetList copy(String title, WireFleetListMessage wireFleetListMessage, List<WireFleetListSection> sections) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new WireFleetList(title, wireFleetListMessage, sections);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetList) {
            WireFleetList wireFleetList = (WireFleetList) obj;
            return Intrinsics.areEqual(this.title, wireFleetList.title) && Intrinsics.areEqual(this.message, wireFleetList.message) && Intrinsics.areEqual(this.sections, wireFleetList.sections);
        }
        return false;
    }

    public final WireFleetListMessage getMessage() {
        return this.message;
    }

    public final List<WireFleetListSection> getSections() {
        return this.sections;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        WireFleetListMessage wireFleetListMessage = this.message;
        return ((hashCode + (wireFleetListMessage == null ? 0 : wireFleetListMessage.hashCode())) * 31) + this.sections.hashCode();
    }

    public String toString() {
        String str = this.title;
        WireFleetListMessage wireFleetListMessage = this.message;
        List<WireFleetListSection> list = this.sections;
        return "WireFleetList(title=" + str + ", message=" + wireFleetListMessage + ", sections=" + list + ")";
    }

    public WireFleetList(String title, WireFleetListMessage wireFleetListMessage, List<WireFleetListSection> sections) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.title = title;
        this.message = wireFleetListMessage;
        this.sections = sections;
    }

    public /* synthetic */ WireFleetList(String str, WireFleetListMessage wireFleetListMessage, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : wireFleetListMessage, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
