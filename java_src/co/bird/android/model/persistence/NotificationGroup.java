package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.OperatorNotificationIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/persistence/NotificationGroup;", "", "id", "", "title", "description", "category", "date", "Lorg/joda/time/DateTime;", "icon", "Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;)V", "getCategory", "()Ljava/lang/String;", "getDate", "()Lorg/joda/time/DateTime;", "getDescription", "getIcon", "()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;", "getId", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NotificationGroup {
    private final String category;
    private final DateTime date;
    private final String description;
    private final OperatorNotificationIcon icon;

    /* renamed from: id */
    private final String f66682id;
    private final String title;

    public NotificationGroup(String id, String title, String description, String category, DateTime date, OperatorNotificationIcon icon) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f66682id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.date = date;
        this.icon = icon;
    }

    public static /* synthetic */ NotificationGroup copy$default(NotificationGroup notificationGroup, String str, String str2, String str3, String str4, DateTime dateTime, OperatorNotificationIcon operatorNotificationIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationGroup.f66682id;
        }
        if ((i & 2) != 0) {
            str2 = notificationGroup.title;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = notificationGroup.description;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = notificationGroup.category;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            dateTime = notificationGroup.date;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 32) != 0) {
            operatorNotificationIcon = notificationGroup.icon;
        }
        return notificationGroup.copy(str, str5, str6, str7, dateTime2, operatorNotificationIcon);
    }

    public final String component1() {
        return this.f66682id;
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

    public final OperatorNotificationIcon component6() {
        return this.icon;
    }

    public final NotificationGroup copy(String id, String title, String description, String category, DateTime date, OperatorNotificationIcon icon) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new NotificationGroup(id, title, description, category, date, icon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NotificationGroup) {
            NotificationGroup notificationGroup = (NotificationGroup) obj;
            return Intrinsics.areEqual(this.f66682id, notificationGroup.f66682id) && Intrinsics.areEqual(this.title, notificationGroup.title) && Intrinsics.areEqual(this.description, notificationGroup.description) && Intrinsics.areEqual(this.category, notificationGroup.category) && Intrinsics.areEqual(this.date, notificationGroup.date) && Intrinsics.areEqual(this.icon, notificationGroup.icon);
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

    public final OperatorNotificationIcon getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f66682id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((this.f66682id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.category.hashCode()) * 31) + this.date.hashCode()) * 31) + this.icon.hashCode();
    }

    public String toString() {
        String str = this.f66682id;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.category;
        DateTime dateTime = this.date;
        OperatorNotificationIcon operatorNotificationIcon = this.icon;
        return "NotificationGroup(id=" + str + ", title=" + str2 + ", description=" + str3 + ", category=" + str4 + ", date=" + dateTime + ", icon=" + operatorNotificationIcon + ")";
    }
}
