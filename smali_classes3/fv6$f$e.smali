.class public final Lfv6$f$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv6$f;->invoke(Ljava/lang/Boolean;)Lio/reactivex/B;
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
        "LSL4;",
        "+",
        "LFH3;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LSL4;",
        "LFH3;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lfv6;


# direct methods
.method public constructor <init>(Lfv6;)V
    .locals 0

    iput-object p1, p0, Lfv6$f$e;->g:Lfv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lfv6$f$e;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "LSL4;",
            "+",
            "LFH3;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSL4;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, LFH3;

    iget-object p1, p0, Lfv6$f$e;->g:Lfv6;

    invoke-static {p1, v0}, Lfv6;->access$updateLocationProperties(Lfv6;LSL4;)V

    iget-object p1, p0, Lfv6$f$e;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getResolvedLocationRelay$p(Lfv6;)La94;

    move-result-object p1

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lfv6$f$e;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getHasMetAccuracyRequirementRelay$p(Lfv6;)La94;

    move-result-object p1

    invoke-virtual {v0}, LSL4;->g()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lfv6$f$e;->g:Lfv6;

    invoke-static {p1, v3}, Lfv6;->access$updateParkingStatusProperties(Lfv6;LFH3;)V

    iget-object p1, p0, Lfv6$f$e;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getParkingStateRelay$p(Lfv6;)La94;

    move-result-object p1

    invoke-virtual {p1, v3}, La94;->accept(Ljava/lang/Object;)V

    iget-object v1, p0, Lfv6$f$e;->g:Lfv6;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lfv6;->f0(Lfv6;LSL4;LFH3;Lco/bird/android/buava/Optional;ILjava/lang/Object;)V

    invoke-virtual {v0}, LSL4;->e()D

    move-result-wide v1

    iget-object p1, p0, Lfv6$f$e;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getBestAccuracyMeters$p(Lfv6;)D

    move-result-wide v3

    cmpg-double p1, v1, v3

    if-gez p1, :cond_0

    iget-object p1, p0, Lfv6$f$e;->g:Lfv6;

    invoke-virtual {v0}, LSL4;->e()D

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lfv6;->access$setBestAccuracyMeters$p(Lfv6;D)V

    :cond_0
    return-void
.end method
