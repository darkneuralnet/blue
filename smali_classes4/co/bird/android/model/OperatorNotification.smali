.class public interface abstract Lco/bird/android/model/OperatorNotification;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/OperatorNotification$Notification;,
        Lco/bird/android/model/OperatorNotification$NotificationGroup;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u0002\u0012\u0013R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0005R\u0012\u0010\u000c\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0005\u0082\u0001\u0002\u0014\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/android/model/OperatorNotification;",
        "",
        "category",
        "",
        "getCategory",
        "()Ljava/lang/String;",
        "date",
        "Lorg/joda/time/DateTime;",
        "getDate",
        "()Lorg/joda/time/DateTime;",
        "description",
        "getDescription",
        "icon",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;",
        "getIcon",
        "()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;",
        "title",
        "getTitle",
        "Notification",
        "NotificationGroup",
        "Lco/bird/android/model/OperatorNotification$Notification;",
        "Lco/bird/android/model/OperatorNotification$NotificationGroup;",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getCategory()Ljava/lang/String;
.end method

.method public abstract getDate()Lorg/joda/time/DateTime;
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public abstract getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;
.end method

.method public abstract getTitle()Ljava/lang/String;
.end method
