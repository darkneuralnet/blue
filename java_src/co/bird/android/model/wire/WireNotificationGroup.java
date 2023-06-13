package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/WireNotificationGroup;", "", "id", "", "title", "description", "category", "date", "Lorg/joda/time/DateTime;", "icon", "Lco/bird/android/model/wire/WireOperatorNotificationIcon;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/wire/WireOperatorNotificationIcon;)V", "getCategory", "()Ljava/lang/String;", "getDate", "()Lorg/joda/time/DateTime;", "getDescription", "getIcon", "()Lco/bird/android/model/wire/WireOperatorNotificationIcon;", "getId", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNotificationGroup {
    @JsonProperty("category")
    @InterfaceC41208ft5("category")
    private final String category;
    @JsonProperty("date")
    @InterfaceC41208ft5("date")
    private final DateTime date;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final WireOperatorNotificationIcon icon;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66743id;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireNotificationGroup() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ WireNotificationGroup copy$default(WireNotificationGroup wireNotificationGroup, String str, String str2, String str3, String str4, DateTime dateTime, WireOperatorNotificationIcon wireOperatorNotificationIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireNotificationGroup.f66743id;
        }
        if ((i & 2) != 0) {
            str2 = wireNotificationGroup.title;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = wireNotificationGroup.description;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = wireNotificationGroup.category;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            dateTime = wireNotificationGroup.date;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 32) != 0) {
            wireOperatorNotificationIcon = wireNotificationGroup.icon;
        }
        return wireNotificationGroup.copy(str, str5, str6, str7, dateTime2, wireOperatorNotificationIcon);
    }

    public final String component1() {
        return this.f66743id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.category;
    }

    public final DateTime component5() {
        return this.date;
    }

    public final WireOperatorNotificationIcon component6() {
        return this.icon;
    }

    public final WireNotificationGroup copy(String id, String title, String description, String category, DateTime date, WireOperatorNotificationIcon icon) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new WireNotificationGroup(id, title, description, category, date, icon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNotificationGroup) {
            WireNotificationGroup wireNotificationGroup = (WireNotificationGroup) obj;
            return Intrinsics.areEqual(this.f66743id, wireNotificationGroup.f66743id) && Intrinsics.areEqual(this.title, wireNotificationGroup.title) && Intrinsics.areEqual(this.description, wireNotificationGroup.description) && Intrinsics.areEqual(this.category, wireNotificationGroup.category) && Intrinsics.areEqual(this.date, wireNotificationGroup.date) && Intrinsics.areEqual(this.icon, wireNotificationGroup.icon);
        }
        return false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final DateTime getDate() {
        return this.date;
    }

    public final String getDescription() {
        return this.description;
    }

    public final WireOperatorNotificationIcon getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f66743id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((this.f66743id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.category.hashCode()) * 31) + this.date.hashCode()) * 31) + this.icon.hashCode();
    }

    public String toString() {
        String str = this.f66743id;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.category;
        DateTime dateTime = this.date;
        WireOperatorNotificationIcon wireOperatorNotificationIcon = this.icon;
        return "WireNotificationGroup(id=" + str + ", title=" + str2 + ", description=" + str3 + ", category=" + str4 + ", date=" + dateTime + ", icon=" + wireOperatorNotificationIcon + ")";
    }

    public WireNotificationGroup(String id, String title, String description, String category, DateTime date, WireOperatorNotificationIcon icon) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f66743id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.date = date;
        this.icon = icon;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireNotificationGroup(String str, String str2, String str3, String str4, DateTime dateTime, WireOperatorNotificationIcon wireOperatorNotificationIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0, r2, r3, r1, r4, (i & 32) != 0 ? new WireOperatorNotificationIcon(null, null, null, null, 15, null) : wireOperatorNotificationIcon);
        DateTime dateTime2;
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) != 0 ? "" : str2;
        String str7 = (i & 4) != 0 ? "" : str3;
        String str8 = (i & 8) == 0 ? str4 : "";
        if ((i & 16) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        } else {
            dateTime2 = dateTime;
        }
    }
}
