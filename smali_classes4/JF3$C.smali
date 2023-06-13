.class public final LJF3$C;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJF3;-><init>(LTq4;Landroid/content/Context;Lgl;Ldr4;Lbn;LEa;LYR4;LTL;Ltm;LXc1;Llw0;Lys0;LpU4;LaM;LMc2;LoI5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Lco/bird/android/model/RiderAreaState;",
        "+",
        "Ljava/lang/String;",
        ">;",
        "Lna4<",
        "+",
        "LFH3;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\n\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "",
        "Lco/bird/android/model/RiderAreaState;",
        "",
        "<name for destructuring parameter 0>",
        "Lna4;",
        "LFH3;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Triple;)Lna4;",
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
.field public final synthetic g:LJF3;


# direct methods
.method public constructor <init>(LJF3;)V
    .locals 0

    iput-object p1, p0, LJF3$C;->g:LJF3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LFH3;
    .locals 0

    invoke-static {p0, p1}, LJF3$C;->b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LFH3;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LFH3;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LFH3;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LJF3$C;->invoke(Lkotlin/Triple;)Lna4;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/Triple;)Lna4;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Ljava/lang/Boolean;",
            "+",
            "Lco/bird/android/model/RiderAreaState;",
            "Ljava/lang/String;",
            ">;)",
            "Lna4<",
            "+",
            "LFH3;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/RiderAreaState;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, LJF3$C;->g:LJF3;

    invoke-static {v0}, LJF3;->access$getSharedCurrentParkingNest$p(LJF3;)Lio/reactivex/k;

    move-result-object v0

    new-instance v2, LJF3$C$a;

    iget-object v3, p0, LJF3$C;->g:LJF3;

    invoke-direct {v2, p1, v3, v1}, LJF3$C$a;-><init>(Ljava/lang/String;LJF3;Lco/bird/android/model/RiderAreaState;)V

    new-instance p1, LKF3;

    invoke-direct {p1, v2}, LKF3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/k;->q0(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p1

    const-string v0, "class ParkingManagerImpl\u2026etConfig(bird)) == true\n}"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, LJF3$g;

    iget-object v2, p0, LJF3$C;->g:LJF3;

    invoke-static {v2}, LJF3;->access$getReactiveConfig$p(LJF3;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-direct {v0, p1, v2, v1}, LJF3$g;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RiderAreaState;)V

    iget-object p1, p0, LJF3$C;->g:LJF3;

    invoke-static {p1}, LJF3;->access$maybeStartParkingStatusTrace(LJF3;)V

    invoke-virtual {v0}, LJF3$g;->k()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, LJF3$g;->l()Lco/bird/android/model/RiderAreaState;

    move-result-object v0

    iget-object v1, p0, LJF3$C;->g:LJF3;

    invoke-virtual {v1}, LJF3;->g()LbF0;

    move-result-object v1

    new-instance v2, LKc0;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v0, v1, v3}, LKc0;-><init>(Ljava/lang/String;Lco/bird/android/model/RiderAreaState;LbF0;Z)V

    invoke-static {v2}, Lio/reactivex/k;->o0(Ljava/lang/Object;)Lio/reactivex/k;

    move-result-object p1

    const-string v0, "{\n        val parkingSta\u2026gNest,\n        ))\n      }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method
