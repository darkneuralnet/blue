.class public final LJF3$A;
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
        "LbF0;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LbF0;",
        "kotlin.jvm.PlatformType",
        "currNest",
        "",
        "a",
        "(LbF0;)V"
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
        "SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$sharedCurrentParkingNest$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n1#2:1467\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LJF3;


# direct methods
.method public constructor <init>(LJF3;)V
    .locals 0

    iput-object p1, p0, LJF3$A;->g:LJF3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LbF0;)V
    .locals 12

    iget-object v0, p0, LJF3$A;->g:LJF3;

    invoke-virtual {v0}, LJF3;->g()LbF0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LJF3$A;->g:LJF3;

    invoke-virtual {v0}, LJF3;->g()LbF0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LbF0;->f()LmG3;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    invoke-virtual {p1}, LbF0;->f()LmG3;

    move-result-object v2

    if-eq v0, v2, :cond_9

    :cond_2
    invoke-virtual {p1}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LbF0;->f()LmG3;

    move-result-object v2

    sget-object v3, LmG3;->b:LmG3;

    if-ne v2, v3, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v0, v1

    :goto_3
    if-eqz v0, :cond_5

    new-instance v1, Ln95;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v0}, Lco/bird/android/model/ParkingNest;->getId()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, LJF3$A;->g:LJF3;

    invoke-static {v0}, LJF3;->access$getRideManager$p(LJF3;)LYR4;

    move-result-object v0

    invoke-interface {v0}, LYR4;->n0()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    iget-object v0, p0, LJF3$A;->g:LJF3;

    invoke-static {v0}, LJF3;->access$getRideManager$p(LJF3;)LYR4;

    move-result-object v0

    invoke-interface {v0}, LYR4;->o0()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/RideStates;

    invoke-virtual {v0}, Lco/bird/android/model/RideStates;->getActiveRideCount()I

    move-result v0

    int-to-long v9, v0

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const/16 v10, 0x27

    const/4 v11, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v11}, Ln95;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_5
    iget-object v0, p0, LJF3$A;->g:LJF3;

    invoke-virtual {v0}, LJF3;->g()LbF0;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lco/bird/android/model/ParkingNest;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_6
    move-object v0, v1

    :goto_4
    if-eqz v0, :cond_8

    new-instance v0, Lp95;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v2, p0, LJF3$A;->g:LJF3;

    invoke-virtual {v2}, LJF3;->g()LbF0;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lco/bird/android/model/ParkingNest;->getId()Ljava/lang/String;

    move-result-object v1

    :cond_7
    move-object v6, v1

    iget-object v1, p0, LJF3$A;->g:LJF3;

    invoke-static {v1}, LJF3;->access$getRideManager$p(LJF3;)LYR4;

    move-result-object v1

    invoke-interface {v1}, LYR4;->n0()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    iget-object v1, p0, LJF3$A;->g:LJF3;

    invoke-static {v1}, LJF3;->access$getRideManager$p(LJF3;)LYR4;

    move-result-object v1

    invoke-interface {v1}, LYR4;->o0()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/RideStates;

    invoke-virtual {v1}, Lco/bird/android/model/RideStates;->getActiveRideCount()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const/16 v10, 0x27

    const/4 v11, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lp95;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    :cond_8
    :goto_5
    if-eqz v1, :cond_9

    iget-object v0, p0, LJF3$A;->g:LJF3;

    invoke-static {v0}, LJF3;->access$getAnalyticsManager$p(LJF3;)LEa;

    move-result-object v0

    invoke-interface {v0, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_9
    iget-object v0, p0, LJF3$A;->g:LJF3;

    invoke-static {v0}, LJF3;->access$getParkingNestRefreshRequests$p(LJF3;)Lio/reactivex/subjects/d;

    move-result-object v0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LJF3$A;->g:LJF3;

    invoke-virtual {v0, p1}, LJF3;->w0(LbF0;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LbF0;

    invoke-virtual {p0, p1}, LJF3$A;->a(LbF0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
