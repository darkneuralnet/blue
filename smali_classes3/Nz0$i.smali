.class public final LNz0$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNz0;->l()V
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
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/android/model/wire/WireContainerOrder;",
        ">;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/DialogResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/wire/WireContainerOrder;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/DialogResponse;",
        "b",
        "(Lkotlin/Pair;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LNz0;


# direct methods
.method public constructor <init>(LNz0;)V
    .locals 0

    iput-object p1, p0, LNz0$i;->g:LNz0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, LNz0$i;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method


# virtual methods
.method public final b(Lkotlin/Pair;)Lio/reactivex/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lkotlin/Unit;",
            "Lco/bird/android/model/wire/WireContainerOrder;",
            ">;)",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireContainerOrder;

    iget-object v0, p0, LNz0$i;->g:LNz0;

    invoke-static {v0}, LNz0;->access$getTransferOrderManager$p(LNz0;)LO86;

    move-result-object v0

    const-string v1, "containerOrder"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, LO86;->s(Lco/bird/android/model/wire/WireContainerOrder;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireContainerOrder;->getBooked()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object p1, p0, LNz0$i;->g:LNz0;

    invoke-static {p1}, LNz0;->access$getUi$p(LNz0;)LPz0;

    move-result-object p1

    iget-object v0, p0, LNz0$i;->g:LNz0;

    invoke-static {v0}, LNz0;->access$getContainerOrderId$p(LNz0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LPz0;->Sl(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, LNz0$i$a;->g:LNz0$i$a;

    new-instance v1, LOz0;

    invoke-direct {v1, v0}, LOz0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->C(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-object p1, p0, LNz0$i;->g:LNz0;

    invoke-static {p1}, LNz0;->access$getUi$p(LNz0;)LPz0;

    move-result-object p1

    invoke-virtual {p1}, LPz0;->Tl()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireContainerOrder;->getStatus()Lco/bird/android/model/constant/ContainerOrderStatus;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/constant/ContainerOrderStatus;->IN_TRANSIT:Lco/bird/android/model/constant/ContainerOrderStatus;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, LNz0$i;->g:LNz0;

    invoke-static {p1}, LNz0;->access$getUi$p(LNz0;)LPz0;

    move-result-object p1

    invoke-virtual {p1}, LPz0;->Rl()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LNz0$i;->b(Lkotlin/Pair;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
