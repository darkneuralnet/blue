.class public final LZL1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZL1;->s0(Ljava/util/List;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/HibernationStatusResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/HibernationStatusResponse;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/api/response/HibernationStatusResponse;)Lio/reactivex/h;"
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
        "SMAP\nHibernationRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationRepositoryImpl.kt\nco/bird/android/repository/hibernation/HibernationRepositoryImpl$fetchHibernationStatus$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1549#2:81\n1620#2,3:82\n1#3:85\n*S KotlinDebug\n*F\n+ 1 HibernationRepositoryImpl.kt\nco/bird/android/repository/hibernation/HibernationRepositoryImpl$fetchHibernationStatus$1\n*L\n60#1:81\n60#1:82,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LZL1;


# direct methods
.method public constructor <init>(LZL1;)V
    .locals 0

    iput-object p1, p0, LZL1$a;->g:LZL1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/api/response/HibernationStatusResponse;LZL1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, LZL1$a;->c(Lco/bird/api/response/HibernationStatusResponse;LZL1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lco/bird/api/response/HibernationStatusResponse;LZL1;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$response"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/api/response/HibernationStatusResponse;->getVehicles()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireHibernationSessionVehicle;

    invoke-static {v1}, LQL1;->a(Lco/bird/android/model/wire/WireHibernationSessionVehicle;)Lco/bird/android/model/persistence/HibernationSessionVehicle;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, LZL1;->access$getHibernationDao$p(LZL1;)LSL1;

    move-result-object p0

    invoke-virtual {p0, v0}, LSL1;->g(Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/api/response/HibernationStatusResponse;)Lio/reactivex/h;
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZL1$a;->g:LZL1;

    new-instance v1, LYL1;

    invoke-direct {v1, p1, v0}, LYL1;-><init>(Lco/bird/api/response/HibernationStatusResponse;LZL1;)V

    invoke-static {v1}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/HibernationStatusResponse;

    invoke-virtual {p0, p1}, LZL1$a;->b(Lco/bird/api/response/HibernationStatusResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
