.class public final Lmb3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmb3;->b()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/NotificationCategoriesResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/NotificationCategoriesResponse;",
        "wireCategories",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/NotificationCategoriesResponse;)Lio/reactivex/h;"
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
        "SMAP\nNotificationCenterRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$fetchCategories$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,102:1\n1549#2:103\n1620#2,3:104\n37#3,2:107\n*S KotlinDebug\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$fetchCategories$1\n*L\n28#1:103\n28#1:104,3\n29#1:107,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lmb3;


# direct methods
.method public constructor <init>(Lmb3;)V
    .locals 0

    iput-object p1, p0, Lmb3$a;->g:Lmb3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/NotificationCategoriesResponse;)Lio/reactivex/h;
    .locals 2

    const-string v0, "wireCategories"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/NotificationCategoriesResponse;->getCategories()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireOperatorNotificationCategory;

    invoke-static {v1}, Lra3;->e(Lco/bird/android/model/wire/WireOperatorNotificationCategory;)Lco/bird/android/model/persistence/OperatorNotificationCategory;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lmb3$a;->g:Lmb3;

    invoke-static {p1}, Lmb3;->access$getCategoryDao$p(Lmb3;)Lro3;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lco/bird/android/model/persistence/OperatorNotificationCategory;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/persistence/OperatorNotificationCategory;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/persistence/OperatorNotificationCategory;

    invoke-virtual {p1, v0}, Lro3;->a([Lco/bird/android/model/persistence/OperatorNotificationCategory;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/NotificationCategoriesResponse;

    invoke-virtual {p0, p1}, Lmb3$a;->a(Lco/bird/api/response/NotificationCategoriesResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
