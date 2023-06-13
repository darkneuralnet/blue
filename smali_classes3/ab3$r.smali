.class public final Lab3$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lab3;->Z(Lio/reactivex/p;Ldb3;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/OperatorNotification;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
        ">;",
        "Lkotlin/Triple<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/OperatorNotification;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a&\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u00000\u00072\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0005H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
        "categories",
        "Lco/bird/android/model/OperatorNotification;",
        "notifications",
        "Lco/bird/android/buava/Optional;",
        "filter",
        "Lkotlin/Triple;",
        "a",
        "(Ljava/util/List;Ljava/util/List;Lco/bird/android/buava/Optional;)Lkotlin/Triple;"
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
        "SMAP\nNotificationCenterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterPresenter.kt\nco/bird/android/feature/notificationcenter/fragment/NotificationCenterPresenter$streamNotifications$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n766#2:172\n857#2,2:173\n*S KotlinDebug\n*F\n+ 1 NotificationCenterPresenter.kt\nco/bird/android/feature/notificationcenter/fragment/NotificationCenterPresenter$streamNotifications$2$1\n*L\n144#1:172\n144#1:173,2\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lab3$r;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lab3$r;

    invoke-direct {v0}, Lab3$r;-><init>()V

    sput-object v0, Lab3$r;->g:Lab3$r;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;Lco/bird/android/buava/Optional;)Lkotlin/Triple;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/OperatorNotification;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
            ">;)",
            "Lkotlin/Triple<",
            "Ljava/util/List<",
            "Lco/bird/android/model/OperatorNotification;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
            ">;>;"
        }
    .end annotation

    const-string v0, "categories"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notifications"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lkotlin/Triple;

    invoke-direct {v0, p2, p3, p1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/OperatorNotification;

    invoke-interface {v2}, Lco/bird/android/model/OperatorNotification;->getCategory()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/OperatorNotificationCategory;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/OperatorNotificationCategory;->getCategory()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p2, Lkotlin/Triple;

    invoke-direct {p2, v0, p3, p1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    check-cast p3, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1, p2, p3}, Lab3$r;->a(Ljava/util/List;Ljava/util/List;Lco/bird/android/buava/Optional;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
