.class public final LIH2$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIH2;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LRe4<",
        "+",
        "Lco/bird/android/model/RideStates;",
        "+",
        "Lco/bird/android/model/RideUpdateState;",
        "+",
        "LFH3;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireUserGuest;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/SelectedRideButton;",
        ">;>;",
        "LvH2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u000b\u001a\n \u0002*\u0004\u0018\u00010\n0\n2d\u0010\t\u001a`\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0002*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0002*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u00070\u0000H\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000c"
    }
    d2 = {
        "LRe4;",
        "Lco/bird/android/model/RideStates;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/RideUpdateState;",
        "LFH3;",
        "",
        "Lco/bird/android/model/wire/WireUserGuest;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/SelectedRideButton;",
        "<name for destructuring parameter 0>",
        "LvH2;",
        "a",
        "(LRe4;)LvH2;"
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
        "SMAP\nManageRidesDialogPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageRidesDialogPresenter.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialogPresenter$observeRideStates$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1#2:197\n1045#3:198\n766#3:199\n857#3,2:200\n1559#3:202\n1590#3,3:203\n288#3,2:206\n1593#3:208\n*S KotlinDebug\n*F\n+ 1 ManageRidesDialogPresenter.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialogPresenter$observeRideStates$1\n*L\n105#1:198\n112#1:199\n112#1:200,2\n113#1:202\n113#1:203,3\n122#1:206,2\n113#1:208\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LIH2;


# direct methods
.method public constructor <init>(LIH2;)V
    .locals 0

    iput-object p1, p0, LIH2$e;->g:LIH2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LRe4;)LvH2;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRe4<",
            "Lco/bird/android/model/RideStates;",
            "+",
            "Lco/bird/android/model/RideUpdateState;",
            "+",
            "LFH3;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireUserGuest;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/SelectedRideButton;",
            ">;>;)",
            "LvH2;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LRe4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/RideStates;

    invoke-virtual {p1}, LRe4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/RideUpdateState;

    invoke-virtual {p1}, LRe4;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFH3;

    invoke-virtual {p1}, LRe4;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-virtual {p1}, LRe4;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/SelectedRideButton;

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/SelectedRideButton;->getRideId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v5, p0, LIH2$e;->g:LIH2;

    invoke-static {v5}, LIH2;->access$getRideManager$p(LIH2;)LYR4;

    move-result-object v5

    invoke-interface {v5, v4}, LYR4;->i1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    invoke-virtual {v0}, Lco/bird/android/model/RideStates;->getRideStates()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, LIH2$e$a;

    invoke-direct {v5}, LIH2$e$a;-><init>()V

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lco/bird/android/model/RideState;

    invoke-static {v7}, Lco/bird/android/model/RideStateKt;->isInRide(Lco/bird/android/model/RideState;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v7, 0x1

    if-gez v7, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast v8, Lco/bird/android/model/RideState;

    const/4 v10, 0x1

    if-eqz v4, :cond_4

    invoke-static {v4}, Lco/bird/android/model/RideStateKt;->isInRide(Lco/bird/android/model/RideState;)Z

    move-result v11

    if-ne v11, v10, :cond_4

    move v11, v10

    goto :goto_3

    :cond_4
    move v11, v6

    :goto_3
    if-eqz v11, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/SelectedRideButton;->getRideId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v10

    invoke-virtual {v10}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    goto :goto_4

    :cond_5
    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    move v10, v6

    :goto_4
    const-string v7, "parkingStatus"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "userGuests"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v2

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lco/bird/android/model/wire/WireUserGuest;

    invoke-virtual {v8}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v13

    invoke-virtual {v13}, Lco/bird/android/model/wire/WireRide;->getUserGuestId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12}, Lco/bird/android/model/wire/WireUserGuest;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    goto :goto_5

    :cond_8
    move-object v11, v3

    :goto_5
    check-cast v11, Lco/bird/android/model/wire/WireUserGuest;

    new-instance v7, LtH2;

    invoke-direct {v7, v8, v1, v11, v10}, LtH2;-><init>(Lco/bird/android/model/RideState;LFH3;Lco/bird/android/model/wire/WireUserGuest;Z)V

    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v7, v9

    goto :goto_2

    :cond_9
    new-instance p1, LvH2;

    invoke-direct {p1, v0}, LvH2;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LRe4;

    invoke-virtual {p0, p1}, LIH2$e;->a(LRe4;)LvH2;

    move-result-object p1

    return-object p1
.end method
