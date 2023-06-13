package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.OperatorNotification;
import co.bird.android.model.persistence.Notification;
import co.bird.android.model.persistence.NotificationGroup;
import co.bird.android.model.persistence.OperatorNotificationCategory;
import co.bird.android.model.persistence.nestedstructures.NotificationAction;
import co.bird.android.model.persistence.nestedstructures.OperatorNotificationIcon;
import co.bird.android.model.wire.WireNotification;
import co.bird.android.model.wire.WireNotificationAction;
import co.bird.android.model.wire.WireNotificationGroup;
import co.bird.android.model.wire.WireOperatorNotificationCategory;
import co.bird.android.model.wire.WireOperatorNotificationIcon;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\f\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0004\u001a\n\u0010\u0012\u001a\u00020\u0011*\u00020\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorNotificationCategory;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "e", "Lco/bird/android/model/wire/WireNotificationGroup;", "Lco/bird/android/model/persistence/NotificationGroup;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireOperatorNotificationIcon;", "Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;", "g", "Lco/bird/android/model/wire/WireNotification;", "Lco/bird/android/model/persistence/Notification;", "c", "Lco/bird/android/model/wire/WireNotificationAction;", "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;", "f", "Lco/bird/android/model/OperatorNotification$NotificationGroup;", "b", "Lco/bird/android/model/OperatorNotification$Notification;", C17296a.f69688o, "notification-center_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationCenterConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterConversion.kt\nco/bird/android/repository/notificationcenter/conversion/NotificationCenterConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1549#2:89\n1620#2,3:90\n*S KotlinDebug\n*F\n+ 1 NotificationCenterConversion.kt\nco/bird/android/repository/notificationcenter/conversion/NotificationCenterConversionKt\n*L\n54#1:89\n54#1:90,3\n*E\n"})
/* renamed from: ra3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48132ra3 {
    /* renamed from: a */
    public static final OperatorNotification.Notification m15750a(Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "<this>");
        return new OperatorNotification.Notification(notification.getId(), notification.getKind(), notification.getTitle(), notification.getShortDescription(), notification.getCategory(), notification.getDate(), notification.getIcon());
    }

    /* renamed from: b */
    public static final OperatorNotification.NotificationGroup m15749b(NotificationGroup notificationGroup) {
        Intrinsics.checkNotNullParameter(notificationGroup, "<this>");
        return new OperatorNotification.NotificationGroup(notificationGroup.getId(), notificationGroup.getTitle(), notificationGroup.getDescription(), notificationGroup.getCategory(), notificationGroup.getDate(), notificationGroup.getIcon());
    }

    /* renamed from: c */
    public static final Notification m15748c(WireNotification wireNotification) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireNotification, "<this>");
        String id = wireNotification.getId();
        String groupId = wireNotification.getGroupId();
        String category = wireNotification.getCategory();
        String kind = wireNotification.getKind();
        String title = wireNotification.getTitle();
        String shortDescription = wireNotification.getShortDescription();
        String fullDescription = wireNotification.getFullDescription();
        OperatorNotificationIcon m15744g = m15744g(wireNotification.getIcon());
        DateTime date = wireNotification.getDate();
        List<WireNotificationAction> actions = wireNotification.getActions();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(actions, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireNotificationAction wireNotificationAction : actions) {
            arrayList.add(m15745f(wireNotificationAction));
        }
        return new Notification(id, groupId, category, kind, title, shortDescription, fullDescription, m15744g, date, arrayList);
    }

    /* renamed from: d */
    public static final NotificationGroup m15747d(WireNotificationGroup wireNotificationGroup) {
        Intrinsics.checkNotNullParameter(wireNotificationGroup, "<this>");
        return new NotificationGroup(wireNotificationGroup.getId(), wireNotificationGroup.getTitle(), wireNotificationGroup.getDescription(), wireNotificationGroup.getCategory(), wireNotificationGroup.getDate(), m15744g(wireNotificationGroup.getIcon()));
    }

    /* renamed from: e */
    public static final OperatorNotificationCategory m15746e(WireOperatorNotificationCategory wireOperatorNotificationCategory) {
        Intrinsics.checkNotNullParameter(wireOperatorNotificationCategory, "<this>");
        return new OperatorNotificationCategory(wireOperatorNotificationCategory.getCategory(), wireOperatorNotificationCategory.getTitle());
    }

    /* renamed from: f */
    public static final NotificationAction m15745f(WireNotificationAction wireNotificationAction) {
        Intrinsics.checkNotNullParameter(wireNotificationAction, "<this>");
        return new NotificationAction(wireNotificationAction.getActionKind(), wireNotificationAction.getDeeplinkPath(), wireNotificationAction.getTitle());
    }

    /* renamed from: g */
    public static final OperatorNotificationIcon m15744g(WireOperatorNotificationIcon wireOperatorNotificationIcon) {
        Intrinsics.checkNotNullParameter(wireOperatorNotificationIcon, "<this>");
        return new OperatorNotificationIcon(wireOperatorNotificationIcon.getIcon(), C47311qB0.m17961f(wireOperatorNotificationIcon.getIconColor()), C47311qB0.m17961f(wireOperatorNotificationIcon.getIconBackgroundColor()), wireOperatorNotificationIcon.getPinShape());
    }
}
