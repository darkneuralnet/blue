package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J{\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u00061"}, m28432d2 = {"Lco/bird/android/model/wire/WireNotification;", "", "id", "", "groupId", "category", "kind", "title", "shortDescription", "fullDescription", "icon", "Lco/bird/android/model/wire/WireOperatorNotificationIcon;", "date", "Lorg/joda/time/DateTime;", "actions", "", "Lco/bird/android/model/wire/WireNotificationAction;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireOperatorNotificationIcon;Lorg/joda/time/DateTime;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getCategory", "()Ljava/lang/String;", "getDate", "()Lorg/joda/time/DateTime;", "getFullDescription", "getGroupId", "getIcon", "()Lco/bird/android/model/wire/WireOperatorNotificationIcon;", "getId", "getKind", "getShortDescription", "getTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNotification {
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<WireNotificationAction> actions;
    @JsonProperty("category")
    @InterfaceC41208ft5("category")
    private final String category;
    @JsonProperty("date")
    @InterfaceC41208ft5("date")
    private final DateTime date;
    @JsonProperty("full_description")
    @InterfaceC41208ft5("full_description")
    private final String fullDescription;
    @JsonProperty("group_id")
    @InterfaceC41208ft5("group_id")
    private final String groupId;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final WireOperatorNotificationIcon icon;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66742id;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final String kind;
    @JsonProperty("short_description")
    @InterfaceC41208ft5("short_description")
    private final String shortDescription;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireNotification() {
        this(null, null, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final String component1() {
        return this.f66742id;
    }

    public final List<WireNotificationAction> component10() {
        return this.actions;
    }

    public final String component2() {
        return this.groupId;
    }

    public final String component3() {
        return this.category;
    }

    public final String component4() {
        return this.kind;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.shortDescription;
    }

    public final String component7() {
        return this.fullDescription;
    }

    public final WireOperatorNotificationIcon component8() {
        return this.icon;
    }

    public final DateTime component9() {
        return this.date;
    }

    public final WireNotification copy(String id, String str, String category, String kind, String str2, String str3, String str4, WireOperatorNotificationIcon icon, DateTime date, List<WireNotificationAction> actions) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new WireNotification(id, str, category, kind, str2, str3, str4, icon, date, actions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNotification) {
            WireNotification wireNotification = (WireNotification) obj;
            return Intrinsics.areEqual(this.f66742id, wireNotification.f66742id) && Intrinsics.areEqual(this.groupId, wireNotification.groupId) && Intrinsics.areEqual(this.category, wireNotification.category) && Intrinsics.areEqual(this.kind, wireNotification.kind) && Intrinsics.areEqual(this.title, wireNotification.title) && Intrinsics.areEqual(this.shortDescription, wireNotification.shortDescription) && Intrinsics.areEqual(this.fullDescription, wireNotification.fullDescription) && Intrinsics.areEqual(this.icon, wireNotification.icon) && Intrinsics.areEqual(this.date, wireNotification.date) && Intrinsics.areEqual(this.actions, wireNotification.actions);
        }
        return false;
    }

    public final List<WireNotificationAction> getActions() {
        return this.actions;
    }

    public final String getCategory() {
        return this.category;
    }

    public final DateTime getDate() {
        return this.date;
    }

    public final String getFullDescription() {
        return this.fullDescription;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final WireOperatorNotificationIcon getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f66742id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getShortDescription() {
        return this.shortDescription;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.f66742id.hashCode() * 31;
        String str = this.groupId;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.category.hashCode()) * 31) + this.kind.hashCode()) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortDescription;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fullDescription;
        return ((((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.icon.hashCode()) * 31) + this.date.hashCode()) * 31) + this.actions.hashCode();
    }

    public String toString() {
        String str = this.f66742id;
        String str2 = this.groupId;
        String str3 = this.category;
        String str4 = this.kind;
        String str5 = this.title;
        String str6 = this.shortDescription;
        String str7 = this.fullDescription;
        WireOperatorNotificationIcon wireOperatorNotificationIcon = this.icon;
        DateTime dateTime = this.date;
        List<WireNotificationAction> list = this.actions;
        return "WireNotification(id=" + str + ", groupId=" + str2 + ", category=" + str3 + ", kind=" + str4 + ", title=" + str5 + ", shortDescription=" + str6 + ", fullDescription=" + str7 + ", icon=" + wireOperatorNotificationIcon + ", date=" + dateTime + ", actions=" + list + ")";
    }

    public WireNotification(String id, String str, String category, String kind, String str2, String str3, String str4, WireOperatorNotificationIcon icon, DateTime date, List<WireNotificationAction> actions) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f66742id = id;
        this.groupId = str;
        this.category = category;
        this.kind = kind;
        this.title = str2;
        this.shortDescription = str3;
        this.fullDescription = str4;
        this.icon = icon;
        this.date = date;
        this.actions = actions;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireNotification(String str, String str2, String str3, String str4, String str5, String str6, String str7, WireOperatorNotificationIcon wireOperatorNotificationIcon, DateTime dateTime, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r5, r2, r6, r7, r4, r8, r9, (i & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
        DateTime dateTime2;
        String str8 = (i & 1) != 0 ? "" : str;
        String str9 = (i & 2) != 0 ? null : str2;
        String str10 = (i & 4) != 0 ? "" : str3;
        String str11 = (i & 8) == 0 ? str4 : "";
        String str12 = (i & 16) != 0 ? null : str5;
        String str13 = (i & 32) != 0 ? null : str6;
        String str14 = (i & 64) == 0 ? str7 : null;
        WireOperatorNotificationIcon wireOperatorNotificationIcon2 = (i & 128) != 0 ? new WireOperatorNotificationIcon(null, null, null, null, 15, null) : wireOperatorNotificationIcon;
        if ((i & 256) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        } else {
            dateTime2 = dateTime;
        }
    }
}
