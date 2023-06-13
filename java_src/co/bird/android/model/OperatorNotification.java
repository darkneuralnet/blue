package co.bird.android.model;

import co.bird.android.model.persistence.nestedstructures.OperatorNotificationIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0012\u0013R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/OperatorNotification;", "", "category", "", "getCategory", "()Ljava/lang/String;", "date", "Lorg/joda/time/DateTime;", "getDate", "()Lorg/joda/time/DateTime;", "description", "getDescription", "icon", "Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;", "getIcon", "()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;", "title", "getTitle", "Notification", "NotificationGroup", "Lco/bird/android/model/OperatorNotification$Notification;", "Lco/bird/android/model/OperatorNotification$NotificationGroup;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public interface OperatorNotification {

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JS\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, m28432d2 = {"Lco/bird/android/model/OperatorNotification$Notification;", "Lco/bird/android/model/OperatorNotification;", "id", "", "kind", "title", "description", "category", "date", "Lorg/joda/time/DateTime;", "icon", "Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;)V", "getCategory", "()Ljava/lang/String;", "getDate", "()Lorg/joda/time/DateTime;", "getDescription", "getIcon", "()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;", "getId", "getKind", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Notification implements OperatorNotification {
        private final String category;
        private final DateTime date;
        private final String description;
        private final OperatorNotificationIcon icon;

        /* renamed from: id */
        private final String f66607id;
        private final String kind;
        private final String title;

        public Notification(String id, String kind, String str, String str2, String category, DateTime date, OperatorNotificationIcon icon) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.f66607id = id;
            this.kind = kind;
            this.title = str;
            this.description = str2;
            this.category = category;
            this.date = date;
            this.icon = icon;
        }

        public static /* synthetic */ Notification copy$default(Notification notification, String str, String str2, String str3, String str4, String str5, DateTime dateTime, OperatorNotificationIcon operatorNotificationIcon, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notification.f66607id;
            }
            if ((i & 2) != 0) {
                str2 = notification.kind;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = notification.title;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = notification.description;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = notification.category;
            }
            String str9 = str5;
            if ((i & 32) != 0) {
                dateTime = notification.date;
            }
            DateTime dateTime2 = dateTime;
            if ((i & 64) != 0) {
                operatorNotificationIcon = notification.icon;
            }
            return notification.copy(str, str6, str7, str8, str9, dateTime2, operatorNotificationIcon);
        }

        public final String component1() {
            return this.f66607id;
        }

        public final String component2() {
            return this.kind;
        }

        public final String component3() {
            return this.title;
        }

        public final String component4() {
            return this.description;
        }

        public final String component5() {
            return this.category;
        }

        public final DateTime component6() {
            return this.date;
        }

        public final OperatorNotificationIcon component7() {
            return this.icon;
        }

        public final Notification copy(String id, String kind, String str, String str2, String category, DateTime date, OperatorNotificationIcon icon) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Notification(id, kind, str, str2, category, date, icon);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Notification) {
                Notification notification = (Notification) obj;
                return Intrinsics.areEqual(this.f66607id, notification.f66607id) && Intrinsics.areEqual(this.kind, notification.kind) && Intrinsics.areEqual(this.title, notification.title) && Intrinsics.areEqual(this.description, notification.description) && Intrinsics.areEqual(this.category, notification.category) && Intrinsics.areEqual(this.date, notification.date) && Intrinsics.areEqual(this.icon, notification.icon);
            }
            return false;
        }

        @Override // co.bird.android.model.OperatorNotification
        public String getCategory() {
            return this.category;
        }

        @Override // co.bird.android.model.OperatorNotification
        public DateTime getDate() {
            return this.date;
        }

        @Override // co.bird.android.model.OperatorNotification
        public String getDescription() {
            return this.description;
        }

        @Override // co.bird.android.model.OperatorNotification
        public OperatorNotificationIcon getIcon() {
            return this.icon;
        }

        public final String getId() {
            return this.f66607id;
        }

        public final String getKind() {
            return this.kind;
        }

        @Override // co.bird.android.model.OperatorNotification
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = ((this.f66607id.hashCode() * 31) + this.kind.hashCode()) * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            return ((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.category.hashCode()) * 31) + this.date.hashCode()) * 31) + this.icon.hashCode();
        }

        public String toString() {
            String str = this.f66607id;
            String str2 = this.kind;
            String str3 = this.title;
            String str4 = this.description;
            String str5 = this.category;
            DateTime dateTime = this.date;
            OperatorNotificationIcon operatorNotificationIcon = this.icon;
            return "Notification(id=" + str + ", kind=" + str2 + ", title=" + str3 + ", description=" + str4 + ", category=" + str5 + ", date=" + dateTime + ", icon=" + operatorNotificationIcon + ")";
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/OperatorNotification$NotificationGroup;", "Lco/bird/android/model/OperatorNotification;", "groupId", "", "title", "description", "category", "date", "Lorg/joda/time/DateTime;", "icon", "Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;)V", "getCategory", "()Ljava/lang/String;", "getDate", "()Lorg/joda/time/DateTime;", "getDescription", "getGroupId", "getIcon", "()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class NotificationGroup implements OperatorNotification {
        private final String category;
        private final DateTime date;
        private final String description;
        private final String groupId;
        private final OperatorNotificationIcon icon;
        private final String title;

        public NotificationGroup(String groupId, String str, String str2, String category, DateTime date, OperatorNotificationIcon icon) {
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.groupId = groupId;
            this.title = str;
            this.description = str2;
            this.category = category;
            this.date = date;
            this.icon = icon;
        }

        public static /* synthetic */ NotificationGroup copy$default(NotificationGroup notificationGroup, String str, String str2, String str3, String str4, DateTime dateTime, OperatorNotificationIcon operatorNotificationIcon, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notificationGroup.groupId;
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
            return this.groupId;
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

        public final NotificationGroup copy(String groupId, String str, String str2, String category, DateTime date, OperatorNotificationIcon icon) {
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new NotificationGroup(groupId, str, str2, category, date, icon);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof NotificationGroup) {
                NotificationGroup notificationGroup = (NotificationGroup) obj;
                return Intrinsics.areEqual(this.groupId, notificationGroup.groupId) && Intrinsics.areEqual(this.title, notificationGroup.title) && Intrinsics.areEqual(this.description, notificationGroup.description) && Intrinsics.areEqual(this.category, notificationGroup.category) && Intrinsics.areEqual(this.date, notificationGroup.date) && Intrinsics.areEqual(this.icon, notificationGroup.icon);
            }
            return false;
        }

        @Override // co.bird.android.model.OperatorNotification
        public String getCategory() {
            return this.category;
        }

        @Override // co.bird.android.model.OperatorNotification
        public DateTime getDate() {
            return this.date;
        }

        @Override // co.bird.android.model.OperatorNotification
        public String getDescription() {
            return this.description;
        }

        public final String getGroupId() {
            return this.groupId;
        }

        @Override // co.bird.android.model.OperatorNotification
        public OperatorNotificationIcon getIcon() {
            return this.icon;
        }

        @Override // co.bird.android.model.OperatorNotification
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.groupId.hashCode() * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            return ((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.category.hashCode()) * 31) + this.date.hashCode()) * 31) + this.icon.hashCode();
        }

        public String toString() {
            String str = this.groupId;
            String str2 = this.title;
            String str3 = this.description;
            String str4 = this.category;
            DateTime dateTime = this.date;
            OperatorNotificationIcon operatorNotificationIcon = this.icon;
            return "NotificationGroup(groupId=" + str + ", title=" + str2 + ", description=" + str3 + ", category=" + str4 + ", date=" + dateTime + ", icon=" + operatorNotificationIcon + ")";
        }
    }

    String getCategory();

    DateTime getDate();

    String getDescription();

    OperatorNotificationIcon getIcon();

    String getTitle();
}
