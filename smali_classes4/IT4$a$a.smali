.class public final LIT4$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4$a;->invoke(Lkotlin/Pair;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/RideStates;",
        "Lco/bird/android/model/RideStates;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lco/bird/android/model/RideStates;",
        "ridesState",
        "a",
        "(Lco/bird/android/model/RideStates;)Lco/bird/android/model/RideStates;"
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
        "SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$10$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n1549#2:1627\n1620#2,3:1628\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$10$1\n*L\n305#1:1627\n305#1:1628,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;

.field public final synthetic i:Lco/bird/android/model/wire/configs/Config;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$IntRef;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)V
    .locals 0

    iput-object p1, p0, LIT4$a$a;->g:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p2, p0, LIT4$a$a;->h:Lco/bird/android/model/wire/WireBird;

    iput-object p3, p0, LIT4$a$a;->i:Lco/bird/android/model/wire/configs/Config;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/RideStates;)Lco/bird/android/model/RideStates;
    .locals 12

    const-string v0, "ridesState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/RideStates;->getRideStates()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, LIT4$a$a;->g:Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v2, p0, LIT4$a$a;->h:Lco/bird/android/model/wire/WireBird;

    iget-object v10, p0, LIT4$a$a;->i:Lco/bird/android/model/wire/configs/Config;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/RideState;

    invoke-static {v3}, Lco/bird/android/model/RideStateKt;->isInRide(Lco/bird/android/model/RideState;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    iget v4, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/2addr v4, v5

    iput v4, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    :cond_0
    invoke-virtual {v3}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v4

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4, v2}, Lco/bird/android/model/wire/WireBird;->isProbablySame(Lco/bird/android/model/wire/WireBird;)Z

    move-result v4

    if-ne v4, v5, :cond_1

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    if-eqz v5, :cond_2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "config"

    invoke-static {v10, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    const/16 v8, 0xb

    const/4 v9, 0x0

    move-object v6, v10

    invoke-static/range {v3 .. v9}, Lco/bird/android/model/RideState;->copy$default(Lco/bird/android/model/RideState;Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/RideState$Status;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RideUpdateState;ILjava/lang/Object;)Lco/bird/android/model/RideState;

    move-result-object v3

    :cond_2
    invoke-interface {v11, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p1, v11}, Lco/bird/android/model/RideStates;->copy(Ljava/util/List;)Lco/bird/android/model/RideStates;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/RideStates;

    invoke-virtual {p0, p1}, LIT4$a$a;->a(Lco/bird/android/model/RideStates;)Lco/bird/android/model/RideStates;

    move-result-object p1

    return-object p1
.end method
