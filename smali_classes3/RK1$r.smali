.class public final LRK1$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRK1;->g0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/itemlease/ItemLease;",
        ">;",
        "Lco/bird/android/model/itemlease/ItemLease;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "Lco/bird/android/model/itemlease/ItemLease;",
        "list",
        "a",
        "(Ljava/util/List;)Lco/bird/android/model/itemlease/ItemLease;"
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
        "SMAP\nHelmetLeaseUnlockTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseUnlockTutorialPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialPresenter$onResume$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,486:1\n288#2,2:487\n*S KotlinDebug\n*F\n+ 1 HelmetLeaseUnlockTutorialPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialPresenter$onResume$2\n*L\n99#1:487,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LRK1;


# direct methods
.method public constructor <init>(LRK1;)V
    .locals 0

    iput-object p1, p0, LRK1$r;->g:LRK1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lco/bird/android/model/itemlease/ItemLease;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLease;",
            ">;)",
            "Lco/bird/android/model/itemlease/ItemLease;"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, LRK1$r;->g:LRK1;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lco/bird/android/model/itemlease/ItemLease;

    invoke-static {v0}, LRK1;->access$getBird$p(LRK1;)Lco/bird/android/model/wire/WireBird;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v2

    :goto_0
    invoke-virtual {v3}, Lco/bird/android/model/itemlease/ItemLease;->getAssociatedItemId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-static {v0}, LRK1;->access$getBird$p(LRK1;)Lco/bird/android/model/wire/WireBird;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireBird;->getEphemeralId()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {v3}, Lco/bird/android/model/itemlease/ItemLease;->getAssociatedItemId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v2, 0x1

    :goto_2
    if-eqz v2, :cond_0

    move-object v2, v1

    :cond_5
    check-cast v2, Lco/bird/android/model/itemlease/ItemLease;

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LRK1$r;->a(Ljava/util/List;)Lco/bird/android/model/itemlease/ItemLease;

    move-result-object p1

    return-object p1
.end method
