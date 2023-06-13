.class public final Lco3$P;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco3;->k0()V
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
        "Lco/bird/android/model/wire/WireNestClaim;",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/NestMarker;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0005*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003 \u0005*8\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0005*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/WireNestClaim;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/persistence/NestMarker;",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco3;


# direct methods
.method public constructor <init>(Lco3;)V
    .locals 0

    iput-object p1, p0, Lco3$P;->g:Lco3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco3$P;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireNestClaim;",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/NestMarker;",
            "Ljava/lang/Boolean;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireNestClaim;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Pair;

    iget-object v1, p0, Lco3$P;->g:Lco3;

    invoke-static {v1}, Lco3;->access$getNestClaims$p(Lco3;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    iget-object v2, p0, Lco3$P;->g:Lco3;

    invoke-static {v2}, Lco3;->access$getNestClaims$p(Lco3;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "nestClaims.get()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v1, p0, Lco3$P;->g:Lco3;

    invoke-static {v1}, Lco3;->access$getMapNestMarkerUi$p(Lco3;)Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/NestMarker;

    iget-object v3, p0, Lco3$P;->g:Lco3;

    const-string v4, "claim"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v0}, Lco3;->access$getClaimProgress(Lco3;Lco/bird/android/model/wire/WireNestClaim;)I

    move-result v3

    invoke-interface {v1, v2, v3}, Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;->claim(Lco/bird/android/model/persistence/NestMarker;I)V

    iget-object v1, p0, Lco3$P;->g:Lco3;

    invoke-static {v1}, Lco3;->access$getUi$p(Lco3;)Lpo3;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireNestClaim;->getSpacesClaimed()I

    move-result v2

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireNestClaim;->getTotalDurationMinutes()I

    move-result v3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireNestClaim;->getExpiresAt()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-interface {v1, v2, v3, v0}, Lpo3;->vd(IILorg/joda/time/DateTime;)V

    iget-object v0, p0, Lco3$P;->g:Lco3;

    invoke-static {v0}, Lco3;->access$getUi$p(Lco3;)Lpo3;

    move-result-object v0

    new-instance v1, LQk3$b;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, LQk3$b;-><init>(ZLjava/lang/String;)V

    invoke-interface {v0, v1}, LRk3;->xd(LQk3;)V

    iget-object v0, p0, Lco3$P;->g:Lco3;

    invoke-static {v0}, Lco3;->access$getNestFlightSheetRelay$p(Lco3;)Lma4;

    move-result-object v0

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/NestMarker;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/NestMarker;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method
