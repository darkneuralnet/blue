.class public final Li25$c3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->x9()V
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
        "Lco/bird/android/buava/Optional<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/RideState;",
        ">;>;",
        "LO12;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062$\u0010\u0005\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/buava/Optional;",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "Lco/bird/android/model/RideState;",
        "<name for destructuring parameter 0>",
        "LO12;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lkotlin/Pair;)LO12;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Li25$c3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Li25$c3;

    invoke-direct {v0}, Li25$c3;-><init>()V

    sput-object v0, Li25$c3;->g:Li25$c3;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)LO12;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/RideState;",
            ">;>;)",
            "LO12;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    xor-int/2addr v0, v2

    invoke-static {p1}, LhU4;->a(Lco/bird/android/buava/Optional;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RideState;

    invoke-virtual {p1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, v4

    :goto_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v3

    goto :goto_3

    :cond_3
    move-object v3, v4

    :goto_3
    if-eqz v3, :cond_4

    move v1, v2

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getPhysicalLocks()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lco/bird/android/model/wire/WirePhysicalLock;

    :cond_5
    if-eqz v4, :cond_6

    if-nez v1, :cond_6

    new-instance p1, LO12$c;

    invoke-direct {p1, v4}, LO12$c;-><init>(Lco/bird/android/model/wire/WirePhysicalLock;)V

    goto :goto_4

    :cond_6
    if-eqz v4, :cond_7

    if-eqz v1, :cond_7

    new-instance p1, LO12$d;

    invoke-direct {p1, v4}, LO12$d;-><init>(Lco/bird/android/model/wire/WirePhysicalLock;)V

    goto :goto_4

    :cond_7
    if-nez p1, :cond_8

    if-eqz v0, :cond_8

    sget-object p1, LO12$e;->a:LO12$e;

    goto :goto_4

    :cond_8
    sget-object p1, LO12$b;->a:LO12$b;

    :goto_4
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Li25$c3;->a(Lkotlin/Pair;)LO12;

    move-result-object p1

    return-object p1
.end method
