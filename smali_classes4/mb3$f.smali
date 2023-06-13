.class public final Lmb3$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmb3;->w()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/OperatorNotification$NotificationGroup;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/OperatorNotification$Notification;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/OperatorNotification;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "Lco/bird/android/model/OperatorNotification$NotificationGroup;",
        "notificationGroups",
        "Lco/bird/android/model/OperatorNotification$Notification;",
        "notifications",
        "Lco/bird/android/model/OperatorNotification;",
        "a",
        "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNotificationCenterRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$streamOperatorNotifications$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1054#2:103\n*S KotlinDebug\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$streamOperatorNotifications$3\n*L\n80#1:103\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lmb3$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmb3$f;

    invoke-direct {v0}, Lmb3$f;-><init>()V

    sput-object v0, Lmb3$f;->g:Lmb3$f;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/OperatorNotification$NotificationGroup;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/OperatorNotification$Notification;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/android/model/OperatorNotification;",
            ">;"
        }
    .end annotation

    const-string v0, "notificationGroups"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notifications"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Collection;

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Lmb3$f$a;

    invoke-direct {p2}, Lmb3$f$a;-><init>()V

    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lmb3$f;->a(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
