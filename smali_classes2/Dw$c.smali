.class public final LDw$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDw;->s()V
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
        "LHM4<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/RideTrack;",
        ">;>;+",
        "LfM2;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\n\u001a\u00020\u00072>\u0010\u0006\u001a:\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u0012\u0004\u0012\u00020\u0004 \u0005*\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LHM4;",
        "",
        "Lco/bird/android/model/RideTrack;",
        "LfM2;",
        "kotlin.jvm.PlatformType",
        "it",
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
.field public final synthetic g:LDw;


# direct methods
.method public constructor <init>(LDw;)V
    .locals 0

    iput-object p1, p0, LDw$c;->g:LDw;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LDw$c;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/RideTrack;",
            ">;>;",
            "LfM2;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "it.first"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LHM4;

    invoke-virtual {v0}, LHM4;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "it.second"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LfM2;

    if-eqz v0, :cond_2

    iget-object v1, p0, LDw$c;->g:LDw;

    invoke-static {v1}, LDw;->access$getUi$p(LDw;)LIw;

    move-result-object v1

    invoke-interface {v1, v0, p1}, LIw;->V5(Ljava/util/List;LfM2;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LHM4;->b()I

    move-result p1

    const/16 v0, 0x198

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LDw$c;->g:LDw;

    invoke-static {p1}, LDw;->access$getUi$p(LDw;)LIw;

    move-result-object p1

    sget v0, Lnl4;->rides_timed_out:I

    invoke-interface {p1, v0}, LIw;->cj(I)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LDw$c;->g:LDw;

    invoke-static {p1}, LDw;->access$getUi$p(LDw;)LIw;

    move-result-object p1

    sget v0, Lnl4;->error_generic_body:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    :cond_2
    :goto_0
    return-void
.end method
