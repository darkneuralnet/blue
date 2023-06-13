.class public final Lra3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0008\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\u000c\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0004\u001a\n\u0010\u0012\u001a\u00020\u0011*\u00020\n\u00a8\u0006\u0013"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireOperatorNotificationCategory;",
        "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
        "e",
        "Lco/bird/android/model/wire/WireNotificationGroup;",
        "Lco/bird/android/model/persistence/NotificationGroup;",
        "d",
        "Lco/bird/android/model/wire/WireOperatorNotificationIcon;",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;",
        "g",
        "Lco/bird/android/model/wire/WireNotification;",
        "Lco/bird/android/model/persistence/Notification;",
        "c",
        "Lco/bird/android/model/wire/WireNotificationAction;",
        "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;",
        "f",
        "Lco/bird/android/model/OperatorNotification$NotificationGroup;",
        "b",
        "Lco/bird/android/model/OperatorNotification$Notification;",
        "a",
        "notification-center_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNotificationCenterConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterConversion.kt\nco/bird/android/repository/notificationcenter/conversion/NotificationCenterConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1549#2:89\n1620#2,3:90\n*S KotlinDebug\n*F\n+ 1 NotificationCenterConversion.kt\nco/bird/android/repository/notificationcenter/conversion/NotificationCenterConversionKt\n*L\n54#1:89\n54#1:90,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/persistence/Notification;)Lco/bird/android/model/OperatorNotification$Notification;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/OperatorNotification$Notification;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Notification;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Notification;->getKind()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Notification;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Notification;->getShortDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Notification;->getCategory()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Notification;->getDate()Lorg/joda/time/DateTime;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Notification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lco/bird/android/model/OperatorNotification$Notification;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;)V

    return-object v0
.end method

.method public static final b(Lco/bird/android/model/persistence/NotificationGroup;)Lco/bird/android/model/OperatorNotification$NotificationGroup;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/OperatorNotification$NotificationGroup;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/NotificationGroup;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/NotificationGroup;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/NotificationGroup;->getDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/persistence/NotificationGroup;->getCategory()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/persistence/NotificationGroup;->getDate()Lorg/joda/time/DateTime;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/persistence/NotificationGroup;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/OperatorNotification$NotificationGroup;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/wire/WireNotification;)Lco/bird/android/model/persistence/Notification;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotification;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotification;->getGroupId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotification;->getCategory()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotification;->getKind()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotification;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotification;->getShortDescription()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotification;->getFullDescription()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotification;->getIcon()Lco/bird/android/model/wire/WireOperatorNotificationIcon;

    move-result-object v0

    invoke-static {v0}, Lra3;->g(Lco/bird/android/model/wire/WireOperatorNotificationIcon;)Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v9

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotification;->getDate()Lorg/joda/time/DateTime;

    move-result-object v10

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotification;->getActions()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireNotificationAction;

    invoke-static {v0}, Lra3;->f(Lco/bird/android/model/wire/WireNotificationAction;)Lco/bird/android/model/persistence/nestedstructures/NotificationAction;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lco/bird/android/model/persistence/Notification;

    move-object v1, p0

    invoke-direct/range {v1 .. v11}, Lco/bird/android/model/persistence/Notification;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;Lorg/joda/time/DateTime;Ljava/util/List;)V

    return-object p0
.end method

.method public static final d(Lco/bird/android/model/wire/WireNotificationGroup;)Lco/bird/android/model/persistence/NotificationGroup;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/NotificationGroup;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotificationGroup;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotificationGroup;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotificationGroup;->getDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotificationGroup;->getCategory()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotificationGroup;->getDate()Lorg/joda/time/DateTime;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotificationGroup;->getIcon()Lco/bird/android/model/wire/WireOperatorNotificationIcon;

    move-result-object p0

    invoke-static {p0}, Lra3;->g(Lco/bird/android/model/wire/WireOperatorNotificationIcon;)Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/persistence/NotificationGroup;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;)V

    return-object v0
.end method

.method public static final e(Lco/bird/android/model/wire/WireOperatorNotificationCategory;)Lco/bird/android/model/persistence/OperatorNotificationCategory;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/OperatorNotificationCategory;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorNotificationCategory;->getCategory()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorNotificationCategory;->getTitle()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/OperatorNotificationCategory;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final f(Lco/bird/android/model/wire/WireNotificationAction;)Lco/bird/android/model/persistence/nestedstructures/NotificationAction;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/NotificationAction;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotificationAction;->getActionKind()Lco/bird/android/model/constant/OperatorNotificationActionKind;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotificationAction;->getDeeplinkPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNotificationAction;->getTitle()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lco/bird/android/model/persistence/nestedstructures/NotificationAction;-><init>(Lco/bird/android/model/constant/OperatorNotificationActionKind;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final g(Lco/bird/android/model/wire/WireOperatorNotificationIcon;)Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorNotificationIcon;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorNotificationIcon;->getIconColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v2

    invoke-static {v2}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorNotificationIcon;->getIconBackgroundColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v3

    invoke-static {v3}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorNotificationIcon;->getPinShape()Lco/bird/android/model/constant/NotificationIconPinShape;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;-><init>(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/NotificationIconPinShape;)V

    return-object v0
.end method
