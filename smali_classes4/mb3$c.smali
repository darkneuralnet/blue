.class public final Lmb3$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmb3;->P(ZLjava/util/List;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/NotificationCenterResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/NotificationCenterResponse;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/NotificationCenterResponse;)Lio/reactivex/h;"
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
        "SMAP\nNotificationCenterRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$fetchOperatorNotifications$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,102:1\n1549#2:103\n1620#2,3:104\n1549#2:107\n1620#2,3:108\n37#3,2:111\n37#3,2:113\n*S KotlinDebug\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$fetchOperatorNotifications$2\n*L\n52#1:103\n52#1:104,3\n53#1:107\n53#1:108,3\n56#1:111,2\n57#1:113,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lmb3;


# direct methods
.method public constructor <init>(Lmb3;)V
    .locals 0

    iput-object p1, p0, Lmb3$c;->g:Lmb3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/NotificationCenterResponse;)Lio/reactivex/h;
    .locals 6

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/NotificationCenterResponse;->getGroups()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireNotificationGroup;

    invoke-static {v3}, Lra3;->d(Lco/bird/android/model/wire/WireNotificationGroup;)Lco/bird/android/model/persistence/NotificationGroup;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/api/response/NotificationCenterResponse;->getNotifications()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireNotification;

    invoke-static {v2}, Lra3;->c(Lco/bird/android/model/wire/WireNotification;)Lco/bird/android/model/persistence/Notification;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lmb3$c;->g:Lmb3;

    const/4 v2, 0x2

    new-array v2, v2, [Lio/reactivex/c;

    invoke-static {p1}, Lmb3;->access$getNotificationGroupDao$p(Lmb3;)LPc3;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Lco/bird/android/model/persistence/NotificationGroup;

    invoke-interface {v1, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lco/bird/android/model/persistence/NotificationGroup;

    array-length v5, v1

    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lco/bird/android/model/persistence/NotificationGroup;

    invoke-virtual {v3, v1}, LPc3;->b([Lco/bird/android/model/persistence/NotificationGroup;)Lio/reactivex/c;

    move-result-object v1

    aput-object v1, v2, v4

    iget-object v1, p0, Lmb3$c;->g:Lmb3;

    invoke-static {v1}, Lmb3;->access$getNotificationDao$p(Lmb3;)LBc3;

    move-result-object v1

    new-array v3, v4, [Lco/bird/android/model/persistence/Notification;

    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/persistence/Notification;

    array-length v3, v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/persistence/Notification;

    invoke-virtual {v1, v0}, LBc3;->c([Lco/bird/android/model/persistence/Notification;)Lio/reactivex/c;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "concat(listOf(\n         \u2026oTypedArray())\n        ))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lmb3;->Q1(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/NotificationCenterResponse;

    invoke-virtual {p0, p1}, Lmb3$c;->a(Lco/bird/api/response/NotificationCenterResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
