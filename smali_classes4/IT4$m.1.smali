.class public final LIT4$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;-><init>(Landroid/content/Context;LNP4;LXW2;Lef6;LKn6;LpJ;LpM3;LTq4;LUz1;LpU4;LEa;LTo0;LV74;LEg1;LRh6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/RideStates;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lk66;",
        ">;>;",
        "Ljava/util/List<",
        "+",
        "Lk66;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000222\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/RideStates;",
        "",
        "Lk66;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "invoke",
        "(Lkotlin/Pair;)Ljava/util/List;",
        "<anonymous>"
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
        "SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n766#2:1627\n857#2,2:1628\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$4\n*L\n266#1:1627\n266#1:1628,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LIT4;


# direct methods
.method public constructor <init>(LIT4;)V
    .locals 0

    iput-object p1, p0, LIT4$m;->g:LIT4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LIT4$m;->invoke(Lkotlin/Pair;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/RideStates;",
            "+",
            "Ljava/util/List<",
            "Lk66;",
            ">;>;)",
            "Ljava/util/List<",
            "Lk66;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/RideStates;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lk66;

    invoke-virtual {v3}, Lk66;->f()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Lk66;->d()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    invoke-virtual {v0, v3}, Lco/bird/android/model/RideStates;->rideForBird(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/RideState;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    invoke-static {v3}, Lco/bird/android/model/RideStateKt;->isInRide(Lco/bird/android/model/RideState;)Z

    move-result v3

    if-ne v3, v4, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    if-nez v3, :cond_2

    move v5, v4

    :cond_2
    if-eqz v5, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lco/bird/android/model/RideStates;->getActiveRideCount()I

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, LIT4$m;->g:LIT4;

    invoke-static {p1}, LIT4;->access$getVehicleTrackerManager$p(LIT4;)LKn6;

    move-result-object p1

    invoke-interface {p1}, LKn6;->c()V

    const/4 v1, 0x0

    :cond_4
    return-object v1
.end method
